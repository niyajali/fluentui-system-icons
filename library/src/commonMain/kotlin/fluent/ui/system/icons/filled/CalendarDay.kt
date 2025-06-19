package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.CalendarDay: ImageVector
    get() {
        if (_CalendarDay != null) {
            return _CalendarDay!!
        }
        _CalendarDay = ImageVector.Builder(
            name = "Filled.CalendarDay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(16.25f, 11f)
                horizontalLineTo(7.75f)
                curveTo(7.37f, 11f, 7.057f, 11.282f, 7.007f, 11.648f)
                lineTo(7f, 11.75f)
                verticalLineTo(16.25f)
                curveTo(7f, 16.63f, 7.282f, 16.944f, 7.648f, 16.993f)
                lineTo(7.75f, 17f)
                horizontalLineTo(16.25f)
                curveTo(16.63f, 17f, 16.944f, 16.718f, 16.993f, 16.352f)
                lineTo(17f, 16.25f)
                verticalLineTo(11.75f)
                curveTo(17f, 11.37f, 16.718f, 11.057f, 16.352f, 11.007f)
                lineTo(16.25f, 11f)
                close()
                moveTo(15.5f, 12.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(16.25f, 7.25f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 7.25f, 7f, 7.586f, 7f, 8f)
                curveTo(7f, 8.414f, 7.336f, 8.75f, 7.75f, 8.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 8.75f, 17f, 8.414f, 17f, 8f)
                curveTo(17f, 7.586f, 16.664f, 7.25f, 16.25f, 7.25f)
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
        Image(imageVector = FluentIcons.Filled.CalendarDay, contentDescription = null)
    }
}
