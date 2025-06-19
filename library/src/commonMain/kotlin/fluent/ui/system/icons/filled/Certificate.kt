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

public val FluentIcons.Filled.Certificate: ImageVector
    get() {
        if (_Certificate != null) {
            return _Certificate!!
        }
        _Certificate = ImageVector.Builder(
            name = "Filled.Certificate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 3f)
                curveTo(3.231f, 3f, 2f, 4.231f, 2f, 5.75f)
                verticalLineTo(11f)
                curveTo(2.912f, 9.785f, 4.364f, 9f, 6f, 9f)
                curveTo(8.761f, 9f, 11f, 11.239f, 11f, 14f)
                curveTo(11f, 15.126f, 10.628f, 16.165f, 10f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 18f, 22f, 16.769f, 22f, 15.25f)
                verticalLineTo(5.75f)
                curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6.75f, 7f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 7f, 18f, 7.336f, 18f, 7.75f)
                curveTo(18f, 8.164f, 17.664f, 8.5f, 17.25f, 8.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 8.5f, 6f, 8.164f, 6f, 7.75f)
                curveTo(6f, 7.336f, 6.336f, 7f, 6.75f, 7f)
                close()
                moveTo(12f, 12.75f)
                curveTo(12f, 12.336f, 12.336f, 12f, 12.75f, 12f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 12f, 18f, 12.336f, 18f, 12.75f)
                curveTo(18f, 13.164f, 17.664f, 13.5f, 17.25f, 13.5f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 13.5f, 12f, 13.164f, 12f, 12.75f)
                close()
                moveTo(6f, 10f)
                curveTo(3.79f, 10f, 1.999f, 11.791f, 1.999f, 14.001f)
                curveTo(1.999f, 16.21f, 3.79f, 18.001f, 6f, 18.001f)
                curveTo(8.209f, 18.001f, 10f, 16.21f, 10f, 14.001f)
                curveTo(10f, 11.791f, 8.209f, 10f, 6f, 10f)
                close()
                moveTo(9.001f, 18.001f)
                curveTo(8.165f, 18.629f, 7.126f, 19.001f, 6f, 19.001f)
                curveTo(4.874f, 19.001f, 3.836f, 18.63f, 3.001f, 18.003f)
                lineTo(3f, 21.249f)
                curveTo(3f, 21.819f, 3.605f, 22.168f, 4.09f, 21.918f)
                lineTo(4.18f, 21.864f)
                lineTo(6f, 20.591f)
                lineTo(7.82f, 21.864f)
                curveTo(8.288f, 22.19f, 8.92f, 21.895f, 8.992f, 21.353f)
                lineTo(8.999f, 21.249f)
                lineTo(9.001f, 18.001f)
                close()
            }
        }.build()

        return _Certificate!!
    }

@Suppress("ObjectPropertyName")
private var _Certificate: ImageVector? = null

@Preview
@Composable
private fun CertificatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Certificate, contentDescription = null)
    }
}
