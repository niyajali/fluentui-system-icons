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

public val FluentUi.Filled.AlertSnooze: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertSnooze",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 7f)
            horizontalLineTo(12.75f)
            lineTo(12.649f, 7.007f)
            curveTo(12.283f, 7.057f, 12f, 7.37f, 12f, 7.75f)
            curveTo(12f, 8.164f, 12.336f, 8.5f, 12.75f, 8.5f)
            horizontalLineTo(13.793f)
            lineTo(12.14f, 10.814f)
            lineTo(12.085f, 10.903f)
            curveTo(11.828f, 11.389f, 12.176f, 12f, 12.75f, 12f)
            horizontalLineTo(15.25f)
            lineTo(15.352f, 11.993f)
            curveTo(15.718f, 11.943f, 16f, 11.63f, 16f, 11.25f)
            curveTo(16f, 10.836f, 15.665f, 10.5f, 15.25f, 10.5f)
            horizontalLineTo(14.208f)
            lineTo(15.861f, 8.186f)
            lineTo(15.916f, 8.097f)
            curveTo(16.173f, 7.611f, 15.825f, 7f, 15.25f, 7f)
            close()
            moveTo(21.25f, 2f)
            horizontalLineTo(17.75f)
            lineTo(17.649f, 2.007f)
            curveTo(17.282f, 2.057f, 17f, 2.37f, 17f, 2.75f)
            curveTo(17f, 3.164f, 17.336f, 3.5f, 17.75f, 3.5f)
            horizontalLineTo(19.884f)
            lineTo(17.118f, 7.847f)
            lineTo(17.069f, 7.937f)
            curveTo(16.843f, 8.421f, 17.193f, 9f, 17.75f, 9f)
            horizontalLineTo(21.25f)
            lineTo(21.352f, 8.993f)
            curveTo(21.718f, 8.943f, 22f, 8.63f, 22f, 8.25f)
            curveTo(22f, 7.836f, 21.665f, 7.5f, 21.25f, 7.5f)
            horizontalLineTo(19.117f)
            lineTo(21.883f, 3.153f)
            lineTo(21.932f, 3.063f)
            curveTo(22.158f, 2.579f, 21.807f, 2f, 21.25f, 2f)
            close()
            moveTo(12.699f, 5.5f)
            horizontalLineTo(15.25f)
            curveTo(15.758f, 5.5f, 16.206f, 5.658f, 16.566f, 5.919f)
            lineTo(17.195f, 4.931f)
            curveTo(16.258f, 4.693f, 15.555f, 3.868f, 15.503f, 2.87f)
            curveTo(14.457f, 2.317f, 13.265f, 2.004f, 12f, 2.004f)
            curveTo(7.956f, 2.004f, 4.644f, 5.21f, 4.505f, 9.241f)
            lineTo(4.5f, 9.491f)
            lineTo(4.5f, 13.503f)
            lineTo(3.085f, 16.663f)
            curveTo(2.871f, 17.142f, 3.085f, 17.704f, 3.564f, 17.919f)
            curveTo(3.686f, 17.973f, 3.818f, 18.001f, 3.952f, 18.001f)
            horizontalLineTo(20.052f)
            curveTo(20.576f, 18.001f, 21.002f, 17.576f, 21.002f, 17.052f)
            curveTo(21.002f, 16.917f, 20.973f, 16.785f, 20.918f, 16.663f)
            lineTo(19.5f, 13.502f)
            verticalLineTo(10.5f)
            horizontalLineTo(17.75f)
            curveTo(17.615f, 10.5f, 17.485f, 10.489f, 17.36f, 10.468f)
            curveTo(17.45f, 10.711f, 17.5f, 10.975f, 17.5f, 11.25f)
            curveTo(17.5f, 12.39f, 16.653f, 13.33f, 15.553f, 13.479f)
            lineTo(15.503f, 13.486f)
            lineTo(15.3f, 13.5f)
            horizontalLineTo(12.75f)
            curveTo(11.02f, 13.5f, 9.985f, 11.665f, 10.758f, 10.203f)
            lineTo(10.781f, 10.158f)
            lineTo(10.89f, 9.983f)
            lineTo(11.272f, 9.447f)
            curveTo(10.799f, 9.035f, 10.5f, 8.427f, 10.5f, 7.75f)
            curveTo(10.5f, 6.61f, 11.347f, 5.67f, 12.446f, 5.52f)
            lineTo(12.497f, 5.514f)
            lineTo(12.699f, 5.5f)
            close()
            moveTo(14.958f, 19.003f)
            curveTo(14.72f, 20.421f, 13.486f, 21.501f, 12f, 21.501f)
            curveTo(10.514f, 21.501f, 9.28f, 20.421f, 9.042f, 19.003f)
            horizontalLineTo(14.958f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertSnoozePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AlertSnooze, contentDescription = null)
    }
}
