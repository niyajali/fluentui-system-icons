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

public val FluentUi.Regular.DocumentDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            close()
            moveTo(12.129f, 2f)
            curveTo(12.725f, 2f, 13.298f, 2.237f, 13.719f, 2.659f)
            lineTo(16.531f, 5.469f)
            lineTo(19.339f, 8.281f)
            curveTo(19.76f, 8.703f, 19.997f, 9.275f, 19.997f, 9.871f)
            verticalLineTo(19.75f)
            curveTo(19.997f, 20.993f, 18.99f, 22f, 17.747f, 22f)
            lineTo(11.19f, 22.001f)
            curveTo(11.616f, 21.557f, 11.98f, 21.052f, 12.267f, 20.501f)
            lineTo(17.747f, 20.5f)
            curveTo(18.161f, 20.5f, 18.497f, 20.164f, 18.497f, 19.75f)
            lineTo(18.496f, 10.003f)
            lineTo(14.25f, 10.004f)
            curveTo(13.059f, 10.004f, 12.084f, 9.079f, 12.005f, 7.908f)
            lineTo(12f, 7.754f)
            lineTo(11.999f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            lineTo(5.499f, 11.077f)
            curveTo(4.976f, 11.158f, 4.473f, 11.301f, 3.999f, 11.499f)
            lineTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(12.129f)
            close()
            moveTo(4.093f, 14.966f)
            lineTo(4.024f, 15.024f)
            lineTo(3.966f, 15.093f)
            curveTo(3.848f, 15.264f, 3.848f, 15.491f, 3.966f, 15.662f)
            lineTo(4.024f, 15.731f)
            lineTo(5.793f, 17.501f)
            lineTo(4.026f, 19.267f)
            lineTo(3.969f, 19.337f)
            curveTo(3.85f, 19.507f, 3.85f, 19.735f, 3.969f, 19.905f)
            lineTo(4.026f, 19.975f)
            lineTo(4.096f, 20.032f)
            curveTo(4.266f, 20.151f, 4.494f, 20.151f, 4.664f, 20.032f)
            lineTo(4.734f, 19.975f)
            lineTo(6.5f, 18.208f)
            lineTo(8.269f, 19.977f)
            lineTo(8.339f, 20.035f)
            curveTo(8.509f, 20.153f, 8.737f, 20.153f, 8.907f, 20.035f)
            lineTo(8.976f, 19.977f)
            lineTo(9.034f, 19.908f)
            curveTo(9.152f, 19.737f, 9.152f, 19.51f, 9.034f, 19.339f)
            lineTo(8.976f, 19.27f)
            lineTo(7.207f, 17.501f)
            lineTo(8.979f, 15.731f)
            lineTo(9.037f, 15.662f)
            curveTo(9.155f, 15.491f, 9.155f, 15.264f, 9.037f, 15.093f)
            lineTo(8.979f, 15.024f)
            lineTo(8.91f, 14.966f)
            curveTo(8.74f, 14.848f, 8.512f, 14.848f, 8.341f, 14.966f)
            lineTo(8.272f, 15.024f)
            lineTo(6.5f, 16.794f)
            lineTo(4.731f, 15.024f)
            lineTo(4.662f, 14.966f)
            curveTo(4.491f, 14.848f, 4.264f, 14.848f, 4.093f, 14.966f)
            close()
            moveTo(13.499f, 4.559f)
            lineTo(13.5f, 7.754f)
            curveTo(13.5f, 8.134f, 13.782f, 8.447f, 14.148f, 8.497f)
            lineTo(14.25f, 8.504f)
            lineTo(17.441f, 8.503f)
            lineTo(13.499f, 4.559f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentDismiss, contentDescription = null)
    }
}
