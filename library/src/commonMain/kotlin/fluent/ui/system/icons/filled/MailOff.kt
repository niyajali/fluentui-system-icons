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

public val FluentUi.Filled.MailOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.47f, 4.53f)
            curveTo(2.67f, 5.055f, 2.116f, 5.922f, 2.016f, 6.924f)
            lineTo(10.094f, 11.155f)
            lineTo(12.516f, 13.576f)
            lineTo(12.348f, 13.664f)
            curveTo(12.13f, 13.779f, 11.87f, 13.779f, 11.652f, 13.664f)
            lineTo(2f, 8.608f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.644f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(15.3f, 12.118f)
            lineTo(21.562f, 18.38f)
            curveTo(21.84f, 17.901f, 22f, 17.344f, 22f, 16.75f)
            verticalLineTo(8.608f)
            lineTo(15.3f, 12.118f)
            close()
            moveTo(7.182f, 4f)
            lineTo(14.189f, 11.007f)
            lineTo(21.984f, 6.924f)
            curveTo(21.82f, 5.282f, 20.435f, 4f, 18.75f, 4f)
            horizontalLineTo(7.182f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailOff, contentDescription = null)
    }
}
