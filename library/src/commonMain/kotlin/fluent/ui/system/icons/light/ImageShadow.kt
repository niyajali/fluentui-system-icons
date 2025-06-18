package fluent.ui.system.icons.light

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

public val FluentUi.Light.ImageShadow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageShadow",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 8.5f)
            curveTo(19f, 9.328f, 18.328f, 10f, 17.5f, 10f)
            curveTo(16.672f, 10f, 16f, 9.328f, 16f, 8.5f)
            curveTo(16f, 7.672f, 16.672f, 7f, 17.5f, 7f)
            curveTo(18.328f, 7f, 19f, 7.672f, 19f, 8.5f)
            close()
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineTo(19.5f)
            curveTo(2f, 21.985f, 4.015f, 24f, 6.5f, 24f)
            horizontalLineTo(19.5f)
            curveTo(21.985f, 24f, 24f, 21.985f, 24f, 19.5f)
            verticalLineTo(6.5f)
            curveTo(24f, 4.015f, 21.985f, 2f, 19.5f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(3f, 6.5f)
            curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
            horizontalLineTo(19.5f)
            curveTo(21.433f, 3f, 23f, 4.567f, 23f, 6.5f)
            verticalLineTo(19.5f)
            curveTo(23f, 20.286f, 22.741f, 21.012f, 22.303f, 21.596f)
            lineTo(14.202f, 13.495f)
            curveTo(13.538f, 12.831f, 12.462f, 12.831f, 11.798f, 13.495f)
            lineTo(3.697f, 21.596f)
            curveTo(3.259f, 21.012f, 3f, 20.286f, 3f, 19.5f)
            verticalLineTo(6.5f)
            close()
            moveTo(4.404f, 22.303f)
            lineTo(12.505f, 14.202f)
            curveTo(12.778f, 13.929f, 13.222f, 13.929f, 13.495f, 14.202f)
            lineTo(21.596f, 22.303f)
            curveTo(21.012f, 22.741f, 20.286f, 23f, 19.5f, 23f)
            horizontalLineTo(6.5f)
            curveTo(5.714f, 23f, 4.988f, 22.741f, 4.404f, 22.303f)
            close()
            moveTo(8f, 25.5f)
            curveTo(8f, 27.985f, 10.015f, 30f, 12.5f, 30f)
            horizontalLineTo(21.5f)
            curveTo(26.194f, 30f, 30f, 26.194f, 30f, 21.5f)
            verticalLineTo(12.5f)
            curveTo(30f, 10.015f, 27.984f, 8.001f, 25.5f, 8f)
            verticalLineTo(19.5f)
            curveTo(25.5f, 22.814f, 22.814f, 25.5f, 19.5f, 25.5f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ImageShadow, contentDescription = null)
    }
}
