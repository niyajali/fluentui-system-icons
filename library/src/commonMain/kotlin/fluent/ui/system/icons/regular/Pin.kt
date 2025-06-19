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

public val FluentIcons.Regular.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Regular.Pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.243f, 2.932f)
                lineTo(21.068f, 7.758f)
                curveTo(22.396f, 9.085f, 22.032f, 11.322f, 20.354f, 12.162f)
                lineTo(15.483f, 14.597f)
                curveTo(15.307f, 14.685f, 15.173f, 14.838f, 15.109f, 15.023f)
                lineTo(13.67f, 19.19f)
                curveTo(13.368f, 20.062f, 12.257f, 20.318f, 11.604f, 19.665f)
                lineTo(8.5f, 16.561f)
                lineTo(4.061f, 21f)
                horizontalLineTo(3f)
                lineTo(3f, 19.939f)
                lineTo(7.439f, 15.5f)
                lineTo(4.335f, 12.396f)
                curveTo(3.682f, 11.743f, 3.938f, 10.632f, 4.811f, 10.33f)
                lineTo(8.977f, 8.891f)
                curveTo(9.162f, 8.827f, 9.315f, 8.693f, 9.403f, 8.517f)
                lineTo(11.838f, 3.647f)
                curveTo(12.678f, 1.968f, 14.915f, 1.605f, 16.243f, 2.932f)
                close()
                moveTo(20.008f, 8.818f)
                lineTo(15.182f, 3.993f)
                curveTo(14.578f, 3.389f, 13.561f, 3.554f, 13.18f, 4.317f)
                lineTo(10.745f, 9.188f)
                curveTo(10.481f, 9.714f, 10.023f, 10.117f, 9.467f, 10.309f)
                lineTo(5.678f, 11.618f)
                lineTo(12.383f, 18.322f)
                lineTo(13.691f, 14.533f)
                curveTo(13.884f, 13.977f, 14.286f, 13.519f, 14.812f, 13.256f)
                lineTo(19.683f, 10.82f)
                curveTo(20.446f, 10.439f, 20.611f, 9.422f, 20.008f, 8.818f)
                close()
            }
        }.build()

        return _Pin!!
    }

@Suppress("ObjectPropertyName")
private var _Pin: ImageVector? = null

@Preview
@Composable
private fun PinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pin, contentDescription = null)
    }
}
