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

public val FluentIcons.Filled.TextItalic: ImageVector
    get() {
        if (_TextItalic != null) {
            return _TextItalic!!
        }
        _TextItalic = ImageVector.Builder(
            name = "Filled.TextItalic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.431f, 5.366f)
                curveTo(12.633f, 4.852f, 12.38f, 4.271f, 11.866f, 4.07f)
                curveTo(11.352f, 3.868f, 10.771f, 4.121f, 10.569f, 4.635f)
                lineTo(5.07f, 18.635f)
                curveTo(4.868f, 19.149f, 5.121f, 19.729f, 5.635f, 19.931f)
                curveTo(6.149f, 20.133f, 6.729f, 19.88f, 6.931f, 19.366f)
                lineTo(9.437f, 12.987f)
                lineTo(15.246f, 19.657f)
                curveTo(15.609f, 20.073f, 16.241f, 20.117f, 16.657f, 19.754f)
                curveTo(17.073f, 19.392f, 17.117f, 18.76f, 16.754f, 18.344f)
                lineTo(10.765f, 11.467f)
                lineTo(19.54f, 5.842f)
                curveTo(20.005f, 5.544f, 20.14f, 4.926f, 19.842f, 4.461f)
                curveTo(19.544f, 3.996f, 18.926f, 3.86f, 18.461f, 4.158f)
                lineTo(11.035f, 8.918f)
                lineTo(12.431f, 5.366f)
                close()
            }
        }.build()

        return _TextItalic!!
    }

@Suppress("ObjectPropertyName")
private var _TextItalic: ImageVector? = null

@Preview
@Composable
private fun TextItalicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextItalic, contentDescription = null)
    }
}
