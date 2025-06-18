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

public val FluentUi.Regular.PlugConnected: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlugConnected",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.49f, 5.571f)
            curveTo(20.28f, 6.587f, 20.75f, 7.864f, 20.75f, 9.25f)
            curveTo(20.75f, 11.533f, 19.475f, 13.519f, 17.597f, 14.533f)
            curveTo(16.948f, 14.883f, 16.167f, 14.667f, 15.645f, 14.146f)
            lineTo(9.854f, 8.355f)
            curveTo(9.333f, 7.833f, 9.117f, 7.052f, 9.467f, 6.403f)
            curveTo(10.481f, 4.525f, 12.467f, 3.25f, 14.75f, 3.25f)
            curveTo(16.136f, 3.25f, 17.413f, 3.72f, 18.429f, 4.51f)
            lineTo(20.72f, 2.22f)
            curveTo(21.013f, 1.927f, 21.487f, 1.927f, 21.78f, 2.22f)
            curveTo(22.073f, 2.513f, 22.073f, 2.987f, 21.78f, 3.28f)
            lineTo(19.49f, 5.571f)
            close()
            moveTo(17.473f, 12.833f)
            curveTo(18.553f, 12.011f, 19.25f, 10.711f, 19.25f, 9.25f)
            curveTo(19.25f, 6.765f, 17.235f, 4.75f, 14.75f, 4.75f)
            curveTo(13.289f, 4.75f, 11.989f, 5.446f, 11.167f, 6.527f)
            curveTo(10.901f, 6.876f, 10.981f, 7.36f, 11.292f, 7.67f)
            lineTo(16.33f, 12.708f)
            curveTo(16.64f, 13.019f, 17.124f, 13.099f, 17.473f, 12.833f)
            close()
            moveTo(3.28f, 21.78f)
            lineTo(5.571f, 19.49f)
            curveTo(6.587f, 20.28f, 7.863f, 20.75f, 9.25f, 20.75f)
            curveTo(11.533f, 20.75f, 13.519f, 19.475f, 14.533f, 17.597f)
            curveTo(14.883f, 16.948f, 14.667f, 16.167f, 14.145f, 15.646f)
            lineTo(8.354f, 9.854f)
            curveTo(7.833f, 9.333f, 7.052f, 9.117f, 6.403f, 9.467f)
            curveTo(4.525f, 10.481f, 3.25f, 12.467f, 3.25f, 14.75f)
            curveTo(3.25f, 16.137f, 3.72f, 17.413f, 4.51f, 18.429f)
            lineTo(2.22f, 20.72f)
            curveTo(1.927f, 21.013f, 1.927f, 21.487f, 2.22f, 21.78f)
            curveTo(2.513f, 22.073f, 2.987f, 22.073f, 3.28f, 21.78f)
            close()
            moveTo(7.67f, 11.292f)
            lineTo(12.708f, 16.33f)
            curveTo(13.019f, 16.64f, 13.099f, 17.124f, 12.833f, 17.473f)
            curveTo(12.01f, 18.553f, 10.71f, 19.25f, 9.25f, 19.25f)
            curveTo(6.765f, 19.25f, 4.75f, 17.235f, 4.75f, 14.75f)
            curveTo(4.75f, 13.289f, 5.446f, 11.989f, 6.527f, 11.167f)
            curveTo(6.876f, 10.901f, 7.36f, 10.981f, 7.67f, 11.292f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlugConnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PlugConnected, contentDescription = null)
    }
}
