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

public val FluentUi.Filled.ArrowReply: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReply",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.707f, 6.707f)
            curveTo(10.098f, 6.317f, 10.098f, 5.683f, 9.707f, 5.293f)
            curveTo(9.317f, 4.902f, 8.683f, 4.902f, 8.293f, 5.293f)
            lineTo(3.293f, 10.293f)
            curveTo(2.902f, 10.683f, 2.902f, 11.317f, 3.293f, 11.707f)
            lineTo(8.293f, 16.707f)
            curveTo(8.683f, 17.098f, 9.317f, 17.098f, 9.707f, 16.707f)
            curveTo(10.098f, 16.317f, 10.098f, 15.683f, 9.707f, 15.293f)
            lineTo(6.414f, 12f)
            horizontalLineTo(13f)
            curveTo(16.314f, 12f, 19f, 14.686f, 19f, 18f)
            curveTo(19f, 18.552f, 19.448f, 19f, 20f, 19f)
            curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
            curveTo(21f, 13.582f, 17.418f, 10f, 13f, 10f)
            horizontalLineTo(6.414f)
            lineTo(9.707f, 6.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowReply, contentDescription = null)
    }
}
