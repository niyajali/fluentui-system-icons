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

public val FluentUi.Filled.CalendarMonth: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMonth",
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
            moveTo(7.75f, 13.5f)
            curveTo(7.06f, 13.5f, 6.5f, 14.06f, 6.5f, 14.75f)
            curveTo(6.5f, 15.44f, 7.06f, 16f, 7.75f, 16f)
            curveTo(8.44f, 16f, 9f, 15.44f, 9f, 14.75f)
            curveTo(9f, 14.06f, 8.44f, 13.5f, 7.75f, 13.5f)
            close()
            moveTo(12f, 13.5f)
            curveTo(11.31f, 13.5f, 10.75f, 14.06f, 10.75f, 14.75f)
            curveTo(10.75f, 15.44f, 11.31f, 16f, 12f, 16f)
            curveTo(12.69f, 16f, 13.25f, 15.44f, 13.25f, 14.75f)
            curveTo(13.25f, 14.06f, 12.69f, 13.5f, 12f, 13.5f)
            close()
            moveTo(7.75f, 8.5f)
            curveTo(7.06f, 8.5f, 6.5f, 9.06f, 6.5f, 9.75f)
            curveTo(6.5f, 10.44f, 7.06f, 11f, 7.75f, 11f)
            curveTo(8.44f, 11f, 9f, 10.44f, 9f, 9.75f)
            curveTo(9f, 9.06f, 8.44f, 8.5f, 7.75f, 8.5f)
            close()
            moveTo(12f, 8.5f)
            curveTo(11.31f, 8.5f, 10.75f, 9.06f, 10.75f, 9.75f)
            curveTo(10.75f, 10.44f, 11.31f, 11f, 12f, 11f)
            curveTo(12.69f, 11f, 13.25f, 10.44f, 13.25f, 9.75f)
            curveTo(13.25f, 9.06f, 12.69f, 8.5f, 12f, 8.5f)
            close()
            moveTo(16.25f, 8.5f)
            curveTo(15.56f, 8.5f, 15f, 9.06f, 15f, 9.75f)
            curveTo(15f, 10.44f, 15.56f, 11f, 16.25f, 11f)
            curveTo(16.94f, 11f, 17.5f, 10.44f, 17.5f, 9.75f)
            curveTo(17.5f, 9.06f, 16.94f, 8.5f, 16.25f, 8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarMonthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarMonth, contentDescription = null)
    }
}
