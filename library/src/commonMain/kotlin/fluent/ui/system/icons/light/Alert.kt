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

public val FluentUi.Light.Alert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Alert",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 4f)
            curveTo(11.029f, 4f, 7f, 8.029f, 7f, 13f)
            verticalLineTo(17.804f)
            lineTo(5.07f, 22.629f)
            curveTo(4.807f, 23.285f, 5.291f, 24f, 5.998f, 24f)
            horizontalLineTo(12f)
            curveTo(12f, 26.209f, 13.79f, 28f, 16f, 28f)
            curveTo(18.209f, 28f, 20f, 26.209f, 20f, 24f)
            horizontalLineTo(26.001f)
            curveTo(26.708f, 24f, 27.192f, 23.285f, 26.93f, 22.629f)
            lineTo(25f, 17.804f)
            verticalLineTo(13f)
            curveTo(25f, 8.029f, 20.97f, 4f, 16f, 4f)
            close()
            moveTo(19f, 24f)
            curveTo(19f, 25.657f, 17.656f, 27f, 16f, 27f)
            curveTo(14.343f, 27f, 13f, 25.657f, 13f, 24f)
            horizontalLineTo(19f)
            close()
            moveTo(8f, 13f)
            curveTo(8f, 8.582f, 11.581f, 5f, 16f, 5f)
            curveTo(20.418f, 5f, 24f, 8.582f, 24f, 13f)
            verticalLineTo(17.804f)
            curveTo(24f, 17.931f, 24.024f, 18.057f, 24.071f, 18.175f)
            lineTo(26.001f, 23f)
            horizontalLineTo(5.998f)
            lineTo(7.928f, 18.175f)
            curveTo(7.975f, 18.057f, 8f, 17.931f, 8f, 17.804f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Alert, contentDescription = null)
    }
}
