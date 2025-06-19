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

public val FluentIcons.Filled.VideoMultiple: ImageVector
    get() {
        if (_VideoMultiple != null) {
            return _VideoMultiple!!
        }
        _VideoMultiple = ImageVector.Builder(
            name = "Filled.VideoMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 5f)
                curveTo(5.955f, 5f, 4.5f, 6.455f, 4.5f, 8.25f)
                verticalLineTo(13.75f)
                curveTo(4.5f, 15.545f, 5.955f, 17f, 7.75f, 17f)
                horizontalLineTo(12.75f)
                curveTo(14.545f, 17f, 16f, 15.545f, 16f, 13.75f)
                verticalLineTo(8.25f)
                curveTo(16f, 6.455f, 14.545f, 5f, 12.75f, 5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(3.507f, 8.007f)
                curveTo(3.502f, 8.087f, 3.5f, 8.168f, 3.5f, 8.25f)
                verticalLineTo(13.75f)
                curveTo(3.5f, 16.097f, 5.403f, 18f, 7.75f, 18f)
                horizontalLineTo(10.25f)
                curveTo(10.262f, 18f, 10.274f, 18f, 10.285f, 18f)
                horizontalLineTo(12.75f)
                curveTo(12.832f, 18f, 12.913f, 17.998f, 12.994f, 17.993f)
                curveTo(12.417f, 18.899f, 11.404f, 19.5f, 10.25f, 19.5f)
                horizontalLineTo(7.75f)
                curveTo(4.574f, 19.5f, 2f, 16.926f, 2f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(2f, 9.597f, 2.601f, 8.584f, 3.507f, 8.007f)
                close()
                moveTo(22.002f, 7.753f)
                curveTo(22.002f, 6.337f, 20.408f, 5.507f, 19.248f, 6.319f)
                lineTo(17f, 7.893f)
                verticalLineTo(14.107f)
                lineTo(19.248f, 15.681f)
                curveTo(20.408f, 16.493f, 22.002f, 15.663f, 22.002f, 14.247f)
                verticalLineTo(7.753f)
                close()
            }
        }.build()

        return _VideoMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _VideoMultiple: ImageVector? = null

@Preview
@Composable
private fun VideoMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoMultiple, contentDescription = null)
    }
}
