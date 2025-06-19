package fluent.ui.system.icons.light

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

public val FluentIcons.Light.MailRewind: ImageVector
    get() {
        if (_MailRewind != null) {
            return _MailRewind!!
        }
        _MailRewind = ImageVector.Builder(
            name = "Light.MailRewind",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23.398f, 1.213f)
                curveTo(24.059f, 0.686f, 24.992f, 1.199f, 24.992f, 2.09f)
                verticalLineTo(5.528f)
                lineTo(30.407f, 1.213f)
                curveTo(31.068f, 0.686f, 32f, 1.199f, 32f, 2.09f)
                verticalLineTo(11.91f)
                curveTo(32f, 12.801f, 31.068f, 13.314f, 30.407f, 12.787f)
                lineTo(24.992f, 8.472f)
                verticalLineTo(11.91f)
                curveTo(24.992f, 12.801f, 24.059f, 13.314f, 23.398f, 12.787f)
                lineTo(17.511f, 8.097f)
                curveTo(16.83f, 7.553f, 16.83f, 6.447f, 17.511f, 5.903f)
                lineTo(23.398f, 1.213f)
                close()
                moveTo(16.283f, 5f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
                verticalLineTo(10.49f)
                curveTo(2f, 10.496f, 2f, 10.503f, 2f, 10.509f)
                verticalLineTo(22.5f)
                curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
                horizontalLineTo(25.5f)
                curveTo(27.985f, 27f, 30f, 24.985f, 30f, 22.5f)
                verticalLineTo(14.285f)
                curveTo(29.818f, 14.203f, 29.64f, 14.095f, 29.472f, 13.961f)
                lineTo(29f, 13.585f)
                verticalLineTo(22.5f)
                curveTo(29f, 24.433f, 27.433f, 26f, 25.5f, 26f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 26f, 3f, 24.433f, 3f, 22.5f)
                verticalLineTo(11.35f)
                lineTo(15.757f, 18.437f)
                curveTo(15.908f, 18.521f, 16.092f, 18.521f, 16.243f, 18.437f)
                lineTo(23.441f, 14.438f)
                curveTo(23.101f, 14.359f, 22.768f, 14.203f, 22.463f, 13.961f)
                lineTo(22.372f, 13.888f)
                lineTo(16f, 17.428f)
                lineTo(3f, 10.206f)
                verticalLineTo(9.5f)
                curveTo(3f, 7.567f, 4.567f, 6f, 6.5f, 6f)
                horizontalLineTo(15.672f)
                curveTo(15.802f, 5.635f, 16.006f, 5.293f, 16.283f, 5f)
                close()
            }
        }.build()

        return _MailRewind!!
    }

@Suppress("ObjectPropertyName")
private var _MailRewind: ImageVector? = null

@Preview
@Composable
private fun MailRewindPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailRewind, contentDescription = null)
    }
}
