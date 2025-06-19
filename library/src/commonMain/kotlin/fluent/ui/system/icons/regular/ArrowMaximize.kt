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

public val FluentIcons.Regular.ArrowMaximize: ImageVector
    get() {
        if (_ArrowMaximize != null) {
            return _ArrowMaximize!!
        }
        _ArrowMaximize = ImageVector.Builder(
            name = "Regular.ArrowMaximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.304f, 4.002f)
                lineTo(19.404f, 4.016f)
                lineTo(19.503f, 4.043f)
                lineTo(19.563f, 4.069f)
                curveTo(19.642f, 4.104f, 19.717f, 4.155f, 19.782f, 4.22f)
                lineTo(19.822f, 4.264f)
                lineTo(19.883f, 4.345f)
                lineTo(19.92f, 4.41f)
                lineTo(19.959f, 4.5f)
                lineTo(19.979f, 4.564f)
                lineTo(19.991f, 4.628f)
                lineTo(20.001f, 4.722f)
                lineTo(20.002f, 12.255f)
                curveTo(20.002f, 12.669f, 19.666f, 13.005f, 19.252f, 13.005f)
                curveTo(18.872f, 13.005f, 18.559f, 12.722f, 18.509f, 12.356f)
                lineTo(18.502f, 12.255f)
                lineTo(18.501f, 6.559f)
                lineTo(6.561f, 18.504f)
                lineTo(12.252f, 18.505f)
                curveTo(12.632f, 18.505f, 12.946f, 18.787f, 12.995f, 19.153f)
                lineTo(13.002f, 19.255f)
                curveTo(13.002f, 19.635f, 12.719f, 19.948f, 12.354f, 19.998f)
                lineTo(12.252f, 20.005f)
                lineTo(4.716f, 20.004f)
                lineTo(4.687f, 20.001f)
                curveTo(4.621f, 19.996f, 4.558f, 19.983f, 4.499f, 19.962f)
                lineTo(4.408f, 19.923f)
                lineTo(4.392f, 19.912f)
                curveTo(4.187f, 19.802f, 4.04f, 19.599f, 4.007f, 19.359f)
                lineTo(4f, 19.255f)
                verticalLineTo(11.751f)
                curveTo(4f, 11.337f, 4.336f, 11.001f, 4.75f, 11.001f)
                curveTo(5.13f, 11.001f, 5.444f, 11.283f, 5.493f, 11.649f)
                lineTo(5.5f, 11.751f)
                verticalLineTo(17.443f)
                lineTo(17.44f, 5.5f)
                lineTo(11.75f, 5.501f)
                curveTo(11.37f, 5.501f, 11.057f, 5.219f, 11.007f, 4.853f)
                lineTo(11f, 4.751f)
                curveTo(11f, 4.371f, 11.282f, 4.057f, 11.648f, 4.008f)
                lineTo(11.75f, 4.001f)
                lineTo(19.304f, 4.002f)
                close()
            }
        }.build()

        return _ArrowMaximize!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMaximize: ImageVector? = null

@Preview
@Composable
private fun ArrowMaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowMaximize, contentDescription = null)
    }
}
