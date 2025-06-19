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

public val FluentIcons.Filled.CalendarArrowRight: ImageVector
    get() {
        if (_CalendarArrowRight != null) {
            return _CalendarArrowRight!!
        }
        _CalendarArrowRight = ImageVector.Builder(
            name = "Filled.CalendarArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 8.5f)
                verticalLineTo(12.022f)
                curveTo(19.99f, 11.375f, 18.789f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 19.646f)
                curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
                curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
                curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
                lineTo(19.293f, 17f)
                horizontalLineTo(14.5f)
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
        Image(imageVector = FluentIcons.Filled.CalendarArrowRight, contentDescription = null)
    }
}
