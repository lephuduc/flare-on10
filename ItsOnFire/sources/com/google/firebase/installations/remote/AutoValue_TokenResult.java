package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes.dex */
final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    /* loaded from: classes.dex */
    public static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        public Builder() {
        }

        private Builder(TokenResult tokenResult) {
            this.token = tokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.responseCode = tokenResult.getResponseCode();
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String str = "";
            if (this.tokenExpirationTimestamp == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j2) {
            this.tokenExpirationTimestamp = Long.valueOf(j2);
            return this;
        }
    }

    private AutoValue_TokenResult(@Nullable String str, long j2, @Nullable TokenResult.ResponseCode responseCode) {
        this.token = str;
        this.tokenExpirationTimestamp = j2;
        this.responseCode = responseCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.token;
            if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
                if (this.tokenExpirationTimestamp == tokenResult.getTokenExpirationTimestamp()) {
                    TokenResult.ResponseCode responseCode = this.responseCode;
                    if (responseCode == null) {
                        if (tokenResult.getResponseCode() == null) {
                            return true;
                        }
                    } else if (responseCode.equals(tokenResult.getResponseCode())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.tokenExpirationTimestamp;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.responseCode;
        return i2 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", responseCode=" + this.responseCode + "}";
    }
}
