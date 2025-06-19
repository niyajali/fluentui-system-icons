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

public val FluentIcons.Filled.Wifi4: ImageVector
    get() {
        if (_Wifi4 != null) {
            return _Wifi4!!
        }
        _Wifi4 = ImageVector.Builder(
            name = "Filled.Wifi4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.959f, 18.567f)
                curveTo(11.545f, 19.153f, 12.496f, 19.153f, 13.082f, 18.567f)
                curveTo(13.668f, 17.981f, 13.668f, 17.031f, 13.082f, 16.444f)
                curveTo(12.496f, 15.858f, 11.545f, 15.858f, 10.959f, 16.444f)
                curveTo(10.373f, 17.031f, 10.373f, 17.981f, 10.959f, 18.567f)
                close()
            }
        }.build()

        return _Wifi4!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi4: ImageVector? = null

@Preview
@Composable
private fun Wifi4Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Wifi4, contentDescription = null)
    }
}
