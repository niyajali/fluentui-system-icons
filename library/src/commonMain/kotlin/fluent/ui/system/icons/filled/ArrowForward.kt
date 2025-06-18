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

public val FluentUi.Filled.ArrowForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowForward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.293f, 6.707f)
            curveTo(13.902f, 6.317f, 13.902f, 5.683f, 14.293f, 5.293f)
            curveTo(14.683f, 4.902f, 15.317f, 4.902f, 15.707f, 5.293f)
            lineTo(20.707f, 10.293f)
            curveTo(21.098f, 10.683f, 21.098f, 11.317f, 20.707f, 11.707f)
            lineTo(15.707f, 16.707f)
            curveTo(15.317f, 17.098f, 14.683f, 17.098f, 14.293f, 16.707f)
            curveTo(13.902f, 16.317f, 13.902f, 15.683f, 14.293f, 15.293f)
            lineTo(17.586f, 12f)
            horizontalLineTo(11f)
            curveTo(7.686f, 12f, 5f, 14.686f, 5f, 18f)
            curveTo(5f, 18.552f, 4.552f, 19f, 4f, 19f)
            curveTo(3.448f, 19f, 3f, 18.552f, 3f, 18f)
            curveTo(3f, 13.582f, 6.582f, 10f, 11f, 10f)
            horizontalLineTo(17.586f)
            lineTo(14.293f, 6.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowForward, contentDescription = null)
    }
}
