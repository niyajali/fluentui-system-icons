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

public val FluentIcons.Filled.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) {
            return _Accessibility!!
        }
        _Accessibility = ImageVector.Builder(
            name = "Filled.Accessibility",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(13.243f, 6.5f, 14.25f, 5.493f, 14.25f, 4.25f)
                curveTo(14.25f, 3.007f, 13.243f, 2f, 12f, 2f)
                curveTo(10.757f, 2f, 9.75f, 3.007f, 9.75f, 4.25f)
                curveTo(9.75f, 5.493f, 10.757f, 6.5f, 12f, 6.5f)
                close()
                moveTo(6.15f, 4.178f)
                curveTo(5.007f, 3.693f, 3.682f, 4.222f, 3.188f, 5.362f)
                curveTo(2.693f, 6.505f, 3.222f, 7.829f, 4.369f, 8.316f)
                lineTo(7.393f, 9.6f)
                curveTo(7.762f, 9.756f, 8.002f, 10.119f, 8.002f, 10.52f)
                verticalLineTo(13.56f)
                lineTo(6.123f, 19.017f)
                curveTo(5.719f, 20.192f, 6.343f, 21.472f, 7.518f, 21.877f)
                curveTo(8.693f, 22.281f, 9.974f, 21.657f, 10.378f, 20.482f)
                lineTo(11.764f, 16.458f)
                curveTo(11.841f, 16.233f, 12.159f, 16.233f, 12.236f, 16.458f)
                lineTo(13.622f, 20.482f)
                curveTo(14.026f, 21.657f, 15.307f, 22.281f, 16.482f, 21.877f)
                curveTo(17.657f, 21.472f, 18.281f, 20.192f, 17.877f, 19.017f)
                lineTo(16.002f, 13.56f)
                verticalLineTo(10.518f)
                curveTo(16.002f, 10.117f, 16.242f, 9.754f, 16.612f, 9.598f)
                lineTo(19.63f, 8.316f)
                curveTo(20.778f, 7.829f, 21.307f, 6.505f, 20.812f, 5.362f)
                curveTo(20.318f, 4.222f, 18.993f, 3.693f, 17.85f, 4.178f)
                lineTo(16.244f, 4.86f)
                curveTo(15.903f, 5.004f, 15.666f, 5.283f, 15.549f, 5.591f)
                curveTo(15.007f, 7.025f, 13.622f, 8.043f, 12f, 8.043f)
                curveTo(10.378f, 8.043f, 8.993f, 7.025f, 8.451f, 5.591f)
                curveTo(8.334f, 5.283f, 8.097f, 5.004f, 7.756f, 4.86f)
                lineTo(6.15f, 4.178f)
                close()
            }
        }.build()

        return _Accessibility!!
    }

@Suppress("ObjectPropertyName")
private var _Accessibility: ImageVector? = null

@Preview
@Composable
private fun AccessibilityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Accessibility, contentDescription = null)
    }
}
