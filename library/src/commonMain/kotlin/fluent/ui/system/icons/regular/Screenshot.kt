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

public val FluentUi.Regular.Screenshot: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Screenshot",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(8f, 7.5f)
            curveTo(7.724f, 7.5f, 7.5f, 7.724f, 7.5f, 8f)
            verticalLineTo(10.25f)
            curveTo(7.5f, 10.664f, 7.164f, 11f, 6.75f, 11f)
            curveTo(6.336f, 11f, 6f, 10.664f, 6f, 10.25f)
            verticalLineTo(8f)
            curveTo(6f, 6.895f, 6.895f, 6f, 8f, 6f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 6f, 11f, 6.336f, 11f, 6.75f)
            curveTo(11f, 7.164f, 10.664f, 7.5f, 10.25f, 7.5f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 16.5f)
            curveTo(7.724f, 16.5f, 7.5f, 16.276f, 7.5f, 16f)
            verticalLineTo(13.75f)
            curveTo(7.5f, 13.336f, 7.164f, 13f, 6.75f, 13f)
            curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
            verticalLineTo(16f)
            curveTo(6f, 17.105f, 6.895f, 18f, 8f, 18f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 18f, 11f, 17.664f, 11f, 17.25f)
            curveTo(11f, 16.836f, 10.664f, 16.5f, 10.25f, 16.5f)
            horizontalLineTo(8f)
            close()
            moveTo(16.5f, 8f)
            curveTo(16.5f, 7.724f, 16.276f, 7.5f, 16f, 7.5f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 7.5f, 13f, 7.164f, 13f, 6.75f)
            curveTo(13f, 6.336f, 13.336f, 6f, 13.75f, 6f)
            horizontalLineTo(16f)
            curveTo(17.105f, 6f, 18f, 6.895f, 18f, 8f)
            verticalLineTo(10.25f)
            curveTo(18f, 10.664f, 17.664f, 11f, 17.25f, 11f)
            curveTo(16.836f, 11f, 16.5f, 10.664f, 16.5f, 10.25f)
            verticalLineTo(8f)
            close()
            moveTo(16f, 16.5f)
            curveTo(16.276f, 16.5f, 16.5f, 16.276f, 16.5f, 16f)
            verticalLineTo(13.75f)
            curveTo(16.5f, 13.336f, 16.836f, 13f, 17.25f, 13f)
            curveTo(17.664f, 13f, 18f, 13.336f, 18f, 13.75f)
            verticalLineTo(16f)
            curveTo(18f, 17.105f, 17.105f, 18f, 16f, 18f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 18f, 13f, 17.664f, 13f, 17.25f)
            curveTo(13f, 16.836f, 13.336f, 16.5f, 13.75f, 16.5f)
            horizontalLineTo(16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScreenshotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Screenshot, contentDescription = null)
    }
}
