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

public val FluentUi.Filled.CaretLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 17.898f)
            curveTo(15f, 18.972f, 13.735f, 19.546f, 12.927f, 18.839f)
            lineTo(6.616f, 13.317f)
            curveTo(5.819f, 12.62f, 5.819f, 11.38f, 6.616f, 10.683f)
            lineTo(12.927f, 5.161f)
            curveTo(13.735f, 4.454f, 15f, 5.028f, 15f, 6.102f)
            lineTo(15f, 17.898f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CaretLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CaretLeft, contentDescription = null)
    }
}
