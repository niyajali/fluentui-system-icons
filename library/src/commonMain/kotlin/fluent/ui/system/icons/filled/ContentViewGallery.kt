package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ContentViewGallery: ImageVector
    get() {
        if (_ContentViewGallery != null) {
            return _ContentViewGallery!!
        }
        _ContentViewGallery = ImageVector.Builder(
            name = "Filled.ContentViewGallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(17.75f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                close()
                moveTo(21f, 14.5f)
                horizontalLineTo(16f)
                verticalLineTo(9.5f)
                horizontalLineTo(21f)
                verticalLineTo(14.5f)
                close()
                moveTo(16f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                close()
                moveTo(6f, 13.75f)
                curveTo(6f, 14.164f, 6.336f, 14.5f, 6.75f, 14.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 14.5f, 12f, 14.164f, 12f, 13.75f)
                curveTo(12f, 13.336f, 11.664f, 13f, 11.25f, 13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 13.336f, 6f, 13.75f)
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
                curveTo(6f, 17.164f, 6.336f, 17.5f, 6.75f, 17.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 17.5f, 12f, 17.164f, 12f, 16.75f)
                curveTo(12f, 16.336f, 11.664f, 16f, 11.25f, 16f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 16f, 6f, 16.336f, 6f, 16.75f)
                close()
            }
        }.build()

        return _ContentViewGallery!!
    }

@Suppress("ObjectPropertyName")
private var _ContentViewGallery: ImageVector? = null

@Preview
@Composable
private fun ContentViewGalleryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ContentViewGallery, contentDescription = null)
    }
}
