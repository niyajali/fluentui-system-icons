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

public val FluentUi.Filled.Triangle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.302f, 16.631f)
            curveTo(1.441f, 18.131f, 2.524f, 20f, 4.253f, 20f)
            horizontalLineTo(19.742f)
            curveTo(21.472f, 20f, 22.555f, 18.131f, 21.694f, 16.631f)
            lineTo(13.95f, 3.128f)
            curveTo(13.085f, 1.621f, 10.911f, 1.621f, 10.046f, 3.128f)
            lineTo(2.302f, 16.631f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TrianglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Triangle, contentDescription = null)
    }
}
