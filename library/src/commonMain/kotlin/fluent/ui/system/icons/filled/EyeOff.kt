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

public val FluentUi.Filled.EyeOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EyeOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.22f, 2.22f)
            curveTo(1.953f, 2.486f, 1.929f, 2.903f, 2.147f, 3.196f)
            lineTo(2.22f, 3.28f)
            lineTo(6.254f, 7.315f)
            curveTo(4.332f, 8.664f, 2.896f, 10.68f, 2.299f, 13.064f)
            curveTo(2.198f, 13.466f, 2.443f, 13.873f, 2.844f, 13.974f)
            curveTo(3.246f, 14.075f, 3.653f, 13.83f, 3.754f, 13.429f)
            curveTo(4.283f, 11.314f, 5.591f, 9.539f, 7.334f, 8.395f)
            lineTo(9.144f, 10.204f)
            curveTo(8.436f, 10.926f, 8f, 11.914f, 8f, 13.005f)
            curveTo(8f, 15.214f, 9.791f, 17.005f, 12f, 17.005f)
            curveTo(13.09f, 17.005f, 14.079f, 16.568f, 14.8f, 15.861f)
            lineTo(20.72f, 21.78f)
            curveTo(21.013f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
            curveTo(22.047f, 21.514f, 22.071f, 21.097f, 21.853f, 20.804f)
            lineTo(21.78f, 20.72f)
            lineTo(15.667f, 14.606f)
            lineTo(15.668f, 14.604f)
            lineTo(8.719f, 7.658f)
            lineTo(8.72f, 7.656f)
            lineTo(7.587f, 6.525f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            close()
            moveTo(12f, 5.5f)
            curveTo(11f, 5.5f, 10.029f, 5.648f, 9.111f, 5.925f)
            lineTo(10.348f, 7.161f)
            curveTo(10.884f, 7.055f, 11.436f, 7f, 12f, 7f)
            curveTo(15.923f, 7f, 19.31f, 9.68f, 20.247f, 13.433f)
            curveTo(20.347f, 13.835f, 20.755f, 14.079f, 21.156f, 13.979f)
            curveTo(21.558f, 13.879f, 21.803f, 13.472f, 21.702f, 13.07f)
            curveTo(20.599f, 8.653f, 16.615f, 5.5f, 12f, 5.5f)
            close()
            moveTo(12.195f, 9.009f)
            lineTo(15.996f, 12.81f)
            curveTo(15.894f, 10.753f, 14.247f, 9.108f, 12.195f, 9.009f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EyeOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EyeOff, contentDescription = null)
    }
}
