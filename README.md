# Reproduces an issue with a complex includeBuild

`misk` is from here: https://github.com/cashapp/misk

`lib` is from running `gradle init`

## To reproduce

In `settings.gradle.kts`, uncomment one of the `requireCapability` statements (commenting out the
others), and run `./gradlew lib:test`. Observe.
