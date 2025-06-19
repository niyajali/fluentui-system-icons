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

public val FluentIcons.Filled.ArrowSortDown: ImageVector
    get() {
        if (_ArrowSortDown != null) {
            return _ArrowSortDown!!
        }
        _ArrowSortDown = ImageVector.Builder(
            name = "Filled.ArrowSortDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.883f, 4.011f)
                lineTo(12f, 4.004f)
                curveTo(12.513f, 4.004f, 12.936f, 4.39f, 12.993f, 4.887f)
                lineTo(13f, 5.004f)
                lineTo(13f, 16.588f)
                lineTo(15.293f, 14.294f)
                curveTo(15.653f, 13.933f, 16.22f, 13.905f, 16.612f, 14.21f)
                lineTo(16.707f, 14.293f)
                curveTo(17.067f, 14.654f, 17.095f, 15.221f, 16.791f, 15.613f)
                lineTo(16.707f, 15.708f)
                lineTo(12.711f, 19.708f)
                curveTo(12.351f, 20.068f, 11.784f, 20.096f, 11.391f, 19.791f)
                lineTo(11.297f, 19.708f)
                lineTo(7.293f, 15.708f)
                curveTo(6.903f, 15.318f, 6.902f, 14.685f, 7.293f, 14.294f)
                curveTo(7.653f, 13.933f, 8.22f, 13.905f, 8.613f, 14.21f)
                lineTo(8.707f, 14.293f)
                lineTo(11f, 16.584f)
                lineTo(11f, 5.004f)
                curveTo(11f, 4.491f, 11.386f, 4.068f, 11.883f, 4.011f)
                lineTo(12f, 4.004f)
                lineTo(11.883f, 4.011f)
                close()
            }
        }.build()

        return _ArrowSortDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSortDown: ImageVector? = null

@Preview
@Composable
private fun ArrowSortDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSortDown, contentDescription = null)
    }
}
