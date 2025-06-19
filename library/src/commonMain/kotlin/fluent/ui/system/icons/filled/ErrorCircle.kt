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

public val FluentIcons.Filled.ErrorCircle: ImageVector
    get() {
        if (_ErrorCircle != null) {
            return _ErrorCircle!!
        }
        _ErrorCircle = ImageVector.Builder(
            name = "Filled.ErrorCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.478f, 22f, 12f)
                curveTo(22f, 17.522f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.522f, 2f, 12f)
                curveTo(2f, 6.478f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(12.002f, 15.004f)
                curveTo(11.45f, 15.004f, 11.003f, 15.451f, 11.003f, 16.002f)
                curveTo(11.003f, 16.554f, 11.45f, 17.001f, 12.002f, 17.001f)
                curveTo(12.553f, 17.001f, 13f, 16.554f, 13f, 16.002f)
                curveTo(13f, 15.451f, 12.553f, 15.004f, 12.002f, 15.004f)
                close()
                moveTo(12f, 7f)
                curveTo(11.487f, 7f, 11.064f, 7.386f, 11.007f, 7.884f)
                lineTo(11f, 8f)
                lineTo(11.002f, 13.001f)
                lineTo(11.009f, 13.118f)
                curveTo(11.066f, 13.615f, 11.489f, 14.001f, 12.002f, 14.001f)
                curveTo(12.515f, 14.001f, 12.938f, 13.615f, 12.995f, 13.117f)
                lineTo(13.002f, 13f)
                lineTo(13f, 8f)
                lineTo(12.993f, 7.883f)
                curveTo(12.935f, 7.386f, 12.512f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _ErrorCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ErrorCircle: ImageVector? = null

@Preview
@Composable
private fun ErrorCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ErrorCircle, contentDescription = null)
    }
}
