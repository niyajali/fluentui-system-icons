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

public val FluentUi.Regular.PaddingLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaddingLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 4.5f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            verticalLineTo(6.117f)
            curveTo(2f, 6.531f, 2.336f, 6.867f, 2.75f, 6.867f)
            curveTo(3.164f, 6.867f, 3.5f, 6.531f, 3.5f, 6.117f)
            lineTo(3.5f, 5.25f)
            curveTo(3.5f, 4.836f, 3.164f, 4.5f, 2.75f, 4.5f)
            close()
            moveTo(2.75f, 7.967f)
            curveTo(2.336f, 7.967f, 2f, 8.302f, 2f, 8.717f)
            verticalLineTo(10.45f)
            curveTo(2f, 10.864f, 2.336f, 11.2f, 2.75f, 11.2f)
            curveTo(3.164f, 11.2f, 3.5f, 10.864f, 3.5f, 10.45f)
            verticalLineTo(8.717f)
            curveTo(3.5f, 8.302f, 3.164f, 7.967f, 2.75f, 7.967f)
            close()
            moveTo(2.75f, 12.3f)
            curveTo(2.336f, 12.3f, 2f, 12.636f, 2f, 13.05f)
            verticalLineTo(14.783f)
            curveTo(2f, 15.198f, 2.336f, 15.533f, 2.75f, 15.533f)
            curveTo(3.164f, 15.533f, 3.5f, 15.198f, 3.5f, 14.783f)
            lineTo(3.5f, 13.05f)
            curveTo(3.5f, 12.636f, 3.164f, 12.3f, 2.75f, 12.3f)
            close()
            moveTo(2.75f, 16.633f)
            curveTo(2.336f, 16.633f, 2f, 16.969f, 2f, 17.383f)
            verticalLineTo(18.25f)
            curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
            curveTo(3.164f, 19f, 3.5f, 18.664f, 3.5f, 18.25f)
            verticalLineTo(17.383f)
            curveTo(3.5f, 16.969f, 3.164f, 16.633f, 2.75f, 16.633f)
            close()
            moveTo(21.25f, 4.5f)
            curveTo(20.836f, 4.5f, 20.5f, 4.836f, 20.5f, 5.25f)
            verticalLineTo(18.25f)
            curveTo(20.5f, 18.664f, 20.836f, 19f, 21.25f, 19f)
            curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 4.836f, 21.664f, 4.5f, 21.25f, 4.5f)
            close()
            moveTo(5.22f, 12.28f)
            curveTo(4.927f, 11.987f, 4.927f, 11.513f, 5.22f, 11.22f)
            lineTo(10.22f, 6.22f)
            curveTo(10.513f, 5.927f, 10.987f, 5.927f, 11.28f, 6.22f)
            curveTo(11.573f, 6.513f, 11.573f, 6.987f, 11.28f, 7.28f)
            lineTo(7.561f, 11f)
            lineTo(18.25f, 11f)
            curveTo(18.664f, 11f, 19f, 11.336f, 19f, 11.75f)
            curveTo(19f, 12.164f, 18.664f, 12.5f, 18.25f, 12.5f)
            lineTo(7.561f, 12.5f)
            lineTo(11.28f, 16.22f)
            curveTo(11.573f, 16.513f, 11.573f, 16.987f, 11.28f, 17.28f)
            curveTo(10.987f, 17.573f, 10.513f, 17.573f, 10.22f, 17.28f)
            lineTo(5.22f, 12.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaddingLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PaddingLeft, contentDescription = null)
    }
}
