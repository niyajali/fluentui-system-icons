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

public val FluentIcons.Light.Add: ImageVector
    get() {
        if (_Add != null) {
            return _Add!!
        }
        _Add = ImageVector.Builder(
            name = "Light.Add",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.5f, 3.5f)
                curveTo(16.5f, 3.224f, 16.276f, 3f, 16f, 3f)
                curveTo(15.724f, 3f, 15.5f, 3.224f, 15.5f, 3.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 15.5f, 3f, 15.724f, 3f, 16f)
                curveTo(3f, 16.276f, 3.224f, 16.5f, 3.5f, 16.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(28.5f)
                curveTo(15.5f, 28.776f, 15.724f, 29f, 16f, 29f)
                curveTo(16.276f, 29f, 16.5f, 28.776f, 16.5f, 28.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(28.5f)
                curveTo(28.776f, 16.5f, 29f, 16.276f, 29f, 16f)
                curveTo(29f, 15.724f, 28.776f, 15.5f, 28.5f, 15.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()

        return _Add!!
    }

@Suppress("ObjectPropertyName")
private var _Add: ImageVector? = null

@Preview
@Composable
private fun AddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Add, contentDescription = null)
    }
}
