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

public val FluentIcons.Filled.CallEnd: ImageVector
    get() {
        if (_CallEnd != null) {
            return _CallEnd!!
        }
        _CallEnd = ImageVector.Builder(
            name = "Filled.CallEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.949f, 12.992f)
                lineTo(21.751f, 14.029f)
                curveTo(21.566f, 15f, 20.659f, 15.652f, 19.631f, 15.553f)
                lineTo(17.584f, 15.355f)
                curveTo(16.692f, 15.269f, 15.932f, 14.636f, 15.706f, 13.789f)
                lineTo(15.074f, 11.434f)
                curveTo(14.14f, 11.051f, 13.11f, 10.876f, 11.984f, 10.908f)
                curveTo(10.859f, 10.941f, 9.812f, 11.177f, 8.844f, 11.616f)
                lineTo(8.453f, 13.821f)
                curveTo(8.305f, 14.657f, 7.615f, 15.28f, 6.742f, 15.368f)
                lineTo(4.707f, 15.572f)
                curveTo(3.692f, 15.674f, 2.719f, 15.028f, 2.43f, 14.061f)
                lineTo(2.121f, 13.024f)
                curveTo(1.813f, 11.993f, 2.088f, 10.907f, 2.842f, 10.174f)
                curveTo(4.623f, 8.444f, 7.592f, 7.576f, 11.749f, 7.57f)
                curveTo(15.913f, 7.565f, 18.974f, 8.428f, 20.934f, 10.158f)
                curveTo(21.758f, 10.886f, 22.144f, 11.964f, 21.949f, 12.992f)
                close()
            }
        }.build()

        return _CallEnd!!
    }

@Suppress("ObjectPropertyName")
private var _CallEnd: ImageVector? = null

@Preview
@Composable
private fun CallEndPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallEnd, contentDescription = null)
    }
}
