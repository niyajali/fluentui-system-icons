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

public val FluentUi.Regular.InkingTool: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.InkingTool",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 2.75f)
            curveTo(4.5f, 2.336f, 4.164f, 2f, 3.75f, 2f)
            curveTo(3.336f, 2f, 3f, 2.336f, 3f, 2.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 7.216f, 3.783f, 8f, 4.75f, 8f)
            horizontalLineTo(5.015f)
            lineTo(9.051f, 16.968f)
            curveTo(9.255f, 17.422f, 9.638f, 17.759f, 10.095f, 17.911f)
            curveTo(10.027f, 18.262f, 10f, 18.633f, 10f, 19f)
            curveTo(10f, 19.671f, 10.091f, 20.366f, 10.363f, 20.921f)
            curveTo(10.655f, 21.516f, 11.193f, 22f, 12f, 22f)
            curveTo(12.807f, 22f, 13.345f, 21.516f, 13.637f, 20.921f)
            curveTo(13.909f, 20.366f, 14f, 19.671f, 14f, 19f)
            curveTo(14f, 18.633f, 13.973f, 18.262f, 13.905f, 17.911f)
            curveTo(14.362f, 17.759f, 14.745f, 17.422f, 14.949f, 16.968f)
            lineTo(18.985f, 8f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 8f, 21f, 7.216f, 21f, 6.25f)
            verticalLineTo(2.75f)
            curveTo(21f, 2.336f, 20.664f, 2f, 20.25f, 2f)
            curveTo(19.836f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 6.388f, 19.388f, 6.5f, 19.25f, 6.5f)
            horizontalLineTo(18.517f)
            curveTo(18.506f, 6.5f, 18.495f, 6.5f, 18.484f, 6.5f)
            horizontalLineTo(5.516f)
            curveTo(5.505f, 6.5f, 5.494f, 6.5f, 5.483f, 6.5f)
            horizontalLineTo(4.75f)
            curveTo(4.612f, 6.5f, 4.5f, 6.388f, 4.5f, 6.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(6.66f, 8f)
            horizontalLineTo(17.34f)
            lineTo(13.581f, 16.353f)
            curveTo(13.541f, 16.442f, 13.452f, 16.5f, 13.353f, 16.5f)
            horizontalLineTo(10.647f)
            curveTo(10.548f, 16.5f, 10.459f, 16.442f, 10.419f, 16.353f)
            lineTo(6.66f, 8f)
            close()
            moveTo(11.613f, 18f)
            horizontalLineTo(12.387f)
            curveTo(12.458f, 18.256f, 12.5f, 18.594f, 12.5f, 19f)
            curveTo(12.5f, 19.572f, 12.417f, 20.002f, 12.29f, 20.261f)
            curveTo(12.182f, 20.48f, 12.095f, 20.5f, 12f, 20.5f)
            curveTo(11.905f, 20.5f, 11.818f, 20.48f, 11.71f, 20.261f)
            curveTo(11.583f, 20.002f, 11.5f, 19.572f, 11.5f, 19f)
            curveTo(11.5f, 18.594f, 11.542f, 18.256f, 11.613f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun InkingToolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.InkingTool, contentDescription = null)
    }
}
