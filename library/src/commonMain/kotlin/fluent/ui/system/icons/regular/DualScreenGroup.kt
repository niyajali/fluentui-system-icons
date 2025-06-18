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

public val FluentUi.Regular.DualScreenGroup: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenGroup",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.755f, 4.002f)
            lineTo(12.755f, 4.004f)
            lineTo(20.253f, 4.004f)
            curveTo(21.219f, 4.004f, 22.003f, 4.788f, 22.003f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(22.003f, 19.216f, 21.219f, 20f, 20.253f, 20f)
            horizontalLineTo(11.255f)
            lineTo(11.255f, 19.997f)
            lineTo(3.758f, 19.997f)
            curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
            horizontalLineTo(12.755f)
            close()
            moveTo(20.253f, 5.504f)
            horizontalLineTo(12.755f)
            verticalLineTo(18.5f)
            horizontalLineTo(20.253f)
            curveTo(20.391f, 18.5f, 20.503f, 18.388f, 20.503f, 18.25f)
            verticalLineTo(5.754f)
            curveTo(20.503f, 5.616f, 20.391f, 5.504f, 20.253f, 5.504f)
            close()
            moveTo(11.255f, 5.502f)
            horizontalLineTo(3.758f)
            curveTo(3.62f, 5.502f, 3.508f, 5.614f, 3.508f, 5.752f)
            verticalLineTo(18.247f)
            curveTo(3.508f, 18.385f, 3.62f, 18.497f, 3.758f, 18.497f)
            horizontalLineTo(11.255f)
            verticalLineTo(5.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenGroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DualScreenGroup, contentDescription = null)
    }
}
