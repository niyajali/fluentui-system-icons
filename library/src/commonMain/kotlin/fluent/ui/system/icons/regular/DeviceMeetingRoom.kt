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

public val FluentIcons.Regular.DeviceMeetingRoom: ImageVector
    get() {
        if (_DeviceMeetingRoom != null) {
            return _DeviceMeetingRoom!!
        }
        _DeviceMeetingRoom = ImageVector.Builder(
            name = "Regular.DeviceMeetingRoom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.069f, 3f)
                curveTo(5.654f, 3f, 4.423f, 3.97f, 4.092f, 5.346f)
                lineTo(2.1f, 13.619f)
                curveTo(1.563f, 15.852f, 3.255f, 18f, 5.552f, 18f)
                horizontalLineTo(18.444f)
                curveTo(20.74f, 18f, 22.433f, 15.852f, 21.895f, 13.619f)
                lineTo(19.903f, 5.346f)
                curveTo(19.572f, 3.97f, 18.341f, 3f, 16.926f, 3f)
                horizontalLineTo(7.069f)
                close()
                moveTo(5.55f, 5.697f)
                curveTo(5.719f, 4.995f, 6.347f, 4.5f, 7.069f, 4.5f)
                horizontalLineTo(16.926f)
                curveTo(17.648f, 4.5f, 18.276f, 4.995f, 18.445f, 5.697f)
                lineTo(20.437f, 13.97f)
                curveTo(20.747f, 15.26f, 19.77f, 16.5f, 18.444f, 16.5f)
                horizontalLineTo(5.552f)
                curveTo(4.225f, 16.5f, 3.248f, 15.26f, 3.559f, 13.97f)
                lineTo(5.55f, 5.697f)
                close()
                moveTo(6.748f, 19f)
                curveTo(6.333f, 19f, 5.998f, 19.336f, 5.998f, 19.75f)
                curveTo(5.998f, 20.164f, 6.333f, 20.5f, 6.748f, 20.5f)
                horizontalLineTo(17.248f)
                curveTo(17.662f, 20.5f, 17.998f, 20.164f, 17.998f, 19.75f)
                curveTo(17.998f, 19.336f, 17.662f, 19f, 17.248f, 19f)
                horizontalLineTo(6.748f)
                close()
            }
        }.build()

        return _DeviceMeetingRoom!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMeetingRoom: ImageVector? = null

@Preview
@Composable
private fun DeviceMeetingRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeviceMeetingRoom, contentDescription = null)
    }
}
