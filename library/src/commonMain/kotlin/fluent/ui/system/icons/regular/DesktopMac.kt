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

public val FluentUi.Regular.DesktopMac: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopMac",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 3f)
            curveTo(3.007f, 3f, 2f, 4.007f, 2f, 5.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 16.993f, 3.007f, 18f, 4.25f, 18f)
            horizontalLineTo(9.5f)
            verticalLineTo(19.25f)
            curveTo(9.5f, 19.94f, 8.94f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 20.5f, 7f, 20.836f, 7f, 21.25f)
            curveTo(7f, 21.664f, 7.336f, 22f, 7.75f, 22f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 22f, 17f, 21.664f, 17f, 21.25f)
            curveTo(17f, 20.836f, 16.664f, 20.5f, 16.25f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(15.06f, 20.5f, 14.5f, 19.94f, 14.5f, 19.25f)
            verticalLineTo(18f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 18f, 22f, 16.993f, 22f, 15.75f)
            verticalLineTo(5.25f)
            curveTo(22f, 4.007f, 20.993f, 3f, 19.75f, 3f)
            horizontalLineTo(4.25f)
            close()
            moveTo(13f, 18f)
            verticalLineTo(19.25f)
            curveTo(13f, 19.7f, 13.108f, 20.125f, 13.3f, 20.5f)
            horizontalLineTo(10.7f)
            curveTo(10.892f, 20.125f, 11f, 19.7f, 11f, 19.25f)
            verticalLineTo(18f)
            horizontalLineTo(13f)
            close()
            moveTo(3.5f, 5.25f)
            curveTo(3.5f, 4.836f, 3.836f, 4.5f, 4.25f, 4.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 4.5f, 20.5f, 4.836f, 20.5f, 5.25f)
            verticalLineTo(13f)
            horizontalLineTo(3.5f)
            verticalLineTo(5.25f)
            close()
            moveTo(3.5f, 14.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(15.75f)
            curveTo(20.5f, 16.164f, 20.164f, 16.5f, 19.75f, 16.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 16.5f, 3.5f, 16.164f, 3.5f, 15.75f)
            verticalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopMacPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DesktopMac, contentDescription = null)
    }
}
