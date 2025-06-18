package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Sport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Sport",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.978f to Color(0xFFFF921F)
                ),
                center = Offset(16.154f, 26.333f),
                radius = 27.957f
            )
        ) {
            moveTo(14f, 10f)
            moveToRelative(-8f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.588f to Color(0xFFAA1D2D),
                    0.931f to Color(0x19EB4824)
                ),
                center = Offset(8f, 16f),
                radius = 9.428f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(14f, 10f)
            moveToRelative(-8f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.713f to Color(0xFF8E250B),
                    0.903f to Color(0x008E250B)
                ),
                start = Offset(20.05f, 4.194f),
                end = Offset(11.576f, 12.667f)
            ),
            fillAlpha = 0.6f,
            strokeAlpha = 0.6f
        ) {
            moveTo(9.468f, 3.407f)
            lineTo(14.5f, 8.439f)
            lineTo(15.262f, 7.678f)
            curveTo(14.781f, 6.99f, 14.5f, 6.153f, 14.5f, 5.25f)
            curveTo(14.5f, 4.054f, 14.994f, 2.973f, 15.79f, 2.201f)
            curveTo(16.386f, 2.337f, 16.958f, 2.54f, 17.496f, 2.802f)
            curveTo(16.608f, 3.258f, 16f, 4.183f, 16f, 5.25f)
            curveTo(16f, 5.737f, 16.127f, 6.194f, 16.349f, 6.591f)
            lineTo(19.102f, 3.837f)
            curveTo(19.488f, 4.157f, 19.843f, 4.512f, 20.163f, 4.898f)
            lineTo(17.409f, 7.651f)
            curveTo(17.806f, 7.873f, 18.263f, 8f, 18.75f, 8f)
            curveTo(19.817f, 8f, 20.742f, 7.392f, 21.198f, 6.504f)
            curveTo(21.46f, 7.042f, 21.663f, 7.614f, 21.799f, 8.21f)
            curveTo(21.027f, 9.006f, 19.946f, 9.5f, 18.75f, 9.5f)
            curveTo(17.847f, 9.5f, 17.01f, 9.218f, 16.322f, 8.738f)
            lineTo(15.561f, 9.5f)
            lineTo(20.593f, 14.532f)
            curveTo(20.307f, 14.947f, 19.983f, 15.334f, 19.626f, 15.687f)
            lineTo(14.5f, 10.561f)
            lineTo(10.53f, 14.53f)
            lineTo(9.47f, 13.469f)
            lineTo(13.439f, 9.5f)
            lineTo(8.313f, 4.373f)
            curveTo(8.666f, 4.016f, 9.053f, 3.692f, 9.468f, 3.407f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.24f to Color(0xFFAE5606),
                    1f to Color(0xFF944600)
                ),
                center = Offset(3.182f, 9.591f),
                radius = 16.9f
            )
        ) {
            moveTo(4.25f, 9f)
            curveTo(3.007f, 9f, 2f, 10.007f, 2f, 11.25f)
            verticalLineTo(13.25f)
            curveTo(2f, 18.083f, 5.918f, 22f, 10.75f, 22f)
            horizontalLineTo(12.75f)
            curveTo(13.993f, 22f, 15f, 20.993f, 15f, 19.75f)
            verticalLineTo(17.75f)
            curveTo(15f, 12.917f, 11.083f, 9f, 6.25f, 9f)
            horizontalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.626f to Color(0x00FFA43D),
                    0.927f to Color(0xFFFFA43D)
                ),
                center = Offset(6.748f, 25.441f),
                radius = 19.237f
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(4.25f, 9f)
            curveTo(3.007f, 9f, 2f, 10.007f, 2f, 11.25f)
            verticalLineTo(13.25f)
            curveTo(2f, 18.083f, 5.918f, 22f, 10.75f, 22f)
            horizontalLineTo(12.75f)
            curveTo(13.993f, 22f, 15f, 20.993f, 15f, 19.75f)
            verticalLineTo(17.75f)
            curveTo(15f, 12.917f, 11.083f, 9f, 6.25f, 9f)
            horizontalLineTo(4.25f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFC470))) {
            moveTo(7.78f, 13.72f)
            curveTo(7.487f, 13.427f, 7.013f, 13.427f, 6.72f, 13.72f)
            curveTo(6.427f, 14.013f, 6.427f, 14.487f, 6.72f, 14.78f)
            lineTo(9.22f, 17.28f)
            curveTo(9.513f, 17.573f, 9.987f, 17.573f, 10.28f, 17.28f)
            curveTo(10.573f, 16.987f, 10.573f, 16.513f, 10.28f, 16.22f)
            lineTo(7.78f, 13.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Sport, contentDescription = null)
    }
}
