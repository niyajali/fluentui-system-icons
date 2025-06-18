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

public val FluentUi.Regular.SlideLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(13.377f)
            curveTo(21.552f, 13.058f, 21.045f, 12.814f, 20.5f, 12.666f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.164f, 3.836f, 18.5f, 4.25f, 18.5f)
            horizontalLineTo(11.166f)
            curveTo(11.314f, 19.045f, 11.558f, 19.552f, 11.877f, 20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(23f, 17.25f)
            curveTo(23f, 15.179f, 21.321f, 13.5f, 19.25f, 13.5f)
            lineTo(19.148f, 13.507f)
            curveTo(18.782f, 13.557f, 18.5f, 13.87f, 18.5f, 14.25f)
            curveTo(18.5f, 14.664f, 18.836f, 15f, 19.25f, 15f)
            lineTo(19.404f, 15.005f)
            curveTo(20.575f, 15.084f, 21.5f, 16.059f, 21.5f, 17.25f)
            curveTo(21.5f, 18.493f, 20.493f, 19.5f, 19.25f, 19.5f)
            lineTo(19.247f, 19.505f)
            lineTo(19.145f, 19.512f)
            curveTo(18.779f, 19.563f, 18.498f, 19.878f, 18.5f, 20.258f)
            curveTo(18.502f, 20.672f, 18.839f, 21.007f, 19.253f, 21.005f)
            verticalLineTo(21f)
            lineTo(19.452f, 20.995f)
            curveTo(21.428f, 20.891f, 23f, 19.254f, 23f, 17.25f)
            close()
            moveTo(16.5f, 14.25f)
            curveTo(16.5f, 13.836f, 16.164f, 13.5f, 15.75f, 13.5f)
            lineTo(15.551f, 13.505f)
            curveTo(13.572f, 13.609f, 12f, 15.246f, 12f, 17.25f)
            curveTo(12f, 19.321f, 13.679f, 21f, 15.75f, 21f)
            lineTo(15.852f, 20.993f)
            curveTo(16.218f, 20.944f, 16.5f, 20.63f, 16.5f, 20.25f)
            curveTo(16.5f, 19.836f, 16.164f, 19.5f, 15.75f, 19.5f)
            lineTo(15.596f, 19.495f)
            curveTo(14.425f, 19.416f, 13.5f, 18.441f, 13.5f, 17.25f)
            curveTo(13.5f, 16.007f, 14.507f, 15f, 15.75f, 15f)
            lineTo(15.852f, 14.993f)
            curveTo(16.218f, 14.943f, 16.5f, 14.63f, 16.5f, 14.25f)
            close()
            moveTo(20f, 17.25f)
            curveTo(20f, 16.836f, 19.664f, 16.5f, 19.25f, 16.5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 16.507f)
            curveTo(15.282f, 16.556f, 15f, 16.87f, 15f, 17.25f)
            curveTo(15f, 17.664f, 15.336f, 18f, 15.75f, 18f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 17.993f)
            curveTo(19.718f, 17.944f, 20f, 17.63f, 20f, 17.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideLink, contentDescription = null)
    }
}
