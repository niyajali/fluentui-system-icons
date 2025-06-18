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

public val FluentUi.Regular.DoubleSwipeDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DoubleSwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 6f)
            curveTo(7.13f, 6f, 7.443f, 6.282f, 7.493f, 6.648f)
            lineTo(7.5f, 6.75f)
            verticalLineTo(19.439f)
            lineTo(9.72f, 17.22f)
            curveTo(9.986f, 16.953f, 10.403f, 16.929f, 10.696f, 17.147f)
            lineTo(10.78f, 17.22f)
            curveTo(11.047f, 17.486f, 11.071f, 17.903f, 10.853f, 18.196f)
            lineTo(10.78f, 18.28f)
            lineTo(7.28f, 21.78f)
            curveTo(7.014f, 22.047f, 6.597f, 22.071f, 6.304f, 21.853f)
            lineTo(6.22f, 21.78f)
            lineTo(2.72f, 18.28f)
            curveTo(2.427f, 17.987f, 2.427f, 17.513f, 2.72f, 17.22f)
            curveTo(2.986f, 16.953f, 3.403f, 16.929f, 3.696f, 17.147f)
            lineTo(3.78f, 17.22f)
            lineTo(6f, 19.439f)
            verticalLineTo(6.75f)
            curveTo(6f, 6.336f, 6.336f, 6f, 6.75f, 6f)
            close()
            moveTo(17.248f, 6f)
            curveTo(17.627f, 6f, 17.941f, 6.282f, 17.991f, 6.648f)
            lineTo(17.998f, 6.75f)
            verticalLineTo(19.439f)
            lineTo(20.217f, 17.22f)
            curveTo(20.484f, 16.953f, 20.9f, 16.929f, 21.194f, 17.147f)
            lineTo(21.278f, 17.22f)
            curveTo(21.544f, 17.486f, 21.569f, 17.903f, 21.351f, 18.196f)
            lineTo(21.278f, 18.28f)
            lineTo(17.778f, 21.78f)
            curveTo(17.512f, 22.047f, 17.095f, 22.071f, 16.802f, 21.853f)
            lineTo(16.717f, 21.78f)
            lineTo(13.217f, 18.28f)
            curveTo(12.925f, 17.987f, 12.925f, 17.513f, 13.217f, 17.22f)
            curveTo(13.484f, 16.953f, 13.9f, 16.929f, 14.194f, 17.147f)
            lineTo(14.278f, 17.22f)
            lineTo(16.498f, 19.439f)
            verticalLineTo(6.75f)
            curveTo(16.498f, 6.336f, 16.833f, 6f, 17.248f, 6f)
            close()
            moveTo(6.75f, 2f)
            curveTo(9.373f, 2f, 11.5f, 4.127f, 11.5f, 6.75f)
            curveTo(11.5f, 8.755f, 10.258f, 10.47f, 8.501f, 11.167f)
            lineTo(8.502f, 9.488f)
            curveTo(9.403f, 8.91f, 10f, 7.9f, 10f, 6.75f)
            curveTo(10f, 4.955f, 8.545f, 3.5f, 6.75f, 3.5f)
            curveTo(4.955f, 3.5f, 3.5f, 4.955f, 3.5f, 6.75f)
            curveTo(3.5f, 7.9f, 4.098f, 8.911f, 4.999f, 9.489f)
            lineTo(5f, 11.167f)
            curveTo(3.243f, 10.47f, 2f, 8.755f, 2f, 6.75f)
            curveTo(2f, 4.127f, 4.127f, 2f, 6.75f, 2f)
            close()
            moveTo(17.248f, 2f)
            curveTo(19.871f, 2f, 21.998f, 4.127f, 21.998f, 6.75f)
            curveTo(21.998f, 8.755f, 20.756f, 10.47f, 18.999f, 11.167f)
            lineTo(18.999f, 9.488f)
            curveTo(19.9f, 8.91f, 20.498f, 7.9f, 20.498f, 6.75f)
            curveTo(20.498f, 4.955f, 19.043f, 3.5f, 17.248f, 3.5f)
            curveTo(15.453f, 3.5f, 13.998f, 4.955f, 13.998f, 6.75f)
            curveTo(13.998f, 7.9f, 14.595f, 8.911f, 15.497f, 9.489f)
            lineTo(15.498f, 11.167f)
            curveTo(13.74f, 10.47f, 12.498f, 8.755f, 12.498f, 6.75f)
            curveTo(12.498f, 4.127f, 14.624f, 2f, 17.248f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DoubleSwipeDown, contentDescription = null)
    }
}
