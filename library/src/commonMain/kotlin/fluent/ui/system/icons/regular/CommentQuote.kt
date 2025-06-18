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

public val FluentUi.Regular.CommentQuote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentQuote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 4.25f)
            curveTo(22f, 3.007f, 20.993f, 2f, 19.75f, 2f)
            curveTo(18.507f, 2f, 17.5f, 3.007f, 17.5f, 4.25f)
            curveTo(17.5f, 5.493f, 18.507f, 6.5f, 19.75f, 6.5f)
            curveTo(19.948f, 6.5f, 20.139f, 6.475f, 20.321f, 6.427f)
            curveTo(20.213f, 7.027f, 20.058f, 7.559f, 19.865f, 8.044f)
            curveTo(19.467f, 9.048f, 18.894f, 9.893f, 18.17f, 10.774f)
            curveTo(17.907f, 11.094f, 17.954f, 11.567f, 18.274f, 11.83f)
            curveTo(18.594f, 12.092f, 19.067f, 12.046f, 19.33f, 11.726f)
            curveTo(20.106f, 10.781f, 20.783f, 9.8f, 21.26f, 8.597f)
            curveTo(21.738f, 7.392f, 22f, 6.002f, 22f, 4.25f)
            close()
            moveTo(20.5f, 11.861f)
            verticalLineTo(14.75f)
            curveTo(20.5f, 15.717f, 19.716f, 16.5f, 18.75f, 16.5f)
            horizontalLineTo(12.514f)
            lineTo(7.5f, 20.251f)
            lineTo(7.499f, 16.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 16.5f, 3.5f, 15.717f, 3.5f, 14.75f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
            horizontalLineTo(10.509f)
            curveTo(10.503f, 4.417f, 10.5f, 4.334f, 10.5f, 4.25f)
            curveTo(10.5f, 3.807f, 10.589f, 3.385f, 10.749f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(5.999f)
            lineTo(6f, 20.75f)
            curveTo(6f, 21.02f, 6.087f, 21.282f, 6.249f, 21.498f)
            curveTo(6.662f, 22.051f, 7.446f, 22.164f, 7.999f, 21.751f)
            lineTo(13.012f, 18f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
            verticalLineTo(9.412f)
            curveTo(21.584f, 10.333f, 21.066f, 11.127f, 20.5f, 11.861f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            curveTo(16f, 6.002f, 15.738f, 7.392f, 15.26f, 8.597f)
            curveTo(14.783f, 9.8f, 14.106f, 10.781f, 13.33f, 11.726f)
            curveTo(13.067f, 12.046f, 12.594f, 12.092f, 12.274f, 11.83f)
            curveTo(11.954f, 11.567f, 11.908f, 11.094f, 12.17f, 10.774f)
            curveTo(12.894f, 9.893f, 13.467f, 9.048f, 13.865f, 8.044f)
            curveTo(14.058f, 7.559f, 14.213f, 7.027f, 14.321f, 6.427f)
            curveTo(14.139f, 6.475f, 13.948f, 6.5f, 13.75f, 6.5f)
            curveTo(12.507f, 6.5f, 11.5f, 5.493f, 11.5f, 4.25f)
            curveTo(11.5f, 3.007f, 12.507f, 2f, 13.75f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CommentQuote, contentDescription = null)
    }
}
