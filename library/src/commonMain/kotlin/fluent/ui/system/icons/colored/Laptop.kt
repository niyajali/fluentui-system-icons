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

public val FluentUi.Colored.Laptop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Laptop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(22f, 18.912f),
                end = Offset(20.765f, 12.254f)
            )
        ) {
            moveTo(6.254f, 16f)
            lineTo(12f, 15.469f)
            lineTo(17.754f, 16f)
            horizontalLineTo(17.819f)
            curveTo(17.939f, 16f, 18.058f, 16.022f, 18.17f, 16.064f)
            lineTo(21.295f, 17.236f)
            curveTo(21.718f, 17.394f, 21.999f, 17.798f, 22f, 18.25f)
            horizontalLineTo(2f)
            curveTo(2f, 17.799f, 2.28f, 17.395f, 2.702f, 17.237f)
            lineTo(5.83f, 16.064f)
            curveTo(5.942f, 16.022f, 6.061f, 16f, 6.181f, 16f)
            horizontalLineTo(6.254f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(22f, 18.893f),
                end = Offset(21.792f, 16.123f)
            )
        ) {
            moveTo(2.75f, 17.5f)
            curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
            curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
            curveTo(22f, 17.836f, 21.664f, 17.5f, 21.25f, 17.5f)
            horizontalLineTo(2.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(15.2f, 4f),
                end = Offset(15.95f, 17.722f)
            )
        ) {
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(13.75f)
            curveTo(20f, 14.993f, 18.993f, 16f, 17.75f, 16f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 16f, 4f, 14.993f, 4f, 13.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Laptop, contentDescription = null)
    }
}
