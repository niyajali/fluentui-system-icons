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

public val FluentUi.Filled.Call: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Call",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.772f, 2.439f)
            lineTo(8.849f, 2.095f)
            curveTo(9.858f, 1.773f, 10.935f, 2.294f, 11.367f, 3.312f)
            lineTo(12.227f, 5.34f)
            curveTo(12.602f, 6.223f, 12.394f, 7.262f, 11.713f, 7.908f)
            lineTo(9.819f, 9.706f)
            curveTo(9.936f, 10.782f, 10.297f, 11.841f, 10.903f, 12.883f)
            curveTo(11.509f, 13.926f, 12.267f, 14.79f, 13.174f, 15.478f)
            lineTo(15.45f, 14.719f)
            curveTo(16.312f, 14.431f, 17.251f, 14.762f, 17.78f, 15.539f)
            lineTo(19.013f, 17.35f)
            curveTo(19.628f, 18.253f, 19.517f, 19.499f, 18.754f, 20.265f)
            lineTo(17.936f, 21.086f)
            curveTo(17.122f, 21.903f, 15.96f, 22.2f, 14.884f, 21.864f)
            curveTo(12.345f, 21.072f, 10.011f, 18.721f, 7.881f, 14.811f)
            curveTo(5.748f, 10.894f, 4.996f, 7.572f, 5.623f, 4.843f)
            curveTo(5.887f, 3.695f, 6.705f, 2.78f, 7.772f, 2.439f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Call, contentDescription = null)
    }
}
