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

public val FluentUi.Regular.Eraser: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Eraser",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.87f, 2.669f)
            lineTo(20.838f, 7.637f)
            curveTo(21.717f, 8.516f, 21.717f, 9.941f, 20.838f, 10.819f)
            lineTo(12.156f, 19.5f)
            lineTo(18.254f, 19.5f)
            curveTo(18.634f, 19.5f, 18.948f, 19.782f, 18.997f, 20.148f)
            lineTo(19.004f, 20.25f)
            curveTo(19.004f, 20.63f, 18.722f, 20.944f, 18.356f, 20.993f)
            lineTo(18.254f, 21f)
            lineTo(9.844f, 21.001f)
            curveTo(9.228f, 21.035f, 8.601f, 20.816f, 8.13f, 20.346f)
            lineTo(3.161f, 15.377f)
            curveTo(2.283f, 14.498f, 2.283f, 13.074f, 3.161f, 12.195f)
            lineTo(12.688f, 2.669f)
            curveTo(13.566f, 1.79f, 14.991f, 1.79f, 15.87f, 2.669f)
            close()
            moveTo(5.708f, 11.768f)
            lineTo(4.222f, 13.256f)
            curveTo(3.929f, 13.549f, 3.929f, 14.024f, 4.222f, 14.316f)
            lineTo(9.191f, 19.285f)
            curveTo(9.337f, 19.431f, 9.529f, 19.505f, 9.721f, 19.505f)
            lineTo(9.75f, 19.5f)
            lineTo(9.788f, 19.502f)
            curveTo(9.957f, 19.486f, 10.122f, 19.414f, 10.251f, 19.285f)
            lineTo(11.737f, 17.798f)
            lineTo(5.708f, 11.768f)
            close()
            moveTo(13.748f, 3.729f)
            lineTo(6.769f, 10.707f)
            lineTo(12.798f, 16.737f)
            lineTo(19.778f, 9.759f)
            curveTo(20.07f, 9.466f, 20.07f, 8.991f, 19.778f, 8.698f)
            lineTo(14.809f, 3.729f)
            curveTo(14.516f, 3.437f, 14.041f, 3.437f, 13.748f, 3.729f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EraserPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Eraser, contentDescription = null)
    }
}
