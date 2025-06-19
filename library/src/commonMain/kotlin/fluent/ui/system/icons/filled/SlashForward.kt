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

public val FluentIcons.Filled.SlashForward: ImageVector
    get() {
        if (_SlashForward != null) {
            return _SlashForward!!
        }
        _SlashForward = ImageVector.Builder(
            name = "Filled.SlashForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.316f, 2.051f)
                curveTo(15.84f, 2.226f, 16.124f, 2.792f, 15.949f, 3.316f)
                lineTo(9.949f, 21.316f)
                curveTo(9.774f, 21.84f, 9.208f, 22.123f, 8.684f, 21.949f)
                curveTo(8.16f, 21.774f, 7.877f, 21.208f, 8.052f, 20.684f)
                lineTo(14.052f, 2.684f)
                curveTo(14.226f, 2.16f, 14.793f, 1.877f, 15.316f, 2.051f)
                close()
            }
        }.build()

        return _SlashForward!!
    }

@Suppress("ObjectPropertyName")
private var _SlashForward: ImageVector? = null

@Preview
@Composable
private fun SlashForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlashForward, contentDescription = null)
    }
}
