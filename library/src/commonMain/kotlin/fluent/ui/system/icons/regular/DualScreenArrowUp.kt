package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DualScreenArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            close()
            moveTo(16f, 4.707f)
            verticalLineTo(9.5f)
            curveTo(16f, 9.776f, 16.224f, 10f, 16.5f, 10f)
            curveTo(16.776f, 10f, 17f, 9.776f, 17f, 9.5f)
            verticalLineTo(4.707f)
            lineTo(18.646f, 6.354f)
            curveTo(18.842f, 6.549f, 19.158f, 6.549f, 19.354f, 6.354f)
            curveTo(19.549f, 6.158f, 19.549f, 5.842f, 19.354f, 5.646f)
            lineTo(16.854f, 3.146f)
            curveTo(16.658f, 2.951f, 16.342f, 2.951f, 16.146f, 3.146f)
            lineTo(13.646f, 5.646f)
            curveTo(13.451f, 5.842f, 13.451f, 6.158f, 13.646f, 6.354f)
            curveTo(13.842f, 6.549f, 14.158f, 6.549f, 14.354f, 6.354f)
            lineTo(16f, 4.707f)
            close()
            moveTo(10f, 6.5f)
            curveTo(10f, 6.332f, 10.006f, 6.166f, 10.019f, 6.002f)
            lineTo(3.75f, 6.001f)
            curveTo(2.783f, 6.001f, 2f, 6.785f, 2f, 7.751f)
            verticalLineTo(20.246f)
            curveTo(2f, 21.213f, 2.783f, 21.996f, 3.75f, 21.996f)
            lineTo(11.247f, 21.996f)
            lineTo(11.248f, 21.999f)
            horizontalLineTo(20.245f)
            curveTo(21.212f, 21.999f, 21.995f, 21.215f, 21.995f, 20.249f)
            lineTo(21.996f, 9.972f)
            curveTo(21.594f, 10.606f, 21.086f, 11.167f, 20.496f, 11.627f)
            lineTo(20.495f, 20.249f)
            curveTo(20.495f, 20.387f, 20.383f, 20.499f, 20.245f, 20.499f)
            horizontalLineTo(12.748f)
            lineTo(12.748f, 11.808f)
            curveTo(12.171f, 11.399f, 11.663f, 10.899f, 11.247f, 10.329f)
            lineTo(11.248f, 20.496f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 20.496f, 3.5f, 20.384f, 3.5f, 20.246f)
            verticalLineTo(7.751f)
            curveTo(3.5f, 7.613f, 3.612f, 7.501f, 3.75f, 7.501f)
            lineTo(10.077f, 7.502f)
            curveTo(10.026f, 7.175f, 10f, 6.841f, 10f, 6.5f)
            close()
            moveTo(16.989f, 18.25f)
            curveTo(16.989f, 17.836f, 16.653f, 17.5f, 16.239f, 17.5f)
            horizontalLineTo(14.739f)
            lineTo(14.637f, 17.507f)
            curveTo(14.271f, 17.556f, 13.989f, 17.87f, 13.989f, 18.25f)
            curveTo(13.989f, 18.664f, 14.325f, 19f, 14.739f, 19f)
            horizontalLineTo(16.239f)
            lineTo(16.34f, 18.993f)
            curveTo(16.707f, 18.944f, 16.989f, 18.63f, 16.989f, 18.25f)
            close()
            moveTo(9.993f, 18.25f)
            curveTo(9.993f, 17.836f, 9.657f, 17.5f, 9.243f, 17.5f)
            horizontalLineTo(7.741f)
            lineTo(7.639f, 17.507f)
            curveTo(7.273f, 17.556f, 6.991f, 17.87f, 6.991f, 18.25f)
            curveTo(6.991f, 18.664f, 7.327f, 19f, 7.741f, 19f)
            horizontalLineTo(9.243f)
            lineTo(9.345f, 18.993f)
            curveTo(9.711f, 18.944f, 9.993f, 18.63f, 9.993f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DualScreenArrowUp, contentDescription = null)
    }
}
