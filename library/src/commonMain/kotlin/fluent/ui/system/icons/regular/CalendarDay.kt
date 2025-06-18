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

public val FluentUi.Regular.CalendarDay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarDay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(16.25f, 11f)
            curveTo(16.664f, 11f, 17f, 11.336f, 17f, 11.75f)
            verticalLineTo(16.25f)
            curveTo(17f, 16.664f, 16.664f, 17f, 16.25f, 17f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 17f, 7f, 16.664f, 7f, 16.25f)
            verticalLineTo(11.75f)
            curveTo(7f, 11.336f, 7.336f, 11f, 7.75f, 11f)
            horizontalLineTo(16.25f)
            close()
            moveTo(15.5f, 12.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(12.5f)
            close()
            moveTo(7.75f, 7.25f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 7.25f, 17f, 7.586f, 17f, 8f)
            curveTo(17f, 8.38f, 16.718f, 8.693f, 16.352f, 8.743f)
            lineTo(16.25f, 8.75f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 8.75f, 7f, 8.414f, 7f, 8f)
            curveTo(7f, 7.62f, 7.282f, 7.307f, 7.648f, 7.257f)
            lineTo(7.75f, 7.25f)
            horizontalLineTo(16.25f)
            horizontalLineTo(7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarDay, contentDescription = null)
    }
}
