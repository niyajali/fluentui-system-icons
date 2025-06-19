package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.TextHeader5: ImageVector
    get() {
        if (_TextHeader5 != null) {
            return _TextHeader5!!
        }
        _TextHeader5 = ImageVector.Builder(
            name = "Filled.TextHeader5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.102f, 5.006f)
                curveTo(20.605f, 5.057f, 21f, 5.482f, 21f, 5.999f)
                curveTo(21f, 6.551f, 20.552f, 7f, 20f, 7f)
                lineTo(15.904f, 6.999f)
                lineTo(15.606f, 9.985f)
                curveTo(15.732f, 9.984f, 15.864f, 9.982f, 15.997f, 9.981f)
                curveTo(16.758f, 9.979f, 17.726f, 9.985f, 18.161f, 10.046f)
                lineTo(18.402f, 10.086f)
                curveTo(20.87f, 10.561f, 22.557f, 12.895f, 22.203f, 15.411f)
                curveTo(21.838f, 18.009f, 19.437f, 19.819f, 16.839f, 19.454f)
                curveTo(15.18f, 19.221f, 13.843f, 18.156f, 13.189f, 16.745f)
                lineTo(13.067f, 16.458f)
                lineTo(13.035f, 16.361f)
                curveTo(12.901f, 15.873f, 13.157f, 15.353f, 13.64f, 15.166f)
                curveTo(14.123f, 14.979f, 14.661f, 15.193f, 14.891f, 15.644f)
                lineTo(14.933f, 15.738f)
                lineTo(15.003f, 15.905f)
                curveTo(15.384f, 16.726f, 16.159f, 17.338f, 17.117f, 17.473f)
                curveTo(18.621f, 17.684f, 20.011f, 16.637f, 20.223f, 15.133f)
                curveTo(20.421f, 13.723f, 19.513f, 12.413f, 18.159f, 12.08f)
                lineTo(17.883f, 12.026f)
                curveTo(17.625f, 11.99f, 16.83f, 11.978f, 16.004f, 11.981f)
                curveTo(15.612f, 11.983f, 15.241f, 11.988f, 14.968f, 11.992f)
                curveTo(14.832f, 11.994f, 14.719f, 11.996f, 14.642f, 11.997f)
                curveTo(14.602f, 11.998f, 14.563f, 11.999f, 14.523f, 11.999f)
                lineTo(14.521f, 12f)
                curveTo(14.235f, 12.006f, 13.96f, 11.889f, 13.766f, 11.679f)
                curveTo(13.596f, 11.495f, 13.501f, 11.255f, 13.499f, 11.007f)
                lineTo(13.505f, 10.9f)
                lineTo(14.006f, 5.9f)
                curveTo(14.057f, 5.39f, 14.487f, 5f, 15f, 5f)
                horizontalLineTo(20f)
                lineTo(20.102f, 5.006f)
                close()
                moveTo(11f, 5f)
                curveTo(11.552f, 5f, 12f, 5.448f, 12f, 6f)
                verticalLineTo(18f)
                curveTo(12f, 18.552f, 11.552f, 19f, 11f, 19f)
                curveTo(10.448f, 19f, 10f, 18.552f, 10f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                curveTo(4f, 18.552f, 3.552f, 19f, 3f, 19f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
                curveTo(3.552f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                curveTo(10f, 5.448f, 10.448f, 5f, 11f, 5f)
                close()
            }
        }.build()

        return _TextHeader5!!
    }

@Suppress("ObjectPropertyName")
private var _TextHeader5: ImageVector? = null

@Preview
@Composable
private fun TextHeader5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextHeader5, contentDescription = null)
    }
}
