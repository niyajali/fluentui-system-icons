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

public val FluentUi.Regular.Live: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Live",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.99f, 4.929f)
            curveTo(6.282f, 5.222f, 6.282f, 5.696f, 5.99f, 5.989f)
            curveTo(2.67f, 9.309f, 2.67f, 14.691f, 5.99f, 18.01f)
            curveTo(6.282f, 18.303f, 6.282f, 18.778f, 5.99f, 19.071f)
            curveTo(5.697f, 19.364f, 5.222f, 19.364f, 4.929f, 19.071f)
            curveTo(1.024f, 15.165f, 1.024f, 8.834f, 4.929f, 4.929f)
            curveTo(5.222f, 4.636f, 5.697f, 4.636f, 5.99f, 4.929f)
            close()
            moveTo(19.071f, 4.929f)
            curveTo(22.976f, 8.834f, 22.976f, 15.165f, 19.071f, 19.071f)
            curveTo(18.778f, 19.364f, 18.303f, 19.364f, 18.01f, 19.071f)
            curveTo(17.718f, 18.778f, 17.718f, 18.303f, 18.01f, 18.01f)
            curveTo(21.33f, 14.691f, 21.33f, 9.309f, 18.01f, 5.989f)
            curveTo(17.718f, 5.696f, 17.718f, 5.222f, 18.01f, 4.929f)
            curveTo(18.303f, 4.636f, 18.778f, 4.636f, 19.071f, 4.929f)
            close()
            moveTo(8.818f, 7.757f)
            curveTo(9.111f, 8.05f, 9.111f, 8.525f, 8.818f, 8.818f)
            curveTo(7.061f, 10.575f, 7.061f, 13.424f, 8.818f, 15.182f)
            curveTo(9.111f, 15.475f, 9.111f, 15.95f, 8.818f, 16.242f)
            curveTo(8.525f, 16.535f, 8.05f, 16.535f, 7.757f, 16.242f)
            curveTo(5.414f, 13.899f, 5.414f, 10.1f, 7.757f, 7.757f)
            curveTo(8.05f, 7.464f, 8.525f, 7.464f, 8.818f, 7.757f)
            close()
            moveTo(16.243f, 7.757f)
            curveTo(18.586f, 10.1f, 18.586f, 13.899f, 16.243f, 16.242f)
            curveTo(15.95f, 16.535f, 15.475f, 16.535f, 15.182f, 16.242f)
            curveTo(14.889f, 15.95f, 14.889f, 15.475f, 15.182f, 15.182f)
            curveTo(16.939f, 13.424f, 16.939f, 10.575f, 15.182f, 8.818f)
            curveTo(14.889f, 8.525f, 14.889f, 8.05f, 15.182f, 7.757f)
            curveTo(15.475f, 7.464f, 15.95f, 7.464f, 16.243f, 7.757f)
            close()
            moveTo(12f, 10.5f)
            curveTo(12.828f, 10.5f, 13.5f, 11.171f, 13.5f, 12f)
            curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
            curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
            curveTo(10.5f, 11.171f, 11.172f, 10.5f, 12f, 10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Live, contentDescription = null)
    }
}
