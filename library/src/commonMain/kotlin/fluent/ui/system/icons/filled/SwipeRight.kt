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

public val FluentUi.Filled.SwipeRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SwipeRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 12f)
            curveTo(6f, 12.552f, 6.448f, 13f, 7f, 13f)
            horizontalLineTo(18.585f)
            lineTo(17.293f, 14.293f)
            curveTo(16.932f, 14.653f, 16.905f, 15.221f, 17.21f, 15.613f)
            lineTo(17.293f, 15.707f)
            curveTo(17.653f, 16.068f, 18.221f, 16.095f, 18.613f, 15.79f)
            lineTo(18.707f, 15.707f)
            lineTo(21.707f, 12.707f)
            curveTo(22.068f, 12.347f, 22.095f, 11.779f, 21.79f, 11.387f)
            lineTo(21.707f, 11.293f)
            lineTo(18.707f, 8.293f)
            curveTo(18.317f, 7.902f, 17.683f, 7.902f, 17.293f, 8.293f)
            curveTo(16.932f, 8.653f, 16.905f, 9.221f, 17.21f, 9.613f)
            lineTo(17.293f, 9.707f)
            lineTo(18.585f, 11f)
            horizontalLineTo(7f)
            curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 14.761f, 4.239f, 17f, 7f, 17f)
            curveTo(9.05f, 17f, 10.812f, 15.766f, 11.584f, 14f)
            lineTo(9.872f, 14.001f)
            curveTo(9.239f, 14.907f, 8.189f, 15.5f, 7f, 15.5f)
            curveTo(5.067f, 15.5f, 3.5f, 13.933f, 3.5f, 12f)
            curveTo(3.5f, 10.067f, 5.067f, 8.5f, 7f, 8.5f)
            curveTo(8.189f, 8.5f, 9.24f, 9.093f, 9.873f, 10f)
            lineTo(11.584f, 10f)
            curveTo(10.813f, 8.234f, 9.05f, 7f, 7f, 7f)
            curveTo(4.239f, 7f, 2f, 9.239f, 2f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SwipeRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SwipeRight, contentDescription = null)
    }
}
