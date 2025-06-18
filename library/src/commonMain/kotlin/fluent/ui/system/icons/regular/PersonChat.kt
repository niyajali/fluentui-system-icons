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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PersonChat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonChat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.311f, 15.498f)
            curveTo(11.483f, 14.965f, 11.723f, 14.461f, 12.019f, 13.998f)
            horizontalLineTo(6.249f)
            curveTo(5.007f, 13.998f, 4f, 15.005f, 4f, 16.247f)
            verticalLineTo(16.825f)
            curveTo(4f, 17.718f, 4.319f, 18.582f, 4.898f, 19.261f)
            curveTo(6.311f, 20.915f, 8.389f, 21.813f, 11.09f, 21.975f)
            lineTo(11.541f, 20.493f)
            curveTo(9.039f, 20.414f, 7.222f, 19.672f, 6.039f, 18.287f)
            curveTo(5.691f, 17.879f, 5.5f, 17.361f, 5.5f, 16.825f)
            verticalLineTo(16.247f)
            curveTo(5.5f, 15.834f, 5.836f, 15.498f, 6.249f, 15.498f)
            horizontalLineTo(11.311f)
            close()
            moveTo(11.998f, 2f)
            curveTo(14.76f, 2f, 16.999f, 4.239f, 16.999f, 7.001f)
            curveTo(16.999f, 9.763f, 14.76f, 12.002f, 11.998f, 12.002f)
            curveTo(9.236f, 12.002f, 6.997f, 9.763f, 6.997f, 7.001f)
            curveTo(6.997f, 4.239f, 9.236f, 2f, 11.998f, 2f)
            close()
            moveTo(11.998f, 3.5f)
            curveTo(10.065f, 3.5f, 8.497f, 5.068f, 8.497f, 7.001f)
            curveTo(8.497f, 8.935f, 10.065f, 10.502f, 11.998f, 10.502f)
            curveTo(13.932f, 10.502f, 15.499f, 8.935f, 15.499f, 7.001f)
            curveTo(15.499f, 5.068f, 13.932f, 3.5f, 11.998f, 3.5f)
            close()
            moveTo(23f, 17.499f)
            curveTo(23f, 20.537f, 20.537f, 23f, 17.499f, 23f)
            curveTo(16.531f, 23f, 15.622f, 22.75f, 14.832f, 22.312f)
            lineTo(12.645f, 22.977f)
            curveTo(12.262f, 23.094f, 11.904f, 22.736f, 12.021f, 22.353f)
            lineTo(12.687f, 20.166f)
            curveTo(12.248f, 19.376f, 11.998f, 18.467f, 11.998f, 17.499f)
            curveTo(11.998f, 14.46f, 14.461f, 11.998f, 17.499f, 11.998f)
            curveTo(20.537f, 11.998f, 23f, 14.46f, 23f, 17.499f)
            close()
            moveTo(15.498f, 15.998f)
            curveTo(15.222f, 15.998f, 14.998f, 16.222f, 14.998f, 16.499f)
            curveTo(14.998f, 16.775f, 15.222f, 16.999f, 15.498f, 16.999f)
            horizontalLineTo(19.499f)
            curveTo(19.775f, 16.999f, 19.999f, 16.775f, 19.999f, 16.499f)
            curveTo(19.999f, 16.222f, 19.775f, 15.998f, 19.499f, 15.998f)
            horizontalLineTo(15.498f)
            close()
            moveTo(14.998f, 18.499f)
            curveTo(14.998f, 18.775f, 15.222f, 18.999f, 15.498f, 18.999f)
            horizontalLineTo(17.499f)
            curveTo(17.775f, 18.999f, 17.999f, 18.775f, 17.999f, 18.499f)
            curveTo(17.999f, 18.223f, 17.775f, 17.999f, 17.499f, 17.999f)
            horizontalLineTo(15.498f)
            curveTo(15.222f, 17.999f, 14.998f, 18.223f, 14.998f, 18.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonChat, contentDescription = null)
    }
}
