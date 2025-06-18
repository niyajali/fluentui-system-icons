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

public val FluentUi.Regular.ArrowUpload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpload",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.25f, 3.51f)
            curveTo(18.664f, 3.51f, 19f, 3.174f, 19f, 2.76f)
            curveTo(19f, 2.346f, 18.664f, 2.01f, 18.25f, 2.01f)
            lineTo(5.25f, 2.006f)
            curveTo(4.836f, 2.006f, 4.5f, 2.341f, 4.5f, 2.756f)
            curveTo(4.5f, 3.17f, 4.836f, 3.506f, 5.25f, 3.506f)
            lineTo(18.25f, 3.51f)
            close()
            moveTo(11.648f, 21.998f)
            lineTo(11.75f, 22.005f)
            curveTo(12.13f, 22.005f, 12.443f, 21.722f, 12.493f, 21.356f)
            lineTo(12.5f, 21.255f)
            lineTo(12.499f, 7.57f)
            lineTo(16.221f, 11.29f)
            curveTo(16.487f, 11.556f, 16.904f, 11.58f, 17.197f, 11.363f)
            lineTo(17.281f, 11.29f)
            curveTo(17.548f, 11.024f, 17.572f, 10.607f, 17.354f, 10.313f)
            lineTo(17.281f, 10.229f)
            lineTo(12.284f, 5.233f)
            curveTo(12.018f, 4.967f, 11.601f, 4.942f, 11.308f, 5.16f)
            lineTo(11.224f, 5.232f)
            lineTo(6.22f, 10.229f)
            curveTo(5.927f, 10.522f, 5.927f, 10.997f, 6.219f, 11.29f)
            curveTo(6.485f, 11.556f, 6.902f, 11.58f, 7.196f, 11.363f)
            lineTo(7.28f, 11.29f)
            lineTo(10.999f, 7.577f)
            lineTo(11f, 21.255f)
            curveTo(11f, 21.634f, 11.282f, 21.948f, 11.648f, 21.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUploadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowUpload, contentDescription = null)
    }
}
