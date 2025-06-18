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

public val FluentUi.Regular.ArrowDownload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownload",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 20.501f)
            curveTo(18.664f, 20.501f, 19f, 20.837f, 19f, 21.251f)
            curveTo(19f, 21.665f, 18.664f, 22.001f, 18.25f, 22.001f)
            lineTo(5.25f, 22.005f)
            curveTo(4.836f, 22.005f, 4.5f, 21.669f, 4.5f, 21.255f)
            curveTo(4.5f, 20.841f, 4.836f, 20.505f, 5.25f, 20.505f)
            lineTo(18.25f, 20.501f)
            close()
            moveTo(11.648f, 2.013f)
            lineTo(11.75f, 2.006f)
            curveTo(12.13f, 2.006f, 12.443f, 2.288f, 12.493f, 2.654f)
            lineTo(12.5f, 2.756f)
            lineTo(12.499f, 16.441f)
            lineTo(16.221f, 12.72f)
            curveTo(16.487f, 12.454f, 16.904f, 12.43f, 17.197f, 12.648f)
            lineTo(17.281f, 12.721f)
            curveTo(17.548f, 12.987f, 17.572f, 13.404f, 17.354f, 13.697f)
            lineTo(17.281f, 13.781f)
            lineTo(12.284f, 18.778f)
            curveTo(12.018f, 19.044f, 11.601f, 19.068f, 11.308f, 18.851f)
            lineTo(11.224f, 18.778f)
            lineTo(6.22f, 13.782f)
            curveTo(5.927f, 13.489f, 5.927f, 13.014f, 6.219f, 12.721f)
            curveTo(6.485f, 12.455f, 6.902f, 12.43f, 7.196f, 12.648f)
            lineTo(7.28f, 12.72f)
            lineTo(10.999f, 16.434f)
            lineTo(11f, 2.756f)
            curveTo(11f, 2.376f, 11.282f, 2.062f, 11.648f, 2.013f)
            lineTo(11.75f, 2.006f)
            lineTo(11.648f, 2.013f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowDownload, contentDescription = null)
    }
}
