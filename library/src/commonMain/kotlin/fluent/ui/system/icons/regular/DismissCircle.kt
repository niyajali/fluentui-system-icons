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

public val FluentUi.Regular.DismissCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissCircle",
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
            moveTo(12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            close()
            moveTo(15.446f, 8.397f)
            lineTo(15.53f, 8.47f)
            curveTo(15.797f, 8.736f, 15.821f, 9.153f, 15.603f, 9.446f)
            lineTo(15.53f, 9.53f)
            lineTo(13.061f, 12f)
            lineTo(15.53f, 14.47f)
            curveTo(15.797f, 14.736f, 15.821f, 15.153f, 15.603f, 15.446f)
            lineTo(15.53f, 15.53f)
            curveTo(15.264f, 15.797f, 14.847f, 15.821f, 14.554f, 15.603f)
            lineTo(14.47f, 15.53f)
            lineTo(12f, 13.061f)
            lineTo(9.53f, 15.53f)
            curveTo(9.264f, 15.797f, 8.847f, 15.821f, 8.554f, 15.603f)
            lineTo(8.47f, 15.53f)
            curveTo(8.203f, 15.264f, 8.179f, 14.847f, 8.397f, 14.554f)
            lineTo(8.47f, 14.47f)
            lineTo(10.939f, 12f)
            lineTo(8.47f, 9.53f)
            curveTo(8.203f, 9.264f, 8.179f, 8.847f, 8.397f, 8.554f)
            lineTo(8.47f, 8.47f)
            curveTo(8.736f, 8.203f, 9.153f, 8.179f, 9.446f, 8.397f)
            lineTo(9.53f, 8.47f)
            lineTo(12f, 10.939f)
            lineTo(14.47f, 8.47f)
            curveTo(14.736f, 8.203f, 15.153f, 8.179f, 15.446f, 8.397f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DismissCircle, contentDescription = null)
    }
}
