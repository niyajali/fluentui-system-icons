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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Run: ImageVector
    get() {
        if (_Run != null) {
            return _Run!!
        }
        _Run = ImageVector.Builder(
            name = "Regular.Run",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.979f, 3.57f)
                curveTo(8.876f, 3.169f, 8.466f, 2.923f, 8.064f, 3.02f)
                curveTo(7.733f, 3.1f, 7.511f, 3.386f, 7.498f, 3.708f)
                curveTo(5.548f, 4.345f, 4.392f, 5.359f, 3.743f, 6.521f)
                curveTo(3.132f, 7.615f, 3.019f, 8.758f, 3.002f, 9.634f)
                lineTo(2.496f, 10.267f)
                curveTo(1.676f, 11.293f, 1.905f, 12.801f, 2.993f, 13.536f)
                lineTo(12.06f, 19.668f)
                curveTo(13.342f, 20.535f, 14.854f, 20.998f, 16.402f, 20.998f)
                horizontalLineTo(18.61f)
                curveTo(20.483f, 20.998f, 22.002f, 19.48f, 22.002f, 17.606f)
                curveTo(22.002f, 15.696f, 20.402f, 14.381f, 19.018f, 13.713f)
                curveTo(18.604f, 13.514f, 18.26f, 13.252f, 18.032f, 12.917f)
                lineTo(15.449f, 8.473f)
                curveTo(15.794f, 8.382f, 16.031f, 8.056f, 15.997f, 7.69f)
                curveTo(15.959f, 7.279f, 15.592f, 6.972f, 15.178f, 7.005f)
                curveTo(12.229f, 7.239f, 9.578f, 5.901f, 8.979f, 3.57f)
                close()
                moveTo(13.723f, 8.488f)
                lineTo(16.747f, 13.692f)
                curveTo(16.755f, 13.705f, 16.763f, 13.717f, 16.771f, 13.73f)
                curveTo(17.191f, 14.363f, 17.784f, 14.784f, 18.367f, 15.064f)
                curveTo(19.135f, 15.435f, 19.769f, 15.933f, 20.141f, 16.497f)
                horizontalLineTo(16.371f)
                curveTo(15.723f, 16.497f, 15.09f, 16.303f, 14.553f, 15.941f)
                lineTo(12.701f, 14.692f)
                lineTo(13.125f, 14.447f)
                curveTo(13.962f, 13.964f, 14.249f, 12.894f, 13.765f, 12.057f)
                lineTo(13.083f, 10.875f)
                curveTo(12.6f, 10.038f, 11.53f, 9.752f, 10.693f, 10.235f)
                lineTo(8.215f, 11.665f)
                lineTo(7.004f, 10.848f)
                lineTo(7.124f, 10.779f)
                curveTo(7.961f, 10.296f, 8.248f, 9.225f, 7.765f, 8.388f)
                lineTo(6.329f, 5.903f)
                curveTo(6.762f, 5.613f, 7.303f, 5.347f, 7.985f, 5.126f)
                curveTo(9.068f, 7.17f, 11.347f, 8.277f, 13.723f, 8.488f)
                close()
                moveTo(5.621f, 9.915f)
                lineTo(4.524f, 9.175f)
                curveTo(4.572f, 8.537f, 4.706f, 7.873f, 5.053f, 7.253f)
                curveTo(5.103f, 7.163f, 5.159f, 7.072f, 5.22f, 6.982f)
                lineTo(6.466f, 9.138f)
                curveTo(6.535f, 9.258f, 6.494f, 9.411f, 6.374f, 9.48f)
                lineTo(5.621f, 9.915f)
                close()
                moveTo(11.318f, 13.758f)
                lineTo(9.599f, 12.599f)
                lineTo(11.443f, 11.534f)
                curveTo(11.562f, 11.465f, 11.715f, 11.506f, 11.784f, 11.625f)
                lineTo(12.466f, 12.807f)
                curveTo(12.535f, 12.926f, 12.494f, 13.079f, 12.375f, 13.148f)
                lineTo(11.318f, 13.758f)
                close()
                moveTo(3.667f, 11.204f)
                lineTo(4.082f, 10.686f)
                lineTo(13.714f, 17.184f)
                curveTo(14.499f, 17.714f, 15.424f, 17.997f, 16.371f, 17.997f)
                horizontalLineTo(20.462f)
                curveTo(20.282f, 18.854f, 19.521f, 19.498f, 18.61f, 19.498f)
                horizontalLineTo(16.402f)
                curveTo(15.154f, 19.498f, 13.934f, 19.125f, 12.901f, 18.426f)
                lineTo(3.833f, 12.294f)
                curveTo(3.47f, 12.049f, 3.394f, 11.546f, 3.667f, 11.204f)
                close()
            }
        }.build()

        return _Run!!
    }

@Suppress("ObjectPropertyName")
private var _Run: ImageVector? = null

@Preview
@Composable
private fun RunPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Run, contentDescription = null)
    }
}
