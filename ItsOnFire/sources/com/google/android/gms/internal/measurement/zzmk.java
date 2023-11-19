package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmk {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzmi zzmiVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzmiVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i2, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i2, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i3 = 1; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzni.zza(new zzjx(((String) obj).getBytes(zzlj.zzb))));
                sb.append(Typography.quote);
            } else if (obj instanceof zzka) {
                sb.append(": \"");
                sb.append(zzni.zza((zzka) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzlb) {
                sb.append(" {");
                zzd((zzlb) obj, sb, i2 + 2);
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i2 + 2;
                zzb(sb, i4, "key", entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            }
        }
    }

    private static void zzc(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }

    private static void zzd(zzmi zzmiVar, StringBuilder sb, int i2) {
        int i3;
        Object obj;
        Method method;
        String substring;
        Object zzbK;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i3);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                zzbK = zzlb.zzbK(method2, zzmiVar, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object zzbK2 = zzlb.zzbK(method4, zzmiVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) zzlb.zzbK(method5, zzmiVar, new Object[0])).booleanValue()) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        } else if (zzbK2 instanceof Boolean) {
                            if (!((Boolean) zzbK2).booleanValue()) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        } else if (zzbK2 instanceof Integer) {
                            if (((Integer) zzbK2).intValue() == 0) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        } else if (zzbK2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbK2).floatValue()) == 0) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        } else if (zzbK2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbK2).doubleValue()) == 0) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        } else {
                            if (zzbK2 instanceof String) {
                                obj = "";
                            } else if (zzbK2 instanceof zzka) {
                                obj = zzka.zzb;
                            } else if (zzbK2 instanceof zzmi) {
                                if (zzbK2 == ((zzmi) zzbK2).zzbV()) {
                                }
                                zzb(sb, i2, substring2, zzbK2);
                            } else {
                                if ((zzbK2 instanceof Enum) && ((Enum) zzbK2).ordinal() == 0) {
                                }
                                zzb(sb, i2, substring2, zzbK2);
                            }
                            if (zzbK2.equals(obj)) {
                            }
                            zzb(sb, i2, substring2, zzbK2);
                        }
                    }
                }
                i3 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                zzbK = zzlb.zzbK(method, zzmiVar, new Object[0]);
            }
            zzb(sb, i2, substring, zzbK);
            i3 = 3;
        }
        if (zzmiVar instanceof zzky) {
            zzky zzkyVar = (zzky) zzmiVar;
            throw null;
        }
        zznl zznlVar = ((zzlb) zzmiVar).zzc;
        if (zznlVar != null) {
            zznlVar.zzi(sb, i2);
        }
    }
}
