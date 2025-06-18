package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.SlideMultipleSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideMultipleSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 3f)
            curveTo(4.127f, 3f, 2f, 5.127f, 2f, 7.75f)
            verticalLineTo(12.257f)
            curveTo(2.446f, 11.889f, 2.952f, 11.589f, 3.5f, 11.375f)
            verticalLineTo(7.75f)
            curveTo(3.5f, 5.955f, 4.955f, 4.5f, 6.75f, 4.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 4.5f, 17.5f, 4.836f, 17.5f, 5.25f)
            verticalLineTo(5.5f)
            horizontalLineTo(19f)
            verticalLineTo(5.25f)
            curveTo(19f, 4.007f, 17.993f, 3f, 16.75f, 3f)
            horizontalLineTo(6.75f)
            close()
            moveTo(19.75f, 20.5f)
            horizontalLineTo(11.975f)
            lineTo(10.475f, 19f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 19f, 20.5f, 18.664f, 20.5f, 18.25f)
            verticalLineTo(8.75f)
            curveTo(20.5f, 8.336f, 20.164f, 8f, 19.75f, 8f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 8f, 7f, 8.336f, 7f, 8.75f)
            verticalLineTo(11.207f)
            curveTo(6.523f, 11.072f, 6.02f, 11f, 5.5f, 11f)
            verticalLineTo(8.75f)
            curveTo(5.5f, 7.507f, 6.507f, 6.5f, 7.75f, 6.5f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 6.5f, 22f, 7.507f, 22f, 8.75f)
            verticalLineTo(18.25f)
            curveTo(22f, 19.493f, 20.993f, 20.5f, 19.75f, 20.5f)
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
        Image(imageVector = FluentUi.Regular.SlideMultipleSearch, contentDescription = null)
    }
}
