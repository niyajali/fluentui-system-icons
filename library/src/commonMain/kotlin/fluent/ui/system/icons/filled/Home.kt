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

public val FluentUi.Filled.Home: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.451f, 2.533f)
            curveTo(12.613f, 1.826f, 11.387f, 1.826f, 10.549f, 2.533f)
            lineTo(3.799f, 8.228f)
            curveTo(3.292f, 8.655f, 3f, 9.284f, 3f, 9.947f)
            verticalLineTo(19.253f)
            curveTo(3f, 20.219f, 3.783f, 21.003f, 4.75f, 21.003f)
            horizontalLineTo(7.75f)
            curveTo(8.717f, 21.003f, 9.5f, 20.219f, 9.5f, 19.253f)
            verticalLineTo(15.25f)
            curveTo(9.5f, 14.571f, 10.042f, 14.018f, 10.717f, 14f)
            horizontalLineTo(13.283f)
            curveTo(13.958f, 14.018f, 14.5f, 14.571f, 14.5f, 15.25f)
            verticalLineTo(19.253f)
            curveTo(14.5f, 20.219f, 15.283f, 21.003f, 16.25f, 21.003f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 21.003f, 21f, 20.219f, 21f, 19.253f)
            verticalLineTo(9.947f)
            curveTo(21f, 9.284f, 20.708f, 8.655f, 20.201f, 8.228f)
            lineTo(13.451f, 2.533f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Home, contentDescription = null)
    }
}
