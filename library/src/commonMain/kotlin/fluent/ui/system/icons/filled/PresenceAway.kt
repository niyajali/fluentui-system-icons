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

public val FluentUi.Filled.PresenceAway: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAway",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 24f)
            curveTo(18.627f, 24f, 24f, 18.627f, 24f, 12f)
            curveTo(24f, 5.373f, 18.627f, 0f, 12f, 0f)
            curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
            curveTo(0f, 18.627f, 5.373f, 24f, 12f, 24f)
            close()
            moveTo(13f, 6.5f)
            verticalLineTo(11.31f)
            lineTo(15.976f, 13.861f)
            curveTo(16.605f, 14.4f, 16.678f, 15.347f, 16.139f, 15.976f)
            curveTo(15.6f, 16.605f, 14.653f, 16.678f, 14.024f, 16.139f)
            lineTo(10.524f, 13.139f)
            curveTo(10.191f, 12.854f, 10f, 12.438f, 10f, 12f)
            verticalLineTo(6.5f)
            curveTo(10f, 5.672f, 10.672f, 5f, 11.5f, 5f)
            curveTo(12.328f, 5f, 13f, 5.672f, 13f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenceAwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PresenceAway, contentDescription = null)
    }
}
