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

public val FluentIcons.Filled.PlugDisconnected: ImageVector
    get() {
        if (_PlugDisconnected != null) {
            return _PlugDisconnected!!
        }
        _PlugDisconnected = ImageVector.Builder(
            name = "Filled.PlugDisconnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.707f, 3.707f)
                curveTo(22.098f, 3.317f, 22.098f, 2.683f, 21.707f, 2.293f)
                curveTo(21.317f, 1.902f, 20.683f, 1.902f, 20.293f, 2.293f)
                lineTo(18.496f, 4.09f)
                curveTo(16.855f, 3.068f, 14.67f, 3.269f, 13.245f, 4.694f)
                lineTo(12.177f, 5.763f)
                curveTo(11.493f, 6.446f, 11.493f, 7.554f, 12.177f, 8.237f)
                lineTo(15.762f, 11.823f)
                curveTo(16.446f, 12.507f, 17.554f, 12.507f, 18.237f, 11.823f)
                lineTo(19.305f, 10.755f)
                curveTo(20.731f, 9.33f, 20.932f, 7.145f, 19.91f, 5.504f)
                lineTo(21.707f, 3.707f)
                close()
                moveTo(10.707f, 11.707f)
                curveTo(11.098f, 11.317f, 11.098f, 10.683f, 10.707f, 10.293f)
                curveTo(10.317f, 9.902f, 9.683f, 9.902f, 9.293f, 10.293f)
                lineTo(7.823f, 11.763f)
                lineTo(7.53f, 11.47f)
                curveTo(7.237f, 11.177f, 6.763f, 11.177f, 6.47f, 11.47f)
                lineTo(4.695f, 13.245f)
                curveTo(3.269f, 14.67f, 3.068f, 16.855f, 4.09f, 18.496f)
                lineTo(2.293f, 20.293f)
                curveTo(1.902f, 20.683f, 1.902f, 21.317f, 2.293f, 21.707f)
                curveTo(2.683f, 22.098f, 3.317f, 22.098f, 3.707f, 21.707f)
                lineTo(5.504f, 19.91f)
                curveTo(7.145f, 20.932f, 9.33f, 20.731f, 10.755f, 19.306f)
                lineTo(12.53f, 17.53f)
                curveTo(12.823f, 17.237f, 12.823f, 16.763f, 12.53f, 16.47f)
                lineTo(12.237f, 16.177f)
                lineTo(13.707f, 14.707f)
                curveTo(14.098f, 14.317f, 14.098f, 13.683f, 13.707f, 13.293f)
                curveTo(13.317f, 12.902f, 12.683f, 12.902f, 12.293f, 13.293f)
                lineTo(10.823f, 14.763f)
                lineTo(9.237f, 13.177f)
                lineTo(10.707f, 11.707f)
                close()
            }
        }.build()

        return _PlugDisconnected!!
    }

@Suppress("ObjectPropertyName")
private var _PlugDisconnected: ImageVector? = null

@Preview
@Composable
private fun PlugDisconnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PlugDisconnected, contentDescription = null)
    }
}
