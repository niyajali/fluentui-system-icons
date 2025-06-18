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

public val FluentUi.Regular.Snooze: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Snooze",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.244f, 13.004f)
            curveTo(8.822f, 13.004f, 9.17f, 13.622f, 8.906f, 14.108f)
            lineTo(8.849f, 14.197f)
            lineTo(4.227f, 20.499f)
            lineTo(8.244f, 20.5f)
            curveTo(8.624f, 20.5f, 8.938f, 20.782f, 8.987f, 21.148f)
            lineTo(8.994f, 21.25f)
            curveTo(8.994f, 21.629f, 8.712f, 21.943f, 8.346f, 21.993f)
            lineTo(8.244f, 22f)
            horizontalLineTo(2.747f)
            curveTo(2.169f, 22f, 1.822f, 21.381f, 2.086f, 20.895f)
            lineTo(2.143f, 20.806f)
            lineTo(6.764f, 14.503f)
            lineTo(2.748f, 14.504f)
            curveTo(2.369f, 14.504f, 2.055f, 14.222f, 2.005f, 13.856f)
            lineTo(1.998f, 13.754f)
            curveTo(1.998f, 13.374f, 2.281f, 13.06f, 2.647f, 13.011f)
            lineTo(2.748f, 13.004f)
            horizontalLineTo(8.244f)
            close()
            moveTo(21.252f, 2.001f)
            curveTo(21.851f, 2.001f, 22.195f, 2.66f, 21.89f, 3.145f)
            lineTo(21.83f, 3.229f)
            lineTo(13.339f, 13.497f)
            lineTo(21.252f, 13.497f)
            curveTo(21.631f, 13.497f, 21.945f, 13.78f, 21.995f, 14.146f)
            lineTo(22.002f, 14.247f)
            curveTo(22.002f, 14.627f, 21.72f, 14.941f, 21.354f, 14.991f)
            lineTo(21.252f, 14.997f)
            horizontalLineTo(11.747f)
            curveTo(11.148f, 14.997f, 10.805f, 14.338f, 11.109f, 13.853f)
            lineTo(11.169f, 13.769f)
            lineTo(19.659f, 3.5f)
            lineTo(11.747f, 3.501f)
            curveTo(11.368f, 3.501f, 11.054f, 3.219f, 11.004f, 2.853f)
            lineTo(10.997f, 2.751f)
            curveTo(10.997f, 2.371f, 11.28f, 2.057f, 11.646f, 2.008f)
            lineTo(11.747f, 2.001f)
            horizontalLineTo(21.252f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SnoozePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Snooze, contentDescription = null)
    }
}
