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

public val FluentUi.Filled.ReOrderDotsVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderDotsVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 17f)
            curveTo(17.105f, 17f, 18f, 17.895f, 18f, 19f)
            curveTo(18f, 20.105f, 17.105f, 21f, 16f, 21f)
            curveTo(14.895f, 21f, 14f, 20.105f, 14f, 19f)
            curveTo(14f, 17.895f, 14.895f, 17f, 16f, 17f)
            close()
            moveTo(8f, 17f)
            curveTo(9.105f, 17f, 10f, 17.895f, 10f, 19f)
            curveTo(10f, 20.105f, 9.105f, 21f, 8f, 21f)
            curveTo(6.895f, 21f, 6f, 20.105f, 6f, 19f)
            curveTo(6f, 17.895f, 6.895f, 17f, 8f, 17f)
            close()
            moveTo(16f, 10f)
            curveTo(17.105f, 10f, 18f, 10.895f, 18f, 12f)
            curveTo(18f, 13.105f, 17.105f, 14f, 16f, 14f)
            curveTo(14.895f, 14f, 14f, 13.105f, 14f, 12f)
            curveTo(14f, 10.895f, 14.895f, 10f, 16f, 10f)
            close()
            moveTo(8f, 10f)
            curveTo(9.105f, 10f, 10f, 10.895f, 10f, 12f)
            curveTo(10f, 13.105f, 9.105f, 14f, 8f, 14f)
            curveTo(6.895f, 14f, 6f, 13.105f, 6f, 12f)
            curveTo(6f, 10.895f, 6.895f, 10f, 8f, 10f)
            close()
            moveTo(16f, 3f)
            curveTo(17.105f, 3f, 18f, 3.895f, 18f, 5f)
            curveTo(18f, 6.105f, 17.105f, 7f, 16f, 7f)
            curveTo(14.895f, 7f, 14f, 6.105f, 14f, 5f)
            curveTo(14f, 3.895f, 14.895f, 3f, 16f, 3f)
            close()
            moveTo(8f, 3f)
            curveTo(9.105f, 3f, 10f, 3.895f, 10f, 5f)
            curveTo(10f, 6.105f, 9.105f, 7f, 8f, 7f)
            curveTo(6.895f, 7f, 6f, 6.105f, 6f, 5f)
            curveTo(6f, 3.895f, 6.895f, 3f, 8f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReOrderDotsVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ReOrderDotsVertical, contentDescription = null)
    }
}
