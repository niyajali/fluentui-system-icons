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

public val FluentIcons.Filled.ClipboardTextRtl: ImageVector
    get() {
        if (_ClipboardTextRtl != null) {
            return _ClipboardTextRtl!!
        }
        _ClipboardTextRtl = ImageVector.Builder(
            name = "Filled.ClipboardTextRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.979f, 3.945f)
                curveTo(15.83f, 2.846f, 14.889f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.111f, 2f, 8.17f, 2.846f, 8.021f, 3.945f)
                lineTo(8.006f, 4.08f)
                lineTo(8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                lineTo(15.993f, 4.08f)
                lineTo(15.979f, 3.945f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                curveTo(16.414f, 9f, 16.75f, 9.336f, 16.75f, 9.75f)
                curveTo(16.75f, 10.164f, 16.414f, 10.5f, 16f, 10.5f)
                horizontalLineTo(8f)
                curveTo(7.586f, 10.5f, 7.25f, 10.164f, 7.25f, 9.75f)
                curveTo(7.25f, 9.336f, 7.586f, 9f, 8f, 9f)
                close()
                moveTo(11.25f, 13.75f)
                curveTo(11.25f, 13.336f, 11.586f, 13f, 12f, 13f)
                horizontalLineTo(16f)
                curveTo(16.414f, 13f, 16.75f, 13.336f, 16.75f, 13.75f)
                curveTo(16.75f, 14.164f, 16.414f, 14.5f, 16f, 14.5f)
                horizontalLineTo(12f)
                curveTo(11.586f, 14.5f, 11.25f, 14.164f, 11.25f, 13.75f)
                close()
                moveTo(10f, 17f)
                horizontalLineTo(16f)
                curveTo(16.414f, 17f, 16.75f, 17.336f, 16.75f, 17.75f)
                curveTo(16.75f, 18.164f, 16.414f, 18.5f, 16f, 18.5f)
                horizontalLineTo(10f)
                curveTo(9.586f, 18.5f, 9.25f, 18.164f, 9.25f, 17.75f)
                curveTo(9.25f, 17.336f, 9.586f, 17f, 10f, 17f)
                close()
            }
        }.build()

        return _ClipboardTextRtl!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextRtl: ImageVector? = null

@Preview
@Composable
private fun ClipboardTextRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardTextRtl, contentDescription = null)
    }
}
