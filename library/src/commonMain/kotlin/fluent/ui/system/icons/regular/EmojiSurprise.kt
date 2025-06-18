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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.EmojiSurprise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiSurprise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2.004f)
            curveTo(17.523f, 2.004f, 22f, 6.481f, 22f, 12.004f)
            curveTo(22f, 17.527f, 17.523f, 22.004f, 12f, 22.004f)
            curveTo(6.477f, 22.004f, 2f, 17.527f, 2f, 12.004f)
            curveTo(2f, 6.481f, 6.477f, 2.004f, 12f, 2.004f)
            close()
            moveTo(12f, 3.504f)
            curveTo(7.306f, 3.504f, 3.5f, 7.309f, 3.5f, 12.004f)
            curveTo(3.5f, 16.698f, 7.306f, 20.504f, 12f, 20.504f)
            curveTo(16.694f, 20.504f, 20.5f, 16.698f, 20.5f, 12.004f)
            curveTo(20.5f, 7.309f, 16.694f, 3.504f, 12f, 3.504f)
            close()
            moveTo(12f, 12.999f)
            curveTo(13.243f, 12.999f, 14.25f, 14.007f, 14.25f, 15.249f)
            curveTo(14.25f, 16.492f, 13.243f, 17.499f, 12f, 17.499f)
            curveTo(10.757f, 17.499f, 9.75f, 16.492f, 9.75f, 15.249f)
            curveTo(9.75f, 14.007f, 10.757f, 12.999f, 12f, 12.999f)
            close()
            moveTo(9f, 8.75f)
            curveTo(9.69f, 8.75f, 10.25f, 9.31f, 10.25f, 10f)
            curveTo(10.25f, 10.69f, 9.69f, 11.249f, 9f, 11.249f)
            curveTo(8.31f, 11.249f, 7.751f, 10.69f, 7.751f, 10f)
            curveTo(7.751f, 9.31f, 8.31f, 8.75f, 9f, 8.75f)
            close()
            moveTo(15f, 8.75f)
            curveTo(15.69f, 8.75f, 16.25f, 9.31f, 16.25f, 10f)
            curveTo(16.25f, 10.69f, 15.69f, 11.249f, 15f, 11.249f)
            curveTo(14.311f, 11.249f, 13.751f, 10.69f, 13.751f, 10f)
            curveTo(13.751f, 9.31f, 14.311f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiSurprisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EmojiSurprise, contentDescription = null)
    }
}
