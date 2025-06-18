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

public val FluentUi.Regular.MoreCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
            moveTo(7f, 13.25f)
            curveTo(7.69f, 13.25f, 8.25f, 12.69f, 8.25f, 12f)
            curveTo(8.25f, 11.31f, 7.69f, 10.75f, 7f, 10.75f)
            curveTo(6.31f, 10.75f, 5.75f, 11.31f, 5.75f, 12f)
            curveTo(5.75f, 12.69f, 6.31f, 13.25f, 7f, 13.25f)
            close()
            moveTo(12f, 13.25f)
            curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12f)
            curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12f, 10.75f)
            curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12f)
            curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12f, 13.25f)
            close()
            moveTo(17f, 13.25f)
            curveTo(17.69f, 13.25f, 18.25f, 12.69f, 18.25f, 12f)
            curveTo(18.25f, 11.31f, 17.69f, 10.75f, 17f, 10.75f)
            curveTo(16.31f, 10.75f, 15.75f, 11.31f, 15.75f, 12f)
            curveTo(15.75f, 12.69f, 16.31f, 13.25f, 17f, 13.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoreCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MoreCircle, contentDescription = null)
    }
}
