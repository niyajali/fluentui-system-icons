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

public val FluentUi.Regular.DrawShape: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrawShape",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.249f, 3f)
            curveTo(4.455f, 3f, 2.999f, 4.455f, 2.999f, 6.25f)
            lineTo(2.999f, 19.254f)
            curveTo(2.999f, 19.668f, 3.335f, 20.004f, 3.749f, 20.004f)
            curveTo(4.164f, 20.004f, 4.499f, 19.668f, 4.499f, 19.254f)
            lineTo(4.499f, 6.25f)
            curveTo(4.499f, 5.284f, 5.283f, 4.5f, 6.249f, 4.5f)
            horizontalLineTo(17.749f)
            curveTo(18.716f, 4.5f, 19.499f, 5.284f, 19.499f, 6.25f)
            verticalLineTo(11.232f)
            curveTo(19.978f, 11.042f, 20.493f, 10.969f, 20.999f, 11.012f)
            verticalLineTo(6.25f)
            curveTo(20.999f, 4.455f, 19.544f, 3f, 17.749f, 3f)
            horizontalLineTo(6.249f)
            close()
            moveTo(13.197f, 18.572f)
            lineTo(19.099f, 12.67f)
            curveTo(19.992f, 11.777f, 21.439f, 11.777f, 22.332f, 12.67f)
            curveTo(23.224f, 13.562f, 23.224f, 15.009f, 22.332f, 15.902f)
            lineTo(16.429f, 21.804f)
            curveTo(16.085f, 22.149f, 15.654f, 22.393f, 15.182f, 22.511f)
            lineTo(13.351f, 22.968f)
            curveTo(13.301f, 22.981f, 13.252f, 22.99f, 13.203f, 22.995f)
            curveTo(12.612f, 23.199f, 10.223f, 23.569f, 9.375f, 22.907f)
            curveTo(8.801f, 22.459f, 8.915f, 21.573f, 9.157f, 21.089f)
            curveTo(9.196f, 21.011f, 9.138f, 20.91f, 9.052f, 20.923f)
            curveTo(8.391f, 21.026f, 7.809f, 21.374f, 7.225f, 21.722f)
            curveTo(6.442f, 22.19f, 5.656f, 22.658f, 4.676f, 22.537f)
            curveTo(3.697f, 22.415f, 3.208f, 21.811f, 2.966f, 21.282f)
            curveTo(2.867f, 21.066f, 3.145f, 20.881f, 3.354f, 20.995f)
            curveTo(3.823f, 21.25f, 4.46f, 21.491f, 4.985f, 21.374f)
            curveTo(5.36f, 21.291f, 5.889f, 20.917f, 6.481f, 20.498f)
            curveTo(7.547f, 19.745f, 8.818f, 18.845f, 9.773f, 19.23f)
            curveTo(10.612f, 19.567f, 11.233f, 20.381f, 10.803f, 21.343f)
            curveTo(10.751f, 21.461f, 10.804f, 21.607f, 10.93f, 21.635f)
            curveTo(11.353f, 21.733f, 11.708f, 21.702f, 12.063f, 21.531f)
            lineTo(12.491f, 19.819f)
            curveTo(12.609f, 19.347f, 12.853f, 18.916f, 13.197f, 18.572f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrawShapePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DrawShape, contentDescription = null)
    }
}
