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

public val FluentUi.Regular.Dust: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dust",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 3f)
            curveTo(7f, 3.552f, 6.552f, 4f, 6f, 4f)
            curveTo(5.448f, 4f, 5f, 3.552f, 5f, 3f)
            curveTo(5f, 2.448f, 5.448f, 2f, 6f, 2f)
            curveTo(6.552f, 2f, 7f, 2.448f, 7f, 3f)
            close()
            moveTo(21f, 13f)
            curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
            curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
            curveTo(20.448f, 11f, 20f, 11.448f, 20f, 12f)
            curveTo(20f, 12.552f, 20.448f, 13f, 21f, 13f)
            close()
            moveTo(6f, 22f)
            curveTo(6.552f, 22f, 7f, 21.552f, 7f, 21f)
            curveTo(7f, 20.448f, 6.552f, 20f, 6f, 20f)
            curveTo(5.448f, 20f, 5f, 20.448f, 5f, 21f)
            curveTo(5f, 21.552f, 5.448f, 22f, 6f, 22f)
            close()
            moveTo(13.75f, 3f)
            curveTo(11.302f, 3f, 9.245f, 4.676f, 8.664f, 6.943f)
            curveTo(8.214f, 6.817f, 7.739f, 6.75f, 7.25f, 6.75f)
            curveTo(4.351f, 6.75f, 2f, 9.101f, 2f, 12f)
            curveTo(2f, 14.899f, 4.351f, 17.25f, 7.25f, 17.25f)
            curveTo(7.739f, 17.25f, 8.214f, 17.183f, 8.664f, 17.057f)
            curveTo(9.245f, 19.324f, 11.302f, 21f, 13.75f, 21f)
            curveTo(16.649f, 21f, 19f, 18.649f, 19f, 15.75f)
            curveTo(19f, 14.281f, 18.396f, 12.952f, 17.424f, 12f)
            curveTo(18.396f, 11.048f, 19f, 9.72f, 19f, 8.25f)
            curveTo(19f, 5.351f, 16.649f, 3f, 13.75f, 3f)
            close()
            moveTo(10.007f, 8.018f)
            curveTo(10.127f, 6.055f, 11.757f, 4.5f, 13.75f, 4.5f)
            curveTo(15.821f, 4.5f, 17.5f, 6.179f, 17.5f, 8.25f)
            curveTo(17.5f, 9.554f, 16.835f, 10.702f, 15.823f, 11.375f)
            curveTo(15.614f, 11.514f, 15.488f, 11.749f, 15.488f, 12f)
            curveTo(15.488f, 12.251f, 15.614f, 12.486f, 15.823f, 12.625f)
            curveTo(16.835f, 13.298f, 17.5f, 14.446f, 17.5f, 15.75f)
            curveTo(17.5f, 17.821f, 15.821f, 19.5f, 13.75f, 19.5f)
            curveTo(11.757f, 19.5f, 10.127f, 17.945f, 10.007f, 15.982f)
            curveTo(9.992f, 15.731f, 9.851f, 15.504f, 9.633f, 15.378f)
            curveTo(9.415f, 15.253f, 9.149f, 15.245f, 8.923f, 15.357f)
            curveTo(8.42f, 15.608f, 7.853f, 15.75f, 7.25f, 15.75f)
            curveTo(5.179f, 15.75f, 3.5f, 14.071f, 3.5f, 12f)
            curveTo(3.5f, 9.929f, 5.179f, 8.25f, 7.25f, 8.25f)
            curveTo(7.853f, 8.25f, 8.42f, 8.392f, 8.923f, 8.643f)
            curveTo(9.149f, 8.755f, 9.415f, 8.747f, 9.633f, 8.622f)
            curveTo(9.851f, 8.496f, 9.992f, 8.269f, 10.007f, 8.018f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DustPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Dust, contentDescription = null)
    }
}
