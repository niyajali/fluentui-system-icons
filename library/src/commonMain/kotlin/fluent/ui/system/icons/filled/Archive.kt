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

public val FluentIcons.Filled.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Filled.Archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 4.5f)
                curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 3f, 21f, 3.672f, 21f, 4.5f)
                verticalLineTo(6f)
                curveTo(21f, 6.828f, 20.328f, 7.5f, 19.5f, 7.5f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 7.5f, 3f, 6.828f, 3f, 6f)
                verticalLineTo(4.5f)
                close()
                moveTo(4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(17.25f)
                curveTo(20f, 19.321f, 18.321f, 21f, 16.25f, 21f)
                horizontalLineTo(7.75f)
                curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
                verticalLineTo(9f)
                close()
                moveTo(10.25f, 11f)
                curveTo(9.836f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
                curveTo(9.5f, 12.164f, 9.836f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 12.5f, 14.5f, 12.164f, 14.5f, 11.75f)
                curveTo(14.5f, 11.336f, 14.164f, 11f, 13.75f, 11f)
                horizontalLineTo(10.25f)
                close()
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null

@Preview
@Composable
private fun ArchivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Archive, contentDescription = null)
    }
}
