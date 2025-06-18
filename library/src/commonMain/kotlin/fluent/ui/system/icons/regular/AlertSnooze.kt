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

public val FluentUi.Regular.AlertSnooze: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlertSnooze",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.999f, 3.5f)
            curveTo(8.896f, 3.5f, 5.999f, 5.932f, 5.999f, 9.75f)
            verticalLineTo(13.903f)
            lineTo(4.683f, 17f)
            horizontalLineTo(19.353f)
            lineTo(17.999f, 13.907f)
            verticalLineTo(11.75f)
            curveTo(17.999f, 11.336f, 18.335f, 11f, 18.749f, 11f)
            curveTo(19.163f, 11f, 19.499f, 11.336f, 19.499f, 11.75f)
            verticalLineTo(13.593f)
            lineTo(20.88f, 16.749f)
            curveTo(21.241f, 17.575f, 20.636f, 18.5f, 19.735f, 18.5f)
            horizontalLineTo(15.001f)
            curveTo(15f, 20.157f, 13.657f, 21.5f, 12f, 21.5f)
            curveTo(10.342f, 21.5f, 8.999f, 20.157f, 8.998f, 18.5f)
            horizontalLineTo(4.305f)
            curveTo(3.409f, 18.5f, 2.804f, 17.586f, 3.155f, 16.761f)
            lineTo(4.499f, 13.597f)
            verticalLineTo(9.75f)
            curveTo(4.499f, 5.068f, 8.103f, 2f, 11.999f, 2f)
            curveTo(12.859f, 2f, 13.704f, 2.149f, 14.5f, 2.432f)
            curveTo(14.89f, 2.571f, 15.094f, 3f, 14.955f, 3.39f)
            curveTo(14.816f, 3.78f, 14.388f, 3.984f, 13.997f, 3.845f)
            curveTo(13.361f, 3.619f, 12.685f, 3.5f, 11.999f, 3.5f)
            close()
            moveTo(12f, 20f)
            curveTo(12.828f, 20f, 13.5f, 19.329f, 13.501f, 18.5f)
            horizontalLineTo(10.498f)
            curveTo(10.499f, 19.329f, 11.171f, 20f, 12f, 20f)
            close()
            moveTo(15.25f, 7f)
            horizontalLineTo(12.75f)
            lineTo(12.649f, 7.007f)
            curveTo(12.283f, 7.057f, 12f, 7.37f, 12f, 7.75f)
            curveTo(12f, 8.164f, 12.336f, 8.5f, 12.75f, 8.5f)
            horizontalLineTo(13.793f)
            lineTo(12.14f, 10.814f)
            lineTo(12.085f, 10.903f)
            curveTo(11.828f, 11.389f, 12.176f, 12f, 12.75f, 12f)
            horizontalLineTo(15.25f)
            lineTo(15.352f, 11.993f)
            curveTo(15.718f, 11.943f, 16f, 11.63f, 16f, 11.25f)
            curveTo(16f, 10.836f, 15.665f, 10.5f, 15.25f, 10.5f)
            horizontalLineTo(14.208f)
            lineTo(15.861f, 8.186f)
            lineTo(15.916f, 8.097f)
            curveTo(16.173f, 7.611f, 15.825f, 7f, 15.25f, 7f)
            close()
            moveTo(21.25f, 2f)
            horizontalLineTo(17.75f)
            lineTo(17.649f, 2.007f)
            curveTo(17.282f, 2.057f, 17f, 2.37f, 17f, 2.75f)
            curveTo(17f, 3.164f, 17.336f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(19.884f)
            lineTo(17.118f, 7.847f)
            lineTo(17.069f, 7.937f)
            curveTo(16.843f, 8.421f, 17.193f, 9f, 17.75f, 9f)
            horizontalLineTo(21.25f)
            lineTo(21.352f, 8.993f)
            curveTo(21.718f, 8.943f, 22f, 8.63f, 22f, 8.25f)
            curveTo(22f, 7.836f, 21.665f, 7.5f, 21.25f, 7.5f)
            horizontalLineTo(19.117f)
            lineTo(21.883f, 3.153f)
            lineTo(21.932f, 3.063f)
            curveTo(22.158f, 2.579f, 21.807f, 2f, 21.25f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertSnoozePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlertSnooze, contentDescription = null)
    }
}
