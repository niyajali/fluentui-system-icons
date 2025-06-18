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

public val FluentUi.Filled.ArrowUpLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 3f)
            curveTo(13.552f, 3f, 14f, 3.448f, 14f, 4f)
            curveTo(14f, 4.552f, 13.552f, 5f, 13f, 5f)
            horizontalLineTo(6.414f)
            lineTo(20.707f, 19.293f)
            curveTo(21.098f, 19.683f, 21.098f, 20.316f, 20.707f, 20.707f)
            curveTo(20.317f, 21.097f, 19.683f, 21.097f, 19.293f, 20.707f)
            lineTo(5f, 6.414f)
            verticalLineTo(13f)
            curveTo(5f, 13.552f, 4.552f, 14f, 4f, 14f)
            curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
            verticalLineTo(4f)
            curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
            horizontalLineTo(13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowUpLeft, contentDescription = null)
    }
}
