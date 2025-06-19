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

public val FluentIcons.Filled.TextParagraphDirectionLeft: ImageVector
    get() {
        if (_TextParagraphDirectionLeft != null) {
            return _TextParagraphDirectionLeft!!
        }
        _TextParagraphDirectionLeft = ImageVector.Builder(
            name = "Filled.TextParagraphDirectionLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 8.5f)
                curveTo(8f, 5.462f, 10.462f, 3f, 13.5f, 3f)
                horizontalLineTo(20.045f)
                curveTo(20.573f, 3f, 21f, 3.336f, 21f, 3.75f)
                curveTo(21f, 4.13f, 20.641f, 4.443f, 20.175f, 4.493f)
                lineTo(20.045f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.208f)
                curveTo(19.5f, 21.645f, 19.164f, 22f, 18.75f, 22f)
                curveTo(18.336f, 22f, 18f, 21.645f, 18f, 21.208f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.208f)
                curveTo(16.5f, 21.645f, 16.164f, 22f, 15.75f, 22f)
                curveTo(15.336f, 22f, 15f, 21.645f, 15f, 21.208f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                curveTo(10.462f, 14f, 8f, 11.538f, 8f, 8.5f)
                close()
                moveTo(5.401f, 14.858f)
                curveTo(5.657f, 15.059f, 6.028f, 15.048f, 6.272f, 14.818f)
                curveTo(6.54f, 14.565f, 6.552f, 14.142f, 6.299f, 13.874f)
                lineTo(4.585f, 12f)
                lineTo(6.299f, 10.126f)
                lineTo(6.361f, 10.049f)
                curveTo(6.547f, 9.782f, 6.515f, 9.412f, 6.272f, 9.182f)
                curveTo(6.004f, 8.929f, 5.581f, 8.941f, 5.328f, 9.209f)
                lineTo(3.182f, 11.542f)
                lineTo(3.117f, 11.623f)
                curveTo(2.942f, 11.878f, 2.964f, 12.227f, 3.182f, 12.458f)
                lineTo(5.328f, 14.791f)
                lineTo(5.401f, 14.858f)
                close()
            }
        }.build()

        return _TextParagraphDirectionLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TextParagraphDirectionLeft: ImageVector? = null

@Preview
@Composable
private fun TextParagraphDirectionLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextParagraphDirectionLeft, contentDescription = null)
    }
}
