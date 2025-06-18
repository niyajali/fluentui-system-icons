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

public val FluentUi.Regular.ClipboardPulse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClipboardPulse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 4.001f)
            curveTo(15.986f, 4f, 15.986f, 4f, 15.986f, 3.999f)
            lineTo(17.75f, 4f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(13f)
            horizontalLineTo(18.5f)
            verticalLineTo(6.25f)
            curveTo(18.5f, 5.836f, 18.164f, 5.5f, 17.75f, 5.5f)
            lineTo(15.621f, 5.5f)
            curveTo(15.217f, 6.103f, 14.53f, 6.5f, 13.75f, 6.5f)
            horizontalLineTo(10.25f)
            curveTo(9.47f, 6.5f, 8.783f, 6.103f, 8.379f, 5.5f)
            lineTo(6.25f, 5.5f)
            curveTo(5.836f, 5.5f, 5.5f, 5.836f, 5.5f, 6.25f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            lineTo(8.014f, 3.999f)
            curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(15.995f, 4.096f)
            lineTo(16f, 4.25f)
            curveTo(16f, 4.198f, 15.998f, 4.147f, 15.995f, 4.096f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(18.5f, 16.5f)
            horizontalLineTo(20f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 20.5f, 18.5f, 20.164f, 18.5f, 19.75f)
            verticalLineTo(16.5f)
            close()
            moveTo(10.969f, 8.538f)
            curveTo(10.883f, 8.243f, 10.623f, 8.03f, 10.316f, 8.003f)
            curveTo(10.009f, 7.976f, 9.717f, 8.139f, 9.579f, 8.415f)
            lineTo(6.786f, 14f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14f, 2f, 14.336f, 2f, 14.75f)
            curveTo(2f, 15.164f, 2.336f, 15.5f, 2.75f, 15.5f)
            horizontalLineTo(7.25f)
            curveTo(7.534f, 15.5f, 7.794f, 15.34f, 7.921f, 15.085f)
            lineTo(10.068f, 10.79f)
            lineTo(12.031f, 17.462f)
            curveTo(12.117f, 17.757f, 12.377f, 17.97f, 12.684f, 17.997f)
            curveTo(12.991f, 18.024f, 13.283f, 17.861f, 13.421f, 17.585f)
            lineTo(15.31f, 13.807f)
            lineTo(16.107f, 15.136f)
            curveTo(16.242f, 15.362f, 16.487f, 15.5f, 16.75f, 15.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 15.5f, 22f, 15.164f, 22f, 14.75f)
            curveTo(22f, 14.336f, 21.664f, 14f, 21.25f, 14f)
            horizontalLineTo(17.175f)
            lineTo(15.893f, 11.864f)
            curveTo(15.752f, 11.629f, 15.495f, 11.49f, 15.221f, 11.5f)
            curveTo(14.948f, 11.511f, 14.702f, 11.67f, 14.579f, 11.915f)
            lineTo(12.932f, 15.21f)
            lineTo(10.969f, 8.538f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardPulsePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClipboardPulse, contentDescription = null)
    }
}
