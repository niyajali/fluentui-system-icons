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

public val FluentIcons.Regular.SlashForward: ImageVector
    get() {
        if (_SlashForward != null) {
            return _SlashForward!!
        }
        _SlashForward = ImageVector.Builder(
            name = "Regular.SlashForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.499f, 2.042f)
                curveTo(15.89f, 2.18f, 16.095f, 2.608f, 15.958f, 2.999f)
                lineTo(9.458f, 21.499f)
                curveTo(9.32f, 21.889f, 8.892f, 22.095f, 8.502f, 21.958f)
                curveTo(8.111f, 21.82f, 7.905f, 21.392f, 8.043f, 21.001f)
                lineTo(14.543f, 2.501f)
                curveTo(14.68f, 2.111f, 15.108f, 1.905f, 15.499f, 2.042f)
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
        Image(imageVector = FluentIcons.Regular.SlashForward, contentDescription = null)
    }
}
