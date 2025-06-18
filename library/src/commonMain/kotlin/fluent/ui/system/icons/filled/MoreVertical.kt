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

public val FluentUi.Filled.MoreVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            curveTo(10.895f, 8f, 10f, 7.105f, 10f, 6f)
            curveTo(10f, 4.895f, 10.895f, 4f, 12f, 4f)
            curveTo(13.105f, 4f, 14f, 4.895f, 14f, 6f)
            curveTo(14f, 7.105f, 13.105f, 8f, 12f, 8f)
            close()
            moveTo(12f, 14f)
            curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
            curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
            curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
            curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
            close()
            moveTo(10f, 18f)
            curveTo(10f, 19.105f, 10.895f, 20f, 12f, 20f)
            curveTo(13.105f, 20f, 14f, 19.105f, 14f, 18f)
            curveTo(14f, 16.895f, 13.105f, 16f, 12f, 16f)
            curveTo(10.895f, 16f, 10f, 16.895f, 10f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoreVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MoreVertical, contentDescription = null)
    }
}
