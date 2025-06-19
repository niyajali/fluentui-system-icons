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

public val FluentIcons.Regular.DocumentSignature: ImageVector
    get() {
        if (_DocumentSignature != null) {
            return _DocumentSignature!!
        }
        _DocumentSignature = ImageVector.Builder(
            name = "Regular.DocumentSignature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12.172f)
                curveTo(12.703f, 2f, 13.211f, 2.211f, 13.586f, 2.586f)
                lineTo(18.696f, 7.695f)
                curveTo(18.591f, 7.777f, 18.49f, 7.866f, 18.394f, 7.962f)
                lineTo(16.356f, 10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                verticalLineTo(3.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 3.5f, 5.5f, 3.724f, 5.5f, 4f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.276f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.276f, 18.5f, 20f)
                verticalLineTo(17.149f)
                lineTo(20f, 15.649f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.895f, 22f, 4f, 21.105f, 4f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(14f, 8.5f)
                horizontalLineTo(17.379f)
                lineTo(13.5f, 4.621f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                close()
                moveTo(13.197f, 14.572f)
                lineTo(19.1f, 8.669f)
                curveTo(19.993f, 7.777f, 21.44f, 7.777f, 22.332f, 8.669f)
                curveTo(23.225f, 9.562f, 23.225f, 11.009f, 22.332f, 11.902f)
                lineTo(16.43f, 17.804f)
                curveTo(16.086f, 18.149f, 15.655f, 18.393f, 15.182f, 18.511f)
                lineTo(13.352f, 18.968f)
                curveTo(13.238f, 18.997f, 13.126f, 19.006f, 13.018f, 19f)
                curveTo(13.012f, 19f, 13.006f, 19f, 13f, 19f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                curveTo(7f, 17.836f, 7.336f, 17.5f, 7.75f, 17.5f)
                horizontalLineTo(12.071f)
                lineTo(12.491f, 15.819f)
                curveTo(12.609f, 15.347f, 12.853f, 14.916f, 13.197f, 14.572f)
                close()
            }
        }.build()

        return _DocumentSignature!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSignature: ImageVector? = null

@Preview
@Composable
private fun DocumentSignaturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentSignature, contentDescription = null)
    }
}
