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

public val FluentIcons.Filled.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Filled.Map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.5f, 4.358f)
                verticalLineTo(16.823f)
                lineTo(4.18f, 19.861f)
                curveTo(3.713f, 20.19f, 3.079f, 19.895f, 3.006f, 19.352f)
                lineTo(2.999f, 19.248f)
                verticalLineTo(8.615f)
                curveTo(2.999f, 8.406f, 3.086f, 8.208f, 3.237f, 8.067f)
                lineTo(3.318f, 8.002f)
                lineTo(8.5f, 4.358f)
                close()
                moveTo(20.994f, 4.648f)
                lineTo(21.001f, 4.752f)
                verticalLineTo(15.385f)
                curveTo(21.001f, 15.594f, 20.914f, 15.792f, 20.763f, 15.933f)
                lineTo(20.683f, 15.998f)
                lineTo(15.5f, 19.64f)
                verticalLineTo(7.174f)
                lineTo(19.82f, 4.139f)
                curveTo(20.288f, 3.81f, 20.921f, 4.105f, 20.994f, 4.648f)
                close()
                moveTo(10f, 4.359f)
                lineTo(14f, 7.171f)
                verticalLineTo(19.638f)
                lineTo(10f, 16.824f)
                verticalLineTo(4.359f)
                close()
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null

@Preview
@Composable
private fun MapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Map, contentDescription = null)
    }
}
