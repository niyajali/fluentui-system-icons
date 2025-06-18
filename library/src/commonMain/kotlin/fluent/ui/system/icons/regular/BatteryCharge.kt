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

public val FluentUi.Regular.BatteryCharge: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BatteryCharge",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.75f, 6f)
            horizontalLineTo(17f)
            curveTo(18.598f, 6f, 19.904f, 7.249f, 19.995f, 8.824f)
            lineTo(20f, 9f)
            verticalLineTo(10f)
            lineTo(21.001f, 10.018f)
            curveTo(21.183f, 10.018f, 21.354f, 10.066f, 21.501f, 10.152f)
            curveTo(21.766f, 10.305f, 21.955f, 10.578f, 21.993f, 10.896f)
            lineTo(22.001f, 11.018f)
            verticalLineTo(13.018f)
            curveTo(22.001f, 13.388f, 21.799f, 13.711f, 21.501f, 13.884f)
            curveTo(21.39f, 13.948f, 21.267f, 13.991f, 21.135f, 14.009f)
            lineTo(21.001f, 14.018f)
            lineTo(20f, 14f)
            verticalLineTo(15f)
            curveTo(20f, 16.598f, 18.751f, 17.904f, 17.176f, 17.995f)
            lineTo(17f, 18f)
            horizontalLineTo(7.998f)
            curveTo(7.583f, 18f, 7.248f, 17.664f, 7.248f, 17.25f)
            curveTo(7.248f, 16.87f, 7.53f, 16.556f, 7.896f, 16.507f)
            lineTo(7.998f, 16.5f)
            horizontalLineTo(17f)
            curveTo(17.78f, 16.5f, 18.42f, 15.905f, 18.493f, 15.144f)
            lineTo(18.5f, 15f)
            verticalLineTo(9f)
            curveTo(18.5f, 8.22f, 17.905f, 7.58f, 17.145f, 7.507f)
            lineTo(17f, 7.5f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 7.5f, 10f, 7.164f, 10f, 6.75f)
            curveTo(10f, 6.37f, 10.282f, 6.057f, 10.648f, 6.007f)
            lineTo(10.75f, 6f)
            horizontalLineTo(17f)
            horizontalLineTo(10.75f)
            close()
            moveTo(6.251f, 10.998f)
            lineTo(6.252f, 17.25f)
            curveTo(6.252f, 17.664f, 5.916f, 18f, 5.502f, 18f)
            curveTo(5.122f, 18f, 4.808f, 17.718f, 4.759f, 17.352f)
            lineTo(4.752f, 17.25f)
            lineTo(4.752f, 10.998f)
            lineTo(3.75f, 10.999f)
            curveTo(2.783f, 10.999f, 2f, 10.215f, 2f, 9.249f)
            verticalLineTo(6.75f)
            curveTo(2f, 6.336f, 2.336f, 6f, 2.75f, 6f)
            horizontalLineTo(3.501f)
            lineTo(3.501f, 4.75f)
            curveTo(3.501f, 4.37f, 3.783f, 4.057f, 4.149f, 4.007f)
            lineTo(4.251f, 4f)
            curveTo(4.631f, 4f, 4.945f, 4.282f, 4.994f, 4.648f)
            lineTo(5.001f, 4.75f)
            lineTo(5.001f, 6f)
            horizontalLineTo(5.996f)
            lineTo(5.997f, 4.75f)
            curveTo(5.997f, 4.37f, 6.279f, 4.057f, 6.645f, 4.007f)
            lineTo(6.747f, 4f)
            curveTo(7.127f, 4f, 7.44f, 4.282f, 7.49f, 4.648f)
            lineTo(7.497f, 4.75f)
            lineTo(7.496f, 6f)
            horizontalLineTo(8.254f)
            curveTo(8.668f, 6f, 9.004f, 6.336f, 9.004f, 6.75f)
            verticalLineTo(9.249f)
            curveTo(9.004f, 10.215f, 8.22f, 10.999f, 7.254f, 10.999f)
            lineTo(6.251f, 10.998f)
            lineTo(6.252f, 17.25f)
            lineTo(6.251f, 10.998f)
            close()
            moveTo(7.504f, 7.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(9.249f)
            curveTo(3.5f, 9.387f, 3.612f, 9.499f, 3.75f, 9.499f)
            horizontalLineTo(7.254f)
            curveTo(7.392f, 9.499f, 7.504f, 9.387f, 7.504f, 9.249f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BatteryChargePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BatteryCharge, contentDescription = null)
    }
}
