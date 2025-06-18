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

public val FluentUi.Filled.StarSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarSettings",
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
            curveTo(19.742f, 11.301f, 18.656f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 18.11f, 11.084f, 18.701f, 11.241f, 19.261f)
            lineTo(7.283f, 21.342f)
            curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
            lineTo(6.224f, 14.668f)
            lineTo(2.409f, 10.949f)
            curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
            lineTo(8.43f, 7.88f)
            lineTo(10.788f, 3.102f)
            close()
            moveTo(14.278f, 13.975f)
            curveTo(14.593f, 15.065f, 13.939f, 16.199f, 12.837f, 16.471f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.903f, 12.185f, 17.198f, 12.185f, 17.499f)
            curveTo(12.185f, 17.814f, 12.21f, 18.122f, 12.259f, 18.423f)
            lineTo(12.799f, 18.553f)
            curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.063f)
            lineTo(14.062f, 21.694f)
            curveTo(14.501f, 22.08f, 15.002f, 22.393f, 15.546f, 22.616f)
            lineTo(16.04f, 22.097f)
            curveTo(16.828f, 21.268f, 18.151f, 21.268f, 18.939f, 22.098f)
            lineTo(19.438f, 22.622f)
            curveTo(19.981f, 22.402f, 20.481f, 22.092f, 20.92f, 21.71f)
            lineTo(20.722f, 21.024f)
            curveTo(20.408f, 19.933f, 21.062f, 18.8f, 22.163f, 18.528f)
            lineTo(22.747f, 18.383f)
            curveTo(22.792f, 18.095f, 22.816f, 17.8f, 22.816f, 17.499f)
            curveTo(22.816f, 17.185f, 22.79f, 16.876f, 22.741f, 16.576f)
            lineTo(22.202f, 16.446f)
            curveTo(21.089f, 16.178f, 20.428f, 15.033f, 20.752f, 13.936f)
            lineTo(20.938f, 13.305f)
            curveTo(20.499f, 12.919f, 19.999f, 12.606f, 19.454f, 12.383f)
            lineTo(18.961f, 12.901f)
            curveTo(18.172f, 13.731f, 16.85f, 13.73f, 16.062f, 12.901f)
            lineTo(15.563f, 12.376f)
            curveTo(15.019f, 12.596f, 14.519f, 12.906f, 14.08f, 13.289f)
            lineTo(14.278f, 13.975f)
            close()
            moveTo(17.5f, 18.999f)
            curveTo(16.699f, 18.999f, 16.05f, 18.328f, 16.05f, 17.499f)
            curveTo(16.05f, 16.671f, 16.699f, 15.999f, 17.5f, 15.999f)
            curveTo(18.301f, 15.999f, 18.95f, 16.671f, 18.95f, 17.499f)
            curveTo(18.95f, 18.328f, 18.301f, 18.999f, 17.5f, 18.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarSettings, contentDescription = null)
    }
}
