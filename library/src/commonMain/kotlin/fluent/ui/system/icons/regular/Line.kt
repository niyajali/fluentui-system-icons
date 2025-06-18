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

public val FluentUi.Regular.Line: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Line",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.784f, 2.22f)
            curveTo(22.077f, 2.513f, 22.077f, 2.987f, 21.784f, 3.28f)
            lineTo(3.28f, 21.784f)
            curveTo(2.987f, 22.077f, 2.513f, 22.077f, 2.22f, 21.784f)
            curveTo(1.927f, 21.491f, 1.927f, 21.016f, 2.22f, 20.723f)
            lineTo(20.723f, 2.22f)
            curveTo(21.016f, 1.927f, 21.491f, 1.927f, 21.784f, 2.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Line, contentDescription = null)
    }
}
