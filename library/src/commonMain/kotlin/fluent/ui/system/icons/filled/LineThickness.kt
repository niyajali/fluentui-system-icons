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

public val FluentUi.Filled.LineThickness: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineThickness",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 3f)
            curveTo(2.448f, 3f, 2f, 3.448f, 2f, 4f)
            curveTo(2f, 4.552f, 2.448f, 5f, 3f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 4.552f, 22f, 4f)
            curveTo(22f, 3.448f, 21.552f, 3f, 21f, 3f)
            horizontalLineTo(3f)
            close()
            moveTo(2f, 10.5f)
            curveTo(2f, 9.672f, 2.672f, 9f, 3.5f, 9f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 9f, 22f, 9.672f, 22f, 10.5f)
            curveTo(22f, 11.328f, 21.328f, 12f, 20.5f, 12f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            close()
            moveTo(2f, 18f)
            curveTo(2f, 16.895f, 2.895f, 16f, 4f, 16f)
            horizontalLineTo(20f)
            curveTo(21.105f, 16f, 22f, 16.895f, 22f, 18f)
            curveTo(22f, 19.105f, 21.105f, 20f, 20f, 20f)
            horizontalLineTo(4f)
            curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LineThicknessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LineThickness, contentDescription = null)
    }
}
