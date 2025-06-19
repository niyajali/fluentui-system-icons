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

public val FluentIcons.Regular.MountainLocationBottom: ImageVector
    get() {
        if (_MountainLocationBottom != null) {
            return _MountainLocationBottom!!
        }
        _MountainLocationBottom = ImageVector.Builder(
            name = "Regular.MountainLocationBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.923f, 2.785f)
                curveTo(12.854f, 1.739f, 11.146f, 1.739f, 10.077f, 2.785f)
                lineTo(2.978f, 9.729f)
                curveTo(2.352f, 10.34f, 2f, 11.177f, 2f, 12.052f)
                verticalLineTo(18.75f)
                curveTo(2f, 19.993f, 3.007f, 21f, 4.25f, 21f)
                horizontalLineTo(10.29f)
                curveTo(9.969f, 20.567f, 9.599f, 20.045f, 9.255f, 19.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 19.5f, 3.5f, 19.164f, 3.5f, 18.75f)
                verticalLineTo(12.052f)
                curveTo(3.5f, 11.581f, 3.69f, 11.13f, 4.026f, 10.801f)
                lineTo(4.958f, 9.89f)
                curveTo(6.119f, 10.665f, 7.233f, 11.005f, 8.328f, 11.042f)
                curveTo(9.53f, 11.083f, 10.647f, 10.757f, 11.689f, 10.365f)
                curveTo(12.127f, 10.2f, 12.533f, 10.032f, 12.931f, 9.867f)
                curveTo(13.535f, 9.617f, 14.12f, 9.376f, 14.767f, 9.165f)
                curveTo(15.769f, 8.838f, 16.778f, 8.642f, 17.868f, 8.741f)
                lineTo(19.974f, 10.801f)
                curveTo(20.31f, 11.13f, 20.5f, 11.581f, 20.5f, 12.052f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(14.745f)
                curveTo(14.401f, 20.045f, 14.031f, 20.567f, 13.71f, 21f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 21f, 22f, 19.993f, 22f, 18.75f)
                verticalLineTo(12.052f)
                curveTo(22f, 11.177f, 21.648f, 10.34f, 21.022f, 9.729f)
                lineTo(13.923f, 2.785f)
                close()
                moveTo(11.126f, 3.857f)
                curveTo(11.612f, 3.382f, 12.388f, 3.382f, 12.874f, 3.857f)
                lineTo(16.363f, 7.27f)
                curveTo(15.636f, 7.354f, 14.951f, 7.527f, 14.302f, 7.739f)
                curveTo(13.62f, 7.961f, 12.918f, 8.25f, 12.261f, 8.52f)
                curveTo(11.874f, 8.679f, 11.502f, 8.832f, 11.161f, 8.961f)
                curveTo(10.178f, 9.331f, 9.283f, 9.574f, 8.379f, 9.543f)
                curveTo(7.663f, 9.518f, 6.902f, 9.321f, 6.059f, 8.813f)
                lineTo(11.126f, 3.857f)
                close()
                moveTo(11.264f, 20.631f)
                curveTo(11.439f, 20.862f, 11.69f, 20.985f, 11.946f, 21f)
                curveTo(11.982f, 21.002f, 12.018f, 21.002f, 12.054f, 21f)
                curveTo(12.31f, 20.985f, 12.561f, 20.862f, 12.736f, 20.631f)
                curveTo(12.983f, 20.306f, 13.267f, 19.916f, 13.55f, 19.5f)
                curveTo(14.283f, 18.418f, 15f, 17.153f, 15f, 16.343f)
                curveTo(15f, 14.686f, 13.657f, 13f, 12f, 13f)
                curveTo(10.343f, 13f, 9f, 14.686f, 9f, 16.343f)
                curveTo(9f, 17.153f, 9.717f, 18.418f, 10.45f, 19.5f)
                curveTo(10.733f, 19.916f, 11.017f, 20.306f, 11.264f, 20.631f)
                close()
                moveTo(13.5f, 16f)
                curveTo(13.5f, 16.828f, 12.828f, 17.5f, 12f, 17.5f)
                curveTo(11.172f, 17.5f, 10.5f, 16.828f, 10.5f, 16f)
                curveTo(10.5f, 15.172f, 11.172f, 14.5f, 12f, 14.5f)
                curveTo(12.828f, 14.5f, 13.5f, 15.172f, 13.5f, 16f)
                close()
            }
        }.build()

        return _MountainLocationBottom!!
    }

@Suppress("ObjectPropertyName")
private var _MountainLocationBottom: ImageVector? = null

@Preview
@Composable
private fun MountainLocationBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MountainLocationBottom, contentDescription = null)
    }
}
