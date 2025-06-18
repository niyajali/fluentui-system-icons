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

public val FluentUi.Regular.CommunicationPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommunicationPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 13f)
            curveTo(3.5f, 8.306f, 7.306f, 4.5f, 12f, 4.5f)
            curveTo(16.198f, 4.5f, 19.686f, 7.544f, 20.376f, 11.545f)
            curveTo(21.204f, 12.071f, 21.795f, 12.936f, 21.956f, 13.944f)
            curveTo(21.985f, 13.633f, 22f, 13.318f, 22f, 13f)
            curveTo(22f, 7.477f, 17.523f, 3f, 12f, 3f)
            curveTo(6.477f, 3f, 2f, 7.477f, 2f, 13f)
            curveTo(2f, 15.758f, 3.118f, 18.257f, 4.923f, 20.065f)
            curveTo(5.215f, 20.358f, 5.69f, 20.358f, 5.983f, 20.066f)
            curveTo(6.277f, 19.773f, 6.277f, 19.298f, 5.984f, 19.005f)
            curveTo(4.448f, 17.466f, 3.5f, 15.345f, 3.5f, 13f)
            close()
            moveTo(18.191f, 11.014f)
            curveTo(17.351f, 8.395f, 14.897f, 6.5f, 12f, 6.5f)
            curveTo(8.41f, 6.5f, 5.5f, 9.41f, 5.5f, 13f)
            curveTo(5.5f, 14.796f, 6.229f, 16.423f, 7.406f, 17.598f)
            curveTo(7.699f, 17.891f, 8.174f, 17.891f, 8.467f, 17.598f)
            curveTo(8.759f, 17.305f, 8.759f, 16.83f, 8.466f, 16.537f)
            curveTo(7.56f, 15.632f, 7f, 14.382f, 7f, 13f)
            curveTo(7f, 10.239f, 9.239f, 8f, 12f, 8f)
            curveTo(14.225f, 8f, 16.111f, 9.454f, 16.759f, 11.463f)
            curveTo(17.188f, 11.217f, 17.673f, 11.059f, 18.191f, 11.014f)
            close()
            moveTo(9.5f, 13f)
            curveTo(9.5f, 11.619f, 10.619f, 10.5f, 12f, 10.5f)
            curveTo(13.381f, 10.5f, 14.5f, 11.619f, 14.5f, 13f)
            curveTo(14.5f, 14.381f, 13.381f, 15.5f, 12f, 15.5f)
            curveTo(10.619f, 15.5f, 9.5f, 14.381f, 9.5f, 13f)
            close()
            moveTo(12f, 12f)
            curveTo(11.448f, 12f, 11f, 12.448f, 11f, 13f)
            curveTo(11f, 13.552f, 11.448f, 14f, 12f, 14f)
            curveTo(12.552f, 14f, 13f, 13.552f, 13f, 13f)
            curveTo(13f, 12.448f, 12.552f, 12f, 12f, 12f)
            close()
            moveTo(21f, 14.5f)
            curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
            curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
            curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
            curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
            close()
            moveTo(23f, 19.875f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommunicationPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommunicationPerson, contentDescription = null)
    }
}
