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

public val FluentUi.Filled.GridCircles: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GridCircles",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 11f)
            curveTo(9.209f, 11f, 11f, 9.209f, 11f, 7f)
            curveTo(11f, 4.791f, 9.209f, 3f, 7f, 3f)
            curveTo(4.791f, 3f, 3f, 4.791f, 3f, 7f)
            curveTo(3f, 9.209f, 4.791f, 11f, 7f, 11f)
            close()
            moveTo(17f, 11f)
            curveTo(19.209f, 11f, 21f, 9.209f, 21f, 7f)
            curveTo(21f, 4.791f, 19.209f, 3f, 17f, 3f)
            curveTo(14.791f, 3f, 13f, 4.791f, 13f, 7f)
            curveTo(13f, 9.209f, 14.791f, 11f, 17f, 11f)
            close()
            moveTo(11f, 17f)
            curveTo(11f, 19.209f, 9.209f, 21f, 7f, 21f)
            curveTo(4.791f, 21f, 3f, 19.209f, 3f, 17f)
            curveTo(3f, 14.791f, 4.791f, 13f, 7f, 13f)
            curveTo(9.209f, 13f, 11f, 14.791f, 11f, 17f)
            close()
            moveTo(17f, 21f)
            curveTo(19.209f, 21f, 21f, 19.209f, 21f, 17f)
            curveTo(21f, 14.791f, 19.209f, 13f, 17f, 13f)
            curveTo(14.791f, 13f, 13f, 14.791f, 13f, 17f)
            curveTo(13f, 19.209f, 14.791f, 21f, 17f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GridCirclesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GridCircles, contentDescription = null)
    }
}
