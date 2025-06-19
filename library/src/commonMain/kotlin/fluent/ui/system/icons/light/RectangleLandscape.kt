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

public val FluentIcons.Light.RectangleLandscape: ImageVector
    get() {
        if (_RectangleLandscape != null) {
            return _RectangleLandscape!!
        }
        _RectangleLandscape = ImageVector.Builder(
            name = "Light.RectangleLandscape",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(25.5f)
                curveTo(27.985f, 4f, 30f, 6.015f, 30f, 8.5f)
                verticalLineTo(23.5f)
                curveTo(30f, 25.985f, 27.985f, 28f, 25.5f, 28f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 28f, 2f, 25.985f, 2f, 23.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 5f)
                curveTo(4.567f, 5f, 3f, 6.567f, 3f, 8.5f)
                verticalLineTo(23.5f)
                curveTo(3f, 25.433f, 4.567f, 27f, 6.5f, 27f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 27f, 29f, 25.433f, 29f, 23.5f)
                verticalLineTo(8.5f)
                curveTo(29f, 6.567f, 27.433f, 5f, 25.5f, 5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()

        return _RectangleLandscape!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleLandscape: ImageVector? = null

@Preview
@Composable
private fun RectangleLandscapePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.RectangleLandscape, contentDescription = null)
    }
}
