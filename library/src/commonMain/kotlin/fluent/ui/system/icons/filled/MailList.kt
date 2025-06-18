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

public val FluentUi.Filled.MailList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailList",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.297f, 9.5f)
            horizontalLineTo(21.25f)
            curveTo(21.518f, 9.5f, 21.773f, 9.44f, 22f, 9.332f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(11.652f, 13.664f)
            curveTo(11.87f, 13.778f, 12.13f, 13.778f, 12.348f, 13.664f)
            lineTo(20.297f, 9.5f)
            close()
            moveTo(12.525f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 4.005f)
            curveTo(3.464f, 4.095f, 2.174f, 5.343f, 2.016f, 6.924f)
            lineTo(12f, 12.153f)
            lineTo(17.065f, 9.5f)
            horizontalLineTo(13.75f)
            curveTo(12.783f, 9.5f, 12f, 8.717f, 12f, 7.75f)
            curveTo(12f, 7.26f, 12.201f, 6.818f, 12.525f, 6.5f)
            curveTo(12.201f, 6.182f, 12f, 5.74f, 12f, 5.25f)
            curveTo(12f, 4.76f, 12.201f, 4.318f, 12.525f, 4f)
            close()
            moveTo(21.25f, 2f)
            curveTo(21.64f, 2f, 21.961f, 2.298f, 21.997f, 2.679f)
            curveTo(21.999f, 2.702f, 22f, 2.726f, 22f, 2.75f)
            curveTo(22f, 2.807f, 21.994f, 2.863f, 21.981f, 2.917f)
            curveTo(21.906f, 3.251f, 21.607f, 3.5f, 21.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(13.65f, 3.5f, 13.555f, 3.48f, 13.468f, 3.445f)
            curveTo(13.193f, 3.333f, 13f, 3.064f, 13f, 2.75f)
            curveTo(13f, 2.423f, 13.209f, 2.146f, 13.5f, 2.043f)
            curveTo(13.578f, 2.015f, 13.662f, 2f, 13.75f, 2f)
            horizontalLineTo(21.25f)
            close()
            moveTo(21.25f, 4.5f)
            curveTo(21.32f, 4.5f, 21.388f, 4.51f, 21.452f, 4.528f)
            curveTo(21.768f, 4.616f, 22f, 4.906f, 22f, 5.25f)
            curveTo(22f, 5.664f, 21.664f, 6f, 21.25f, 6f)
            horizontalLineTo(13.75f)
            curveTo(13.713f, 6f, 13.677f, 5.997f, 13.641f, 5.992f)
            curveTo(13.279f, 5.94f, 13f, 5.627f, 13f, 5.25f)
            curveTo(13f, 4.836f, 13.336f, 4.5f, 13.75f, 4.5f)
            horizontalLineTo(21.25f)
            close()
            moveTo(13f, 7.75f)
            curveTo(13f, 7.336f, 13.336f, 7f, 13.75f, 7f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 7f, 22f, 7.336f, 22f, 7.75f)
            curveTo(22f, 8.164f, 21.664f, 8.5f, 21.25f, 8.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 8.5f, 13f, 8.164f, 13f, 7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailList, contentDescription = null)
    }
}
