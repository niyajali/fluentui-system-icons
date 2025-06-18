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

public val FluentUi.Filled.GridDots: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GridDots",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 17f)
            curveTo(13.105f, 17f, 14f, 17.895f, 14f, 19f)
            curveTo(14f, 20.105f, 13.105f, 21f, 12f, 21f)
            curveTo(10.895f, 21f, 10f, 20.105f, 10f, 19f)
            curveTo(10f, 17.895f, 10.895f, 17f, 12f, 17f)
            close()
            moveTo(19f, 17f)
            curveTo(20.105f, 17f, 21f, 17.895f, 21f, 19f)
            curveTo(21f, 20.105f, 20.105f, 21f, 19f, 21f)
            curveTo(17.895f, 21f, 17f, 20.105f, 17f, 19f)
            curveTo(17f, 17.895f, 17.895f, 17f, 19f, 17f)
            close()
            moveTo(5f, 17f)
            curveTo(6.105f, 17f, 7f, 17.895f, 7f, 19f)
            curveTo(7f, 20.105f, 6.105f, 21f, 5f, 21f)
            curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
            curveTo(3f, 17.895f, 3.895f, 17f, 5f, 17f)
            close()
            moveTo(12f, 10f)
            curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
            curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
            curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
            curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
            close()
            moveTo(19f, 10f)
            curveTo(20.105f, 10f, 21f, 10.895f, 21f, 12f)
            curveTo(21f, 13.105f, 20.105f, 14f, 19f, 14f)
            curveTo(17.895f, 14f, 17f, 13.105f, 17f, 12f)
            curveTo(17f, 10.895f, 17.895f, 10f, 19f, 10f)
            close()
            moveTo(5f, 10f)
            curveTo(6.105f, 10f, 7f, 10.895f, 7f, 12f)
            curveTo(7f, 13.105f, 6.105f, 14f, 5f, 14f)
            curveTo(3.895f, 14f, 3f, 13.105f, 3f, 12f)
            curveTo(3f, 10.895f, 3.895f, 10f, 5f, 10f)
            close()
            moveTo(12f, 3f)
            curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
            curveTo(14f, 6.105f, 13.105f, 7f, 12f, 7f)
            curveTo(10.895f, 7f, 10f, 6.105f, 10f, 5f)
            curveTo(10f, 3.895f, 10.895f, 3f, 12f, 3f)
            close()
            moveTo(19f, 3f)
            curveTo(20.105f, 3f, 21f, 3.895f, 21f, 5f)
            curveTo(21f, 6.105f, 20.105f, 7f, 19f, 7f)
            curveTo(17.895f, 7f, 17f, 6.105f, 17f, 5f)
            curveTo(17f, 3.895f, 17.895f, 3f, 19f, 3f)
            close()
            moveTo(5f, 3f)
            curveTo(6.105f, 3f, 7f, 3.895f, 7f, 5f)
            curveTo(7f, 6.105f, 6.105f, 7f, 5f, 7f)
            curveTo(3.895f, 7f, 3f, 6.105f, 3f, 5f)
            curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GridDotsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GridDots, contentDescription = null)
    }
}
