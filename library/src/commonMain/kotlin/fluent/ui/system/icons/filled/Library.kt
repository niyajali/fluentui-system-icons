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

public val FluentIcons.Filled.Library: ImageVector
    get() {
        if (_Library != null) {
            return _Library!!
        }
        _Library = ImageVector.Builder(
            name = "Filled.Library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 3f)
                curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(7f, 20.328f, 6.328f, 21f, 5.5f, 21f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 21f, 2f, 20.328f, 2f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
                horizontalLineTo(5.5f)
                close()
                moveTo(11.5f, 3f)
                curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(13f, 20.328f, 12.328f, 21f, 11.5f, 21f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 21f, 8f, 20.328f, 8f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(8f, 3.672f, 8.672f, 3f, 9.5f, 3f)
                horizontalLineTo(11.5f)
                close()
                moveTo(18.781f, 6.124f)
                lineTo(21.995f, 18.643f)
                curveTo(22.201f, 19.445f, 21.718f, 20.263f, 20.915f, 20.469f)
                lineTo(19.039f, 20.95f)
                curveTo(18.236f, 21.156f, 17.419f, 20.673f, 17.213f, 19.87f)
                lineTo(13.999f, 7.353f)
                curveTo(13.793f, 6.55f, 14.276f, 5.733f, 15.079f, 5.527f)
                lineTo(16.955f, 5.044f)
                curveTo(17.758f, 4.839f, 18.575f, 5.323f, 18.781f, 6.124f)
                close()
            }
        }.build()

        return _Library!!
    }

@Suppress("ObjectPropertyName")
private var _Library: ImageVector? = null

@Preview
@Composable
private fun LibraryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Library, contentDescription = null)
    }
}
