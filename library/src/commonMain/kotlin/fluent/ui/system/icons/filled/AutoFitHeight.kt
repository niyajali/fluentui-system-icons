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

public val FluentUi.Filled.AutoFitHeight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AutoFitHeight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 3f)
            curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
            curveTo(5f, 4.552f, 5.448f, 5f, 6f, 5f)
            horizontalLineTo(18f)
            curveTo(18.552f, 5f, 19f, 4.552f, 19f, 4f)
            curveTo(19f, 3.448f, 18.552f, 3f, 18f, 3f)
            horizontalLineTo(6f)
            close()
            moveTo(10.354f, 13.701f)
            lineTo(10.453f, 13.786f)
            lineTo(11.252f, 14.586f)
            verticalLineTo(12.629f)
            lineTo(11.25f, 12.603f)
            verticalLineTo(9.414f)
            lineTo(10.451f, 10.214f)
            lineTo(10.353f, 10.299f)
            lineTo(10.345f, 10.304f)
            curveTo(9.953f, 10.595f, 9.398f, 10.563f, 9.043f, 10.208f)
            curveTo(8.688f, 9.853f, 8.656f, 9.297f, 8.946f, 8.906f)
            lineTo(8.952f, 8.898f)
            lineTo(9.036f, 8.8f)
            lineTo(11.391f, 6.443f)
            curveTo(11.57f, 6.17f, 11.895f, 6f, 12.251f, 6f)
            curveTo(12.574f, 6f, 12.87f, 6.139f, 13.056f, 6.368f)
            lineTo(13.061f, 6.375f)
            lineTo(13.107f, 6.439f)
            lineTo(15.465f, 8.8f)
            lineTo(15.55f, 8.898f)
            lineTo(15.555f, 8.906f)
            curveTo(15.814f, 9.254f, 15.817f, 9.731f, 15.565f, 10.083f)
            lineTo(15.559f, 10.091f)
            lineTo(15.46f, 10.208f)
            lineTo(15.354f, 10.299f)
            lineTo(15.347f, 10.304f)
            curveTo(14.998f, 10.563f, 14.521f, 10.566f, 14.17f, 10.314f)
            lineTo(14.161f, 10.308f)
            lineTo(14.052f, 10.215f)
            lineTo(13.25f, 9.413f)
            verticalLineTo(11.371f)
            lineTo(13.252f, 11.397f)
            verticalLineTo(14.587f)
            lineTo(14.047f, 13.792f)
            curveTo(14.402f, 13.437f, 14.957f, 13.405f, 15.349f, 13.696f)
            lineTo(15.356f, 13.701f)
            lineTo(15.454f, 13.786f)
            lineTo(15.461f, 13.792f)
            curveTo(15.816f, 14.147f, 15.848f, 14.703f, 15.557f, 15.094f)
            lineTo(15.552f, 15.102f)
            lineTo(15.467f, 15.2f)
            lineTo(13.113f, 17.556f)
            curveTo(12.934f, 17.83f, 12.609f, 18f, 12.253f, 18f)
            curveTo(11.897f, 18f, 11.571f, 17.83f, 11.392f, 17.557f)
            lineTo(9.045f, 15.206f)
            curveTo(8.654f, 14.816f, 8.654f, 14.183f, 9.045f, 13.792f)
            curveTo(9.4f, 13.437f, 9.955f, 13.405f, 10.347f, 13.696f)
            lineTo(10.354f, 13.701f)
            close()
            moveTo(5f, 20f)
            curveTo(5f, 19.448f, 5.448f, 19f, 6f, 19f)
            horizontalLineTo(18f)
            curveTo(18.552f, 19f, 19f, 19.448f, 19f, 20f)
            curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
            horizontalLineTo(6f)
            curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutoFitHeightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AutoFitHeight, contentDescription = null)
    }
}
