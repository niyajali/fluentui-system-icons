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

public val FluentUi.Filled.DrawText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrawText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.243f, 13.149f)
            horizontalLineTo(7.758f)
            lineTo(10f, 6.744f)
            lineTo(12.243f, 13.149f)
            close()
            moveTo(12.943f, 15.149f)
            lineTo(13.271f, 16.084f)
            lineTo(14.84f, 14.514f)
            lineTo(11.075f, 3.763f)
            curveTo(10.719f, 2.746f, 9.281f, 2.746f, 8.925f, 3.763f)
            lineTo(4.056f, 17.67f)
            curveTo(3.873f, 18.191f, 4.148f, 18.762f, 4.669f, 18.944f)
            curveTo(5.19f, 19.127f, 5.761f, 18.852f, 5.944f, 18.331f)
            lineTo(7.058f, 15.149f)
            horizontalLineTo(12.943f)
            close()
            moveTo(13.197f, 17.572f)
            lineTo(19.099f, 11.67f)
            curveTo(19.992f, 10.777f, 21.439f, 10.777f, 22.332f, 11.67f)
            curveTo(23.224f, 12.562f, 23.224f, 14.009f, 22.332f, 14.902f)
            lineTo(16.429f, 20.804f)
            curveTo(16.085f, 21.149f, 15.654f, 21.393f, 15.182f, 21.511f)
            lineTo(13.351f, 21.968f)
            curveTo(13.301f, 21.981f, 13.252f, 21.99f, 13.203f, 21.995f)
            curveTo(12.612f, 22.199f, 10.223f, 22.569f, 9.375f, 21.907f)
            curveTo(8.801f, 21.459f, 8.915f, 20.573f, 9.157f, 20.089f)
            curveTo(9.196f, 20.011f, 9.138f, 19.91f, 9.052f, 19.923f)
            curveTo(8.391f, 20.026f, 7.809f, 20.374f, 7.225f, 20.722f)
            curveTo(6.442f, 21.19f, 5.656f, 21.658f, 4.676f, 21.537f)
            curveTo(3.697f, 21.415f, 3.208f, 20.811f, 2.966f, 20.282f)
            curveTo(2.867f, 20.066f, 3.145f, 19.881f, 3.354f, 19.995f)
            curveTo(3.823f, 20.25f, 4.46f, 20.491f, 4.985f, 20.374f)
            curveTo(5.36f, 20.291f, 5.889f, 19.917f, 6.481f, 19.498f)
            curveTo(7.547f, 18.745f, 8.818f, 17.845f, 9.773f, 18.23f)
            curveTo(10.612f, 18.567f, 11.233f, 19.381f, 10.803f, 20.343f)
            curveTo(10.751f, 20.461f, 10.804f, 20.607f, 10.93f, 20.635f)
            curveTo(11.353f, 20.733f, 11.708f, 20.702f, 12.063f, 20.531f)
            lineTo(12.491f, 18.819f)
            curveTo(12.609f, 18.347f, 12.853f, 17.916f, 13.197f, 17.572f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrawTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DrawText, contentDescription = null)
    }
}
