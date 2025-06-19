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

public val FluentIcons.Filled.ClipboardTextEdit: ImageVector
    get() {
        if (_ClipboardTextEdit != null) {
            return _ClipboardTextEdit!!
        }
        _ClipboardTextEdit = ImageVector.Builder(
            name = "Filled.ClipboardTextEdit",
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
                horizontalLineTo(11.001f)
                curveTo(10.994f, 21.808f, 11.014f, 21.609f, 11.064f, 21.407f)
                lineTo(11.522f, 19.577f)
                curveTo(11.618f, 19.194f, 11.774f, 18.831f, 11.983f, 18.5f)
                horizontalLineTo(8f)
                curveTo(7.586f, 18.5f, 7.25f, 18.164f, 7.25f, 17.75f)
                curveTo(7.25f, 17.336f, 7.586f, 17f, 8f, 17f)
                horizontalLineTo(13.356f)
                lineTo(18.394f, 11.962f)
                curveTo(18.852f, 11.504f, 19.411f, 11.21f, 20f, 11.079f)
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
                moveTo(8f, 13f)
                horizontalLineTo(12f)
                curveTo(12.414f, 13f, 12.75f, 13.336f, 12.75f, 13.75f)
                curveTo(12.75f, 14.164f, 12.414f, 14.5f, 12f, 14.5f)
                horizontalLineTo(8f)
                curveTo(7.586f, 14.5f, 7.25f, 14.164f, 7.25f, 13.75f)
                curveTo(7.25f, 13.336f, 7.586f, 13f, 8f, 13f)
                close()
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                curveTo(16.414f, 9f, 16.75f, 9.336f, 16.75f, 9.75f)
                curveTo(16.75f, 10.164f, 16.414f, 10.5f, 16f, 10.5f)
                horizontalLineTo(8f)
                curveTo(7.586f, 10.5f, 7.25f, 10.164f, 7.25f, 9.75f)
                curveTo(7.25f, 9.336f, 7.586f, 9f, 8f, 9f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _ClipboardTextEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextEdit: ImageVector? = null

@Preview
@Composable
private fun ClipboardTextEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardTextEdit, contentDescription = null)
    }
}
