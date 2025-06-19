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

public val FluentIcons.Filled.DataBarVerticalAdd: ImageVector
    get() {
        if (_DataBarVerticalAdd != null) {
            return _DataBarVerticalAdd!!
        }
        _DataBarVerticalAdd = ImageVector.Builder(
            name = "Filled.DataBarVerticalAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.249f, 3f)
                curveTo(17.007f, 3f, 16f, 4.007f, 16f, 5.249f)
                verticalLineTo(11.174f)
                curveTo(16.481f, 11.06f, 16.983f, 11f, 17.498f, 11f)
                horizontalLineTo(17.5f)
                curveTo(18.581f, 11f, 19.601f, 11.264f, 20.498f, 11.731f)
                verticalLineTo(5.249f)
                curveTo(20.498f, 4.007f, 19.491f, 3f, 18.249f, 3f)
                close()
                moveTo(13.998f, 9.249f)
                verticalLineTo(12.022f)
                curveTo(12.194f, 13.177f, 10.998f, 15.199f, 10.998f, 17.5f)
                curveTo(10.998f, 18.782f, 11.37f, 19.978f, 12.01f, 20.985f)
                curveTo(11.925f, 20.995f, 11.837f, 21f, 11.749f, 21f)
                curveTo(10.507f, 21f, 9.5f, 19.993f, 9.5f, 18.751f)
                verticalLineTo(9.249f)
                curveTo(9.5f, 8.007f, 10.507f, 7f, 11.749f, 7f)
                curveTo(12.991f, 7f, 13.998f, 8.007f, 13.998f, 9.249f)
                close()
                moveTo(3f, 13.249f)
                curveTo(3f, 12.007f, 4.007f, 11f, 5.249f, 11f)
                curveTo(6.491f, 11f, 7.498f, 12.007f, 7.498f, 13.249f)
                verticalLineTo(18.751f)
                curveTo(7.498f, 19.993f, 6.491f, 21f, 5.249f, 21f)
                curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.751f)
                verticalLineTo(13.249f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _DataBarVerticalAdd!!
    }

@Suppress("ObjectPropertyName")
private var _DataBarVerticalAdd: ImageVector? = null

@Preview
@Composable
private fun DataBarVerticalAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataBarVerticalAdd, contentDescription = null)
    }
}
