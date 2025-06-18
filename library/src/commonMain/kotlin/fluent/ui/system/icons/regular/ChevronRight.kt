package fluent.ui.system.icons.regular

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ChevronRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.47f, 4.22f)
            curveTo(8.177f, 4.513f, 8.177f, 4.987f, 8.47f, 5.28f)
            lineTo(15.189f, 12f)
            lineTo(8.47f, 18.72f)
            curveTo(8.177f, 19.013f, 8.177f, 19.487f, 8.47f, 19.78f)
            curveTo(8.763f, 20.073f, 9.237f, 20.073f, 9.53f, 19.78f)
            lineTo(16.78f, 12.53f)
            curveTo(17.073f, 12.237f, 17.073f, 11.763f, 16.78f, 11.47f)
            lineTo(9.53f, 4.22f)
            curveTo(9.237f, 3.927f, 8.763f, 3.927f, 8.47f, 4.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChevronRight, contentDescription = null)
    }
}
