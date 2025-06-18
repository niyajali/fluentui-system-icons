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

public val FluentUi.Regular.AlignRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlignRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 2.75f)
            curveTo(21f, 2.336f, 20.664f, 2f, 20.25f, 2f)
            curveTo(19.836f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(19.5f, 21.664f, 19.836f, 22f, 20.25f, 22f)
            curveTo(20.664f, 22f, 21f, 21.664f, 21f, 21.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(15.75f, 4f)
            curveTo(16.993f, 4f, 18f, 5.007f, 18f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(18f, 9.993f, 16.993f, 11f, 15.75f, 11f)
            lineTo(5.25f, 11f)
            curveTo(4.007f, 11f, 3f, 9.993f, 3f, 8.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 5.007f, 4.007f, 4f, 5.25f, 4f)
            lineTo(15.75f, 4f)
            close()
            moveTo(16.5f, 6.25f)
            curveTo(16.5f, 5.836f, 16.164f, 5.5f, 15.75f, 5.5f)
            lineTo(5.25f, 5.5f)
            curveTo(4.836f, 5.5f, 4.5f, 5.836f, 4.5f, 6.25f)
            verticalLineTo(8.75f)
            curveTo(4.5f, 9.164f, 4.836f, 9.5f, 5.25f, 9.5f)
            lineTo(15.75f, 9.5f)
            curveTo(16.164f, 9.5f, 16.5f, 9.164f, 16.5f, 8.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(15.75f, 13f)
            curveTo(16.993f, 13f, 18f, 14.007f, 18f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(18f, 18.993f, 16.993f, 20f, 15.75f, 20f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 20f, 6.5f, 18.993f, 6.5f, 17.75f)
            verticalLineTo(15.25f)
            curveTo(6.5f, 14.007f, 7.507f, 13f, 8.75f, 13f)
            lineTo(15.75f, 13f)
            close()
            moveTo(16.5f, 15.25f)
            curveTo(16.5f, 14.836f, 16.164f, 14.5f, 15.75f, 14.5f)
            lineTo(8.75f, 14.5f)
            curveTo(8.336f, 14.5f, 8f, 14.836f, 8f, 15.25f)
            verticalLineTo(17.75f)
            curveTo(8f, 18.164f, 8.336f, 18.5f, 8.75f, 18.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 18.5f, 16.5f, 18.164f, 16.5f, 17.75f)
            verticalLineTo(15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlignRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlignRight, contentDescription = null)
    }
}
