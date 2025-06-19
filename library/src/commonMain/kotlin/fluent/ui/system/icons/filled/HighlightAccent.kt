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

public val FluentIcons.Filled.HighlightAccent: ImageVector
    get() {
        if (_HighlightAccent != null) {
            return _HighlightAccent!!
        }
        _HighlightAccent = ImageVector.Builder(
            name = "Filled.HighlightAccent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.003f, 4f)
                lineTo(20f, 7.75f)
                lineTo(19.993f, 7.852f)
                curveTo(19.944f, 8.206f, 19.647f, 8.482f, 19.283f, 8.5f)
                horizontalLineTo(4.737f)
                lineTo(4.648f, 8.494f)
                curveTo(4.282f, 8.444f, 4f, 8.131f, 4f, 7.751f)
                lineTo(4f, 4f)
                horizontalLineTo(20.003f)
                close()
                moveTo(15.507f, 13.5f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 21f)
                lineTo(15.076f, 17.894f)
                curveTo(15.306f, 17.786f, 15.464f, 17.569f, 15.5f, 17.322f)
                lineTo(15.508f, 17.215f)
                lineTo(15.507f, 13.5f)
                close()
            }
        }.build()

        return _HighlightAccent!!
    }

@Suppress("ObjectPropertyName")
private var _HighlightAccent: ImageVector? = null

@Preview
@Composable
private fun HighlightAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HighlightAccent, contentDescription = null)
    }
}
