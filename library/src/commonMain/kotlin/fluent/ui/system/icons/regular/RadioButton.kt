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

public val FluentUi.Regular.RadioButton: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RadioButton",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 22.002f)
            curveTo(17.524f, 22.002f, 22.001f, 17.524f, 22.001f, 12.001f)
            curveTo(22.001f, 6.477f, 17.524f, 1.999f, 12f, 1.999f)
            curveTo(6.476f, 1.999f, 1.998f, 6.477f, 1.998f, 12.001f)
            curveTo(1.998f, 17.524f, 6.476f, 22.002f, 12f, 22.002f)
            close()
            moveTo(12f, 20.502f)
            curveTo(7.305f, 20.502f, 3.498f, 16.696f, 3.498f, 12.001f)
            curveTo(3.498f, 7.305f, 7.305f, 3.499f, 12f, 3.499f)
            curveTo(16.695f, 3.499f, 20.501f, 7.305f, 20.501f, 12.001f)
            curveTo(20.501f, 16.696f, 16.695f, 20.502f, 12f, 20.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RadioButtonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RadioButton, contentDescription = null)
    }
}
