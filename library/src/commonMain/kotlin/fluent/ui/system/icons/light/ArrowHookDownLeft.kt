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

public val FluentIcons.Light.ArrowHookDownLeft: ImageVector
    get() {
        if (_ArrowHookDownLeft != null) {
            return _ArrowHookDownLeft!!
        }
        _ArrowHookDownLeft = ImageVector.Builder(
            name = "Light.ArrowHookDownLeft",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.854f, 26.854f)
                curveTo(13.049f, 26.658f, 13.049f, 26.342f, 12.854f, 26.146f)
                lineTo(7.707f, 21f)
                horizontalLineTo(19f)
                curveTo(22.866f, 21f, 26f, 17.866f, 26f, 14f)
                curveTo(26f, 10.134f, 22.866f, 7f, 19f, 7f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 7f, 9f, 7.224f, 9f, 7.5f)
                curveTo(9f, 7.776f, 9.224f, 8f, 9.5f, 8f)
                horizontalLineTo(19f)
                curveTo(22.314f, 8f, 25f, 10.686f, 25f, 14f)
                curveTo(25f, 17.314f, 22.314f, 20f, 19f, 20f)
                horizontalLineTo(7.707f)
                lineTo(12.854f, 14.854f)
                curveTo(13.049f, 14.658f, 13.049f, 14.342f, 12.854f, 14.146f)
                curveTo(12.658f, 13.951f, 12.342f, 13.951f, 12.146f, 14.146f)
                lineTo(6.146f, 20.146f)
                curveTo(6.053f, 20.24f, 6f, 20.367f, 6f, 20.5f)
                curveTo(6f, 20.633f, 6.053f, 20.76f, 6.146f, 20.854f)
                lineTo(12.146f, 26.854f)
                curveTo(12.342f, 27.049f, 12.658f, 27.049f, 12.854f, 26.854f)
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
        Image(imageVector = FluentIcons.Light.ArrowHookDownLeft, contentDescription = null)
    }
}
