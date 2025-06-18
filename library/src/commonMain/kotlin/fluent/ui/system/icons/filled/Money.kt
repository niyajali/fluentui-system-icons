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

public val FluentUi.Filled.Money: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Money",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.784f, 2.783f, 5f, 3.75f, 5f)
            horizontalLineTo(17.25f)
            curveTo(18.216f, 5f, 19f, 5.784f, 19f, 6.75f)
            verticalLineTo(15.25f)
            curveTo(19f, 16.216f, 18.216f, 17f, 17.25f, 17f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 17f, 2f, 16.216f, 2f, 15.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(5f, 6.25f)
            verticalLineTo(7.25f)
            curveTo(5f, 7.664f, 4.664f, 8f, 4.25f, 8f)
            horizontalLineTo(3.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(4.25f)
            curveTo(5.493f, 9.5f, 6.5f, 8.493f, 6.5f, 7.25f)
            verticalLineTo(6.25f)
            horizontalLineTo(5f)
            close()
            moveTo(10.5f, 13.5f)
            curveTo(11.743f, 13.5f, 12.75f, 12.493f, 12.75f, 11.25f)
            curveTo(12.75f, 10.007f, 11.743f, 9f, 10.5f, 9f)
            curveTo(9.257f, 9f, 8.25f, 10.007f, 8.25f, 11.25f)
            curveTo(8.25f, 12.493f, 9.257f, 13.5f, 10.5f, 13.5f)
            close()
            moveTo(3.25f, 14f)
            horizontalLineTo(4.25f)
            curveTo(4.664f, 14f, 5f, 14.336f, 5f, 14.75f)
            verticalLineTo(15.75f)
            horizontalLineTo(6.5f)
            verticalLineTo(14.75f)
            curveTo(6.5f, 13.507f, 5.493f, 12.5f, 4.25f, 12.5f)
            horizontalLineTo(3.25f)
            verticalLineTo(14f)
            close()
            moveTo(16f, 14.75f)
            curveTo(16f, 14.336f, 16.336f, 14f, 16.75f, 14f)
            horizontalLineTo(17.75f)
            verticalLineTo(12.5f)
            horizontalLineTo(16.75f)
            curveTo(15.507f, 12.5f, 14.5f, 13.507f, 14.5f, 14.75f)
            verticalLineTo(15.75f)
            horizontalLineTo(16f)
            verticalLineTo(14.75f)
            close()
            moveTo(16f, 7.25f)
            verticalLineTo(6.25f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.25f)
            curveTo(14.5f, 8.493f, 15.507f, 9.5f, 16.75f, 9.5f)
            horizontalLineTo(17.75f)
            verticalLineTo(8f)
            horizontalLineTo(16.75f)
            curveTo(16.336f, 8f, 16f, 7.664f, 16f, 7.25f)
            close()
            moveTo(4.401f, 18.5f)
            curveTo(4.92f, 19.397f, 5.89f, 20f, 7f, 20f)
            horizontalLineTo(17.25f)
            curveTo(19.873f, 20f, 22f, 17.873f, 22f, 15.25f)
            verticalLineTo(10f)
            curveTo(22f, 8.89f, 21.397f, 7.92f, 20.5f, 7.401f)
            verticalLineTo(15.25f)
            curveTo(20.5f, 17.045f, 19.045f, 18.5f, 17.25f, 18.5f)
            horizontalLineTo(4.401f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Money, contentDescription = null)
    }
}
