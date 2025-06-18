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

public val FluentUi.Regular.TabDesktopLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktopLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(11.333f)
            curveTo(11.147f, 20.532f, 11.034f, 20.027f, 11.007f, 19.5f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 19.5f, 4.5f, 18.94f, 4.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
            horizontalLineTo(11f)
            verticalLineTo(5.75f)
            curveTo(11f, 6.993f, 12.007f, 8f, 13.25f, 8f)
            horizontalLineTo(19.5f)
            verticalLineTo(14.507f)
            curveTo(20.027f, 14.534f, 20.532f, 14.647f, 21f, 14.833f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(19.5f, 6.5f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 6.5f, 12.5f, 6.164f, 12.5f, 5.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
            verticalLineTo(6.5f)
            close()
            moveTo(23f, 19.25f)
            curveTo(23f, 17.179f, 21.321f, 15.5f, 19.25f, 15.5f)
            lineTo(19.148f, 15.507f)
            curveTo(18.782f, 15.557f, 18.5f, 15.87f, 18.5f, 16.25f)
            curveTo(18.5f, 16.664f, 18.836f, 17f, 19.25f, 17f)
            lineTo(19.404f, 17.005f)
            curveTo(20.575f, 17.084f, 21.5f, 18.059f, 21.5f, 19.25f)
            curveTo(21.5f, 20.493f, 20.493f, 21.5f, 19.25f, 21.5f)
            lineTo(19.247f, 21.505f)
            lineTo(19.145f, 21.512f)
            curveTo(18.779f, 21.563f, 18.498f, 21.878f, 18.5f, 22.258f)
            curveTo(18.502f, 22.672f, 18.839f, 23.007f, 19.253f, 23.005f)
            verticalLineTo(23f)
            lineTo(19.452f, 22.995f)
            curveTo(21.428f, 22.891f, 23f, 21.254f, 23f, 19.25f)
            close()
            moveTo(16.5f, 16.25f)
            curveTo(16.5f, 15.836f, 16.164f, 15.5f, 15.75f, 15.5f)
            lineTo(15.551f, 15.505f)
            curveTo(13.572f, 15.609f, 12f, 17.246f, 12f, 19.25f)
            curveTo(12f, 21.321f, 13.679f, 23f, 15.75f, 23f)
            lineTo(15.852f, 22.993f)
            curveTo(16.218f, 22.944f, 16.5f, 22.63f, 16.5f, 22.25f)
            curveTo(16.5f, 21.836f, 16.164f, 21.5f, 15.75f, 21.5f)
            lineTo(15.596f, 21.495f)
            curveTo(14.425f, 21.416f, 13.5f, 20.441f, 13.5f, 19.25f)
            curveTo(13.5f, 18.007f, 14.507f, 17f, 15.75f, 17f)
            lineTo(15.852f, 16.993f)
            curveTo(16.218f, 16.944f, 16.5f, 16.63f, 16.5f, 16.25f)
            close()
            moveTo(20f, 19.25f)
            curveTo(20f, 18.836f, 19.664f, 18.5f, 19.25f, 18.5f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 18.507f)
            curveTo(15.282f, 18.556f, 15f, 18.87f, 15f, 19.25f)
            curveTo(15f, 19.664f, 15.336f, 20f, 15.75f, 20f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 19.993f)
            curveTo(19.718f, 19.944f, 20f, 19.63f, 20f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabDesktopLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.TabDesktopLink, contentDescription = null)
    }
}
