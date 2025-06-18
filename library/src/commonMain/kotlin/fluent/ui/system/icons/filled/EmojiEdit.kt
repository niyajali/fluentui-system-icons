package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.EmojiEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 1.998f)
            curveTo(17.271f, 1.998f, 21.589f, 6.075f, 21.973f, 11.248f)
            curveTo(20.782f, 10.756f, 19.361f, 10.993f, 18.393f, 11.961f)
            lineTo(15.757f, 14.597f)
            curveTo(15.673f, 14.644f, 15.597f, 14.707f, 15.535f, 14.787f)
            curveTo(15.481f, 14.855f, 15.425f, 14.922f, 15.367f, 14.987f)
            lineTo(14.984f, 15.37f)
            curveTo(14.173f, 16.089f, 13.121f, 16.501f, 12f, 16.501f)
            curveTo(10.601f, 16.501f, 9.31f, 15.861f, 8.461f, 14.783f)
            curveTo(8.205f, 14.458f, 7.733f, 14.402f, 7.408f, 14.658f)
            curveTo(7.083f, 14.914f, 7.027f, 15.386f, 7.283f, 15.711f)
            curveTo(8.414f, 17.146f, 10.137f, 18.001f, 12f, 18.001f)
            curveTo(12.124f, 18.001f, 12.247f, 17.997f, 12.37f, 17.99f)
            curveTo(11.961f, 18.44f, 11.669f, 18.984f, 11.521f, 19.576f)
            lineTo(11.063f, 21.407f)
            curveTo(11.017f, 21.591f, 10.997f, 21.774f, 10.999f, 21.952f)
            curveTo(5.945f, 21.45f, 1.998f, 17.186f, 1.998f, 12f)
            curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveTo(9f, 8.75f)
            curveTo(8.31f, 8.75f, 7.751f, 9.31f, 7.751f, 10f)
            curveTo(7.751f, 10.689f, 8.31f, 11.249f, 9f, 11.249f)
            curveTo(9.69f, 11.249f, 10.249f, 10.689f, 10.249f, 10f)
            curveTo(10.249f, 9.31f, 9.69f, 8.75f, 9f, 8.75f)
            close()
            moveTo(15f, 8.75f)
            curveTo(14.31f, 8.75f, 13.751f, 9.31f, 13.751f, 10f)
            curveTo(13.751f, 10.689f, 14.31f, 11.249f, 15f, 11.249f)
            curveTo(15.69f, 11.249f, 16.249f, 10.689f, 16.249f, 10f)
            curveTo(16.249f, 9.31f, 15.69f, 8.75f, 15f, 8.75f)
            close()
            moveTo(19.1f, 12.668f)
            lineTo(13.197f, 18.571f)
            curveTo(12.853f, 18.915f, 12.609f, 19.346f, 12.491f, 19.818f)
            lineTo(12.033f, 21.649f)
            curveTo(11.834f, 22.445f, 12.556f, 23.166f, 13.352f, 22.967f)
            lineTo(15.182f, 22.51f)
            curveTo(15.655f, 22.392f, 16.086f, 22.147f, 16.43f, 21.803f)
            lineTo(22.332f, 15.901f)
            curveTo(23.225f, 15.008f, 23.225f, 13.561f, 22.332f, 12.668f)
            curveTo(21.44f, 11.776f, 19.993f, 11.776f, 19.1f, 12.668f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EmojiEdit, contentDescription = null)
    }
}
