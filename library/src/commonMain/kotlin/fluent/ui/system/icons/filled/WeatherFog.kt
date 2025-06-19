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

public val FluentIcons.Filled.WeatherFog: ImageVector
    get() {
        if (_WeatherFog != null) {
            return _WeatherFog!!
        }
        _WeatherFog = ImageVector.Builder(
            name = "Filled.WeatherFog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.745f, 19.5f)
                horizontalLineTo(16.246f)
                curveTo(16.66f, 19.5f, 16.996f, 19.836f, 16.996f, 20.25f)
                curveTo(16.996f, 20.63f, 16.714f, 20.944f, 16.348f, 20.993f)
                lineTo(16.246f, 21f)
                horizontalLineTo(7.745f)
                curveTo(7.331f, 21f, 6.995f, 20.664f, 6.995f, 20.25f)
                curveTo(6.995f, 19.87f, 7.277f, 19.557f, 7.643f, 19.507f)
                lineTo(7.745f, 19.5f)
                horizontalLineTo(16.246f)
                horizontalLineTo(7.745f)
                close()
                moveTo(4.75f, 16.519f)
                horizontalLineTo(19.25f)
                curveTo(19.664f, 16.519f, 20f, 16.855f, 20f, 17.269f)
                curveTo(20f, 17.649f, 19.718f, 17.963f, 19.352f, 18.012f)
                lineTo(19.25f, 18.019f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 18.019f, 4f, 17.684f, 4f, 17.269f)
                curveTo(4f, 16.89f, 4.282f, 16.576f, 4.648f, 16.526f)
                lineTo(4.75f, 16.519f)
                close()
                moveTo(12f, 3.005f)
                curveTo(15.168f, 3.005f, 16.966f, 5.102f, 17.227f, 7.635f)
                lineTo(17.307f, 7.635f)
                curveTo(19.346f, 7.635f, 20.999f, 9.284f, 20.999f, 11.318f)
                curveTo(20.999f, 13.351f, 19.346f, 15f, 17.307f, 15f)
                horizontalLineTo(6.693f)
                curveTo(4.653f, 15f, 3f, 13.351f, 3f, 11.318f)
                curveTo(3f, 9.284f, 4.653f, 7.635f, 6.693f, 7.635f)
                lineTo(6.773f, 7.635f)
                curveTo(7.035f, 5.086f, 8.831f, 3.005f, 12f, 3.005f)
                close()
            }
        }.build()

        return _WeatherFog!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherFog: ImageVector? = null

@Preview
@Composable
private fun WeatherFogPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WeatherFog, contentDescription = null)
    }
}
