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

public val FluentUi.Colored.Apps: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Apps",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(3f, 3f),
                end = Offset(11.987f, 12.486f)
            )
        ) {
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(10.25f)
            curveTo(11.493f, 3f, 12.5f, 4.007f, 12.5f, 5.25f)
            verticalLineTo(11f)
            curveTo(12.5f, 11.552f, 12.052f, 12f, 11.5f, 12f)
            horizontalLineTo(4f)
            curveTo(3.448f, 12f, 3f, 11.552f, 3f, 11f)
            verticalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(21f, 20.321f),
                end = Offset(12.191f, 11.976f)
            )
        ) {
            moveTo(18.75f, 11.5f)
            curveTo(19.993f, 11.5f, 21f, 12.507f, 21f, 13.75f)
            verticalLineTo(18.75f)
            curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
            horizontalLineTo(13f)
            curveTo(12.448f, 21f, 12f, 20.552f, 12f, 20f)
            lineTo(12f, 12.5f)
            curveTo(12f, 11.948f, 12.448f, 11.5f, 13f, 11.5f)
            lineTo(18.75f, 11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(3f, 11.5f),
                end = Offset(12.5f, 17.607f)
            )
        ) {
            moveTo(12.5f, 20f)
            curveTo(12.5f, 20.552f, 12.052f, 21f, 11.5f, 21f)
            lineTo(5.25f, 21f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            lineTo(3f, 12.5f)
            curveTo(3f, 11.948f, 3.448f, 11.5f, 4f, 11.5f)
            lineTo(11.5f, 11.5f)
            curveTo(12.052f, 11.5f, 12.5f, 11.948f, 12.5f, 12.5f)
            lineTo(12.5f, 20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2764E7),
                    1f to Color(0xFF36DFF1)
                ),
                start = Offset(20.565f, 10.002f),
                end = Offset(14.385f, 2.38f)
            )
        ) {
            moveTo(15.41f, 2.159f)
            curveTo(16.289f, 1.28f, 17.714f, 1.28f, 18.592f, 2.159f)
            lineTo(21.844f, 5.41f)
            curveTo(22.722f, 6.289f, 22.722f, 7.714f, 21.844f, 8.592f)
            lineTo(18.592f, 11.844f)
            curveTo(17.714f, 12.722f, 16.289f, 12.722f, 15.41f, 11.844f)
            lineTo(12.159f, 8.592f)
            curveTo(11.28f, 7.714f, 11.28f, 6.289f, 12.159f, 5.41f)
            lineTo(15.41f, 2.159f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Apps, contentDescription = null)
    }
}
