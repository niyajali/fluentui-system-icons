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

public val FluentUi.Filled.BluetoothConnected: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BluetoothConnected",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.617f, 2.076f)
            curveTo(11.991f, 1.921f, 12.421f, 2.007f, 12.707f, 2.293f)
            lineTo(17.707f, 7.293f)
            curveTo(17.908f, 7.494f, 18.014f, 7.771f, 17.999f, 8.055f)
            curveTo(17.983f, 8.339f, 17.847f, 8.603f, 17.625f, 8.781f)
            lineTo(13.601f, 12f)
            lineTo(17.625f, 15.219f)
            curveTo(17.847f, 15.397f, 17.983f, 15.661f, 17.999f, 15.945f)
            curveTo(18.014f, 16.229f, 17.908f, 16.506f, 17.707f, 16.707f)
            lineTo(12.707f, 21.707f)
            curveTo(12.421f, 21.993f, 11.991f, 22.079f, 11.617f, 21.924f)
            curveTo(11.244f, 21.769f, 11f, 21.404f, 11f, 21f)
            verticalLineTo(14.081f)
            lineTo(7.625f, 16.781f)
            curveTo(7.193f, 17.126f, 6.564f, 17.056f, 6.219f, 16.625f)
            curveTo(5.874f, 16.194f, 5.944f, 15.564f, 6.375f, 15.219f)
            lineTo(10.399f, 12f)
            lineTo(6.375f, 8.781f)
            curveTo(5.944f, 8.436f, 5.874f, 7.807f, 6.219f, 7.375f)
            curveTo(6.564f, 6.944f, 7.193f, 6.874f, 7.625f, 7.219f)
            lineTo(11f, 9.919f)
            verticalLineTo(3f)
            curveTo(11f, 2.596f, 11.244f, 2.231f, 11.617f, 2.076f)
            close()
            moveTo(13f, 14.081f)
            verticalLineTo(18.586f)
            lineTo(15.503f, 16.083f)
            lineTo(13f, 14.081f)
            close()
            moveTo(13f, 9.919f)
            lineTo(15.503f, 7.917f)
            lineTo(13f, 5.414f)
            verticalLineTo(9.919f)
            close()
            moveTo(20f, 12f)
            curveTo(20f, 12.552f, 19.552f, 13f, 19f, 13f)
            curveTo(18.448f, 13f, 18f, 12.552f, 18f, 12f)
            curveTo(18f, 11.448f, 18.448f, 11f, 19f, 11f)
            curveTo(19.552f, 11f, 20f, 11.448f, 20f, 12f)
            close()
            moveTo(5f, 13f)
            curveTo(5.552f, 13f, 6f, 12.552f, 6f, 12f)
            curveTo(6f, 11.448f, 5.552f, 11f, 5f, 11f)
            curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
            curveTo(4f, 12.552f, 4.448f, 13f, 5f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BluetoothConnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BluetoothConnected, contentDescription = null)
    }
}
