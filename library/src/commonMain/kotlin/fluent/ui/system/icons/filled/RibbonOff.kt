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

public val FluentUi.Filled.RibbonOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.454f, 6.515f)
            curveTo(5.161f, 7.287f, 5f, 8.125f, 5f, 9f)
            curveTo(5f, 12.866f, 8.134f, 16f, 12f, 16f)
            curveTo(12.875f, 16f, 13.713f, 15.839f, 14.485f, 15.546f)
            lineTo(15.251f, 16.312f)
            curveTo(14.258f, 16.754f, 13.158f, 17f, 12f, 17f)
            curveTo(10.108f, 17f, 8.37f, 16.344f, 7.001f, 15.246f)
            lineTo(7.003f, 21.245f)
            curveTo(7.003f, 21.853f, 7.687f, 22.208f, 8.184f, 21.858f)
            lineTo(12.001f, 19.171f)
            lineTo(15.819f, 21.858f)
            curveTo(16.316f, 22.208f, 17.001f, 21.853f, 17.001f, 21.245f)
            lineTo(17.001f, 18.062f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(5.454f, 6.515f)
            close()
            moveTo(7.142f, 3.96f)
            lineTo(17.04f, 13.858f)
            curveTo(18.253f, 12.599f, 19f, 10.887f, 19f, 9f)
            curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
            curveTo(10.113f, 2f, 8.401f, 2.746f, 7.142f, 3.96f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RibbonOff, contentDescription = null)
    }
}
