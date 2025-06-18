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

public val FluentUi.Regular.Checkmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Checkmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.53f, 12.97f)
            curveTo(4.237f, 12.677f, 3.763f, 12.677f, 3.47f, 12.97f)
            curveTo(3.177f, 13.263f, 3.177f, 13.737f, 3.47f, 14.03f)
            lineTo(7.97f, 18.53f)
            curveTo(8.263f, 18.823f, 8.737f, 18.823f, 9.03f, 18.53f)
            lineTo(20.03f, 7.53f)
            curveTo(20.323f, 7.237f, 20.323f, 6.763f, 20.03f, 6.47f)
            curveTo(19.737f, 6.177f, 19.263f, 6.177f, 18.97f, 6.47f)
            lineTo(8.5f, 16.939f)
            lineTo(4.53f, 12.97f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Checkmark, contentDescription = null)
    }
}
