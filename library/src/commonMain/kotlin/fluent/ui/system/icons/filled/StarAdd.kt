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

public val FluentIcons.Filled.StarAdd: ImageVector
    get() {
        if (_StarAdd != null) {
            return _StarAdd!!
        }
        _StarAdd = ImageVector.Builder(
            name = "Filled.StarAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.788f, 3.102f)
                curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
                lineTo(15.567f, 7.88f)
                lineTo(20.84f, 8.646f)
                curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
                lineTo(20.682f, 11.832f)
                curveTo(19.741f, 11.302f, 18.655f, 11f, 17.498f, 11f)
                curveTo(13.908f, 11f, 10.998f, 13.91f, 10.998f, 17.5f)
                curveTo(10.998f, 18.11f, 11.082f, 18.701f, 11.24f, 19.262f)
                lineTo(7.283f, 21.342f)
                curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
                lineTo(6.224f, 14.668f)
                lineTo(2.409f, 10.949f)
                curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
                lineTo(8.43f, 7.88f)
                lineTo(10.788f, 3.102f)
                close()
                moveTo(22.998f, 17.5f)
                curveTo(22.998f, 14.462f, 20.536f, 12f, 17.498f, 12f)
                curveTo(14.46f, 12f, 11.998f, 14.462f, 11.998f, 17.5f)
                curveTo(11.998f, 20.537f, 14.46f, 23f, 17.498f, 23f)
                curveTo(20.536f, 23f, 22.998f, 20.537f, 22.998f, 17.5f)
                close()
                moveTo(17.999f, 18f)
                lineTo(17.999f, 20.503f)
                curveTo(17.999f, 20.779f, 17.775f, 21.003f, 17.499f, 21.003f)
                curveTo(17.223f, 21.003f, 16.999f, 20.779f, 16.999f, 20.503f)
                lineTo(16.999f, 18f)
                horizontalLineTo(14.494f)
                curveTo(14.218f, 18f, 13.994f, 17.776f, 13.994f, 17.5f)
                curveTo(13.994f, 17.223f, 14.218f, 17f, 14.494f, 17f)
                horizontalLineTo(16.999f)
                lineTo(16.998f, 14.499f)
                curveTo(16.998f, 14.223f, 17.222f, 13.999f, 17.498f, 13.999f)
                curveTo(17.774f, 13.999f, 17.998f, 14.223f, 17.998f, 14.499f)
                lineTo(17.999f, 17f)
                horizontalLineTo(20.495f)
                curveTo(20.771f, 17f, 20.994f, 17.223f, 20.994f, 17.5f)
                curveTo(20.994f, 17.776f, 20.771f, 18f, 20.495f, 18f)
                horizontalLineTo(17.999f)
                close()
            }
        }.build()

        return _StarAdd!!
    }

@Suppress("ObjectPropertyName")
private var _StarAdd: ImageVector? = null

@Preview
@Composable
private fun StarAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarAdd, contentDescription = null)
    }
}
