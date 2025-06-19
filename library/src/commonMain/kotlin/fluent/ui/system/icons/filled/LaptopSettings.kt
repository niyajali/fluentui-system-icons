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

public val FluentIcons.Filled.LaptopSettings: ImageVector
    get() {
        if (_LaptopSettings != null) {
            return _LaptopSettings!!
        }
        _LaptopSettings = ImageVector.Builder(
            name = "Filled.LaptopSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(10.498f)
                curveTo(19.23f, 10.177f, 18.386f, 10f, 17.5f, 10f)
                curveTo(14.078f, 10f, 11.274f, 12.644f, 11.019f, 16f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 16f, 4f, 14.993f, 4f, 13.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.498f, 19f)
                curveTo(11.3f, 18.526f, 11.157f, 18.023f, 11.076f, 17.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
                curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
                horizontalLineTo(11.498f)
                close()
                moveTo(14.277f, 12.976f)
                curveTo(14.592f, 14.066f, 13.938f, 15.199f, 12.836f, 15.472f)
                lineTo(12.252f, 15.616f)
                curveTo(12.207f, 15.904f, 12.184f, 16.199f, 12.184f, 16.5f)
                curveTo(12.184f, 16.815f, 12.209f, 17.123f, 12.258f, 17.424f)
                lineTo(12.798f, 17.553f)
                curveTo(13.91f, 17.821f, 14.571f, 18.966f, 14.248f, 20.064f)
                lineTo(14.061f, 20.695f)
                curveTo(14.5f, 21.081f, 15.001f, 21.394f, 15.545f, 21.617f)
                lineTo(16.039f, 21.098f)
                curveTo(16.827f, 20.269f, 18.15f, 20.269f, 18.938f, 21.098f)
                lineTo(19.437f, 21.623f)
                curveTo(19.98f, 21.403f, 20.48f, 21.093f, 20.919f, 20.71f)
                lineTo(20.721f, 20.024f)
                curveTo(20.407f, 18.934f, 21.061f, 17.801f, 22.163f, 17.528f)
                lineTo(22.746f, 17.384f)
                curveTo(22.791f, 17.096f, 22.815f, 16.801f, 22.815f, 16.5f)
                curveTo(22.815f, 16.185f, 22.789f, 15.877f, 22.74f, 15.576f)
                lineTo(22.201f, 15.447f)
                curveTo(21.088f, 15.179f, 20.427f, 14.034f, 20.751f, 12.936f)
                lineTo(20.937f, 12.305f)
                curveTo(20.498f, 11.92f, 19.997f, 11.606f, 19.453f, 11.384f)
                lineTo(18.96f, 11.902f)
                curveTo(18.171f, 12.731f, 16.849f, 12.731f, 16.061f, 11.902f)
                lineTo(15.562f, 11.377f)
                curveTo(15.018f, 11.597f, 14.518f, 11.907f, 14.079f, 12.289f)
                lineTo(14.277f, 12.976f)
                close()
                moveTo(17.499f, 18f)
                curveTo(16.698f, 18f, 16.049f, 17.329f, 16.049f, 16.5f)
                curveTo(16.049f, 15.672f, 16.698f, 15f, 17.499f, 15f)
                curveTo(18.3f, 15f, 18.949f, 15.672f, 18.949f, 16.5f)
                curveTo(18.949f, 17.329f, 18.3f, 18f, 17.499f, 18f)
                close()
            }
        }.build()

        return _LaptopSettings!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopSettings: ImageVector? = null

@Preview
@Composable
private fun LaptopSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LaptopSettings, contentDescription = null)
    }
}
