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

public val FluentUi.Filled.DualScreenSpan: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenSpan",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22.003f, 5.754f)
            curveTo(22.003f, 4.788f, 21.219f, 4.004f, 20.253f, 4.004f)
            horizontalLineTo(13.005f)
            curveTo(12.919f, 4.004f, 12.833f, 4.011f, 12.75f, 4.023f)
            lineTo(12.75f, 11.251f)
            horizontalLineTo(17.581f)
            lineTo(16.69f, 10.249f)
            curveTo(16.415f, 9.939f, 16.443f, 9.465f, 16.753f, 9.19f)
            curveTo(17.062f, 8.915f, 17.536f, 8.943f, 17.811f, 9.252f)
            lineTo(19.811f, 11.502f)
            curveTo(20.064f, 11.787f, 20.064f, 12.215f, 19.811f, 12.499f)
            lineTo(17.811f, 14.749f)
            curveTo(17.536f, 15.059f, 17.062f, 15.087f, 16.753f, 14.811f)
            curveTo(16.443f, 14.536f, 16.415f, 14.062f, 16.69f, 13.752f)
            lineTo(17.581f, 12.751f)
            horizontalLineTo(12.75f)
            lineTo(12.75f, 19.981f)
            curveTo(12.833f, 19.993f, 12.919f, 20f, 13.005f, 20f)
            horizontalLineTo(20.253f)
            curveTo(21.219f, 20f, 22.003f, 19.216f, 22.003f, 18.25f)
            verticalLineTo(5.754f)
            close()
            moveTo(11.251f, 11.251f)
            horizontalLineTo(6.421f)
            lineTo(7.311f, 10.249f)
            curveTo(7.586f, 9.939f, 7.559f, 9.465f, 7.249f, 9.19f)
            curveTo(6.939f, 8.915f, 6.465f, 8.943f, 6.19f, 9.252f)
            lineTo(4.19f, 11.502f)
            curveTo(3.938f, 11.787f, 3.938f, 12.215f, 4.19f, 12.499f)
            lineTo(6.19f, 14.749f)
            curveTo(6.465f, 15.059f, 6.939f, 15.087f, 7.249f, 14.811f)
            curveTo(7.559f, 14.536f, 7.586f, 14.062f, 7.311f, 13.752f)
            lineTo(6.421f, 12.751f)
            horizontalLineTo(11.251f)
            lineTo(11.251f, 19.98f)
            curveTo(11.17f, 19.991f, 11.089f, 19.997f, 11.005f, 19.997f)
            horizontalLineTo(3.758f)
            curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
            horizontalLineTo(11.005f)
            curveTo(11.089f, 4.002f, 11.171f, 4.008f, 11.251f, 4.019f)
            lineTo(11.251f, 11.251f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenSpanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenSpan, contentDescription = null)
    }
}
