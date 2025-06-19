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

public val FluentIcons.Regular.BroadActivityFeed: ImageVector
    get() {
        if (_BroadActivityFeed != null) {
            return _BroadActivityFeed!!
        }
        _BroadActivityFeed = ImageVector.Builder(
            name = "Regular.BroadActivityFeed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.255f, 14.005f)
                curveTo(10.222f, 14.005f, 11.005f, 14.788f, 11.005f, 15.755f)
                verticalLineTo(19.253f)
                curveTo(11.005f, 20.22f, 10.222f, 21.003f, 9.255f, 21.003f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 21.003f, 2f, 20.22f, 2f, 19.253f)
                verticalLineTo(15.755f)
                curveTo(2f, 14.788f, 2.783f, 14.005f, 3.75f, 14.005f)
                horizontalLineTo(9.255f)
                close()
                moveTo(20.25f, 14.005f)
                curveTo(21.216f, 14.005f, 22f, 14.788f, 22f, 15.755f)
                verticalLineTo(19.253f)
                curveTo(22f, 20.22f, 21.216f, 21.003f, 20.25f, 21.003f)
                horizontalLineTo(14.745f)
                curveTo(13.778f, 21.003f, 12.995f, 20.22f, 12.995f, 19.253f)
                verticalLineTo(15.755f)
                curveTo(12.995f, 14.788f, 13.778f, 14.005f, 14.745f, 14.005f)
                horizontalLineTo(20.25f)
                close()
                moveTo(9.255f, 15.505f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 15.505f, 3.5f, 15.616f, 3.5f, 15.755f)
                verticalLineTo(19.253f)
                curveTo(3.5f, 19.392f, 3.612f, 19.503f, 3.75f, 19.503f)
                horizontalLineTo(9.255f)
                curveTo(9.393f, 19.503f, 9.505f, 19.392f, 9.505f, 19.253f)
                verticalLineTo(15.755f)
                curveTo(9.505f, 15.616f, 9.393f, 15.505f, 9.255f, 15.505f)
                close()
                moveTo(20.25f, 15.505f)
                horizontalLineTo(14.745f)
                curveTo(14.607f, 15.505f, 14.495f, 15.616f, 14.495f, 15.755f)
                verticalLineTo(19.253f)
                curveTo(14.495f, 19.392f, 14.607f, 19.503f, 14.745f, 19.503f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 19.503f, 20.5f, 19.392f, 20.5f, 19.253f)
                verticalLineTo(15.755f)
                curveTo(20.5f, 15.616f, 20.388f, 15.505f, 20.25f, 15.505f)
                close()
                moveTo(20.25f, 3f)
                curveTo(21.216f, 3f, 22f, 3.783f, 22f, 4.75f)
                verticalLineTo(10.25f)
                curveTo(22f, 11.217f, 21.216f, 12f, 20.25f, 12f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 12f, 2f, 11.217f, 2f, 10.25f)
                verticalLineTo(4.75f)
                curveTo(2f, 3.832f, 2.707f, 3.079f, 3.606f, 3.006f)
                lineTo(3.75f, 3f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.25f, 4.5f)
                horizontalLineTo(3.75f)
                lineTo(3.693f, 4.507f)
                curveTo(3.582f, 4.533f, 3.5f, 4.632f, 3.5f, 4.75f)
                verticalLineTo(10.25f)
                curveTo(3.5f, 10.388f, 3.612f, 10.5f, 3.75f, 10.5f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 10.5f, 20.5f, 10.388f, 20.5f, 10.25f)
                verticalLineTo(4.75f)
                curveTo(20.5f, 4.612f, 20.388f, 4.5f, 20.25f, 4.5f)
                close()
            }
        }.build()

        return _BroadActivityFeed!!
    }

@Suppress("ObjectPropertyName")
private var _BroadActivityFeed: ImageVector? = null

@Preview
@Composable
private fun BroadActivityFeedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BroadActivityFeed, contentDescription = null)
    }
}
