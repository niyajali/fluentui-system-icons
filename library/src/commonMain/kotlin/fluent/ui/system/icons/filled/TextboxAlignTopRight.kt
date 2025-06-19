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

public val FluentIcons.Filled.TextboxAlignTopRight: ImageVector
    get() {
        if (_TextboxAlignTopRight != null) {
            return _TextboxAlignTopRight!!
        }
        _TextboxAlignTopRight = ImageVector.Builder(
            name = "Filled.TextboxAlignTopRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 3f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(5.75f)
                close()
                moveTo(16.75f, 7f)
                curveTo(17.164f, 7f, 17.5f, 7.336f, 17.5f, 7.75f)
                curveTo(17.5f, 8.164f, 17.164f, 8.5f, 16.75f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 8.5f, 6.5f, 8.164f, 6.5f, 7.75f)
                curveTo(6.5f, 7.336f, 6.836f, 7f, 7.25f, 7f)
                horizontalLineTo(16.75f)
                close()
                moveTo(16.75f, 11f)
                curveTo(17.164f, 11f, 17.5f, 11.336f, 17.5f, 11.75f)
                curveTo(17.5f, 12.164f, 17.164f, 12.5f, 16.75f, 12.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 12.5f, 9.5f, 12.164f, 9.5f, 11.75f)
                curveTo(9.5f, 11.336f, 9.836f, 11f, 10.25f, 11f)
                horizontalLineTo(16.75f)
                close()
            }
        }.build()

        return _TextboxAlignTopRight!!
    }

@Suppress("ObjectPropertyName")
private var _TextboxAlignTopRight: ImageVector? = null

@Preview
@Composable
private fun TextboxAlignTopRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextboxAlignTopRight, contentDescription = null)
    }
}
