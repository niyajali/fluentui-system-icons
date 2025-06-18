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

public val FluentUi.Filled.DocumentSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(11.6f)
            curveTo(4.75f, 11.216f, 5.6f, 11f, 6.5f, 11f)
            curveTo(9.538f, 11f, 12f, 13.462f, 12f, 16.5f)
            curveTo(12f, 17.381f, 11.793f, 18.213f, 11.425f, 18.95f)
            lineTo(13.487f, 21.013f)
            curveTo(13.765f, 21.291f, 13.93f, 21.639f, 13.982f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
            moveTo(6.5f, 21f)
            curveTo(7.472f, 21f, 8.372f, 20.692f, 9.107f, 20.168f)
            lineTo(11.72f, 22.78f)
            curveTo(12.013f, 23.073f, 12.487f, 23.073f, 12.78f, 22.78f)
            curveTo(13.073f, 22.487f, 13.073f, 22.013f, 12.78f, 21.72f)
            lineTo(10.168f, 19.107f)
            curveTo(10.692f, 18.372f, 11f, 17.472f, 11f, 16.5f)
            curveTo(11f, 14.015f, 8.985f, 12f, 6.5f, 12f)
            curveTo(4.015f, 12f, 2f, 14.015f, 2f, 16.5f)
            curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
            close()
            moveTo(6.5f, 19.5f)
            curveTo(4.843f, 19.5f, 3.5f, 18.157f, 3.5f, 16.5f)
            curveTo(3.5f, 14.843f, 4.843f, 13.5f, 6.5f, 13.5f)
            curveTo(8.157f, 13.5f, 9.5f, 14.843f, 9.5f, 16.5f)
            curveTo(9.5f, 18.157f, 8.157f, 19.5f, 6.5f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentSearch, contentDescription = null)
    }
}
