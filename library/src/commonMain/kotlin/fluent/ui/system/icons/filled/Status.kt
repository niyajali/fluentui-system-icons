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

public val FluentIcons.Filled.Status: ImageVector
    get() {
        if (_Status != null) {
            return _Status!!
        }
        _Status = ImageVector.Builder(
            name = "Filled.Status",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.025f, 3.025f)
                curveTo(17.392f, 1.658f, 19.608f, 1.658f, 20.975f, 3.025f)
                curveTo(22.342f, 4.392f, 22.342f, 6.608f, 20.975f, 7.975f)
                lineTo(14.915f, 14.034f)
                curveTo(14.569f, 14.381f, 14.136f, 14.629f, 13.661f, 14.752f)
                lineTo(8.938f, 15.976f)
                curveTo(8.681f, 16.043f, 8.408f, 15.968f, 8.22f, 15.78f)
                curveTo(8.032f, 15.592f, 7.957f, 15.319f, 8.024f, 15.062f)
                lineTo(9.248f, 10.339f)
                curveTo(9.371f, 9.864f, 9.619f, 9.431f, 9.966f, 9.085f)
                lineTo(16.025f, 3.025f)
                close()
                moveTo(14.331f, 3.305f)
                curveTo(13.588f, 3.106f, 12.806f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 11.194f, 20.894f, 10.412f, 20.695f, 9.669f)
                lineTo(19.426f, 10.938f)
                curveTo(19.475f, 11.285f, 19.5f, 11.64f, 19.5f, 12f)
                curveTo(19.5f, 16.142f, 16.142f, 19.5f, 12f, 19.5f)
                curveTo(7.858f, 19.5f, 4.5f, 16.142f, 4.5f, 12f)
                curveTo(4.5f, 7.858f, 7.858f, 4.5f, 12f, 4.5f)
                curveTo(12.36f, 4.5f, 12.715f, 4.525f, 13.061f, 4.575f)
                lineTo(14.331f, 3.305f)
                close()
            }
        }.build()

        return _Status!!
    }

@Suppress("ObjectPropertyName")
private var _Status: ImageVector? = null

@Preview
@Composable
private fun StatusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Status, contentDescription = null)
    }
}
