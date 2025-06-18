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

public val FluentUi.Filled.DatabaseSwitch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabaseSwitch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 10f)
            curveTo(16.418f, 10f, 20f, 8.209f, 20f, 6f)
            curveTo(20f, 3.791f, 16.418f, 2f, 12f, 2f)
            curveTo(7.582f, 2f, 4f, 3.791f, 4f, 6f)
            curveTo(4f, 8.209f, 7.582f, 10f, 12f, 10f)
            close()
            moveTo(18.328f, 10.17f)
            curveTo(18.916f, 9.876f, 19.498f, 9.504f, 20f, 9.053f)
            verticalLineTo(15.522f)
            curveTo(19.473f, 15.446f, 18.918f, 15.611f, 18.513f, 16.016f)
            curveTo(17.975f, 16.554f, 17.86f, 17.354f, 18.168f, 18.004f)
            horizontalLineTo(15.832f)
            curveTo(16.14f, 17.354f, 16.025f, 16.554f, 15.487f, 16.016f)
            curveTo(14.804f, 15.333f, 13.696f, 15.333f, 13.012f, 16.017f)
            lineTo(10.512f, 18.518f)
            curveTo(10.184f, 18.846f, 10f, 19.291f, 10f, 19.755f)
            curveTo(10f, 20.219f, 10.185f, 20.665f, 10.513f, 20.993f)
            lineTo(11.513f, 21.993f)
            curveTo(7.322f, 21.867f, 4f, 20.127f, 4f, 18f)
            verticalLineTo(9.053f)
            curveTo(4.502f, 9.504f, 5.084f, 9.876f, 5.672f, 10.17f)
            curveTo(7.369f, 11.019f, 9.608f, 11.5f, 12f, 11.5f)
            curveTo(14.392f, 11.5f, 16.631f, 11.019f, 18.328f, 10.17f)
            close()
            moveTo(14.78f, 16.723f)
            curveTo(15.073f, 17.016f, 15.073f, 17.491f, 14.78f, 17.784f)
            lineTo(13.561f, 19.004f)
            horizontalLineTo(20.439f)
            lineTo(19.219f, 17.784f)
            curveTo(18.927f, 17.491f, 18.927f, 17.016f, 19.22f, 16.723f)
            curveTo(19.513f, 16.431f, 19.988f, 16.431f, 20.281f, 16.724f)
            lineTo(22.781f, 19.225f)
            curveTo(22.921f, 19.366f, 23f, 19.557f, 23f, 19.756f)
            curveTo(23f, 19.955f, 22.921f, 20.145f, 22.78f, 20.286f)
            lineTo(20.28f, 22.784f)
            curveTo(19.987f, 23.077f, 19.512f, 23.077f, 19.219f, 22.784f)
            curveTo(18.927f, 22.491f, 18.927f, 22.016f, 19.22f, 21.723f)
            lineTo(20.44f, 20.504f)
            horizontalLineTo(13.56f)
            lineTo(14.78f, 21.723f)
            curveTo(15.073f, 22.016f, 15.073f, 22.491f, 14.78f, 22.784f)
            curveTo(14.488f, 23.077f, 14.013f, 23.077f, 13.72f, 22.784f)
            lineTo(11.22f, 20.285f)
            curveTo(11.079f, 20.145f, 11f, 19.954f, 11f, 19.755f)
            curveTo(11f, 19.556f, 11.079f, 19.365f, 11.22f, 19.225f)
            lineTo(13.72f, 16.724f)
            curveTo(14.012f, 16.431f, 14.487f, 16.431f, 14.78f, 16.723f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabaseSwitchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DatabaseSwitch, contentDescription = null)
    }
}
