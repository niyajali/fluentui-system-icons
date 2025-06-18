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

public val FluentUi.Filled.TextAlignLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6f)
            curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
            horizontalLineTo(18f)
            curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
            curveTo(19f, 6.552f, 18.552f, 7f, 18f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            close()
            moveTo(2f, 18f)
            curveTo(2f, 17.448f, 2.448f, 17f, 3f, 17f)
            horizontalLineTo(14f)
            curveTo(14.552f, 17f, 15f, 17.448f, 15f, 18f)
            curveTo(15f, 18.552f, 14.552f, 19f, 14f, 19f)
            horizontalLineTo(3f)
            curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
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
private fun TextAlignLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAlignLeft, contentDescription = null)
    }
}
