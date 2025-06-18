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

public val FluentUi.Regular.ChevronCircleUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronCircleUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            close()
            moveTo(12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            close()
            moveTo(7.47f, 14.03f)
            curveTo(7.763f, 14.323f, 8.237f, 14.323f, 8.53f, 14.03f)
            lineTo(12f, 10.561f)
            lineTo(15.47f, 14.03f)
            curveTo(15.763f, 14.323f, 16.237f, 14.323f, 16.53f, 14.03f)
            curveTo(16.823f, 13.737f, 16.823f, 13.263f, 16.53f, 12.97f)
            lineTo(12.53f, 8.97f)
            curveTo(12.237f, 8.677f, 11.763f, 8.677f, 11.47f, 8.97f)
            lineTo(7.47f, 12.97f)
            curveTo(7.177f, 13.263f, 7.177f, 13.737f, 7.47f, 14.03f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronCircleUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChevronCircleUp, contentDescription = null)
    }
}
