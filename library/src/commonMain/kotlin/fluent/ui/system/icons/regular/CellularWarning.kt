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

public val FluentIcons.Regular.CellularWarning: ImageVector
    get() {
        if (_CellularWarning != null) {
            return _CellularWarning!!
        }
        _CellularWarning = ImageVector.Builder(
            name = "Regular.CellularWarning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 18.002f)
                curveTo(4.13f, 18.002f, 4.443f, 18.285f, 4.493f, 18.651f)
                lineTo(4.5f, 18.753f)
                verticalLineTo(20.253f)
                curveTo(4.5f, 20.667f, 4.164f, 21.003f, 3.75f, 21.003f)
                curveTo(3.37f, 21.003f, 3.057f, 20.721f, 3.007f, 20.355f)
                lineTo(3f, 20.253f)
                verticalLineTo(18.753f)
                curveTo(3f, 18.338f, 3.336f, 18.002f, 3.75f, 18.002f)
                close()
                moveTo(11.75f, 12.001f)
                curveTo(12.13f, 12.001f, 12.443f, 12.283f, 12.493f, 12.649f)
                lineTo(12.5f, 12.751f)
                verticalLineTo(17.912f)
                lineTo(11.267f, 20.38f)
                curveTo(11.216f, 20.481f, 11.174f, 20.584f, 11.138f, 20.686f)
                curveTo(11.069f, 20.59f, 11.023f, 20.477f, 11.007f, 20.355f)
                lineTo(11f, 20.253f)
                verticalLineTo(12.751f)
                curveTo(11f, 12.337f, 11.336f, 12.001f, 11.75f, 12.001f)
                close()
                moveTo(15.263f, 12.381f)
                curveTo(15.546f, 11.813f, 15.992f, 11.42f, 16.5f, 11.202f)
                verticalLineTo(9.751f)
                lineTo(16.493f, 9.649f)
                curveTo(16.444f, 9.283f, 16.13f, 9f, 15.75f, 9f)
                curveTo(15.336f, 9f, 15f, 9.336f, 15f, 9.751f)
                verticalLineTo(12.907f)
                lineTo(15.263f, 12.381f)
                close()
                moveTo(19.737f, 12.381f)
                lineTo(20.494f, 13.896f)
                lineTo(20.483f, 6.743f)
                lineTo(20.475f, 6.641f)
                curveTo(20.422f, 6.276f, 20.109f, 5.996f, 19.734f, 6f)
                curveTo(19.325f, 6.004f, 18.996f, 6.343f, 19f, 6.758f)
                lineTo(19.008f, 11.496f)
                curveTo(19.301f, 11.717f, 19.553f, 12.012f, 19.737f, 12.381f)
                close()
                moveTo(7.75f, 14.998f)
                curveTo(8.13f, 14.998f, 8.443f, 15.28f, 8.493f, 15.646f)
                lineTo(8.5f, 15.748f)
                verticalLineTo(20.248f)
                curveTo(8.5f, 20.662f, 8.164f, 20.998f, 7.75f, 20.998f)
                curveTo(7.37f, 20.998f, 7.057f, 20.716f, 7.007f, 20.35f)
                lineTo(7f, 20.248f)
                verticalLineTo(15.748f)
                curveTo(7f, 15.334f, 7.336f, 14.998f, 7.75f, 14.998f)
                close()
                moveTo(16.157f, 12.828f)
                lineTo(12.16f, 20.828f)
                curveTo(11.661f, 21.826f, 12.387f, 23f, 13.503f, 23f)
                horizontalLineTo(21.497f)
                curveTo(22.613f, 23f, 23.338f, 21.826f, 22.84f, 20.828f)
                lineTo(18.843f, 12.828f)
                curveTo(18.29f, 11.721f, 16.71f, 11.721f, 16.157f, 12.828f)
                close()
                moveTo(18f, 15.494f)
                verticalLineTo(18.496f)
                curveTo(18f, 18.773f, 17.776f, 18.997f, 17.5f, 18.997f)
                curveTo(17.224f, 18.997f, 17f, 18.773f, 17f, 18.496f)
                verticalLineTo(15.494f)
                curveTo(17f, 15.218f, 17.224f, 14.993f, 17.5f, 14.993f)
                curveTo(17.776f, 14.993f, 18f, 15.218f, 18f, 15.494f)
                close()
                moveTo(17.5f, 20.998f)
                curveTo(17.224f, 20.998f, 17f, 20.774f, 17f, 20.498f)
                curveTo(17f, 20.222f, 17.224f, 19.997f, 17.5f, 19.997f)
                curveTo(17.776f, 19.997f, 18f, 20.222f, 18f, 20.498f)
                curveTo(18f, 20.774f, 17.776f, 20.998f, 17.5f, 20.998f)
                close()
            }
        }.build()

        return _CellularWarning!!
    }

@Suppress("ObjectPropertyName")
private var _CellularWarning: ImageVector? = null

@Preview
@Composable
private fun CellularWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CellularWarning, contentDescription = null)
    }
}
