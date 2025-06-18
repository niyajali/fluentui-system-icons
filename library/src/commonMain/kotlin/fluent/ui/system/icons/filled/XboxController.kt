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

public val FluentUi.Filled.XboxController: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.XboxController",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.807f, 5.508f)
            curveTo(9.278f, 5.243f, 8.697f, 5.202f, 8.168f, 5.302f)
            lineTo(6.986f, 5.528f)
            curveTo(6.124f, 5.692f, 5.382f, 6.245f, 4.982f, 7.028f)
            curveTo(3.615f, 9.7f, 2.581f, 11.889f, 2.183f, 13.757f)
            curveTo(1.771f, 15.683f, 2.023f, 17.332f, 3.262f, 18.833f)
            curveTo(4.083f, 19.829f, 5.491f, 19.627f, 6.225f, 18.797f)
            curveTo(6.784f, 18.165f, 7.42f, 17.433f, 8.043f, 16.711f)
            curveTo(8.452f, 16.236f, 9.047f, 15.962f, 9.672f, 15.962f)
            horizontalLineTo(14.328f)
            curveTo(14.953f, 15.962f, 15.548f, 16.236f, 15.958f, 16.711f)
            curveTo(16.58f, 17.433f, 17.216f, 18.165f, 17.775f, 18.797f)
            curveTo(18.509f, 19.627f, 19.917f, 19.829f, 20.739f, 18.833f)
            curveTo(21.978f, 17.332f, 22.229f, 15.683f, 21.818f, 13.757f)
            curveTo(21.419f, 11.889f, 20.385f, 9.7f, 19.018f, 7.028f)
            curveTo(18.618f, 6.245f, 17.876f, 5.692f, 17.015f, 5.528f)
            lineTo(15.832f, 5.302f)
            curveTo(15.303f, 5.202f, 14.722f, 5.243f, 14.193f, 5.508f)
            curveTo(14.05f, 5.579f, 13.903f, 5.657f, 13.754f, 5.737f)
            curveTo(13.399f, 5.93f, 13.018f, 6.034f, 12.641f, 6.034f)
            horizontalLineTo(11.359f)
            curveTo(10.983f, 6.034f, 10.602f, 5.93f, 10.246f, 5.737f)
            curveTo(10.098f, 5.657f, 9.951f, 5.579f, 9.807f, 5.508f)
            close()
            moveTo(12f, 11f)
            curveTo(11.448f, 11f, 11f, 10.553f, 11f, 10f)
            curveTo(11f, 9.448f, 11.448f, 9f, 12f, 9f)
            curveTo(12.552f, 9f, 13f, 9.448f, 13f, 10f)
            curveTo(13f, 10.553f, 12.552f, 11f, 12f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun XboxControllerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.XboxController, contentDescription = null)
    }
}
