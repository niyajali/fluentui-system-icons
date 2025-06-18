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

public val FluentUi.Filled.FullScreenMinimize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FullScreenMinimize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 4f)
            curveTo(9f, 3.448f, 8.552f, 3f, 8f, 3f)
            curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
            verticalLineTo(6.5f)
            curveTo(7f, 6.776f, 6.776f, 7f, 6.5f, 7f)
            horizontalLineTo(4f)
            curveTo(3.448f, 7f, 3f, 7.448f, 3f, 8f)
            curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
            horizontalLineTo(6.5f)
            curveTo(7.881f, 9f, 9f, 7.881f, 9f, 6.5f)
            verticalLineTo(4f)
            close()
            moveTo(9f, 20f)
            curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
            curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
            verticalLineTo(17.5f)
            curveTo(7f, 17.224f, 6.776f, 17f, 6.5f, 17f)
            horizontalLineTo(4f)
            curveTo(3.448f, 17f, 3f, 16.552f, 3f, 16f)
            curveTo(3f, 15.448f, 3.448f, 15f, 4f, 15f)
            horizontalLineTo(6.5f)
            curveTo(7.881f, 15f, 9f, 16.119f, 9f, 17.5f)
            verticalLineTo(20f)
            close()
            moveTo(16f, 3f)
            curveTo(15.448f, 3f, 15f, 3.448f, 15f, 4f)
            verticalLineTo(6.5f)
            curveTo(15f, 7.881f, 16.119f, 9f, 17.5f, 9f)
            horizontalLineTo(20f)
            curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
            curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
            verticalLineTo(4f)
            curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
            close()
            moveTo(15f, 20f)
            curveTo(15f, 20.552f, 15.448f, 21f, 16f, 21f)
            curveTo(16.552f, 21f, 17f, 20.552f, 17f, 20f)
            verticalLineTo(17.5f)
            curveTo(17f, 17.224f, 17.224f, 17f, 17.5f, 17f)
            horizontalLineTo(20f)
            curveTo(20.552f, 17f, 21f, 16.552f, 21f, 16f)
            curveTo(21f, 15.448f, 20.552f, 15f, 20f, 15f)
            horizontalLineTo(17.5f)
            curveTo(16.119f, 15f, 15f, 16.119f, 15f, 17.5f)
            verticalLineTo(20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FullScreenMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FullScreenMinimize, contentDescription = null)
    }
}
