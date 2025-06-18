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

public val FluentUi.Regular.SpeakerBluetooth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerBluetooth",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.704f, 3.443f)
            curveTo(14.895f, 3.668f, 15f, 3.954f, 15f, 4.25f)
            verticalLineTo(19.752f)
            curveTo(15f, 20.442f, 14.44f, 21.002f, 13.75f, 21.002f)
            curveTo(13.454f, 21.002f, 13.168f, 20.897f, 12.942f, 20.706f)
            lineTo(7.975f, 16.5f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16.5f, 2f, 15.493f, 2f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(2f, 8.507f, 3.007f, 7.5f, 4.25f, 7.5f)
            horizontalLineTo(7.975f)
            lineTo(12.943f, 3.296f)
            curveTo(13.469f, 2.85f, 14.258f, 2.916f, 14.704f, 3.443f)
            close()
            moveTo(13.5f, 4.789f)
            lineTo(8.525f, 9f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 9f, 3.5f, 9.336f, 3.5f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(3.5f, 14.664f, 3.836f, 15f, 4.25f, 15f)
            horizontalLineTo(8.525f)
            lineTo(13.5f, 19.212f)
            verticalLineTo(4.789f)
            close()
            moveTo(17.5f, 9.896f)
            verticalLineTo(6.75f)
            curveTo(17.5f, 6.103f, 18.252f, 5.775f, 18.725f, 6.169f)
            lineTo(18.801f, 6.241f)
            lineTo(21.801f, 9.491f)
            curveTo(22.068f, 9.78f, 22.063f, 10.22f, 21.806f, 10.503f)
            lineTo(21.73f, 10.576f)
            lineTo(20.022f, 11.999f)
            lineTo(21.73f, 13.424f)
            curveTo(22.032f, 13.676f, 22.085f, 14.112f, 21.867f, 14.426f)
            lineTo(21.801f, 14.508f)
            lineTo(18.801f, 17.76f)
            curveTo(18.363f, 18.235f, 17.587f, 17.966f, 17.507f, 17.356f)
            lineTo(17.5f, 17.251f)
            verticalLineTo(14.101f)
            lineTo(17.233f, 14.323f)
            curveTo(16.915f, 14.588f, 16.442f, 14.545f, 16.177f, 14.226f)
            curveTo(15.936f, 13.937f, 15.95f, 13.52f, 16.193f, 13.247f)
            lineTo(16.273f, 13.17f)
            lineTo(17.5f, 12.148f)
            verticalLineTo(11.849f)
            lineTo(16.273f, 10.825f)
            curveTo(15.955f, 10.56f, 15.912f, 10.087f, 16.177f, 9.769f)
            curveTo(16.419f, 9.48f, 16.831f, 9.418f, 17.143f, 9.609f)
            lineTo(17.234f, 9.673f)
            lineTo(17.5f, 9.896f)
            verticalLineTo(6.75f)
            verticalLineTo(9.896f)
            close()
            moveTo(19f, 13.1f)
            verticalLineTo(15.333f)
            lineTo(20.164f, 14.071f)
            lineTo(19f, 13.1f)
            close()
            moveTo(19f, 8.668f)
            verticalLineTo(10.898f)
            lineTo(20.164f, 9.929f)
            lineTo(19f, 8.668f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpeakerBluetoothPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SpeakerBluetooth, contentDescription = null)
    }
}
