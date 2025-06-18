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

public val FluentUi.Filled.CommentQuote: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentQuote",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 4.25f)
            curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
            curveTo(12.507f, 2f, 11.5f, 3.007f, 11.5f, 4.25f)
            curveTo(11.5f, 5.493f, 12.507f, 6.5f, 13.75f, 6.5f)
            curveTo(13.948f, 6.5f, 14.139f, 6.475f, 14.321f, 6.427f)
            curveTo(14.213f, 7.027f, 14.058f, 7.559f, 13.865f, 8.044f)
            curveTo(13.467f, 9.048f, 12.894f, 9.893f, 12.17f, 10.774f)
            curveTo(11.908f, 11.094f, 11.954f, 11.567f, 12.274f, 11.83f)
            curveTo(12.594f, 12.092f, 13.067f, 12.046f, 13.33f, 11.726f)
            curveTo(14.106f, 10.781f, 14.783f, 9.8f, 15.26f, 8.597f)
            curveTo(15.738f, 7.392f, 16f, 6.002f, 16f, 4.25f)
            close()
            moveTo(16.923f, 5.855f)
            curveTo(16.807f, 7.013f, 16.559f, 8.032f, 16.189f, 8.966f)
            curveTo(15.66f, 10.302f, 14.913f, 11.374f, 14.102f, 12.361f)
            curveTo(13.489f, 13.108f, 12.386f, 13.216f, 11.639f, 12.602f)
            curveTo(10.892f, 11.989f, 10.784f, 10.886f, 11.398f, 10.139f)
            curveTo(12.087f, 9.3f, 12.591f, 8.546f, 12.936f, 7.676f)
            curveTo(12.969f, 7.592f, 13.001f, 7.507f, 13.031f, 7.42f)
            curveTo(11.582f, 7.093f, 10.5f, 5.798f, 10.5f, 4.25f)
            curveTo(10.5f, 3.807f, 10.589f, 3.385f, 10.749f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
            horizontalLineTo(6f)
            verticalLineTo(20.75f)
            curveTo(6f, 21.78f, 7.176f, 22.368f, 8f, 21.75f)
            lineTo(13f, 18f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
            verticalLineTo(9.412f)
            curveTo(21.489f, 10.545f, 20.821f, 11.486f, 20.102f, 12.361f)
            curveTo(19.489f, 13.108f, 18.386f, 13.216f, 17.639f, 12.602f)
            curveTo(16.892f, 11.989f, 16.784f, 10.886f, 17.398f, 10.139f)
            curveTo(18.087f, 9.3f, 18.591f, 8.546f, 18.936f, 7.676f)
            curveTo(18.969f, 7.592f, 19.001f, 7.507f, 19.031f, 7.42f)
            curveTo(18.129f, 7.216f, 17.368f, 6.637f, 16.923f, 5.855f)
            close()
            moveTo(19.75f, 2f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            curveTo(22f, 6.002f, 21.738f, 7.392f, 21.26f, 8.597f)
            curveTo(20.783f, 9.8f, 20.106f, 10.781f, 19.33f, 11.726f)
            curveTo(19.067f, 12.046f, 18.594f, 12.092f, 18.274f, 11.83f)
            curveTo(17.954f, 11.567f, 17.907f, 11.094f, 18.17f, 10.774f)
            curveTo(18.894f, 9.893f, 19.467f, 9.048f, 19.865f, 8.044f)
            curveTo(20.058f, 7.559f, 20.213f, 7.027f, 20.321f, 6.427f)
            curveTo(20.139f, 6.475f, 19.948f, 6.5f, 19.75f, 6.5f)
            curveTo(18.507f, 6.5f, 17.5f, 5.493f, 17.5f, 4.25f)
            curveTo(17.5f, 3.007f, 18.507f, 2f, 19.75f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CommentQuotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CommentQuote, contentDescription = null)
    }
}
