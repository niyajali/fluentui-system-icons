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

public val FluentUi.Regular.BuildingLighthouse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BuildingLighthouse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.309f, 2.21f)
            curveTo(9.728f, 1.93f, 10.275f, 1.93f, 10.694f, 2.21f)
            lineTo(14.443f, 4.706f)
            curveTo(15.473f, 5.392f, 14.987f, 6.997f, 13.75f, 6.997f)
            horizontalLineTo(13.5f)
            verticalLineTo(9.148f)
            curveTo(14.262f, 9.44f, 14.83f, 10.135f, 14.93f, 10.988f)
            lineTo(15.992f, 20.046f)
            curveTo(16.114f, 21.087f, 15.301f, 22f, 14.254f, 22f)
            horizontalLineTo(5.755f)
            curveTo(4.708f, 22f, 3.895f, 21.086f, 4.017f, 20.046f)
            lineTo(5.081f, 10.988f)
            curveTo(5.18f, 10.139f, 5.744f, 9.447f, 6.5f, 9.152f)
            verticalLineTo(6.997f)
            horizontalLineTo(6.253f)
            curveTo(5.015f, 6.997f, 4.53f, 5.392f, 5.56f, 4.706f)
            lineTo(9.309f, 2.21f)
            close()
            moveTo(8f, 9f)
            horizontalLineTo(12f)
            verticalLineTo(6.997f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            close()
            moveTo(10.001f, 3.55f)
            lineTo(7.079f, 5.497f)
            horizontalLineTo(12.924f)
            lineTo(10.001f, 3.55f)
            close()
            moveTo(16.22f, 4.22f)
            curveTo(15.927f, 4.513f, 15.927f, 4.987f, 16.22f, 5.28f)
            curveTo(16.513f, 5.573f, 16.988f, 5.573f, 17.281f, 5.28f)
            lineTo(18.781f, 3.78f)
            curveTo(19.073f, 3.487f, 19.073f, 3.013f, 18.781f, 2.72f)
            curveTo(18.488f, 2.427f, 18.013f, 2.427f, 17.72f, 2.72f)
            lineTo(16.22f, 4.22f)
            close()
            moveTo(16.22f, 11.28f)
            curveTo(15.927f, 10.988f, 15.927f, 10.513f, 16.22f, 10.22f)
            curveTo(16.513f, 9.927f, 16.988f, 9.927f, 17.281f, 10.22f)
            lineTo(18.781f, 11.72f)
            curveTo(19.073f, 12.013f, 19.073f, 12.488f, 18.781f, 12.78f)
            curveTo(18.488f, 13.073f, 18.013f, 13.073f, 17.72f, 12.78f)
            lineTo(16.22f, 11.28f)
            close()
            moveTo(16.75f, 7f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 7f, 21f, 7.336f, 21f, 7.75f)
            curveTo(21f, 8.164f, 20.664f, 8.5f, 20.25f, 8.5f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 8.5f, 16f, 8.164f, 16f, 7.75f)
            curveTo(16f, 7.336f, 16.336f, 7f, 16.75f, 7f)
            close()
            moveTo(5.579f, 19.61f)
            lineTo(5.507f, 20.221f)
            curveTo(5.489f, 20.369f, 5.605f, 20.5f, 5.755f, 20.5f)
            horizontalLineTo(14.254f)
            curveTo(14.403f, 20.5f, 14.519f, 20.369f, 14.502f, 20.221f)
            lineTo(14.13f, 17.044f)
            lineTo(5.579f, 19.61f)
            close()
            moveTo(13.952f, 15.531f)
            lineTo(13.62f, 12.697f)
            lineTo(6.126f, 14.945f)
            lineTo(5.769f, 17.986f)
            lineTo(13.952f, 15.531f)
            close()
            moveTo(13.443f, 11.184f)
            lineTo(13.441f, 11.163f)
            curveTo(13.396f, 10.785f, 13.076f, 10.5f, 12.696f, 10.5f)
            horizontalLineTo(7.315f)
            curveTo(6.935f, 10.5f, 6.615f, 10.785f, 6.571f, 11.163f)
            lineTo(6.317f, 13.322f)
            lineTo(13.443f, 11.184f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingLighthousePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BuildingLighthouse, contentDescription = null)
    }
}
