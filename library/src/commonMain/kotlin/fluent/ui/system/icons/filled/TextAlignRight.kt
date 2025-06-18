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

public val FluentUi.Filled.TextAlignRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 6f)
            curveTo(5f, 5.448f, 5.448f, 5f, 6f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
            curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
            horizontalLineTo(6f)
            curveTo(5.448f, 7f, 5f, 6.552f, 5f, 6f)
            close()
            moveTo(9f, 18f)
            curveTo(9f, 17.448f, 9.448f, 17f, 10f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
            curveTo(22f, 18.552f, 21.552f, 19f, 21f, 19f)
            horizontalLineTo(10f)
            curveTo(9.448f, 19f, 9f, 18.552f, 9f, 18f)
            close()
            moveTo(3f, 11f)
            curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
            curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
            horizontalLineTo(21f)
            curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
            curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAlignRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAlignRight, contentDescription = null)
    }
}
