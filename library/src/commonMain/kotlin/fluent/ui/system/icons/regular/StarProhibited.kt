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

public val FluentUi.Regular.StarProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.788f, 3.102f)
            curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
            lineTo(15.567f, 7.88f)
            lineTo(20.84f, 8.646f)
            curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
            lineTo(20.683f, 11.831f)
            curveTo(20.211f, 11.565f, 19.702f, 11.357f, 19.166f, 11.215f)
            lineTo(20.323f, 10.087f)
            lineTo(15.273f, 9.353f)
            curveTo(14.833f, 9.289f, 14.453f, 9.013f, 14.257f, 8.614f)
            lineTo(11.998f, 4.039f)
            lineTo(9.74f, 8.614f)
            curveTo(9.543f, 9.013f, 9.163f, 9.289f, 8.724f, 9.353f)
            lineTo(3.674f, 10.087f)
            lineTo(7.328f, 13.649f)
            curveTo(7.646f, 13.959f, 7.791f, 14.406f, 7.716f, 14.844f)
            lineTo(6.854f, 19.873f)
            lineTo(11.003f, 17.691f)
            curveTo(11.019f, 18.234f, 11.101f, 18.76f, 11.241f, 19.261f)
            lineTo(7.283f, 21.342f)
            curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
            lineTo(6.224f, 14.668f)
            lineTo(2.409f, 10.949f)
            curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
            lineTo(8.43f, 7.88f)
            lineTo(10.788f, 3.102f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.537f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.537f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(13.5f, 17.5f)
            curveTo(13.5f, 18.333f, 13.755f, 19.107f, 14.191f, 19.748f)
            lineTo(19.748f, 14.191f)
            curveTo(19.108f, 13.755f, 18.333f, 13.5f, 17.5f, 13.5f)
            curveTo(15.291f, 13.5f, 13.5f, 15.29f, 13.5f, 17.5f)
            close()
            moveTo(17.5f, 21.5f)
            curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
            curveTo(21.5f, 16.666f, 21.245f, 15.892f, 20.809f, 15.251f)
            lineTo(15.252f, 20.808f)
            curveTo(15.892f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StarProhibited, contentDescription = null)
    }
}
