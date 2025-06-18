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

public val FluentUi.Regular.LocationArrow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.958f, 2.104f)
            curveTo(21.171f, 1.637f, 22.363f, 2.829f, 21.896f, 4.042f)
            lineTo(15.359f, 21.038f)
            curveTo(14.837f, 22.397f, 12.879f, 22.29f, 12.509f, 20.882f)
            lineTo(10.664f, 13.871f)
            curveTo(10.595f, 13.609f, 10.391f, 13.405f, 10.129f, 13.336f)
            lineTo(3.118f, 11.491f)
            curveTo(1.71f, 11.121f, 1.603f, 9.163f, 2.962f, 8.641f)
            lineTo(19.958f, 2.104f)
            close()
            moveTo(20.496f, 3.504f)
            lineTo(3.5f, 10.041f)
            lineTo(10.511f, 11.886f)
            curveTo(11.295f, 12.092f, 11.908f, 12.705f, 12.114f, 13.489f)
            lineTo(13.959f, 20.5f)
            lineTo(20.496f, 3.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationArrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.LocationArrow, contentDescription = null)
    }
}
