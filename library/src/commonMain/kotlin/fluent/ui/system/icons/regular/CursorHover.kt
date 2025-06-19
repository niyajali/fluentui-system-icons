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

public val FluentIcons.Regular.CursorHover: ImageVector
    get() {
        if (_CursorHover != null) {
            return _CursorHover!!
        }
        _CursorHover = ImageVector.Builder(
            name = "Regular.CursorHover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.5f, 5.5f)
                horizontalLineTo(4.5f)
                curveTo(3.948f, 5.5f, 3.5f, 5.948f, 3.5f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(3.5f, 16.052f, 3.948f, 16.5f, 4.5f, 16.5f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 18f, 2f, 16.881f, 2f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(2f, 5.119f, 3.119f, 4f, 4.5f, 4f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 4f, 22f, 5.119f, 22f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 16.718f, 21.128f, 17.733f, 19.975f, 17.955f)
                curveTo(19.9f, 17.518f, 19.66f, 17.114f, 19.285f, 16.839f)
                lineTo(18.946f, 16.5f)
                horizontalLineTo(19.5f)
                curveTo(20.052f, 16.5f, 20.5f, 16.052f, 20.5f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(20.5f, 5.948f, 20.052f, 5.5f, 19.5f, 5.5f)
                close()
                moveTo(11.28f, 10.22f)
                curveTo(11.066f, 10.005f, 10.743f, 9.941f, 10.463f, 10.057f)
                curveTo(10.183f, 10.173f, 10f, 10.447f, 10f, 10.75f)
                verticalLineTo(21.25f)
                curveTo(10f, 21.579f, 10.214f, 21.869f, 10.528f, 21.966f)
                curveTo(10.841f, 22.064f, 11.182f, 21.946f, 11.368f, 21.675f)
                lineTo(13.835f, 18.087f)
                lineTo(18.096f, 18.984f)
                curveTo(18.42f, 19.052f, 18.751f, 18.899f, 18.91f, 18.607f)
                curveTo(19.067f, 18.315f, 19.015f, 17.954f, 18.78f, 17.72f)
                lineTo(11.28f, 10.22f)
                close()
                moveTo(11.5f, 18.835f)
                verticalLineTo(12.561f)
                lineTo(15.936f, 16.996f)
                lineTo(13.655f, 16.516f)
                curveTo(13.358f, 16.454f, 13.054f, 16.576f, 12.882f, 16.825f)
                lineTo(11.5f, 18.835f)
                close()
            }
        }.build()

        return _CursorHover!!
    }

@Suppress("ObjectPropertyName")
private var _CursorHover: ImageVector? = null

@Preview
@Composable
private fun CursorHoverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CursorHover, contentDescription = null)
    }
}
