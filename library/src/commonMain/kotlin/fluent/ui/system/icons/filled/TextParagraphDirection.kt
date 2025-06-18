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

public val FluentUi.Filled.TextParagraphDirection: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextParagraphDirection",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.5f, 3f)
            curveTo(10.462f, 3f, 8f, 5.462f, 8f, 8.5f)
            curveTo(8f, 11.538f, 10.462f, 14f, 13.5f, 14f)
            horizontalLineTo(15f)
            verticalLineTo(21.208f)
            curveTo(15f, 21.645f, 15.336f, 22f, 15.75f, 22f)
            curveTo(16.164f, 22f, 16.5f, 21.645f, 16.5f, 21.208f)
            verticalLineTo(4.5f)
            horizontalLineTo(18f)
            verticalLineTo(21.208f)
            curveTo(18f, 21.645f, 18.336f, 22f, 18.75f, 22f)
            curveTo(19.164f, 22f, 19.5f, 21.645f, 19.5f, 21.208f)
            verticalLineTo(4.5f)
            horizontalLineTo(20.045f)
            lineTo(20.175f, 4.493f)
            curveTo(20.641f, 4.443f, 21f, 4.13f, 21f, 3.75f)
            curveTo(21f, 3.336f, 20.573f, 3f, 20.045f, 3f)
            horizontalLineTo(13.5f)
            close()
            moveTo(4.08f, 11.858f)
            curveTo(3.824f, 12.059f, 3.453f, 12.048f, 3.209f, 11.818f)
            curveTo(2.941f, 11.565f, 2.929f, 11.142f, 3.182f, 10.874f)
            lineTo(4.896f, 9f)
            lineTo(3.182f, 7.126f)
            lineTo(3.12f, 7.049f)
            curveTo(2.933f, 6.782f, 2.966f, 6.412f, 3.209f, 6.182f)
            curveTo(3.477f, 5.929f, 3.9f, 5.941f, 4.153f, 6.209f)
            lineTo(6.299f, 8.542f)
            lineTo(6.364f, 8.623f)
            curveTo(6.539f, 8.878f, 6.517f, 9.227f, 6.299f, 9.458f)
            lineTo(4.153f, 11.791f)
            lineTo(4.08f, 11.858f)
            close()
            moveTo(5.401f, 19.858f)
            curveTo(5.657f, 20.059f, 6.028f, 20.048f, 6.272f, 19.818f)
            curveTo(6.54f, 19.565f, 6.552f, 19.142f, 6.299f, 18.874f)
            lineTo(4.585f, 17f)
            lineTo(6.299f, 15.126f)
            lineTo(6.361f, 15.049f)
            curveTo(6.547f, 14.782f, 6.515f, 14.412f, 6.272f, 14.182f)
            curveTo(6.004f, 13.929f, 5.581f, 13.941f, 5.328f, 14.209f)
            lineTo(3.182f, 16.542f)
            lineTo(3.117f, 16.623f)
            curveTo(2.942f, 16.878f, 2.964f, 17.227f, 3.182f, 17.458f)
            lineTo(5.328f, 19.791f)
            lineTo(5.401f, 19.858f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextParagraphDirectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextParagraphDirection, contentDescription = null)
    }
}
