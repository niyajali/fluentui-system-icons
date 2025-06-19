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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.CalendarArrowDown: ImageVector
    get() {
        if (_CalendarArrowDown != null) {
            return _CalendarArrowDown!!
        }
        _CalendarArrowDown = ImageVector.Builder(
            name = "Regular.CalendarArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(18f, 14.5f)
                curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
                curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
                verticalLineTo(19.293f)
                lineTo(15.354f, 17.646f)
                curveTo(15.158f, 17.451f, 14.842f, 17.451f, 14.646f, 17.646f)
                curveTo(14.451f, 17.842f, 14.451f, 18.158f, 14.646f, 18.354f)
                lineTo(17.146f, 20.854f)
                curveTo(17.342f, 21.049f, 17.658f, 21.049f, 17.854f, 20.854f)
                lineTo(20.354f, 18.354f)
                curveTo(20.549f, 18.158f, 20.549f, 17.842f, 20.354f, 17.646f)
                curveTo(20.158f, 17.451f, 19.842f, 17.451f, 19.646f, 17.646f)
                lineTo(18f, 19.293f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _CalendarArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarArrowDown: ImageVector? = null

@Preview
@Composable
private fun CalendarArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarArrowDown, contentDescription = null)
    }
}
