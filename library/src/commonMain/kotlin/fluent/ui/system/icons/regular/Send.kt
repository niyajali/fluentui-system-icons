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

public val FluentIcons.Regular.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Regular.Send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.694f, 12f)
                lineTo(2.299f, 3.272f)
                curveTo(2.063f, 2.664f, 2.655f, 2.083f, 3.241f, 2.29f)
                lineTo(3.334f, 2.329f)
                lineTo(21.334f, 11.329f)
                curveTo(21.852f, 11.588f, 21.884f, 12.297f, 21.431f, 12.613f)
                lineTo(21.334f, 12.67f)
                lineTo(3.334f, 21.67f)
                curveTo(2.751f, 21.962f, 2.117f, 21.426f, 2.269f, 20.823f)
                lineTo(2.299f, 20.728f)
                lineTo(5.694f, 12f)
                lineTo(2.299f, 3.272f)
                lineTo(5.694f, 12f)
                close()
                moveTo(4.402f, 4.54f)
                lineTo(7.011f, 11.249f)
                lineTo(13.639f, 11.25f)
                curveTo(14.018f, 11.25f, 14.332f, 11.532f, 14.382f, 11.898f)
                lineTo(14.389f, 12f)
                curveTo(14.389f, 12.379f, 14.106f, 12.693f, 13.74f, 12.743f)
                lineTo(13.639f, 12.75f)
                lineTo(7.011f, 12.749f)
                lineTo(4.402f, 19.459f)
                lineTo(19.321f, 12f)
                lineTo(4.402f, 4.54f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null

@Preview
@Composable
private fun SendPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Send, contentDescription = null)
    }
}
