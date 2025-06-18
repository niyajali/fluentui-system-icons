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

public val FluentUi.Filled.CalendarWorkWeek: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarWorkWeek",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 11f)
            verticalLineTo(8.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(11f)
            horizontalLineTo(8.5f)
            close()
            moveTo(17.75f, 21f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            close()
            moveTo(7.75f, 7f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 7f, 17f, 7.336f, 17f, 7.75f)
            verticalLineTo(11.75f)
            curveTo(17f, 12.164f, 16.664f, 12.5f, 16.25f, 12.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 12.5f, 7f, 12.164f, 7f, 11.75f)
            verticalLineTo(7.75f)
            curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarWorkWeekPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarWorkWeek, contentDescription = null)
    }
}
