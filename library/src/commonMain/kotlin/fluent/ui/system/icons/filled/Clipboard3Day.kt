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

public val FluentIcons.Filled.Clipboard3Day: ImageVector
    get() {
        if (_Clipboard3Day != null) {
            return _Clipboard3Day!!
        }
        _Clipboard3Day = ImageVector.Builder(
            name = "Filled.Clipboard3Day",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
                lineTo(6.25f, 4f)
                curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
                lineTo(15.986f, 3.999f)
                curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
                curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
                curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(8f, 17.25f)
                lineTo(8f, 9.75f)
                curveTo(8f, 9.336f, 8.336f, 9f, 8.75f, 9f)
                curveTo(9.164f, 9f, 9.5f, 9.336f, 9.5f, 9.75f)
                lineTo(9.5f, 17.25f)
                curveTo(9.5f, 17.664f, 9.164f, 18f, 8.75f, 18f)
                curveTo(8.336f, 18f, 8f, 17.664f, 8f, 17.25f)
                close()
                moveTo(15.25f, 18f)
                curveTo(14.836f, 18f, 14.5f, 17.664f, 14.5f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(14.5f, 9.336f, 14.836f, 9f, 15.25f, 9f)
                curveTo(15.664f, 9f, 16f, 9.336f, 16f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(16f, 17.664f, 15.664f, 18f, 15.25f, 18f)
                close()
                moveTo(11.25f, 17.25f)
                lineTo(11.25f, 9.75f)
                curveTo(11.25f, 9.336f, 11.586f, 9f, 12f, 9f)
                curveTo(12.414f, 9f, 12.75f, 9.336f, 12.75f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(12.75f, 17.664f, 12.414f, 18f, 12f, 18f)
                curveTo(11.586f, 18f, 11.25f, 17.664f, 11.25f, 17.25f)
                close()
            }
        }.build()

        return _Clipboard3Day!!
    }

@Suppress("ObjectPropertyName")
private var _Clipboard3Day: ImageVector? = null

@Preview
@Composable
private fun Clipboard3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Clipboard3Day, contentDescription = null)
    }
}
