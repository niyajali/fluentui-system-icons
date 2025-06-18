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

public val FluentUi.Colored.Building: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Building",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4f, 2.625f),
                end = Offset(23.081f, 22.168f)
            )
        ) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(14.25f)
            curveTo(15.493f, 2f, 16.5f, 3.007f, 16.5f, 4.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
            verticalLineTo(21.25f)
            curveTo(20f, 21.664f, 19.664f, 22f, 19.25f, 22f)
            curveTo(11.81f, 22f, 9.787f, 22f, 4.75f, 22f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(12.359f, 17.422f),
                end = Offset(16.131f, 20.102f)
            )
        ) {
            moveTo(16.5f, 18.25f)
            curveTo(16.5f, 17.56f, 15.94f, 17f, 15.25f, 17f)
            horizontalLineTo(12f)
            lineTo(11f, 19.5f)
            lineTo(12f, 22f)
            horizontalLineTo(16.5f)
            verticalLineTo(18.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(7.661f, 17.938f),
                end = Offset(11.106f, 21.159f)
            )
        ) {
            moveTo(7.5f, 18.25f)
            curveTo(7.5f, 17.56f, 8.06f, 17f, 8.75f, 17f)
            horizontalLineTo(12f)
            verticalLineTo(22f)
            horizontalLineTo(7.5f)
            verticalLineTo(18.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(10.2f, 4.5f),
                end = Offset(13.488f, 16.337f)
            )
        ) {
            moveTo(7.5f, 6.5f)
            curveTo(7.5f, 7.052f, 7.948f, 7.5f, 8.5f, 7.5f)
            curveTo(9.052f, 7.5f, 9.5f, 7.052f, 9.5f, 6.5f)
            curveTo(9.5f, 5.948f, 9.052f, 5.5f, 8.5f, 5.5f)
            curveTo(7.948f, 5.5f, 7.5f, 5.948f, 7.5f, 6.5f)
            close()
            moveTo(8.5f, 12.5f)
            curveTo(7.948f, 12.5f, 7.5f, 12.948f, 7.5f, 13.5f)
            curveTo(7.5f, 14.052f, 7.948f, 14.5f, 8.5f, 14.5f)
            curveTo(9.052f, 14.5f, 9.5f, 14.052f, 9.5f, 13.5f)
            curveTo(9.5f, 12.948f, 9.052f, 12.5f, 8.5f, 12.5f)
            close()
            moveTo(8.5f, 9f)
            curveTo(7.948f, 9f, 7.5f, 9.448f, 7.5f, 10f)
            curveTo(7.5f, 10.552f, 7.948f, 11f, 8.5f, 11f)
            curveTo(9.052f, 11f, 9.5f, 10.552f, 9.5f, 10f)
            curveTo(9.5f, 9.448f, 9.052f, 9f, 8.5f, 9f)
            close()
            moveTo(12f, 5.5f)
            curveTo(11.448f, 5.5f, 11f, 5.948f, 11f, 6.5f)
            curveTo(11f, 7.052f, 11.448f, 7.5f, 12f, 7.5f)
            curveTo(12.552f, 7.5f, 13f, 7.052f, 13f, 6.5f)
            curveTo(13f, 5.948f, 12.552f, 5.5f, 12f, 5.5f)
            close()
            moveTo(12f, 12.5f)
            curveTo(11.448f, 12.5f, 11f, 12.948f, 11f, 13.5f)
            curveTo(11f, 14.052f, 11.448f, 14.5f, 12f, 14.5f)
            curveTo(12.552f, 14.5f, 13f, 14.052f, 13f, 13.5f)
            curveTo(13f, 12.948f, 12.552f, 12.5f, 12f, 12.5f)
            close()
            moveTo(15.5f, 12.5f)
            curveTo(14.948f, 12.5f, 14.5f, 12.948f, 14.5f, 13.5f)
            curveTo(14.5f, 14.052f, 14.948f, 14.5f, 15.5f, 14.5f)
            curveTo(16.052f, 14.5f, 16.5f, 14.052f, 16.5f, 13.5f)
            curveTo(16.5f, 12.948f, 16.052f, 12.5f, 15.5f, 12.5f)
            close()
            moveTo(12f, 9f)
            curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
            curveTo(11f, 10.552f, 11.448f, 11f, 12f, 11f)
            curveTo(12.552f, 11f, 13f, 10.552f, 13f, 10f)
            curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Building, contentDescription = null)
    }
}
