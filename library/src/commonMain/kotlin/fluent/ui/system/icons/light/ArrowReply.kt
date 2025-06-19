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

public val FluentIcons.Light.ArrowReply: ImageVector
    get() {
        if (_ArrowReply != null) {
            return _ArrowReply!!
        }
        _ArrowReply = ImageVector.Builder(
            name = "Light.ArrowReply",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.854f, 6.854f)
                curveTo(11.049f, 6.658f, 11.049f, 6.342f, 10.854f, 6.146f)
                curveTo(10.658f, 5.951f, 10.342f, 5.951f, 10.146f, 6.146f)
                lineTo(3.146f, 13.146f)
                curveTo(2.951f, 13.342f, 2.951f, 13.658f, 3.146f, 13.854f)
                lineTo(10.146f, 20.854f)
                curveTo(10.342f, 21.049f, 10.658f, 21.049f, 10.854f, 20.854f)
                curveTo(11.049f, 20.658f, 11.049f, 20.342f, 10.854f, 20.146f)
                lineTo(4.707f, 14f)
                horizontalLineTo(16.5f)
                curveTo(22.851f, 14f, 28f, 19.149f, 28f, 25.5f)
                curveTo(28f, 25.776f, 28.224f, 26f, 28.5f, 26f)
                curveTo(28.776f, 26f, 29f, 25.776f, 29f, 25.5f)
                curveTo(29f, 18.596f, 23.404f, 13f, 16.5f, 13f)
                horizontalLineTo(4.707f)
                lineTo(10.854f, 6.854f)
                close()
            }
        }.build()

        return _ArrowReply!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowReply: ImageVector? = null

@Preview
@Composable
private fun ArrowReplyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.ArrowReply, contentDescription = null)
    }
}
