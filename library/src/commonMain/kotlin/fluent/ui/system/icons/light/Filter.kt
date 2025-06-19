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

public val FluentIcons.Light.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Light.Filter",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 8.5f)
                curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
                horizontalLineTo(28.5f)
                curveTo(28.776f, 8f, 29f, 8.224f, 29f, 8.5f)
                curveTo(29f, 8.776f, 28.776f, 9f, 28.5f, 9f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
                close()
                moveTo(7f, 15.5f)
                curveTo(7f, 15.224f, 7.224f, 15f, 7.5f, 15f)
                horizontalLineTo(24.5f)
                curveTo(24.776f, 15f, 25f, 15.224f, 25f, 15.5f)
                curveTo(25f, 15.776f, 24.776f, 16f, 24.5f, 16f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 16f, 7f, 15.776f, 7f, 15.5f)
                close()
                moveTo(11.5f, 22f)
                curveTo(11.224f, 22f, 11f, 22.224f, 11f, 22.5f)
                curveTo(11f, 22.776f, 11.224f, 23f, 11.5f, 23f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 23f, 21f, 22.776f, 21f, 22.5f)
                curveTo(21f, 22.224f, 20.776f, 22f, 20.5f, 22f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null

@Preview
@Composable
private fun FilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Filter, contentDescription = null)
    }
}
