package fluent.ui.system.icons.light

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

public val FluentIcons.Light.EyeOff: ImageVector
    get() {
        if (_EyeOff != null) {
            return _EyeOff!!
        }
        _EyeOff = ImageVector.Builder(
            name = "Light.EyeOff",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.523f, 21.937f)
                lineTo(28.293f, 29.707f)
                curveTo(28.683f, 30.098f, 29.317f, 30.098f, 29.707f, 29.707f)
                curveTo(30.098f, 29.317f, 30.098f, 28.683f, 29.707f, 28.293f)
                lineTo(3.707f, 2.293f)
                curveTo(3.316f, 1.903f, 2.683f, 1.903f, 2.293f, 2.293f)
                curveTo(1.902f, 2.684f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(7.449f, 8.864f)
                curveTo(3.333f, 12.145f, 2.08f, 17.106f, 2.011f, 17.379f)
                lineTo(2.008f, 17.39f)
                curveTo(1.948f, 17.66f, 2.118f, 17.93f, 2.388f, 17.99f)
                curveTo(2.658f, 18.05f, 2.928f, 17.88f, 2.988f, 17.61f)
                curveTo(3.056f, 17.32f, 4.192f, 12.595f, 8.134f, 9.549f)
                lineTo(12.061f, 13.475f)
                curveTo(10.797f, 14.576f, 9.998f, 16.196f, 9.998f, 18f)
                curveTo(9.998f, 21.31f, 12.688f, 24f, 15.998f, 24f)
                curveTo(17.802f, 24f, 19.423f, 23.201f, 20.523f, 21.937f)
                close()
                moveTo(19.815f, 21.229f)
                curveTo(18.897f, 22.312f, 17.528f, 23f, 15.998f, 23f)
                curveTo(13.238f, 23f, 10.998f, 20.76f, 10.998f, 18f)
                curveTo(10.998f, 16.471f, 11.686f, 15.101f, 12.769f, 14.184f)
                lineTo(19.815f, 21.229f)
                close()
                moveTo(15.553f, 12.016f)
                lineTo(16.569f, 13.032f)
                curveTo(18.873f, 13.294f, 20.704f, 15.125f, 20.966f, 17.429f)
                lineTo(21.982f, 18.445f)
                curveTo(21.993f, 18.298f, 21.998f, 18.15f, 21.998f, 18f)
                curveTo(21.998f, 14.69f, 19.308f, 12f, 15.998f, 12f)
                curveTo(15.848f, 12f, 15.7f, 12.005f, 15.553f, 12.016f)
                close()
                moveTo(10.562f, 7.026f)
                lineTo(11.323f, 7.787f)
                curveTo(12.668f, 7.295f, 14.217f, 7f, 15.998f, 7f)
                curveTo(26.458f, 7f, 28.908f, 17.18f, 29.008f, 17.61f)
                curveTo(29.068f, 17.84f, 29.268f, 18f, 29.498f, 18f)
                curveTo(29.512f, 18f, 29.528f, 17.998f, 29.545f, 17.996f)
                curveTo(29.565f, 17.993f, 29.587f, 17.99f, 29.608f, 17.99f)
                curveTo(29.878f, 17.93f, 30.048f, 17.66f, 29.988f, 17.39f)
                lineTo(29.987f, 17.386f)
                curveTo(29.921f, 17.117f, 27.191f, 6f, 15.998f, 6f)
                curveTo(13.902f, 6f, 12.103f, 6.39f, 10.562f, 7.026f)
                close()
            }
        }.build()

        return _EyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _EyeOff: ImageVector? = null

@Preview
@Composable
private fun EyeOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.EyeOff, contentDescription = null)
    }
}
