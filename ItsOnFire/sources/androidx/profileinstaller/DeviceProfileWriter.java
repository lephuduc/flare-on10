package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DeviceProfileWriter {
    @NonNull
    private final String mApkName;
    @NonNull
    private final AssetManager mAssetManager;
    @NonNull
    private final File mCurProfile;
    @NonNull
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;
    @NonNull
    private final Executor mExecutor;
    @Nullable
    private DexProfileData[] mProfile;
    @NonNull
    private final String mProfileMetaSourceLocation;
    @NonNull
    private final String mProfileSourceLocation;
    @Nullable
    private byte[] mTranscodedProfile;
    private boolean mDeviceSupportsAotProfile = false;
    @Nullable
    private final byte[] mDesiredVersion = desiredVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = str;
        this.mProfileSourceLocation = str2;
        this.mProfileMetaSourceLocation = str3;
        this.mCurProfile = file;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (!this.mDeviceSupportsAotProfile) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @Nullable
    private static byte[] desiredVersion() {
        if (Build.VERSION.SDK_INT != 30) {
            return null;
        }
        return ProfileVersion.V010_P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$result$0(int i2, Object obj) {
        this.mDiagnostics.onResultReceived(i2, obj);
    }

    private static boolean requiresMetadata() {
        return false;
    }

    private void result(final int i2, @Nullable final Object obj) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.profileinstaller.a
            @Override // java.lang.Runnable
            public final void run() {
                DeviceProfileWriter.this.lambda$result$0(i2, obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        int i2;
        Integer num;
        if (this.mDesiredVersion == null) {
            i2 = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (this.mCurProfile.canWrite()) {
            this.mDeviceSupportsAotProfile = true;
            return true;
        } else {
            i2 = 4;
            num = null;
        }
        result(i2, num);
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.mAssetManager.openFd(this.mProfileSourceLocation);
            FileInputStream createInputStream = openFd.createInputStream();
            this.mProfile = ProfileTranscoder.readProfile(createInputStream, ProfileTranscoder.readHeader(createInputStream, ProfileTranscoder.MAGIC_PROF), this.mApkName);
            if (createInputStream != null) {
                createInputStream.close();
            }
            openFd.close();
        } catch (FileNotFoundException e2) {
            this.mDiagnostics.onResultReceived(6, e2);
        } catch (IOException e3) {
            this.mDiagnostics.onResultReceived(7, e3);
        } catch (IllegalStateException e4) {
            this.mDiagnostics.onResultReceived(8, e4);
        }
        DexProfileData[] dexProfileDataArr = this.mProfile;
        if (dexProfileDataArr != null && requiresMetadata()) {
            try {
                AssetFileDescriptor openFd2 = this.mAssetManager.openFd(this.mProfileMetaSourceLocation);
                try {
                    FileInputStream createInputStream2 = openFd2.createInputStream();
                    this.mProfile = ProfileTranscoder.readMeta(createInputStream2, ProfileTranscoder.readHeader(createInputStream2, ProfileTranscoder.MAGIC_PROFM), dexProfileDataArr);
                    if (createInputStream2 != null) {
                        createInputStream2.close();
                    }
                    openFd2.close();
                    return this;
                } catch (Throwable th) {
                    if (openFd2 != null) {
                        try {
                            openFd2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                this.mDiagnostics.onResultReceived(9, e5);
            } catch (IOException e6) {
                this.mDiagnostics.onResultReceived(7, e6);
            } catch (IllegalStateException e7) {
                this.mDiagnostics.onResultReceived(8, e7);
            }
        }
        return this;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback;
        int i2;
        ByteArrayOutputStream byteArrayOutputStream;
        DexProfileData[] dexProfileDataArr = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (dexProfileDataArr != null && bArr != null) {
            assertDeviceAllowsProfileInstallerAotWritesCalled();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e2) {
                e = e2;
                diagnosticsCallback = this.mDiagnostics;
                i2 = 7;
                diagnosticsCallback.onResultReceived(i2, e);
                this.mProfile = null;
                return this;
            } catch (IllegalStateException e3) {
                e = e3;
                diagnosticsCallback = this.mDiagnostics;
                i2 = 8;
                diagnosticsCallback.onResultReceived(i2, e);
                this.mProfile = null;
                return this;
            }
            try {
                ProfileTranscoder.writeHeader(byteArrayOutputStream, bArr);
                if (!ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                    this.mDiagnostics.onResultReceived(5, null);
                    this.mProfile = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.mProfile = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], androidx.profileinstaller.DexProfileData[]] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return false;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.mCurProfile);
                    Encoding.writeAll(byteArrayInputStream, fileOutputStream);
                    result(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                result(6, e2);
                return false;
            } catch (IOException e3) {
                result(7, e3);
                return false;
            }
        } finally {
            this.mTranscodedProfile = null;
            this.mProfile = null;
        }
    }
}
