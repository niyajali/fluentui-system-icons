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

public val FluentUi.Regular.CallPark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallPark",
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
            curveTo(2.836f, 3.802f, 3.803f, 2.797f, 5.057f, 2.418f)
            lineTo(6.224f, 2.067f)
            curveTo(7.546f, 1.668f, 8.959f, 2.312f, 9.526f, 3.572f)
            close()
            moveTo(6.657f, 3.503f)
            lineTo(5.49f, 3.855f)
            curveTo(4.737f, 4.081f, 4.158f, 4.685f, 3.961f, 5.446f)
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
            moveTo(14.75f, 2f)
            horizontalLineTo(17.246f)
            curveTo(19.636f, 2f, 21f, 3.136f, 21f, 5.25f)
            curveTo(21f, 7.295f, 19.725f, 8.423f, 17.482f, 8.494f)
            lineTo(17.246f, 8.497f)
            lineTo(15.5f, 8.497f)
            verticalLineTo(11.257f)
            curveTo(15.5f, 11.671f, 15.165f, 12.007f, 14.75f, 12.007f)
            curveTo(14.371f, 12.007f, 14.057f, 11.724f, 14.007f, 11.358f)
            lineTo(14f, 11.257f)
            verticalLineTo(2.75f)
            curveTo(14f, 2.371f, 14.283f, 2.057f, 14.649f, 2.007f)
            lineTo(14.75f, 2f)
            horizontalLineTo(17.246f)
            horizontalLineTo(14.75f)
            close()
            moveTo(17.246f, 3.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(6.997f)
            lineTo(17.247f, 6.997f)
            curveTo(18.863f, 6.999f, 19.5f, 6.469f, 19.5f, 5.25f)
            curveTo(19.5f, 4.082f, 18.914f, 3.546f, 17.443f, 3.503f)
            lineTo(17.246f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallParkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CallPark, contentDescription = null)
    }
}
