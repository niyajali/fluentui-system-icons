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

public val FluentIcons.Filled.ArrowCounterclockwise: ImageVector
    get() {
        if (_ArrowCounterclockwise != null) {
            return _ArrowCounterclockwise!!
        }
        _ArrowCounterclockwise = ImageVector.Builder(
            name = "Filled.ArrowCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 12f)
                curveTo(19f, 8.134f, 15.866f, 5f, 12f, 5f)
                curveTo(10.68f, 5f, 9.446f, 5.365f, 8.392f, 6f)
                horizontalLineTo(9f)
                curveTo(9.552f, 6f, 10f, 6.448f, 10f, 7f)
                curveTo(10f, 7.552f, 9.552f, 8f, 9f, 8f)
                horizontalLineTo(6f)
                curveTo(5.448f, 8f, 5f, 7.552f, 5f, 7f)
                curveTo(5f, 6f, 5f, 5f, 5f, 4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(4.516f)
                curveTo(8.43f, 3.559f, 10.15f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 11.62f, 3.024f, 11.245f, 3.07f, 10.876f)
                curveTo(3.138f, 10.328f, 3.638f, 9.939f, 4.186f, 10.008f)
                curveTo(4.734f, 10.076f, 5.123f, 10.576f, 5.054f, 11.124f)
                curveTo(5.018f, 11.41f, 5f, 11.703f, 5f, 12f)
                curveTo(5f, 15.866f, 8.134f, 19f, 12f, 19f)
                curveTo(15.866f, 19f, 19f, 15.866f, 19f, 12f)
                close()
            }
        }.build()

        return _ArrowCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCounterclockwise: ImageVector? = null

@Preview
@Composable
private fun ArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCounterclockwise, contentDescription = null)
    }
}
