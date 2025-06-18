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

public val FluentUi.Filled.CalculatorArrowClockwise: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalculatorArrowClockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
            verticalLineTo(10.275f)
            curveTo(19.958f, 10.318f, 19.918f, 10.364f, 19.88f, 10.411f)
            curveTo(19.84f, 10.462f, 19.802f, 10.514f, 19.768f, 10.569f)
            curveTo(18.918f, 10.203f, 17.982f, 10f, 17f, 10f)
            curveTo(13.134f, 10f, 10f, 13.134f, 10f, 17f)
            curveTo(10f, 18.959f, 10.804f, 20.729f, 12.101f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(9f, 5f)
            curveTo(7.895f, 5f, 7f, 5.895f, 7f, 7f)
            verticalLineTo(8f)
            curveTo(7f, 9.105f, 7.895f, 10f, 9f, 10f)
            horizontalLineTo(15f)
            curveTo(16.105f, 10f, 17f, 9.105f, 17f, 8f)
            verticalLineTo(7f)
            curveTo(17f, 5.895f, 16.105f, 5f, 15f, 5f)
            horizontalLineTo(9f)
            close()
            moveTo(9.5f, 13.25f)
            curveTo(9.5f, 12.56f, 8.94f, 12f, 8.25f, 12f)
            curveTo(7.56f, 12f, 7f, 12.56f, 7f, 13.25f)
            curveTo(7f, 13.94f, 7.56f, 14.5f, 8.25f, 14.5f)
            curveTo(8.94f, 14.5f, 9.5f, 13.94f, 9.5f, 13.25f)
            close()
            moveTo(8.25f, 18.5f)
            curveTo(8.94f, 18.5f, 9.5f, 17.94f, 9.5f, 17.25f)
            curveTo(9.5f, 16.56f, 8.94f, 16f, 8.25f, 16f)
            curveTo(7.56f, 16f, 7f, 16.56f, 7f, 17.25f)
            curveTo(7f, 17.94f, 7.56f, 18.5f, 8.25f, 18.5f)
            close()
            moveTo(21.25f, 15f)
            curveTo(21.664f, 15f, 22f, 14.664f, 22f, 14.25f)
            verticalLineTo(11.5f)
            curveTo(22f, 11.086f, 21.664f, 10.75f, 21.25f, 10.75f)
            curveTo(21.012f, 10.75f, 20.8f, 10.861f, 20.663f, 11.033f)
            curveTo(20.561f, 11.162f, 20.5f, 11.324f, 20.5f, 11.5f)
            verticalLineTo(12.126f)
            curveTo(19.515f, 11.418f, 18.305f, 11f, 17f, 11f)
            curveTo(13.686f, 11f, 11f, 13.686f, 11f, 17f)
            curveTo(11f, 20.314f, 13.686f, 23f, 17f, 23f)
            curveTo(20.314f, 23f, 23f, 20.314f, 23f, 17f)
            curveTo(23f, 16.586f, 22.664f, 16.25f, 22.25f, 16.25f)
            curveTo(21.836f, 16.25f, 21.5f, 16.586f, 21.5f, 17f)
            curveTo(21.5f, 19.485f, 19.485f, 21.5f, 17f, 21.5f)
            curveTo(14.515f, 21.5f, 12.5f, 19.485f, 12.5f, 17f)
            curveTo(12.5f, 14.515f, 14.515f, 12.5f, 17f, 12.5f)
            curveTo(18.065f, 12.5f, 19.042f, 12.869f, 19.812f, 13.487f)
            curveTo(19.815f, 13.489f, 19.817f, 13.491f, 19.82f, 13.493f)
            curveTo(19.823f, 13.495f, 19.826f, 13.498f, 19.829f, 13.5f)
            horizontalLineTo(18.5f)
            curveTo(18.086f, 13.5f, 17.75f, 13.836f, 17.75f, 14.25f)
            curveTo(17.75f, 14.664f, 18.086f, 15f, 18.5f, 15f)
            horizontalLineTo(21.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalculatorArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalculatorArrowClockwise, contentDescription = null)
    }
}
