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

public val FluentIcons.Regular.Certificate: ImageVector
    get() {
        if (_Certificate != null) {
            return _Certificate!!
        }
        _Certificate = ImageVector.Builder(
            name = "Regular.Certificate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5.75f)
                curveTo(2f, 4.231f, 3.231f, 3f, 4.75f, 3f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
                verticalLineTo(15.25f)
                curveTo(22f, 16.769f, 20.769f, 18f, 19.25f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                curveTo(10.12f, 16.841f, 10.231f, 16.674f, 10.331f, 16.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 16.5f, 20.5f, 15.94f, 20.5f, 15.25f)
                verticalLineTo(5.75f)
                curveTo(20.5f, 5.06f, 19.94f, 4.5f, 19.25f, 4.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 4.5f, 3.5f, 5.06f, 3.5f, 5.75f)
                verticalLineTo(9.669f)
                curveTo(2.915f, 10.007f, 2.404f, 10.461f, 2f, 11f)
                verticalLineTo(5.75f)
                close()
                moveTo(6.75f, 7f)
                curveTo(6.336f, 7f, 6f, 7.336f, 6f, 7.75f)
                curveTo(6f, 8.164f, 6.336f, 8.5f, 6.75f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 8.5f, 18f, 8.164f, 18f, 7.75f)
                curveTo(18f, 7.336f, 17.664f, 7f, 17.25f, 7f)
                horizontalLineTo(6.75f)
                close()
                moveTo(12.75f, 12f)
                curveTo(12.336f, 12f, 12f, 12.336f, 12f, 12.75f)
                curveTo(12f, 13.164f, 12.336f, 13.5f, 12.75f, 13.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 13.5f, 18f, 13.164f, 18f, 12.75f)
                curveTo(18f, 12.336f, 17.664f, 12f, 17.25f, 12f)
                horizontalLineTo(12.75f)
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
        Image(imageVector = FluentIcons.Regular.Certificate, contentDescription = null)
    }
}
