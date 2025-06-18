package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.PhotoFilter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhotoFilter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 2f)
            curveTo(12.884f, 2f, 15.745f, 4.242f, 16.679f, 7.321f)
            curveTo(19.758f, 8.255f, 22f, 11.116f, 22f, 14.5f)
            curveTo(22f, 18.642f, 18.642f, 22f, 14.5f, 22f)
            curveTo(11.116f, 22f, 8.255f, 19.758f, 7.321f, 16.679f)
            curveTo(4.242f, 15.745f, 2f, 12.884f, 2f, 9.5f)
            curveTo(2f, 5.358f, 5.358f, 2f, 9.5f, 2f)
            close()
            moveTo(16.998f, 9.599f)
            lineTo(17f, 9.5f)
            curveTo(17f, 13.609f, 13.696f, 16.946f, 9.6f, 16.999f)
            curveTo(10.509f, 18.78f, 12.362f, 20f, 14.5f, 20f)
            curveTo(17.538f, 20f, 20f, 17.538f, 20f, 14.5f)
            curveTo(20f, 12.362f, 18.78f, 10.509f, 16.998f, 9.599f)
            close()
            moveTo(9.5f, 4f)
            curveTo(6.462f, 4f, 4f, 6.462f, 4f, 9.5f)
            curveTo(4f, 11.638f, 5.22f, 13.491f, 7.002f, 14.401f)
            lineTo(7f, 14.5f)
            curveTo(7f, 10.391f, 10.304f, 7.054f, 14.4f, 7.001f)
            curveTo(13.491f, 5.22f, 11.638f, 4f, 9.5f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhotoFilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhotoFilter, contentDescription = null)
    }
}
