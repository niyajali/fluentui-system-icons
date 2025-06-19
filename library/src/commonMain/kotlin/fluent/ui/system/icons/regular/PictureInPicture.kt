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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.PictureInPicture: ImageVector
    get() {
        if (_PictureInPicture != null) {
            return _PictureInPicture!!
        }
        _PictureInPicture = ImageVector.Builder(
            name = "Regular.PictureInPicture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
                verticalLineTo(12f)
                horizontalLineTo(20.5f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.284f, 19.716f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 16.716f, 4.284f, 17.5f, 5.25f, 17.5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(14f, 13f)
                curveTo(12.895f, 13f, 12f, 13.895f, 12f, 15f)
                verticalLineTo(20f)
                curveTo(12f, 21.105f, 12.895f, 22f, 14f, 22f)
                horizontalLineTo(21f)
                curveTo(22.105f, 22f, 23f, 21.105f, 23f, 20f)
                verticalLineTo(15f)
                curveTo(23f, 13.895f, 22.105f, 13f, 21f, 13f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _PictureInPicture!!
    }

@Suppress("ObjectPropertyName")
private var _PictureInPicture: ImageVector? = null

@Preview
@Composable
private fun PictureInPicturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PictureInPicture, contentDescription = null)
    }
}
