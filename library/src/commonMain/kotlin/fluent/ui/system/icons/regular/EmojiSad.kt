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

public val FluentUi.Regular.EmojiSad: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EmojiSad",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 1.998f)
            curveTo(17.524f, 1.998f, 22.002f, 6.476f, 22.002f, 12f)
            curveTo(22.002f, 17.523f, 17.524f, 22.001f, 12f, 22.001f)
            curveTo(6.476f, 22.001f, 1.999f, 17.523f, 1.999f, 12f)
            curveTo(1.999f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveTo(12f, 3.498f)
            curveTo(7.305f, 3.498f, 3.499f, 7.304f, 3.499f, 12f)
            curveTo(3.499f, 16.695f, 7.305f, 20.501f, 12f, 20.501f)
            curveTo(16.695f, 20.501f, 20.502f, 16.695f, 20.502f, 12f)
            curveTo(20.502f, 7.304f, 16.695f, 3.498f, 12f, 3.498f)
            close()
            moveTo(12f, 13.497f)
            curveTo(13.631f, 13.497f, 15.16f, 14.152f, 16.281f, 15.292f)
            curveTo(16.571f, 15.588f, 16.567f, 16.063f, 16.272f, 16.353f)
            curveTo(15.976f, 16.643f, 15.502f, 16.639f, 15.211f, 16.344f)
            curveTo(14.37f, 15.487f, 13.225f, 14.997f, 12f, 14.997f)
            curveTo(10.773f, 14.997f, 9.625f, 15.49f, 8.784f, 16.349f)
            curveTo(8.494f, 16.645f, 8.019f, 16.65f, 7.723f, 16.361f)
            curveTo(7.427f, 16.071f, 7.422f, 15.596f, 7.712f, 15.3f)
            curveTo(8.833f, 14.155f, 10.365f, 13.497f, 12f, 13.497f)
            close()
            moveTo(9.001f, 8.75f)
            curveTo(9.691f, 8.75f, 10.25f, 9.31f, 10.25f, 10f)
            curveTo(10.25f, 10.689f, 9.691f, 11.249f, 9.001f, 11.249f)
            curveTo(8.311f, 11.249f, 7.751f, 10.689f, 7.751f, 10f)
            curveTo(7.751f, 9.31f, 8.311f, 8.75f, 9.001f, 8.75f)
            close()
            moveTo(15f, 8.75f)
            curveTo(15.691f, 8.75f, 16.25f, 9.31f, 16.25f, 10f)
            curveTo(16.25f, 10.689f, 15.691f, 11.249f, 15f, 11.249f)
            curveTo(14.311f, 11.249f, 13.751f, 10.689f, 13.751f, 10f)
            curveTo(13.751f, 9.31f, 14.311f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiSadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EmojiSad, contentDescription = null)
    }
}
