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

public val FluentUi.Regular.ArrowReply: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReply",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.28f, 6.28f)
            curveTo(9.573f, 5.987f, 9.573f, 5.513f, 9.28f, 5.22f)
            curveTo(8.987f, 4.927f, 8.513f, 4.927f, 8.22f, 5.22f)
            lineTo(3.22f, 10.22f)
            curveTo(2.927f, 10.513f, 2.927f, 10.987f, 3.22f, 11.28f)
            lineTo(8.22f, 16.28f)
            curveTo(8.513f, 16.573f, 8.987f, 16.573f, 9.28f, 16.28f)
            curveTo(9.573f, 15.987f, 9.573f, 15.513f, 9.28f, 15.22f)
            lineTo(5.561f, 11.5f)
            horizontalLineTo(13.25f)
            curveTo(16.702f, 11.5f, 19.5f, 14.298f, 19.5f, 17.75f)
            verticalLineTo(18.25f)
            curveTo(19.5f, 18.664f, 19.836f, 19f, 20.25f, 19f)
            curveTo(20.664f, 19f, 21f, 18.664f, 21f, 18.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 13.47f, 17.53f, 10f, 13.25f, 10f)
            horizontalLineTo(5.561f)
            lineTo(9.28f, 6.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowReplyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowReply, contentDescription = null)
    }
}
