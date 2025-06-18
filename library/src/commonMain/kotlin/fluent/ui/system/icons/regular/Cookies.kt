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

public val FluentUi.Regular.Cookies: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cookies",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(12.714f, 2f, 13.419f, 2.075f, 14.106f, 2.222f)
            curveTo(14.686f, 2.347f, 14.899f, 3.065f, 14.48f, 3.485f)
            curveTo(14.015f, 3.951f, 13.75f, 4.579f, 13.75f, 5.25f)
            curveTo(13.75f, 6.42f, 14.561f, 7.427f, 15.686f, 7.686f)
            curveTo(16.056f, 7.772f, 16.304f, 8.12f, 16.263f, 8.497f)
            curveTo(16.254f, 8.579f, 16.25f, 8.663f, 16.25f, 8.75f)
            curveTo(16.25f, 10.131f, 17.369f, 11.25f, 18.75f, 11.25f)
            curveTo(19.477f, 11.25f, 20.151f, 10.939f, 20.624f, 10.405f)
            curveTo(21.053f, 9.92f, 21.854f, 10.17f, 21.93f, 10.814f)
            curveTo(21.977f, 11.205f, 22f, 11.601f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.437f, 20.5f, 20.08f, 17.101f, 20.466f, 12.765f)
            lineTo(20.485f, 12.509f)
            lineTo(20.492f, 12.351f)
            lineTo(20.299f, 12.439f)
            curveTo(19.968f, 12.578f, 19.617f, 12.672f, 19.255f, 12.718f)
            lineTo(18.981f, 12.743f)
            lineTo(18.75f, 12.75f)
            curveTo(16.744f, 12.75f, 15.083f, 11.273f, 14.794f, 9.348f)
            lineTo(14.769f, 9.147f)
            lineTo(14.755f, 8.96f)
            lineTo(14.61f, 8.9f)
            curveTo(13.326f, 8.323f, 12.42f, 7.096f, 12.271f, 5.666f)
            lineTo(12.255f, 5.45f)
            lineTo(12.25f, 5.25f)
            curveTo(12.25f, 4.803f, 12.324f, 4.368f, 12.464f, 3.958f)
            lineTo(12.555f, 3.715f)
            lineTo(12.64f, 3.525f)
            lineTo(12.364f, 3.508f)
            lineTo(12f, 3.5f)
            close()
            moveTo(15f, 16f)
            curveTo(15.552f, 16f, 16f, 16.448f, 16f, 17f)
            curveTo(16f, 17.552f, 15.552f, 18f, 15f, 18f)
            curveTo(14.448f, 18f, 14f, 17.552f, 14f, 17f)
            curveTo(14f, 16.448f, 14.448f, 16f, 15f, 16f)
            close()
            moveTo(8f, 15f)
            curveTo(8.552f, 15f, 9f, 15.448f, 9f, 16f)
            curveTo(9f, 16.552f, 8.552f, 17f, 8f, 17f)
            curveTo(7.448f, 17f, 7f, 16.552f, 7f, 16f)
            curveTo(7f, 15.448f, 7.448f, 15f, 8f, 15f)
            close()
            moveTo(12f, 11f)
            curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
            curveTo(13f, 12.552f, 12.552f, 13f, 12f, 13f)
            curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
            curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
            close()
            moveTo(7f, 8f)
            curveTo(7.552f, 8f, 8f, 8.448f, 8f, 9f)
            curveTo(8f, 9.552f, 7.552f, 10f, 7f, 10f)
            curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
            curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CookiesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Cookies, contentDescription = null)
    }
}
