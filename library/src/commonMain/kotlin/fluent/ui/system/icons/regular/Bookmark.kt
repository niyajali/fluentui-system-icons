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

public val FluentIcons.Regular.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Regular.Bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.191f, 21.855f)
                curveTo(5.695f, 22.212f, 5.003f, 21.857f, 5.003f, 21.246f)
                verticalLineTo(6.25f)
                curveTo(5.003f, 4.455f, 6.458f, 3f, 8.253f, 3f)
                horizontalLineTo(15.751f)
                curveTo(17.546f, 3f, 19.001f, 4.455f, 19.001f, 6.25f)
                verticalLineTo(21.246f)
                curveTo(19.001f, 21.857f, 18.309f, 22.212f, 17.813f, 21.855f)
                lineTo(12.002f, 17.674f)
                lineTo(6.191f, 21.855f)
                close()
                moveTo(17.501f, 6.25f)
                curveTo(17.501f, 5.284f, 16.718f, 4.5f, 15.751f, 4.5f)
                horizontalLineTo(8.253f)
                curveTo(7.286f, 4.5f, 6.503f, 5.284f, 6.503f, 6.25f)
                verticalLineTo(19.782f)
                lineTo(11.564f, 16.141f)
                curveTo(11.826f, 15.953f, 12.179f, 15.953f, 12.44f, 16.141f)
                lineTo(17.501f, 19.782f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _Bookmark!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null

@Preview
@Composable
private fun BookmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Bookmark, contentDescription = null)
    }
}
