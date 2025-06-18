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

public val FluentUi.Regular.NumberCircle7: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle7",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(11.12f, 17.49f)
            curveTo(11.17f, 17.5f, 11.25f, 17.5f, 11.25f, 17.5f)
            verticalLineTo(17.51f)
            curveTo(11.61f, 17.51f, 11.93f, 17.26f, 11.99f, 16.89f)
            curveTo(12.85f, 11.77f, 15.79f, 8.28f, 15.82f, 8.25f)
            curveTo(16.01f, 8.03f, 16.05f, 7.72f, 15.93f, 7.45f)
            curveTo(15.81f, 7.18f, 15.54f, 7.01f, 15.25f, 7.01f)
            horizontalLineTo(8.75f)
            curveTo(8.34f, 7.01f, 8f, 7.35f, 8f, 7.76f)
            curveTo(8f, 8.17f, 8.34f, 8.51f, 8.75f, 8.51f)
            horizontalLineTo(13.76f)
            curveTo(12.73f, 10.04f, 11.13f, 12.92f, 10.5f, 16.63f)
            curveTo(10.44f, 17.03f, 10.71f, 17.42f, 11.12f, 17.49f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle7Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle7, contentDescription = null)
    }
}
