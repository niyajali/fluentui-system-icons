package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.PhoneChat: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneChat",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(11.019f)
            curveTo(17.835f, 11.006f, 17.669f, 11f, 17.502f, 11f)
            curveTo(13.911f, 11f, 11.001f, 13.911f, 11.001f, 17.501f)
            curveTo(11.001f, 18.487f, 11.221f, 19.424f, 11.615f, 20.264f)
            lineTo(11.087f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(21f, 13.256f)
            curveTo(20.162f, 12.565f, 19.117f, 12.117f, 17.971f, 12.02f)
            curveTo(17.816f, 12.007f, 17.659f, 12f, 17.501f, 12f)
            curveTo(14.463f, 12f, 12f, 14.463f, 12f, 17.501f)
            curveTo(12f, 18.469f, 12.25f, 19.379f, 12.689f, 20.169f)
            lineTo(12.023f, 22.355f)
            curveTo(11.907f, 22.738f, 12.264f, 23.096f, 12.647f, 22.979f)
            lineTo(14.834f, 22.314f)
            curveTo(15.624f, 22.753f, 16.534f, 23.002f, 17.501f, 23.002f)
            curveTo(20.539f, 23.002f, 23.002f, 20.539f, 23.002f, 17.501f)
            curveTo(23.002f, 15.792f, 22.223f, 14.265f, 21f, 13.256f)
            close()
            moveTo(15.501f, 17.001f)
            curveTo(15.225f, 17.001f, 15.001f, 16.777f, 15.001f, 16.501f)
            curveTo(15.001f, 16.225f, 15.225f, 16.001f, 15.501f, 16.001f)
            horizontalLineTo(19.501f)
            curveTo(19.778f, 16.001f, 20.002f, 16.225f, 20.002f, 16.501f)
            curveTo(20.002f, 16.777f, 19.778f, 17.001f, 19.501f, 17.001f)
            horizontalLineTo(15.501f)
            close()
            moveTo(17.501f, 19.001f)
            horizontalLineTo(15.501f)
            curveTo(15.225f, 19.001f, 15.001f, 18.778f, 15.001f, 18.501f)
            curveTo(15.001f, 18.225f, 15.225f, 18.001f, 15.501f, 18.001f)
            horizontalLineTo(17.501f)
            curveTo(17.777f, 18.001f, 18.001f, 18.225f, 18.001f, 18.501f)
            curveTo(18.001f, 18.778f, 17.777f, 19.001f, 17.501f, 19.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneChat, contentDescription = null)
    }
}
