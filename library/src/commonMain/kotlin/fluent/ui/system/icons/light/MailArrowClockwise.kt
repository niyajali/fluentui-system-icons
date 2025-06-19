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

public val FluentIcons.Light.MailArrowClockwise: ImageVector
    get() {
        if (_MailArrowClockwise != null) {
            return _MailArrowClockwise!!
        }
        _MailArrowClockwise = ImageVector.Builder(
            name = "Light.MailArrowClockwise",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(30.5f, 2f)
                curveTo(30.5f, 1.448f, 30.052f, 1f, 29.5f, 1f)
                curveTo(28.948f, 1f, 28.5f, 1.448f, 28.5f, 2f)
                verticalLineTo(2.999f)
                curveTo(27.247f, 2.058f, 25.688f, 1.5f, 24f, 1.5f)
                curveTo(19.858f, 1.5f, 16.5f, 4.858f, 16.5f, 9f)
                curveTo(16.5f, 13.142f, 19.858f, 16.5f, 24f, 16.5f)
                curveTo(28.142f, 16.5f, 31.5f, 13.142f, 31.5f, 9f)
                curveTo(31.5f, 8.448f, 31.052f, 8f, 30.5f, 8f)
                curveTo(29.948f, 8f, 29.5f, 8.448f, 29.5f, 9f)
                curveTo(29.5f, 12.038f, 27.038f, 14.5f, 24f, 14.5f)
                curveTo(20.962f, 14.5f, 18.5f, 12.038f, 18.5f, 9f)
                curveTo(18.5f, 5.962f, 20.962f, 3.5f, 24f, 3.5f)
                curveTo(25.177f, 3.5f, 26.268f, 3.87f, 27.163f, 4.5f)
                horizontalLineTo(26f)
                curveTo(25.448f, 4.5f, 25f, 4.948f, 25f, 5.5f)
                curveTo(25f, 6.052f, 25.448f, 6.5f, 26f, 6.5f)
                horizontalLineTo(29.5f)
                curveTo(30.052f, 6.5f, 30.5f, 6.052f, 30.5f, 5.5f)
                verticalLineTo(2f)
                close()
                moveTo(30f, 22.5f)
                verticalLineTo(15.708f)
                curveTo(29.686f, 15.99f, 29.352f, 16.249f, 29f, 16.484f)
                verticalLineTo(22.5f)
                curveTo(29f, 24.433f, 27.433f, 26f, 25.5f, 26f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 26f, 3f, 24.433f, 3f, 22.5f)
                verticalLineTo(11.35f)
                lineTo(15.757f, 18.437f)
                curveTo(15.908f, 18.521f, 16.092f, 18.521f, 16.243f, 18.437f)
                lineTo(19.353f, 16.709f)
                curveTo(19.034f, 16.516f, 18.728f, 16.304f, 18.436f, 16.075f)
                lineTo(16f, 17.428f)
                lineTo(3f, 10.206f)
                verticalLineTo(9.5f)
                curveTo(3f, 7.567f, 4.567f, 6f, 6.5f, 6f)
                horizontalLineTo(15.512f)
                curveTo(15.634f, 5.657f, 15.775f, 5.323f, 15.936f, 5f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 5f, 2f, 7.015f, 2f, 9.5f)
                verticalLineTo(10.49f)
                curveTo(2f, 10.496f, 2f, 10.503f, 2f, 10.509f)
                verticalLineTo(22.5f)
                curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
                horizontalLineTo(25.5f)
                curveTo(27.985f, 27f, 30f, 24.985f, 30f, 22.5f)
                close()
            }
        }.build()

        return _MailArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _MailArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun MailArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailArrowClockwise, contentDescription = null)
    }
}
