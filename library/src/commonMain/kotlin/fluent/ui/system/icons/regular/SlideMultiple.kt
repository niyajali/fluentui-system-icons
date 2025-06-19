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

public val FluentIcons.Regular.SlideMultiple: ImageVector
    get() {
        if (_SlideMultiple != null) {
            return _SlideMultiple!!
        }
        _SlideMultiple = ImageVector.Builder(
            name = "Regular.SlideMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 3f)
                curveTo(4.127f, 3f, 2f, 5.127f, 2f, 7.75f)
                verticalLineTo(14.75f)
                curveTo(2f, 15.993f, 3.007f, 17f, 4.25f, 17f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 15.5f, 3.5f, 15.164f, 3.5f, 14.75f)
                verticalLineTo(7.75f)
                curveTo(3.5f, 5.955f, 4.955f, 4.5f, 6.75f, 4.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 4.5f, 17.5f, 4.836f, 17.5f, 5.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(19f)
                verticalLineTo(5.25f)
                curveTo(19f, 4.007f, 17.993f, 3f, 16.75f, 3f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.75f, 6.5f)
                curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(5.5f, 19.493f, 6.507f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 20.5f, 22f, 19.493f, 22f, 18.25f)
                verticalLineTo(8.75f)
                curveTo(22f, 7.507f, 20.993f, 6.5f, 19.75f, 6.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(7f, 8.75f)
                curveTo(7f, 8.336f, 7.336f, 8f, 7.75f, 8f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 8f, 20.5f, 8.336f, 20.5f, 8.75f)
                verticalLineTo(18.25f)
                curveTo(20.5f, 18.664f, 20.164f, 19f, 19.75f, 19f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 19f, 7f, 18.664f, 7f, 18.25f)
                verticalLineTo(8.75f)
                close()
            }
        }.build()

        return _SlideMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SlideMultiple: ImageVector? = null

@Preview
@Composable
private fun SlideMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideMultiple, contentDescription = null)
    }
}
