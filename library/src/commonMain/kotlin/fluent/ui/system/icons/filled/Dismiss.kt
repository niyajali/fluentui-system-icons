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

public val FluentUi.Filled.Dismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.21f, 4.387f)
            lineTo(4.293f, 4.293f)
            curveTo(4.653f, 3.932f, 5.221f, 3.905f, 5.613f, 4.21f)
            lineTo(5.707f, 4.293f)
            lineTo(12f, 10.585f)
            lineTo(18.293f, 4.293f)
            curveTo(18.683f, 3.902f, 19.317f, 3.902f, 19.707f, 4.293f)
            curveTo(20.098f, 4.683f, 20.098f, 5.317f, 19.707f, 5.707f)
            lineTo(13.415f, 12f)
            lineTo(19.707f, 18.293f)
            curveTo(20.068f, 18.653f, 20.095f, 19.221f, 19.79f, 19.613f)
            lineTo(19.707f, 19.707f)
            curveTo(19.347f, 20.068f, 18.779f, 20.095f, 18.387f, 19.79f)
            lineTo(18.293f, 19.707f)
            lineTo(12f, 13.415f)
            lineTo(5.707f, 19.707f)
            curveTo(5.317f, 20.098f, 4.683f, 20.098f, 4.293f, 19.707f)
            curveTo(3.902f, 19.317f, 3.902f, 18.683f, 4.293f, 18.293f)
            lineTo(10.585f, 12f)
            lineTo(4.293f, 5.707f)
            curveTo(3.932f, 5.347f, 3.905f, 4.779f, 4.21f, 4.387f)
            lineTo(4.293f, 4.293f)
            lineTo(4.21f, 4.387f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Dismiss, contentDescription = null)
    }
}
