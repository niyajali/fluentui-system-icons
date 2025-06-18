package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.SendPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SendPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.694f, 11.753f)
            lineTo(2.299f, 3.024f)
            curveTo(2.063f, 2.417f, 2.655f, 1.836f, 3.241f, 2.043f)
            lineTo(3.334f, 2.082f)
            lineTo(21.334f, 11.082f)
            curveTo(21.852f, 11.341f, 21.884f, 12.05f, 21.431f, 12.366f)
            lineTo(21.334f, 12.423f)
            lineTo(20.026f, 13.077f)
            curveTo(19.617f, 12.651f, 19.102f, 12.328f, 18.523f, 12.152f)
            lineTo(19.321f, 11.753f)
            lineTo(4.402f, 4.293f)
            lineTo(7.011f, 11.002f)
            lineTo(13.639f, 11.003f)
            curveTo(14.018f, 11.003f, 14.332f, 11.285f, 14.382f, 11.651f)
            lineTo(14.389f, 11.753f)
            curveTo(14.389f, 12.132f, 14.106f, 12.446f, 13.74f, 12.496f)
            lineTo(13.639f, 12.503f)
            lineTo(7.011f, 12.502f)
            lineTo(4.402f, 19.212f)
            lineTo(14.208f, 14.309f)
            curveTo(14.073f, 14.681f, 14f, 15.082f, 14f, 15.5f)
            curveTo(14f, 15.693f, 14.016f, 15.883f, 14.046f, 16.067f)
            lineTo(3.334f, 21.423f)
            curveTo(2.751f, 21.715f, 2.117f, 21.179f, 2.269f, 20.576f)
            lineTo(2.299f, 20.481f)
            lineTo(5.694f, 11.753f)
            close()
            moveTo(20f, 15.5f)
            curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
            curveTo(16.119f, 18f, 15f, 16.881f, 15f, 15.5f)
            curveTo(15f, 14.119f, 16.119f, 13f, 17.5f, 13f)
            curveTo(18.881f, 13f, 20f, 14.119f, 20f, 15.5f)
            close()
            moveTo(22f, 20.875f)
            curveTo(22f, 22.431f, 20.714f, 24f, 17.5f, 24f)
            curveTo(14.286f, 24f, 13f, 22.437f, 13f, 20.875f)
            verticalLineTo(20.772f)
            curveTo(13f, 19.793f, 13.794f, 19f, 14.773f, 19f)
            horizontalLineTo(20.227f)
            curveTo(21.206f, 19f, 22f, 19.793f, 22f, 20.772f)
            verticalLineTo(20.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SendPerson, contentDescription = null)
    }
}
