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

public val FluentUi.Filled.NumberCircle8: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle8",
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
            moveTo(12f, 8f)
            curveTo(10.957f, 8f, 10.25f, 8.744f, 10.25f, 9.5f)
            curveTo(10.25f, 10.256f, 10.957f, 11f, 12f, 11f)
            curveTo(13.043f, 11f, 13.75f, 10.256f, 13.75f, 9.5f)
            curveTo(13.75f, 8.744f, 13.043f, 8f, 12f, 8f)
            close()
            moveTo(14.191f, 11.716f)
            curveTo(14.979f, 12.301f, 15.5f, 13.2f, 15.5f, 14.25f)
            curveTo(15.5f, 16.111f, 13.864f, 17.5f, 12f, 17.5f)
            curveTo(10.136f, 17.5f, 8.5f, 16.111f, 8.5f, 14.25f)
            curveTo(8.5f, 13.2f, 9.02f, 12.301f, 9.809f, 11.716f)
            curveTo(9.166f, 11.179f, 8.75f, 10.402f, 8.75f, 9.5f)
            curveTo(8.75f, 7.771f, 10.281f, 6.5f, 12f, 6.5f)
            curveTo(13.719f, 6.5f, 15.25f, 7.771f, 15.25f, 9.5f)
            curveTo(15.25f, 10.402f, 14.833f, 11.179f, 14.191f, 11.716f)
            close()
            moveTo(12f, 12.5f)
            curveTo(10.827f, 12.5f, 10f, 13.349f, 10f, 14.25f)
            curveTo(10f, 15.151f, 10.827f, 16f, 12f, 16f)
            curveTo(13.173f, 16f, 14f, 15.151f, 14f, 14.25f)
            curveTo(14f, 13.349f, 13.173f, 12.5f, 12f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle8Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NumberCircle8, contentDescription = null)
    }
}
