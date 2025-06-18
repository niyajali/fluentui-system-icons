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

public val FluentUi.Filled.ChevronLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.707f, 4.293f)
            curveTo(16.098f, 4.683f, 16.098f, 5.317f, 15.707f, 5.707f)
            lineTo(9.414f, 12f)
            lineTo(15.707f, 18.293f)
            curveTo(16.098f, 18.683f, 16.098f, 19.317f, 15.707f, 19.707f)
            curveTo(15.317f, 20.098f, 14.683f, 20.098f, 14.293f, 19.707f)
            lineTo(7.293f, 12.707f)
            curveTo(6.902f, 12.317f, 6.902f, 11.683f, 7.293f, 11.293f)
            lineTo(14.293f, 4.293f)
            curveTo(14.683f, 3.902f, 15.317f, 3.902f, 15.707f, 4.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChevronLeft, contentDescription = null)
    }
}
