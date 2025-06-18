package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.ArrowMinimize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMinimize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.498f, 12.505f)
            curveTo(11.01f, 12.505f, 11.433f, 12.891f, 11.491f, 13.389f)
            lineTo(11.498f, 13.505f)
            verticalLineTo(21.009f)
            curveTo(11.498f, 21.561f, 11.05f, 22.009f, 10.498f, 22.009f)
            curveTo(9.985f, 22.009f, 9.562f, 21.623f, 9.504f, 21.126f)
            lineTo(9.498f, 21.009f)
            lineTo(9.497f, 15.916f)
            lineTo(3.707f, 21.708f)
            curveTo(3.346f, 22.068f, 2.779f, 22.096f, 2.387f, 21.791f)
            lineTo(2.292f, 21.708f)
            curveTo(1.932f, 21.347f, 1.904f, 20.78f, 2.209f, 20.388f)
            lineTo(2.292f, 20.294f)
            lineTo(8.08f, 14.505f)
            lineTo(2.996f, 14.505f)
            curveTo(2.444f, 14.505f, 1.996f, 14.057f, 1.996f, 13.505f)
            curveTo(1.996f, 12.992f, 2.382f, 12.57f, 2.879f, 12.512f)
            lineTo(2.996f, 12.505f)
            horizontalLineTo(10.498f)
            close()
            moveTo(13.499f, 2f)
            curveTo(14.012f, 2f, 14.434f, 2.386f, 14.492f, 2.883f)
            lineTo(14.499f, 3f)
            lineTo(14.498f, 8.087f)
            lineTo(20.292f, 2.293f)
            curveTo(20.653f, 1.933f, 21.22f, 1.905f, 21.612f, 2.21f)
            lineTo(21.707f, 2.293f)
            curveTo(22.067f, 2.654f, 22.095f, 3.221f, 21.79f, 3.613f)
            lineTo(21.707f, 3.708f)
            lineTo(15.91f, 9.503f)
            lineTo(21f, 9.504f)
            curveTo(21.552f, 9.504f, 22f, 9.952f, 22f, 10.504f)
            curveTo(22f, 11.017f, 21.614f, 11.439f, 21.117f, 11.497f)
            lineTo(21f, 11.504f)
            horizontalLineTo(13.499f)
            curveTo(12.986f, 11.504f, 12.563f, 11.118f, 12.505f, 10.62f)
            lineTo(12.499f, 10.504f)
            verticalLineTo(3f)
            curveTo(12.499f, 2.448f, 12.946f, 2f, 13.499f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowMinimize, contentDescription = null)
    }
}
