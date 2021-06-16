# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Specify the compression level of the code
-optimizationpasses 5
# The package name is not mixed case
-dontusemixedcaseclassnames
# Don't ignore non-public library classes
-dontskipnonpubliclibraryclasses
# Optimization Does not optimize input class files
-dontoptimize
# Pre-check
-dontpreverify
# Whether to log when obfuscated
-verbose
# Ignore the warning
-ignorewarnings
-keepattributes *Annotation*,InnerClasses
-keepattributes Exceptions
-keepattributes Signature
-keepattributes SourceFile,LineNumberTable

# Four major components, View system, etc.
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Fragment
-keep public class * extends android.support.multidex.MultiDexApplication
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.preference.Preference
-keep public class * extends android.view.View
-keep class android.support.** {*;}
-keep public class * extends android.support.v4.**

-keep class com.huawei.hms.**{*;}
-keep class com.huawei.hms5gkit.**{*;}
-keep class com.huawei.hianalytics.**{*;}