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

public val FluentIcons.Filled.CalendarDataBar: ImageVector
    get() {
        if (_CalendarDataBar != null) {
            return _CalendarDataBar!!
        }
        _CalendarDataBar = ImageVector.Builder(
            name = "Filled.CalendarDataBar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 8.5f)
                verticalLineTo(13.05f)
                curveTo(20.631f, 13.125f, 20.291f, 13.281f, 20f, 13.5f)
                curveTo(20f, 12.119f, 18.881f, 11f, 17.5f, 11f)
                curveTo(16.119f, 11f, 15f, 12.119f, 15f, 13.5f)
                verticalLineTo(15.5f)
                curveTo(14.582f, 15.186f, 14.063f, 15f, 13.5f, 15f)
                curveTo(12.119f, 15f, 11f, 16.119f, 11f, 17.5f)
                verticalLineTo(21f)
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
                moveTo(17.5f, 12f)
                curveTo(16.672f, 12f, 16f, 12.672f, 16f, 13.5f)
                verticalLineTo(21.5f)
                curveTo(16f, 22.328f, 16.672f, 23f, 17.5f, 23f)
                curveTo(18.328f, 23f, 19f, 22.328f, 19f, 21.5f)
                verticalLineTo(13.5f)
                curveTo(19f, 12.672f, 18.328f, 12f, 17.5f, 12f)
                close()
                moveTo(13.5f, 16f)
                curveTo(12.672f, 16f, 12f, 16.672f, 12f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
                curveTo(14.328f, 23f, 15f, 22.328f, 15f, 21.5f)
                verticalLineTo(17.5f)
                curveTo(15f, 16.672f, 14.328f, 16f, 13.5f, 16f)
                close()
                moveTo(20f, 15.5f)
                curveTo(20f, 14.672f, 20.672f, 14f, 21.5f, 14f)
                curveTo(22.328f, 14f, 23f, 14.672f, 23f, 15.5f)
                verticalLineTo(21.5f)
                curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
                curveTo(20.672f, 23f, 20f, 22.328f, 20f, 21.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _CalendarDataBar!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarDataBar: ImageVector? = null

@Preview
@Composable
private fun CalendarDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarDataBar, contentDescription = null)
    }
}
