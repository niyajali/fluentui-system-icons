package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Light.CalendarWorkWeek: ImageVector
    get() {
        if (_CalendarWorkWeek != null) {
            return _CalendarWorkWeek!!
        }
        _CalendarWorkWeek = ImageVector.Builder(
            name = "Light.CalendarWorkWeek",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 9f)
                curveTo(8.672f, 9f, 8f, 9.672f, 8f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(8f, 16.328f, 8.672f, 17f, 9.5f, 17f)
                horizontalLineTo(22.5f)
                curveTo(23.328f, 17f, 24f, 16.328f, 24f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(24f, 9.672f, 23.328f, 9f, 22.5f, 9f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9f, 10.5f)
                curveTo(9f, 10.224f, 9.224f, 10f, 9.5f, 10f)
                horizontalLineTo(22.5f)
                curveTo(22.776f, 10f, 23f, 10.224f, 23f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(23f, 15.776f, 22.776f, 16f, 22.5f, 16f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 16f, 9f, 15.776f, 9f, 15.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(7.5f, 4f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _CalendarWorkWeek!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarWorkWeek: ImageVector? = null

@Preview
@Composable
private fun CalendarWorkWeekPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarWorkWeek, contentDescription = null)
    }
}
