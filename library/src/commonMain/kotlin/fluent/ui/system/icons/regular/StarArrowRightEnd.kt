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

public val FluentIcons.Regular.StarArrowRightEnd: ImageVector
    get() {
        if (_StarArrowRightEnd != null) {
            return _StarArrowRightEnd!!
        }
        _StarArrowRightEnd = ImageVector.Builder(
            name = "Regular.StarArrowRightEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.788f, 3.102f)
                curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
                lineTo(15.567f, 7.88f)
                lineTo(20.84f, 8.646f)
                curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
                lineTo(20.683f, 11.831f)
                curveTo(20.211f, 11.565f, 19.702f, 11.357f, 19.166f, 11.215f)
                lineTo(20.323f, 10.087f)
                lineTo(15.273f, 9.353f)
                curveTo(14.833f, 9.289f, 14.453f, 9.013f, 14.257f, 8.614f)
                lineTo(11.998f, 4.039f)
                lineTo(9.74f, 8.614f)
                curveTo(9.543f, 9.013f, 9.163f, 9.289f, 8.724f, 9.353f)
                lineTo(3.674f, 10.087f)
                lineTo(7.328f, 13.649f)
                curveTo(7.646f, 13.959f, 7.791f, 14.406f, 7.716f, 14.844f)
                lineTo(6.854f, 19.873f)
                lineTo(11.003f, 17.691f)
                curveTo(11.019f, 18.234f, 11.101f, 18.76f, 11.241f, 19.261f)
                lineTo(7.283f, 21.342f)
                curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
                lineTo(6.224f, 14.668f)
                lineTo(2.409f, 10.949f)
                curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
                lineTo(8.43f, 7.88f)
                lineTo(10.788f, 3.102f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.537f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.537f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.223f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                lineTo(19.293f, 18f)
                lineTo(17.646f, 19.646f)
                curveTo(17.451f, 19.841f, 17.451f, 20.158f, 17.646f, 20.353f)
                curveTo(17.842f, 20.548f, 18.158f, 20.548f, 18.354f, 20.353f)
                lineTo(20.854f, 17.853f)
                curveTo(21.049f, 17.658f, 21.049f, 17.341f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
                curveTo(17.451f, 14.841f, 17.451f, 15.158f, 17.646f, 15.353f)
                lineTo(19.293f, 17f)
                lineTo(14.5f, 17f)
                close()
            }
        }.build()

        return _StarArrowRightEnd!!
    }

@Suppress("ObjectPropertyName")
private var _StarArrowRightEnd: ImageVector? = null

@Preview
@Composable
private fun StarArrowRightEndPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StarArrowRightEnd, contentDescription = null)
    }
}
