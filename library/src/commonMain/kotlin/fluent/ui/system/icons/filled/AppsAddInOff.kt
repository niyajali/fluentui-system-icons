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

public val FluentIcons.Filled.AppsAddInOff: ImageVector
    get() {
        if (_AppsAddInOff != null) {
            return _AppsAddInOff!!
        }
        _AppsAddInOff = ImageVector.Builder(
            name = "Filled.AppsAddInOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.283f, 4.344f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(19.656f, 20.717f)
                curveTo(19.31f, 20.898f, 18.917f, 21f, 18.5f, 21f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 21f, 3f, 19.881f, 3f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(3f, 5.083f, 3.102f, 4.689f, 3.283f, 4.344f)
                close()
                moveTo(17.939f, 19f)
                lineTo(13f, 14.061f)
                verticalLineTo(19f)
                horizontalLineTo(17.939f)
                close()
                moveTo(9.939f, 11f)
                lineTo(5f, 6.061f)
                verticalLineTo(11f)
                horizontalLineTo(9.939f)
                close()
                moveTo(11f, 5.5f)
                verticalLineTo(7.818f)
                lineTo(13f, 9.819f)
                verticalLineTo(5.5f)
                curveTo(13f, 4.119f, 11.881f, 3f, 10.5f, 3f)
                horizontalLineTo(6.182f)
                lineTo(8.182f, 5f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
                close()
                moveTo(16.181f, 13f)
                lineTo(14.181f, 11f)
                horizontalLineTo(18.5f)
                curveTo(19.881f, 11f, 21f, 12.119f, 21f, 13.5f)
                verticalLineTo(17.819f)
                lineTo(19f, 15.819f)
                verticalLineTo(13.5f)
                curveTo(19f, 13.224f, 18.776f, 13f, 18.5f, 13f)
                horizontalLineTo(16.181f)
                close()
                moveTo(11f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(18.5f)
                curveTo(5f, 18.776f, 5.224f, 19f, 5.5f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
                moveTo(17.883f, 2.007f)
                lineTo(18f, 2f)
                curveTo(18.513f, 2f, 18.935f, 2.386f, 18.993f, 2.883f)
                lineTo(19f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                curveTo(21.513f, 5f, 21.935f, 5.386f, 21.993f, 5.883f)
                lineTo(22f, 6f)
                curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
                lineTo(21f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                curveTo(19f, 9.513f, 18.614f, 9.936f, 18.117f, 9.993f)
                lineTo(18f, 10f)
                curveTo(17.487f, 10f, 17.065f, 9.614f, 17.007f, 9.117f)
                lineTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                curveTo(14.487f, 7f, 14.064f, 6.614f, 14.007f, 6.117f)
                lineTo(14f, 6f)
                curveTo(14f, 5.487f, 14.386f, 5.064f, 14.883f, 5.007f)
                lineTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                curveTo(17f, 2.487f, 17.386f, 2.064f, 17.883f, 2.007f)
                close()
            }
        }.build()

        return _AppsAddInOff!!
    }

@Suppress("ObjectPropertyName")
private var _AppsAddInOff: ImageVector? = null

@Preview
@Composable
private fun AppsAddInOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AppsAddInOff, contentDescription = null)
    }
}
