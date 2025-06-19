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

public val FluentIcons.Filled.SignOut: ImageVector
    get() {
        if (_SignOut != null) {
            return _SignOut!!
        }
        _SignOut = ImageVector.Builder(
            name = "Filled.SignOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.354f)
                verticalLineTo(10.5f)
                lineTo(12f, 11.005f)
                lineTo(19.442f, 11.003f)
                lineTo(17.72f, 9.28f)
                curveTo(17.453f, 9.013f, 17.429f, 8.597f, 17.647f, 8.303f)
                lineTo(17.72f, 8.219f)
                curveTo(17.986f, 7.953f, 18.403f, 7.929f, 18.696f, 8.147f)
                lineTo(18.78f, 8.219f)
                lineTo(21.777f, 11.217f)
                curveTo(22.043f, 11.483f, 22.067f, 11.899f, 21.85f, 12.193f)
                lineTo(21.778f, 12.277f)
                lineTo(18.781f, 15.28f)
                curveTo(18.488f, 15.574f, 18.014f, 15.574f, 17.72f, 15.282f)
                curveTo(17.454f, 15.016f, 17.429f, 14.599f, 17.646f, 14.305f)
                lineTo(17.719f, 14.221f)
                lineTo(19.432f, 12.503f)
                lineTo(12f, 12.505f)
                lineTo(12f, 19.25f)
                curveTo(12f, 19.716f, 11.579f, 20.069f, 11.12f, 19.988f)
                lineTo(2.62f, 18.487f)
                curveTo(2.261f, 18.424f, 2f, 18.112f, 2f, 17.748f)
                verticalLineTo(5.75f)
                curveTo(2f, 5.382f, 2.266f, 5.069f, 2.628f, 5.009f)
                lineTo(11.128f, 3.614f)
                curveTo(11.585f, 3.539f, 12f, 3.891f, 12f, 4.354f)
                close()
                moveTo(8.502f, 11.5f)
                curveTo(7.949f, 11.5f, 7.5f, 11.948f, 7.5f, 12.502f)
                curveTo(7.5f, 13.055f, 7.949f, 13.504f, 8.502f, 13.504f)
                curveTo(9.056f, 13.504f, 9.504f, 13.055f, 9.504f, 12.502f)
                curveTo(9.504f, 11.948f, 9.056f, 11.5f, 8.502f, 11.5f)
                close()
                moveTo(13f, 18.501f)
                lineTo(13.765f, 18.501f)
                lineTo(13.867f, 18.494f)
                curveTo(14.233f, 18.444f, 14.516f, 18.13f, 14.515f, 17.75f)
                lineTo(14.508f, 13.5f)
                horizontalLineTo(13f)
                verticalLineTo(18.501f)
                close()
                moveTo(13.002f, 10f)
                lineTo(13f, 8.725f)
                verticalLineTo(5f)
                lineTo(13.745f, 5f)
                curveTo(14.125f, 5f, 14.438f, 5.281f, 14.488f, 5.647f)
                lineTo(14.495f, 5.748f)
                lineTo(14.502f, 10f)
                horizontalLineTo(13.002f)
                close()
            }
        }.build()

        return _SignOut!!
    }

@Suppress("ObjectPropertyName")
private var _SignOut: ImageVector? = null

@Preview
@Composable
private fun SignOutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SignOut, contentDescription = null)
    }
}
