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

public val FluentUi.Filled.MailArrowDoubleBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailArrowDoubleBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(15.854f, 4.854f)
            lineTo(14.207f, 6.5f)
            lineTo(15.854f, 8.146f)
            curveTo(16.049f, 8.342f, 16.049f, 8.658f, 15.854f, 8.854f)
            curveTo(15.658f, 9.049f, 15.342f, 9.049f, 15.146f, 8.854f)
            lineTo(13.146f, 6.854f)
            curveTo(12.951f, 6.658f, 12.951f, 6.342f, 13.146f, 6.146f)
            lineTo(15.146f, 4.146f)
            curveTo(15.342f, 3.951f, 15.658f, 3.951f, 15.854f, 4.146f)
            curveTo(16.049f, 4.342f, 16.049f, 4.658f, 15.854f, 4.854f)
            close()
            moveTo(18.854f, 4.146f)
            curveTo(19.049f, 4.342f, 19.049f, 4.658f, 18.854f, 4.854f)
            lineTo(17.707f, 6f)
            horizontalLineTo(20f)
            curveTo(20.828f, 6f, 21.5f, 6.672f, 21.5f, 7.5f)
            verticalLineTo(8f)
            curveTo(21.5f, 8.276f, 21.276f, 8.5f, 21f, 8.5f)
            curveTo(20.724f, 8.5f, 20.5f, 8.276f, 20.5f, 8f)
            verticalLineTo(7.5f)
            curveTo(20.5f, 7.224f, 20.276f, 7f, 20f, 7f)
            horizontalLineTo(17.707f)
            lineTo(18.854f, 8.146f)
            curveTo(19.049f, 8.342f, 19.049f, 8.658f, 18.854f, 8.854f)
            curveTo(18.658f, 9.049f, 18.342f, 9.049f, 18.146f, 8.854f)
            lineTo(16.146f, 6.854f)
            curveTo(15.951f, 6.658f, 15.951f, 6.342f, 16.146f, 6.146f)
            lineTo(18.146f, 4.146f)
            curveTo(18.342f, 3.951f, 18.658f, 3.951f, 18.854f, 4.146f)
            close()
            moveTo(17.5f, 13f)
            curveTo(19.247f, 13f, 20.832f, 12.311f, 22f, 11.19f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
            lineTo(2f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(11.652f, 13.664f)
            curveTo(11.87f, 13.778f, 12.13f, 13.778f, 12.348f, 13.664f)
            lineTo(14.765f, 12.398f)
            curveTo(15.596f, 12.784f, 16.523f, 13f, 17.5f, 13f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineTo(11.498f)
            curveTo(11.177f, 4.77f, 11f, 5.614f, 11f, 6.5f)
            curveTo(11f, 8.493f, 11.897f, 10.276f, 13.308f, 11.468f)
            lineTo(12f, 12.153f)
            lineTo(2.016f, 6.924f)
            curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
            lineTo(5.25f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailArrowDoubleBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailArrowDoubleBack, contentDescription = null)
    }
}
