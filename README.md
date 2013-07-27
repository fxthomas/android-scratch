This is a sample Android application using Scala and the
[SBT-Android](https://github.com/jberkel/android-plugin) plugin (version
**0.7-SNAPSHOT**)

## Installing the plugin

This will install the latest plugin snapshot :

    git clone https://github.com/jberkel/android-plugin
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

    I just sent a pull request with [a commit](https://github.com/fxthomas/android-plugin/commit/87bb0dea5f4e038cfc8c4c9d5802681936af40f1)
    to force the use of Java 6.
