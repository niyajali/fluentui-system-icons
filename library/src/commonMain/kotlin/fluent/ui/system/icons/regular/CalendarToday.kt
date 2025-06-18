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

public val FluentUi.Regular.CalendarToday: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarToday",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(10.25f)
            curveTo(10.25f, 21f, 10.25f, 20.518f, 10.25f, 20.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(13.75f)
            verticalLineTo(20.25f)
            curveTo(13.75f, 20.518f, 13.75f, 21f, 13.75f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            close()
            moveTo(13.25f, 11.75f)
            curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
            curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
            curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
            curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
            close()
            moveTo(13.752f, 18.311f)
            curveTo(14.061f, 18.586f, 14.535f, 18.558f, 14.811f, 18.248f)
            curveTo(15.086f, 17.939f, 15.058f, 17.465f, 14.748f, 17.189f)
            lineTo(12.498f, 15.189f)
            curveTo(12.214f, 14.937f, 11.786f, 14.937f, 11.502f, 15.189f)
            lineTo(9.252f, 17.189f)
            curveTo(8.942f, 17.465f, 8.914f, 17.939f, 9.189f, 18.248f)
            curveTo(9.465f, 18.558f, 9.939f, 18.586f, 10.248f, 18.311f)
            lineTo(11.25f, 17.42f)
            verticalLineTo(21.25f)
            curveTo(11.25f, 21.664f, 11.586f, 22f, 12f, 22f)
            curveTo(12.414f, 22f, 12.75f, 21.664f, 12.75f, 21.25f)
            verticalLineTo(17.42f)
            lineTo(13.752f, 18.311f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarTodayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarToday, contentDescription = null)
    }
}
