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

public val FluentIcons.Filled.Pulse: ImageVector
    get() {
        if (_Pulse != null) {
            return _Pulse!!
        }
        _Pulse = ImageVector.Builder(
            name = "Filled.Pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.471f, 7.237f)
                lineTo(11.526f, 20.229f)
                curveTo(11.76f, 21.222f, 13.156f, 21.269f, 13.456f, 20.294f)
                lineTo(16.4f, 10.714f)
                lineTo(16.785f, 12.241f)
                curveTo(16.897f, 12.685f, 17.297f, 12.997f, 17.755f, 12.997f)
                horizontalLineTo(21f)
                curveTo(21.552f, 12.997f, 22f, 12.549f, 22f, 11.997f)
                curveTo(22f, 11.444f, 21.552f, 10.997f, 21f, 10.997f)
                horizontalLineTo(18.534f)
                lineTo(17.465f, 6.756f)
                curveTo(17.218f, 5.775f, 15.837f, 5.739f, 15.54f, 6.706f)
                lineTo(12.628f, 16.178f)
                lineTo(9.475f, 2.771f)
                curveTo(9.235f, 1.751f, 7.787f, 1.74f, 7.532f, 2.757f)
                lineTo(5.467f, 10.997f)
                horizontalLineTo(3f)
                curveTo(2.448f, 10.997f, 2f, 11.444f, 2f, 11.997f)
                curveTo(2f, 12.549f, 2.448f, 12.997f, 3f, 12.997f)
                horizontalLineTo(6.247f)
                curveTo(6.706f, 12.997f, 7.106f, 12.685f, 7.217f, 12.24f)
                lineTo(8.471f, 7.237f)
                close()
            }
        }.build()

        return _Pulse!!
    }

@Suppress("ObjectPropertyName")
private var _Pulse: ImageVector? = null

@Preview
@Composable
private fun PulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Pulse, contentDescription = null)
    }
}
