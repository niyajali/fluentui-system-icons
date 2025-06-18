package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Gauge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Gauge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF4F4F4),
                    1f to Color(0xFFCBCBCB)
                ),
                start = Offset(9.143f, 2f),
                end = Offset(16.805f, 20.922f)
            )
        ) {
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    0.501f to Color(0xFFFF921F),
                    1f to Color(0xFFE82C41)
                ),
                center = Offset(4.46f, 17.317f),
                radius = 15.66f
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveTo(8.227f, 16.359f, 8.227f, 16.834f, 7.934f, 17.126f)
            curveTo(7.641f, 17.419f, 7.166f, 17.419f, 6.873f, 17.126f)
            curveTo(4.042f, 14.295f, 4.042f, 9.705f, 6.873f, 6.873f)
            curveTo(8.718f, 5.029f, 11.31f, 4.387f, 13.672f, 4.945f)
            curveTo(14.075f, 5.04f, 14.325f, 5.444f, 14.23f, 5.847f)
            curveTo(14.135f, 6.25f, 13.731f, 6.5f, 13.328f, 6.404f)
            curveTo(11.45f, 5.961f, 9.396f, 6.472f, 7.934f, 7.934f)
            curveTo(5.689f, 10.18f, 5.689f, 13.82f, 7.934f, 16.066f)
            close()
            moveTo(17.888f, 9.142f)
            curveTo(18.279f, 9.005f, 18.707f, 9.211f, 18.844f, 9.602f)
            curveTo(19.733f, 12.146f, 19.162f, 15.091f, 17.126f, 17.126f)
            curveTo(16.834f, 17.419f, 16.359f, 17.419f, 16.066f, 17.126f)
            curveTo(15.773f, 16.834f, 15.773f, 16.359f, 16.066f, 16.066f)
            curveTo(17.679f, 14.453f, 18.134f, 12.118f, 17.428f, 10.097f)
            curveTo(17.291f, 9.706f, 17.497f, 9.278f, 17.888f, 9.142f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0042B870),
                    0.58f to Color(0xFF42B870)
                ),
                start = Offset(8.5f, 14f),
                end = Offset(6.179f, 16.715f)
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveTo(8.227f, 16.359f, 8.227f, 16.834f, 7.934f, 17.126f)
            curveTo(7.641f, 17.419f, 7.166f, 17.419f, 6.873f, 17.126f)
            curveTo(4.042f, 14.295f, 4.042f, 9.705f, 6.873f, 6.873f)
            curveTo(8.718f, 5.029f, 11.31f, 4.387f, 13.672f, 4.945f)
            curveTo(14.075f, 5.04f, 14.325f, 5.444f, 14.23f, 5.847f)
            curveTo(14.135f, 6.25f, 13.731f, 6.5f, 13.328f, 6.404f)
            curveTo(11.45f, 5.961f, 9.396f, 6.472f, 7.934f, 7.934f)
            curveTo(5.689f, 10.18f, 5.689f, 13.82f, 7.934f, 16.066f)
            close()
            moveTo(17.888f, 9.142f)
            curveTo(18.279f, 9.005f, 18.707f, 9.211f, 18.844f, 9.602f)
            curveTo(19.733f, 12.146f, 19.162f, 15.091f, 17.126f, 17.126f)
            curveTo(16.834f, 17.419f, 16.359f, 17.419f, 16.066f, 17.126f)
            curveTo(15.773f, 16.834f, 15.773f, 16.359f, 16.066f, 16.066f)
            curveTo(17.679f, 14.453f, 18.134f, 12.118f, 17.428f, 10.097f)
            curveTo(17.291f, 9.706f, 17.497f, 9.278f, 17.888f, 9.142f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00E82C41),
                    0.563f to Color(0xFFE82C41)
                ),
                start = Offset(15.48f, 14.395f),
                end = Offset(17.818f, 16.714f)
            )
        ) {
            moveTo(7.934f, 16.066f)
            curveTo(8.227f, 16.359f, 8.227f, 16.834f, 7.934f, 17.126f)
            curveTo(7.641f, 17.419f, 7.166f, 17.419f, 6.873f, 17.126f)
            curveTo(4.042f, 14.295f, 4.042f, 9.705f, 6.873f, 6.873f)
            curveTo(8.718f, 5.029f, 11.31f, 4.387f, 13.672f, 4.945f)
            curveTo(14.075f, 5.04f, 14.325f, 5.444f, 14.23f, 5.847f)
            curveTo(14.135f, 6.25f, 13.731f, 6.5f, 13.328f, 6.404f)
            curveTo(11.45f, 5.961f, 9.396f, 6.472f, 7.934f, 7.934f)
            curveTo(5.689f, 10.18f, 5.689f, 13.82f, 7.934f, 16.066f)
            close()
            moveTo(17.888f, 9.142f)
            curveTo(18.279f, 9.005f, 18.707f, 9.211f, 18.844f, 9.602f)
            curveTo(19.733f, 12.146f, 19.162f, 15.091f, 17.126f, 17.126f)
            curveTo(16.834f, 17.419f, 16.359f, 17.419f, 16.066f, 17.126f)
            curveTo(15.773f, 16.834f, 15.773f, 16.359f, 16.066f, 16.066f)
            curveTo(17.679f, 14.453f, 18.134f, 12.118f, 17.428f, 10.097f)
            curveTo(17.291f, 9.706f, 17.497f, 9.278f, 17.888f, 9.142f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(10.023f, 6.517f),
                end = Offset(15.173f, 13.14f)
            )
        ) {
            moveTo(15.879f, 6.667f)
            curveTo(16.106f, 6.473f, 16.439f, 6.466f, 16.674f, 6.652f)
            curveTo(16.908f, 6.837f, 16.978f, 7.163f, 16.841f, 7.428f)
            lineTo(16.712f, 7.679f)
            curveTo(16.63f, 7.838f, 16.511f, 8.066f, 16.368f, 8.342f)
            curveTo(16.082f, 8.893f, 15.696f, 9.633f, 15.296f, 10.391f)
            curveTo(14.896f, 11.149f, 14.482f, 11.925f, 14.14f, 12.548f)
            curveTo(13.969f, 12.859f, 13.814f, 13.134f, 13.688f, 13.351f)
            curveTo(13.571f, 13.552f, 13.455f, 13.742f, 13.369f, 13.851f)
            curveTo(12.726f, 14.663f, 11.547f, 14.8f, 10.735f, 14.158f)
            curveTo(9.923f, 13.515f, 9.786f, 12.336f, 10.428f, 11.524f)
            curveTo(10.514f, 11.415f, 10.672f, 11.259f, 10.841f, 11.099f)
            curveTo(11.023f, 10.926f, 11.255f, 10.712f, 11.519f, 10.474f)
            curveTo(12.046f, 9.998f, 12.707f, 9.416f, 13.352f, 8.853f)
            curveTo(13.997f, 8.29f, 14.629f, 7.743f, 15.099f, 7.338f)
            curveTo(15.335f, 7.135f, 15.529f, 6.967f, 15.666f, 6.851f)
            lineTo(15.879f, 6.667f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GaugePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Gauge, contentDescription = null)
    }
}
