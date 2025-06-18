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

public val FluentUi.Light.ArrowRedo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowRedo",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(25.995f, 3.5f)
            curveTo(25.995f, 3.224f, 26.219f, 3f, 26.495f, 3f)
            curveTo(26.771f, 3f, 26.995f, 3.224f, 26.995f, 3.5f)
            verticalLineTo(15.5f)
            curveTo(26.995f, 15.776f, 26.771f, 16f, 26.495f, 16f)
            horizontalLineTo(14.495f)
            curveTo(14.219f, 16f, 13.995f, 15.776f, 13.995f, 15.5f)
            curveTo(13.995f, 15.224f, 14.219f, 15f, 14.495f, 15f)
            horizontalLineTo(25.288f)
            lineTo(16.218f, 5.93f)
            curveTo(13.742f, 3.454f, 9.759f, 3.354f, 7.162f, 5.703f)
            curveTo(4.376f, 8.225f, 4.267f, 12.565f, 6.925f, 15.222f)
            lineTo(19.849f, 28.146f)
            curveTo(20.044f, 28.342f, 20.044f, 28.658f, 19.849f, 28.854f)
            curveTo(19.653f, 29.049f, 19.337f, 29.049f, 19.142f, 28.854f)
            lineTo(6.218f, 15.929f)
            curveTo(3.156f, 12.868f, 3.281f, 7.867f, 6.492f, 4.962f)
            curveTo(9.483f, 2.255f, 14.072f, 2.37f, 16.925f, 5.222f)
            lineTo(25.995f, 14.293f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRedoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowRedo, contentDescription = null)
    }
}
