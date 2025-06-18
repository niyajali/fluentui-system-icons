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

public val FluentUi.Filled.CallPause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallPause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.5f, 2.75f)
            curveTo(15.5f, 2.336f, 15.164f, 2f, 14.75f, 2f)
            curveTo(14.335f, 2f, 14f, 2.336f, 14f, 2.75f)
            verticalLineTo(10.25f)
            curveTo(14f, 10.664f, 14.335f, 11f, 14.75f, 11f)
            curveTo(15.164f, 11f, 15.5f, 10.664f, 15.5f, 10.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(19.5f, 2.75f)
            curveTo(19.5f, 2.336f, 19.164f, 2f, 18.75f, 2f)
            curveTo(18.335f, 2f, 18f, 2.336f, 18f, 2.75f)
            verticalLineTo(10.25f)
            curveTo(18f, 10.664f, 18.335f, 11f, 18.75f, 11f)
            curveTo(19.164f, 11f, 19.5f, 10.664f, 19.5f, 10.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(10.226f, 5.34f)
            lineTo(9.366f, 3.313f)
            curveTo(8.934f, 2.294f, 7.857f, 1.773f, 6.848f, 2.095f)
            lineTo(5.771f, 2.439f)
            curveTo(4.704f, 2.78f, 3.886f, 3.695f, 3.622f, 4.843f)
            curveTo(2.995f, 7.572f, 3.747f, 10.895f, 5.88f, 14.811f)
            curveTo(8.01f, 18.721f, 10.344f, 21.073f, 12.883f, 21.865f)
            curveTo(13.959f, 22.2f, 15.121f, 21.904f, 15.935f, 21.087f)
            lineTo(16.753f, 20.265f)
            curveTo(17.516f, 19.5f, 17.626f, 18.253f, 17.012f, 17.35f)
            lineTo(15.779f, 15.539f)
            curveTo(15.25f, 14.762f, 14.311f, 14.432f, 13.449f, 14.719f)
            lineTo(11.173f, 15.478f)
            curveTo(10.266f, 14.791f, 9.509f, 13.926f, 8.902f, 12.883f)
            curveTo(8.296f, 11.841f, 7.935f, 10.782f, 7.818f, 9.706f)
            lineTo(9.712f, 7.908f)
            curveTo(10.393f, 7.262f, 10.601f, 6.223f, 10.226f, 5.34f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallPausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CallPause, contentDescription = null)
    }
}
