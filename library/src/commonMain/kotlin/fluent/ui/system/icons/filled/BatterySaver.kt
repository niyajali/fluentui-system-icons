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

public val FluentIcons.Filled.BatterySaver: ImageVector
    get() {
        if (_BatterySaver != null) {
            return _BatterySaver!!
        }
        _BatterySaver = ImageVector.Builder(
            name = "Filled.BatterySaver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.645f, 4.361f)
                curveTo(10.209f, 7.213f, 11.004f, 9.506f, 11.004f, 11.081f)
                curveTo(11.004f, 12.656f, 10.26f, 13.977f, 9.538f, 14.601f)
                curveTo(9.48f, 14.651f, 9.415f, 14.697f, 9.342f, 14.738f)
                lineTo(9.228f, 14.795f)
                curveTo(8.999f, 14.899f, 8.73f, 14.798f, 8.627f, 14.569f)
                curveTo(8.588f, 14.485f, 8.577f, 14.391f, 8.594f, 14.3f)
                lineTo(8.619f, 14.212f)
                curveTo(9.231f, 12.697f, 9.528f, 11.208f, 9.504f, 9.748f)
                curveTo(9.498f, 9.334f, 9.157f, 9.003f, 8.743f, 9.01f)
                curveTo(8.344f, 9.016f, 8.023f, 9.332f, 8.005f, 9.725f)
                lineTo(8.009f, 9.748f)
                curveTo(8.015f, 10.118f, 7.996f, 10.492f, 7.953f, 10.869f)
                lineTo(7.887f, 11.346f)
                lineTo(7.845f, 11.583f)
                lineTo(7.777f, 11.913f)
                lineTo(7.675f, 12.325f)
                lineTo(7.632f, 12.481f)
                curveTo(7.462f, 13.083f, 7.233f, 13.694f, 6.948f, 14.314f)
                curveTo(6.185f, 15.972f, 4.869f, 17.189f, 3.036f, 17.948f)
                curveTo(2.653f, 18.106f, 2.215f, 17.924f, 2.056f, 17.541f)
                curveTo(1.898f, 17.159f, 2.08f, 16.72f, 2.462f, 16.562f)
                curveTo(3.427f, 16.162f, 4.199f, 15.623f, 4.786f, 14.939f)
                curveTo(3.123f, 14.415f, 2.155f, 13.269f, 2.023f, 11.669f)
                curveTo(1.874f, 9.86f, 2.555f, 8.635f, 4.283f, 7.258f)
                lineTo(4.774f, 6.88f)
                lineTo(5.129f, 6.611f)
                lineTo(5.498f, 6.322f)
                curveTo(6.331f, 5.649f, 6.956f, 4.987f, 7.375f, 4.342f)
                curveTo(7.676f, 3.878f, 8.376f, 3.872f, 8.645f, 4.361f)
                close()
                moveTo(17f, 6.001f)
                curveTo(18.598f, 6.001f, 19.904f, 7.249f, 19.995f, 8.824f)
                lineTo(20f, 9.001f)
                verticalLineTo(10f)
                lineTo(21.001f, 10.018f)
                curveTo(21.183f, 10.018f, 21.354f, 10.067f, 21.501f, 10.152f)
                curveTo(21.766f, 10.306f, 21.955f, 10.578f, 21.993f, 10.897f)
                lineTo(22.001f, 11.018f)
                verticalLineTo(13.018f)
                curveTo(22.001f, 13.389f, 21.8f, 13.712f, 21.501f, 13.885f)
                curveTo(21.39f, 13.948f, 21.267f, 13.992f, 21.135f, 14.009f)
                lineTo(21.001f, 14.018f)
                lineTo(20f, 14f)
                verticalLineTo(15f)
                curveTo(20f, 16.598f, 18.751f, 17.904f, 17.176f, 17.995f)
                lineTo(17f, 18f)
                horizontalLineTo(8.243f)
                curveTo(7.69f, 18f, 7.243f, 17.553f, 7.243f, 17f)
                curveTo(7.243f, 16.488f, 7.629f, 16.065f, 8.126f, 16.007f)
                lineTo(8.243f, 16f)
                horizontalLineTo(8.873f)
                lineTo(8.948f, 15.995f)
                lineTo(9.053f, 15.976f)
                curveTo(9.796f, 15.814f, 12f, 14.773f, 12f, 11.018f)
                curveTo(12f, 9.802f, 11.698f, 8.45f, 11.094f, 6.964f)
                curveTo(11.061f, 6.88f, 11.043f, 6.791f, 11.043f, 6.701f)
                curveTo(11.043f, 6.346f, 11.306f, 6.053f, 11.648f, 6.007f)
                lineTo(11.743f, 6.001f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BatterySaver!!
    }

@Suppress("ObjectPropertyName")
private var _BatterySaver: ImageVector? = null

@Preview
@Composable
private fun BatterySaverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BatterySaver, contentDescription = null)
    }
}
