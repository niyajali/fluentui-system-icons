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

public val FluentUi.Regular.DeviceEq: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceEq",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3f)
            curveTo(12.38f, 3f, 12.693f, 3.282f, 12.743f, 3.648f)
            lineTo(12.75f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(12.75f, 20.664f, 12.414f, 21f, 12f, 21f)
            curveTo(11.62f, 21f, 11.306f, 20.718f, 11.257f, 20.352f)
            lineTo(11.25f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(11.25f, 3.336f, 11.586f, 3f, 12f, 3f)
            close()
            moveTo(8.255f, 6f)
            curveTo(8.635f, 6f, 8.948f, 6.282f, 8.998f, 6.648f)
            lineTo(9.005f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(9.005f, 17.664f, 8.669f, 18f, 8.255f, 18f)
            curveTo(7.875f, 18f, 7.561f, 17.718f, 7.512f, 17.352f)
            lineTo(7.505f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(7.505f, 6.336f, 7.841f, 6f, 8.255f, 6f)
            close()
            moveTo(15.745f, 6f)
            curveTo(16.125f, 6f, 16.438f, 6.282f, 16.488f, 6.648f)
            lineTo(16.495f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(16.495f, 17.664f, 16.159f, 18f, 15.745f, 18f)
            curveTo(15.365f, 18f, 15.051f, 17.718f, 15.002f, 17.352f)
            lineTo(14.995f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(14.995f, 6.336f, 15.331f, 6f, 15.745f, 6f)
            close()
            moveTo(4.751f, 9f)
            curveTo(5.131f, 9f, 5.444f, 9.282f, 5.494f, 9.648f)
            lineTo(5.501f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(5.501f, 14.664f, 5.165f, 15f, 4.751f, 15f)
            curveTo(4.371f, 15f, 4.057f, 14.718f, 4.008f, 14.352f)
            lineTo(4.001f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(4.001f, 9.336f, 4.337f, 9f, 4.751f, 9f)
            close()
            moveTo(19.252f, 9f)
            curveTo(19.632f, 9f, 19.946f, 9.282f, 19.995f, 9.648f)
            lineTo(20.002f, 9.75f)
            verticalLineTo(14.249f)
            curveTo(20.002f, 14.663f, 19.666f, 14.999f, 19.252f, 14.999f)
            curveTo(18.872f, 14.999f, 18.559f, 14.717f, 18.509f, 14.35f)
            lineTo(18.502f, 14.249f)
            verticalLineTo(9.75f)
            curveTo(18.502f, 9.336f, 18.838f, 9f, 19.252f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DeviceEqPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DeviceEq, contentDescription = null)
    }
}
