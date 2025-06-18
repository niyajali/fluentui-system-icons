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

public val FluentUi.Regular.Communication: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Communication",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4.5f)
            curveTo(7.306f, 4.5f, 3.5f, 8.306f, 3.5f, 13f)
            curveTo(3.5f, 15.345f, 4.448f, 17.466f, 5.984f, 19.005f)
            curveTo(6.277f, 19.298f, 6.277f, 19.773f, 5.983f, 20.066f)
            curveTo(5.69f, 20.358f, 5.215f, 20.358f, 4.923f, 20.065f)
            curveTo(3.118f, 18.257f, 2f, 15.758f, 2f, 13f)
            curveTo(2f, 7.477f, 6.477f, 3f, 12f, 3f)
            curveTo(17.523f, 3f, 22f, 7.477f, 22f, 13f)
            curveTo(22f, 15.758f, 20.882f, 18.257f, 19.077f, 20.065f)
            curveTo(18.785f, 20.358f, 18.31f, 20.358f, 18.017f, 20.066f)
            curveTo(17.723f, 19.773f, 17.723f, 19.298f, 18.016f, 19.005f)
            curveTo(19.552f, 17.466f, 20.5f, 15.345f, 20.5f, 13f)
            curveTo(20.5f, 8.306f, 16.694f, 4.5f, 12f, 4.5f)
            close()
            moveTo(12f, 8f)
            curveTo(9.239f, 8f, 7f, 10.239f, 7f, 13f)
            curveTo(7f, 14.382f, 7.56f, 15.632f, 8.466f, 16.537f)
            curveTo(8.759f, 16.83f, 8.759f, 17.305f, 8.467f, 17.598f)
            curveTo(8.174f, 17.891f, 7.699f, 17.891f, 7.406f, 17.598f)
            curveTo(6.229f, 16.423f, 5.5f, 14.796f, 5.5f, 13f)
            curveTo(5.5f, 9.41f, 8.41f, 6.5f, 12f, 6.5f)
            curveTo(15.59f, 6.5f, 18.5f, 9.41f, 18.5f, 13f)
            curveTo(18.5f, 14.796f, 17.771f, 16.423f, 16.594f, 17.598f)
            curveTo(16.301f, 17.891f, 15.826f, 17.891f, 15.533f, 17.598f)
            curveTo(15.241f, 17.305f, 15.241f, 16.83f, 15.534f, 16.537f)
            curveTo(16.441f, 15.632f, 17f, 14.382f, 17f, 13f)
            curveTo(17f, 10.239f, 14.761f, 8f, 12f, 8f)
            close()
            moveTo(12f, 10.5f)
            curveTo(10.619f, 10.5f, 9.5f, 11.619f, 9.5f, 13f)
            curveTo(9.5f, 14.381f, 10.619f, 15.5f, 12f, 15.5f)
            curveTo(13.381f, 15.5f, 14.5f, 14.381f, 14.5f, 13f)
            curveTo(14.5f, 11.619f, 13.381f, 10.5f, 12f, 10.5f)
            close()
            moveTo(11f, 13f)
            curveTo(11f, 12.448f, 11.448f, 12f, 12f, 12f)
            curveTo(12.552f, 12f, 13f, 12.448f, 13f, 13f)
            curveTo(13f, 13.552f, 12.552f, 14f, 12f, 14f)
            curveTo(11.448f, 14f, 11f, 13.552f, 11f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommunicationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Communication, contentDescription = null)
    }
}
