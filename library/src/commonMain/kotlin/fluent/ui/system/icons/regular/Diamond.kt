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

public val FluentUi.Regular.Diamond: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Diamond",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.952f, 14.299f)
            curveTo(1.683f, 13.029f, 1.683f, 10.972f, 2.952f, 9.702f)
            lineTo(9.702f, 2.952f)
            curveTo(10.972f, 1.683f, 13.029f, 1.683f, 14.299f, 2.952f)
            lineTo(21.049f, 9.702f)
            curveTo(22.318f, 10.972f, 22.318f, 13.029f, 21.049f, 14.299f)
            lineTo(14.299f, 21.049f)
            curveTo(13.029f, 22.318f, 10.972f, 22.318f, 9.702f, 21.049f)
            lineTo(2.952f, 14.299f)
            close()
            moveTo(4.013f, 10.763f)
            curveTo(3.329f, 11.446f, 3.329f, 12.554f, 4.013f, 13.238f)
            lineTo(10.763f, 19.988f)
            curveTo(11.446f, 20.672f, 12.554f, 20.672f, 13.238f, 19.988f)
            lineTo(19.989f, 13.238f)
            curveTo(20.672f, 12.554f, 20.672f, 11.446f, 19.989f, 10.763f)
            lineTo(13.238f, 4.013f)
            curveTo(12.554f, 3.329f, 11.446f, 3.329f, 10.763f, 4.013f)
            lineTo(4.013f, 10.763f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DiamondPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Diamond, contentDescription = null)
    }
}
