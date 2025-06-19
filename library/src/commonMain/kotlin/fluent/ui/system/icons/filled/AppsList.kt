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

public val FluentIcons.Filled.AppsList: ImageVector
    get() {
        if (_AppsList != null) {
            return _AppsList!!
        }
        _AppsList = ImageVector.Builder(
            name = "Filled.AppsList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.248f, 16.002f)
                curveTo(7.214f, 16.002f, 7.998f, 16.786f, 7.998f, 17.752f)
                verticalLineTo(20.25f)
                curveTo(7.998f, 21.216f, 7.214f, 22f, 6.248f, 22f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 22f, 2f, 21.216f, 2f, 20.25f)
                verticalLineTo(17.752f)
                curveTo(2f, 16.786f, 2.783f, 16.002f, 3.75f, 16.002f)
                horizontalLineTo(6.248f)
                close()
                moveTo(9.748f, 18f)
                horizontalLineTo(21.253f)
                curveTo(21.667f, 18f, 22.003f, 18.336f, 22.003f, 18.75f)
                curveTo(22.003f, 19.13f, 21.721f, 19.444f, 21.355f, 19.493f)
                lineTo(21.253f, 19.5f)
                horizontalLineTo(9.748f)
                curveTo(9.334f, 19.5f, 8.998f, 19.164f, 8.998f, 18.75f)
                curveTo(8.998f, 18.37f, 9.28f, 18.056f, 9.646f, 18.007f)
                lineTo(9.748f, 18f)
                horizontalLineTo(21.253f)
                horizontalLineTo(9.748f)
                close()
                moveTo(6.248f, 9.001f)
                curveTo(7.214f, 9.001f, 7.998f, 9.785f, 7.998f, 10.751f)
                verticalLineTo(13.249f)
                curveTo(7.998f, 14.215f, 7.214f, 14.999f, 6.248f, 14.999f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 14.999f, 2f, 14.215f, 2f, 13.249f)
                verticalLineTo(10.751f)
                curveTo(2f, 9.785f, 2.783f, 9.001f, 3.75f, 9.001f)
                horizontalLineTo(6.248f)
                close()
                moveTo(9.748f, 11f)
                horizontalLineTo(21.253f)
                curveTo(21.667f, 11f, 22.003f, 11.336f, 22.003f, 11.75f)
                curveTo(22.003f, 12.13f, 21.721f, 12.443f, 21.355f, 12.493f)
                lineTo(21.253f, 12.5f)
                horizontalLineTo(9.748f)
                curveTo(9.334f, 12.5f, 8.998f, 12.164f, 8.998f, 11.75f)
                curveTo(8.998f, 11.37f, 9.28f, 11.057f, 9.646f, 11.007f)
                lineTo(9.748f, 11f)
                horizontalLineTo(21.253f)
                horizontalLineTo(9.748f)
                close()
                moveTo(6.248f, 2f)
                curveTo(7.214f, 2f, 7.998f, 2.783f, 7.998f, 3.75f)
                verticalLineTo(6.248f)
                curveTo(7.998f, 7.214f, 7.214f, 7.998f, 6.248f, 7.998f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 7.998f, 2f, 7.214f, 2f, 6.248f)
                verticalLineTo(3.75f)
                curveTo(2f, 2.783f, 2.783f, 2f, 3.75f, 2f)
                horizontalLineTo(6.248f)
                close()
                moveTo(9.748f, 4f)
                horizontalLineTo(21.253f)
                curveTo(21.667f, 4f, 22.003f, 4.336f, 22.003f, 4.75f)
                curveTo(22.003f, 5.13f, 21.721f, 5.443f, 21.355f, 5.493f)
                lineTo(21.253f, 5.5f)
                horizontalLineTo(9.748f)
                curveTo(9.334f, 5.5f, 8.998f, 5.164f, 8.998f, 4.75f)
                curveTo(8.998f, 4.37f, 9.28f, 4.057f, 9.646f, 4.007f)
                lineTo(9.748f, 4f)
                horizontalLineTo(21.253f)
                horizontalLineTo(9.748f)
                close()
            }
        }.build()

        return _AppsList!!
    }

@Suppress("ObjectPropertyName")
private var _AppsList: ImageVector? = null

@Preview
@Composable
private fun AppsListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AppsList, contentDescription = null)
    }
}
