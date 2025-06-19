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

public val FluentIcons.Filled.WhiteboardOff: ImageVector
    get() {
        if (_WhiteboardOff != null) {
            return _WhiteboardOff!!
        }
        _WhiteboardOff = ImageVector.Builder(
            name = "Filled.WhiteboardOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(3.47f, 4.531f)
                curveTo(2.585f, 5.111f, 2f, 6.112f, 2f, 7.25f)
                verticalLineTo(10.805f)
                lineTo(5.11f, 8.85f)
                lineTo(5.256f, 8.766f)
                curveTo(6.287f, 8.219f, 7.582f, 8.553f, 8.213f, 9.558f)
                curveTo(8.608f, 10.186f, 8.665f, 10.965f, 8.377f, 11.64f)
                lineTo(8.297f, 11.806f)
                lineTo(7.089f, 14.092f)
                lineTo(7.048f, 14.185f)
                curveTo(6.921f, 14.532f, 7.066f, 14.928f, 7.402f, 15.105f)
                curveTo(7.595f, 15.207f, 7.822f, 15.219f, 8.022f, 15.142f)
                lineTo(8.12f, 15.096f)
                lineTo(9.879f, 14.103f)
                lineTo(9.971f, 14.058f)
                curveTo(10.314f, 13.92f, 10.714f, 14.054f, 10.902f, 14.384f)
                curveTo(11.09f, 14.714f, 11f, 15.126f, 10.706f, 15.35f)
                lineTo(10.621f, 15.407f)
                lineTo(8.856f, 16.403f)
                lineTo(8.686f, 16.489f)
                curveTo(8.055f, 16.777f, 7.321f, 16.759f, 6.701f, 16.431f)
                curveTo(5.65f, 15.876f, 5.22f, 14.606f, 5.693f, 13.535f)
                lineTo(5.763f, 13.391f)
                lineTo(6.971f, 11.105f)
                lineTo(7.016f, 11.001f)
                curveTo(7.09f, 10.788f, 7.065f, 10.55f, 6.943f, 10.356f)
                curveTo(6.742f, 10.037f, 6.342f, 9.921f, 6.007f, 10.068f)
                lineTo(5.909f, 10.12f)
                lineTo(2.149f, 12.483f)
                lineTo(2.076f, 12.524f)
                lineTo(2f, 12.555f)
                lineTo(2f, 16.755f)
                curveTo(2f, 18.549f, 3.455f, 20.005f, 5.25f, 20.005f)
                horizontalLineTo(18.75f)
                curveTo(18.813f, 20.005f, 18.876f, 20.003f, 18.938f, 19.999f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(12.956f, 9.773f)
                lineTo(15.168f, 11.985f)
                lineTo(16.081f, 11.71f)
                curveTo(16.437f, 11.604f, 16.761f, 11.41f, 17.024f, 11.148f)
                lineTo(21.305f, 6.874f)
                curveTo(22.149f, 6.031f, 22.19f, 4.687f, 21.426f, 3.796f)
                lineTo(21.306f, 3.665f)
                lineTo(21.176f, 3.545f)
                curveTo(20.284f, 2.781f, 18.941f, 2.82f, 18.096f, 3.664f)
                lineTo(13.805f, 7.947f)
                curveTo(13.552f, 8.2f, 13.363f, 8.509f, 13.253f, 8.85f)
                lineTo(12.956f, 9.773f)
                close()
                moveTo(21.564f, 18.382f)
                lineTo(16.171f, 12.988f)
                lineTo(16.441f, 12.908f)
                curveTo(16.915f, 12.765f, 17.353f, 12.524f, 17.726f, 12.201f)
                lineTo(17.907f, 12.032f)
                lineTo(22f, 7.946f)
                verticalLineTo(16.755f)
                curveTo(22f, 17.347f, 21.841f, 17.903f, 21.564f, 18.382f)
                close()
                moveTo(7.183f, 4f)
                lineTo(11.963f, 8.78f)
                lineTo(12.063f, 8.467f)
                lineTo(12.144f, 8.243f)
                curveTo(12.32f, 7.801f, 12.585f, 7.4f, 12.922f, 7.063f)
                lineTo(15.989f, 4f)
                horizontalLineTo(7.183f)
                close()
            }
        }.build()

        return _WhiteboardOff!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteboardOff: ImageVector? = null

@Preview
@Composable
private fun WhiteboardOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WhiteboardOff, contentDescription = null)
    }
}
