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

public val FluentUi.Filled.HomeHeart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeHeart",
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
            horizontalLineTo(13.367f)
            lineTo(11.304f, 18.868f)
            curveTo(9.823f, 17.335f, 9.608f, 15.01f, 10.636f, 13.247f)
            curveTo(11.082f, 12.481f, 11.752f, 11.843f, 12.56f, 11.448f)
            curveTo(13.981f, 10.753f, 15.677f, 10.868f, 17f, 11.784f)
            curveTo(18.19f, 10.96f, 19.681f, 10.785f, 21f, 11.261f)
            verticalLineTo(9.947f)
            curveTo(21f, 9.284f, 20.708f, 8.655f, 20.201f, 8.228f)
            lineTo(13.451f, 2.533f)
            close()
            moveTo(21.977f, 18.173f)
            curveTo(23.341f, 16.761f, 23.341f, 14.471f, 21.977f, 13.059f)
            curveTo(21.828f, 12.905f, 21.668f, 12.767f, 21.501f, 12.646f)
            curveTo(20.139f, 11.664f, 18.251f, 11.801f, 17.036f, 13.059f)
            horizontalLineTo(16.964f)
            curveTo(15.892f, 11.949f, 14.296f, 11.712f, 13f, 12.346f)
            curveTo(12.375f, 12.652f, 11.85f, 13.149f, 11.5f, 13.75f)
            curveTo(10.69f, 15.14f, 10.864f, 16.973f, 12.023f, 18.173f)
            lineTo(16.465f, 22.771f)
            curveTo(16.761f, 23.076f, 17.239f, 23.076f, 17.535f, 22.771f)
            lineTo(21.977f, 18.173f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomeHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HomeHeart, contentDescription = null)
    }
}
