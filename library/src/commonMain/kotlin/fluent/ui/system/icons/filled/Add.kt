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

public val FluentIcons.Filled.Add: ImageVector
    get() {
        if (_Add != null) {
            return _Add!!
        }
        _Add = ImageVector.Builder(
            name = "Filled.Add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.883f, 3.007f)
                lineTo(12f, 3f)
                curveTo(12.513f, 3f, 12.936f, 3.386f, 12.993f, 3.883f)
                lineTo(13f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                curveTo(20.513f, 11f, 20.935f, 11.386f, 20.993f, 11.883f)
                lineTo(21f, 12f)
                curveTo(21f, 12.513f, 20.614f, 12.936f, 20.117f, 12.993f)
                lineTo(20f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                curveTo(13f, 20.513f, 12.614f, 20.935f, 12.117f, 20.993f)
                lineTo(12f, 21f)
                curveTo(11.487f, 21f, 11.064f, 20.614f, 11.007f, 20.117f)
                lineTo(11f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                curveTo(3.487f, 13f, 3.064f, 12.614f, 3.007f, 12.117f)
                lineTo(3f, 12f)
                curveTo(3f, 11.487f, 3.386f, 11.064f, 3.883f, 11.007f)
                lineTo(4f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                curveTo(11f, 3.487f, 11.386f, 3.064f, 11.883f, 3.007f)
                lineTo(12f, 3f)
                lineTo(11.883f, 3.007f)
                close()
            }
        }.build()

        return _Add!!
    }

@Suppress("ObjectPropertyName")
private var _Add: ImageVector? = null

@Preview
@Composable
private fun AddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Add, contentDescription = null)
    }
}
