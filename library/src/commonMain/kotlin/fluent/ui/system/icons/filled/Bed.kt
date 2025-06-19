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

public val FluentIcons.Filled.Bed: ImageVector
    get() {
        if (_Bed != null) {
            return _Bed!!
        }
        _Bed = ImageVector.Builder(
            name = "Filled.Bed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.25f, 11f)
                curveTo(20.712f, 11f, 21.908f, 12.142f, 21.995f, 13.583f)
                lineTo(22f, 13.75f)
                verticalLineTo(20.25f)
                curveTo(22f, 20.664f, 21.664f, 21f, 21.25f, 21f)
                curveTo(20.87f, 21f, 20.556f, 20.718f, 20.507f, 20.352f)
                lineTo(20.5f, 20.25f)
                verticalLineTo(18f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.63f, 3.218f, 20.944f, 2.852f, 20.993f)
                lineTo(2.75f, 21f)
                curveTo(2.37f, 21f, 2.057f, 20.718f, 2.007f, 20.352f)
                lineTo(2f, 20.25f)
                verticalLineTo(13.75f)
                curveTo(2f, 12.288f, 3.142f, 11.092f, 4.582f, 11.005f)
                lineTo(4.75f, 11f)
                horizontalLineTo(19.25f)
                close()
                moveTo(6.75f, 4f)
                horizontalLineTo(17.25f)
                curveTo(18.712f, 4f, 19.908f, 5.142f, 19.995f, 6.582f)
                lineTo(20f, 6.75f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                lineTo(16.993f, 9.883f)
                curveTo(16.94f, 9.424f, 16.576f, 9.06f, 16.117f, 9.007f)
                lineTo(16f, 9f)
                horizontalLineTo(14f)
                curveTo(13.487f, 9f, 13.064f, 9.386f, 13.007f, 9.883f)
                lineTo(13f, 10f)
                horizontalLineTo(11f)
                lineTo(10.993f, 9.883f)
                curveTo(10.94f, 9.424f, 10.576f, 9.06f, 10.117f, 9.007f)
                lineTo(10f, 9f)
                horizontalLineTo(8f)
                curveTo(7.487f, 9f, 7.064f, 9.386f, 7.007f, 9.883f)
                lineTo(7f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(6.75f)
                curveTo(4f, 5.287f, 5.142f, 4.092f, 6.582f, 4.005f)
                lineTo(6.75f, 4f)
                close()
            }
        }.build()

        return _Bed!!
    }

@Suppress("ObjectPropertyName")
private var _Bed: ImageVector? = null

@Preview
@Composable
private fun BedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Bed, contentDescription = null)
    }
}
