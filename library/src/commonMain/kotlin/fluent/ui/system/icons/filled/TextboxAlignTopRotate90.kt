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

public val FluentIcons.Filled.TextboxAlignTopRotate90: ImageVector
    get() {
        if (_TextboxAlignTopRotate90 != null) {
            return _TextboxAlignTopRotate90!!
        }
        _TextboxAlignTopRotate90 = ImageVector.Builder(
            name = "Filled.TextboxAlignTopRotate90",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                lineTo(5.75f, 3f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                lineTo(3f, 18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(17f, 7.25f)
                lineTo(17f, 16.75f)
                curveTo(17f, 17.164f, 16.664f, 17.5f, 16.25f, 17.5f)
                curveTo(15.836f, 17.5f, 15.5f, 17.164f, 15.5f, 16.75f)
                lineTo(15.5f, 7.25f)
                curveTo(15.5f, 6.836f, 15.836f, 6.5f, 16.25f, 6.5f)
                curveTo(16.664f, 6.5f, 17f, 6.836f, 17f, 7.25f)
                close()
                moveTo(13f, 7.25f)
                lineTo(13f, 16.75f)
                curveTo(13f, 17.164f, 12.664f, 17.5f, 12.25f, 17.5f)
                curveTo(11.836f, 17.5f, 11.5f, 17.164f, 11.5f, 16.75f)
                lineTo(11.5f, 7.25f)
                curveTo(11.5f, 6.836f, 11.836f, 6.5f, 12.25f, 6.5f)
                curveTo(12.664f, 6.5f, 13f, 6.836f, 13f, 7.25f)
                close()
            }
        }.build()

        return _TextboxAlignTopRotate90!!
    }

@Suppress("ObjectPropertyName")
private var _TextboxAlignTopRotate90: ImageVector? = null

@Preview
@Composable
private fun TextboxAlignTopRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextboxAlignTopRotate90, contentDescription = null)
    }
}
