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

public val FluentUi.Filled.FolderZip: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderZip",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(11.25f, 5.189f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            close()
            moveTo(2f, 17.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
            lineTo(13.061f, 5.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(9.25f)
            curveTo(13.5f, 9.664f, 13.836f, 10f, 14.25f, 10f)
            horizontalLineTo(15f)
            verticalLineTo(13f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 13f, 14f, 13.336f, 14f, 13.75f)
            curveTo(14f, 14.164f, 14.336f, 14.5f, 14.75f, 14.5f)
            horizontalLineTo(15f)
            verticalLineTo(16f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 16f, 14f, 16.336f, 14f, 16.75f)
            curveTo(14f, 17.164f, 14.336f, 17.5f, 14.75f, 17.5f)
            horizontalLineTo(15f)
            verticalLineTo(21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            close()
            moveTo(16.5f, 21f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 21f, 22f, 19.545f, 22f, 17.75f)
            verticalLineTo(8.75f)
            curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(18f)
            verticalLineTo(9.25f)
            curveTo(18f, 9.664f, 17.664f, 10f, 17.25f, 10f)
            horizontalLineTo(16.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 14.5f, 17.5f, 14.836f, 17.5f, 15.25f)
            curveTo(17.5f, 15.664f, 17.164f, 16f, 16.75f, 16f)
            horizontalLineTo(16.5f)
            verticalLineTo(21f)
            close()
            moveTo(16.5f, 5.5f)
            horizontalLineTo(15f)
            verticalLineTo(8.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderZipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FolderZip, contentDescription = null)
    }
}
