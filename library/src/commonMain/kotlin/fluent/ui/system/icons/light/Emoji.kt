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

public val FluentUi.Light.Emoji: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Emoji",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.923f, 19.733f)
            curveTo(9.775f, 19.5f, 9.466f, 19.43f, 9.233f, 19.577f)
            curveTo(9f, 19.725f, 8.93f, 20.034f, 9.077f, 20.267f)
            curveTo(10.5f, 22.519f, 13.161f, 24f, 16f, 24f)
            curveTo(18.839f, 24f, 21.5f, 22.519f, 22.923f, 20.267f)
            curveTo(23.07f, 20.034f, 23f, 19.725f, 22.767f, 19.577f)
            curveTo(22.534f, 19.43f, 22.225f, 19.5f, 22.077f, 19.733f)
            curveTo(20.843f, 21.688f, 18.504f, 23f, 16f, 23f)
            curveTo(13.496f, 23f, 11.158f, 21.688f, 9.923f, 19.733f)
            close()
            moveTo(13.5f, 13f)
            curveTo(13.5f, 13.828f, 12.828f, 14.5f, 12f, 14.5f)
            curveTo(11.172f, 14.5f, 10.5f, 13.828f, 10.5f, 13f)
            curveTo(10.5f, 12.172f, 11.172f, 11.5f, 12f, 11.5f)
            curveTo(12.828f, 11.5f, 13.5f, 12.172f, 13.5f, 13f)
            close()
            moveTo(20f, 14.5f)
            curveTo(20.828f, 14.5f, 21.5f, 13.828f, 21.5f, 13f)
            curveTo(21.5f, 12.172f, 20.828f, 11.5f, 20f, 11.5f)
            curveTo(19.172f, 11.5f, 18.5f, 12.172f, 18.5f, 13f)
            curveTo(18.5f, 13.828f, 19.172f, 14.5f, 20f, 14.5f)
            close()
            moveTo(16f, 2f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            curveTo(2f, 23.732f, 8.268f, 30f, 16f, 30f)
            curveTo(23.732f, 30f, 30f, 23.732f, 30f, 16f)
            curveTo(30f, 8.268f, 23.732f, 2f, 16f, 2f)
            close()
            moveTo(3f, 16f)
            curveTo(3f, 8.82f, 8.82f, 3f, 16f, 3f)
            curveTo(23.18f, 3f, 29f, 8.82f, 29f, 16f)
            curveTo(29f, 23.18f, 23.18f, 29f, 16f, 29f)
            curveTo(8.82f, 29f, 3f, 23.18f, 3f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Emoji, contentDescription = null)
    }
}
