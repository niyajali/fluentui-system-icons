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

public val FluentIcons.Filled.AddSquareMultiple: ImageVector
    get() {
        if (_AddSquareMultiple != null) {
            return _AddSquareMultiple!!
        }
        _AddSquareMultiple = ImageVector.Builder(
            name = "Filled.AddSquareMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.25f)
                curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
                horizontalLineTo(16.25f)
                curveTo(17.493f, 3f, 18.5f, 4.007f, 18.5f, 5.25f)
                verticalLineTo(16.25f)
                curveTo(18.5f, 17.493f, 17.493f, 18.5f, 16.25f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 18.5f, 3f, 17.493f, 3f, 16.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(11.5f, 7.25f)
                curveTo(11.5f, 6.836f, 11.164f, 6.5f, 10.75f, 6.5f)
                curveTo(10.336f, 6.5f, 10f, 6.836f, 10f, 7.25f)
                verticalLineTo(10f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 10f, 6.5f, 10.336f, 6.5f, 10.75f)
                curveTo(6.5f, 11.164f, 6.836f, 11.5f, 7.25f, 11.5f)
                horizontalLineTo(10f)
                verticalLineTo(14.25f)
                curveTo(10f, 14.664f, 10.336f, 15f, 10.75f, 15f)
                curveTo(11.164f, 15f, 11.5f, 14.664f, 11.5f, 14.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 11.5f, 15f, 11.164f, 15f, 10.75f)
                curveTo(15f, 10.336f, 14.664f, 10f, 14.25f, 10f)
                horizontalLineTo(11.5f)
                verticalLineTo(7.25f)
                close()
                moveTo(7.75f, 21f)
                curveTo(6.77f, 21f, 5.937f, 20.374f, 5.628f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(18.045f, 19.5f, 19.5f, 18.045f, 19.5f, 16.25f)
                verticalLineTo(5.628f)
                curveTo(20.374f, 5.937f, 21f, 6.77f, 21f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(21f, 18.873f, 18.873f, 21f, 16.25f, 21f)
                horizontalLineTo(7.75f)
                close()
            }
        }.build()

        return _AddSquareMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _AddSquareMultiple: ImageVector? = null

@Preview
@Composable
private fun AddSquareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AddSquareMultiple, contentDescription = null)
    }
}
