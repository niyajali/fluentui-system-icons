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

public val FluentUi.Filled.ClipboardHeart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardHeart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(11.232f)
            curveTo(18.97f, 11.117f, 17.908f, 11.359f, 17.014f, 11.96f)
            curveTo(15.278f, 10.793f, 12.904f, 10.977f, 11.369f, 12.512f)
            curveTo(9.624f, 14.257f, 9.624f, 17.085f, 11.369f, 18.829f)
            lineTo(14.539f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(17.014f, 22.75f)
            curveTo(16.822f, 22.75f, 16.63f, 22.677f, 16.484f, 22.53f)
            lineTo(12.076f, 18.122f)
            curveTo(10.722f, 16.768f, 10.722f, 14.573f, 12.076f, 13.219f)
            curveTo(13.429f, 11.866f, 15.625f, 11.866f, 16.978f, 13.219f)
            lineTo(17.014f, 13.255f)
            lineTo(17.05f, 13.219f)
            curveTo(18.404f, 11.866f, 20.599f, 11.866f, 21.953f, 13.219f)
            curveTo(23.307f, 14.573f, 23.307f, 16.768f, 21.953f, 18.122f)
            lineTo(17.545f, 22.53f)
            curveTo(17.398f, 22.677f, 17.206f, 22.75f, 17.014f, 22.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardHeart, contentDescription = null)
    }
}
