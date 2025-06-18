package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.ArrowUndo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowUndo",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            curveTo(5.224f, 3f, 5f, 3.224f, 5f, 3.5f)
            verticalLineTo(15.5f)
            curveTo(5f, 15.776f, 5.224f, 16f, 5.5f, 16f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 16f, 18f, 15.776f, 18f, 15.5f)
            curveTo(18f, 15.224f, 17.776f, 15f, 17.5f, 15f)
            horizontalLineTo(6.707f)
            lineTo(15.778f, 5.93f)
            curveTo(18.254f, 3.454f, 22.236f, 3.354f, 24.833f, 5.703f)
            curveTo(27.619f, 8.225f, 27.728f, 12.565f, 25.07f, 15.222f)
            lineTo(12.146f, 28.146f)
            curveTo(11.951f, 28.342f, 11.951f, 28.658f, 12.146f, 28.854f)
            curveTo(12.342f, 29.049f, 12.658f, 29.049f, 12.854f, 28.854f)
            lineTo(25.778f, 15.929f)
            curveTo(28.839f, 12.868f, 28.714f, 7.867f, 25.504f, 4.962f)
            curveTo(22.512f, 2.255f, 17.923f, 2.37f, 15.071f, 5.222f)
            lineTo(6f, 14.293f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUndoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowUndo, contentDescription = null)
    }
}
