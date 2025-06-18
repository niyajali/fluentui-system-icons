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

public val FluentUi.Filled.TooltipQuoteOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TooltipQuoteOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.75f, 20.5f)
            curveTo(15.164f, 20.5f, 15.5f, 20.836f, 15.5f, 21.25f)
            curveTo(15.5f, 21.664f, 15.164f, 22f, 14.75f, 22f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 22f, 2f, 21.664f, 2f, 21.25f)
            curveTo(2f, 20.836f, 2.336f, 20.5f, 2.75f, 20.5f)
            horizontalLineTo(14.75f)
            close()
            moveTo(2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            lineTo(21.831f, 20.776f)
            curveTo(22.072f, 21.071f, 22.055f, 21.506f, 21.78f, 21.78f)
            curveTo(21.506f, 22.055f, 21.071f, 22.072f, 20.776f, 21.831f)
            lineTo(20.72f, 21.78f)
            lineTo(16.94f, 18f)
            horizontalLineTo(10.333f)
            lineTo(11.122f, 16.5f)
            horizontalLineTo(15.439f)
            lineTo(12.939f, 14f)
            horizontalLineTo(11.308f)
            lineTo(9.414f, 17.6f)
            curveTo(9.284f, 17.846f, 9.028f, 18f, 8.75f, 18f)
            curveTo(8.472f, 18f, 8.216f, 17.846f, 8.086f, 17.6f)
            lineTo(6.191f, 14f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 14f, 2f, 12.993f, 2f, 11.75f)
            verticalLineTo(4.25f)
            curveTo(2f, 3.903f, 2.08f, 3.575f, 2.221f, 3.281f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            close()
            moveTo(7.167f, 18f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 18f, 2f, 17.664f, 2f, 17.25f)
            curveTo(2f, 16.836f, 2.336f, 16.5f, 2.75f, 16.5f)
            horizontalLineTo(6.378f)
            lineTo(7.167f, 18f)
            close()
            moveTo(21.25f, 16.5f)
            curveTo(21.664f, 16.5f, 22f, 16.836f, 22f, 17.25f)
            curveTo(22f, 17.664f, 21.664f, 18f, 21.25f, 18f)
            horizontalLineTo(21.182f)
            lineTo(19.682f, 16.5f)
            horizontalLineTo(21.25f)
            close()
            moveTo(13.25f, 2f)
            curveTo(14.493f, 2f, 15.5f, 3.007f, 15.5f, 4.25f)
            verticalLineTo(11.75f)
            curveTo(15.5f, 11.925f, 15.477f, 12.094f, 15.439f, 12.258f)
            lineTo(11.9f, 8.719f)
            curveTo(12.232f, 8.061f, 12.5f, 7.229f, 12.5f, 6.25f)
            curveTo(12.5f, 5.836f, 12.164f, 5.5f, 11.75f, 5.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5.5f, 9.5f, 5.836f, 9.5f, 6.25f)
            verticalLineTo(6.318f)
            lineTo(5.182f, 2f)
            horizontalLineTo(13.25f)
            close()
            moveTo(5.5f, 7.25f)
            curveTo(5.5f, 7.664f, 5.836f, 8f, 6.25f, 8f)
            curveTo(6.391f, 8f, 6.522f, 7.961f, 6.635f, 7.894f)
            curveTo(6.332f, 8.558f, 5.92f, 9.019f, 5.72f, 9.22f)
            curveTo(5.427f, 9.513f, 5.427f, 9.987f, 5.72f, 10.28f)
            curveTo(6.013f, 10.573f, 6.487f, 10.573f, 6.78f, 10.28f)
            curveTo(6.999f, 10.061f, 7.437f, 9.579f, 7.816f, 8.877f)
            lineTo(5.5f, 6.561f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TooltipQuoteOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TooltipQuoteOff, contentDescription = null)
    }
}
