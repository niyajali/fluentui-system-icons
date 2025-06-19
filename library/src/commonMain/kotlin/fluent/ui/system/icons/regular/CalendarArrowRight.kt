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

public val FluentIcons.Regular.CalendarArrowRight: ImageVector
    get() {
        if (_CalendarArrowRight != null) {
            return _CalendarArrowRight!!
        }
        _CalendarArrowRight = ImageVector.Builder(
            name = "Regular.CalendarArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
                horizontalLineTo(6f)
                curveTo(5.172f, 19.5f, 4.5f, 18.828f, 4.5f, 18f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.314f)
                curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21f, 12.022f)
                verticalLineTo(6f)
                close()
                moveTo(6f, 4.5f)
                horizontalLineTo(18f)
                curveTo(18.828f, 4.5f, 19.5f, 5.172f, 19.5f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                verticalLineTo(6f)
                curveTo(4.5f, 5.172f, 5.172f, 4.5f, 6f, 4.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17.646f, 15.354f)
                curveTo(17.451f, 15.158f, 17.451f, 14.842f, 17.646f, 14.646f)
                curveTo(17.842f, 14.451f, 18.158f, 14.451f, 18.354f, 14.646f)
                lineTo(20.854f, 17.146f)
                curveTo(21.049f, 17.342f, 21.049f, 17.658f, 20.854f, 17.854f)
                lineTo(18.354f, 20.354f)
                curveTo(18.158f, 20.549f, 17.842f, 20.549f, 17.646f, 20.354f)
                curveTo(17.451f, 20.158f, 17.451f, 19.842f, 17.646f, 19.646f)
                lineTo(19.293f, 18f)
                horizontalLineTo(14.5f)
                curveTo(14.224f, 18f, 14f, 17.776f, 14f, 17.5f)
                curveTo(14f, 17.224f, 14.224f, 17f, 14.5f, 17f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 15.354f)
                close()
            }
        }.build()

        return _CalendarArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarArrowRight: ImageVector? = null

@Preview
@Composable
private fun CalendarArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CalendarArrowRight, contentDescription = null)
    }
}
