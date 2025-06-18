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

public val FluentUi.Colored.ShieldCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ShieldCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.338f to Color(0xFF0FAFFF),
                    0.529f to Color(0xFF367AF2),
                    0.682f to Color(0xFF5750E2),
                    0.861f to Color(0xFFCC23D1)
                ),
                center = Offset(-4.071f, -9.25f),
                radius = 47.599f
            )
        ) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
            curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
            curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
            curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
            curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0xFF1E1868),
                    1f to Color(0x001E1868)
                ),
                center = Offset(17.786f, 18.875f),
                radius = 8.125f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(3f, 5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
            curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
            curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
            curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
            curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
            verticalLineTo(5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(12.393f, 14.063f),
                end = Offset(19.984f, 21.95f)
            )
        ) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFFFFF),
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(15.313f, 15.51f),
                end = Offset(16.45f, 21.13f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(20.854f, 15.146f)
            curveTo(21.049f, 15.342f, 21.049f, 15.658f, 20.854f, 15.854f)
            lineTo(16.854f, 19.854f)
            curveTo(16.658f, 20.049f, 16.342f, 20.049f, 16.146f, 19.854f)
            lineTo(14.146f, 17.854f)
            curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
            curveTo(14.342f, 16.951f, 14.658f, 16.951f, 14.854f, 17.146f)
            lineTo(16.5f, 18.793f)
            lineTo(20.146f, 15.146f)
            curveTo(20.342f, 14.951f, 20.658f, 14.951f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ShieldCheckmark, contentDescription = null)
    }
}
