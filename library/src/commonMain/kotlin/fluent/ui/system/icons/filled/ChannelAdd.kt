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

public val FluentUi.Filled.ChannelAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChannelAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(19.99f, 11.375f, 18.789f, 11f, 17.5f, 11f)
            curveTo(15.655f, 11f, 13.99f, 11.769f, 12.807f, 13.003f)
            horizontalLineTo(8.748f)
            lineTo(8.646f, 13.01f)
            curveTo(8.28f, 13.06f, 7.998f, 13.373f, 7.998f, 13.753f)
            curveTo(7.998f, 14.133f, 8.28f, 14.446f, 8.646f, 14.496f)
            lineTo(8.748f, 14.503f)
            horizontalLineTo(11.731f)
            curveTo(11.264f, 15.4f, 11f, 16.419f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            lineTo(3f, 9.372f)
            curveTo(3.234f, 9.455f, 3.487f, 9.5f, 3.75f, 9.5f)
            curveTo(4.993f, 9.5f, 6f, 8.493f, 6f, 7.25f)
            curveTo(6f, 6.007f, 4.993f, 5f, 3.75f, 5f)
            curveTo(3.569f, 5f, 3.393f, 5.021f, 3.224f, 5.062f)
            curveTo(3.698f, 3.855f, 4.874f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(15.252f, 9.496f)
            horizontalLineTo(8.748f)
            lineTo(8.646f, 9.503f)
            curveTo(8.28f, 9.553f, 7.998f, 9.867f, 7.998f, 10.246f)
            curveTo(7.998f, 10.626f, 8.28f, 10.94f, 8.646f, 10.989f)
            lineTo(8.748f, 10.996f)
            horizontalLineTo(15.252f)
            lineTo(15.354f, 10.989f)
            curveTo(15.72f, 10.94f, 16.002f, 10.626f, 16.002f, 10.246f)
            curveTo(16.002f, 9.832f, 15.667f, 9.496f, 15.252f, 9.496f)
            close()
            moveTo(3.75f, 6f)
            curveTo(4.441f, 6f, 5f, 6.56f, 5f, 7.25f)
            curveTo(5f, 7.941f, 4.441f, 8.5f, 3.75f, 8.5f)
            curveTo(3.06f, 8.5f, 2.5f, 7.941f, 2.5f, 7.25f)
            curveTo(2.5f, 6.56f, 3.06f, 6f, 3.75f, 6f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChannelAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChannelAdd, contentDescription = null)
    }
}
