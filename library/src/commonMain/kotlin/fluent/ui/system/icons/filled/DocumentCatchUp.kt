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

public val FluentUi.Filled.DocumentCatchUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCatchUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(12f)
            lineTo(4.602f, 12f)
            lineTo(5.896f, 9.047f)
            curveTo(6.479f, 7.718f, 8.285f, 7.659f, 8.996f, 8.843f)
            lineTo(9.025f, 8.891f)
            lineTo(9.11f, 9.067f)
            lineTo(10.838f, 13.381f)
            lineTo(11.184f, 12.872f)
            curveTo(11.449f, 12.413f, 11.907f, 12.103f, 12.425f, 12.021f)
            lineTo(12.478f, 12.013f)
            lineTo(12.662f, 12f)
            horizontalLineTo(14.697f)
            curveTo(15.663f, 12f, 16.447f, 12.783f, 16.447f, 13.75f)
            curveTo(16.447f, 14.627f, 15.802f, 15.353f, 14.96f, 15.48f)
            lineTo(14.908f, 15.488f)
            lineTo(14.731f, 15.5f)
            horizontalLineTo(13.69f)
            lineTo(12.026f, 18.103f)
            curveTo(11.362f, 19.291f, 9.675f, 19.28f, 8.999f, 18.146f)
            lineTo(8.971f, 18.1f)
            lineTo(8.888f, 17.928f)
            lineTo(7.426f, 14.275f)
            lineTo(7.348f, 14.453f)
            curveTo(7.123f, 14.966f, 6.67f, 15.333f, 6.138f, 15.455f)
            curveTo(6.103f, 15.464f, 6.067f, 15.471f, 6.031f, 15.477f)
            lineTo(5.975f, 15.486f)
            lineTo(5.782f, 15.5f)
            lineTo(4f, 15.5f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.897f, 10f, 12.002f, 9.107f, 12f, 8.004f)
            lineTo(12f, 2f)
            close()
            moveTo(14f, 8.5f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            close()
            moveTo(5.255f, 13f)
            lineTo(2.75f, 13f)
            lineTo(2.647f, 13.007f)
            lineTo(2.637f, 13.009f)
            curveTo(2.276f, 13.063f, 2f, 13.374f, 2f, 13.75f)
            curveTo(2f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
            lineTo(5.745f, 14.5f)
            lineTo(5.856f, 14.492f)
            lineTo(5.868f, 14.49f)
            curveTo(5.883f, 14.487f, 5.898f, 14.484f, 5.914f, 14.481f)
            curveTo(6.141f, 14.428f, 6.336f, 14.271f, 6.432f, 14.051f)
            lineTo(7.467f, 11.689f)
            lineTo(9.804f, 17.524f)
            lineTo(9.853f, 17.625f)
            lineTo(9.858f, 17.634f)
            curveTo(10.15f, 18.124f, 10.889f, 18.12f, 11.164f, 17.594f)
            lineTo(13.143f, 14.5f)
            horizontalLineTo(14.697f)
            lineTo(14.8f, 14.493f)
            lineTo(14.81f, 14.491f)
            curveTo(15.171f, 14.437f, 15.447f, 14.125f, 15.447f, 13.75f)
            curveTo(15.447f, 13.336f, 15.111f, 13f, 14.697f, 13f)
            horizontalLineTo(12.697f)
            lineTo(12.591f, 13.007f)
            lineTo(12.58f, 13.009f)
            curveTo(12.349f, 13.045f, 12.146f, 13.188f, 12.035f, 13.398f)
            lineTo(10.608f, 15.498f)
            lineTo(8.195f, 9.471f)
            lineTo(8.145f, 9.368f)
            lineTo(8.139f, 9.358f)
            curveTo(7.835f, 8.853f, 7.06f, 8.882f, 6.812f, 9.449f)
            lineTo(5.255f, 13f)
            close()
            moveTo(5.745f, 14.5f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentCatchUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentCatchUp, contentDescription = null)
    }
}
