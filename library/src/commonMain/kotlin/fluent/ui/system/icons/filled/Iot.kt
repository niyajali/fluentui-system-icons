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

public val FluentUi.Filled.Iot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Iot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 4.492f)
            curveTo(19f, 5.873f, 17.881f, 6.992f, 16.5f, 6.992f)
            curveTo(16.325f, 6.992f, 16.153f, 6.974f, 15.988f, 6.94f)
            lineTo(14.708f, 9.057f)
            curveTo(15.502f, 9.788f, 16f, 10.836f, 16f, 12.001f)
            lineTo(16f, 12.048f)
            lineTo(16f, 12.059f)
            lineTo(17.296f, 12.32f)
            curveTo(17.718f, 11.535f, 18.546f, 11.001f, 19.5f, 11.001f)
            curveTo(20.881f, 11.001f, 22f, 12.12f, 22f, 13.501f)
            curveTo(22f, 14.881f, 20.881f, 16.001f, 19.5f, 16.001f)
            curveTo(18.218f, 16.001f, 17.162f, 15.036f, 17.017f, 13.794f)
            lineTo(15.698f, 13.528f)
            curveTo(15.353f, 14.362f, 14.735f, 15.054f, 13.955f, 15.491f)
            lineTo(14.45f, 17.003f)
            lineTo(14.472f, 17.003f)
            lineTo(14.5f, 17.003f)
            curveTo(15.881f, 17.003f, 17f, 18.122f, 17f, 19.503f)
            curveTo(17f, 20.884f, 15.881f, 22.003f, 14.5f, 22.003f)
            curveTo(13.119f, 22.003f, 12f, 20.884f, 12f, 19.503f)
            curveTo(12f, 18.673f, 12.405f, 17.937f, 13.028f, 17.482f)
            lineTo(12.532f, 15.966f)
            curveTo(12.358f, 15.989f, 12.18f, 16.001f, 12f, 16.001f)
            curveTo(10.679f, 16.001f, 9.508f, 15.36f, 8.779f, 14.373f)
            lineTo(6.985f, 15.221f)
            curveTo(6.995f, 15.313f, 7f, 15.406f, 7f, 15.501f)
            curveTo(7f, 16.881f, 5.881f, 18.001f, 4.5f, 18.001f)
            curveTo(3.119f, 18.001f, 2f, 16.881f, 2f, 15.501f)
            curveTo(2f, 14.12f, 3.119f, 13.001f, 4.5f, 13.001f)
            curveTo(5.248f, 13.001f, 5.919f, 13.329f, 6.377f, 13.849f)
            lineTo(8.131f, 13.02f)
            curveTo(8.046f, 12.695f, 8f, 12.353f, 8f, 12.001f)
            curveTo(8f, 11.033f, 8.344f, 10.146f, 8.915f, 9.454f)
            lineTo(7.924f, 8.325f)
            curveTo(7.638f, 8.438f, 7.326f, 8.501f, 7f, 8.501f)
            curveTo(5.619f, 8.501f, 4.5f, 7.381f, 4.5f, 6.001f)
            curveTo(4.5f, 4.62f, 5.619f, 3.501f, 7f, 3.501f)
            curveTo(8.381f, 3.501f, 9.5f, 4.62f, 9.5f, 6.001f)
            curveTo(9.5f, 6.509f, 9.348f, 6.982f, 9.088f, 7.377f)
            lineTo(10.071f, 8.496f)
            curveTo(10.643f, 8.18f, 11.3f, 8.001f, 12f, 8.001f)
            curveTo(12.505f, 8.001f, 12.989f, 8.094f, 13.434f, 8.266f)
            lineTo(14.679f, 6.206f)
            curveTo(14.258f, 5.758f, 14f, 5.155f, 14f, 4.492f)
            curveTo(14f, 3.111f, 15.119f, 1.992f, 16.5f, 1.992f)
            curveTo(17.881f, 1.992f, 19f, 3.111f, 19f, 4.492f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun IotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Iot, contentDescription = null)
    }
}
