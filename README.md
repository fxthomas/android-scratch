This is a sample Android application using Scala and the
[SBT-Android](https://github.com/jberkel/android-plugin) plugin (version
**0.7-SNAPSHOT** found in [my
branch](https://github.com/fxthomas/android-plugin/tree/rewrite-cleanup) at the
moment)

## Directory layout

```
build.sbt                       -- Build configuration
project/plugins.sbt             -- Plugin configuration
src/main/AndroidManifest.xml    -- Android manifest
src/main/res                    -- Android resources
src/main/scala                  -- Scala code
```

## Common commands

  * Package with `apk`
  * Install with `install`
  * Start with `start`
