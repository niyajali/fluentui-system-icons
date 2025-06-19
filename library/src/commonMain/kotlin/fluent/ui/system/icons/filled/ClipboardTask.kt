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

public val FluentIcons.Filled.ClipboardTask: ImageVector
    get() {
        if (_ClipboardTask != null) {
            return _ClipboardTask!!
        }
        _ClipboardTask = ImageVector.Builder(
            name = "Filled.ClipboardTask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(17.03f, 11.03f)
                lineTo(11.53f, 16.53f)
                curveTo(11.237f, 16.823f, 10.763f, 16.823f, 10.47f, 16.53f)
                lineTo(7.97f, 14.03f)
                curveTo(7.677f, 13.737f, 7.677f, 13.263f, 7.97f, 12.97f)
                curveTo(8.263f, 12.677f, 8.737f, 12.677f, 9.03f, 12.97f)
                lineTo(11f, 14.939f)
                lineTo(15.97f, 9.97f)
                curveTo(16.263f, 9.677f, 16.737f, 9.677f, 17.03f, 9.97f)
                curveTo(17.323f, 10.263f, 17.323f, 10.737f, 17.03f, 11.03f)
                close()
            }
        }.build()

        return _ClipboardTask!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTask: ImageVector? = null

@Preview
@Composable
private fun ClipboardTaskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardTask, contentDescription = null)
    }
}
