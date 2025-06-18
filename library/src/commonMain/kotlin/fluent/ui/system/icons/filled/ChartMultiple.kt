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

public val FluentUi.Filled.ChartMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChartMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 9.455f)
            verticalLineTo(9.402f)
            curveTo(19.986f, 5.312f, 16.665f, 2f, 12.571f, 2f)
            curveTo(12.535f, 2f, 12.499f, 2f, 12.463f, 2.001f)
            curveTo(12.201f, 2.005f, 12f, 2.224f, 12f, 2.485f)
            verticalLineTo(9.5f)
            curveTo(12f, 9.776f, 12.224f, 10f, 12.5f, 10f)
            horizontalLineTo(19.515f)
            curveTo(19.776f, 10f, 19.996f, 9.799f, 19.999f, 9.537f)
            curveTo(20f, 9.51f, 20f, 9.483f, 20f, 9.455f)
            close()
            moveTo(10.5f, 4.5f)
            curveTo(10.5f, 4.224f, 10.275f, 3.998f, 10f, 4.016f)
            curveTo(6.091f, 4.274f, 3f, 7.526f, 3f, 11.5f)
            curveTo(3f, 15.642f, 6.358f, 19f, 10.5f, 19f)
            curveTo(10.686f, 19f, 10.871f, 18.993f, 11.054f, 18.98f)
            curveTo(11.294f, 17.849f, 12.298f, 17f, 13.5f, 17f)
            curveTo(14.063f, 17f, 14.582f, 17.186f, 15f, 17.5f)
            verticalLineTo(16.5f)
            curveTo(15f, 15.119f, 16.119f, 14f, 17.5f, 14f)
            curveTo(17.524f, 14f, 17.549f, 14f, 17.573f, 14.001f)
            curveTo(17.796f, 13.369f, 17.938f, 12.697f, 17.984f, 12f)
            curveTo(18.002f, 11.724f, 17.776f, 11.5f, 17.5f, 11.5f)
            lineTo(11.5f, 11.5f)
            curveTo(10.948f, 11.5f, 10.5f, 11.052f, 10.5f, 10.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(20f, 13.5f)
            curveTo(20f, 12.672f, 20.672f, 12f, 21.5f, 12f)
            curveTo(22.328f, 12f, 23f, 12.672f, 23f, 13.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
            curveTo(20.672f, 23f, 20f, 22.328f, 20f, 21.5f)
            verticalLineTo(13.5f)
            close()
            moveTo(17.5f, 15f)
            curveTo(16.672f, 15f, 16f, 15.672f, 16f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(16f, 22.328f, 16.672f, 23f, 17.5f, 23f)
            curveTo(18.328f, 23f, 19f, 22.328f, 19f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(19f, 15.672f, 18.328f, 15f, 17.5f, 15f)
            close()
            moveTo(13.5f, 18f)
            curveTo(12.672f, 18f, 12f, 18.672f, 12f, 19.5f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            curveTo(14.328f, 23f, 15f, 22.328f, 15f, 21.5f)
            verticalLineTo(19.5f)
            curveTo(15f, 18.672f, 14.328f, 18f, 13.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChartMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChartMultiple, contentDescription = null)
    }
}
