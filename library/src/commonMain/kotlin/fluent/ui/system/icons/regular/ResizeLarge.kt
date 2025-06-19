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

public val FluentIcons.Regular.ResizeLarge: ImageVector
    get() {
        if (_ResizeLarge != null) {
            return _ResizeLarge!!
        }
        _ResizeLarge = ImageVector.Builder(
            name = "Regular.ResizeLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(4.5f, 8.164f, 4.164f, 8.5f, 3.75f, 8.5f)
                curveTo(3.336f, 8.5f, 3f, 8.164f, 3f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 3f, 8.5f, 3.336f, 8.5f, 3.75f)
                curveTo(8.5f, 4.164f, 8.164f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                lineTo(16.25f, 4.5f)
                curveTo(15.836f, 4.5f, 15.5f, 4.164f, 15.5f, 3.75f)
                curveTo(15.5f, 3.336f, 15.836f, 3f, 16.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(21f, 8.164f, 20.664f, 8.5f, 20.25f, 8.5f)
                curveTo(19.836f, 8.5f, 19.5f, 8.164f, 19.5f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.5f, 17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 19.5f, 15.5f, 19.836f, 15.5f, 20.25f)
                curveTo(15.5f, 20.664f, 15.836f, 21f, 16.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(21f, 15.836f, 20.664f, 15.5f, 20.25f, 15.5f)
                curveTo(19.836f, 15.5f, 19.5f, 15.836f, 19.5f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 19.5f, 8.5f, 19.836f, 8.5f, 20.25f)
                curveTo(8.5f, 20.664f, 8.164f, 21f, 7.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(3f, 15.836f, 3.336f, 15.5f, 3.75f, 15.5f)
                curveTo(4.164f, 15.5f, 4.5f, 15.836f, 4.5f, 16.25f)
                lineTo(4.5f, 17.75f)
                close()
                moveTo(8.25f, 6f)
                curveTo(7.007f, 6f, 6f, 7.007f, 6f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(6f, 16.993f, 7.007f, 18f, 8.25f, 18f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 18f, 18f, 16.993f, 18f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(18f, 7.007f, 16.993f, 6f, 15.75f, 6f)
                horizontalLineTo(8.25f)
                close()
                moveTo(7.5f, 8.25f)
                curveTo(7.5f, 7.836f, 7.836f, 7.5f, 8.25f, 7.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 7.5f, 16.5f, 7.836f, 16.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(16.5f, 16.164f, 16.164f, 16.5f, 15.75f, 16.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 16.5f, 7.5f, 16.164f, 7.5f, 15.75f)
                verticalLineTo(8.25f)
                close()
            }
        }.build()

        return _ResizeLarge!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeLarge: ImageVector? = null

@Preview
@Composable
private fun ResizeLargePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ResizeLarge, contentDescription = null)
    }
}
