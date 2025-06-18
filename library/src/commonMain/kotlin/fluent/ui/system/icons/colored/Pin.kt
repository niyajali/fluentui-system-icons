package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Pin: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Pin",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.449f to Color(0xFF7B7BFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(4.633f, 19.367f),
                end = Offset(9.496f, 15.648f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.53f, 15.53f)
            lineTo(4.28f, 20.78f)
            curveTo(3.987f, 21.073f, 3.513f, 21.073f, 3.22f, 20.78f)
            curveTo(2.927f, 20.487f, 2.927f, 20.013f, 3.22f, 19.72f)
            lineTo(8.47f, 14.47f)
            lineTo(9.53f, 15.53f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(4.608f, 5.483f),
                end = Offset(16.965f, 18.322f)
            )
        ) {
            moveTo(21.068f, 7.758f)
            lineTo(16.243f, 2.932f)
            curveTo(14.915f, 1.605f, 12.678f, 1.968f, 11.838f, 3.647f)
            lineTo(9.403f, 8.517f)
            curveTo(9.315f, 8.693f, 9.162f, 8.827f, 8.977f, 8.891f)
            lineTo(4.811f, 10.33f)
            curveTo(3.938f, 10.632f, 3.682f, 11.743f, 4.335f, 12.396f)
            lineTo(11.605f, 19.665f)
            curveTo(12.257f, 20.318f, 13.368f, 20.062f, 13.67f, 19.19f)
            lineTo(15.109f, 15.023f)
            curveTo(15.173f, 14.838f, 15.307f, 14.685f, 15.483f, 14.597f)
            lineTo(20.354f, 12.162f)
            curveTo(22.032f, 11.322f, 22.396f, 9.085f, 21.068f, 7.758f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(17.796f, 16.496f),
                radius = 7.959f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(21.068f, 7.758f)
            lineTo(16.243f, 2.932f)
            curveTo(14.915f, 1.605f, 12.678f, 1.968f, 11.838f, 3.647f)
            lineTo(9.403f, 8.517f)
            curveTo(9.315f, 8.693f, 9.162f, 8.827f, 8.977f, 8.891f)
            lineTo(4.811f, 10.33f)
            curveTo(3.938f, 10.632f, 3.682f, 11.743f, 4.335f, 12.396f)
            lineTo(11.605f, 19.665f)
            curveTo(12.257f, 20.318f, 13.368f, 20.062f, 13.67f, 19.19f)
            lineTo(15.109f, 15.023f)
            curveTo(15.173f, 14.838f, 15.307f, 14.685f, 15.483f, 14.597f)
            lineTo(20.354f, 12.162f)
            curveTo(22.032f, 11.322f, 22.396f, 9.085f, 21.068f, 7.758f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Pin, contentDescription = null)
    }
}
