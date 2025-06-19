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

public val FluentIcons.Regular.Rename: ImageVector
    get() {
        if (_Rename != null) {
            return _Rename!!
        }
        _Rename = ImageVector.Builder(
            name = "Regular.Rename",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 2f)
                horizontalLineTo(13.748f)
                curveTo(14.163f, 2f, 14.498f, 2.336f, 14.498f, 2.75f)
                curveTo(14.498f, 3.13f, 14.216f, 3.443f, 13.85f, 3.493f)
                lineTo(13.748f, 3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(13.745f)
                curveTo(14.125f, 20.5f, 14.439f, 20.782f, 14.488f, 21.148f)
                lineTo(14.495f, 21.25f)
                curveTo(14.495f, 21.63f, 14.213f, 21.944f, 13.847f, 21.993f)
                lineTo(13.745f, 22f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 22f, 9f, 21.664f, 9f, 21.25f)
                curveTo(9f, 20.87f, 9.282f, 20.556f, 9.648f, 20.507f)
                lineTo(9.75f, 20.5f)
                horizontalLineTo(11f)
                verticalLineTo(3.5f)
                horizontalLineTo(9.75f)
                curveTo(9.37f, 3.5f, 9.057f, 3.218f, 9.007f, 2.852f)
                lineTo(9f, 2.75f)
                curveTo(9f, 2.37f, 9.282f, 2.057f, 9.648f, 2.007f)
                lineTo(9.75f, 2f)
                horizontalLineTo(13.748f)
                horizontalLineTo(9.75f)
                close()
                moveTo(18.246f, 4.997f)
                curveTo(20.04f, 4.998f, 21.495f, 6.452f, 21.497f, 8.246f)
                lineTo(21.5f, 15.751f)
                curveTo(21.501f, 17.484f, 20.145f, 18.901f, 18.436f, 18.997f)
                lineTo(18.25f, 19.002f)
                lineTo(13.505f, 19.001f)
                verticalLineTo(17.501f)
                horizontalLineTo(18.309f)
                curveTo(19.248f, 17.471f, 20f, 16.699f, 20f, 15.752f)
                lineTo(19.997f, 8.247f)
                curveTo(19.996f, 7.281f, 19.212f, 6.498f, 18.245f, 6.497f)
                horizontalLineTo(13.505f)
                verticalLineTo(4.997f)
                horizontalLineTo(18.246f)
                close()
                moveTo(10f, 4.997f)
                verticalLineTo(6.497f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 6.497f, 3.5f, 7.28f, 3.5f, 8.247f)
                verticalLineTo(15.751f)
                curveTo(3.5f, 16.718f, 4.284f, 17.501f, 5.25f, 17.501f)
                horizontalLineTo(9.995f)
                verticalLineTo(19.001f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 19.001f, 2f, 17.546f, 2f, 15.751f)
                verticalLineTo(8.247f)
                curveTo(2f, 6.452f, 3.455f, 4.997f, 5.25f, 4.997f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Rename!!
    }

@Suppress("ObjectPropertyName")
private var _Rename: ImageVector? = null

@Preview
@Composable
private fun RenamePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Rename, contentDescription = null)
    }
}
