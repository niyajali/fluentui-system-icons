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

public val FluentUi.Regular.CircleShadow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleShadow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.441f, 20.378f)
            lineTo(10.282f, 17.22f)
            curveTo(9.989f, 16.927f, 9.514f, 16.927f, 9.222f, 17.22f)
            curveTo(8.929f, 17.513f, 8.929f, 17.987f, 9.222f, 18.28f)
            lineTo(11.422f, 20.481f)
            curveTo(10.585f, 20.424f, 9.782f, 20.247f, 9.029f, 19.966f)
            lineTo(6.532f, 17.47f)
            curveTo(6.243f, 17.181f, 5.777f, 17.177f, 5.483f, 17.458f)
            curveTo(4.245f, 15.981f, 3.5f, 14.078f, 3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(14.078f, 3.5f, 15.981f, 4.245f, 17.458f, 5.484f)
            curveTo(17.179f, 5.777f, 17.183f, 6.242f, 17.472f, 6.53f)
            lineTo(19.964f, 9.023f)
            curveTo(20.246f, 9.776f, 20.424f, 10.58f, 20.48f, 11.418f)
            lineTo(18.282f, 9.22f)
            curveTo(17.989f, 8.927f, 17.514f, 8.927f, 17.222f, 9.22f)
            curveTo(16.929f, 9.512f, 16.929f, 9.987f, 17.222f, 10.28f)
            lineTo(20.379f, 13.438f)
            curveTo(20.292f, 13.949f, 20.159f, 14.446f, 19.985f, 14.922f)
            lineTo(17.282f, 12.22f)
            curveTo(16.989f, 11.927f, 16.514f, 11.927f, 16.222f, 12.22f)
            curveTo(15.929f, 12.512f, 15.929f, 12.987f, 16.222f, 13.28f)
            lineTo(19.299f, 16.358f)
            curveTo(19.068f, 16.745f, 18.806f, 17.112f, 18.518f, 17.456f)
            lineTo(15.782f, 14.72f)
            curveTo(15.489f, 14.427f, 15.014f, 14.427f, 14.722f, 14.72f)
            curveTo(14.429f, 15.012f, 14.429f, 15.487f, 14.722f, 15.78f)
            lineTo(17.458f, 18.517f)
            curveTo(17.114f, 18.805f, 16.747f, 19.066f, 16.361f, 19.298f)
            lineTo(13.282f, 16.22f)
            curveTo(12.989f, 15.927f, 12.514f, 15.927f, 12.222f, 16.22f)
            curveTo(11.929f, 16.513f, 11.929f, 16.987f, 12.222f, 17.28f)
            lineTo(14.925f, 19.983f)
            curveTo(14.449f, 20.158f, 13.953f, 20.291f, 13.441f, 20.378f)
            close()
            moveTo(12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CircleShadow, contentDescription = null)
    }
}
