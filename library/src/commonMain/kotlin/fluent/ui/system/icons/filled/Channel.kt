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

public val FluentIcons.Filled.Channel: ImageVector
    get() {
        if (_Channel != null) {
            return _Channel!!
        }
        _Channel = ImageVector.Builder(
            name = "Filled.Channel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
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
                moveTo(13.246f, 13.003f)
                horizontalLineTo(8.748f)
                lineTo(8.646f, 13.01f)
                curveTo(8.28f, 13.06f, 7.998f, 13.373f, 7.998f, 13.753f)
                curveTo(7.998f, 14.133f, 8.28f, 14.446f, 8.646f, 14.496f)
                lineTo(8.748f, 14.503f)
                horizontalLineTo(13.246f)
                lineTo(13.348f, 14.496f)
                curveTo(13.714f, 14.446f, 13.996f, 14.133f, 13.996f, 13.753f)
                curveTo(13.996f, 13.339f, 13.66f, 13.003f, 13.246f, 13.003f)
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
            }
        }.build()

        return _Channel!!
    }

@Suppress("ObjectPropertyName")
private var _Channel: ImageVector? = null

@Preview
@Composable
private fun ChannelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Channel, contentDescription = null)
    }
}
