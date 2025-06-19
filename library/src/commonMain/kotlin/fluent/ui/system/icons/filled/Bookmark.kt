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

public val FluentIcons.Filled.Bookmark: ImageVector
    get() {
        if (_Bookmark != null) {
            return _Bookmark!!
        }
        _Bookmark = ImageVector.Builder(
            name = "Filled.Bookmark",
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
        Image(imageVector = FluentIcons.Filled.Bookmark, contentDescription = null)
    }
}
