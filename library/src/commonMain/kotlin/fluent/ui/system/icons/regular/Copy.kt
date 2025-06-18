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

public val FluentUi.Regular.Copy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Copy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.503f, 4.627f)
            lineTo(5.5f, 6.75f)
            verticalLineTo(17.254f)
            curveTo(5.5f, 19.049f, 6.955f, 20.504f, 8.75f, 20.504f)
            lineTo(17.366f, 20.504f)
            curveTo(17.057f, 21.378f, 16.224f, 22.004f, 15.244f, 22.004f)
            horizontalLineTo(8.75f)
            curveTo(6.127f, 22.004f, 4f, 19.878f, 4f, 17.254f)
            verticalLineTo(6.75f)
            curveTo(4f, 5.769f, 4.627f, 4.935f, 5.503f, 4.627f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineTo(17.25f)
            curveTo(20f, 18.493f, 18.993f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(8.75f)
            curveTo(7.507f, 19.5f, 6.5f, 18.493f, 6.5f, 17.25f)
            verticalLineTo(4.25f)
            curveTo(6.5f, 3.007f, 7.507f, 2f, 8.75f, 2f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 3.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 3.5f, 8f, 3.836f, 8f, 4.25f)
            verticalLineTo(17.25f)
            curveTo(8f, 17.664f, 8.336f, 18f, 8.75f, 18f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 18f, 18.5f, 17.664f, 18.5f, 17.25f)
            verticalLineTo(4.25f)
            curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Copy, contentDescription = null)
    }
}
