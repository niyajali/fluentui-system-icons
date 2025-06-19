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

public val FluentIcons.Filled.UsbStick: ImageVector
    get() {
        if (_UsbStick != null) {
            return _UsbStick!!
        }
        _UsbStick = ImageVector.Builder(
            name = "Filled.UsbStick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.267f, 1.997f)
                curveTo(15.647f, 1.997f, 15.961f, 2.279f, 16.01f, 2.645f)
                lineTo(16.017f, 2.747f)
                lineTo(16.018f, 7.133f)
                curveTo(16.833f, 7.427f, 17.43f, 8.179f, 17.498f, 9.079f)
                lineTo(17.504f, 9.25f)
                verticalLineTo(19.75f)
                curveTo(17.504f, 20.941f, 16.579f, 21.915f, 15.408f, 21.995f)
                lineTo(15.254f, 22f)
                horizontalLineTo(8.754f)
                curveTo(7.563f, 22f, 6.589f, 21.075f, 6.509f, 19.904f)
                lineTo(6.504f, 19.75f)
                verticalLineTo(9.25f)
                curveTo(6.504f, 8.265f, 7.136f, 7.428f, 8.017f, 7.123f)
                lineTo(8.016f, 2.747f)
                curveTo(8.016f, 2.367f, 8.299f, 2.054f, 8.665f, 2.004f)
                lineTo(8.766f, 1.997f)
                horizontalLineTo(15.267f)
                close()
                moveTo(14.517f, 3.497f)
                horizontalLineTo(9.516f)
                verticalLineTo(6.999f)
                horizontalLineTo(14.517f)
                verticalLineTo(3.497f)
                close()
            }
        }.build()

        return _UsbStick!!
    }

@Suppress("ObjectPropertyName")
private var _UsbStick: ImageVector? = null

@Preview
@Composable
private fun UsbStickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.UsbStick, contentDescription = null)
    }
}
