package fluent.ui.system.icons.light

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.TextEditStyle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TextEditStyle",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.427f, 2.625f)
            curveTo(10.09f, 1.792f, 8.91f, 1.792f, 8.573f, 2.625f)
            lineTo(3.037f, 16.312f)
            curveTo(2.933f, 16.568f, 3.057f, 16.859f, 3.313f, 16.963f)
            curveTo(3.569f, 17.066f, 3.86f, 16.943f, 3.964f, 16.687f)
            lineTo(5.859f, 12f)
            horizontalLineTo(13.141f)
            lineTo(14.877f, 16.293f)
            lineTo(15.646f, 15.525f)
            lineTo(10.427f, 2.625f)
            close()
            moveTo(12.736f, 11f)
            horizontalLineTo(6.264f)
            lineTo(9.5f, 3f)
            lineTo(12.736f, 11f)
            close()
            moveTo(27.817f, 11.182f)
            curveTo(26.241f, 9.606f, 23.686f, 9.606f, 22.11f, 11.182f)
            lineTo(11.514f, 21.779f)
            curveTo(11.213f, 22.079f, 10.994f, 22.451f, 10.877f, 22.86f)
            lineTo(9.019f, 29.363f)
            curveTo(8.97f, 29.537f, 9.018f, 29.725f, 9.147f, 29.854f)
            curveTo(9.275f, 29.982f, 9.463f, 30.031f, 9.638f, 29.981f)
            lineTo(16.138f, 28.124f)
            curveTo(16.546f, 28.007f, 16.919f, 27.788f, 17.219f, 27.487f)
            lineTo(27.817f, 16.889f)
            curveTo(29.393f, 15.313f, 29.393f, 12.758f, 27.817f, 11.182f)
            close()
            moveTo(22.817f, 11.889f)
            curveTo(24.003f, 10.704f, 25.925f, 10.704f, 27.11f, 11.889f)
            curveTo(28.296f, 13.075f, 28.296f, 14.997f, 27.11f, 16.182f)
            lineTo(16.512f, 26.78f)
            curveTo(16.332f, 26.961f, 16.108f, 27.092f, 15.863f, 27.162f)
            lineTo(10.228f, 28.772f)
            lineTo(11.839f, 23.134f)
            curveTo(11.909f, 22.889f, 12.04f, 22.666f, 12.221f, 22.486f)
            lineTo(22.817f, 11.889f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextEditStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TextEditStyle, contentDescription = null)
    }
}
