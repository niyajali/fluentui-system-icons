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

public val FluentIcons.Light.MailMultiple: ImageVector
    get() {
        if (_MailMultiple != null) {
            return _MailMultiple!!
        }
        _MailMultiple = ImageVector.Builder(
            name = "Light.MailMultiple",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(26f, 20f)
                curveTo(26f, 22.209f, 24.209f, 24f, 22f, 24f)
                horizontalLineTo(7f)
                curveTo(4.791f, 24f, 3f, 22.209f, 3f, 20f)
                curveTo(3f, 16.333f, 3f, 12.667f, 3f, 9f)
                curveTo(3f, 6.791f, 4.791f, 5f, 7f, 5f)
                horizontalLineTo(22f)
                curveTo(24.209f, 5f, 26f, 6.791f, 26f, 9f)
                curveTo(26f, 12.667f, 26f, 16.333f, 26f, 20f)
                close()
                moveTo(7f, 6f)
                curveTo(5.343f, 6f, 4f, 7.343f, 4f, 9f)
                verticalLineTo(9.715f)
                lineTo(14.5f, 15.919f)
                lineTo(25f, 9.715f)
                verticalLineTo(9f)
                curveTo(25f, 7.343f, 23.657f, 6f, 22f, 6f)
                horizontalLineTo(7f)
                close()
                moveTo(25f, 10.876f)
                lineTo(14.754f, 16.931f)
                curveTo(14.597f, 17.023f, 14.403f, 17.023f, 14.246f, 16.931f)
                lineTo(4f, 10.876f)
                verticalLineTo(20f)
                curveTo(4f, 21.657f, 5.343f, 23f, 7f, 23f)
                horizontalLineTo(22f)
                curveTo(23.657f, 23f, 25f, 21.657f, 25f, 20f)
                verticalLineTo(10.876f)
                close()
                moveTo(7.354f, 26f)
                curveTo(8.059f, 26.622f, 8.985f, 27f, 10f, 27f)
                horizontalLineTo(22f)
                curveTo(25.866f, 27f, 29f, 23.866f, 29f, 20f)
                verticalLineTo(13f)
                curveTo(29f, 11.986f, 28.622f, 11.059f, 28f, 10.354f)
                lineTo(28f, 20f)
                curveTo(28f, 23.314f, 25.314f, 26f, 22f, 26f)
                lineTo(7.354f, 26f)
                close()
            }
        }.build()

        return _MailMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _MailMultiple: ImageVector? = null

@Preview
@Composable
private fun MailMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailMultiple, contentDescription = null)
    }
}
