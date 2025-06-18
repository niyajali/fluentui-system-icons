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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.Text: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Text",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineTo(25.5f)
            curveTo(25.776f, 4f, 26f, 4.224f, 26f, 4.5f)
            verticalLineTo(8.5f)
            curveTo(26f, 8.776f, 25.776f, 9f, 25.5f, 9f)
            curveTo(25.224f, 9f, 25f, 8.776f, 25f, 8.5f)
            verticalLineTo(5f)
            horizontalLineTo(16.5f)
            verticalLineTo(27f)
            horizontalLineTo(19.5f)
            curveTo(19.776f, 27f, 20f, 27.224f, 20f, 27.5f)
            curveTo(20f, 27.776f, 19.776f, 28f, 19.5f, 28f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 28f, 12f, 27.776f, 12f, 27.5f)
            curveTo(12f, 27.224f, 12.224f, 27f, 12.5f, 27f)
            horizontalLineTo(15.5f)
            verticalLineTo(5f)
            horizontalLineTo(7f)
            verticalLineTo(8.5f)
            curveTo(7f, 8.776f, 6.776f, 9f, 6.5f, 9f)
            curveTo(6.224f, 9f, 6f, 8.776f, 6f, 8.5f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Text, contentDescription = null)
    }
}
