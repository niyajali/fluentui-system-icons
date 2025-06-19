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

public val FluentIcons.Filled.ArrowUndo: ImageVector
    get() {
        if (_ArrowUndo != null) {
            return _ArrowUndo!!
        }
        _ArrowUndo = ImageVector.Builder(
            name = "Filled.ArrowUndo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.907f, 6.68f)
                lineTo(9.641f, 3.951f)
                curveTo(12.242f, 1.35f, 16.46f, 1.35f, 19.061f, 3.951f)
                curveTo(21.662f, 6.552f, 21.662f, 10.769f, 19.061f, 13.371f)
                lineTo(10.722f, 21.708f)
                curveTo(10.332f, 22.098f, 9.699f, 22.098f, 9.308f, 21.708f)
                curveTo(8.918f, 21.317f, 8.918f, 20.684f, 9.308f, 20.293f)
                lineTo(17.647f, 11.957f)
                curveTo(19.467f, 10.136f, 19.467f, 7.185f, 17.647f, 5.365f)
                curveTo(15.883f, 3.602f, 13.059f, 3.547f, 11.229f, 5.2f)
                lineTo(11.055f, 5.366f)
                lineTo(7.414f, 8.999f)
                lineTo(12f, 9f)
                curveTo(12.513f, 9f, 12.936f, 9.386f, 12.993f, 9.883f)
                lineTo(13f, 10f)
                curveTo(13f, 10.512f, 12.614f, 10.935f, 12.117f, 10.993f)
                lineTo(12f, 11f)
                lineTo(4.94f, 10.998f)
                lineTo(4.845f, 10.988f)
                lineTo(4.733f, 10.964f)
                lineTo(4.602f, 10.917f)
                lineTo(4.52f, 10.877f)
                lineTo(4.418f, 10.813f)
                curveTo(4.374f, 10.781f, 4.332f, 10.746f, 4.293f, 10.706f)
                lineTo(4.201f, 10.601f)
                lineTo(4.127f, 10.487f)
                lineTo(4.081f, 10.394f)
                lineTo(4.043f, 10.289f)
                lineTo(4.027f, 10.231f)
                lineTo(4.011f, 10.15f)
                lineTo(4.004f, 10.089f)
                lineTo(4f, 10f)
                verticalLineTo(3.002f)
                curveTo(4f, 2.45f, 4.448f, 2.002f, 5f, 2.002f)
                curveTo(5.513f, 2.002f, 5.936f, 2.388f, 5.993f, 2.886f)
                lineTo(6f, 3.002f)
                verticalLineTo(7.586f)
                lineTo(9.641f, 3.951f)
                lineTo(6.907f, 6.68f)
                close()
            }
        }.build()

        return _ArrowUndo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUndo: ImageVector? = null

@Preview
@Composable
private fun ArrowUndoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowUndo, contentDescription = null)
    }
}
