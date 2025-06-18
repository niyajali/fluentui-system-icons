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

public val FluentUi.Filled.DualScreenHeader: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenHeader",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.995f, 7.997f)
            lineTo(21.996f, 18.25f)
            curveTo(21.996f, 19.216f, 21.212f, 20f, 20.246f, 20f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 20f, 12.826f, 19.993f, 12.743f, 19.981f)
            lineTo(12.742f, 7.997f)
            horizontalLineTo(21.995f)
            close()
            moveTo(11.243f, 7.997f)
            lineTo(11.243f, 19.98f)
            curveTo(11.163f, 19.991f, 11.081f, 19.997f, 10.998f, 19.997f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            lineTo(2f, 7.997f)
            horizontalLineTo(11.243f)
            close()
            moveTo(10.998f, 4.002f)
            curveTo(11.081f, 4.002f, 11.163f, 4.008f, 11.244f, 4.019f)
            lineTo(11.243f, 6.997f)
            horizontalLineTo(2f)
            lineTo(2f, 5.752f)
            curveTo(2f, 4.785f, 2.784f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(10.998f)
            close()
            moveTo(20.246f, 4.004f)
            curveTo(21.212f, 4.004f, 21.996f, 4.788f, 21.996f, 5.754f)
            lineTo(21.995f, 6.997f)
            horizontalLineTo(12.742f)
            lineTo(12.742f, 4.023f)
            curveTo(12.826f, 4.011f, 12.911f, 4.004f, 12.998f, 4.004f)
            horizontalLineTo(20.246f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenHeader, contentDescription = null)
    }
}
