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

public val FluentIcons.Regular.ChannelAlert: ImageVector
    get() {
        if (_ChannelAlert != null) {
            return _ChannelAlert!!
        }
        _ChannelAlert = ImageVector.Builder(
            name = "Regular.ChannelAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(4.5f, 9.372f)
                lineTo(4.5f, 17.75f)
                curveTo(4.5f, 18.668f, 5.207f, 19.421f, 6.107f, 19.494f)
                lineTo(6.25f, 19.5f)
                lineTo(11.314f, 19.5f)
                curveTo(11.486f, 20.034f, 11.726f, 20.538f, 12.023f, 21.001f)
                lineTo(6.25f, 21f)
                curveTo(4.517f, 21f, 3.101f, 19.643f, 3.005f, 17.934f)
                lineTo(3f, 17.75f)
                lineTo(3f, 9.372f)
                curveTo(3.234f, 9.455f, 3.487f, 9.5f, 3.75f, 9.5f)
                curveTo(4.013f, 9.5f, 4.266f, 9.455f, 4.5f, 9.372f)
                close()
                moveTo(18.5f, 20.001f)
                horizontalLineTo(16.5f)
                lineTo(16.507f, 20.118f)
                curveTo(16.565f, 20.615f, 16.987f, 21.001f, 17.5f, 21.001f)
                curveTo(18.052f, 21.001f, 18.5f, 20.554f, 18.5f, 20.001f)
                close()
                moveTo(17.503f, 14f)
                lineTo(17.336f, 14.007f)
                curveTo(16.399f, 14.092f, 15.667f, 14.771f, 15.527f, 15.642f)
                lineTo(15.509f, 15.797f)
                lineTo(15.503f, 16.001f)
                verticalLineTo(17.294f)
                lineTo(14.647f, 18.147f)
                curveTo(14.352f, 18.441f, 14.527f, 18.931f, 14.914f, 18.994f)
                lineTo(15f, 19.001f)
                horizontalLineTo(20f)
                curveTo(20.416f, 19.001f, 20.638f, 18.532f, 20.41f, 18.214f)
                lineTo(20.354f, 18.148f)
                lineTo(19.505f, 17.299f)
                verticalLineTo(15.947f)
                lineTo(19.5f, 15.801f)
                curveTo(19.423f, 14.788f, 18.556f, 14f, 17.503f, 14f)
                close()
                moveTo(12.807f, 13.003f)
                curveTo(12.381f, 13.448f, 12.017f, 13.952f, 11.731f, 14.503f)
                lineTo(8.748f, 14.503f)
                curveTo(8.334f, 14.503f, 7.998f, 14.167f, 7.998f, 13.753f)
                curveTo(7.998f, 13.373f, 8.28f, 13.06f, 8.646f, 13.01f)
                lineTo(8.748f, 13.003f)
                lineTo(12.807f, 13.003f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.483f, 3f, 20.899f, 4.356f, 20.995f, 6.066f)
                lineTo(21f, 6.25f)
                lineTo(21.001f, 12.022f)
                curveTo(20.538f, 11.726f, 20.034f, 11.486f, 19.5f, 11.314f)
                lineTo(19.5f, 6.25f)
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

        return _ChannelAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ChannelAlert: ImageVector? = null

@Preview
@Composable
private fun ChannelAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChannelAlert, contentDescription = null)
    }
}
