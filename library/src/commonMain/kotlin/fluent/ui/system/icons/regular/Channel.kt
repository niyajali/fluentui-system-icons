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

public val FluentUi.Regular.Channel: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Channel",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.483f, 3f, 20.899f, 4.356f, 20.995f, 6.066f)
            lineTo(21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.483f, 19.644f, 20.899f, 17.934f, 20.995f)
            lineTo(17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.517f, 21f, 3.101f, 19.643f, 3.005f, 17.934f)
            lineTo(3f, 17.75f)
            lineTo(3f, 9.372f)
            curveTo(3.234f, 9.455f, 3.487f, 9.5f, 3.75f, 9.5f)
            curveTo(4.013f, 9.5f, 4.266f, 9.455f, 4.5f, 9.372f)
            lineTo(4.5f, 17.75f)
            curveTo(4.5f, 18.668f, 5.207f, 19.421f, 6.107f, 19.494f)
            lineTo(6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.668f, 19.5f, 19.421f, 18.793f, 19.494f, 17.893f)
            lineTo(19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.332f, 18.793f, 4.579f, 17.894f, 4.506f)
            lineTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.65f, 4.5f, 5.12f, 4.802f, 4.805f, 5.263f)
            curveTo(4.491f, 5.095f, 4.132f, 5f, 3.75f, 5f)
            curveTo(3.569f, 5f, 3.393f, 5.021f, 3.224f, 5.062f)
            curveTo(3.677f, 3.909f, 4.77f, 3.078f, 6.066f, 3.005f)
            lineTo(6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(13.246f, 13.003f)
            curveTo(13.66f, 13.003f, 13.996f, 13.339f, 13.996f, 13.753f)
            curveTo(13.996f, 14.133f, 13.714f, 14.446f, 13.348f, 14.496f)
            lineTo(13.246f, 14.503f)
            horizontalLineTo(8.748f)
            curveTo(8.334f, 14.503f, 7.998f, 14.167f, 7.998f, 13.753f)
            curveTo(7.998f, 13.373f, 8.28f, 13.06f, 8.646f, 13.01f)
            lineTo(8.748f, 13.003f)
            horizontalLineTo(13.246f)
            close()
            moveTo(15.252f, 9.496f)
            curveTo(15.667f, 9.496f, 16.002f, 9.832f, 16.002f, 10.246f)
            curveTo(16.002f, 10.626f, 15.72f, 10.94f, 15.354f, 10.989f)
            lineTo(15.252f, 10.996f)
            horizontalLineTo(8.748f)
            curveTo(8.334f, 10.996f, 7.998f, 10.66f, 7.998f, 10.246f)
            curveTo(7.998f, 9.867f, 8.28f, 9.553f, 8.646f, 9.503f)
            lineTo(8.748f, 9.496f)
            horizontalLineTo(15.252f)
            close()
            moveTo(3.75f, 6f)
            curveTo(4.441f, 6f, 5f, 6.56f, 5f, 7.25f)
            curveTo(5f, 7.941f, 4.441f, 8.5f, 3.75f, 8.5f)
            curveTo(3.06f, 8.5f, 2.5f, 7.941f, 2.5f, 7.25f)
            curveTo(2.5f, 6.56f, 3.06f, 6f, 3.75f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChannelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Channel, contentDescription = null)
    }
}
