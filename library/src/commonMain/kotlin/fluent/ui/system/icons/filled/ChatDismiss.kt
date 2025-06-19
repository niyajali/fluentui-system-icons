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

public val FluentIcons.Filled.ChatDismiss: ImageVector
    get() {
        if (_ChatDismiss != null) {
            return _ChatDismiss!!
        }
        _ChatDismiss = ImageVector.Builder(
            name = "Filled.ChatDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
                lineTo(2.047f, 20.415f)
                curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
                curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
                lineTo(7.413f, 20.888f)
                curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                close()
                moveTo(9.28f, 8.22f)
                lineTo(12f, 10.939f)
                lineTo(14.72f, 8.22f)
                curveTo(15.013f, 7.927f, 15.487f, 7.927f, 15.78f, 8.22f)
                curveTo(16.073f, 8.513f, 16.073f, 8.987f, 15.78f, 9.28f)
                lineTo(13.061f, 12f)
                lineTo(15.78f, 14.72f)
                curveTo(16.073f, 15.013f, 16.073f, 15.487f, 15.78f, 15.78f)
                curveTo(15.487f, 16.073f, 15.013f, 16.073f, 14.72f, 15.78f)
                lineTo(12f, 13.061f)
                lineTo(9.28f, 15.78f)
                curveTo(8.987f, 16.073f, 8.513f, 16.073f, 8.22f, 15.78f)
                curveTo(7.927f, 15.487f, 7.927f, 15.013f, 8.22f, 14.72f)
                lineTo(10.939f, 12f)
                lineTo(8.22f, 9.28f)
                curveTo(7.927f, 8.987f, 7.927f, 8.513f, 8.22f, 8.22f)
                curveTo(8.513f, 7.927f, 8.987f, 7.927f, 9.28f, 8.22f)
                close()
            }
        }.build()

        return _ChatDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _ChatDismiss: ImageVector? = null

@Preview
@Composable
private fun ChatDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatDismiss, contentDescription = null)
    }
}
