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

public val FluentUi.Filled.DualScreenStatusBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenStatusBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.245f, 4.004f)
            curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 20f, 12.825f, 19.993f, 12.742f, 19.981f)
            lineTo(12.742f, 4.023f)
            curveTo(12.825f, 4.011f, 12.911f, 4.004f, 12.998f, 4.004f)
            horizontalLineTo(20.245f)
            close()
            moveTo(10.998f, 4.002f)
            curveTo(11.081f, 4.002f, 11.163f, 4.008f, 11.243f, 4.019f)
            lineTo(11.243f, 19.98f)
            curveTo(11.163f, 19.991f, 11.081f, 19.997f, 10.998f, 19.997f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(10.998f)
            close()
            moveTo(19.75f, 6.501f)
            horizontalLineTo(15.248f)
            curveTo(14.834f, 6.501f, 14.498f, 6.837f, 14.498f, 7.251f)
            curveTo(14.498f, 7.63f, 14.781f, 7.944f, 15.146f, 7.994f)
            lineTo(15.248f, 8.001f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 8.001f, 20.5f, 7.665f, 20.5f, 7.251f)
            curveTo(20.5f, 6.871f, 20.218f, 6.557f, 19.852f, 6.508f)
            lineTo(19.75f, 6.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenStatusBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenStatusBar, contentDescription = null)
    }
}
