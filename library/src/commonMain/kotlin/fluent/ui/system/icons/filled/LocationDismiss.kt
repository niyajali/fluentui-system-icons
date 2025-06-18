package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.LocationDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.843f, 4.559f)
            curveTo(9.243f, 1.159f, 14.756f, 1.159f, 18.157f, 4.559f)
            curveTo(21.489f, 7.891f, 21.556f, 13.253f, 18.357f, 16.667f)
            lineTo(18.157f, 16.873f)
            curveTo(17.242f, 17.788f, 15.711f, 19.283f, 13.564f, 21.359f)
            curveTo(12.692f, 22.202f, 11.308f, 22.202f, 10.436f, 21.359f)
            lineTo(6.586f, 17.61f)
            curveTo(6.302f, 17.33f, 6.054f, 17.084f, 5.843f, 16.873f)
            curveTo(2.442f, 13.473f, 2.442f, 7.96f, 5.843f, 4.559f)
            close()
            moveTo(15.03f, 7.686f)
            lineTo(14.946f, 7.613f)
            curveTo(14.685f, 7.419f, 14.327f, 7.417f, 14.063f, 7.606f)
            lineTo(13.969f, 7.686f)
            lineTo(12f, 9.655f)
            lineTo(10.03f, 7.686f)
            lineTo(9.946f, 7.613f)
            curveTo(9.685f, 7.419f, 9.327f, 7.417f, 9.063f, 7.606f)
            lineTo(8.969f, 7.686f)
            lineTo(8.897f, 7.77f)
            curveTo(8.703f, 8.031f, 8.701f, 8.389f, 8.89f, 8.652f)
            lineTo(8.969f, 8.746f)
            lineTo(10.939f, 10.716f)
            lineTo(8.969f, 12.686f)
            lineTo(8.897f, 12.77f)
            curveTo(8.703f, 13.031f, 8.701f, 13.389f, 8.89f, 13.653f)
            lineTo(8.969f, 13.746f)
            lineTo(9.054f, 13.819f)
            curveTo(9.315f, 14.013f, 9.673f, 14.015f, 9.936f, 13.826f)
            lineTo(10.03f, 13.746f)
            lineTo(12f, 11.777f)
            lineTo(13.969f, 13.746f)
            lineTo(14.054f, 13.819f)
            curveTo(14.315f, 14.013f, 14.673f, 14.015f, 14.936f, 13.826f)
            lineTo(15.03f, 13.746f)
            lineTo(15.103f, 13.662f)
            curveTo(15.296f, 13.401f, 15.299f, 13.043f, 15.11f, 12.78f)
            lineTo(15.03f, 12.686f)
            lineTo(13.061f, 10.716f)
            lineTo(15.03f, 8.746f)
            lineTo(15.103f, 8.662f)
            curveTo(15.296f, 8.401f, 15.299f, 8.043f, 15.11f, 7.78f)
            lineTo(15.03f, 7.686f)
            lineTo(14.946f, 7.613f)
            lineTo(15.03f, 7.686f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LocationDismiss, contentDescription = null)
    }
}
