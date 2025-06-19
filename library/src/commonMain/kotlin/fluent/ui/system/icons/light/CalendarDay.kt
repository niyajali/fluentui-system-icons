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

public val FluentIcons.Light.CalendarDay: ImageVector
    get() {
        if (_CalendarDay != null) {
            return _CalendarDay!!
        }
        _CalendarDay = ImageVector.Builder(
            name = "Light.CalendarDay",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 9.5f)
                curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
                horizontalLineTo(22.5f)
                curveTo(22.776f, 9f, 23f, 9.224f, 23f, 9.5f)
                curveTo(23f, 9.776f, 22.776f, 10f, 22.5f, 10f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
                close()
                moveTo(10.5f, 13f)
                curveTo(9.672f, 13f, 9f, 13.672f, 9f, 14.5f)
                verticalLineTo(21.5f)
                curveTo(9f, 22.328f, 9.672f, 23f, 10.5f, 23f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
                verticalLineTo(14.5f)
                curveTo(23f, 13.672f, 22.328f, 13f, 21.5f, 13f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10f, 14.5f)
                curveTo(10f, 14.224f, 10.224f, 14f, 10.5f, 14f)
                horizontalLineTo(21.5f)
                curveTo(21.776f, 14f, 22f, 14.224f, 22f, 14.5f)
                verticalLineTo(21.5f)
                curveTo(22f, 21.776f, 21.776f, 22f, 21.5f, 22f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 22f, 10f, 21.776f, 10f, 21.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(24.5f, 4f)
                curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
                horizontalLineTo(24.5f)
                close()
            }
        }.build()

        return _CalendarDay!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDay: ImageVector? = null

@Preview
@Composable
private fun CalendarDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarDay, contentDescription = null)
    }
}
