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

public val FluentUi.Filled.ZoomOut: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ZoomOut",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 10f)
            curveTo(17.5f, 5.858f, 14.142f, 2.5f, 10f, 2.5f)
            curveTo(5.858f, 2.5f, 2.5f, 5.858f, 2.5f, 10f)
            curveTo(2.5f, 14.142f, 5.858f, 17.5f, 10f, 17.5f)
            curveTo(11.71f, 17.5f, 13.287f, 16.928f, 14.548f, 15.964f)
            lineTo(19.293f, 20.707f)
            lineTo(19.387f, 20.79f)
            curveTo(19.779f, 21.095f, 20.347f, 21.068f, 20.707f, 20.707f)
            curveTo(21.098f, 20.317f, 21.098f, 19.683f, 20.707f, 19.293f)
            lineTo(15.964f, 14.548f)
            curveTo(16.928f, 13.287f, 17.5f, 11.71f, 17.5f, 10f)
            close()
            moveTo(13.5f, 9f)
            curveTo(14.052f, 9f, 14.5f, 9.448f, 14.5f, 10f)
            curveTo(14.5f, 10.552f, 14.052f, 11f, 13.5f, 11f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 11f, 5.5f, 10.552f, 5.5f, 10f)
            curveTo(5.5f, 9.448f, 5.948f, 9f, 6.5f, 9f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ZoomOutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ZoomOut, contentDescription = null)
    }
}
