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

public val FluentUi.Filled.CaretRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 17.898f)
            curveTo(9f, 18.972f, 10.265f, 19.546f, 11.073f, 18.839f)
            lineTo(17.384f, 13.317f)
            curveTo(18.181f, 12.62f, 18.181f, 11.38f, 17.384f, 10.683f)
            lineTo(11.073f, 5.161f)
            curveTo(10.265f, 4.454f, 9f, 5.028f, 9f, 6.102f)
            verticalLineTo(17.898f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CaretRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CaretRight, contentDescription = null)
    }
}
