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

public val FluentIcons.Regular.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Regular.Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.066f, 18.943f)
                lineTo(14.566f, 4.443f)
                curveTo(14.735f, 4.065f, 15.179f, 3.896f, 15.557f, 4.066f)
                curveTo(15.903f, 4.221f, 16.074f, 4.607f, 15.97f, 4.961f)
                lineTo(15.934f, 5.057f)
                lineTo(9.434f, 19.557f)
                curveTo(9.265f, 19.935f, 8.821f, 20.104f, 8.443f, 19.935f)
                curveTo(8.097f, 19.779f, 7.926f, 19.393f, 8.03f, 19.039f)
                lineTo(8.066f, 18.943f)
                lineTo(14.566f, 4.443f)
                lineTo(8.066f, 18.943f)
                close()
                moveTo(2.22f, 11.47f)
                lineTo(6.47f, 7.22f)
                curveTo(6.763f, 6.927f, 7.237f, 6.927f, 7.53f, 7.22f)
                curveTo(7.797f, 7.486f, 7.821f, 7.903f, 7.603f, 8.196f)
                lineTo(7.53f, 8.281f)
                lineTo(3.811f, 12f)
                lineTo(7.53f, 15.72f)
                curveTo(7.823f, 16.013f, 7.823f, 16.488f, 7.53f, 16.781f)
                curveTo(7.264f, 17.047f, 6.847f, 17.071f, 6.554f, 16.853f)
                lineTo(6.47f, 16.781f)
                lineTo(2.22f, 12.531f)
                curveTo(1.953f, 12.264f, 1.929f, 11.848f, 2.147f, 11.554f)
                lineTo(2.22f, 11.47f)
                lineTo(6.47f, 7.22f)
                lineTo(2.22f, 11.47f)
                close()
                moveTo(16.47f, 7.22f)
                curveTo(16.736f, 6.954f, 17.153f, 6.929f, 17.446f, 7.147f)
                lineTo(17.53f, 7.22f)
                lineTo(21.78f, 11.47f)
                curveTo(22.047f, 11.736f, 22.071f, 12.153f, 21.853f, 12.446f)
                lineTo(21.78f, 12.531f)
                lineTo(17.53f, 16.781f)
                curveTo(17.237f, 17.073f, 16.763f, 17.073f, 16.47f, 16.781f)
                curveTo(16.203f, 16.514f, 16.179f, 16.098f, 16.397f, 15.804f)
                lineTo(16.47f, 15.72f)
                lineTo(20.189f, 12f)
                lineTo(16.47f, 8.281f)
                curveTo(16.177f, 7.988f, 16.177f, 7.513f, 16.47f, 7.22f)
                close()
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null

@Preview
@Composable
private fun CodePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Code, contentDescription = null)
    }
}
