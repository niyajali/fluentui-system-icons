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

public val FluentUi.Regular.FolderDocument: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderDocument",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.561f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineTo(13.586f)
            lineTo(20.5f, 12.086f)
            verticalLineTo(8.75f)
            curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(13f)
            verticalLineTo(21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(3.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(10.189f, 6.25f)
            lineTo(8.659f, 4.72f)
            curveTo(8.518f, 4.579f, 8.328f, 4.5f, 8.129f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            close()
            moveTo(18f, 15.25f)
            verticalLineTo(12f)
            horizontalLineTo(15.5f)
            curveTo(14.672f, 12f, 14f, 12.672f, 14f, 13.5f)
            verticalLineTo(21.5f)
            curveTo(14f, 22.328f, 14.672f, 23f, 15.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(17f)
            horizontalLineTo(19.75f)
            curveTo(18.784f, 17f, 18f, 16.216f, 18f, 15.25f)
            close()
            moveTo(19f, 15.25f)
            verticalLineTo(12f)
            lineTo(23f, 16f)
            horizontalLineTo(19.75f)
            curveTo(19.336f, 16f, 19f, 15.664f, 19f, 15.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderDocumentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FolderDocument, contentDescription = null)
    }
}
