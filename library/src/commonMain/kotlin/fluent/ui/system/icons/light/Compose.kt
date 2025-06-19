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

public val FluentIcons.Light.Compose: ImageVector
    get() {
        if (_Compose != null) {
            return _Compose!!
        }
        _Compose = ImageVector.Builder(
            name = "Light.Compose",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(29.854f, 2.854f)
                curveTo(30.049f, 2.658f, 30.049f, 2.342f, 29.854f, 2.146f)
                curveTo(29.658f, 1.951f, 29.342f, 1.951f, 29.146f, 2.146f)
                lineTo(13.293f, 18f)
                lineTo(13f, 19f)
                lineTo(14f, 18.707f)
                lineTo(29.854f, 2.854f)
                close()
                moveTo(4f, 7.5f)
                curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 4f, 20f, 3.776f, 20f, 3.5f)
                curveTo(20f, 3.224f, 19.776f, 3f, 19.5f, 3f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
                verticalLineTo(12.5f)
                curveTo(29f, 12.224f, 28.776f, 12f, 28.5f, 12f)
                curveTo(28.224f, 12f, 28f, 12.224f, 28f, 12.5f)
                verticalLineTo(24.5f)
                curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()

        return _Compose!!
    }

@Suppress("ObjectPropertyName")
private var _Compose: ImageVector? = null

@Preview
@Composable
private fun ComposePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Compose, contentDescription = null)
    }
}
