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

public val FluentIcons.Filled.PenOff: ImageVector
    get() {
        if (_PenOff != null) {
            return _PenOff!!
        }
        _PenOff = ImageVector.Builder(
            name = "Filled.PenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 15.061f)
                lineTo(20.719f, 21.78f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
                curveTo(22.073f, 21.487f, 22.073f, 21.012f, 21.78f, 20.719f)
                lineTo(3.28f, 2.219f)
                curveTo(2.987f, 1.926f, 2.513f, 1.926f, 2.22f, 2.219f)
                curveTo(1.927f, 2.512f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(8.939f, 10f)
                lineTo(3.941f, 14.999f)
                curveTo(3.535f, 15.405f, 3.249f, 15.916f, 3.116f, 16.475f)
                lineTo(2.02f, 21.077f)
                curveTo(1.96f, 21.33f, 2.036f, 21.597f, 2.22f, 21.781f)
                curveTo(2.404f, 21.965f, 2.67f, 22.04f, 2.924f, 21.98f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.751f, 8.595f, 20.466f, 9.002f, 20.059f)
                lineTo(14f, 15.061f)
                close()
                moveTo(18.995f, 12.53f)
                lineTo(17.354f, 14.172f)
                lineTo(18.414f, 15.233f)
                lineTo(20.056f, 13.591f)
                curveTo(21.324f, 12.323f, 21.325f, 10.269f, 20.061f, 8.999f)
                lineTo(20.952f, 8.108f)
                curveTo(22.349f, 6.71f, 22.349f, 4.445f, 20.952f, 3.047f)
                curveTo(19.554f, 1.65f, 17.288f, 1.65f, 15.891f, 3.047f)
                lineTo(11.06f, 7.879f)
                lineTo(16.121f, 12.939f)
                lineTo(19f, 10.06f)
                curveTo(19.679f, 10.744f, 19.677f, 11.848f, 18.995f, 12.53f)
                close()
            }
        }.build()

        return _PenOff!!
    }

@Suppress("ObjectPropertyName")
private var _PenOff: ImageVector? = null

@Preview
@Composable
private fun PenOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PenOff, contentDescription = null)
    }
}
