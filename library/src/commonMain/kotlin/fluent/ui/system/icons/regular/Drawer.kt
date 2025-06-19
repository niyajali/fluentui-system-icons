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

public val FluentIcons.Regular.Drawer: ImageVector
    get() {
        if (_Drawer != null) {
            return _Drawer!!
        }
        _Drawer = ImageVector.Builder(
            name = "Regular.Drawer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.25f, 16.75f)
                curveTo(9.836f, 16.75f, 9.5f, 17.086f, 9.5f, 17.5f)
                curveTo(9.5f, 17.914f, 9.836f, 18.25f, 10.25f, 18.25f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 18.25f, 14.5f, 17.914f, 14.5f, 17.5f)
                curveTo(14.5f, 17.086f, 14.164f, 16.75f, 13.75f, 16.75f)
                horizontalLineTo(10.25f)
                close()
                moveTo(8.07f, 3f)
                curveTo(7.402f, 3f, 6.777f, 3.334f, 6.406f, 3.891f)
                lineTo(4.336f, 6.996f)
                curveTo(4.117f, 7.325f, 4f, 7.711f, 4f, 8.106f)
                verticalLineTo(11f)
                curveTo(4f, 11.552f, 4.448f, 12f, 5f, 12f)
                horizontalLineTo(5.357f)
                lineTo(4.5f, 14f)
                curveTo(3.672f, 14f, 3f, 14.672f, 3f, 15.5f)
                verticalLineTo(19.5f)
                curveTo(3f, 20.328f, 3.672f, 21f, 4.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 21f, 21f, 20.328f, 21f, 19.5f)
                verticalLineTo(15.5f)
                curveTo(21f, 14.672f, 20.328f, 14f, 19.5f, 14f)
                lineTo(18.643f, 12f)
                horizontalLineTo(19f)
                curveTo(19.552f, 12f, 20f, 11.552f, 20f, 11f)
                verticalLineTo(8.106f)
                curveTo(20f, 7.711f, 19.883f, 7.325f, 19.664f, 6.996f)
                lineTo(17.594f, 3.891f)
                curveTo(17.223f, 3.334f, 16.598f, 3f, 15.93f, 3f)
                horizontalLineTo(8.07f)
                close()
                moveTo(18f, 10.5f)
                lineTo(17.143f, 8.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(18f)
                close()
                moveTo(15.511f, 8.5f)
                lineTo(17.847f, 13.951f)
                lineTo(17.823f, 14f)
                horizontalLineTo(6.177f)
                lineTo(6.153f, 13.951f)
                lineTo(8.489f, 8.5f)
                horizontalLineTo(15.511f)
                close()
                moveTo(17.864f, 7f)
                horizontalLineTo(6.136f)
                lineTo(7.654f, 4.723f)
                curveTo(7.747f, 4.584f, 7.903f, 4.5f, 8.07f, 4.5f)
                horizontalLineTo(15.93f)
                curveTo(16.097f, 4.5f, 16.253f, 4.584f, 16.346f, 4.723f)
                lineTo(17.864f, 7f)
                close()
                moveTo(6.857f, 8.5f)
                lineTo(6f, 10.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(6.857f)
                close()
                moveTo(4.5f, 15.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(4.5f)
                lineTo(4.5f, 15.5f)
                close()
            }
        }.build()

        return _Drawer!!
    }

@Suppress("ObjectPropertyName")
private var _Drawer: ImageVector? = null

@Preview
@Composable
private fun DrawerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Drawer, contentDescription = null)
    }
}
