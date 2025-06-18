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

public val FluentUi.Filled.ClipboardMore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardMore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(8.5f)
            curveTo(8.186f, 21.582f, 8f, 21.063f, 8f, 20.5f)
            curveTo(8f, 19.119f, 9.119f, 18f, 10.5f, 18f)
            curveTo(11.881f, 18f, 13f, 19.119f, 13f, 20.5f)
            curveTo(13f, 19.119f, 14.119f, 18f, 15.5f, 18f)
            curveTo(16.881f, 18f, 18f, 19.119f, 18f, 20.5f)
            curveTo(18f, 19.291f, 18.859f, 18.282f, 20f, 18.05f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            close()
            moveTo(12f, 20.5f)
            curveTo(12f, 21.328f, 11.328f, 22f, 10.5f, 22f)
            curveTo(9.672f, 22f, 9f, 21.328f, 9f, 20.5f)
            curveTo(9f, 19.672f, 9.672f, 19f, 10.5f, 19f)
            curveTo(11.328f, 19f, 12f, 19.672f, 12f, 20.5f)
            close()
            moveTo(15.5f, 22f)
            curveTo(16.328f, 22f, 17f, 21.328f, 17f, 20.5f)
            curveTo(17f, 19.672f, 16.328f, 19f, 15.5f, 19f)
            curveTo(14.672f, 19f, 14f, 19.672f, 14f, 20.5f)
            curveTo(14f, 21.328f, 14.672f, 22f, 15.5f, 22f)
            close()
            moveTo(20.5f, 22f)
            curveTo(21.328f, 22f, 22f, 21.328f, 22f, 20.5f)
            curveTo(22f, 19.672f, 21.328f, 19f, 20.5f, 19f)
            curveTo(19.672f, 19f, 19f, 19.672f, 19f, 20.5f)
            curveTo(19f, 21.328f, 19.672f, 22f, 20.5f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardMore, contentDescription = null)
    }
}
