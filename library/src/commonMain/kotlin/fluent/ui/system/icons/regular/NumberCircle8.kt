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

public val FluentUi.Regular.NumberCircle8: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle8",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            close()
            moveTo(12f, 8f)
            curveTo(13.043f, 8f, 13.75f, 8.744f, 13.75f, 9.5f)
            curveTo(13.75f, 10.256f, 13.043f, 11f, 12f, 11f)
            curveTo(10.957f, 11f, 10.25f, 10.256f, 10.25f, 9.5f)
            curveTo(10.25f, 8.744f, 10.957f, 8f, 12f, 8f)
            close()
            moveTo(14.191f, 11.716f)
            curveTo(14.833f, 11.179f, 15.25f, 10.402f, 15.25f, 9.5f)
            curveTo(15.25f, 7.771f, 13.719f, 6.5f, 12f, 6.5f)
            curveTo(10.281f, 6.5f, 8.75f, 7.771f, 8.75f, 9.5f)
            curveTo(8.75f, 10.402f, 9.166f, 11.179f, 9.809f, 11.716f)
            curveTo(9.02f, 12.301f, 8.5f, 13.2f, 8.5f, 14.25f)
            curveTo(8.5f, 16.111f, 10.136f, 17.5f, 12f, 17.5f)
            curveTo(13.864f, 17.5f, 15.5f, 16.111f, 15.5f, 14.25f)
            curveTo(15.5f, 13.2f, 14.979f, 12.301f, 14.191f, 11.716f)
            close()
            moveTo(12f, 12.5f)
            curveTo(13.173f, 12.5f, 14f, 13.349f, 14f, 14.25f)
            curveTo(14f, 15.151f, 13.173f, 16f, 12f, 16f)
            curveTo(10.827f, 16f, 10f, 15.151f, 10f, 14.25f)
            curveTo(10f, 13.349f, 10.827f, 12.5f, 12f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle8Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle8, contentDescription = null)
    }
}
