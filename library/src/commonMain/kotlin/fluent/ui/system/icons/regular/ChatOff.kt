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

public val FluentUi.Regular.ChatOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.418f, 5.479f)
            curveTo(2.911f, 7.23f, 2f, 9.509f, 2f, 12f)
            curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
            lineTo(2.047f, 20.415f)
            curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
            curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
            lineTo(7.413f, 20.888f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveTo(14.491f, 22f, 16.77f, 21.089f, 18.521f, 19.582f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.457f, 18.518f)
            curveTo(15.98f, 19.755f, 14.077f, 20.5f, 12f, 20.5f)
            curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
            lineTo(7.598f, 19.279f)
            lineTo(3.611f, 20.391f)
            lineTo(4.724f, 16.407f)
            lineTo(4.573f, 16.138f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            curveTo(3.5f, 9.923f, 4.245f, 8.02f, 5.483f, 6.543f)
            lineTo(8.487f, 9.548f)
            curveTo(8.202f, 9.654f, 8f, 9.928f, 8f, 10.25f)
            curveTo(8f, 10.664f, 8.336f, 11f, 8.75f, 11f)
            horizontalLineTo(9.939f)
            lineTo(11.939f, 13f)
            horizontalLineTo(8.75f)
            lineTo(8.648f, 13.007f)
            curveTo(8.282f, 13.057f, 8f, 13.37f, 8f, 13.75f)
            curveTo(8f, 14.164f, 8.336f, 14.5f, 8.75f, 14.5f)
            horizontalLineTo(13.248f)
            lineTo(13.35f, 14.493f)
            curveTo(13.373f, 14.49f, 13.397f, 14.486f, 13.42f, 14.48f)
            lineTo(17.457f, 18.518f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.255f, 9.5f)
            horizontalLineTo(12.682f)
            lineTo(14.182f, 11f)
            horizontalLineTo(15.255f)
            lineTo(15.356f, 10.993f)
            curveTo(15.722f, 10.943f, 16.004f, 10.63f, 16.004f, 10.25f)
            curveTo(16.004f, 9.836f, 15.669f, 9.5f, 15.255f, 9.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.5f, 12f)
            curveTo(20.5f, 13.53f, 20.096f, 14.966f, 19.388f, 16.206f)
            lineTo(20.482f, 17.3f)
            curveTo(21.444f, 15.763f, 22f, 13.947f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(10.053f, 2f, 8.237f, 2.556f, 6.7f, 3.518f)
            lineTo(7.794f, 4.612f)
            curveTo(9.034f, 3.904f, 10.47f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChatOff, contentDescription = null)
    }
}
