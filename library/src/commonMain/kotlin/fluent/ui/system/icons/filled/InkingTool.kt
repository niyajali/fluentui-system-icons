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

public val FluentIcons.Filled.InkingTool: ImageVector
    get() {
        if (_InkingTool != null) {
            return _InkingTool!!
        }
        _InkingTool = ImageVector.Builder(
            name = "Filled.InkingTool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.82f, 20.041f)
                curveTo(13.698f, 20.496f, 13.51f, 20.921f, 13.257f, 21.315f)
                curveTo(13.134f, 21.505f, 12.971f, 21.665f, 12.778f, 21.782f)
                curveTo(12.113f, 22.189f, 11.256f, 22.016f, 10.79f, 21.394f)
                lineTo(10.708f, 21.272f)
                lineTo(10.584f, 21.053f)
                curveTo(10.417f, 20.74f, 10.286f, 20.402f, 10.191f, 20.039f)
                curveTo(10.014f, 19.374f, 9.962f, 18.692f, 10.035f, 17.999f)
                lineTo(13.965f, 18f)
                curveTo(14.039f, 18.721f, 13.991f, 19.402f, 13.82f, 20.041f)
                close()
                moveTo(18.477f, 8.999f)
                lineTo(15.012f, 16.085f)
                curveTo(14.79f, 16.539f, 14.388f, 16.867f, 13.917f, 17f)
                lineTo(10.178f, 16.999f)
                lineTo(10.071f, 16.969f)
                curveTo(9.7f, 16.841f, 9.377f, 16.589f, 9.163f, 16.249f)
                lineTo(9.078f, 16.098f)
                lineTo(5.536f, 8.999f)
                horizontalLineTo(18.477f)
                close()
                moveTo(20.25f, 1.998f)
                curveTo(20.629f, 1.998f, 20.943f, 2.28f, 20.993f, 2.646f)
                lineTo(21f, 2.748f)
                verticalLineTo(6.248f)
                curveTo(21f, 7.166f, 20.293f, 7.919f, 19.393f, 7.992f)
                lineTo(19.25f, 7.998f)
                horizontalLineTo(4.752f)
                curveTo(3.834f, 7.998f, 3.081f, 7.291f, 3.008f, 6.392f)
                lineTo(3.002f, 6.248f)
                verticalLineTo(2.748f)
                curveTo(3.002f, 2.368f, 3.284f, 2.055f, 3.65f, 2.005f)
                lineTo(3.752f, 1.998f)
                horizontalLineTo(20.25f)
                close()
            }
        }.build()

        return _InkingTool!!
    }

@Suppress("ObjectPropertyName")
private var _InkingTool: ImageVector? = null

@Preview
@Composable
private fun InkingToolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.InkingTool, contentDescription = null)
    }
}
