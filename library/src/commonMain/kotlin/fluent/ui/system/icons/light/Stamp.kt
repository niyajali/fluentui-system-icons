package fluent.ui.system.icons.light

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

public val FluentUi.Light.Stamp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Stamp",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.171f, 4.172f)
            curveTo(23.734f, 2.609f, 26.266f, 2.609f, 27.828f, 4.172f)
            curveTo(29.39f, 5.734f, 29.39f, 8.266f, 27.828f, 9.828f)
            curveTo(27.102f, 10.555f, 25.436f, 11.715f, 24.001f, 12.667f)
            curveTo(23.274f, 13.149f, 22.589f, 13.589f, 22.087f, 13.907f)
            curveTo(21.982f, 13.974f, 21.885f, 14.035f, 21.798f, 14.091f)
            lineTo(25.025f, 17.318f)
            curveTo(26.782f, 19.075f, 26.782f, 21.925f, 25.025f, 23.682f)
            lineTo(21.56f, 27.146f)
            curveTo(20.975f, 27.732f, 20.025f, 27.732f, 19.439f, 27.146f)
            lineTo(18.5f, 26.207f)
            lineTo(15.561f, 29.146f)
            curveTo(14.975f, 29.732f, 14.025f, 29.732f, 13.439f, 29.146f)
            lineTo(2.853f, 18.561f)
            curveTo(2.268f, 17.975f, 2.268f, 17.025f, 2.853f, 16.439f)
            lineTo(5.793f, 13.5f)
            lineTo(4.853f, 12.561f)
            curveTo(4.268f, 11.975f, 4.268f, 11.025f, 4.853f, 10.439f)
            lineTo(8.318f, 6.975f)
            curveTo(10.075f, 5.218f, 12.925f, 5.218f, 14.682f, 6.975f)
            lineTo(17.909f, 10.202f)
            curveTo(17.965f, 10.115f, 18.026f, 10.017f, 18.093f, 9.913f)
            curveTo(18.411f, 9.41f, 18.851f, 8.726f, 19.333f, 7.999f)
            curveTo(20.285f, 6.564f, 21.445f, 4.898f, 22.171f, 4.172f)
            close()
            moveTo(21.072f, 13.365f)
            curveTo(21.201f, 13.284f, 21.364f, 13.182f, 21.551f, 13.063f)
            curveTo(22.05f, 12.747f, 22.728f, 12.311f, 23.448f, 11.833f)
            curveTo(24.909f, 10.865f, 26.481f, 9.762f, 27.121f, 9.121f)
            curveTo(28.293f, 7.95f, 28.293f, 6.05f, 27.121f, 4.879f)
            curveTo(25.95f, 3.707f, 24.05f, 3.707f, 22.879f, 4.879f)
            curveTo(22.238f, 5.519f, 21.135f, 7.091f, 20.167f, 8.552f)
            curveTo(19.689f, 9.272f, 19.253f, 9.95f, 18.937f, 10.448f)
            curveTo(18.818f, 10.636f, 18.715f, 10.798f, 18.635f, 10.927f)
            lineTo(21.072f, 13.365f)
            close()
            moveTo(13.975f, 7.682f)
            curveTo(12.608f, 6.315f, 10.392f, 6.315f, 9.025f, 7.682f)
            lineTo(5.561f, 11.146f)
            curveTo(5.365f, 11.342f, 5.365f, 11.658f, 5.561f, 11.854f)
            lineTo(20.146f, 26.439f)
            curveTo(20.342f, 26.635f, 20.658f, 26.635f, 20.853f, 26.439f)
            lineTo(24.318f, 22.975f)
            curveTo(25.685f, 21.608f, 25.685f, 19.392f, 24.318f, 18.025f)
            lineTo(13.975f, 7.682f)
            close()
            moveTo(3.561f, 17.146f)
            curveTo(3.365f, 17.342f, 3.365f, 17.658f, 3.561f, 17.854f)
            lineTo(14.146f, 28.439f)
            curveTo(14.342f, 28.635f, 14.658f, 28.635f, 14.853f, 28.439f)
            lineTo(17.793f, 25.5f)
            lineTo(6.5f, 14.207f)
            lineTo(3.561f, 17.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StampPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Stamp, contentDescription = null)
    }
}
