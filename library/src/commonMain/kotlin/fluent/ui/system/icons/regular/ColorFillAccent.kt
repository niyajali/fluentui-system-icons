package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ColorFillAccent: ImageVector
    get() {
        if (_ColorFillAccent != null) {
            return _ColorFillAccent!!
        }
        _ColorFillAccent = ImageVector.Builder(
            name = "Regular.ColorFillAccent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.052f, 15f)
                curveTo(13.325f, 16.609f, 14.632f, 18f, 16.5f, 18f)
                curveTo(18.342f, 18f, 19.64f, 16.646f, 19.936f, 15.064f)
                curveTo(20.552f, 15.251f, 21f, 15.823f, 21f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(21f, 20.328f, 20.328f, 21f, 19.5f, 21f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 21f, 3f, 20.328f, 3f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 15.672f, 3.672f, 15f, 4.5f, 15f)
                lineTo(7.59f, 15f)
                curveTo(8.734f, 16.047f, 10.493f, 16.047f, 11.638f, 15f)
                lineTo(13.052f, 15f)
                close()
            }
        }.build()

        return _ColorFillAccent!!
    }

@Suppress("ObjectPropertyName")
private var _ColorFillAccent: ImageVector? = null

@Preview
@Composable
private fun ColorFillAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColorFillAccent, contentDescription = null)
    }
}
