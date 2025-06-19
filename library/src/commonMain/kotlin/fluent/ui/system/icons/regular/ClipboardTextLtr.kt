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

public val FluentIcons.Regular.ClipboardTextLtr: ImageVector
    get() {
        if (_ClipboardTextLtr != null) {
            return _ClipboardTextLtr!!
        }
        _ClipboardTextLtr = ImageVector.Builder(
            name = "Regular.ClipboardTextLtr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.941f, 2f, 15.916f, 2.925f, 15.995f, 4.096f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.165f, 15.995f, 4.082f, 15.986f, 3.999f)
                lineTo(17.75f, 4f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                lineTo(8.014f, 3.999f)
                curveTo(8.007f, 4.058f, 8.003f, 4.117f, 8.001f, 4.176f)
                lineTo(8f, 4.25f)
                curveTo(8f, 3.007f, 9.007f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.456f, 6.5f, 8.758f, 6.089f, 8.358f, 5.467f)
                lineTo(8.379f, 5.5f)
                lineTo(6.25f, 5.5f)
                curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 20.5f, 18.5f, 20.164f, 18.5f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
                lineTo(15.621f, 5.5f)
                lineTo(15.642f, 5.467f)
                curveTo(15.242f, 6.089f, 14.544f, 6.5f, 13.75f, 6.5f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(8f, 14.5f)
                horizontalLineTo(12f)
                curveTo(12.414f, 14.5f, 12.75f, 14.164f, 12.75f, 13.75f)
                curveTo(12.75f, 13.336f, 12.414f, 13f, 12f, 13f)
                horizontalLineTo(8f)
                curveTo(7.586f, 13f, 7.25f, 13.336f, 7.25f, 13.75f)
                curveTo(7.25f, 14.164f, 7.586f, 14.5f, 8f, 14.5f)
                close()
                moveTo(8f, 10.5f)
                horizontalLineTo(16f)
                curveTo(16.414f, 10.5f, 16.75f, 10.164f, 16.75f, 9.75f)
                curveTo(16.75f, 9.336f, 16.414f, 9f, 16f, 9f)
                horizontalLineTo(8f)
                curveTo(7.586f, 9f, 7.25f, 9.336f, 7.25f, 9.75f)
                curveTo(7.25f, 10.164f, 7.586f, 10.5f, 8f, 10.5f)
                close()
                moveTo(8f, 18.5f)
                horizontalLineTo(14f)
                curveTo(14.414f, 18.5f, 14.75f, 18.164f, 14.75f, 17.75f)
                curveTo(14.75f, 17.336f, 14.414f, 17f, 14f, 17f)
                horizontalLineTo(8f)
                curveTo(7.586f, 17f, 7.25f, 17.336f, 7.25f, 17.75f)
                curveTo(7.25f, 18.164f, 7.586f, 18.5f, 8f, 18.5f)
                close()
            }
        }.build()

        return _ClipboardTextLtr!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextLtr: ImageVector? = null

@Preview
@Composable
private fun ClipboardTextLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardTextLtr, contentDescription = null)
    }
}
