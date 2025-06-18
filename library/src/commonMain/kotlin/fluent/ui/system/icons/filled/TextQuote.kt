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

public val FluentUi.Filled.TextQuote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextQuote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 6f)
            curveTo(8.825f, 6f, 9.91f, 7.032f, 9.995f, 8.336f)
            lineTo(10f, 8.542f)
            curveTo(9.99f, 12.097f, 8.759f, 15.156f, 6.295f, 17.765f)
            curveTo(6.011f, 18.066f, 5.536f, 18.08f, 5.235f, 17.795f)
            curveTo(4.934f, 17.511f, 4.92f, 17.036f, 5.205f, 16.735f)
            curveTo(6.845f, 14.998f, 7.865f, 13.061f, 8.282f, 10.876f)
            curveTo(8.035f, 10.956f, 7.773f, 11f, 7.5f, 11f)
            curveTo(6.119f, 11f, 5f, 9.881f, 5f, 8.5f)
            curveTo(5f, 7.119f, 6.119f, 6f, 7.5f, 6f)
            close()
            moveTo(16.5f, 6f)
            curveTo(17.826f, 6f, 18.91f, 7.032f, 18.995f, 8.336f)
            lineTo(19f, 8.542f)
            curveTo(18.99f, 12.103f, 17.763f, 15.156f, 15.295f, 17.765f)
            curveTo(15.01f, 18.066f, 14.536f, 18.08f, 14.235f, 17.795f)
            curveTo(13.934f, 17.51f, 13.92f, 17.036f, 14.205f, 16.735f)
            curveTo(15.848f, 14.997f, 16.867f, 13.063f, 17.283f, 10.876f)
            curveTo(17.035f, 10.956f, 16.773f, 11f, 16.5f, 11f)
            curveTo(15.119f, 11f, 14f, 9.881f, 14f, 8.5f)
            curveTo(14f, 7.119f, 15.119f, 6f, 16.5f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextQuote, contentDescription = null)
    }
}
