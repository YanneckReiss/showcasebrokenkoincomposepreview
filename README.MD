# Koin Multiple Android Jetpack Compose Previews Error Showcase

This project simply exists to showcase that the Jetpack Compose Preview fails when in a single file multiple Compose Previews depend on the `KoinApplication` composable, or to be more specific, try to start an own Koin Context. 
The `KoinContext` seems to be applied to all composable previews within the respective file.

Refer to the [ExampleView.kt] to experience the error `org.koin.core.error.KoinAppAlreadyStartedException`
