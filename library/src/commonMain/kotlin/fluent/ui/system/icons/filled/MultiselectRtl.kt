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

public val FluentUi.Filled.MultiselectRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MultiselectRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.708f, 3.293f)
            curveTo(21.317f, 2.902f, 20.684f, 2.902f, 20.293f, 3.293f)
            lineTo(19f, 4.586f)
            lineTo(18.708f, 4.293f)
            curveTo(18.317f, 3.902f, 17.684f, 3.902f, 17.293f, 4.293f)
            curveTo(16.903f, 4.683f, 16.903f, 5.317f, 17.293f, 5.707f)
            lineTo(18.293f, 6.707f)
            curveTo(18.684f, 7.098f, 19.317f, 7.098f, 19.708f, 6.707f)
            lineTo(21.708f, 4.707f)
            curveTo(22.098f, 4.317f, 22.098f, 3.683f, 21.708f, 3.293f)
            close()
            moveTo(3f, 16.993f)
            horizontalLineTo(14.004f)
            curveTo(14.556f, 16.993f, 15.004f, 17.441f, 15.004f, 17.993f)
            curveTo(15.004f, 18.506f, 14.618f, 18.929f, 14.12f, 18.987f)
            lineTo(14.004f, 18.993f)
            horizontalLineTo(3f)
            curveTo(2.448f, 18.993f, 2f, 18.546f, 2f, 17.993f)
            curveTo(2f, 17.48f, 2.386f, 17.058f, 2.883f, 17f)
            lineTo(3f, 16.993f)
            close()
            moveTo(3f, 11f)
            horizontalLineTo(14.004f)
            curveTo(14.556f, 11f, 15.004f, 11.448f, 15.004f, 12f)
            curveTo(15.004f, 12.513f, 14.618f, 12.936f, 14.12f, 12.993f)
            lineTo(14.004f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            curveTo(2f, 11.487f, 2.386f, 11.064f, 2.883f, 11.007f)
            lineTo(3f, 11f)
            close()
            moveTo(3f, 5f)
            horizontalLineTo(14.004f)
            curveTo(14.556f, 5f, 15.004f, 5.448f, 15.004f, 6f)
            curveTo(15.004f, 6.513f, 14.618f, 6.936f, 14.12f, 6.993f)
            lineTo(14.004f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveTo(2f, 5.487f, 2.386f, 5.065f, 2.883f, 5.007f)
            lineTo(3f, 5f)
            close()
            moveTo(20.293f, 16.293f)
            curveTo(20.684f, 15.902f, 21.317f, 15.902f, 21.708f, 16.293f)
            curveTo(22.098f, 16.683f, 22.098f, 17.317f, 21.708f, 17.707f)
            lineTo(19.708f, 19.707f)
            curveTo(19.317f, 20.098f, 18.684f, 20.098f, 18.293f, 19.707f)
            lineTo(17.293f, 18.707f)
            curveTo(16.903f, 18.317f, 16.903f, 17.683f, 17.293f, 17.293f)
            curveTo(17.684f, 16.902f, 18.317f, 16.902f, 18.708f, 17.293f)
            lineTo(19f, 17.586f)
            lineTo(20.293f, 16.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MultiselectRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MultiselectRtl, contentDescription = null)
    }
}
