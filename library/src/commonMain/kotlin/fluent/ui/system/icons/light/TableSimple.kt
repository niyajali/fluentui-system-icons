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

public val FluentIcons.Light.TableSimple: ImageVector
    get() {
        if (_TableSimple != null) {
            return _TableSimple!!
        }
        _TableSimple = ImageVector.Builder(
            name = "Light.TableSimple",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(16.5f, 28f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(28f)
                close()
                moveTo(15.5f, 16.5f)
                horizontalLineTo(4f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(15.5f)
                verticalLineTo(16.5f)
                close()
                moveTo(16.5f, 15.5f)
                horizontalLineTo(28f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(15.5f, 4f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _TableSimple!!
    }

@Suppress("ObjectPropertyName")
private var _TableSimple: ImageVector? = null

@Preview
@Composable
private fun TableSimplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TableSimple, contentDescription = null)
    }
}
