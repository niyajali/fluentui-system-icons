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

public val FluentIcons.Filled.Drop: ImageVector
    get() {
        if (_Drop != null) {
            return _Drop!!
        }
        _Drop = ImageVector.Builder(
            name = "Filled.Drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.47f, 2.22f)
                curveTo(11.763f, 1.927f, 12.237f, 1.927f, 12.53f, 2.22f)
                curveTo(12.933f, 2.623f, 14.529f, 4.347f, 16.029f, 6.582f)
                curveTo(17.508f, 8.785f, 19f, 11.635f, 19f, 14.25f)
                curveTo(19f, 16.774f, 18.254f, 18.729f, 16.956f, 20.056f)
                curveTo(15.659f, 21.381f, 13.889f, 22f, 12f, 22f)
                curveTo(10.111f, 22f, 8.341f, 21.381f, 7.044f, 20.056f)
                curveTo(5.746f, 18.729f, 5f, 16.774f, 5f, 14.25f)
                curveTo(5f, 11.635f, 6.492f, 8.785f, 7.971f, 6.582f)
                curveTo(9.471f, 4.347f, 11.067f, 2.623f, 11.47f, 2.22f)
                close()
            }
        }.build()

        return _Drop!!
    }

@Suppress("ObjectPropertyName")
private var _Drop: ImageVector? = null

@Preview
@Composable
private fun DropPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Drop, contentDescription = null)
    }
}
