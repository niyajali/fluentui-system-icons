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

public val FluentUi.Filled.Multiplier5X: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Multiplier5X",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.01f, 7.859f)
            curveTo(7.08f, 7.366f, 7.502f, 7f, 8f, 7f)
            horizontalLineTo(12f)
            curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
            curveTo(13f, 8.552f, 12.552f, 9f, 12f, 9f)
            horizontalLineTo(8.867f)
            lineTo(8.681f, 10.301f)
            lineTo(9.031f, 10.246f)
            curveTo(11.247f, 9.896f, 13.25f, 11.608f, 13.25f, 13.851f)
            curveTo(13.25f, 15.876f, 11.585f, 17.5f, 9.58f, 17.5f)
            curveTo(8.546f, 17.5f, 7.545f, 17.064f, 6.846f, 16.292f)
            lineTo(6.509f, 15.922f)
            curveTo(6.138f, 15.513f, 6.169f, 14.88f, 6.578f, 14.509f)
            curveTo(6.987f, 14.138f, 7.62f, 14.169f, 7.991f, 14.578f)
            lineTo(8.327f, 14.949f)
            curveTo(8.643f, 15.297f, 9.103f, 15.5f, 9.58f, 15.5f)
            curveTo(10.501f, 15.5f, 11.25f, 14.752f, 11.25f, 13.851f)
            curveTo(11.25f, 12.837f, 10.344f, 12.063f, 9.343f, 12.221f)
            lineTo(7.656f, 12.488f)
            curveTo(7.343f, 12.537f, 7.024f, 12.435f, 6.798f, 12.212f)
            curveTo(6.572f, 11.99f, 6.465f, 11.673f, 6.51f, 11.359f)
            lineTo(7.01f, 7.859f)
            close()
            moveTo(14.293f, 12.293f)
            curveTo(14.683f, 11.902f, 15.317f, 11.902f, 15.707f, 12.293f)
            lineTo(16.5f, 13.086f)
            lineTo(17.293f, 12.293f)
            curveTo(17.683f, 11.902f, 18.317f, 11.902f, 18.707f, 12.293f)
            curveTo(19.098f, 12.683f, 19.098f, 13.317f, 18.707f, 13.707f)
            lineTo(17.914f, 14.5f)
            lineTo(18.707f, 15.293f)
            curveTo(19.098f, 15.683f, 19.098f, 16.317f, 18.707f, 16.707f)
            curveTo(18.317f, 17.098f, 17.683f, 17.098f, 17.293f, 16.707f)
            lineTo(16.5f, 15.914f)
            lineTo(15.707f, 16.707f)
            curveTo(15.317f, 17.098f, 14.683f, 17.098f, 14.293f, 16.707f)
            curveTo(13.902f, 16.317f, 13.902f, 15.683f, 14.293f, 15.293f)
            lineTo(15.086f, 14.5f)
            lineTo(14.293f, 13.707f)
            curveTo(13.902f, 13.317f, 13.902f, 12.683f, 14.293f, 12.293f)
            close()
            moveTo(4.75f, 17f)
            curveTo(5.164f, 17f, 5.5f, 16.664f, 5.5f, 16.25f)
            curveTo(5.5f, 15.836f, 5.164f, 15.5f, 4.75f, 15.5f)
            curveTo(4.336f, 15.5f, 4f, 15.836f, 4f, 16.25f)
            curveTo(4f, 16.664f, 4.336f, 17f, 4.75f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Multiplier5XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Multiplier5X, contentDescription = null)
    }
}
