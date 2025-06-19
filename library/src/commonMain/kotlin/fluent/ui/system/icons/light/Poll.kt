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

public val FluentIcons.Light.Poll: ImageVector
    get() {
        if (_Poll != null) {
            return _Poll!!
        }
        _Poll = ImageVector.Builder(
            name = "Light.Poll",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.5f, 3f)
                curveTo(17.433f, 3f, 19f, 4.567f, 19f, 6.5f)
                verticalLineTo(25.5f)
                curveTo(19f, 27.433f, 17.433f, 29f, 15.5f, 29f)
                curveTo(13.567f, 29f, 12f, 27.433f, 12f, 25.5f)
                verticalLineTo(6.5f)
                curveTo(12f, 4.567f, 13.567f, 3f, 15.5f, 3f)
                close()
                moveTo(15.5f, 4f)
                curveTo(14.119f, 4f, 13f, 5.119f, 13f, 6.5f)
                verticalLineTo(25.5f)
                curveTo(13f, 26.881f, 14.119f, 28f, 15.5f, 28f)
                curveTo(16.881f, 28f, 18f, 26.881f, 18f, 25.5f)
                verticalLineTo(6.5f)
                curveTo(18f, 5.119f, 16.881f, 4f, 15.5f, 4f)
                close()
                moveTo(29f, 12.5f)
                verticalLineTo(25.5f)
                curveTo(29f, 27.433f, 27.433f, 29f, 25.5f, 29f)
                curveTo(23.567f, 29f, 22f, 27.433f, 22f, 25.5f)
                verticalLineTo(12.5f)
                curveTo(22f, 10.567f, 23.567f, 9f, 25.5f, 9f)
                curveTo(27.433f, 9f, 29f, 10.567f, 29f, 12.5f)
                close()
                moveTo(25.5f, 10f)
                curveTo(24.119f, 10f, 23f, 11.119f, 23f, 12.5f)
                verticalLineTo(25.5f)
                curveTo(23f, 26.881f, 24.119f, 28f, 25.5f, 28f)
                curveTo(26.881f, 28f, 28f, 26.881f, 28f, 25.5f)
                verticalLineTo(12.5f)
                curveTo(28f, 11.119f, 26.881f, 10f, 25.5f, 10f)
                close()
                moveTo(9f, 25.5f)
                verticalLineTo(18.5f)
                curveTo(9f, 16.567f, 7.433f, 15f, 5.5f, 15f)
                curveTo(3.567f, 15f, 2f, 16.567f, 2f, 18.5f)
                verticalLineTo(25.5f)
                curveTo(2f, 27.433f, 3.567f, 29f, 5.5f, 29f)
                curveTo(7.433f, 29f, 9f, 27.433f, 9f, 25.5f)
                close()
                moveTo(3f, 18.5f)
                curveTo(3f, 17.119f, 4.119f, 16f, 5.5f, 16f)
                curveTo(6.881f, 16f, 8f, 17.119f, 8f, 18.5f)
                verticalLineTo(25.5f)
                curveTo(8f, 26.881f, 6.881f, 28f, 5.5f, 28f)
                curveTo(4.119f, 28f, 3f, 26.881f, 3f, 25.5f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _Poll!!
    }

@Suppress("ObjectPropertyName")
private var _Poll: ImageVector? = null

@Preview
@Composable
private fun PollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Poll, contentDescription = null)
    }
}
