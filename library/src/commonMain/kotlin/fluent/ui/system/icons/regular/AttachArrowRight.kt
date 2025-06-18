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

public val FluentUi.Regular.AttachArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AttachArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.772f, 3.744f)
            curveTo(14.114f, 1.4f, 17.913f, 1.4f, 20.256f, 3.744f)
            curveTo(22.463f, 5.951f, 22.591f, 9.45f, 20.64f, 11.807f)
            curveTo(20.176f, 11.551f, 19.677f, 11.35f, 19.153f, 11.212f)
            lineTo(19.197f, 11.168f)
            curveTo(20.952f, 9.411f, 20.952f, 6.562f, 19.195f, 4.804f)
            curveTo(17.493f, 3.102f, 14.766f, 3.049f, 12.999f, 4.645f)
            lineTo(12.831f, 4.804f)
            lineTo(12.819f, 4.819f)
            lineTo(3.282f, 14.355f)
            curveTo(2.989f, 14.648f, 2.515f, 14.648f, 2.222f, 14.355f)
            curveTo(1.955f, 14.089f, 1.931f, 13.672f, 2.149f, 13.378f)
            lineTo(2.222f, 13.294f)
            lineTo(11.771f, 3.744f)
            lineTo(11.772f, 3.744f)
            close()
            moveTo(11.212f, 19.151f)
            curveTo(11.352f, 19.685f, 11.558f, 20.193f, 11.821f, 20.664f)
            lineTo(11.443f, 21.041f)
            lineTo(11.407f, 21.072f)
            curveTo(9.945f, 22.388f, 7.691f, 22.344f, 6.284f, 20.936f)
            curveTo(4.965f, 19.617f, 4.843f, 17.555f, 5.918f, 16.098f)
            curveTo(5.941f, 16.052f, 5.969f, 16.009f, 6.002f, 15.968f)
            lineTo(6.056f, 15.908f)
            lineTo(6.143f, 15.82f)
            lineTo(6.284f, 15.672f)
            lineTo(6.287f, 15.675f)
            lineTo(13.723f, 8.221f)
            curveTo(13.989f, 7.954f, 14.405f, 7.93f, 14.699f, 8.147f)
            lineTo(14.783f, 8.22f)
            curveTo(15.05f, 8.485f, 15.075f, 8.902f, 14.857f, 9.196f)
            lineTo(14.785f, 9.28f)
            lineTo(7.19f, 16.893f)
            curveTo(6.473f, 17.769f, 6.522f, 19.063f, 7.34f, 19.881f)
            curveTo(8.169f, 20.71f, 9.488f, 20.749f, 10.364f, 19.999f)
            lineTo(11.212f, 19.151f)
            close()
            moveTo(23.001f, 17.501f)
            curveTo(23.001f, 20.538f, 20.538f, 23.001f, 17.501f, 23.001f)
            curveTo(14.463f, 23.001f, 12.001f, 20.538f, 12.001f, 17.501f)
            curveTo(12.001f, 14.463f, 14.463f, 12.001f, 17.501f, 12.001f)
            curveTo(20.538f, 12.001f, 23.001f, 14.463f, 23.001f, 17.501f)
            close()
            moveTo(14.501f, 17.001f)
            curveTo(14.224f, 17.001f, 14.001f, 17.225f, 14.001f, 17.501f)
            curveTo(14.001f, 17.777f, 14.224f, 18.001f, 14.501f, 18.001f)
            horizontalLineTo(19.294f)
            lineTo(17.647f, 19.647f)
            curveTo(17.452f, 19.842f, 17.452f, 20.159f, 17.647f, 20.354f)
            curveTo(17.842f, 20.549f, 18.159f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(21.049f, 17.659f, 21.049f, 17.342f, 20.854f, 17.147f)
            lineTo(18.354f, 14.647f)
            curveTo(18.159f, 14.452f, 17.842f, 14.452f, 17.647f, 14.647f)
            curveTo(17.452f, 14.842f, 17.452f, 15.159f, 17.647f, 15.354f)
            lineTo(19.294f, 17.001f)
            lineTo(14.501f, 17.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AttachArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AttachArrowRight, contentDescription = null)
    }
}
