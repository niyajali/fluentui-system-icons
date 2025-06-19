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

public val FluentIcons.Light.Dismiss: ImageVector
    get() {
        if (_Dismiss != null) {
            return _Dismiss!!
        }
        _Dismiss = ImageVector.Builder(
            name = "Light.Dismiss",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(27.854f, 4.854f)
                curveTo(28.049f, 4.658f, 28.049f, 4.342f, 27.854f, 4.146f)
                curveTo(27.658f, 3.951f, 27.342f, 3.951f, 27.146f, 4.146f)
                lineTo(16f, 15.293f)
                lineTo(4.854f, 4.146f)
                curveTo(4.658f, 3.951f, 4.342f, 3.951f, 4.146f, 4.146f)
                curveTo(3.951f, 4.342f, 3.951f, 4.658f, 4.146f, 4.854f)
                lineTo(15.293f, 16f)
                lineTo(4.146f, 27.146f)
                curveTo(3.951f, 27.342f, 3.951f, 27.658f, 4.146f, 27.854f)
                curveTo(4.342f, 28.049f, 4.658f, 28.049f, 4.854f, 27.854f)
                lineTo(16f, 16.707f)
                lineTo(27.146f, 27.854f)
                curveTo(27.342f, 28.049f, 27.658f, 28.049f, 27.854f, 27.854f)
                curveTo(28.049f, 27.658f, 28.049f, 27.342f, 27.854f, 27.146f)
                lineTo(16.707f, 16f)
                lineTo(27.854f, 4.854f)
                close()
            }
        }.build()

        return _Dismiss!!
    }

@Suppress("ObjectPropertyName")
private var _Dismiss: ImageVector? = null

@Preview
@Composable
private fun DismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Dismiss, contentDescription = null)
    }
}
