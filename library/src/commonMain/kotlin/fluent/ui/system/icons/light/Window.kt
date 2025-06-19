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

public val FluentIcons.Light.Window: ImageVector
    get() {
        if (_Window != null) {
            return _Window!!
        }
        _Window = ImageVector.Builder(
            name = "Light.Window",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(29f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
                close()
                moveTo(4f, 24.5f)
                verticalLineTo(11f)
                horizontalLineTo(28f)
                verticalLineTo(24.5f)
                curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
                close()
            }
        }.build()

        return _Window!!
    }

@Suppress("ObjectPropertyName")
private var _Window: ImageVector? = null

@Preview
@Composable
private fun WindowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Window, contentDescription = null)
    }
}
