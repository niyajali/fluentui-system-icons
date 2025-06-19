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

public val FluentIcons.Filled.ArrowSort: ImageVector
    get() {
        if (_ArrowSort != null) {
            return _ArrowSort!!
        }
        _ArrowSort = ImageVector.Builder(
            name = "Filled.ArrowSort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.288f, 4.293f)
                lineTo(2.293f, 8.293f)
                lineTo(2.209f, 8.388f)
                curveTo(1.905f, 8.78f, 1.933f, 9.347f, 2.293f, 9.707f)
                lineTo(2.388f, 9.791f)
                curveTo(2.78f, 10.095f, 3.347f, 10.067f, 3.707f, 9.707f)
                lineTo(6.001f, 7.41f)
                lineTo(6.001f, 19.001f)
                lineTo(6.008f, 19.117f)
                curveTo(6.065f, 19.615f, 6.488f, 20.001f, 7.001f, 20.001f)
                lineTo(7.118f, 19.994f)
                curveTo(7.615f, 19.936f, 8.001f, 19.514f, 8.001f, 19.001f)
                lineTo(8.001f, 7.417f)
                lineTo(10.294f, 9.708f)
                lineTo(10.389f, 9.791f)
                curveTo(10.781f, 10.095f, 11.348f, 10.067f, 11.709f, 9.707f)
                curveTo(12.099f, 9.316f, 12.098f, 8.683f, 11.708f, 8.292f)
                lineTo(7.702f, 4.292f)
                lineTo(7.608f, 4.209f)
                curveTo(7.216f, 3.905f, 6.649f, 3.933f, 6.288f, 4.293f)
                close()
                moveTo(17f, 4.003f)
                lineTo(16.883f, 4.01f)
                curveTo(16.386f, 4.068f, 16f, 4.49f, 16f, 5.003f)
                lineTo(16f, 16.583f)
                lineTo(13.707f, 14.292f)
                lineTo(13.613f, 14.209f)
                curveTo(13.22f, 13.905f, 12.653f, 13.932f, 12.293f, 14.293f)
                curveTo(11.902f, 14.684f, 11.903f, 15.317f, 12.293f, 15.707f)
                lineTo(16.297f, 19.707f)
                lineTo(16.391f, 19.791f)
                curveTo(16.784f, 20.095f, 17.351f, 20.067f, 17.711f, 19.707f)
                lineTo(21.707f, 15.707f)
                lineTo(21.791f, 15.613f)
                curveTo(22.095f, 15.22f, 22.067f, 14.653f, 21.707f, 14.292f)
                lineTo(21.612f, 14.209f)
                curveTo(21.22f, 13.905f, 20.653f, 13.932f, 20.293f, 14.293f)
                lineTo(18f, 16.587f)
                lineTo(18f, 5.003f)
                lineTo(17.993f, 4.887f)
                curveTo(17.935f, 4.389f, 17.513f, 4.003f, 17f, 4.003f)
                close()
            }
        }.build()

        return _ArrowSort!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSort: ImageVector? = null

@Preview
@Composable
private fun ArrowSortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSort, contentDescription = null)
    }
}
