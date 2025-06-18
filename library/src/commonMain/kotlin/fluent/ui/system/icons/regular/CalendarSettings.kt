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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CalendarSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11.314f)
            curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(14.281f, 13.976f)
            curveTo(14.596f, 15.066f, 13.941f, 16.199f, 12.84f, 16.472f)
            lineTo(12.256f, 16.617f)
            curveTo(12.211f, 16.904f, 12.188f, 17.199f, 12.188f, 17.5f)
            curveTo(12.188f, 17.815f, 12.213f, 18.124f, 12.262f, 18.424f)
            lineTo(12.802f, 18.554f)
            curveTo(13.914f, 18.822f, 14.575f, 19.967f, 14.252f, 21.064f)
            lineTo(14.065f, 21.695f)
            curveTo(14.504f, 22.081f, 15.005f, 22.394f, 15.549f, 22.617f)
            lineTo(16.043f, 22.098f)
            curveTo(16.831f, 21.269f, 18.153f, 21.269f, 18.942f, 22.099f)
            lineTo(19.441f, 22.624f)
            curveTo(19.984f, 22.403f, 20.484f, 22.093f, 20.923f, 21.711f)
            lineTo(20.725f, 21.025f)
            curveTo(20.41f, 19.934f, 21.065f, 18.801f, 22.167f, 18.528f)
            lineTo(22.75f, 18.384f)
            curveTo(22.795f, 18.096f, 22.818f, 17.801f, 22.818f, 17.5f)
            curveTo(22.818f, 17.186f, 22.793f, 16.877f, 22.744f, 16.577f)
            lineTo(22.205f, 16.447f)
            curveTo(21.092f, 16.179f, 20.431f, 15.034f, 20.755f, 13.936f)
            lineTo(20.941f, 13.306f)
            curveTo(20.502f, 12.92f, 20.001f, 12.607f, 19.457f, 12.384f)
            lineTo(18.964f, 12.902f)
            curveTo(18.175f, 13.732f, 16.853f, 13.731f, 16.065f, 12.902f)
            lineTo(15.566f, 12.377f)
            curveTo(15.022f, 12.597f, 14.522f, 12.907f, 14.083f, 13.29f)
            lineTo(14.281f, 13.976f)
            close()
            moveTo(17.503f, 19f)
            curveTo(16.702f, 19f, 16.053f, 18.329f, 16.053f, 17.5f)
            curveTo(16.053f, 16.672f, 16.702f, 16f, 17.503f, 16f)
            curveTo(18.304f, 16f, 18.953f, 16.672f, 18.953f, 17.5f)
            curveTo(18.953f, 18.329f, 18.304f, 19f, 17.503f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarSettings, contentDescription = null)
    }
}
