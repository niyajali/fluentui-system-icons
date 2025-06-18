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

public val FluentUi.Regular.Dock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.794f, 9.997f)
            horizontalLineTo(9.492f)
            curveTo(9.906f, 9.997f, 10.242f, 10.333f, 10.242f, 10.747f)
            curveTo(10.242f, 11.127f, 9.96f, 11.44f, 9.594f, 11.49f)
            lineTo(9.492f, 11.497f)
            horizontalLineTo(4.794f)
            curveTo(4.122f, 11.497f, 3.591f, 11.946f, 3.527f, 12.498f)
            lineTo(3.521f, 12.61f)
            lineTo(3.5f, 17.386f)
            curveTo(3.5f, 17.947f, 3.989f, 18.432f, 4.641f, 18.49f)
            lineTo(4.773f, 18.496f)
            horizontalLineTo(19.227f)
            curveTo(19.899f, 18.496f, 20.43f, 18.046f, 20.494f, 17.495f)
            lineTo(20.5f, 17.383f)
            lineTo(20.521f, 12.606f)
            curveTo(20.521f, 12.046f, 20.031f, 11.561f, 19.38f, 11.503f)
            lineTo(19.248f, 11.497f)
            horizontalLineTo(14.553f)
            curveTo(14.139f, 11.497f, 13.803f, 11.161f, 13.803f, 10.747f)
            curveTo(13.803f, 10.367f, 14.085f, 10.053f, 14.451f, 10.004f)
            lineTo(14.553f, 9.997f)
            horizontalLineTo(19.248f)
            curveTo(20.707f, 9.997f, 21.924f, 11.063f, 22.015f, 12.443f)
            lineTo(22.021f, 12.61f)
            lineTo(22f, 17.386f)
            curveTo(22f, 18.786f, 20.84f, 19.907f, 19.401f, 19.991f)
            lineTo(19.227f, 19.996f)
            horizontalLineTo(4.773f)
            curveTo(3.313f, 19.996f, 2.097f, 18.929f, 2.006f, 17.55f)
            lineTo(2f, 17.383f)
            lineTo(2.021f, 12.606f)
            curveTo(2.021f, 11.206f, 3.181f, 10.086f, 4.62f, 10.002f)
            lineTo(4.794f, 9.997f)
            horizontalLineTo(9.492f)
            horizontalLineTo(4.794f)
            close()
            moveTo(12.446f, 3.147f)
            lineTo(12.53f, 3.22f)
            lineTo(16.455f, 7.145f)
            curveTo(16.748f, 7.438f, 16.748f, 7.912f, 16.455f, 8.205f)
            curveTo(16.189f, 8.472f, 15.773f, 8.496f, 15.479f, 8.278f)
            lineTo(15.395f, 8.205f)
            lineTo(12.738f, 5.546f)
            lineTo(12.74f, 15.254f)
            curveTo(12.74f, 15.668f, 12.404f, 16.004f, 11.99f, 16.004f)
            curveTo(11.575f, 16.004f, 11.24f, 15.668f, 11.24f, 15.254f)
            lineTo(11.241f, 5.569f)
            lineTo(8.605f, 8.205f)
            curveTo(8.339f, 8.472f, 7.922f, 8.496f, 7.629f, 8.278f)
            lineTo(7.545f, 8.205f)
            curveTo(7.278f, 7.939f, 7.254f, 7.522f, 7.472f, 7.229f)
            lineTo(7.545f, 7.145f)
            lineTo(11.47f, 3.22f)
            curveTo(11.736f, 2.953f, 12.153f, 2.929f, 12.446f, 3.147f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Dock, contentDescription = null)
    }
}
