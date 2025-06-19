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

public val FluentIcons.Filled.MegaphoneOff: ImageVector
    get() {
        if (_MegaphoneOff != null) {
            return _MegaphoneOff!!
        }
        _MegaphoneOff = ImageVector.Builder(
            name = "Filled.MegaphoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(6.725f, 7.786f)
                lineTo(3.609f, 8.712f)
                curveTo(2.655f, 8.996f, 2f, 9.873f, 2f, 10.869f)
                verticalLineTo(13.131f)
                curveTo(2f, 14.127f, 2.654f, 15.004f, 3.609f, 15.288f)
                lineTo(5.999f, 15.998f)
                lineTo(6f, 16.499f)
                lineTo(6.005f, 16.699f)
                curveTo(6.109f, 18.815f, 7.858f, 20.499f, 10f, 20.499f)
                curveTo(11.558f, 20.499f, 12.938f, 19.601f, 13.595f, 18.256f)
                lineTo(18.718f, 19.779f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(7.499f, 16.444f)
                lineTo(12.124f, 17.82f)
                curveTo(11.678f, 18.535f, 10.885f, 18.999f, 10f, 18.999f)
                curveTo(8.619f, 18.999f, 7.5f, 17.88f, 7.5f, 16.499f)
                lineTo(7.499f, 16.444f)
                close()
                moveTo(22f, 17.738f)
                curveTo(22f, 18.056f, 21.934f, 18.359f, 21.815f, 18.633f)
                lineTo(9.996f, 6.814f)
                lineTo(19.109f, 4.106f)
                curveTo(20.3f, 3.752f, 21.553f, 4.431f, 21.907f, 5.622f)
                curveTo(21.969f, 5.83f, 22f, 6.046f, 22f, 6.263f)
                verticalLineTo(17.738f)
                close()
            }
        }.build()

        return _MegaphoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneOff: ImageVector? = null

@Preview
@Composable
private fun MegaphoneOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MegaphoneOff, contentDescription = null)
    }
}
