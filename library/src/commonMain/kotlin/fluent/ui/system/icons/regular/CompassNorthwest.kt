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

public val FluentIcons.Regular.CompassNorthwest: ImageVector
    get() {
        if (_CompassNorthwest != null) {
            return _CompassNorthwest!!
        }
        _CompassNorthwest = ImageVector.Builder(
            name = "Regular.CompassNorthwest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(7.083f, 8.708f)
                curveTo(6.677f, 7.688f, 7.688f, 6.677f, 8.707f, 7.084f)
                lineTo(12.736f, 8.689f)
                curveTo(13.908f, 9.156f, 14.846f, 10.07f, 15.343f, 11.23f)
                lineTo(17.197f, 15.556f)
                curveTo(17.641f, 16.593f, 16.593f, 17.642f, 15.556f, 17.197f)
                lineTo(11.23f, 15.343f)
                curveTo(10.07f, 14.846f, 9.156f, 13.908f, 8.689f, 12.736f)
                lineTo(7.083f, 8.708f)
                close()
                moveTo(8.692f, 8.692f)
                lineTo(10.082f, 12.181f)
                curveTo(10.402f, 12.983f, 11.027f, 13.625f, 11.821f, 13.965f)
                lineTo(15.572f, 15.572f)
                lineTo(13.964f, 11.821f)
                curveTo(13.624f, 11.028f, 12.982f, 10.402f, 12.18f, 10.082f)
                lineTo(8.692f, 8.692f)
                close()
            }
        }.build()

        return _CompassNorthwest!!
    }

@Suppress("ObjectPropertyName")
private var _CompassNorthwest: ImageVector? = null

@Preview
@Composable
private fun CompassNorthwestPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CompassNorthwest, contentDescription = null)
    }
}
