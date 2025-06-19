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

public val FluentIcons.Regular.TextBulletListTree: ImageVector
    get() {
        if (_TextBulletListTree != null) {
            return _TextBulletListTree!!
        }
        _TextBulletListTree = ImageVector.Builder(
            name = "Regular.TextBulletListTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.249f, 17.5f)
                curveTo(7.939f, 17.5f, 8.499f, 18.059f, 8.499f, 18.749f)
                curveTo(8.499f, 19.439f, 7.939f, 19.999f, 7.249f, 19.999f)
                curveTo(6.559f, 19.999f, 6f, 19.439f, 6f, 18.749f)
                curveTo(6f, 18.059f, 6.559f, 17.5f, 7.249f, 17.5f)
                close()
                moveTo(10.75f, 18f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 18f, 22f, 18.336f, 22f, 18.75f)
                curveTo(22f, 19.13f, 21.718f, 19.444f, 21.352f, 19.493f)
                lineTo(21.25f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 19.5f, 10f, 19.164f, 10f, 18.75f)
                curveTo(10f, 18.37f, 10.282f, 18.056f, 10.648f, 18.007f)
                lineTo(10.75f, 18f)
                horizontalLineTo(21.25f)
                horizontalLineTo(10.75f)
                close()
                moveTo(3.249f, 11f)
                curveTo(3.939f, 11f, 4.499f, 11.559f, 4.499f, 12.249f)
                curveTo(4.499f, 12.939f, 3.939f, 13.499f, 3.249f, 13.499f)
                curveTo(2.559f, 13.499f, 2f, 12.939f, 2f, 12.249f)
                curveTo(2f, 11.559f, 2.559f, 11f, 3.249f, 11f)
                close()
                moveTo(6.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.5f, 22f, 11.836f, 22f, 12.25f)
                curveTo(22f, 12.63f, 21.718f, 12.943f, 21.352f, 12.993f)
                lineTo(21.25f, 13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
                curveTo(6f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
                lineTo(6.75f, 11.5f)
                horizontalLineTo(21.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(3.249f, 4.5f)
                curveTo(3.939f, 4.5f, 4.499f, 5.059f, 4.499f, 5.749f)
                curveTo(4.499f, 6.439f, 3.939f, 6.999f, 3.249f, 6.999f)
                curveTo(2.559f, 6.999f, 2f, 6.439f, 2f, 5.749f)
                curveTo(2f, 5.059f, 2.559f, 4.5f, 3.249f, 4.5f)
                close()
                moveTo(6.75f, 5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
                curveTo(22f, 6.13f, 21.718f, 6.443f, 21.352f, 6.493f)
                lineTo(21.25f, 6.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 6.5f, 6f, 6.164f, 6f, 5.75f)
                curveTo(6f, 5.37f, 6.282f, 5.057f, 6.648f, 5.007f)
                lineTo(6.75f, 5f)
                horizontalLineTo(21.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()

        return _TextBulletListTree!!
    }

@Suppress("ObjectPropertyName")
private var _TextBulletListTree: ImageVector? = null

@Preview
@Composable
private fun TextBulletListTreePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletListTree, contentDescription = null)
    }
}
