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

public val FluentUi.Regular.ContentViewGallery: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContentViewGallery",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(4.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(17.75f, 19.5f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(15f)
            verticalLineTo(19.5f)
            horizontalLineTo(17.75f)
            close()
            moveTo(19.5f, 14.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(15f)
            verticalLineTo(14.5f)
            horizontalLineTo(19.5f)
            close()
            moveTo(19.5f, 8f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            horizontalLineTo(15f)
            verticalLineTo(8f)
            horizontalLineTo(19.5f)
            close()
            moveTo(6f, 13.75f)
            curveTo(6f, 13.336f, 6.336f, 13f, 6.75f, 13f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 13f, 12f, 13.336f, 12f, 13.75f)
            curveTo(12f, 14.164f, 11.664f, 14.5f, 11.25f, 14.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14.5f, 6f, 14.164f, 6f, 13.75f)
            close()
            moveTo(7.25f, 6.5f)
            curveTo(6.56f, 6.5f, 6f, 7.06f, 6f, 7.75f)
            verticalLineTo(10.25f)
            curveTo(6f, 10.94f, 6.56f, 11.5f, 7.25f, 11.5f)
            horizontalLineTo(10.75f)
            curveTo(11.44f, 11.5f, 12f, 10.94f, 12f, 10.25f)
            verticalLineTo(7.75f)
            curveTo(12f, 7.06f, 11.44f, 6.5f, 10.75f, 6.5f)
            horizontalLineTo(7.25f)
            close()
            moveTo(7.5f, 10f)
            verticalLineTo(8f)
            horizontalLineTo(10.5f)
            verticalLineTo(10f)
            horizontalLineTo(7.5f)
            close()
            moveTo(6f, 16.75f)
            curveTo(6f, 16.336f, 6.336f, 16f, 6.75f, 16f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 16f, 12f, 16.336f, 12f, 16.75f)
            curveTo(12f, 17.164f, 11.664f, 17.5f, 11.25f, 17.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 17.5f, 6f, 17.164f, 6f, 16.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ContentViewGalleryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ContentViewGallery, contentDescription = null)
    }
}
