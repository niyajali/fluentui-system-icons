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

public val FluentUi.Colored.ArrowTrendingLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.ArrowTrendingLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(21.109f, 9.308f),
                end = Offset(0.978f, 20.334f)
            )
        ) {
            moveTo(5f, 18f)
            verticalLineTo(21f)
            curveTo(5f, 21.552f, 4.552f, 22f, 4f, 22f)
            curveTo(3.448f, 22f, 3f, 21.552f, 3f, 21f)
            verticalLineTo(18f)
            curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
            curveTo(4.552f, 17f, 5f, 17.448f, 5f, 18f)
            close()
            moveTo(10f, 14f)
            curveTo(10f, 13.448f, 9.552f, 13f, 9f, 13f)
            curveTo(8.448f, 13f, 8f, 13.448f, 8f, 14f)
            verticalLineTo(21f)
            curveTo(8f, 21.552f, 8.448f, 22f, 9f, 22f)
            curveTo(9.552f, 22f, 10f, 21.552f, 10f, 21f)
            verticalLineTo(14f)
            close()
            moveTo(14f, 15f)
            curveTo(14.552f, 15f, 15f, 15.448f, 15f, 16f)
            verticalLineTo(21f)
            curveTo(15f, 21.552f, 14.552f, 22f, 14f, 22f)
            curveTo(13.448f, 22f, 13f, 21.552f, 13f, 21f)
            verticalLineTo(16f)
            curveTo(13f, 15.448f, 13.448f, 15f, 14f, 15f)
            close()
            moveTo(20f, 11f)
            curveTo(20f, 10.448f, 19.552f, 10f, 19f, 10f)
            curveTo(18.448f, 10f, 18f, 10.448f, 18f, 11f)
            verticalLineTo(21f)
            curveTo(18f, 21.552f, 18.448f, 22f, 19f, 22f)
            curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
            verticalLineTo(11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF22918B),
                    1f to Color(0xFF20AC9D)
                ),
                start = Offset(3.668f, 14f),
                end = Offset(22.349f, 1.536f)
            )
        ) {
            moveTo(17f, 4f)
            curveTo(16.448f, 4f, 16f, 3.552f, 16f, 3f)
            curveTo(16f, 2.448f, 16.448f, 2f, 17f, 2f)
            horizontalLineTo(21f)
            curveTo(21.552f, 2f, 22f, 2.448f, 22f, 3f)
            verticalLineTo(7f)
            curveTo(22f, 7.552f, 21.552f, 8f, 21f, 8f)
            curveTo(20.448f, 8f, 20f, 7.552f, 20f, 7f)
            verticalLineTo(5.414f)
            lineTo(14.207f, 11.207f)
            curveTo(13.817f, 11.598f, 13.183f, 11.598f, 12.793f, 11.207f)
            lineTo(10f, 8.414f)
            lineTo(4.707f, 13.707f)
            curveTo(4.317f, 14.098f, 3.683f, 14.098f, 3.293f, 13.707f)
            curveTo(2.902f, 13.317f, 2.902f, 12.683f, 3.293f, 12.293f)
            lineTo(9.293f, 6.293f)
            curveTo(9.48f, 6.105f, 9.735f, 6f, 10f, 6f)
            curveTo(10.265f, 6f, 10.52f, 6.105f, 10.707f, 6.293f)
            lineTo(13.5f, 9.086f)
            lineTo(18.586f, 4f)
            horizontalLineTo(17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.ArrowTrendingLines, contentDescription = null)
    }
}
