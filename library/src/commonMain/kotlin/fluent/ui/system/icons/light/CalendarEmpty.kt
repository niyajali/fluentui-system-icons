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

public val FluentIcons.Light.CalendarEmpty: ImageVector
    get() {
        if (_CalendarEmpty != null) {
            return _CalendarEmpty!!
        }
        _CalendarEmpty = ImageVector.Builder(
            name = "Light.CalendarEmpty",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(29f, 24.5f)
                curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(24.5f)
                close()
                moveTo(7.5f, 4f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(10f)
                horizontalLineTo(28f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(7.5f)
                close()
                moveTo(4f, 11f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(24.5f)
                curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _CalendarEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEmpty: ImageVector? = null

@Preview
@Composable
private fun CalendarEmptyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CalendarEmpty, contentDescription = null)
    }
}
