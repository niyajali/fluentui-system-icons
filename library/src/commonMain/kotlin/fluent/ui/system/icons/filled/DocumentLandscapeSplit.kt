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

public val FluentUi.Filled.DocumentLandscapeSplit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLandscapeSplit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 4f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineTo(18f)
            curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
            horizontalLineTo(10.5f)
            verticalLineTo(4f)
            close()
            moveTo(12f, 20f)
            horizontalLineTo(20f)
            curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
            verticalLineTo(12f)
            lineTo(16f, 12f)
            curveTo(14.895f, 12f, 14f, 11.105f, 14f, 10f)
            verticalLineTo(4f)
            horizontalLineTo(12f)
            verticalLineTo(20f)
            close()
            moveTo(16f, 10.5f)
            lineTo(21.5f, 10.5f)
            lineTo(15.5f, 4.5f)
            verticalLineTo(10f)
            curveTo(15.5f, 10.276f, 15.724f, 10.5f, 16f, 10.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLandscapeSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentLandscapeSplit, contentDescription = null)
    }
}
