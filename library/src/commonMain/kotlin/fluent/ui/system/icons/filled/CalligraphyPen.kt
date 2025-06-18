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

public val FluentUi.Filled.CalligraphyPen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalligraphyPen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 2.75f)
            curveTo(7.5f, 2.336f, 7.164f, 2f, 6.75f, 2f)
            curveTo(6.336f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(5.75f)
            curveTo(6f, 6.646f, 6.674f, 7.386f, 7.543f, 7.488f)
            lineTo(6.527f, 9.993f)
            curveTo(6.119f, 10.999f, 6.164f, 12.175f, 6.646f, 13.135f)
            lineTo(10.635f, 21.087f)
            curveTo(10.785f, 21.384f, 10.999f, 21.621f, 11.25f, 21.779f)
            verticalLineTo(12.299f)
            curveTo(10.802f, 12.04f, 10.5f, 11.555f, 10.5f, 11f)
            curveTo(10.5f, 10.172f, 11.172f, 9.5f, 12f, 9.5f)
            curveTo(12.828f, 9.5f, 13.5f, 10.172f, 13.5f, 11f)
            curveTo(13.5f, 11.555f, 13.198f, 12.04f, 12.75f, 12.299f)
            verticalLineTo(21.779f)
            curveTo(13.001f, 21.621f, 13.215f, 21.384f, 13.365f, 21.087f)
            lineTo(17.354f, 13.135f)
            curveTo(17.836f, 12.175f, 17.881f, 10.999f, 17.473f, 9.993f)
            lineTo(16.457f, 7.488f)
            curveTo(17.326f, 7.386f, 18f, 6.646f, 18f, 5.75f)
            verticalLineTo(2.75f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            curveTo(16.836f, 2f, 16.5f, 2.336f, 16.5f, 2.75f)
            verticalLineTo(5.75f)
            curveTo(16.5f, 5.888f, 16.388f, 6f, 16.25f, 6f)
            horizontalLineTo(7.75f)
            curveTo(7.612f, 6f, 7.5f, 5.888f, 7.5f, 5.75f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalligraphyPenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalligraphyPen, contentDescription = null)
    }
}
