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

public val FluentUi.Filled.ChevronRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.293f, 4.293f)
            curveTo(7.902f, 4.683f, 7.902f, 5.317f, 8.293f, 5.707f)
            lineTo(14.586f, 12f)
            lineTo(8.293f, 18.293f)
            curveTo(7.902f, 18.683f, 7.902f, 19.317f, 8.293f, 19.707f)
            curveTo(8.683f, 20.098f, 9.317f, 20.098f, 9.707f, 19.707f)
            lineTo(16.707f, 12.707f)
            curveTo(17.098f, 12.317f, 17.098f, 11.683f, 16.707f, 11.293f)
            lineTo(9.707f, 4.293f)
            curveTo(9.317f, 3.902f, 8.683f, 3.902f, 8.293f, 4.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChevronRight, contentDescription = null)
    }
}
