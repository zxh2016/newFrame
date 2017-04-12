# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in G:\Android_IDE\ADT\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# 实用工具类
-keep class com.xwjr.utilcode.utils.** { *; }
-keepclassmembers class com.xwjr.utilcode.utils.** { *; }
-dontwarn com.xwjr.utilcode.utils.**

# okhttp
-keep class okhttp3.**{ *;}
-dontwarn okhttp3.**
-keep class okio.**{ *;}
-dontwarn okio.**

# glide 混淆配置
-keep class  com.bumptech.**{ *;}
-dontwarn com.bumptech.**
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}

#Gson zxing 混淆配置
-keep class com.google.**{ *;}
-dontwarn com.google.**
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }
