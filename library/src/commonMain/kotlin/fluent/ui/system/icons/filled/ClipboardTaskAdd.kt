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

public val FluentIcons.Filled.ClipboardTaskAdd: ImageVector
    get() {
        if (_ClipboardTaskAdd != null) {
            return _ClipboardTaskAdd!!
        }
        _ClipboardTaskAdd = ImageVector.Builder(
            name = "Filled.ClipboardTaskAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.75f, 2f)
                horizontalLineTo(8.25f)
                curveTo(7.092f, 2f, 6.138f, 2.875f, 6.014f, 3.999f)
                lineTo(4.25f, 4f)
                curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(2f, 20.993f, 3.007f, 22f, 4.25f, 22f)
                horizontalLineTo(12.81f)
                curveTo(11.689f, 20.832f, 11f, 19.247f, 11f, 17.5f)
                curveTo(11f, 16.255f, 11.35f, 15.092f, 11.957f, 14.104f)
                lineTo(9.53f, 16.53f)
                curveTo(9.237f, 16.823f, 8.763f, 16.823f, 8.47f, 16.53f)
                lineTo(5.97f, 14.03f)
                curveTo(5.677f, 13.737f, 5.677f, 13.263f, 5.97f, 12.97f)
                curveTo(6.263f, 12.677f, 6.737f, 12.677f, 7.03f, 12.97f)
                lineTo(9f, 14.939f)
                lineTo(13.97f, 9.97f)
                curveTo(14.263f, 9.677f, 14.737f, 9.677f, 15.03f, 9.97f)
                curveTo(15.323f, 10.263f, 15.323f, 10.737f, 15.03f, 11.03f)
                lineTo(14.104f, 11.957f)
                curveTo(15.092f, 11.35f, 16.255f, 11f, 17.5f, 11f)
                curveTo(17.668f, 11f, 17.835f, 11.006f, 18f, 11.019f)
                verticalLineTo(6.25f)
                curveTo(18f, 5.007f, 16.993f, 4f, 15.75f, 4f)
                lineTo(13.986f, 3.999f)
                curveTo(13.862f, 2.875f, 12.908f, 2f, 11.75f, 2f)
                close()
                moveTo(8.25f, 3.5f)
                horizontalLineTo(11.75f)
                curveTo(12.164f, 3.5f, 12.5f, 3.836f, 12.5f, 4.25f)
                curveTo(12.5f, 4.664f, 12.164f, 5f, 11.75f, 5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 5f, 7.5f, 4.664f, 7.5f, 4.25f)
                curveTo(7.5f, 3.836f, 7.836f, 3.5f, 8.25f, 3.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _ClipboardTaskAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTaskAdd: ImageVector? = null

@Preview
@Composable
private fun ClipboardTaskAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardTaskAdd, contentDescription = null)
    }
}
