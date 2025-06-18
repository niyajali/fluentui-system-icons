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

public val FluentUi.Regular.CalendarRecord: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarRecord",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11.314f)
            curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(17.5f, 13.5f)
            curveTo(19.709f, 13.5f, 21.5f, 15.291f, 21.5f, 17.5f)
            curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
            curveTo(15.291f, 21.5f, 13.5f, 19.709f, 13.5f, 17.5f)
            curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
            close()
            moveTo(17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            close()
            moveTo(20f, 17.5f)
            curveTo(20f, 18.881f, 18.881f, 20f, 17.5f, 20f)
            curveTo(16.119f, 20f, 15f, 18.881f, 15f, 17.5f)
            curveTo(15f, 16.119f, 16.119f, 15f, 17.5f, 15f)
            curveTo(18.881f, 15f, 20f, 16.119f, 20f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarRecordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarRecord, contentDescription = null)
    }
}
