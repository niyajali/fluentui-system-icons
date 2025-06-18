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

public val FluentUi.Colored.Send: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Send",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(1.494f, 12f),
                radius = 8.006f
            )
        ) {
            moveTo(5.57f, 12f)
            lineTo(4.446f, 9f)
            lineTo(13.589f, 11.024f)
            curveTo(14.634f, 11.255f, 14.634f, 12.745f, 13.589f, 12.976f)
            lineTo(4.446f, 15f)
            lineTo(5.57f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(2.246f, -5.676f),
                end = Offset(18.952f, 16.518f)
            )
        ) {
            moveTo(12.815f, 12.197f)
            lineTo(5.283f, 13.453f)
            curveTo(5.107f, 13.482f, 4.96f, 13.603f, 4.897f, 13.771f)
            lineTo(2.299f, 20.728f)
            curveTo(2.051f, 21.368f, 2.72f, 21.978f, 3.334f, 21.671f)
            lineTo(21.334f, 12.671f)
            curveTo(21.886f, 12.395f, 21.886f, 11.606f, 21.334f, 11.329f)
            lineTo(3.334f, 2.329f)
            curveTo(2.72f, 2.023f, 2.051f, 2.633f, 2.299f, 3.272f)
            lineTo(4.897f, 10.229f)
            curveTo(4.96f, 10.397f, 5.107f, 10.518f, 5.283f, 10.548f)
            lineTo(12.815f, 11.803f)
            curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
            curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0x00DCF8FF),
                    0.769f to Color(0xB2FF6CE8)
                ),
                start = Offset(11.997f, 7.505f),
                end = Offset(17.07f, 21.229f)
            )
        ) {
            moveTo(12.815f, 12.197f)
            lineTo(5.283f, 13.453f)
            curveTo(5.107f, 13.482f, 4.96f, 13.603f, 4.897f, 13.771f)
            lineTo(2.299f, 20.728f)
            curveTo(2.051f, 21.368f, 2.72f, 21.978f, 3.334f, 21.671f)
            lineTo(21.334f, 12.671f)
            curveTo(21.886f, 12.395f, 21.886f, 11.606f, 21.334f, 11.329f)
            lineTo(3.334f, 2.329f)
            curveTo(2.72f, 2.023f, 2.051f, 2.633f, 2.299f, 3.272f)
            lineTo(4.897f, 10.229f)
            curveTo(4.96f, 10.397f, 5.107f, 10.518f, 5.283f, 10.548f)
            lineTo(12.815f, 11.803f)
            curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
            curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Send, contentDescription = null)
    }
}
