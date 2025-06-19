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

public val FluentIcons.Filled.TvUsb: ImageVector
    get() {
        if (_TvUsb != null) {
            return _TvUsb!!
        }
        _TvUsb = ImageVector.Builder(
            name = "Filled.TvUsb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 3f)
                curveTo(3.231f, 3f, 2f, 4.231f, 2f, 5.75f)
                verticalLineTo(14.25f)
                curveTo(2f, 15.769f, 3.231f, 17f, 4.75f, 17f)
                horizontalLineTo(14.5f)
                verticalLineTo(14f)
                curveTo(14.5f, 13.182f, 14.893f, 12.456f, 15.5f, 12f)
                verticalLineTo(11f)
                curveTo(15.5f, 9.619f, 16.619f, 8.5f, 18f, 8.5f)
                horizontalLineTo(21f)
                curveTo(21.356f, 8.5f, 21.694f, 8.574f, 22f, 8.708f)
                verticalLineTo(5.75f)
                curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.75f, 18.5f)
                horizontalLineTo(14.751f)
                curveTo(14.797f, 18.595f, 14.849f, 18.687f, 14.908f, 18.776f)
                lineTo(15.708f, 20f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 20f, 5f, 19.664f, 5f, 19.25f)
                curveTo(5f, 18.836f, 5.336f, 18.5f, 5.75f, 18.5f)
                close()
                moveTo(17.5f, 20f)
                lineTo(16.163f, 17.955f)
                curveTo(16.057f, 17.792f, 16f, 17.602f, 16f, 17.408f)
                verticalLineTo(14f)
                curveTo(16f, 13.448f, 16.448f, 13f, 17f, 13f)
                verticalLineTo(11f)
                curveTo(17f, 10.448f, 17.448f, 10f, 18f, 10f)
                horizontalLineTo(21f)
                curveTo(21.552f, 10f, 22f, 10.448f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22.552f, 13f, 23f, 13.448f, 23f, 14f)
                verticalLineTo(17.441f)
                curveTo(23f, 17.638f, 22.942f, 17.83f, 22.833f, 17.994f)
                lineTo(21.5f, 20f)
                verticalLineTo(22f)
                curveTo(21.5f, 22.552f, 21.052f, 23f, 20.5f, 23f)
                horizontalLineTo(18.5f)
                curveTo(17.948f, 23f, 17.5f, 22.552f, 17.5f, 22f)
                verticalLineTo(20f)
                close()
                moveTo(18.5f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(20.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _TvUsb!!
    }

@Suppress("ObjectPropertyName")
private var _TvUsb: ImageVector? = null

@Preview
@Composable
private fun TvUsbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TvUsb, contentDescription = null)
    }
}
