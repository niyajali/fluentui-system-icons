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

public val FluentUi.Filled.PaymentWireless: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaymentWireless",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
            moveTo(14.343f, 6.208f)
            curveTo(14.036f, 5.931f, 13.538f, 5.931f, 13.23f, 6.208f)
            curveTo(12.923f, 6.486f, 12.923f, 6.937f, 13.23f, 7.214f)
            curveTo(16.153f, 9.857f, 16.153f, 14.142f, 13.23f, 16.785f)
            curveTo(12.923f, 17.063f, 12.923f, 17.514f, 13.23f, 17.791f)
            curveTo(13.538f, 18.069f, 14.036f, 18.069f, 14.343f, 17.791f)
            curveTo(17.881f, 14.593f, 17.881f, 9.407f, 14.343f, 6.208f)
            close()
            moveTo(10.217f, 7.722f)
            curveTo(9.928f, 8.018f, 9.928f, 8.498f, 10.217f, 8.794f)
            curveTo(11.951f, 10.565f, 11.951f, 13.437f, 10.217f, 15.209f)
            curveTo(9.928f, 15.505f, 9.928f, 15.984f, 10.217f, 16.281f)
            curveTo(10.507f, 16.577f, 10.977f, 16.577f, 11.267f, 16.281f)
            curveTo(13.58f, 13.917f, 13.58f, 10.085f, 11.267f, 7.722f)
            curveTo(10.977f, 7.426f, 10.507f, 7.426f, 10.217f, 7.722f)
            close()
            moveTo(8.302f, 9.216f)
            curveTo(8.004f, 8.928f, 7.521f, 8.928f, 7.223f, 9.216f)
            curveTo(6.926f, 9.504f, 6.926f, 9.97f, 7.223f, 10.258f)
            curveTo(8.219f, 11.22f, 8.219f, 12.78f, 7.223f, 13.741f)
            curveTo(6.926f, 14.029f, 6.926f, 14.496f, 7.223f, 14.783f)
            curveTo(7.521f, 15.071f, 8.004f, 15.071f, 8.302f, 14.783f)
            curveTo(9.894f, 13.246f, 9.894f, 10.753f, 8.302f, 9.216f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaymentWirelessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PaymentWireless, contentDescription = null)
    }
}
