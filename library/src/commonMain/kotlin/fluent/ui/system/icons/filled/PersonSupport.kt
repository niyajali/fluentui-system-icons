package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.PersonSupport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSupport",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.155f, 14.773f)
            curveTo(10.152f, 14.766f, 10.149f, 14.759f, 10.146f, 14.752f)
            curveTo(10.01f, 14.715f, 9.876f, 14.674f, 9.744f, 14.628f)
            curveTo(9.744f, 14.628f, 9.744f, 14.628f, 9.744f, 14.628f)
            curveTo(9.741f, 14.627f, 9.738f, 14.626f, 9.734f, 14.625f)
            curveTo(9.262f, 14.464f, 8.813f, 14.253f, 8.392f, 14f)
            curveTo(6.36f, 12.775f, 5f, 10.546f, 5f, 8f)
            curveTo(5f, 4.134f, 8.134f, 1f, 12f, 1f)
            curveTo(15.613f, 1f, 18.587f, 3.737f, 18.96f, 7.251f)
            curveTo(19.004f, 7.663f, 18.664f, 8f, 18.25f, 8f)
            curveTo(17.836f, 8f, 17.505f, 7.662f, 17.45f, 7.252f)
            curveTo(17.085f, 4.568f, 14.784f, 2.5f, 12f, 2.5f)
            curveTo(8.962f, 2.5f, 6.5f, 4.962f, 6.5f, 8f)
            curveTo(6.5f, 10.396f, 8.033f, 12.435f, 10.171f, 13.189f)
            curveTo(10.483f, 12.488f, 11.184f, 12f, 12f, 12f)
            curveTo(13.104f, 12f, 14f, 12.895f, 14f, 14f)
            curveTo(14f, 14f, 14f, 14f, 14f, 14f)
            curveTo(14f, 15.104f, 13.105f, 16f, 12f, 16f)
            curveTo(11.17f, 16f, 10.457f, 15.494f, 10.155f, 14.773f)
            close()
            moveTo(9.13f, 16.003f)
            curveTo(7.939f, 15.576f, 6.871f, 14.891f, 5.994f, 14.015f)
            curveTo(4.874f, 14.143f, 4.004f, 15.094f, 4.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(4.004f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
            curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
            curveTo(15.421f, 22.001f, 17.945f, 20.929f, 19.491f, 18.766f)
            curveTo(19.824f, 18.3f, 20.003f, 17.741f, 20.003f, 17.167f)
            verticalLineTo(16.249f)
            curveTo(20.003f, 15.007f, 18.997f, 14f, 17.754f, 14f)
            horizontalLineTo(15.5f)
            curveTo(15.5f, 15.933f, 13.933f, 17.5f, 12f, 17.5f)
            curveTo(10.81f, 17.5f, 9.761f, 16.907f, 9.13f, 16.003f)
            close()
            moveTo(16f, 8f)
            curveTo(16f, 6.769f, 15.444f, 5.668f, 14.569f, 4.934f)
            curveTo(13.874f, 4.351f, 12.978f, 4f, 12f, 4f)
            curveTo(9.791f, 4f, 8f, 5.791f, 8f, 8f)
            curveTo(8f, 8.609f, 8.136f, 9.187f, 8.38f, 9.704f)
            curveTo(8.688f, 10.356f, 9.166f, 10.912f, 9.758f, 11.313f)
            curveTo(10.364f, 10.806f, 11.146f, 10.5f, 12f, 10.5f)
            curveTo(12.853f, 10.5f, 13.635f, 10.805f, 14.243f, 11.313f)
            curveTo(15.303f, 10.593f, 16f, 9.378f, 16f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSupportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonSupport, contentDescription = null)
    }
}
