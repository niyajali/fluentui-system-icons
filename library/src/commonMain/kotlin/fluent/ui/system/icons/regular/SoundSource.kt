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

public val FluentUi.Regular.SoundSource: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SoundSource",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 14.217f, 19.652f, 16.235f, 18.261f, 17.748f)
            lineTo(19.254f, 18.883f)
            curveTo(20.956f, 17.09f, 22f, 14.667f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 14.667f, 3.044f, 17.09f, 4.746f, 18.883f)
            lineTo(5.739f, 17.749f)
            curveTo(4.349f, 16.235f, 3.5f, 14.217f, 3.5f, 12f)
            close()
            moveTo(19.25f, 12.125f)
            curveTo(19.25f, 13.933f, 18.576f, 15.584f, 17.467f, 16.84f)
            lineTo(16.469f, 15.699f)
            curveTo(17.269f, 14.728f, 17.75f, 13.482f, 17.75f, 12.125f)
            curveTo(17.75f, 9.018f, 15.232f, 6.5f, 12.125f, 6.5f)
            curveTo(9.018f, 6.5f, 6.5f, 9.018f, 6.5f, 12.125f)
            curveTo(6.5f, 13.414f, 6.933f, 14.601f, 7.662f, 15.55f)
            lineTo(6.659f, 16.696f)
            curveTo(5.624f, 15.459f, 5f, 13.865f, 5f, 12.125f)
            curveTo(5f, 8.19f, 8.19f, 5f, 12.125f, 5f)
            curveTo(16.06f, 5f, 19.25f, 8.19f, 19.25f, 12.125f)
            close()
            moveTo(16.25f, 12f)
            curveTo(16.25f, 12.939f, 15.945f, 13.808f, 15.429f, 14.511f)
            lineTo(14.403f, 13.339f)
            curveTo(14.624f, 12.942f, 14.75f, 12.486f, 14.75f, 12f)
            curveTo(14.75f, 10.481f, 13.519f, 9.25f, 12f, 9.25f)
            curveTo(10.481f, 9.25f, 9.25f, 10.481f, 9.25f, 12f)
            curveTo(9.25f, 12.486f, 9.376f, 12.942f, 9.597f, 13.339f)
            lineTo(8.571f, 14.511f)
            curveTo(8.055f, 13.808f, 7.75f, 12.939f, 7.75f, 12f)
            curveTo(7.75f, 9.653f, 9.653f, 7.75f, 12f, 7.75f)
            curveTo(14.347f, 7.75f, 16.25f, 9.653f, 16.25f, 12f)
            close()
            moveTo(12.564f, 12.756f)
            curveTo(12.422f, 12.593f, 12.216f, 12.5f, 12f, 12.5f)
            curveTo(11.784f, 12.5f, 11.578f, 12.593f, 11.436f, 12.756f)
            lineTo(4.436f, 20.756f)
            curveTo(4.242f, 20.978f, 4.195f, 21.292f, 4.317f, 21.56f)
            curveTo(4.439f, 21.828f, 4.706f, 22f, 5f, 22f)
            horizontalLineTo(19f)
            curveTo(19.294f, 22f, 19.561f, 21.828f, 19.683f, 21.56f)
            curveTo(19.805f, 21.292f, 19.758f, 20.978f, 19.564f, 20.756f)
            lineTo(12.564f, 12.756f)
            close()
            moveTo(17.347f, 20.5f)
            horizontalLineTo(6.653f)
            lineTo(12f, 14.389f)
            lineTo(17.347f, 20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SoundSourcePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SoundSource, contentDescription = null)
    }
}
