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

public val FluentUi.Filled.SlideMultipleSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideMultipleSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.75f)
            curveTo(2f, 5.127f, 4.127f, 3f, 6.75f, 3f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 3f, 19f, 4.007f, 19f, 5.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(7.75f)
            curveTo(5.955f, 5.5f, 4.5f, 6.955f, 4.5f, 8.75f)
            verticalLineTo(11.091f)
            curveTo(3.562f, 11.263f, 2.707f, 11.674f, 2f, 12.257f)
            verticalLineTo(7.75f)
            close()
            moveTo(10.425f, 18.95f)
            lineTo(11.975f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 20.5f, 22f, 19.493f, 22f, 18.25f)
            verticalLineTo(8.75f)
            curveTo(22f, 7.507f, 20.993f, 6.5f, 19.75f, 6.5f)
            horizontalLineTo(7.75f)
            curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
            verticalLineTo(11f)
            curveTo(8.538f, 11f, 11f, 13.462f, 11f, 16.5f)
            curveTo(11f, 17.381f, 10.793f, 18.213f, 10.425f, 18.95f)
            close()
            moveTo(5.5f, 21f)
            curveTo(6.472f, 21f, 7.372f, 20.692f, 8.107f, 20.168f)
            lineTo(10.72f, 22.78f)
            curveTo(11.013f, 23.073f, 11.487f, 23.073f, 11.78f, 22.78f)
            curveTo(12.073f, 22.487f, 12.073f, 22.013f, 11.78f, 21.72f)
            lineTo(9.168f, 19.107f)
            curveTo(9.692f, 18.372f, 10f, 17.472f, 10f, 16.5f)
            curveTo(10f, 14.015f, 7.985f, 12f, 5.5f, 12f)
            curveTo(3.015f, 12f, 1f, 14.015f, 1f, 16.5f)
            curveTo(1f, 18.985f, 3.015f, 21f, 5.5f, 21f)
            close()
            moveTo(5.5f, 19.5f)
            curveTo(3.843f, 19.5f, 2.5f, 18.157f, 2.5f, 16.5f)
            curveTo(2.5f, 14.843f, 3.843f, 13.5f, 5.5f, 13.5f)
            curveTo(7.157f, 13.5f, 8.5f, 14.843f, 8.5f, 16.5f)
            curveTo(8.5f, 18.157f, 7.157f, 19.5f, 5.5f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideMultipleSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideMultipleSearch, contentDescription = null)
    }
}
