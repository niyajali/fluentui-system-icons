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

public val FluentIcons.Regular.LocationDismiss: ImageVector
    get() {
        if (_LocationDismiss != null) {
            return _LocationDismiss!!
        }
        _LocationDismiss = ImageVector.Builder(
            name = "Regular.LocationDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.843f, 4.559f)
                curveTo(9.243f, 1.159f, 14.756f, 1.159f, 18.157f, 4.559f)
                curveTo(21.489f, 7.891f, 21.556f, 13.253f, 18.357f, 16.667f)
                lineTo(18.157f, 16.873f)
                curveTo(17.242f, 17.788f, 15.711f, 19.283f, 13.564f, 21.359f)
                curveTo(12.692f, 22.202f, 11.308f, 22.202f, 10.436f, 21.359f)
                lineTo(6.586f, 17.61f)
                curveTo(6.302f, 17.33f, 6.054f, 17.084f, 5.843f, 16.873f)
                curveTo(2.442f, 13.473f, 2.442f, 7.96f, 5.843f, 4.559f)
                close()
                moveTo(17.096f, 5.62f)
                curveTo(14.281f, 2.805f, 9.718f, 2.805f, 6.903f, 5.62f)
                curveTo(4.089f, 8.434f, 4.089f, 12.998f, 6.903f, 15.812f)
                lineTo(8.6f, 17.484f)
                curveTo(9.382f, 18.249f, 10.342f, 19.182f, 11.479f, 20.281f)
                curveTo(11.769f, 20.562f, 12.231f, 20.562f, 12.521f, 20.281f)
                lineTo(15.496f, 17.391f)
                curveTo(16.154f, 16.747f, 16.688f, 16.221f, 17.096f, 15.812f)
                curveTo(19.911f, 12.998f, 19.911f, 8.434f, 17.096f, 5.62f)
                close()
                moveTo(14.946f, 7.613f)
                lineTo(15.03f, 7.686f)
                curveTo(15.296f, 7.952f, 15.321f, 8.369f, 15.103f, 8.662f)
                lineTo(15.03f, 8.746f)
                lineTo(13.061f, 10.716f)
                lineTo(15.03f, 12.686f)
                curveTo(15.296f, 12.952f, 15.321f, 13.369f, 15.103f, 13.662f)
                lineTo(15.03f, 13.746f)
                curveTo(14.764f, 14.013f, 14.347f, 14.037f, 14.054f, 13.819f)
                lineTo(13.969f, 13.746f)
                lineTo(12f, 11.777f)
                lineTo(10.03f, 13.746f)
                curveTo(9.764f, 14.013f, 9.347f, 14.037f, 9.054f, 13.819f)
                lineTo(8.969f, 13.746f)
                curveTo(8.703f, 13.48f, 8.679f, 13.064f, 8.897f, 12.77f)
                lineTo(8.969f, 12.686f)
                lineTo(10.939f, 10.716f)
                lineTo(8.969f, 8.746f)
                curveTo(8.703f, 8.48f, 8.679f, 8.063f, 8.897f, 7.77f)
                lineTo(8.969f, 7.686f)
                curveTo(9.236f, 7.419f, 9.652f, 7.395f, 9.946f, 7.613f)
                lineTo(10.03f, 7.686f)
                lineTo(12f, 9.655f)
                lineTo(13.969f, 7.686f)
                curveTo(14.236f, 7.419f, 14.652f, 7.395f, 14.946f, 7.613f)
                close()
            }
        }.build()

        return _LocationDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _LocationDismiss: ImageVector? = null

@Preview
@Composable
private fun LocationDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationDismiss, contentDescription = null)
    }
}
