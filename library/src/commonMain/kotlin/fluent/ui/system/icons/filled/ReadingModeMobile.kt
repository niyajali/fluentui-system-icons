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

public val FluentUi.Filled.ReadingModeMobile: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReadingModeMobile",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 2.001f)
            curveTo(18.941f, 2.001f, 19.916f, 2.926f, 19.995f, 4.097f)
            lineTo(20f, 4.251f)
            verticalLineTo(19.749f)
            curveTo(20f, 20.94f, 19.075f, 21.915f, 17.904f, 21.994f)
            lineTo(17.75f, 21.999f)
            horizontalLineTo(6.25f)
            curveTo(5.059f, 21.999f, 4.084f, 21.074f, 4.005f, 19.903f)
            lineTo(4f, 19.749f)
            verticalLineTo(4.251f)
            curveTo(4f, 3.06f, 4.925f, 2.085f, 6.096f, 2.006f)
            lineTo(6.25f, 2.001f)
            horizontalLineTo(17.75f)
            close()
            moveTo(12.248f, 12.997f)
            horizontalLineTo(7.75f)
            lineTo(7.648f, 13.004f)
            curveTo(7.282f, 13.054f, 7f, 13.368f, 7f, 13.747f)
            curveTo(7f, 14.127f, 7.282f, 14.441f, 7.648f, 14.491f)
            lineTo(7.75f, 14.497f)
            horizontalLineTo(12.248f)
            lineTo(12.35f, 14.491f)
            curveTo(12.716f, 14.441f, 12.998f, 14.127f, 12.998f, 13.747f)
            curveTo(12.998f, 13.368f, 12.716f, 13.054f, 12.35f, 13.004f)
            lineTo(12.248f, 12.997f)
            close()
            moveTo(16.25f, 9.999f)
            horizontalLineTo(7.75f)
            lineTo(7.648f, 10.005f)
            curveTo(7.282f, 10.055f, 7f, 10.369f, 7f, 10.749f)
            curveTo(7f, 11.128f, 7.282f, 11.442f, 7.648f, 11.492f)
            lineTo(7.75f, 11.499f)
            horizontalLineTo(16.25f)
            lineTo(16.352f, 11.492f)
            curveTo(16.718f, 11.442f, 17f, 11.128f, 17f, 10.749f)
            curveTo(17f, 10.369f, 16.718f, 10.055f, 16.352f, 10.005f)
            lineTo(16.25f, 9.999f)
            close()
            moveTo(16.25f, 7f)
            horizontalLineTo(7.75f)
            lineTo(7.648f, 7.007f)
            curveTo(7.282f, 7.057f, 7f, 7.37f, 7f, 7.75f)
            curveTo(7f, 8.13f, 7.282f, 8.443f, 7.648f, 8.493f)
            lineTo(7.75f, 8.5f)
            horizontalLineTo(16.25f)
            lineTo(16.352f, 8.493f)
            curveTo(16.718f, 8.443f, 17f, 8.13f, 17f, 7.75f)
            curveTo(17f, 7.37f, 16.718f, 7.057f, 16.352f, 7.007f)
            lineTo(16.25f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReadingModeMobilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReadingModeMobile, contentDescription = null)
    }
}
