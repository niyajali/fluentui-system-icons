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

public val FluentUi.Regular.NumberCircle2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(10.351f, 8.951f)
            lineTo(10.35f, 8.953f)
            curveTo(10.101f, 9.282f, 9.633f, 9.348f, 9.302f, 9.1f)
            curveTo(8.971f, 8.852f, 8.903f, 8.382f, 9.151f, 8.051f)
            lineTo(9.152f, 8.05f)
            curveTo(9.174f, 8.021f, 9.197f, 7.992f, 9.22f, 7.965f)
            curveTo(9.258f, 7.919f, 9.312f, 7.858f, 9.381f, 7.786f)
            curveTo(9.517f, 7.644f, 9.716f, 7.456f, 9.973f, 7.269f)
            curveTo(10.486f, 6.896f, 11.262f, 6.5f, 12.25f, 6.5f)
            curveTo(14.045f, 6.5f, 15.499f, 7.955f, 15.5f, 9.75f)
            curveTo(15.5f, 10.778f, 15.069f, 11.497f, 14.465f, 12.031f)
            curveTo(14.004f, 12.438f, 13.412f, 12.757f, 12.897f, 13.034f)
            curveTo(12.798f, 13.087f, 12.703f, 13.138f, 12.611f, 13.188f)
            curveTo(11.995f, 13.528f, 11.481f, 13.853f, 11.111f, 14.304f)
            curveTo(10.865f, 14.603f, 10.664f, 14.98f, 10.565f, 15.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 15.5f, 15.5f, 15.836f, 15.5f, 16.25f)
            curveTo(15.5f, 16.664f, 15.164f, 17f, 14.75f, 17f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 17f, 9f, 16.664f, 9f, 16.25f)
            curveTo(9f, 14.996f, 9.364f, 14.067f, 9.952f, 13.352f)
            curveTo(10.519f, 12.663f, 11.255f, 12.222f, 11.889f, 11.874f)
            curveTo(12.008f, 11.808f, 12.122f, 11.746f, 12.232f, 11.687f)
            curveTo(12.746f, 11.409f, 13.152f, 11.189f, 13.472f, 10.907f)
            curveTo(13.805f, 10.612f, 14f, 10.284f, 14f, 9.75f)
            curveTo(13.999f, 8.783f, 13.216f, 8f, 12.25f, 8f)
            curveTo(11.675f, 8f, 11.203f, 8.229f, 10.856f, 8.481f)
            curveTo(10.685f, 8.606f, 10.552f, 8.731f, 10.464f, 8.823f)
            curveTo(10.421f, 8.869f, 10.389f, 8.905f, 10.37f, 8.928f)
            curveTo(10.361f, 8.939f, 10.354f, 8.947f, 10.351f, 8.951f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NumberCircle2, contentDescription = null)
    }
}
