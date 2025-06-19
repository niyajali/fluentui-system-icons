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

public val FluentIcons.Filled.ArrowClockwise: ImageVector
    get() {
        if (_ArrowClockwise != null) {
            return _ArrowClockwise!!
        }
        _ArrowClockwise = ImageVector.Builder(
            name = "Filled.ArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 12f)
                curveTo(5f, 8.134f, 8.134f, 5f, 12f, 5f)
                curveTo(13.32f, 5f, 14.554f, 5.365f, 15.608f, 6f)
                horizontalLineTo(15f)
                curveTo(14.448f, 6f, 14f, 6.448f, 14f, 7f)
                curveTo(14f, 7.552f, 14.448f, 8f, 15f, 8f)
                horizontalLineTo(18f)
                curveTo(18.552f, 8f, 19f, 7.552f, 19f, 7f)
                curveTo(19f, 6f, 19f, 5f, 19f, 4f)
                curveTo(19f, 3.448f, 18.552f, 3f, 18f, 3f)
                curveTo(17.448f, 3f, 17f, 3.448f, 17f, 4f)
                verticalLineTo(4.516f)
                curveTo(15.57f, 3.559f, 13.85f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
                curveTo(21f, 11.62f, 20.976f, 11.245f, 20.93f, 10.876f)
                curveTo(20.862f, 10.328f, 20.362f, 9.939f, 19.814f, 10.008f)
                curveTo(19.266f, 10.076f, 18.878f, 10.576f, 18.946f, 11.124f)
                curveTo(18.982f, 11.41f, 19f, 11.703f, 19f, 12f)
                curveTo(19f, 15.866f, 15.866f, 19f, 12f, 19f)
                curveTo(8.134f, 19f, 5f, 15.866f, 5f, 12f)
                close()
            }
        }.build()

        return _ArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun ArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowClockwise, contentDescription = null)
    }
}
