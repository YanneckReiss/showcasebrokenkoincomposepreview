package com.yanneckreiss.showcasebrokenkoincomposepreview.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yanneckreiss.showcasebrokenkoincomposepreview.ExampleInjectableClass
import com.yanneckreiss.showcasebrokenkoincomposepreview.appModule
import com.yanneckreiss.showcasebrokenkoincomposepreview.ui.theme.AppTheme
import org.koin.compose.KoinApplication
import org.koin.compose.koinInject

@Composable
fun ExampleView(
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
    exampleService: ExampleInjectableClass = koinInject()
) {

    Button(
        modifier = modifier,
        onClick = { exampleService.doSomething() },
        enabled = isEnabled
    ) {
        Text(text = "Click me")
    }
}


@Preview
@Composable
fun Preview_ExampleView_enabled() {
    KoinApplication(application = { modules(appModule) }) {
        AppTheme {
            ExampleView(
                isEnabled = true
            )
        }
    }
}

@Preview
@Composable
fun Preview_ExampleView_disabled() {
    KoinApplication(application = { modules(appModule) }) {
        AppTheme {
            ExampleView(
                isEnabled = false
            )
        }
    }
}
