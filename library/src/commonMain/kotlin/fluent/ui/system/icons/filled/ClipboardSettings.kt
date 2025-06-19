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

public val FluentIcons.Filled.ClipboardSettings: ImageVector
    get() {
        if (_ClipboardSettings != null) {
            return _ClipboardSettings!!
        }
        _ClipboardSettings = ImageVector.Builder(
            name = "Filled.ClipboardSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.908f, 2f, 15.862f, 2.875f, 15.986f, 3.999f)
                lineTo(17.75f, 4f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(11.498f)
                curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 19.247f, 11.689f, 20.832f, 12.81f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                lineTo(8.014f, 3.999f)
                curveTo(8.138f, 2.875f, 9.092f, 2f, 10.25f, 2f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
                curveTo(9.5f, 4.664f, 9.836f, 5f, 10.25f, 5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 5f, 14.5f, 4.664f, 14.5f, 4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(14.278f, 13.976f)
                curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
                lineTo(12.253f, 16.616f)
                curveTo(12.208f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
                curveTo(12.184f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
                lineTo(12.799f, 18.553f)
                curveTo(13.911f, 18.821f, 14.572f, 19.966f, 14.249f, 21.064f)
                lineTo(14.062f, 21.695f)
                curveTo(14.501f, 22.081f, 15.002f, 22.394f, 15.546f, 22.617f)
                lineTo(16.04f, 22.098f)
                curveTo(16.828f, 21.269f, 18.15f, 21.269f, 18.939f, 22.098f)
                lineTo(19.438f, 22.623f)
                curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
                lineTo(20.722f, 21.024f)
                curveTo(20.407f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
                lineTo(22.747f, 18.384f)
                curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
                curveTo(22.816f, 17.185f, 22.79f, 16.877f, 22.741f, 16.576f)
                lineTo(22.202f, 16.447f)
                curveTo(21.089f, 16.179f, 20.428f, 15.034f, 20.752f, 13.936f)
                lineTo(20.938f, 13.305f)
                curveTo(20.499f, 12.92f, 19.998f, 12.606f, 19.454f, 12.384f)
                lineTo(18.961f, 12.902f)
                curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
                lineTo(15.563f, 12.377f)
                curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
                lineTo(14.278f, 13.976f)
                close()
                moveTo(17.5f, 19f)
                curveTo(16.699f, 19f, 16.05f, 18.328f, 16.05f, 17.5f)
                curveTo(16.05f, 16.672f, 16.699f, 16f, 17.5f, 16f)
                curveTo(18.301f, 16f, 18.95f, 16.672f, 18.95f, 17.5f)
                curveTo(18.95f, 18.328f, 18.301f, 19f, 17.5f, 19f)
                close()
            }
        }.build()

        return _ClipboardSettings!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardSettings: ImageVector? = null

@Preview
@Composable
private fun ClipboardSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardSettings, contentDescription = null)
    }
}
