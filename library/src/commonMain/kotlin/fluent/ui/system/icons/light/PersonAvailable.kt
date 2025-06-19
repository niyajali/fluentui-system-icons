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

public val FluentIcons.Light.PersonAvailable: ImageVector
    get() {
        if (_PersonAvailable != null) {
            return _PersonAvailable!!
        }
        _PersonAvailable = ImageVector.Builder(
            name = "Light.PersonAvailable",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 9f)
                curveTo(9f, 5.134f, 12.134f, 2f, 16f, 2f)
                curveTo(19.866f, 2f, 23f, 5.134f, 23f, 9f)
                curveTo(23f, 12.866f, 19.866f, 16f, 16f, 16f)
                curveTo(12.134f, 16f, 9f, 12.866f, 9f, 9f)
                close()
                moveTo(16f, 3f)
                curveTo(12.686f, 3f, 10f, 5.686f, 10f, 9f)
                curveTo(10f, 12.314f, 12.686f, 15f, 16f, 15f)
                curveTo(19.314f, 15f, 22f, 12.314f, 22f, 9f)
                curveTo(22f, 5.686f, 19.314f, 3f, 16f, 3f)
                close()
                moveTo(16.375f, 18f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
                verticalLineTo(22.167f)
                curveTo(4f, 24.316f, 6.766f, 30f, 16f, 30f)
                curveTo(16.426f, 30f, 16.839f, 29.988f, 17.238f, 29.965f)
                curveTo(16.927f, 29.663f, 16.638f, 29.34f, 16.373f, 28.997f)
                curveTo(16.25f, 28.999f, 16.126f, 29f, 16f, 29f)
                curveTo(7.234f, 29f, 5f, 23.684f, 5f, 22.167f)
                verticalLineTo(21.5f)
                curveTo(5f, 20.119f, 6.119f, 19f, 7.5f, 19f)
                horizontalLineTo(15.704f)
                curveTo(15.906f, 18.651f, 16.13f, 18.317f, 16.375f, 18f)
                close()
                moveTo(23.5f, 16f)
                curveTo(19.358f, 16f, 16f, 19.358f, 16f, 23.5f)
                curveTo(16f, 27.642f, 19.358f, 31f, 23.5f, 31f)
                curveTo(27.642f, 31f, 31f, 27.642f, 31f, 23.5f)
                curveTo(31f, 19.358f, 27.642f, 16f, 23.5f, 16f)
                close()
                moveTo(28.03f, 20.72f)
                curveTo(28.323f, 21.013f, 28.323f, 21.487f, 28.03f, 21.78f)
                lineTo(22.78f, 27.03f)
                curveTo(22.487f, 27.323f, 22.013f, 27.323f, 21.72f, 27.03f)
                lineTo(19.22f, 24.53f)
                curveTo(18.927f, 24.237f, 18.927f, 23.763f, 19.22f, 23.47f)
                curveTo(19.513f, 23.177f, 19.987f, 23.177f, 20.28f, 23.47f)
                lineTo(22.25f, 25.439f)
                lineTo(26.97f, 20.72f)
                curveTo(27.263f, 20.427f, 27.737f, 20.427f, 28.03f, 20.72f)
                close()
            }
        }.build()

        return _PersonAvailable!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAvailable: ImageVector? = null

@Preview
@Composable
private fun PersonAvailablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonAvailable, contentDescription = null)
    }
}
