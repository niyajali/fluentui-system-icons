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

public val FluentIcons.Regular.CenterVertical: ImageVector
    get() {
        if (_CenterVertical != null) {
            return _CenterVertical!!
        }
        _CenterVertical = ImageVector.Builder(
            name = "Regular.CenterVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 3.75f)
                curveTo(21f, 4.164f, 20.664f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 4.5f, 3f, 4.164f, 3f, 3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
                close()
                moveTo(21f, 20.25f)
                curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                curveTo(3f, 19.836f, 3.336f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21f, 19.836f, 21f, 20.25f)
                close()
                moveTo(7.25f, 8f)
                curveTo(6.007f, 8f, 5f, 9.007f, 5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(5f, 14.993f, 6.007f, 16f, 7.25f, 16f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 16f, 19f, 14.993f, 19f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(19f, 9.007f, 17.993f, 8f, 16.75f, 8f)
                horizontalLineTo(7.25f)
                close()
                moveTo(6.5f, 10.25f)
                curveTo(6.5f, 9.836f, 6.836f, 9.5f, 7.25f, 9.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 9.5f, 17.5f, 9.836f, 17.5f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(17.5f, 14.164f, 17.164f, 14.5f, 16.75f, 14.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 14.5f, 6.5f, 14.164f, 6.5f, 13.75f)
                verticalLineTo(10.25f)
                close()
            }
        }.build()

        return _CenterVertical!!
    }

@Suppress("ObjectPropertyName")
private var _CenterVertical: ImageVector? = null

@Preview
@Composable
private fun CenterVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CenterVertical, contentDescription = null)
    }
}
