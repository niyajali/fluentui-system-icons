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

public val FluentUi.Regular.StarOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(7.024f, 8.085f)
            lineTo(3.157f, 8.646f)
            curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
            lineTo(6.224f, 14.668f)
            lineTo(5.324f, 19.919f)
            curveTo(5.135f, 21.022f, 6.292f, 21.863f, 7.283f, 21.342f)
            lineTo(11.998f, 18.863f)
            lineTo(16.714f, 21.342f)
            curveTo(17.705f, 21.863f, 18.862f, 21.022f, 18.673f, 19.919f)
            lineTo(18.635f, 19.696f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(16.798f, 17.859f)
            lineTo(17.143f, 19.873f)
            lineTo(12.627f, 17.499f)
            curveTo(12.233f, 17.292f, 11.764f, 17.292f, 11.37f, 17.499f)
            lineTo(6.854f, 19.873f)
            lineTo(7.716f, 14.844f)
            curveTo(7.791f, 14.406f, 7.646f, 13.959f, 7.328f, 13.649f)
            lineTo(3.674f, 10.087f)
            lineTo(8.347f, 9.408f)
            lineTo(16.798f, 17.859f)
            close()
            moveTo(20.323f, 10.087f)
            lineTo(16.751f, 13.569f)
            lineTo(17.812f, 14.63f)
            lineTo(21.588f, 10.949f)
            curveTo(22.389f, 10.168f, 21.947f, 8.807f, 20.84f, 8.646f)
            lineTo(15.567f, 7.88f)
            lineTo(13.209f, 3.103f)
            curveTo(12.714f, 2.099f, 11.283f, 2.099f, 10.788f, 3.103f)
            lineTo(9.3f, 6.118f)
            lineTo(10.42f, 7.238f)
            lineTo(11.998f, 4.039f)
            lineTo(14.257f, 8.615f)
            curveTo(14.453f, 9.013f, 14.833f, 9.289f, 15.273f, 9.353f)
            lineTo(20.323f, 10.087f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StarOff, contentDescription = null)
    }
}
