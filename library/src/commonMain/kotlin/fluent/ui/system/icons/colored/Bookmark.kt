package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Bookmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Bookmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(5.002f, 4.611f),
                end = Offset(15.317f, 17.491f)
            )
        ) {
            moveTo(6.19f, 21.854f)
            curveTo(5.694f, 22.211f, 5.002f, 21.856f, 5.002f, 21.245f)
            verticalLineTo(6.249f)
            curveTo(5.002f, 4.454f, 6.458f, 2.999f, 8.252f, 2.999f)
            horizontalLineTo(15.751f)
            curveTo(17.546f, 2.999f, 19.001f, 4.454f, 19.001f, 6.249f)
            verticalLineTo(21.245f)
            curveTo(19.001f, 21.856f, 18.309f, 22.211f, 17.813f, 21.854f)
            lineTo(12.002f, 17.673f)
            lineTo(6.19f, 21.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Bookmark, contentDescription = null)
    }
}
