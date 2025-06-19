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

public val FluentIcons.Filled.TextBulletListSquare: ImageVector
    get() {
        if (_TextBulletListSquare != null) {
            return _TextBulletListSquare!!
        }
        _TextBulletListSquare = ImageVector.Builder(
            name = "Filled.TextBulletListSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(7.75f, 9.25f)
                curveTo(8.302f, 9.25f, 8.75f, 8.802f, 8.75f, 8.25f)
                curveTo(8.75f, 7.698f, 8.302f, 7.25f, 7.75f, 7.25f)
                curveTo(7.198f, 7.25f, 6.75f, 7.698f, 6.75f, 8.25f)
                curveTo(6.75f, 8.802f, 7.198f, 9.25f, 7.75f, 9.25f)
                close()
                moveTo(11.25f, 7.5f)
                curveTo(10.836f, 7.5f, 10.5f, 7.836f, 10.5f, 8.25f)
                curveTo(10.5f, 8.664f, 10.836f, 9f, 11.25f, 9f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 9f, 17.5f, 8.664f, 17.5f, 8.25f)
                curveTo(17.5f, 7.836f, 17.164f, 7.5f, 16.75f, 7.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 11.25f)
                curveTo(10.836f, 11.25f, 10.5f, 11.586f, 10.5f, 12f)
                curveTo(10.5f, 12.414f, 10.836f, 12.75f, 11.25f, 12.75f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 12.75f, 17.5f, 12.414f, 17.5f, 12f)
                curveTo(17.5f, 11.586f, 17.164f, 11.25f, 16.75f, 11.25f)
                horizontalLineTo(11.25f)
                close()
                moveTo(10.5f, 15.75f)
                curveTo(10.5f, 16.164f, 10.836f, 16.5f, 11.25f, 16.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 16.5f, 17.5f, 16.164f, 17.5f, 15.75f)
                curveTo(17.5f, 15.336f, 17.164f, 15f, 16.75f, 15f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 15f, 10.5f, 15.336f, 10.5f, 15.75f)
                close()
                moveTo(8.75f, 12f)
                curveTo(8.75f, 11.448f, 8.302f, 11f, 7.75f, 11f)
                curveTo(7.198f, 11f, 6.75f, 11.448f, 6.75f, 12f)
                curveTo(6.75f, 12.552f, 7.198f, 13f, 7.75f, 13f)
                curveTo(8.302f, 13f, 8.75f, 12.552f, 8.75f, 12f)
                close()
                moveTo(7.75f, 16.75f)
                curveTo(8.302f, 16.75f, 8.75f, 16.302f, 8.75f, 15.75f)
                curveTo(8.75f, 15.198f, 8.302f, 14.75f, 7.75f, 14.75f)
                curveTo(7.198f, 14.75f, 6.75f, 15.198f, 6.75f, 15.75f)
                curveTo(6.75f, 16.302f, 7.198f, 16.75f, 7.75f, 16.75f)
                close()
            }
        }.build()

        return _TextBulletListSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TextBulletListSquare: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListSquare, contentDescription = null)
    }
}
