package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.DrawShape: ImageVector
    get() {
        if (_DrawShape != null) {
            return _DrawShape!!
        }
        _DrawShape = ImageVector.Builder(
            name = "Filled.DrawShape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.999f, 6.25f)
                curveTo(2.999f, 4.455f, 4.455f, 3f, 6.249f, 3f)
                horizontalLineTo(17.749f)
                curveTo(19.544f, 3f, 20.999f, 4.455f, 20.999f, 6.25f)
                verticalLineTo(11.012f)
                curveTo(20.066f, 10.931f, 19.104f, 11.248f, 18.389f, 11.962f)
                lineTo(12.487f, 17.865f)
                curveTo(12.049f, 18.302f, 11.729f, 18.843f, 11.556f, 19.435f)
                curveTo(11.211f, 18.899f, 10.686f, 18.52f, 10.144f, 18.302f)
                curveTo(9.453f, 18.024f, 8.759f, 18.142f, 8.208f, 18.337f)
                curveTo(7.96f, 18.426f, 7.715f, 18.538f, 7.479f, 18.663f)
                curveTo(7.453f, 18.689f, 7.423f, 18.712f, 7.39f, 18.733f)
                lineTo(5.693f, 19.77f)
                curveTo(5.226f, 20.045f, 4.786f, 20.135f, 4.395f, 20.105f)
                curveTo(4.009f, 20.075f, 3.705f, 19.932f, 3.495f, 19.794f)
                curveTo(3.108f, 19.539f, 2.999f, 19.111f, 2.999f, 18.789f)
                verticalLineTo(17.75f)
                curveTo(2.999f, 17.75f, 2.999f, 17.75f, 2.999f, 17.75f)
                lineTo(2.999f, 6.25f)
                close()
                moveTo(19.099f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.063f, 21.531f)
                curveTo(11.708f, 21.702f, 11.353f, 21.733f, 10.93f, 21.635f)
                curveTo(10.804f, 21.607f, 10.751f, 21.461f, 10.803f, 21.343f)
                curveTo(11.233f, 20.381f, 10.612f, 19.567f, 9.773f, 19.23f)
                curveTo(8.818f, 18.845f, 7.547f, 19.745f, 6.481f, 20.498f)
                curveTo(5.889f, 20.917f, 5.36f, 21.291f, 4.985f, 21.374f)
                curveTo(4.46f, 21.491f, 3.823f, 21.25f, 3.354f, 20.995f)
                curveTo(3.145f, 20.881f, 2.867f, 21.066f, 2.966f, 21.282f)
                curveTo(3.208f, 21.811f, 3.697f, 22.415f, 4.676f, 22.537f)
                curveTo(5.656f, 22.658f, 6.442f, 22.19f, 7.225f, 21.722f)
                curveTo(7.809f, 21.374f, 8.391f, 21.026f, 9.052f, 20.923f)
                curveTo(9.138f, 20.91f, 9.196f, 21.011f, 9.157f, 21.089f)
                curveTo(8.915f, 21.573f, 8.801f, 22.459f, 9.375f, 22.907f)
                curveTo(10.223f, 23.569f, 12.612f, 23.199f, 13.203f, 22.995f)
                curveTo(13.252f, 22.99f, 13.301f, 22.981f, 13.351f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.654f, 22.393f, 16.085f, 22.149f, 16.429f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.224f, 15.009f, 23.224f, 13.562f, 22.332f, 12.67f)
                curveTo(21.439f, 11.777f, 19.992f, 11.777f, 19.099f, 12.67f)
                close()
            }
        }.build()

        return _DrawShape!!
    }

@Suppress("ObjectPropertyName")
private var _DrawShape: ImageVector? = null

@Preview
@Composable
private fun DrawShapePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DrawShape, contentDescription = null)
    }
}
