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

public val FluentIcons.Light.Copy: ImageVector
    get() {
        if (_Copy != null) {
            return _Copy!!
        }
        _Copy = ImageVector.Builder(
            name = "Light.Copy",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.25f, 2f)
                curveTo(9.455f, 2f, 8f, 3.455f, 8f, 5.25f)
                verticalLineTo(23.75f)
                curveTo(8f, 25.545f, 9.455f, 27f, 11.25f, 27f)
                horizontalLineTo(23.75f)
                curveTo(25.545f, 27f, 27f, 25.545f, 27f, 23.75f)
                verticalLineTo(5.25f)
                curveTo(27f, 3.455f, 25.545f, 2f, 23.75f, 2f)
                horizontalLineTo(11.25f)
                close()
                moveTo(9f, 5.25f)
                curveTo(9f, 4.007f, 10.007f, 3f, 11.25f, 3f)
                horizontalLineTo(23.75f)
                curveTo(24.993f, 3f, 26f, 4.007f, 26f, 5.25f)
                verticalLineTo(23.75f)
                curveTo(26f, 24.993f, 24.993f, 26f, 23.75f, 26f)
                horizontalLineTo(11.25f)
                curveTo(10.007f, 26f, 9f, 24.993f, 9f, 23.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(6f, 5.905f)
                curveTo(5.384f, 6.496f, 5f, 7.328f, 5f, 8.25f)
                verticalLineTo(23.75f)
                curveTo(5f, 27.202f, 7.798f, 30f, 11.25f, 30f)
                horizontalLineTo(20.75f)
                curveTo(21.672f, 30f, 22.504f, 29.616f, 23.095f, 29f)
                horizontalLineTo(11.25f)
                curveTo(8.351f, 29f, 6f, 26.649f, 6f, 23.75f)
                verticalLineTo(5.905f)
                close()
            }
        }.build()

        return _Copy!!
    }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null

@Preview
@Composable
private fun CopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Copy, contentDescription = null)
    }
}
