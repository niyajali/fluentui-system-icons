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

public val FluentUi.Filled.BluetoothSearching: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BluetoothSearching",
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
            moveTo(18.499f, 9.134f)
            curveTo(18.977f, 8.858f, 19.589f, 9.021f, 19.866f, 9.499f)
            curveTo(20.308f, 10.264f, 20.5f, 11.126f, 20.5f, 12f)
            curveTo(20.5f, 12.874f, 20.308f, 13.736f, 19.866f, 14.501f)
            curveTo(19.589f, 14.979f, 18.977f, 15.142f, 18.499f, 14.866f)
            curveTo(18.021f, 14.589f, 17.858f, 13.977f, 18.134f, 13.499f)
            curveTo(18.373f, 13.087f, 18.5f, 12.583f, 18.5f, 12f)
            curveTo(18.5f, 11.417f, 18.373f, 10.913f, 18.134f, 10.501f)
            curveTo(17.858f, 10.023f, 18.021f, 9.411f, 18.499f, 9.134f)
            close()
            moveTo(21.785f, 7.05f)
            curveTo(21.443f, 6.617f, 20.815f, 6.542f, 20.381f, 6.884f)
            curveTo(19.947f, 7.226f, 19.873f, 7.855f, 20.215f, 8.289f)
            curveTo(21.02f, 9.31f, 21.5f, 10.598f, 21.5f, 12f)
            curveTo(21.5f, 13.403f, 21.02f, 14.69f, 20.215f, 15.712f)
            curveTo(19.873f, 16.145f, 19.947f, 16.774f, 20.381f, 17.116f)
            curveTo(20.815f, 17.458f, 21.443f, 17.383f, 21.785f, 16.95f)
            curveTo(22.859f, 15.588f, 23.5f, 13.868f, 23.5f, 12f)
            curveTo(23.5f, 10.132f, 22.859f, 8.412f, 21.785f, 7.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BluetoothSearchingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BluetoothSearching, contentDescription = null)
    }
}
