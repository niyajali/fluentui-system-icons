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

public val FluentIcons.Light.Save: ImageVector
    get() {
        if (_Save != null) {
            return _Save!!
        }
        _Save = ImageVector.Builder(
            name = "Light.Save",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 29f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(21.343f)
                curveTo(21.382f, 3f, 21.421f, 3.001f, 21.461f, 3.002f)
                curveTo(21.474f, 3.001f, 21.487f, 3f, 21.5f, 3f)
                curveTo(21.527f, 3f, 21.553f, 3.002f, 21.579f, 3.006f)
                curveTo(22.686f, 3.064f, 23.737f, 3.53f, 24.525f, 4.318f)
                lineTo(27.682f, 7.475f)
                curveTo(28.526f, 8.319f, 29f, 9.463f, 29f, 10.657f)
                verticalLineTo(24.5f)
                curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
                horizontalLineTo(7.5f)
                close()
                moveTo(7.5f, 4f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.263f, 5.304f, 27.722f, 7f, 27.965f)
                verticalLineTo(18.5f)
                curveTo(7f, 17.119f, 8.119f, 16f, 9.5f, 16f)
                horizontalLineTo(22.5f)
                curveTo(23.881f, 16f, 25f, 17.119f, 25f, 18.5f)
                verticalLineTo(27.965f)
                curveTo(26.696f, 27.722f, 28f, 26.263f, 28f, 24.5f)
                verticalLineTo(10.657f)
                curveTo(28f, 9.729f, 27.631f, 8.838f, 26.975f, 8.182f)
                lineTo(23.818f, 5.025f)
                curveTo(23.319f, 4.526f, 22.684f, 4.193f, 22f, 4.062f)
                verticalLineTo(9.5f)
                curveTo(22f, 10.881f, 20.881f, 12f, 19.5f, 12f)
                horizontalLineTo(11.5f)
                curveTo(10.119f, 12f, 9f, 10.881f, 9f, 9.5f)
                verticalLineTo(4f)
                horizontalLineTo(7.5f)
                close()
                moveTo(24f, 28f)
                verticalLineTo(18.5f)
                curveTo(24f, 17.672f, 23.328f, 17f, 22.5f, 17f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 17f, 8f, 17.672f, 8f, 18.5f)
                verticalLineTo(28f)
                horizontalLineTo(24f)
                close()
                moveTo(21f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(9.5f)
                curveTo(10f, 10.328f, 10.672f, 11f, 11.5f, 11f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 11f, 21f, 10.328f, 21f, 9.5f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Save!!
    }

@Suppress("ObjectPropertyName")
private var _Save: ImageVector? = null

@Preview
@Composable
private fun SavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Save, contentDescription = null)
    }
}
