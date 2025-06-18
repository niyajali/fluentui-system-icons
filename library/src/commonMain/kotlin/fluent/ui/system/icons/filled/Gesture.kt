package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Gesture: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gesture",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 18f)
            curveTo(3.552f, 18f, 4f, 18.448f, 4f, 19f)
            curveTo(4f, 19.552f, 3.552f, 20f, 3f, 20f)
            curveTo(2.448f, 20f, 2f, 19.552f, 2f, 19f)
            curveTo(2f, 18.448f, 2.448f, 18f, 3f, 18f)
            close()
            moveTo(7f, 4f)
            horizontalLineTo(17f)
            curveTo(17.552f, 4f, 18f, 4.448f, 18f, 5f)
            curveTo(18f, 5.513f, 17.614f, 5.936f, 17.117f, 5.993f)
            lineTo(17f, 6f)
            horizontalLineTo(12.351f)
            lineTo(20.361f, 9.102f)
            curveTo(21.131f, 9.4f, 21.216f, 10.432f, 20.556f, 10.866f)
            lineTo(20.445f, 10.93f)
            lineTo(6.445f, 17.895f)
            curveTo(5.951f, 18.141f, 5.351f, 17.94f, 5.105f, 17.445f)
            curveTo(4.876f, 16.986f, 5.034f, 16.436f, 5.453f, 16.163f)
            lineTo(5.555f, 16.105f)
            lineTo(17.526f, 10.149f)
            lineTo(6.639f, 5.933f)
            curveTo(5.645f, 5.547f, 5.873f, 4.112f, 6.88f, 4.006f)
            lineTo(7f, 4f)
            horizontalLineTo(17f)
            horizontalLineTo(7f)
            close()
            moveTo(20f, 4f)
            curveTo(20.552f, 4f, 21f, 4.448f, 21f, 5f)
            curveTo(21f, 5.552f, 20.552f, 6f, 20f, 6f)
            curveTo(19.448f, 6f, 19f, 5.552f, 19f, 5f)
            curveTo(19f, 4.448f, 19.448f, 4f, 20f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GesturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Gesture, contentDescription = null)
    }
}
