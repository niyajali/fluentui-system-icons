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

public val FluentUi.Regular.Archive: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Archive",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 11f)
            curveTo(9.836f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            curveTo(9.5f, 12.164f, 9.836f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
            curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
            horizontalLineTo(10.25f)
            close()
            moveTo(3f, 5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 3f, 21f, 4.007f, 21f, 5.25f)
            verticalLineTo(6.75f)
            curveTo(21f, 7.53f, 20.603f, 8.217f, 20f, 8.621f)
            verticalLineTo(17.25f)
            curveTo(20f, 19.321f, 18.321f, 21f, 16.25f, 21f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(8.621f)
            curveTo(3.397f, 8.217f, 3f, 7.53f, 3f, 6.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(5.5f, 9f)
            verticalLineTo(17.25f)
            curveTo(5.5f, 18.493f, 6.507f, 19.5f, 7.75f, 19.5f)
            horizontalLineTo(16.25f)
            curveTo(17.493f, 19.5f, 18.5f, 18.493f, 18.5f, 17.25f)
            verticalLineTo(9f)
            horizontalLineTo(5.5f)
            close()
            moveTo(5.25f, 4.5f)
            curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
            verticalLineTo(6.75f)
            curveTo(4.5f, 7.164f, 4.836f, 7.5f, 5.25f, 7.5f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 7.5f, 19.5f, 7.164f, 19.5f, 6.75f)
            verticalLineTo(5.25f)
            curveTo(19.5f, 4.836f, 19.164f, 4.5f, 18.75f, 4.5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArchivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Archive, contentDescription = null)
    }
}
