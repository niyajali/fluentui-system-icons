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

public val FluentUi.Filled.ArrowOutlineUpRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.833f, 2.012f)
            curveTo(21.074f, 1.874f, 22.124f, 2.924f, 21.986f, 4.166f)
            lineTo(20.646f, 16.227f)
            curveTo(20.465f, 17.852f, 18.485f, 18.547f, 17.329f, 17.391f)
            lineTo(16.062f, 16.124f)
            lineTo(10.758f, 21.427f)
            curveTo(9.996f, 22.189f, 8.762f, 22.189f, 8f, 21.427f)
            lineTo(2.571f, 15.998f)
            curveTo(1.81f, 15.237f, 1.81f, 14.002f, 2.571f, 13.24f)
            lineTo(7.875f, 7.937f)
            lineTo(6.607f, 6.669f)
            curveTo(5.451f, 5.513f, 6.146f, 3.533f, 7.771f, 3.352f)
            lineTo(19.833f, 2.012f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowOutlineUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowOutlineUpRight, contentDescription = null)
    }
}
