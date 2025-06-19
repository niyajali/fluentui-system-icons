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

public val FluentIcons.Regular.SlideLayout: ImageVector
    get() {
        if (_SlideLayout != null) {
            return _SlideLayout!!
        }
        _SlideLayout = ImageVector.Builder(
            name = "Regular.SlideLayout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 7f)
                curveTo(5.784f, 7f, 5f, 7.784f, 5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(5f, 16.216f, 5.784f, 17f, 6.75f, 17f)
                horizontalLineTo(17.25f)
                curveTo(18.216f, 17f, 19f, 16.216f, 19f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(19f, 7.784f, 18.216f, 7f, 17.25f, 7f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.5f, 8.75f)
                curveTo(6.5f, 8.612f, 6.612f, 8.5f, 6.75f, 8.5f)
                horizontalLineTo(17.25f)
                curveTo(17.388f, 8.5f, 17.5f, 8.612f, 17.5f, 8.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 15.388f, 17.388f, 15.5f, 17.25f, 15.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(12f)
                close()
                moveTo(9f, 12f)
                verticalLineTo(15.5f)
                horizontalLineTo(6.75f)
                curveTo(6.612f, 15.5f, 6.5f, 15.388f, 6.5f, 15.25f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                close()
                moveTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 17.94f, 19.94f, 18.5f, 19.25f, 18.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _SlideLayout!!
    }

@Suppress("ObjectPropertyName")
private var _SlideLayout: ImageVector? = null

@Preview
@Composable
private fun SlideLayoutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideLayout, contentDescription = null)
    }
}
