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

public val FluentUi.Filled.StarOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(7.024f, 8.085f)
            lineTo(3.159f, 8.646f)
            curveTo(2.052f, 8.807f, 1.61f, 10.168f, 2.411f, 10.949f)
            lineTo(6.226f, 14.668f)
            lineTo(5.326f, 19.919f)
            curveTo(5.137f, 21.022f, 6.294f, 21.863f, 7.284f, 21.342f)
            lineTo(12f, 18.863f)
            lineTo(16.716f, 21.342f)
            curveTo(17.707f, 21.863f, 18.864f, 21.022f, 18.675f, 19.919f)
            lineTo(18.637f, 19.698f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(21.59f, 10.949f)
            lineTo(17.813f, 14.631f)
            lineTo(9.301f, 6.119f)
            lineTo(10.79f, 3.103f)
            curveTo(11.285f, 2.099f, 12.716f, 2.099f, 13.211f, 3.103f)
            lineTo(15.569f, 7.88f)
            lineTo(20.841f, 8.646f)
            curveTo(21.949f, 8.807f, 22.391f, 10.168f, 21.59f, 10.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarOff, contentDescription = null)
    }
}
