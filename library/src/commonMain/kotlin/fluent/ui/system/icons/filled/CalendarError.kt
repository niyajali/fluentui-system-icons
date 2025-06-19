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

public val FluentIcons.Filled.CalendarError: ImageVector
    get() {
        if (_CalendarError != null) {
            return _CalendarError!!
        }
        _CalendarError = ImageVector.Builder(
            name = "Filled.CalendarError",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 12.022f)
                verticalLineTo(8.5f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(12.022f)
                curveTo(11.375f, 19.99f, 11f, 18.789f, 11f, 17.5f)
                curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                close()
                moveTo(21f, 6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(6.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17f, 14.5f)
                curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
                curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(18f, 18.776f, 17.776f, 19f, 17.5f, 19f)
                curveTo(17.224f, 19f, 17f, 18.776f, 17f, 18.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(18.125f, 20.5f)
                curveTo(18.125f, 20.845f, 17.845f, 21.125f, 17.5f, 21.125f)
                curveTo(17.155f, 21.125f, 16.875f, 20.845f, 16.875f, 20.5f)
                curveTo(16.875f, 20.155f, 17.155f, 19.875f, 17.5f, 19.875f)
                curveTo(17.845f, 19.875f, 18.125f, 20.155f, 18.125f, 20.5f)
                close()
            }
        }.build()

        return _CalendarError!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarError: ImageVector? = null

@Preview
@Composable
private fun CalendarErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarError, contentDescription = null)
    }
}
