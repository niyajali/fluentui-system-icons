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

public val FluentIcons.Filled.NavigationUnread: ImageVector
    get() {
        if (_NavigationUnread != null) {
            return _NavigationUnread!!
        }
        _NavigationUnread = ImageVector.Builder(
            name = "Filled.NavigationUnread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.25f, 8.5f)
                curveTo(20.769f, 8.5f, 22f, 7.269f, 22f, 5.75f)
                curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
                curveTo(17.731f, 3f, 16.5f, 4.231f, 16.5f, 5.75f)
                curveTo(16.5f, 7.269f, 17.731f, 8.5f, 19.25f, 8.5f)
                close()
                moveTo(15.713f, 7f)
                curveTo(15.575f, 6.609f, 15.5f, 6.188f, 15.5f, 5.75f)
                curveTo(15.5f, 5.493f, 15.526f, 5.242f, 15.575f, 5f)
                horizontalLineTo(3f)
                lineTo(2.883f, 5.007f)
                curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
                curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(15.713f)
                close()
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                lineTo(2.883f, 17.007f)
                curveTo(2.386f, 17.065f, 2f, 17.487f, 2f, 18f)
                curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
                horizontalLineTo(21f)
                lineTo(21.117f, 18.993f)
                curveTo(21.614f, 18.935f, 22f, 18.513f, 22f, 18f)
                curveTo(22f, 17.448f, 21.552f, 17f, 21f, 17f)
                close()
                moveTo(3f, 11f)
                lineTo(21f, 10.998f)
                curveTo(21.552f, 10.998f, 22f, 11.445f, 22f, 11.998f)
                curveTo(22f, 12.51f, 21.614f, 12.933f, 21.117f, 12.991f)
                lineTo(21f, 12.998f)
                lineTo(3f, 13f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                curveTo(2f, 11.487f, 2.386f, 11.065f, 2.883f, 11.007f)
                lineTo(3f, 11f)
                close()
            }
        }.build()

        return _NavigationUnread!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationUnread: ImageVector? = null

@Preview
@Composable
private fun NavigationUnreadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NavigationUnread, contentDescription = null)
    }
}
