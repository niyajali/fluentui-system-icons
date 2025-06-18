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

public val FluentUi.Regular.Power: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Power",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.204f, 4.82f)
            curveTo(8.58f, 4.645f, 9.026f, 4.808f, 9.201f, 5.183f)
            curveTo(9.376f, 5.559f, 9.213f, 6.005f, 8.838f, 6.18f)
            curveTo(6.214f, 7.403f, 4.5f, 10.042f, 4.5f, 12.991f)
            curveTo(4.5f, 17.139f, 7.858f, 20.5f, 11.999f, 20.5f)
            curveTo(16.14f, 20.5f, 19.498f, 17.139f, 19.498f, 12.991f)
            curveTo(19.498f, 10.048f, 17.791f, 7.414f, 15.175f, 6.187f)
            curveTo(14.8f, 6.011f, 14.639f, 5.565f, 14.815f, 5.19f)
            curveTo(14.991f, 4.815f, 15.437f, 4.653f, 15.812f, 4.829f)
            curveTo(18.95f, 6.301f, 20.998f, 9.461f, 20.998f, 12.991f)
            curveTo(20.998f, 17.967f, 16.969f, 22f, 11.999f, 22f)
            curveTo(7.029f, 22f, 3f, 17.967f, 3f, 12.991f)
            curveTo(3f, 9.453f, 5.056f, 6.288f, 8.204f, 4.82f)
            close()
            moveTo(11.999f, 2.496f)
            curveTo(12.379f, 2.496f, 12.692f, 2.778f, 12.742f, 3.144f)
            lineTo(12.749f, 3.246f)
            verticalLineTo(10.746f)
            curveTo(12.749f, 11.16f, 12.413f, 11.496f, 11.999f, 11.496f)
            curveTo(11.619f, 11.496f, 11.306f, 11.214f, 11.256f, 10.848f)
            lineTo(11.249f, 10.746f)
            verticalLineTo(3.246f)
            curveTo(11.249f, 2.832f, 11.585f, 2.496f, 11.999f, 2.496f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PowerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Power, contentDescription = null)
    }
}
