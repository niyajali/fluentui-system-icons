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

public val FluentUi.Filled.ClipboardImage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardImage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(10.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(11f)
            horizontalLineTo(15f)
            curveTo(12.791f, 11f, 11f, 12.791f, 11f, 15f)
            verticalLineTo(20f)
            curveTo(11f, 20.729f, 11.195f, 21.412f, 11.535f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            close()
            moveTo(15f, 12f)
            curveTo(13.343f, 12f, 12f, 13.343f, 12f, 15f)
            verticalLineTo(20f)
            curveTo(12f, 20.556f, 12.151f, 21.077f, 12.415f, 21.524f)
            lineTo(15.909f, 18.03f)
            curveTo(16.788f, 17.152f, 18.212f, 17.152f, 19.091f, 18.03f)
            lineTo(22.585f, 21.524f)
            curveTo(22.849f, 21.077f, 23f, 20.556f, 23f, 20f)
            verticalLineTo(15f)
            curveTo(23f, 13.343f, 21.657f, 12f, 20f, 12f)
            horizontalLineTo(15f)
            close()
            moveTo(15f, 23f)
            curveTo(14.444f, 23f, 13.923f, 22.849f, 13.476f, 22.585f)
            lineTo(16.97f, 19.091f)
            curveTo(17.263f, 18.798f, 17.737f, 18.798f, 18.03f, 19.091f)
            lineTo(21.524f, 22.585f)
            curveTo(21.077f, 22.849f, 20.556f, 23f, 20f, 23f)
            horizontalLineTo(15f)
            close()
            moveTo(20f, 16f)
            curveTo(19.448f, 16f, 19f, 15.552f, 19f, 15f)
            curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
            curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
            curveTo(21f, 15.552f, 20.552f, 16f, 20f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardImage, contentDescription = null)
    }
}
