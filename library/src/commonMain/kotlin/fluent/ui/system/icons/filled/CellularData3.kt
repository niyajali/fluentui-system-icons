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

public val FluentUi.Filled.CellularData3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CellularData3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 11f)
            curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
            verticalLineTo(19f)
            curveTo(13f, 19.552f, 12.552f, 20f, 12f, 20f)
            curveTo(11.448f, 20f, 11f, 19.552f, 11f, 19f)
            verticalLineTo(12f)
            curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
            close()
            moveTo(8f, 14f)
            curveTo(8.552f, 14f, 9f, 14.445f, 9f, 14.994f)
            verticalLineTo(19.006f)
            curveTo(9f, 19.555f, 8.552f, 20f, 8f, 20f)
            curveTo(7.448f, 20f, 7f, 19.555f, 7f, 19.006f)
            verticalLineTo(14.994f)
            curveTo(7f, 14.445f, 7.448f, 14f, 8f, 14f)
            close()
            moveTo(4f, 17f)
            curveTo(4.552f, 17f, 5f, 17.44f, 5f, 17.984f)
            verticalLineTo(19.016f)
            curveTo(5f, 19.56f, 4.552f, 20f, 4f, 20f)
            curveTo(3.448f, 20f, 3f, 19.56f, 3f, 19.016f)
            verticalLineTo(17.984f)
            curveTo(3f, 17.44f, 3.448f, 17f, 4f, 17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CellularData3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CellularData3, contentDescription = null)
    }
}
