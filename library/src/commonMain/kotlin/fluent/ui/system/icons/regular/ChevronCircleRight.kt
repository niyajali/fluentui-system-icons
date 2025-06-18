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

public val FluentUi.Regular.ChevronCircleRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronCircleRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            close()
            moveTo(9.97f, 16.53f)
            curveTo(9.677f, 16.237f, 9.677f, 15.763f, 9.97f, 15.47f)
            lineTo(13.439f, 12f)
            lineTo(9.97f, 8.53f)
            curveTo(9.677f, 8.237f, 9.677f, 7.763f, 9.97f, 7.47f)
            curveTo(10.263f, 7.177f, 10.737f, 7.177f, 11.03f, 7.47f)
            lineTo(15.03f, 11.47f)
            curveTo(15.323f, 11.763f, 15.323f, 12.237f, 15.03f, 12.53f)
            lineTo(11.03f, 16.53f)
            curveTo(10.737f, 16.823f, 10.263f, 16.823f, 9.97f, 16.53f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronCircleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChevronCircleRight, contentDescription = null)
    }
}
