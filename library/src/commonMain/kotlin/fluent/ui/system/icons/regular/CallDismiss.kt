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

public val FluentUi.Regular.CallDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.526f, 3.572f)
            lineTo(10.427f, 5.578f)
            curveTo(10.91f, 6.652f, 10.656f, 7.914f, 9.795f, 8.717f)
            lineTo(8.3f, 10.11f)
            curveTo(8.257f, 10.151f, 8.229f, 10.206f, 8.222f, 10.265f)
            curveTo(8.178f, 10.662f, 8.447f, 11.436f, 9.068f, 12.51f)
            curveTo(9.519f, 13.291f, 9.927f, 13.839f, 10.274f, 14.147f)
            curveTo(10.517f, 14.362f, 10.65f, 14.408f, 10.707f, 14.392f)
            lineTo(12.717f, 13.777f)
            curveTo(13.842f, 13.433f, 15.062f, 13.843f, 15.751f, 14.798f)
            lineTo(17.032f, 16.573f)
            curveTo(17.838f, 17.69f, 17.693f, 19.231f, 16.693f, 20.178f)
            lineTo(15.806f, 21.018f)
            curveTo(14.85f, 21.924f, 13.488f, 22.261f, 12.219f, 21.907f)
            curveTo(9.465f, 21.138f, 6.996f, 18.814f, 4.784f, 14.983f)
            curveTo(2.569f, 11.147f, 1.792f, 7.842f, 2.509f, 5.07f)
            curveTo(2.818f, 3.872f, 3.697f, 2.909f, 4.851f, 2.487f)
            lineTo(5.057f, 2.418f)
            lineTo(6.224f, 2.067f)
            curveTo(7.546f, 1.668f, 8.959f, 2.312f, 9.526f, 3.572f)
            close()
            moveTo(6.657f, 3.503f)
            lineTo(5.49f, 3.855f)
            lineTo(5.331f, 3.909f)
            curveTo(4.656f, 4.168f, 4.143f, 4.739f, 3.961f, 5.446f)
            curveTo(3.358f, 7.777f, 4.047f, 10.706f, 6.083f, 14.233f)
            curveTo(8.117f, 17.755f, 10.306f, 19.816f, 12.623f, 20.462f)
            curveTo(13.384f, 20.675f, 14.201f, 20.472f, 14.775f, 19.929f)
            lineTo(15.661f, 19.089f)
            curveTo(16.116f, 18.659f, 16.182f, 17.958f, 15.815f, 17.45f)
            lineTo(14.535f, 15.675f)
            curveTo(14.222f, 15.241f, 13.667f, 15.055f, 13.155f, 15.211f)
            lineTo(11.14f, 15.828f)
            curveTo(9.97f, 16.176f, 8.909f, 15.235f, 7.769f, 13.26f)
            curveTo(7f, 11.929f, 6.642f, 10.901f, 6.732f, 10.099f)
            curveTo(6.778f, 9.683f, 6.972f, 9.298f, 7.277f, 9.013f)
            lineTo(8.772f, 7.62f)
            curveTo(9.163f, 7.255f, 9.279f, 6.681f, 9.059f, 6.193f)
            lineTo(8.158f, 4.187f)
            curveTo(7.9f, 3.614f, 7.258f, 3.322f, 6.657f, 3.503f)
            close()
            moveTo(21.781f, 2.22f)
            curveTo(22.074f, 2.513f, 22.074f, 2.988f, 21.781f, 3.281f)
            lineTo(18.561f, 6.5f)
            lineTo(21.781f, 9.72f)
            curveTo(22.074f, 10.013f, 22.074f, 10.488f, 21.781f, 10.781f)
            curveTo(21.488f, 11.074f, 21.013f, 11.074f, 20.72f, 10.781f)
            lineTo(17.5f, 7.561f)
            lineTo(14.281f, 10.781f)
            curveTo(13.988f, 11.074f, 13.513f, 11.074f, 13.22f, 10.781f)
            curveTo(12.927f, 10.488f, 12.927f, 10.013f, 13.22f, 9.72f)
            lineTo(16.44f, 6.5f)
            lineTo(13.22f, 3.281f)
            curveTo(12.927f, 2.988f, 12.927f, 2.513f, 13.22f, 2.22f)
            curveTo(13.513f, 1.927f, 13.988f, 1.927f, 14.281f, 2.22f)
            lineTo(17.5f, 5.44f)
            lineTo(20.72f, 2.22f)
            curveTo(21.013f, 1.927f, 21.488f, 1.927f, 21.781f, 2.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CallDismiss, contentDescription = null)
    }
}
