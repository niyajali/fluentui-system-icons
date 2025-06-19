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

public val FluentIcons.Filled.DocumentSignature: ImageVector
    get() {
        if (_DocumentSignature != null) {
            return _DocumentSignature!!
        }
        _DocumentSignature = ImageVector.Builder(
            name = "Filled.DocumentSignature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(15.649f)
                lineTo(17.138f, 18.511f)
                curveTo(16.666f, 18.984f, 16.074f, 19.319f, 15.426f, 19.481f)
                lineTo(13.595f, 19.938f)
                curveTo(12.648f, 20.175f, 11.756f, 19.734f, 11.306f, 19f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                curveTo(7f, 17.836f, 7.336f, 17.5f, 7.75f, 17.5f)
                horizontalLineTo(11.043f)
                curveTo(11.05f, 17.469f, 11.057f, 17.438f, 11.064f, 17.407f)
                lineTo(11.522f, 15.577f)
                curveTo(11.684f, 14.929f, 12.019f, 14.337f, 12.491f, 13.865f)
                lineTo(16.356f, 10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                close()
                moveTo(18.695f, 7.695f)
                curveTo(18.591f, 7.777f, 18.49f, 7.866f, 18.394f, 7.962f)
                lineTo(17.856f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(18.695f, 7.695f)
                close()
                moveTo(19.1f, 8.669f)
                lineTo(13.197f, 14.572f)
                curveTo(12.853f, 14.916f, 12.609f, 15.347f, 12.491f, 15.819f)
                lineTo(12.033f, 17.65f)
                curveTo(11.834f, 18.446f, 12.556f, 19.167f, 13.352f, 18.968f)
                lineTo(15.182f, 18.511f)
                curveTo(15.655f, 18.393f, 16.086f, 18.149f, 16.43f, 17.804f)
                lineTo(22.332f, 11.902f)
                curveTo(23.225f, 11.009f, 23.225f, 9.562f, 22.332f, 8.669f)
                curveTo(21.44f, 7.777f, 19.993f, 7.777f, 19.1f, 8.669f)
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
        Image(imageVector = FluentIcons.Filled.DocumentSignature, contentDescription = null)
    }
}
