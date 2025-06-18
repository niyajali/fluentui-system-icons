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

public val FluentUi.Filled.ChevronCircleDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronCircleDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(7.47f, 9.97f)
            curveTo(7.177f, 10.263f, 7.177f, 10.737f, 7.47f, 11.03f)
            lineTo(11.47f, 15.03f)
            curveTo(11.763f, 15.323f, 12.237f, 15.323f, 12.53f, 15.03f)
            lineTo(16.53f, 11.03f)
            curveTo(16.823f, 10.737f, 16.823f, 10.263f, 16.53f, 9.97f)
            curveTo(16.237f, 9.677f, 15.763f, 9.677f, 15.47f, 9.97f)
            lineTo(12f, 13.439f)
            lineTo(8.53f, 9.97f)
            curveTo(8.237f, 9.677f, 7.763f, 9.677f, 7.47f, 9.97f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChevronCircleDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChevronCircleDown, contentDescription = null)
    }
}
