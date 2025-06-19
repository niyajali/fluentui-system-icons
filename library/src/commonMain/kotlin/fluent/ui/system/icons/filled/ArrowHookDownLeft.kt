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

public val FluentIcons.Filled.ArrowHookDownLeft: ImageVector
    get() {
        if (_ArrowHookDownLeft != null) {
            return _ArrowHookDownLeft!!
        }
        _ArrowHookDownLeft = ImageVector.Builder(
            name = "Filled.ArrowHookDownLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 5f)
                curveTo(7f, 4.448f, 7.448f, 4f, 8f, 4f)
                horizontalLineTo(13f)
                curveTo(15.242f, 4f, 17.011f, 4.778f, 18.218f, 6.023f)
                curveTo(19.414f, 7.256f, 20f, 8.887f, 20f, 10.5f)
                curveTo(20f, 12.113f, 19.414f, 13.744f, 18.218f, 14.977f)
                curveTo(17.011f, 16.222f, 15.242f, 17f, 13f, 17f)
                horizontalLineTo(8.414f)
                lineTo(10.457f, 19.043f)
                curveTo(10.848f, 19.433f, 10.848f, 20.067f, 10.457f, 20.457f)
                curveTo(10.067f, 20.848f, 9.433f, 20.848f, 9.043f, 20.457f)
                lineTo(5.293f, 16.707f)
                curveTo(4.902f, 16.317f, 4.902f, 15.683f, 5.293f, 15.293f)
                lineTo(9.043f, 11.543f)
                curveTo(9.433f, 11.152f, 10.067f, 11.152f, 10.457f, 11.543f)
                curveTo(10.848f, 11.933f, 10.848f, 12.567f, 10.457f, 12.957f)
                lineTo(8.414f, 15f)
                horizontalLineTo(13f)
                curveTo(14.758f, 15f, 15.989f, 14.403f, 16.782f, 13.585f)
                curveTo(17.586f, 12.756f, 18f, 11.637f, 18f, 10.5f)
                curveTo(18f, 9.363f, 17.586f, 8.244f, 16.782f, 7.415f)
                curveTo(15.989f, 6.597f, 14.758f, 6f, 13f, 6f)
                horizontalLineTo(8f)
                curveTo(7.448f, 6f, 7f, 5.552f, 7f, 5f)
                close()
            }
        }.build()

        return _ArrowHookDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowHookDownLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowHookDownLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowHookDownLeft, contentDescription = null)
    }
}
