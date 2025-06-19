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

public val FluentIcons.Filled.ChannelSubtract: ImageVector
    get() {
        if (_ChannelSubtract != null) {
            return _ChannelSubtract!!
        }
        _ChannelSubtract = ImageVector.Builder(
            name = "Filled.ChannelSubtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.874f, 3f, 3.698f, 3.855f, 3.224f, 5.062f)
                curveTo(3.393f, 5.021f, 3.569f, 5f, 3.75f, 5f)
                curveTo(4.993f, 5f, 6f, 6.007f, 6f, 7.25f)
                curveTo(6f, 8.493f, 4.993f, 9.5f, 3.75f, 9.5f)
                curveTo(3.487f, 9.5f, 3.234f, 9.455f, 3f, 9.372f)
                lineTo(3f, 17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(12.022f)
                curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
                curveTo(11f, 16.419f, 11.264f, 15.4f, 11.731f, 14.503f)
                horizontalLineTo(8.748f)
                lineTo(8.646f, 14.496f)
                curveTo(8.28f, 14.446f, 7.998f, 14.133f, 7.998f, 13.753f)
                curveTo(7.998f, 13.373f, 8.28f, 13.06f, 8.646f, 13.01f)
                lineTo(8.748f, 13.003f)
                horizontalLineTo(12.807f)
                curveTo(13.99f, 11.769f, 15.655f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                verticalLineTo(6.25f)
                close()
                moveTo(8.748f, 9.496f)
                horizontalLineTo(15.252f)
                curveTo(15.667f, 9.496f, 16.002f, 9.832f, 16.002f, 10.246f)
                curveTo(16.002f, 10.626f, 15.72f, 10.94f, 15.354f, 10.989f)
                lineTo(15.252f, 10.996f)
                horizontalLineTo(8.748f)
                lineTo(8.646f, 10.989f)
                curveTo(8.28f, 10.94f, 7.998f, 10.626f, 7.998f, 10.246f)
                curveTo(7.998f, 9.867f, 8.28f, 9.553f, 8.646f, 9.503f)
                lineTo(8.748f, 9.496f)
                close()
                moveTo(5f, 7.25f)
                curveTo(5f, 6.56f, 4.441f, 6f, 3.75f, 6f)
                curveTo(3.06f, 6f, 2.5f, 6.56f, 2.5f, 7.25f)
                curveTo(2.5f, 7.941f, 3.06f, 8.5f, 3.75f, 8.5f)
                curveTo(4.441f, 8.5f, 5f, 7.941f, 5f, 7.25f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(20.497f, 18f)
                curveTo(20.772f, 18f, 20.996f, 17.776f, 20.996f, 17.5f)
                curveTo(20.996f, 17.224f, 20.772f, 17f, 20.497f, 17f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.22f, 18f, 14.496f, 18f)
                horizontalLineTo(20.497f)
                close()
            }
        }.build()

        return _ChannelSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _ChannelSubtract: ImageVector? = null

@Preview
@Composable
private fun ChannelSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChannelSubtract, contentDescription = null)
    }
}
