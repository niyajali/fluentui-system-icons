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

public val FluentUi.Regular.NumberCircle5: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle5",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.748f, 7f)
            curveTo(10.354f, 7f, 10.028f, 7.304f, 10f, 7.697f)
            lineTo(9.75f, 11.224f)
            curveTo(9.735f, 11.439f, 9.813f, 11.65f, 9.964f, 11.804f)
            curveTo(10.116f, 11.957f, 10.326f, 12.038f, 10.541f, 12.026f)
            lineTo(10.545f, 12.025f)
            lineTo(10.556f, 12.025f)
            lineTo(10.603f, 12.022f)
            curveTo(10.644f, 12.02f, 10.703f, 12.017f, 10.776f, 12.014f)
            curveTo(10.923f, 12.007f, 11.125f, 11.999f, 11.346f, 11.994f)
            curveTo(11.808f, 11.983f, 12.282f, 11.986f, 12.53f, 12.02f)
            curveTo(13.623f, 12.174f, 14.385f, 13.185f, 14.231f, 14.278f)
            curveTo(14.077f, 15.372f, 13.066f, 16.134f, 11.972f, 15.981f)
            curveTo(11.273f, 15.882f, 10.709f, 15.435f, 10.433f, 14.836f)
            curveTo(10.259f, 14.46f, 9.814f, 14.295f, 9.438f, 14.469f)
            curveTo(9.062f, 14.642f, 8.897f, 15.088f, 9.071f, 15.464f)
            curveTo(9.552f, 16.507f, 10.538f, 17.294f, 11.763f, 17.466f)
            curveTo(13.677f, 17.735f, 15.447f, 16.401f, 15.716f, 14.487f)
            curveTo(15.985f, 12.573f, 14.652f, 10.803f, 12.738f, 10.534f)
            lineTo(12.735f, 10.534f)
            curveTo(12.35f, 10.481f, 11.757f, 10.484f, 11.31f, 10.495f)
            lineTo(11.305f, 10.495f)
            lineTo(11.447f, 8.5f)
            horizontalLineTo(14.248f)
            curveTo(14.663f, 8.5f, 14.998f, 8.164f, 14.998f, 7.75f)
            curveTo(14.998f, 7.336f, 14.663f, 7f, 14.248f, 7f)
            horizontalLineTo(10.748f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle5, contentDescription = null)
    }
}
