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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DoubleSwipeUp: ImageVector
    get() {
        if (_DoubleSwipeUp != null) {
            return _DoubleSwipeUp!!
        }
        _DoubleSwipeUp = ImageVector.Builder(
            name = "Regular.DoubleSwipeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 18f)
                curveTo(7.13f, 18f, 7.443f, 17.718f, 7.493f, 17.352f)
                lineTo(7.5f, 17.25f)
                verticalLineTo(4.561f)
                lineTo(9.72f, 6.78f)
                curveTo(9.986f, 7.047f, 10.403f, 7.071f, 10.696f, 6.853f)
                lineTo(10.78f, 6.78f)
                curveTo(11.047f, 6.514f, 11.071f, 6.097f, 10.853f, 5.804f)
                lineTo(10.78f, 5.72f)
                lineTo(7.28f, 2.22f)
                curveTo(7.014f, 1.953f, 6.597f, 1.929f, 6.304f, 2.147f)
                lineTo(6.22f, 2.22f)
                lineTo(2.72f, 5.72f)
                curveTo(2.427f, 6.013f, 2.427f, 6.487f, 2.72f, 6.78f)
                curveTo(2.986f, 7.047f, 3.403f, 7.071f, 3.696f, 6.853f)
                lineTo(3.78f, 6.78f)
                lineTo(6f, 4.561f)
                verticalLineTo(17.25f)
                curveTo(6f, 17.664f, 6.336f, 18f, 6.75f, 18f)
                close()
                moveTo(17.248f, 18f)
                curveTo(17.627f, 18f, 17.941f, 17.718f, 17.991f, 17.352f)
                lineTo(17.998f, 17.25f)
                verticalLineTo(4.561f)
                lineTo(20.217f, 6.78f)
                curveTo(20.484f, 7.047f, 20.9f, 7.071f, 21.194f, 6.853f)
                lineTo(21.278f, 6.78f)
                curveTo(21.544f, 6.514f, 21.569f, 6.097f, 21.351f, 5.804f)
                lineTo(21.278f, 5.72f)
                lineTo(17.778f, 2.22f)
                curveTo(17.512f, 1.953f, 17.095f, 1.929f, 16.802f, 2.147f)
                lineTo(16.717f, 2.22f)
                lineTo(13.217f, 5.72f)
                curveTo(12.925f, 6.013f, 12.925f, 6.487f, 13.217f, 6.78f)
                curveTo(13.484f, 7.047f, 13.9f, 7.071f, 14.194f, 6.853f)
                lineTo(14.278f, 6.78f)
                lineTo(16.498f, 4.561f)
                verticalLineTo(17.25f)
                curveTo(16.498f, 17.664f, 16.833f, 18f, 17.248f, 18f)
                close()
                moveTo(6.75f, 22f)
                curveTo(9.373f, 22f, 11.5f, 19.873f, 11.5f, 17.25f)
                curveTo(11.5f, 15.245f, 10.258f, 13.53f, 8.501f, 12.833f)
                lineTo(8.502f, 14.512f)
                curveTo(9.403f, 15.09f, 10f, 16.1f, 10f, 17.25f)
                curveTo(10f, 19.045f, 8.545f, 20.5f, 6.75f, 20.5f)
                curveTo(4.955f, 20.5f, 3.5f, 19.045f, 3.5f, 17.25f)
                curveTo(3.5f, 16.1f, 4.098f, 15.089f, 4.999f, 14.511f)
                lineTo(5f, 12.833f)
                curveTo(3.243f, 13.53f, 2f, 15.245f, 2f, 17.25f)
                curveTo(2f, 19.873f, 4.127f, 22f, 6.75f, 22f)
                close()
                moveTo(17.248f, 22f)
                curveTo(19.871f, 22f, 21.998f, 19.873f, 21.998f, 17.25f)
                curveTo(21.998f, 15.245f, 20.756f, 13.53f, 18.999f, 12.833f)
                lineTo(18.999f, 14.512f)
                curveTo(19.9f, 15.09f, 20.498f, 16.1f, 20.498f, 17.25f)
                curveTo(20.498f, 19.045f, 19.043f, 20.5f, 17.248f, 20.5f)
                curveTo(15.453f, 20.5f, 13.998f, 19.045f, 13.998f, 17.25f)
                curveTo(13.998f, 16.1f, 14.595f, 15.089f, 15.497f, 14.511f)
                lineTo(15.498f, 12.833f)
                curveTo(13.74f, 13.53f, 12.498f, 15.245f, 12.498f, 17.25f)
                curveTo(12.498f, 19.873f, 14.624f, 22f, 17.248f, 22f)
                close()
            }
        }.build()

        return _DoubleSwipeUp!!
    }

@Suppress("ObjectPropertyName")
private var _DoubleSwipeUp: ImageVector? = null

@Preview
@Composable
private fun DoubleSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DoubleSwipeUp, contentDescription = null)
    }
}
