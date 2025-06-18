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

public val FluentUi.Colored.PeopleCommunity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.PeopleCommunity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.339f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(11.374f, 5.282f),
                radius = 4.06f
            )
        ) {
            moveTo(12f, 3f)
            curveTo(10.205f, 3f, 8.75f, 4.455f, 8.75f, 6.25f)
            curveTo(8.75f, 8.045f, 10.205f, 9.5f, 12f, 9.5f)
            curveTo(13.795f, 9.5f, 15.25f, 8.045f, 15.25f, 6.25f)
            curveTo(15.25f, 4.455f, 13.795f, 3f, 12f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF008CE2),
                    1f to Color(0xFF0068C6)
                ),
                center = Offset(3.737f, 6.819f),
                radius = 4.92f
            )
        ) {
            moveTo(5f, 5f)
            curveTo(3.343f, 5f, 2f, 6.343f, 2f, 8f)
            curveTo(2f, 9.657f, 3.343f, 11f, 5f, 11f)
            curveTo(6.657f, 11f, 8f, 9.657f, 8f, 8f)
            curveTo(8f, 6.343f, 6.657f, 5f, 5f, 5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF004695)
                ),
                center = Offset(18.037f, 6.682f),
                radius = 4.401f
            )
        ) {
            moveTo(19f, 5f)
            curveTo(17.343f, 5f, 16f, 6.343f, 16f, 8f)
            curveTo(16f, 9.657f, 17.343f, 11f, 19f, 11f)
            curveTo(20.657f, 11f, 22f, 9.657f, 22f, 8f)
            curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF004695)
                ),
                center = Offset(15.646f, 14.079f),
                radius = 7.056f
            )
        ) {
            moveTo(15.39f, 11.442f)
            curveTo(14.457f, 11.191f, 13.497f, 11.745f, 13.247f, 12.679f)
            lineTo(12.535f, 15.335f)
            curveTo(11.892f, 17.736f, 13.317f, 20.203f, 15.717f, 20.847f)
            curveTo(18.118f, 21.49f, 20.585f, 20.065f, 21.229f, 17.665f)
            lineTo(21.94f, 15.008f)
            curveTo(22.191f, 14.075f, 21.636f, 13.115f, 20.703f, 12.865f)
            lineTo(15.39f, 11.442f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF008CE2),
                    1f to Color(0xFF0068C6)
                ),
                center = Offset(4.357f, 11.832f),
                radius = 10.478f
            )
        ) {
            moveTo(8.609f, 11.442f)
            curveTo(9.543f, 11.191f, 10.502f, 11.745f, 10.752f, 12.679f)
            lineTo(11.464f, 15.335f)
            curveTo(12.107f, 17.736f, 10.683f, 20.203f, 8.282f, 20.847f)
            curveTo(5.882f, 21.49f, 3.414f, 20.065f, 2.771f, 17.665f)
            lineTo(2.059f, 15.008f)
            curveTo(1.809f, 14.075f, 2.363f, 13.115f, 3.297f, 12.865f)
            lineTo(8.609f, 11.442f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.339f to Color(0xFF3DCBFF),
                    1f to Color(0xFF14B1FF)
                ),
                center = Offset(11.133f, 14.511f),
                radius = 6.095f
            )
        ) {
            moveTo(9.25f, 11f)
            curveTo(8.283f, 11f, 7.5f, 11.783f, 7.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(7.5f, 18.985f, 9.515f, 21f, 12f, 21f)
            curveTo(14.485f, 21f, 16.5f, 18.985f, 16.5f, 16.5f)
            verticalLineTo(12.75f)
            curveTo(16.5f, 11.783f, 15.717f, 11f, 14.75f, 11f)
            horizontalLineTo(9.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleCommunityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.PeopleCommunity, contentDescription = null)
    }
}
