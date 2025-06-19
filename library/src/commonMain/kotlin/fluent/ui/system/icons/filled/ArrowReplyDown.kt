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

public val FluentIcons.Filled.ArrowReplyDown: ImageVector
    get() {
        if (_ArrowReplyDown != null) {
            return _ArrowReplyDown!!
        }
        _ArrowReplyDown = ImageVector.Builder(
            name = "Filled.ArrowReplyDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.704f, 8.706f)
                curveTo(10.094f, 8.315f, 10.094f, 7.682f, 9.703f, 7.291f)
                curveTo(9.312f, 6.901f, 8.679f, 6.901f, 8.289f, 7.292f)
                lineTo(3.292f, 12.296f)
                curveTo(2.902f, 12.686f, 2.903f, 13.319f, 3.293f, 13.709f)
                lineTo(8.289f, 18.707f)
                curveTo(8.68f, 19.098f, 9.313f, 19.098f, 9.704f, 18.707f)
                curveTo(10.094f, 18.317f, 10.094f, 17.684f, 9.704f, 17.293f)
                lineTo(6.411f, 14f)
                horizontalLineTo(13f)
                curveTo(17.335f, 14f, 20.865f, 10.552f, 20.996f, 6.249f)
                lineTo(21f, 6f)
                curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
                curveTo(19.448f, 5f, 19f, 5.448f, 19f, 6f)
                curveTo(19f, 9.238f, 16.434f, 11.878f, 13.225f, 11.996f)
                lineTo(13f, 12f)
                horizontalLineTo(6.414f)
                lineTo(9.704f, 8.706f)
                close()
            }
        }.build()

        return _ArrowReplyDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowReplyDown: ImageVector? = null

@Preview
@Composable
private fun ArrowReplyDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowReplyDown, contentDescription = null)
    }
}
