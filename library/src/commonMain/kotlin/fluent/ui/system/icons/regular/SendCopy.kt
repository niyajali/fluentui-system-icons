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

public val FluentUi.Regular.SendCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SendCopy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 11.5f)
            curveTo(20.13f, 11.5f, 20.444f, 11.782f, 20.493f, 12.148f)
            lineTo(20.5f, 12.25f)
            verticalLineTo(17.25f)
            curveTo(20.5f, 19.801f, 18.49f, 21.882f, 15.967f, 21.995f)
            lineTo(15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.27f, 22f, 6.437f, 21.374f, 6.128f, 20.5f)
            lineTo(15.75f, 20.5f)
            lineTo(15.934f, 20.495f)
            curveTo(17.583f, 20.403f, 18.903f, 19.083f, 18.995f, 17.434f)
            lineTo(19f, 17.25f)
            verticalLineTo(12.25f)
            curveTo(19f, 11.836f, 19.336f, 11.5f, 19.75f, 11.5f)
            close()
            moveTo(17.25f, 9.5f)
            curveTo(17.63f, 9.5f, 17.944f, 9.782f, 17.993f, 10.148f)
            lineTo(18f, 10.25f)
            verticalLineTo(17.25f)
            curveTo(18f, 18.441f, 17.075f, 19.416f, 15.904f, 19.495f)
            lineTo(15.75f, 19.5f)
            horizontalLineTo(5.75f)
            curveTo(4.559f, 19.5f, 3.584f, 18.575f, 3.505f, 17.404f)
            lineTo(3.5f, 17.25f)
            verticalLineTo(10.25f)
            curveTo(3.5f, 9.836f, 3.836f, 9.5f, 4.25f, 9.5f)
            curveTo(4.63f, 9.5f, 4.943f, 9.782f, 4.993f, 10.148f)
            lineTo(5f, 10.25f)
            verticalLineTo(17.25f)
            curveTo(5f, 17.63f, 5.282f, 17.944f, 5.648f, 17.993f)
            lineTo(5.75f, 18f)
            horizontalLineTo(15.75f)
            curveTo(16.13f, 18f, 16.444f, 17.718f, 16.493f, 17.352f)
            lineTo(16.5f, 17.25f)
            verticalLineTo(10.25f)
            curveTo(16.5f, 9.836f, 16.836f, 9.5f, 17.25f, 9.5f)
            close()
            moveTo(6.218f, 6.216f)
            lineTo(10.216f, 2.22f)
            curveTo(10.482f, 1.954f, 10.898f, 1.929f, 11.192f, 2.147f)
            lineTo(11.276f, 2.219f)
            lineTo(15.28f, 6.216f)
            curveTo(15.573f, 6.508f, 15.573f, 6.983f, 15.281f, 7.276f)
            curveTo(15.014f, 7.543f, 14.598f, 7.568f, 14.304f, 7.35f)
            lineTo(14.22f, 7.277f)
            lineTo(11.5f, 4.563f)
            verticalLineTo(14.255f)
            curveTo(11.5f, 14.635f, 11.218f, 14.948f, 10.852f, 14.998f)
            lineTo(10.75f, 15.005f)
            curveTo(10.37f, 15.005f, 10.057f, 14.723f, 10.007f, 14.357f)
            lineTo(10f, 14.255f)
            verticalLineTo(4.556f)
            lineTo(7.279f, 7.277f)
            curveTo(7.013f, 7.543f, 6.596f, 7.567f, 6.302f, 7.35f)
            lineTo(6.218f, 7.277f)
            curveTo(5.952f, 7.011f, 5.928f, 6.594f, 6.146f, 6.3f)
            lineTo(6.218f, 6.216f)
            lineTo(10.216f, 2.22f)
            lineTo(6.218f, 6.216f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SendCopy, contentDescription = null)
    }
}
