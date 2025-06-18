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

public val FluentUi.Filled.LocationArrow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.896f, 4.042f)
            curveTo(22.363f, 2.829f, 21.171f, 1.637f, 19.958f, 2.104f)
            lineTo(2.962f, 8.641f)
            curveTo(1.603f, 9.163f, 1.71f, 11.121f, 3.118f, 11.491f)
            lineTo(10.129f, 13.336f)
            curveTo(10.391f, 13.405f, 10.595f, 13.609f, 10.664f, 13.871f)
            lineTo(12.509f, 20.882f)
            curveTo(12.879f, 22.29f, 14.837f, 22.397f, 15.359f, 21.038f)
            lineTo(21.896f, 4.042f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationArrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LocationArrow, contentDescription = null)
    }
}
