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

public val FluentUi.Filled.Pipeline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pipeline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6f)
            curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
            curveTo(5.105f, 4f, 6f, 4.895f, 6f, 6f)
            verticalLineTo(17f)
            curveTo(6f, 18.105f, 5.105f, 19f, 4f, 19f)
            curveTo(2.895f, 19f, 2f, 18.105f, 2f, 17f)
            verticalLineTo(6f)
            close()
            moveTo(18f, 6f)
            curveTo(18f, 4.895f, 18.895f, 4f, 20f, 4f)
            curveTo(21.105f, 4f, 22f, 4.895f, 22f, 6f)
            verticalLineTo(17f)
            curveTo(22f, 18.105f, 21.105f, 19f, 20f, 19f)
            curveTo(18.895f, 19f, 18f, 18.105f, 18f, 17f)
            verticalLineTo(6f)
            close()
            moveTo(16.5f, 6f)
            horizontalLineTo(7.5f)
            verticalLineTo(17f)
            horizontalLineTo(16.5f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PipelinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Pipeline, contentDescription = null)
    }
}
