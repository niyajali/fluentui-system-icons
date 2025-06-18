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

public val FluentUi.Regular.ArrowCounterclockwise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4.5f)
            curveTo(16.142f, 4.5f, 19.5f, 7.858f, 19.5f, 12f)
            curveTo(19.5f, 16.142f, 16.142f, 19.5f, 12f, 19.5f)
            curveTo(7.858f, 19.5f, 4.5f, 16.142f, 4.5f, 12f)
            curveTo(4.5f, 11.624f, 4.528f, 11.254f, 4.581f, 10.892f)
            curveTo(4.648f, 10.438f, 4.316f, 10f, 3.857f, 10f)
            curveTo(3.486f, 10f, 3.161f, 10.256f, 3.105f, 10.623f)
            curveTo(3.036f, 11.072f, 3f, 11.532f, 3f, 12f)
            curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
            curveTo(16.971f, 21f, 21f, 16.971f, 21f, 12f)
            curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
            curveTo(9.695f, 3f, 7.592f, 3.867f, 6f, 5.292f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.836f, 5.664f, 3.5f, 5.25f, 3.5f)
            curveTo(4.836f, 3.5f, 4.5f, 3.836f, 4.5f, 4.25f)
            verticalLineTo(7.25f)
            curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 8f, 9f, 7.664f, 9f, 7.25f)
            curveTo(9f, 6.836f, 8.664f, 6.5f, 8.25f, 6.5f)
            horizontalLineTo(6.901f)
            curveTo(8.239f, 5.259f, 10.031f, 4.5f, 12f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCounterclockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowCounterclockwise, contentDescription = null)
    }
}
