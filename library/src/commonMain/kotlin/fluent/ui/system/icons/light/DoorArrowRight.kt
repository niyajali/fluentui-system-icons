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

public val FluentIcons.Light.DoorArrowRight: ImageVector
    get() {
        if (_DoorArrowRight != null) {
            return _DoorArrowRight!!
        }
        _DoorArrowRight = ImageVector.Builder(
            name = "Light.DoorArrowRight",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.25f, 2f)
                curveTo(6.455f, 2f, 5f, 3.455f, 5f, 5.25f)
                verticalLineTo(26.75f)
                curveTo(5f, 28.545f, 6.455f, 30f, 8.25f, 30f)
                horizontalLineTo(17.275f)
                curveTo(16.951f, 29.69f, 16.65f, 29.355f, 16.375f, 29f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 29f, 6f, 27.993f, 6f, 26.75f)
                verticalLineTo(5.25f)
                curveTo(6f, 4.007f, 7.007f, 3f, 8.25f, 3f)
                horizontalLineTo(23.75f)
                curveTo(24.993f, 3f, 26f, 4.007f, 26f, 5.25f)
                verticalLineTo(14.852f)
                curveTo(26.342f, 14.95f, 26.676f, 15.069f, 27f, 15.206f)
                verticalLineTo(5.25f)
                curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
                horizontalLineTo(8.25f)
                close()
                moveTo(23.5f, 16f)
                curveTo(27.642f, 16f, 31f, 19.358f, 31f, 23.5f)
                curveTo(31f, 27.642f, 27.642f, 31f, 23.5f, 31f)
                curveTo(19.358f, 31f, 16f, 27.642f, 16f, 23.5f)
                curveTo(16f, 19.358f, 19.358f, 16f, 23.5f, 16f)
                close()
                moveTo(18f, 23.25f)
                curveTo(18f, 23.664f, 18.336f, 24f, 18.75f, 24f)
                horizontalLineTo(26.439f)
                lineTo(23.72f, 26.72f)
                curveTo(23.427f, 27.013f, 23.427f, 27.487f, 23.72f, 27.78f)
                curveTo(24.013f, 28.073f, 24.487f, 28.073f, 24.78f, 27.78f)
                lineTo(28.78f, 23.78f)
                curveTo(29.073f, 23.487f, 29.073f, 23.013f, 28.78f, 22.72f)
                lineTo(24.78f, 18.72f)
                curveTo(24.487f, 18.427f, 24.013f, 18.427f, 23.72f, 18.72f)
                curveTo(23.427f, 19.013f, 23.427f, 19.487f, 23.72f, 19.78f)
                lineTo(26.439f, 22.5f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 22.5f, 18f, 22.836f, 18f, 23.25f)
                close()
                moveTo(9.5f, 17.25f)
                curveTo(10.467f, 17.25f, 11.25f, 16.466f, 11.25f, 15.5f)
                curveTo(11.25f, 14.533f, 10.467f, 13.75f, 9.5f, 13.75f)
                curveTo(8.533f, 13.75f, 7.75f, 14.533f, 7.75f, 15.5f)
                curveTo(7.75f, 16.466f, 8.533f, 17.25f, 9.5f, 17.25f)
                close()
            }
        }.build()

        return _DoorArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _DoorArrowRight: ImageVector? = null

@Preview
@Composable
private fun DoorArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.DoorArrowRight, contentDescription = null)
    }
}
