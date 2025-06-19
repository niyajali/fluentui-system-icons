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

public val FluentIcons.Regular.PenOff: ImageVector
    get() {
        if (_PenOff != null) {
            return _PenOff!!
        }
        _PenOff = ImageVector.Builder(
            name = "Regular.PenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.939f, 10f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.512f, 2.22f, 2.219f)
                curveTo(2.513f, 1.926f, 2.987f, 1.926f, 3.28f, 2.219f)
                lineTo(21.78f, 20.719f)
                curveTo(22.073f, 21.012f, 22.073f, 21.487f, 21.78f, 21.78f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.78f)
                lineTo(14f, 15.061f)
                lineTo(9.002f, 20.059f)
                curveTo(8.595f, 20.466f, 8.084f, 20.751f, 7.525f, 20.885f)
                lineTo(2.924f, 21.98f)
                curveTo(2.67f, 22.04f, 2.404f, 21.965f, 2.22f, 21.781f)
                curveTo(2.036f, 21.597f, 1.96f, 21.33f, 2.02f, 21.077f)
                lineTo(3.116f, 16.475f)
                curveTo(3.249f, 15.916f, 3.535f, 15.405f, 3.941f, 14.999f)
                lineTo(8.939f, 10f)
                close()
                moveTo(12.939f, 14f)
                lineTo(10f, 11.061f)
                lineTo(5.002f, 16.059f)
                curveTo(4.792f, 16.269f, 4.644f, 16.534f, 4.575f, 16.823f)
                lineTo(3.762f, 20.239f)
                lineTo(7.178f, 19.425f)
                curveTo(7.467f, 19.356f, 7.731f, 19.209f, 7.941f, 18.999f)
                lineTo(12.939f, 14f)
                close()
                moveTo(19.891f, 7.047f)
                lineTo(15.06f, 11.879f)
                lineTo(16.121f, 12.939f)
                lineTo(19f, 10.06f)
                curveTo(19.678f, 10.744f, 19.676f, 11.848f, 18.994f, 12.53f)
                lineTo(17.353f, 14.171f)
                lineTo(18.414f, 15.232f)
                lineTo(20.055f, 13.591f)
                curveTo(21.322f, 12.323f, 21.324f, 10.269f, 20.06f, 9f)
                lineTo(20.952f, 8.108f)
                curveTo(22.349f, 6.71f, 22.349f, 4.445f, 20.952f, 3.047f)
                curveTo(19.554f, 1.65f, 17.288f, 1.65f, 15.891f, 3.047f)
                lineTo(11.06f, 7.879f)
                lineTo(12.121f, 8.939f)
                lineTo(16.952f, 4.108f)
                curveTo(17.763f, 3.296f, 19.08f, 3.296f, 19.891f, 4.108f)
                curveTo(20.703f, 4.919f, 20.703f, 6.235f, 19.891f, 7.047f)
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
        Image(imageVector = FluentIcons.Regular.PenOff, contentDescription = null)
    }
}
