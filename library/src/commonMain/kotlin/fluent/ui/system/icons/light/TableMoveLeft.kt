package fluent.ui.system.icons.light

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

public val FluentIcons.Light.TableMoveLeft: ImageVector
    get() {
        if (_TableMoveLeft != null) {
            return _TableMoveLeft!!
        }
        _TableMoveLeft = ImageVector.Builder(
            name = "Light.TableMoveLeft",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 28.5f)
                curveTo(3f, 28.776f, 3.224f, 29f, 3.5f, 29f)
                curveTo(3.776f, 29f, 4f, 28.776f, 4f, 28.5f)
                verticalLineTo(3.5f)
                curveTo(4f, 3.224f, 3.776f, 3f, 3.5f, 3f)
                curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
                verticalLineTo(28.5f)
                close()
                moveTo(6.146f, 16.354f)
                curveTo(5.951f, 16.158f, 5.951f, 15.842f, 6.146f, 15.646f)
                lineTo(9.146f, 12.646f)
                curveTo(9.342f, 12.451f, 9.658f, 12.451f, 9.854f, 12.646f)
                curveTo(10.049f, 12.842f, 10.049f, 13.158f, 9.854f, 13.354f)
                lineTo(7.707f, 15.5f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 15.5f, 15f, 15.724f, 15f, 16f)
                curveTo(15f, 16.276f, 14.776f, 16.5f, 14.5f, 16.5f)
                horizontalLineTo(7.707f)
                lineTo(9.854f, 18.646f)
                curveTo(10.049f, 18.842f, 10.049f, 19.158f, 9.854f, 19.354f)
                curveTo(9.658f, 19.549f, 9.342f, 19.549f, 9.146f, 19.354f)
                lineTo(6.146f, 16.354f)
                close()
                moveTo(11f, 28.5f)
                curveTo(11f, 28.776f, 11.224f, 29f, 11.5f, 29f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 3f, 11f, 3.224f, 11f, 3.5f)
                verticalLineTo(11.5f)
                curveTo(11f, 11.776f, 11.224f, 12f, 11.5f, 12f)
                horizontalLineTo(20f)
                lineTo(20f, 20f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 20f, 11f, 20.224f, 11f, 20.5f)
                verticalLineTo(28.5f)
                close()
                moveTo(20f, 21f)
                verticalLineTo(28f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                close()
                moveTo(21f, 28f)
                verticalLineTo(21f)
                horizontalLineTo(28f)
                verticalLineTo(24.5f)
                curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
                horizontalLineTo(21f)
                close()
                moveTo(28f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
                verticalLineTo(11f)
                close()
                moveTo(20f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                close()
                moveTo(28f, 20f)
                horizontalLineTo(21f)
                lineTo(21f, 12f)
                horizontalLineTo(28f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _TableMoveLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TableMoveLeft: ImageVector? = null

@Preview
@Composable
private fun TableMoveLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TableMoveLeft, contentDescription = null)
    }
}
