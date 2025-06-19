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

public val FluentIcons.Filled.SportHockey: ImageVector
    get() {
        if (_SportHockey != null) {
            return _SportHockey!!
        }
        _SportHockey = ImageVector.Builder(
            name = "Filled.SportHockey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.354f, 12.573f)
                curveTo(1.67f, 14.472f, 1.579f, 16.447f, 2.792f, 17.672f)
                lineTo(2.792f, 17.673f)
                lineTo(3.026f, 17.91f)
                curveTo(3.178f, 18.064f, 3.402f, 18.291f, 3.687f, 18.578f)
                curveTo(4.257f, 19.152f, 5.072f, 19.971f, 6.049f, 20.949f)
                curveTo(7.329f, 22.229f, 9.354f, 22.25f, 11.338f, 21.609f)
                curveTo(13.365f, 20.955f, 15.588f, 19.548f, 17.564f, 17.572f)
                curveTo(19.54f, 15.597f, 20.946f, 13.373f, 21.601f, 11.346f)
                curveTo(22.242f, 9.362f, 22.221f, 7.338f, 20.941f, 6.058f)
                curveTo(20.424f, 5.54f, 19.61f, 4.721f, 18.926f, 4.03f)
                curveTo(18.584f, 3.685f, 18.274f, 3.372f, 18.05f, 3.146f)
                lineTo(17.687f, 2.779f)
                lineTo(17.685f, 2.782f)
                curveTo(16.46f, 1.567f, 14.484f, 1.658f, 12.585f, 2.342f)
                curveTo(10.62f, 3.05f, 8.436f, 4.485f, 6.466f, 6.455f)
                curveTo(4.497f, 8.424f, 3.062f, 10.608f, 2.354f, 12.573f)
                close()
                moveTo(17.491f, 6.871f)
                lineTo(17.491f, 6.873f)
                lineTo(17.491f, 6.874f)
                lineTo(17.49f, 6.878f)
                lineTo(17.488f, 6.89f)
                lineTo(17.481f, 6.927f)
                curveTo(17.475f, 6.957f, 17.467f, 7f, 17.455f, 7.054f)
                curveTo(17.432f, 7.161f, 17.396f, 7.314f, 17.344f, 7.504f)
                curveTo(17.24f, 7.884f, 17.069f, 8.417f, 16.8f, 9.045f)
                curveTo(16.262f, 10.302f, 15.33f, 11.95f, 13.75f, 13.531f)
                curveTo(12.171f, 15.11f, 10.472f, 16.094f, 9.17f, 16.684f)
                curveTo(8.518f, 16.979f, 7.962f, 17.177f, 7.565f, 17.302f)
                curveTo(7.367f, 17.364f, 7.208f, 17.409f, 7.096f, 17.438f)
                curveTo(7.04f, 17.453f, 6.996f, 17.463f, 6.964f, 17.471f)
                lineTo(6.927f, 17.48f)
                lineTo(6.916f, 17.482f)
                lineTo(6.912f, 17.483f)
                lineTo(6.909f, 17.483f)
                curveTo(6.909f, 17.483f, 6.16f, 17.567f, 6.018f, 16.909f)
                curveTo(5.93f, 16.504f, 6.187f, 16.106f, 6.591f, 16.018f)
                lineTo(6.592f, 16.017f)
                lineTo(6.595f, 16.017f)
                lineTo(6.617f, 16.012f)
                curveTo(6.638f, 16.007f, 6.671f, 15.999f, 6.716f, 15.987f)
                curveTo(6.805f, 15.963f, 6.941f, 15.926f, 7.114f, 15.871f)
                curveTo(7.462f, 15.762f, 7.961f, 15.585f, 8.551f, 15.317f)
                curveTo(9.733f, 14.782f, 11.269f, 13.891f, 12.689f, 12.47f)
                curveTo(14.109f, 11.051f, 14.943f, 9.574f, 15.421f, 8.456f)
                curveTo(15.66f, 7.897f, 15.809f, 7.429f, 15.898f, 7.106f)
                curveTo(15.942f, 6.945f, 15.971f, 6.82f, 15.989f, 6.738f)
                curveTo(15.998f, 6.697f, 16.004f, 6.667f, 16.007f, 6.649f)
                curveTo(16.081f, 6.244f, 16.454f, 5.942f, 16.872f, 6.01f)
                curveTo(17.281f, 6.077f, 17.558f, 6.463f, 17.491f, 6.871f)
                close()
            }
        }.build()

        return _SportHockey!!
    }

@Suppress("ObjectPropertyName")
private var _SportHockey: ImageVector? = null

@Preview
@Composable
private fun SportHockeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SportHockey, contentDescription = null)
    }
}
