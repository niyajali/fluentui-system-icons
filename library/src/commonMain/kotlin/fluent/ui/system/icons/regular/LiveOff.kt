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

public val FluentUi.Regular.LiveOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LiveOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.418f, 5.479f)
            curveTo(1.032f, 9.408f, 1.202f, 15.344f, 4.929f, 19.071f)
            curveTo(5.222f, 19.364f, 5.697f, 19.364f, 5.99f, 19.071f)
            curveTo(6.282f, 18.778f, 6.282f, 18.303f, 5.99f, 18.01f)
            curveTo(2.849f, 14.87f, 2.68f, 9.883f, 5.482f, 6.543f)
            lineTo(7.26f, 8.321f)
            curveTo(5.428f, 10.674f, 5.594f, 14.079f, 7.757f, 16.243f)
            curveTo(8.05f, 16.535f, 8.525f, 16.535f, 8.818f, 16.243f)
            curveTo(9.111f, 15.95f, 9.111f, 15.475f, 8.818f, 15.182f)
            curveTo(7.241f, 13.605f, 7.079f, 11.15f, 8.332f, 9.392f)
            lineTo(10.551f, 11.612f)
            curveTo(10.518f, 11.736f, 10.5f, 11.866f, 10.5f, 12f)
            curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12f, 13.5f)
            curveTo(12.134f, 13.5f, 12.264f, 13.482f, 12.388f, 13.449f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(19.389f, 16.207f)
            lineTo(20.482f, 17.301f)
            curveTo(22.9f, 13.44f, 22.429f, 8.287f, 19.071f, 4.929f)
            curveTo(18.778f, 4.636f, 18.303f, 4.636f, 18.01f, 4.929f)
            curveTo(17.718f, 5.222f, 17.718f, 5.697f, 18.01f, 5.99f)
            curveTo(20.779f, 8.758f, 21.239f, 12.962f, 19.389f, 16.207f)
            close()
            moveTo(16.347f, 13.165f)
            lineTo(17.525f, 14.343f)
            curveTo(18.451f, 12.159f, 18.023f, 9.538f, 16.243f, 7.757f)
            curveTo(15.95f, 7.464f, 15.475f, 7.464f, 15.182f, 7.757f)
            curveTo(14.889f, 8.05f, 14.889f, 8.525f, 15.182f, 8.818f)
            curveTo(16.36f, 9.996f, 16.748f, 11.664f, 16.347f, 13.165f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LiveOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LiveOff, contentDescription = null)
    }
}
