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

public val FluentUi.Regular.EraserSmall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EraserSmall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.841f, 2.661f)
            curveTo(14.968f, 1.771f, 13.537f, 1.76f, 12.651f, 2.638f)
            lineTo(3.052f, 12.146f)
            curveTo(2.161f, 13.03f, 2.164f, 14.471f, 3.059f, 15.35f)
            lineTo(8.158f, 20.358f)
            curveTo(9.042f, 21.226f, 10.462f, 21.216f, 11.334f, 20.335f)
            lineTo(13.119f, 18.532f)
            curveTo(13.041f, 18.2f, 13f, 17.855f, 13f, 17.5f)
            curveTo(13f, 17.112f, 13.049f, 16.736f, 13.141f, 16.377f)
            lineTo(12.791f, 16.73f)
            lineTo(6.703f, 10.642f)
            lineTo(13.706f, 3.704f)
            curveTo(14.002f, 3.411f, 14.479f, 3.414f, 14.77f, 3.711f)
            lineTo(19.68f, 8.72f)
            curveTo(19.967f, 9.012f, 19.965f, 9.481f, 19.677f, 9.772f)
            lineTo(16.332f, 13.153f)
            curveTo(16.704f, 13.053f, 17.096f, 13f, 17.5f, 13f)
            curveTo(17.839f, 13f, 18.169f, 13.037f, 18.486f, 13.108f)
            lineTo(20.743f, 10.827f)
            curveTo(21.608f, 9.953f, 21.611f, 8.547f, 20.751f, 7.669f)
            lineTo(15.841f, 2.661f)
            close()
            moveTo(5.637f, 11.697f)
            lineTo(11.736f, 17.796f)
            lineTo(10.268f, 19.28f)
            curveTo(9.977f, 19.573f, 9.504f, 19.577f, 9.209f, 19.288f)
            lineTo(4.11f, 14.28f)
            curveTo(3.812f, 13.987f, 3.811f, 13.506f, 4.108f, 13.212f)
            lineTo(5.637f, 11.697f)
            close()
            moveTo(17.603f, 14.001f)
            curveTo(19.488f, 14.055f, 21f, 15.601f, 21f, 17.5f)
            curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
            curveTo(15.613f, 21f, 14.075f, 19.507f, 14.002f, 17.639f)
            curveTo(14.001f, 17.596f, 14f, 17.554f, 14f, 17.511f)
            curveTo(14f, 17.507f, 14f, 17.503f, 14f, 17.5f)
            curveTo(14f, 15.566f, 15.567f, 14f, 17.5f, 14f)
            curveTo(17.534f, 14f, 17.568f, 14f, 17.603f, 14.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EraserSmallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EraserSmall, contentDescription = null)
    }
}
