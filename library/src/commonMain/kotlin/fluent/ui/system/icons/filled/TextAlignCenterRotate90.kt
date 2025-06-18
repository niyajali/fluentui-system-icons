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

public val FluentUi.Filled.TextAlignCenterRotate90: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignCenterRotate90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 4f)
            curveTo(18.552f, 4f, 19f, 4.448f, 19f, 5f)
            verticalLineTo(19f)
            curveTo(19f, 19.552f, 18.552f, 20f, 18f, 20f)
            curveTo(17.448f, 20f, 17f, 19.552f, 17f, 19f)
            verticalLineTo(5f)
            curveTo(17f, 4.448f, 17.448f, 4f, 18f, 4f)
            close()
            moveTo(6f, 6f)
            curveTo(6.552f, 6f, 7f, 6.448f, 7f, 7f)
            verticalLineTo(17f)
            curveTo(7f, 17.552f, 6.552f, 18f, 6f, 18f)
            curveTo(5.448f, 18f, 5f, 17.552f, 5f, 17f)
            verticalLineTo(7f)
            curveTo(5f, 6.448f, 5.448f, 6f, 6f, 6f)
            close()
            moveTo(13f, 3f)
            curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
            curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
            verticalLineTo(21f)
            curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
            curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
            verticalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextAlignCenterRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextAlignCenterRotate90, contentDescription = null)
    }
}
