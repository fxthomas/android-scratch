This is a sample Android application using Scala and the
[SBT-Android](https://github.com/larroy/android-plugin) plugin (version
**0.7.1-SNAPSHOT**)

## Installing the plugin

This will install the latest plugin snapshot :

    git clone https://github.com/larroy/android-plugin.git
    cd android-plugin; sbt publish-local
    
## Common commands

  * Package with `apk`
  * Install with `install`
  * Start with `start`

## Directory layout

```
build.sbt                       -- Build configuration
project/plugins.sbt             -- Plugin configuration
src/main/AndroidManifest.xml    -- Android manifest
src/main/res                    -- Android resources
src/main/scala                  -- Scala code
```

## FAQ

Try running the project without any modification first, then read this.

  * If you get this :

        ERROR: Asset package include '/android_sdk/sdk/platforms/android-16/android.jar' not found.
        ERROR: Asset package include '/android_sdk/sdk/platforms/android-16/android.jar' not found.
        java.lang.RuntimeException: error generating resources
    
    Then change the `platformName` setting in `build.sbt` to the right version.
    
  * If you get errors like `UnsupportedClassVersionError` or missing classes at runtime,
    then you're most likely building for Java 7, which isn't supported at the moment.
