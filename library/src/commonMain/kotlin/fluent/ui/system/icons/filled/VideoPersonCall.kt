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

public val FluentUi.Filled.VideoPersonCall: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPersonCall",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.995f, 6.25f)
            curveTo(21.995f, 5.007f, 20.988f, 4f, 19.745f, 4f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(2f, 18.997f, 3.007f, 20.005f, 4.25f, 20.005f)
            horizontalLineTo(14.008f)
            curveTo(14.044f, 19.578f, 14.202f, 19.158f, 14.486f, 18.799f)
            lineTo(15.286f, 17.789f)
            curveTo(15.706f, 17.26f, 16.338f, 16.961f, 16.994f, 16.957f)
            lineTo(16.995f, 15.75f)
            lineTo(16.989f, 15.606f)
            curveTo(16.916f, 14.707f, 16.163f, 14f, 15.245f, 14f)
            horizontalLineTo(8.75f)
            lineTo(8.606f, 14.006f)
            curveTo(7.707f, 14.079f, 7f, 14.832f, 7f, 15.75f)
            lineTo(6.999f, 18.504f)
            lineTo(4.25f, 18.505f)
            curveTo(3.836f, 18.505f, 3.5f, 18.169f, 3.5f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
            horizontalLineTo(19.745f)
            curveTo(20.16f, 5.5f, 20.495f, 5.836f, 20.495f, 6.25f)
            verticalLineTo(10.023f)
            curveTo(20.83f, 9.973f, 21.182f, 9.998f, 21.525f, 10.111f)
            lineTo(21.956f, 10.252f)
            lineTo(21.995f, 10.265f)
            verticalLineTo(6.25f)
            close()
            moveTo(15f, 10f)
            curveTo(15f, 8.344f, 13.657f, 7f, 12f, 7f)
            curveTo(10.343f, 7f, 9f, 8.344f, 9f, 10f)
            curveTo(9f, 11.657f, 10.343f, 13f, 12f, 13f)
            curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
            close()
            moveTo(19.192f, 12.995f)
            lineTo(19.668f, 11.79f)
            curveTo(19.91f, 11.176f, 20.589f, 10.857f, 21.216f, 11.062f)
            lineTo(21.647f, 11.203f)
            curveTo(22.371f, 11.44f, 22.973f, 12.009f, 22.997f, 12.772f)
            curveTo(23.096f, 15.883f, 20.521f, 20.354f, 17.784f, 21.827f)
            curveTo(17.111f, 22.189f, 16.316f, 21.95f, 15.748f, 21.436f)
            lineTo(15.412f, 21.131f)
            curveTo(14.923f, 20.688f, 14.861f, 19.942f, 15.27f, 19.425f)
            lineTo(16.07f, 18.415f)
            curveTo(16.36f, 18.048f, 16.837f, 17.884f, 17.291f, 17.995f)
            lineTo(18.582f, 18.308f)
            curveTo(19.685f, 17.578f, 20.277f, 16.552f, 20.356f, 15.229f)
            lineTo(19.44f, 14.265f)
            curveTo(19.117f, 13.926f, 19.021f, 13.43f, 19.192f, 12.995f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoPersonCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoPersonCall, contentDescription = null)
    }
}
