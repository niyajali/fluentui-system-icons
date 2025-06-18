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

public val FluentUi.Filled.MoreHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 12f)
            curveTo(8f, 13.105f, 7.105f, 14f, 6f, 14f)
            curveTo(4.895f, 14f, 4f, 13.105f, 4f, 12f)
            curveTo(4f, 10.895f, 4.895f, 10f, 6f, 10f)
            curveTo(7.105f, 10f, 8f, 10.895f, 8f, 12f)
            close()
            moveTo(14f, 12f)
            curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
            curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
            curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
            curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
            close()
            moveTo(18f, 14f)
            curveTo(19.105f, 14f, 20f, 13.105f, 20f, 12f)
            curveTo(20f, 10.895f, 19.105f, 10f, 18f, 10f)
            curveTo(16.895f, 10f, 16f, 10.895f, 16f, 12f)
            curveTo(16f, 13.105f, 16.895f, 14f, 18f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoreHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MoreHorizontal, contentDescription = null)
    }
}
