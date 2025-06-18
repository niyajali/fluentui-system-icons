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

public val FluentUi.Filled.CubeQuick: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CubeQuick",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.598f, 6.215f)
            curveTo(16.165f, 5.928f, 16.835f, 5.928f, 17.402f, 6.215f)
            lineTo(20.902f, 7.984f)
            curveTo(21.576f, 8.325f, 22f, 9.015f, 22f, 9.769f)
            verticalLineTo(14.234f)
            curveTo(22f, 14.988f, 21.576f, 15.679f, 20.902f, 16.019f)
            lineTo(17.402f, 17.788f)
            curveTo(16.835f, 18.075f, 16.165f, 18.075f, 15.598f, 17.788f)
            lineTo(12.098f, 16.019f)
            curveTo(11.425f, 15.679f, 11f, 14.988f, 11f, 14.234f)
            verticalLineTo(9.769f)
            curveTo(11f, 9.015f, 11.425f, 8.325f, 12.098f, 7.984f)
            lineTo(15.598f, 6.215f)
            close()
            moveTo(13.582f, 10.405f)
            curveTo(13.394f, 10.774f, 13.541f, 11.226f, 13.91f, 11.414f)
            lineTo(15.75f, 12.35f)
            verticalLineTo(14.253f)
            curveTo(15.75f, 14.667f, 16.086f, 15.003f, 16.5f, 15.003f)
            curveTo(16.914f, 15.003f, 17.25f, 14.667f, 17.25f, 14.253f)
            verticalLineTo(12.35f)
            lineTo(19.09f, 11.414f)
            curveTo(19.459f, 11.226f, 19.606f, 10.774f, 19.419f, 10.405f)
            curveTo(19.231f, 10.036f, 18.779f, 9.889f, 18.41f, 10.077f)
            lineTo(16.5f, 11.049f)
            lineTo(14.59f, 10.077f)
            curveTo(14.221f, 9.889f, 13.77f, 10.036f, 13.582f, 10.405f)
            close()
            moveTo(4.75f, 6.995f)
            curveTo(4.336f, 6.995f, 4f, 7.331f, 4f, 7.745f)
            curveTo(4f, 8.159f, 4.336f, 8.495f, 4.75f, 8.495f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 8.495f, 10f, 8.159f, 10f, 7.745f)
            curveTo(10f, 7.331f, 9.664f, 6.995f, 9.25f, 6.995f)
            horizontalLineTo(4.75f)
            close()
            moveTo(2.75f, 10.995f)
            curveTo(2.336f, 10.995f, 2f, 11.331f, 2f, 11.745f)
            curveTo(2f, 12.159f, 2.336f, 12.495f, 2.75f, 12.495f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 12.495f, 8f, 12.159f, 8f, 11.745f)
            curveTo(8f, 11.331f, 7.664f, 10.995f, 7.25f, 10.995f)
            horizontalLineTo(2.75f)
            close()
            moveTo(4f, 15.745f)
            curveTo(4f, 15.331f, 4.336f, 14.995f, 4.75f, 14.995f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 14.995f, 10f, 15.331f, 10f, 15.745f)
            curveTo(10f, 16.159f, 9.664f, 16.495f, 9.25f, 16.495f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 16.495f, 4f, 16.159f, 4f, 15.745f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CubeQuickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CubeQuick, contentDescription = null)
    }
}
