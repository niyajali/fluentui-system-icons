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

public val FluentIcons.Filled.CalendarMultiple: ImageVector
    get() {
        if (_CalendarMultiple != null) {
            return _CalendarMultiple!!
        }
        _CalendarMultiple = ImageVector.Builder(
            name = "Filled.CalendarMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.993f, 5.007f)
                lineTo(19.998f, 5.128f)
                lineTo(20f, 5.25f)
                verticalLineTo(16.35f)
                curveTo(20f, 18.366f, 18.366f, 20f, 16.35f, 20f)
                horizontalLineTo(5.25f)
                curveTo(5.168f, 20f, 5.087f, 19.998f, 5.007f, 19.993f)
                curveTo(5.583f, 20.899f, 6.596f, 21.5f, 7.75f, 21.5f)
                horizontalLineTo(16.35f)
                curveTo(19.194f, 21.5f, 21.5f, 19.194f, 21.5f, 16.35f)
                verticalLineTo(7.75f)
                curveTo(21.5f, 6.597f, 20.899f, 5.584f, 19.993f, 5.007f)
                close()
                moveTo(2f, 7.5f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(2f)
                close()
                moveTo(5.25f, 2f)
                curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(5.25f)
                curveTo(19f, 3.455f, 17.545f, 2f, 15.75f, 2f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _CalendarMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMultiple: ImageVector? = null

@Preview
@Composable
private fun CalendarMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarMultiple, contentDescription = null)
    }
}
