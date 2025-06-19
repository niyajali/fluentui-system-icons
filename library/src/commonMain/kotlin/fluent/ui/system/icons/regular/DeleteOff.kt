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

public val FluentIcons.Regular.DeleteOff: ImageVector
    get() {
        if (_DeleteOff != null) {
            return _DeleteOff!!
        }
        _DeleteOff = ImageVector.Builder(
            name = "Regular.DeleteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.939f, 5f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(18.529f, 19.59f)
                curveTo(17.987f, 21.01f, 16.613f, 22f, 15.026f, 22f)
                horizontalLineTo(8.974f)
                curveTo(7.043f, 22f, 5.427f, 20.533f, 5.241f, 18.611f)
                lineTo(4.069f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
                curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
                horizontalLineTo(3.939f)
                close()
                moveTo(17.278f, 18.339f)
                lineTo(15f, 16.061f)
                verticalLineTo(17.25f)
                curveTo(15f, 17.664f, 14.664f, 18f, 14.25f, 18f)
                curveTo(13.836f, 18f, 13.5f, 17.664f, 13.5f, 17.25f)
                verticalLineTo(14.561f)
                lineTo(10.5f, 11.561f)
                verticalLineTo(17.25f)
                curveTo(10.5f, 17.664f, 10.164f, 18f, 9.75f, 18f)
                curveTo(9.336f, 18f, 9f, 17.664f, 9f, 17.25f)
                verticalLineTo(10.061f)
                lineTo(5.591f, 6.651f)
                lineTo(6.734f, 18.467f)
                curveTo(6.846f, 19.62f, 7.815f, 20.5f, 8.974f, 20.5f)
                horizontalLineTo(15.026f)
                curveTo(16.185f, 20.5f, 17.154f, 19.62f, 17.266f, 18.467f)
                lineTo(17.278f, 18.339f)
                close()
                moveTo(13.5f, 10.318f)
                lineTo(15f, 11.819f)
                verticalLineTo(9.75f)
                curveTo(15f, 9.336f, 14.664f, 9f, 14.25f, 9f)
                curveTo(13.836f, 9f, 13.5f, 9.336f, 13.5f, 9.75f)
                verticalLineTo(10.318f)
                close()
                moveTo(18.424f, 6.5f)
                lineTo(17.653f, 14.471f)
                lineTo(19.027f, 15.845f)
                lineTo(19.931f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 6.5f, 22f, 6.164f, 22f, 5.75f)
                curveTo(22f, 5.336f, 21.664f, 5f, 21.25f, 5f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 3.067f, 13.933f, 1.5f, 12f, 1.5f)
                curveTo(10.067f, 1.5f, 8.5f, 3.067f, 8.5f, 5f)
                horizontalLineTo(8.182f)
                lineTo(9.682f, 6.5f)
                horizontalLineTo(18.424f)
                close()
                moveTo(14f, 5f)
                horizontalLineTo(10f)
                curveTo(10f, 3.895f, 10.895f, 3f, 12f, 3f)
                curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
                close()
            }
        }.build()

        return _DeleteOff!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteOff: ImageVector? = null

@Preview
@Composable
private fun DeleteOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeleteOff, contentDescription = null)
    }
}
