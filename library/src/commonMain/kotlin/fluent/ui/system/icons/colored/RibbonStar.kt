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

public val FluentUi.Colored.RibbonStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.RibbonStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(12.001f, 11.879f),
                radius = 13.794f
            )
        ) {
            moveTo(17.002f, 13.244f)
            lineTo(17.001f, 21.245f)
            curveTo(17.001f, 21.853f, 16.316f, 22.208f, 15.819f, 21.858f)
            lineTo(12.001f, 19.171f)
            lineTo(8.185f, 21.858f)
            curveTo(7.688f, 22.208f, 7.003f, 21.853f, 7.003f, 21.245f)
            lineTo(7.001f, 13.246f)
            curveTo(8.37f, 14.344f, 10.109f, 15f, 12f, 15f)
            curveTo(13.893f, 15f, 15.632f, 14.343f, 17.002f, 13.244f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.772f to Color(0xFFFFCD0F),
                    0.991f to Color(0xFFE67505)
                ),
                center = Offset(-25.25f, -47f),
                radius = 78.145f
            )
        ) {
            moveTo(12f, 2f)
            curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
            curveTo(19f, 12.866f, 15.866f, 16f, 12f, 16f)
            curveTo(8.134f, 16f, 5f, 12.866f, 5f, 9f)
            curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB03111),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(13.702f, 12f),
                radius = 11.873f
            )
        ) {
            moveTo(12.229f, 5.642f)
            lineTo(13.141f, 7.495f)
            lineTo(15.185f, 7.79f)
            curveTo(15.394f, 7.821f, 15.478f, 8.078f, 15.327f, 8.225f)
            lineTo(13.848f, 9.666f)
            lineTo(14.197f, 11.701f)
            curveTo(14.233f, 11.91f, 14.014f, 12.069f, 13.827f, 11.97f)
            lineTo(12f, 11.008f)
            lineTo(10.173f, 11.97f)
            curveTo(9.985f, 12.069f, 9.766f, 11.91f, 9.802f, 11.701f)
            lineTo(10.153f, 9.666f)
            lineTo(8.673f, 8.226f)
            curveTo(8.522f, 8.078f, 8.605f, 7.821f, 8.815f, 7.79f)
            lineTo(10.858f, 7.495f)
            lineTo(11.771f, 5.642f)
            curveTo(11.865f, 5.453f, 12.135f, 5.453f, 12.229f, 5.642f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.RibbonStar, contentDescription = null)
    }
}
