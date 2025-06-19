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

public val FluentIcons.Regular.CallEnd: ImageVector
    get() {
        if (_CallEnd != null) {
            return _CallEnd!!
        }
        _CallEnd = ImageVector.Builder(
            name = "Regular.CallEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.904f, 13.202f)
                lineTo(21.712f, 14.019f)
                curveTo(21.396f, 15.363f, 20.132f, 16.265f, 18.757f, 16.125f)
                lineTo(17.003f, 15.947f)
                curveTo(15.831f, 15.828f, 14.866f, 14.977f, 14.601f, 13.83f)
                lineTo(14.212f, 12.144f)
                curveTo(14.196f, 12.079f, 14.156f, 12.022f, 14.098f, 11.987f)
                curveTo(13.777f, 11.79f, 13.065f, 11.667f, 12f, 11.667f)
                curveTo(11.214f, 11.667f, 10.615f, 11.734f, 10.215f, 11.856f)
                curveTo(10.074f, 11.899f, 9.976f, 11.941f, 9.913f, 11.972f)
                lineTo(9.823f, 12.02f)
                lineTo(9.809f, 12.06f)
                lineTo(9.4f, 13.83f)
                curveTo(9.135f, 14.977f, 8.17f, 15.828f, 6.999f, 15.948f)
                lineTo(5.253f, 16.125f)
                curveTo(3.883f, 16.265f, 2.62f, 15.369f, 2.3f, 14.029f)
                lineTo(2.105f, 13.212f)
                curveTo(1.786f, 11.88f, 2.219f, 10.48f, 3.234f, 9.561f)
                curveTo(5.135f, 7.839f, 8.064f, 7f, 12f, 7f)
                curveTo(15.943f, 7f, 18.876f, 7.842f, 20.776f, 9.569f)
                curveTo(21.728f, 10.434f, 22.166f, 11.723f, 21.949f, 12.98f)
                lineTo(21.904f, 13.202f)
                close()
                moveTo(20.477f, 12.688f)
                curveTo(20.592f, 11.946f, 20.328f, 11.19f, 19.767f, 10.679f)
                curveTo(18.185f, 9.241f, 15.604f, 8.5f, 12f, 8.5f)
                curveTo(8.403f, 8.5f, 5.824f, 9.239f, 4.241f, 10.672f)
                curveTo(3.632f, 11.224f, 3.373f, 12.064f, 3.564f, 12.863f)
                lineTo(3.759f, 13.68f)
                curveTo(3.905f, 14.289f, 4.478f, 14.696f, 5.101f, 14.633f)
                lineTo(6.847f, 14.455f)
                curveTo(7.379f, 14.401f, 7.818f, 14.014f, 7.938f, 13.493f)
                lineTo(8.361f, 11.672f)
                lineTo(8.404f, 11.537f)
                curveTo(8.779f, 10.538f, 9.995f, 10.167f, 12f, 10.167f)
                curveTo(13.318f, 10.167f, 14.266f, 10.331f, 14.881f, 10.707f)
                curveTo(15.282f, 10.953f, 15.568f, 11.349f, 15.673f, 11.807f)
                lineTo(16.062f, 13.493f)
                curveTo(16.183f, 14.014f, 16.622f, 14.401f, 17.154f, 14.455f)
                lineTo(18.909f, 14.633f)
                curveTo(19.533f, 14.696f, 20.108f, 14.287f, 20.252f, 13.675f)
                lineTo(20.444f, 12.859f)
                lineTo(20.477f, 12.688f)
                close()
            }
        }.build()

        return _CallEnd!!
    }

@Suppress("ObjectPropertyName")
private var _CallEnd: ImageVector? = null

@Preview
@Composable
private fun CallEndPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallEnd, contentDescription = null)
    }
}
