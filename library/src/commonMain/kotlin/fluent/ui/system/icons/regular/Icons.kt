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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Icons: ImageVector
    get() {
        if (_Icons != null) {
            return _Icons!!
        }
        _Icons = ImageVector.Builder(
            name = "Regular.Icons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 3.5f)
                curveTo(11.067f, 3.5f, 9.5f, 5.067f, 9.5f, 7f)
                curveTo(9.5f, 7.864f, 9.812f, 8.654f, 10.331f, 9.264f)
                curveTo(10.52f, 9.487f, 10.563f, 9.8f, 10.44f, 10.065f)
                curveTo(10.318f, 10.33f, 10.052f, 10.5f, 9.76f, 10.5f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 10.5f, 3.5f, 10.612f, 3.5f, 10.75f)
                verticalLineTo(11.75f)
                curveTo(3.5f, 14.649f, 5.851f, 17f, 8.75f, 17f)
                horizontalLineTo(11.968f)
                curveTo(12.118f, 17.109f, 12.287f, 17.196f, 12.472f, 17.254f)
                curveTo(12.189f, 17.662f, 11.947f, 18.08f, 11.745f, 18.5f)
                horizontalLineTo(8.75f)
                curveTo(5.022f, 18.5f, 2f, 15.478f, 2f, 11.75f)
                verticalLineTo(10.75f)
                curveTo(2f, 9.783f, 2.783f, 9f, 3.75f, 9f)
                horizontalLineTo(8.416f)
                curveTo(8.149f, 8.387f, 8f, 7.711f, 8f, 7f)
                curveTo(8f, 4.239f, 10.239f, 2f, 13f, 2f)
                curveTo(15.05f, 2f, 16.812f, 3.234f, 17.584f, 5f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 5f, 21f, 5.784f, 21f, 6.75f)
                curveTo(21f, 8.269f, 19.769f, 9.5f, 18.25f, 9.5f)
                horizontalLineTo(17.331f)
                curveTo(17.195f, 9.735f, 17.04f, 9.958f, 16.869f, 10.167f)
                curveTo(17.026f, 10.304f, 17.174f, 10.451f, 17.311f, 10.607f)
                curveTo(17.135f, 10.626f, 16.955f, 10.648f, 16.77f, 10.672f)
                curveTo(16.302f, 10.734f, 15.86f, 10.839f, 15.448f, 10.978f)
                curveTo(15.415f, 10.958f, 15.382f, 10.939f, 15.349f, 10.92f)
                curveTo(15.134f, 10.798f, 14.993f, 10.579f, 14.971f, 10.334f)
                curveTo(14.949f, 10.089f, 15.049f, 9.848f, 15.238f, 9.691f)
                curveTo(15.762f, 9.254f, 16.156f, 8.669f, 16.355f, 8f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 8f, 19.5f, 7.44f, 19.5f, 6.75f)
                curveTo(19.5f, 6.612f, 19.388f, 6.5f, 19.25f, 6.5f)
                horizontalLineTo(16.465f)
                curveTo(16.222f, 4.804f, 14.763f, 3.5f, 13f, 3.5f)
                close()
                moveTo(16.902f, 11.663f)
                curveTo(19.702f, 11.292f, 21.44f, 11.602f, 22.464f, 11.891f)
                curveTo(22.747f, 11.97f, 22.957f, 12.207f, 23.002f, 12.496f)
                curveTo(23.048f, 12.786f, 22.92f, 13.076f, 22.676f, 13.238f)
                curveTo(22.619f, 13.276f, 22.527f, 13.368f, 22.416f, 13.578f)
                curveTo(22.306f, 13.785f, 22.203f, 14.059f, 22.096f, 14.403f)
                curveTo(22.008f, 14.687f, 21.925f, 14.994f, 21.835f, 15.328f)
                lineTo(21.778f, 15.54f)
                curveTo(21.666f, 15.95f, 21.544f, 16.39f, 21.396f, 16.826f)
                curveTo(21.104f, 17.688f, 20.692f, 18.608f, 19.999f, 19.314f)
                curveTo(19.28f, 20.047f, 18.304f, 20.504f, 17f, 20.504f)
                curveTo(15.671f, 20.504f, 14.743f, 19.965f, 14.15f, 19.345f)
                curveTo(13.746f, 20.085f, 13.536f, 20.782f, 13.504f, 21.296f)
                curveTo(13.479f, 21.71f, 13.123f, 22.024f, 12.71f, 21.999f)
                curveTo(12.297f, 21.974f, 11.982f, 21.618f, 12.007f, 21.205f)
                curveTo(12.076f, 20.066f, 12.672f, 18.631f, 13.669f, 17.361f)
                curveTo(14.678f, 16.077f, 16.15f, 14.894f, 18.05f, 14.321f)
                curveTo(18.447f, 14.202f, 18.865f, 14.426f, 18.985f, 14.823f)
                curveTo(19.104f, 15.219f, 18.879f, 15.638f, 18.483f, 15.757f)
                curveTo(17.035f, 16.194f, 15.873f, 17.069f, 15.031f, 18.065f)
                curveTo(15.342f, 18.507f, 15.953f, 19.004f, 17f, 19.004f)
                curveTo(17.911f, 19.004f, 18.498f, 18.702f, 18.928f, 18.264f)
                curveTo(19.385f, 17.798f, 19.708f, 17.134f, 19.975f, 16.345f)
                curveTo(20.107f, 15.955f, 20.22f, 15.553f, 20.33f, 15.147f)
                lineTo(20.385f, 14.946f)
                curveTo(20.475f, 14.611f, 20.566f, 14.272f, 20.663f, 13.959f)
                curveTo(20.754f, 13.668f, 20.855f, 13.376f, 20.978f, 13.106f)
                curveTo(20.084f, 12.975f, 18.827f, 12.922f, 17.098f, 13.15f)
                curveTo(15.099f, 13.415f, 13.974f, 14.873f, 13.723f, 15.785f)
                curveTo(13.613f, 16.184f, 13.2f, 16.419f, 12.801f, 16.309f)
                curveTo(12.402f, 16.199f, 12.167f, 15.787f, 12.277f, 15.387f)
                curveTo(12.673f, 13.945f, 14.255f, 12.014f, 16.902f, 11.663f)
                close()
            }
        }.build()

        return _Icons!!
    }

@Suppress("ObjectPropertyName")
private var _Icons: ImageVector? = null

@Preview
@Composable
private fun IconsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Icons, contentDescription = null)
    }
}
