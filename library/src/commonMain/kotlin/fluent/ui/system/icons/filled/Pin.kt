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

public val FluentIcons.Filled.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Filled.Pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.068f, 7.758f)
                lineTo(16.243f, 2.932f)
                curveTo(14.915f, 1.605f, 12.678f, 1.968f, 11.838f, 3.647f)
                lineTo(9.403f, 8.517f)
                curveTo(9.315f, 8.693f, 9.162f, 8.827f, 8.977f, 8.891f)
                lineTo(4.811f, 10.33f)
                curveTo(3.938f, 10.632f, 3.682f, 11.743f, 4.335f, 12.396f)
                lineTo(7.439f, 15.5f)
                lineTo(3f, 19.939f)
                lineTo(3f, 21f)
                horizontalLineTo(4.061f)
                lineTo(8.5f, 16.561f)
                lineTo(11.604f, 19.665f)
                curveTo(12.257f, 20.318f, 13.368f, 20.062f, 13.67f, 19.19f)
                lineTo(15.109f, 15.023f)
                curveTo(15.173f, 14.838f, 15.307f, 14.685f, 15.483f, 14.597f)
                lineTo(20.354f, 12.162f)
                curveTo(22.032f, 11.322f, 22.396f, 9.085f, 21.068f, 7.758f)
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
        Image(imageVector = FluentIcons.Filled.Pin, contentDescription = null)
    }
}
