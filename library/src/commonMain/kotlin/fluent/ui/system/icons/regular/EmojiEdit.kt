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

public val FluentIcons.Regular.EmojiEdit: ImageVector
    get() {
        if (_EmojiEdit != null) {
            return _EmojiEdit!!
        }
        _EmojiEdit = ImageVector.Builder(
            name = "Regular.EmojiEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 1.998f)
                curveTo(17.271f, 1.998f, 21.589f, 6.075f, 21.973f, 11.248f)
                curveTo(21.487f, 11.047f, 20.961f, 10.968f, 20.444f, 11.01f)
                curveTo(19.954f, 6.781f, 16.36f, 3.498f, 12f, 3.498f)
                curveTo(7.304f, 3.498f, 3.498f, 7.304f, 3.498f, 12f)
                curveTo(3.498f, 16.458f, 6.93f, 20.115f, 11.297f, 20.472f)
                lineTo(11.063f, 21.407f)
                curveTo(11.017f, 21.591f, 10.997f, 21.774f, 10.999f, 21.952f)
                curveTo(5.945f, 21.45f, 1.998f, 17.186f, 1.998f, 12f)
                curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
                close()
                moveTo(12f, 16.501f)
                curveTo(13.121f, 16.501f, 14.173f, 16.089f, 14.984f, 15.37f)
                lineTo(12.49f, 17.864f)
                curveTo(12.449f, 17.905f, 12.409f, 17.947f, 12.37f, 17.99f)
                curveTo(12.247f, 17.997f, 12.124f, 18.001f, 12f, 18.001f)
                curveTo(10.137f, 18.001f, 8.414f, 17.146f, 7.283f, 15.711f)
                curveTo(7.027f, 15.386f, 7.083f, 14.914f, 7.408f, 14.658f)
                curveTo(7.733f, 14.402f, 8.205f, 14.458f, 8.461f, 14.783f)
                curveTo(9.31f, 15.861f, 10.601f, 16.501f, 12f, 16.501f)
                close()
                moveTo(9f, 8.75f)
                curveTo(9.69f, 8.75f, 10.249f, 9.31f, 10.249f, 10f)
                curveTo(10.249f, 10.689f, 9.69f, 11.249f, 9f, 11.249f)
                curveTo(8.31f, 11.249f, 7.751f, 10.689f, 7.751f, 10f)
                curveTo(7.751f, 9.31f, 8.31f, 8.75f, 9f, 8.75f)
                close()
                moveTo(15f, 8.75f)
                curveTo(15.69f, 8.75f, 16.249f, 9.31f, 16.249f, 10f)
                curveTo(16.249f, 10.689f, 15.69f, 11.249f, 15f, 11.249f)
                curveTo(14.31f, 11.249f, 13.751f, 10.689f, 13.751f, 10f)
                curveTo(13.751f, 9.31f, 14.31f, 8.75f, 15f, 8.75f)
                close()
                moveTo(19.1f, 12.668f)
                lineTo(13.197f, 18.571f)
                curveTo(12.853f, 18.915f, 12.609f, 19.346f, 12.491f, 19.818f)
                lineTo(12.033f, 21.649f)
                curveTo(11.834f, 22.445f, 12.556f, 23.166f, 13.352f, 22.967f)
                lineTo(15.182f, 22.51f)
                curveTo(15.655f, 22.392f, 16.086f, 22.147f, 16.43f, 21.803f)
                lineTo(22.332f, 15.901f)
                curveTo(23.225f, 15.008f, 23.225f, 13.561f, 22.332f, 12.668f)
                curveTo(21.44f, 11.776f, 19.993f, 11.776f, 19.1f, 12.668f)
                close()
            }
        }.build()

        return _EmojiEdit!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiEdit: ImageVector? = null

@Preview
@Composable
private fun EmojiEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EmojiEdit, contentDescription = null)
    }
}
