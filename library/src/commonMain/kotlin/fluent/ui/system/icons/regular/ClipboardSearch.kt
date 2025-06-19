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

public val FluentIcons.Regular.ClipboardSearch: ImageVector
    get() {
        if (_ClipboardSearch != null) {
            return _ClipboardSearch!!
        }
        _ClipboardSearch = ImageVector.Builder(
            name = "Regular.ClipboardSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.986f, 3.999f)
                curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(10.1f)
                curveTo(4.466f, 9.862f, 4.969f, 9.688f, 5.5f, 9.591f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5f)
                curveTo(8.783f, 6.103f, 9.47f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.217f, 6.103f, 15.621f, 5.5f)
                lineTo(17.75f, 5.5f)
                curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(13.832f)
                curveTo(14.056f, 20.973f, 14.056f, 21.527f, 13.832f, 22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                close()
                moveTo(15.995f, 4.096f)
                lineTo(16f, 4.25f)
                curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(9.95f, 17.889f)
                curveTo(10.605f, 17.108f, 11f, 16.1f, 11f, 15f)
                curveTo(11f, 12.515f, 8.985f, 10.5f, 6.5f, 10.5f)
                curveTo(4.015f, 10.5f, 2f, 12.515f, 2f, 15f)
                curveTo(2f, 17.485f, 4.015f, 19.5f, 6.5f, 19.5f)
                curveTo(7.342f, 19.5f, 8.131f, 19.268f, 8.805f, 18.866f)
                lineTo(11.72f, 21.78f)
                curveTo(12.013f, 22.073f, 12.487f, 22.073f, 12.78f, 21.78f)
                curveTo(13.073f, 21.487f, 13.073f, 21.013f, 12.78f, 20.72f)
                lineTo(9.95f, 17.889f)
                close()
                moveTo(6.5f, 18f)
                curveTo(4.843f, 18f, 3.5f, 16.657f, 3.5f, 15f)
                curveTo(3.5f, 13.343f, 4.843f, 12f, 6.5f, 12f)
                curveTo(8.157f, 12f, 9.5f, 13.343f, 9.5f, 15f)
                curveTo(9.5f, 16.657f, 8.157f, 18f, 6.5f, 18f)
                close()
            }
        }.build()

        return _ClipboardSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardSearch: ImageVector? = null

@Preview
@Composable
private fun ClipboardSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ClipboardSearch, contentDescription = null)
    }
}
