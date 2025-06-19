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

public val FluentIcons.Regular.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Regular.Headphones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                verticalLineTo(19f)
                curveTo(22f, 20.598f, 20.751f, 21.904f, 19.176f, 21.995f)
                lineTo(19f, 22f)
                horizontalLineTo(16f)
                curveTo(15.487f, 22f, 15.064f, 21.614f, 15.007f, 21.117f)
                lineTo(15f, 21f)
                verticalLineTo(15f)
                curveTo(15f, 14.487f, 15.386f, 14.064f, 15.883f, 14.007f)
                lineTo(16f, 14f)
                horizontalLineTo(20.5f)
                verticalLineTo(12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                curveTo(8.552f, 14f, 9f, 14.448f, 9f, 15f)
                verticalLineTo(21f)
                curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
                horizontalLineTo(5f)
                curveTo(3.343f, 22f, 2f, 20.657f, 2f, 19f)
                verticalLineTo(12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(19f)
                verticalLineTo(12f)
                close()
                moveTo(7.5f, 15.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(19f)
                curveTo(3.5f, 19.828f, 4.172f, 20.5f, 5f, 20.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(20.5f, 15.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(19f)
                curveTo(19.78f, 20.5f, 20.42f, 19.905f, 20.493f, 19.145f)
                lineTo(20.5f, 19f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null

@Preview
@Composable
private fun HeadphonesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Headphones, contentDescription = null)
    }
}
