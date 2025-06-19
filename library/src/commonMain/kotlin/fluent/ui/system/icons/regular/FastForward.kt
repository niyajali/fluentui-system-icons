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

public val FluentIcons.Regular.FastForward: ImageVector
    get() {
        if (_FastForward != null) {
            return _FastForward!!
        }
        _FastForward = ImageVector.Builder(
            name = "Regular.FastForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 5.503f)
                curveTo(11.5f, 4.224f, 12.998f, 3.532f, 13.972f, 4.361f)
                lineTo(21.382f, 10.667f)
                curveTo(22.203f, 11.366f, 22.203f, 12.633f, 21.382f, 13.332f)
                lineTo(13.972f, 19.638f)
                curveTo(12.998f, 20.467f, 11.5f, 19.775f, 11.5f, 18.496f)
                verticalLineTo(14.509f)
                lineTo(5.472f, 19.639f)
                curveTo(4.498f, 20.468f, 3f, 19.776f, 3f, 18.497f)
                verticalLineTo(5.504f)
                curveTo(3f, 4.225f, 4.498f, 3.532f, 5.472f, 4.361f)
                lineTo(11.5f, 9.491f)
                verticalLineTo(5.503f)
                close()
                moveTo(11.5f, 11.461f)
                lineTo(4.5f, 5.504f)
                verticalLineTo(18.497f)
                lineTo(11.5f, 12.54f)
                verticalLineTo(11.461f)
                close()
                moveTo(20.41f, 11.809f)
                lineTo(13f, 5.503f)
                verticalLineTo(18.496f)
                lineTo(20.41f, 12.19f)
                curveTo(20.527f, 12.09f, 20.527f, 11.909f, 20.41f, 11.809f)
                close()
            }
        }.build()

        return _FastForward!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward: ImageVector? = null

@Preview
@Composable
private fun FastForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FastForward, contentDescription = null)
    }
}
