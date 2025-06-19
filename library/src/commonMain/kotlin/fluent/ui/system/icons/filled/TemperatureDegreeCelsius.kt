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

public val FluentIcons.Filled.TemperatureDegreeCelsius: ImageVector
    get() {
        if (_TemperatureDegreeCelsius != null) {
            return _TemperatureDegreeCelsius!!
        }
        _TemperatureDegreeCelsius = ImageVector.Builder(
            name = "Filled.TemperatureDegreeCelsius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                curveTo(6.328f, 7f, 7f, 7.672f, 7f, 8.5f)
                curveTo(7f, 9.328f, 6.328f, 10f, 5.5f, 10f)
                curveTo(4.672f, 10f, 4f, 9.328f, 4f, 8.5f)
                close()
                moveTo(5.5f, 5f)
                curveTo(3.567f, 5f, 2f, 6.567f, 2f, 8.5f)
                curveTo(2f, 10.433f, 3.567f, 12f, 5.5f, 12f)
                curveTo(7.433f, 12f, 9f, 10.433f, 9f, 8.5f)
                curveTo(9f, 6.567f, 7.433f, 5f, 5.5f, 5f)
                close()
                moveTo(13.212f, 8.224f)
                curveTo(12.501f, 9.026f, 12f, 10.273f, 12f, 12f)
                curveTo(12f, 13.727f, 12.501f, 14.974f, 13.212f, 15.776f)
                curveTo(13.919f, 16.573f, 14.892f, 17f, 16f, 17f)
                curveTo(17.108f, 17f, 18.081f, 16.573f, 18.788f, 15.776f)
                curveTo(18.954f, 15.589f, 19.109f, 15.377f, 19.249f, 15.14f)
                curveTo(19.467f, 14.769f, 19.845f, 14.5f, 20.276f, 14.5f)
                curveTo(20.976f, 14.5f, 21.485f, 15.175f, 21.167f, 15.8f)
                curveTo(20.922f, 16.281f, 20.626f, 16.717f, 20.284f, 17.104f)
                curveTo(19.18f, 18.347f, 17.653f, 19f, 16f, 19f)
                curveTo(14.347f, 19f, 12.82f, 18.347f, 11.716f, 17.104f)
                curveTo(10.618f, 15.866f, 10f, 14.113f, 10f, 12f)
                curveTo(10f, 9.887f, 10.618f, 8.134f, 11.716f, 6.896f)
                curveTo(12.82f, 5.653f, 14.347f, 5f, 16f, 5f)
                curveTo(17.653f, 5f, 19.18f, 5.653f, 20.284f, 6.896f)
                curveTo(20.626f, 7.283f, 20.922f, 7.719f, 21.167f, 8.2f)
                curveTo(21.485f, 8.825f, 20.976f, 9.5f, 20.276f, 9.5f)
                curveTo(19.845f, 9.5f, 19.467f, 9.231f, 19.249f, 8.86f)
                curveTo(19.109f, 8.623f, 18.954f, 8.411f, 18.788f, 8.224f)
                curveTo(18.081f, 7.427f, 17.108f, 7f, 16f, 7f)
                curveTo(14.892f, 7f, 13.919f, 7.427f, 13.212f, 8.224f)
                close()
            }
        }.build()

        return _TemperatureDegreeCelsius!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureDegreeCelsius: ImageVector? = null

@Preview
@Composable
private fun TemperatureDegreeCelsiusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TemperatureDegreeCelsius, contentDescription = null)
    }
}
