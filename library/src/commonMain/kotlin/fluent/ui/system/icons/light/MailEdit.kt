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

public val FluentIcons.Light.MailEdit: ImageVector
    get() {
        if (_MailEdit != null) {
            return _MailEdit!!
        }
        _MailEdit = ImageVector.Builder(
            name = "Light.MailEdit",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(25.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(9.49f)
                curveTo(2f, 9.496f, 2f, 9.503f, 2f, 9.509f)
                verticalLineTo(21.5f)
                curveTo(2f, 23.985f, 4.015f, 26f, 6.5f, 26f)
                horizontalLineTo(15.469f)
                curveTo(15.592f, 25.645f, 15.762f, 25.308f, 15.975f, 25f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 25f, 3f, 23.433f, 3f, 21.5f)
                verticalLineTo(10.35f)
                lineTo(15.757f, 17.437f)
                curveTo(15.908f, 17.521f, 16.092f, 17.521f, 16.243f, 17.437f)
                lineTo(29f, 10.35f)
                verticalLineTo(14.586f)
                curveTo(29.343f, 14.656f, 29.679f, 14.767f, 30f, 14.92f)
                verticalLineTo(9.509f)
                curveTo(30f, 9.503f, 30f, 9.496f, 30f, 9.49f)
                verticalLineTo(8.5f)
                curveTo(30f, 6.015f, 27.985f, 4f, 25.5f, 4f)
                close()
                moveTo(29f, 8.5f)
                verticalLineTo(9.206f)
                lineTo(16f, 16.428f)
                lineTo(3f, 9.206f)
                verticalLineTo(8.5f)
                curveTo(3f, 6.567f, 4.567f, 5f, 6.5f, 5f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 5f, 29f, 6.567f, 29f, 8.5f)
                close()
                moveTo(30.144f, 20.924f)
                lineTo(21.535f, 29.467f)
                curveTo(21.183f, 29.816f, 20.745f, 30.065f, 20.265f, 30.188f)
                lineTo(17.246f, 30.966f)
                curveTo(16.508f, 31.156f, 15.838f, 30.484f, 16.029f, 29.747f)
                lineTo(16.819f, 26.695f)
                curveTo(16.937f, 26.24f, 17.174f, 25.824f, 17.505f, 25.49f)
                lineTo(26.072f, 16.85f)
                curveTo(27.22f, 15.691f, 29.1f, 15.717f, 30.216f, 16.907f)
                curveTo(31.283f, 18.045f, 31.251f, 19.825f, 30.144f, 20.924f)
                close()
            }
        }.build()

        return _MailEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MailEdit: ImageVector? = null

@Preview
@Composable
private fun MailEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailEdit, contentDescription = null)
    }
}
