package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.DeviceMeetingRoomRemote: ImageVector
    get() {
        if (_DeviceMeetingRoomRemote != null) {
            return _DeviceMeetingRoomRemote!!
        }
        _DeviceMeetingRoomRemote = ImageVector.Builder(
            name = "Filled.DeviceMeetingRoomRemote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.073f, 3f)
                curveTo(5.658f, 3f, 4.427f, 3.97f, 4.095f, 5.346f)
                lineTo(3.328f, 8.532f)
                curveTo(3.466f, 8.511f, 3.607f, 8.5f, 3.75f, 8.5f)
                horizontalLineTo(7.75f)
                curveTo(9.269f, 8.5f, 10.5f, 9.731f, 10.5f, 11.25f)
                verticalLineTo(18f)
                horizontalLineTo(18.448f)
                curveTo(20.745f, 18f, 22.437f, 15.852f, 21.9f, 13.619f)
                lineTo(19.908f, 5.346f)
                curveTo(19.577f, 3.97f, 18.346f, 3f, 16.93f, 3f)
                horizontalLineTo(7.073f)
                close()
                moveTo(10.489f, 20.5f)
                curveTo(10.497f, 20.418f, 10.5f, 20.334f, 10.5f, 20.25f)
                verticalLineTo(19f)
                horizontalLineTo(17.251f)
                curveTo(17.665f, 19f, 18.001f, 19.336f, 18.001f, 19.75f)
                curveTo(18.001f, 20.164f, 17.665f, 20.5f, 17.251f, 20.5f)
                horizontalLineTo(10.489f)
                close()
                moveTo(5.75f, 14.5f)
                curveTo(6.441f, 14.5f, 7f, 13.94f, 7f, 13.25f)
                curveTo(7f, 12.56f, 6.441f, 12f, 5.75f, 12f)
                curveTo(5.06f, 12f, 4.5f, 12.56f, 4.5f, 13.25f)
                curveTo(4.5f, 13.94f, 5.06f, 14.5f, 5.75f, 14.5f)
                close()
                moveTo(2f, 11.25f)
                curveTo(2f, 10.283f, 2.784f, 9.5f, 3.75f, 9.5f)
                horizontalLineTo(7.75f)
                curveTo(8.717f, 9.5f, 9.501f, 10.283f, 9.501f, 11.25f)
                verticalLineTo(20.25f)
                curveTo(9.501f, 21.216f, 8.717f, 22f, 7.75f, 22f)
                horizontalLineTo(3.75f)
                curveTo(2.784f, 22f, 2f, 21.216f, 2f, 20.25f)
                verticalLineTo(11.25f)
                close()
                moveTo(3.75f, 11f)
                curveTo(3.612f, 11f, 3.5f, 11.112f, 3.5f, 11.25f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.388f, 3.612f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(7.75f)
                curveTo(7.889f, 20.5f, 8f, 20.388f, 8f, 20.25f)
                verticalLineTo(11.25f)
                curveTo(8f, 11.112f, 7.889f, 11f, 7.75f, 11f)
                horizontalLineTo(3.75f)
                close()
            }
        }.build()

        return _DeviceMeetingRoomRemote!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMeetingRoomRemote: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomRemotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DeviceMeetingRoomRemote, contentDescription = null)
    }
}
