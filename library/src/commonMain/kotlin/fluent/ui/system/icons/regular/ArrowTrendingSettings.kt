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

public val FluentUi.Regular.ArrowTrendingSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrendingSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 3f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            lineTo(21f, 8.75f)
            curveTo(21f, 9.164f, 20.664f, 9.5f, 20.25f, 9.5f)
            curveTo(19.836f, 9.5f, 19.5f, 9.164f, 19.5f, 8.75f)
            lineTo(19.5f, 5.561f)
            lineTo(13.53f, 11.53f)
            curveTo(13.237f, 11.823f, 12.763f, 11.823f, 12.47f, 11.53f)
            lineTo(10.25f, 9.311f)
            lineTo(4.28f, 15.28f)
            curveTo(3.987f, 15.573f, 3.513f, 15.573f, 3.22f, 15.28f)
            curveTo(2.927f, 14.987f, 2.927f, 14.513f, 3.22f, 14.22f)
            lineTo(9.72f, 7.72f)
            curveTo(10.013f, 7.427f, 10.487f, 7.427f, 10.78f, 7.72f)
            lineTo(13f, 9.939f)
            lineTo(18.439f, 4.5f)
            lineTo(15.25f, 4.5f)
            curveTo(14.836f, 4.5f, 14.5f, 4.164f, 14.5f, 3.75f)
            curveTo(14.5f, 3.336f, 14.836f, 3f, 15.25f, 3f)
            lineTo(20.25f, 3f)
            close()
            moveTo(14.278f, 13.975f)
            curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
            lineTo(12.253f, 16.616f)
            curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
            curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
            lineTo(12.799f, 18.553f)
            curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.064f)
            lineTo(14.062f, 21.695f)
            curveTo(14.502f, 22.08f, 15.002f, 22.394f, 15.547f, 22.617f)
            lineTo(16.04f, 22.098f)
            curveTo(16.828f, 21.268f, 18.151f, 21.269f, 18.939f, 22.098f)
            lineTo(19.438f, 22.623f)
            curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
            lineTo(20.722f, 21.024f)
            curveTo(20.408f, 19.934f, 21.062f, 18.801f, 22.164f, 18.528f)
            lineTo(22.747f, 18.383f)
            curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
            curveTo(22.816f, 17.185f, 22.79f, 16.876f, 22.741f, 16.576f)
            lineTo(22.202f, 16.446f)
            curveTo(21.09f, 16.178f, 20.428f, 15.033f, 20.752f, 13.936f)
            lineTo(20.938f, 13.305f)
            curveTo(20.499f, 12.919f, 19.999f, 12.606f, 19.454f, 12.383f)
            lineTo(18.961f, 12.902f)
            curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
            lineTo(15.563f, 12.377f)
            curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
            lineTo(14.278f, 13.975f)
            close()
            moveTo(17.5f, 19f)
            curveTo(16.699f, 19f, 16.051f, 18.328f, 16.051f, 17.5f)
            curveTo(16.051f, 16.671f, 16.699f, 16f, 17.5f, 16f)
            curveTo(18.301f, 16f, 18.95f, 16.671f, 18.95f, 17.5f)
            curveTo(18.95f, 18.328f, 18.301f, 19f, 17.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowTrendingSettings, contentDescription = null)
    }
}
