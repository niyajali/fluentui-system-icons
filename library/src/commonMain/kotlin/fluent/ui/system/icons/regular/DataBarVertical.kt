package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.DataBarVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataBarVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.749f, 3f)
            curveTo(6.991f, 3f, 7.998f, 4.007f, 7.998f, 5.249f)
            verticalLineTo(18.751f)
            curveTo(7.998f, 19.993f, 6.991f, 21f, 5.749f, 21f)
            curveTo(4.507f, 21f, 3.5f, 19.993f, 3.5f, 18.751f)
            verticalLineTo(5.249f)
            curveTo(3.5f, 4.007f, 4.507f, 3f, 5.749f, 3f)
            close()
            moveTo(12.249f, 7f)
            curveTo(13.491f, 7f, 14.498f, 8.007f, 14.498f, 9.249f)
            verticalLineTo(18.751f)
            curveTo(14.498f, 19.993f, 13.491f, 21f, 12.249f, 21f)
            curveTo(11.007f, 21f, 10f, 19.993f, 10f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(10f, 8.007f, 11.007f, 7f, 12.249f, 7f)
            close()
            moveTo(18.749f, 11f)
            curveTo(19.991f, 11f, 20.998f, 12.007f, 20.998f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(20.998f, 19.993f, 19.991f, 21f, 18.749f, 21f)
            curveTo(17.507f, 21f, 16.5f, 19.993f, 16.5f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(16.5f, 12.007f, 17.507f, 11f, 18.749f, 11f)
            close()
            moveTo(5.749f, 4.5f)
            curveTo(5.335f, 4.5f, 5f, 4.835f, 5f, 5.249f)
            verticalLineTo(18.751f)
            curveTo(5f, 19.165f, 5.335f, 19.5f, 5.749f, 19.5f)
            curveTo(6.163f, 19.5f, 6.498f, 19.165f, 6.498f, 18.751f)
            verticalLineTo(5.249f)
            curveTo(6.498f, 4.835f, 6.163f, 4.5f, 5.749f, 4.5f)
            close()
            moveTo(12.249f, 8.5f)
            curveTo(11.835f, 8.5f, 11.5f, 8.835f, 11.5f, 9.249f)
            verticalLineTo(18.751f)
            curveTo(11.5f, 19.165f, 11.835f, 19.5f, 12.249f, 19.5f)
            curveTo(12.663f, 19.5f, 12.998f, 19.165f, 12.998f, 18.751f)
            verticalLineTo(9.249f)
            curveTo(12.998f, 8.835f, 12.663f, 8.5f, 12.249f, 8.5f)
            close()
            moveTo(18.749f, 12.5f)
            curveTo(18.335f, 12.5f, 18f, 12.835f, 18f, 13.249f)
            verticalLineTo(18.751f)
            curveTo(18f, 19.165f, 18.335f, 19.5f, 18.749f, 19.5f)
            curveTo(19.163f, 19.5f, 19.498f, 19.165f, 19.498f, 18.751f)
            verticalLineTo(13.249f)
            curveTo(19.498f, 12.835f, 19.163f, 12.5f, 18.749f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataBarVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataBarVertical, contentDescription = null)
    }
}
