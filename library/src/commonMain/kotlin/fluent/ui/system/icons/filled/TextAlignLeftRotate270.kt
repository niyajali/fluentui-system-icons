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

public val FluentUi.Filled.TextAlignLeftRotate270: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignLeftRotate270",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 22f)
            curveTo(5.448f, 22f, 5f, 21.552f, 5f, 21f)
            verticalLineTo(6f)
            curveTo(5f, 5.448f, 5.448f, 5f, 6f, 5f)
            curveTo(6.552f, 5f, 7f, 5.448f, 7f, 6f)
            verticalLineTo(21f)
            curveTo(7f, 21.552f, 6.552f, 22f, 6f, 22f)
            close()
            moveTo(18f, 22f)
            curveTo(17.448f, 22f, 17f, 21.552f, 17f, 21f)
            verticalLineTo(10f)
            curveTo(17f, 9.448f, 17.448f, 9f, 18f, 9f)
            curveTo(18.552f, 9f, 19f, 9.448f, 19f, 10f)
            verticalLineTo(21f)
            curveTo(19f, 21.552f, 18.552f, 22f, 18f, 22f)
            close()
            moveTo(11f, 21f)
            curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
            curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
            verticalLineTo(3f)
            curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
            curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
            verticalLineTo(21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAlignLeftRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAlignLeftRotate270, contentDescription = null)
    }
}
