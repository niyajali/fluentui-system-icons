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

public val FluentIcons.Regular.CellularOff: ImageVector
    get() {
        if (_CellularOff != null) {
            return _CellularOff!!
        }
        _CellularOff = ImageVector.Builder(
            name = "Regular.CellularOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(11f, 12.061f)
                verticalLineTo(19.25f)
                lineTo(11.007f, 19.352f)
                curveTo(11.057f, 19.718f, 11.37f, 20f, 11.75f, 20f)
                curveTo(12.164f, 20f, 12.5f, 19.664f, 12.5f, 19.25f)
                verticalLineTo(13.561f)
                lineTo(15f, 16.061f)
                verticalLineTo(19.25f)
                lineTo(15.007f, 19.352f)
                curveTo(15.057f, 19.718f, 15.37f, 20f, 15.75f, 20f)
                curveTo(16.164f, 20f, 16.5f, 19.664f, 16.5f, 19.25f)
                verticalLineTo(17.561f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19f, 15.818f)
                lineTo(20.5f, 17.318f)
                verticalLineTo(5.742f)
                lineTo(20.492f, 5.641f)
                curveTo(20.439f, 5.275f, 20.122f, 4.996f, 19.743f, 5f)
                curveTo(19.329f, 5.004f, 18.996f, 5.343f, 19f, 5.757f)
                verticalLineTo(15.818f)
                close()
                moveTo(15f, 11.818f)
                lineTo(16.5f, 13.318f)
                verticalLineTo(8.75f)
                lineTo(16.493f, 8.648f)
                curveTo(16.444f, 8.282f, 16.13f, 8f, 15.75f, 8f)
                curveTo(15.336f, 8f, 15f, 8.336f, 15f, 8.75f)
                verticalLineTo(11.818f)
                close()
                moveTo(3.75f, 17f)
                curveTo(4.13f, 17f, 4.443f, 17.282f, 4.493f, 17.648f)
                lineTo(4.5f, 17.75f)
                verticalLineTo(19.25f)
                curveTo(4.5f, 19.664f, 4.164f, 20f, 3.75f, 20f)
                curveTo(3.37f, 20f, 3.057f, 19.718f, 3.007f, 19.352f)
                lineTo(3f, 19.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                close()
                moveTo(7.75f, 14f)
                curveTo(8.13f, 14f, 8.443f, 14.282f, 8.493f, 14.648f)
                lineTo(8.5f, 14.75f)
                verticalLineTo(19.249f)
                curveTo(8.5f, 19.663f, 8.164f, 19.999f, 7.75f, 19.999f)
                curveTo(7.37f, 19.999f, 7.057f, 19.717f, 7.007f, 19.351f)
                lineTo(7f, 19.249f)
                verticalLineTo(14.75f)
                curveTo(7f, 14.336f, 7.336f, 14f, 7.75f, 14f)
                close()
            }
        }.build()

        return _CellularOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellularOff: ImageVector? = null

@Preview
@Composable
private fun CellularOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CellularOff, contentDescription = null)
    }
}
