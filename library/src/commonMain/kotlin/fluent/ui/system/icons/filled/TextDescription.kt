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

public val FluentIcons.Filled.TextDescription: ImageVector
    get() {
        if (_TextDescription != null) {
            return _TextDescription!!
        }
        _TextDescription = ImageVector.Builder(
            name = "Filled.TextDescription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17f)
                horizontalLineTo(15f)
                curveTo(15.552f, 17f, 16f, 17.448f, 16f, 18f)
                curveTo(16f, 18.513f, 15.614f, 18.935f, 15.117f, 18.993f)
                lineTo(15f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
                lineTo(3f, 17f)
                horizontalLineTo(15f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
                curveTo(22f, 14.513f, 21.614f, 14.936f, 21.117f, 14.993f)
                lineTo(21f, 15f)
                horizontalLineTo(3f)
                curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
                curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
                lineTo(3f, 13f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 9f)
                horizontalLineTo(21f)
                curveTo(21.552f, 9f, 22f, 9.448f, 22f, 10f)
                curveTo(22f, 10.513f, 21.614f, 10.936f, 21.117f, 10.993f)
                lineTo(21f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
                lineTo(3f, 9f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
                lineTo(21f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
                lineTo(3f, 5f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TextDescription!!
    }

@Suppress("ObjectPropertyName")
private var _TextDescription: ImageVector? = null

@Preview
@Composable
private fun TextDescriptionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDescription, contentDescription = null)
    }
}
