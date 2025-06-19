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

public val FluentIcons.Filled.FullScreenMaximize: ImageVector
    get() {
        if (_FullScreenMaximize != null) {
            return _FullScreenMaximize!!
        }
        _FullScreenMaximize = ImageVector.Builder(
            name = "Filled.FullScreenMaximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 6f)
                curveTo(5f, 5.448f, 5.448f, 5f, 6f, 5f)
                horizontalLineTo(8f)
                curveTo(8.552f, 5f, 9f, 4.552f, 9f, 4f)
                curveTo(9f, 3.448f, 8.552f, 3f, 8f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                verticalLineTo(8f)
                curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
                curveTo(4.552f, 9f, 5f, 8.552f, 5f, 8f)
                verticalLineTo(6f)
                close()
                moveTo(5f, 18f)
                curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
                horizontalLineTo(8f)
                curveTo(8.552f, 19f, 9f, 19.448f, 9f, 20f)
                curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
                horizontalLineTo(6f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                verticalLineTo(16f)
                curveTo(3f, 15.448f, 3.448f, 15f, 4f, 15f)
                curveTo(4.552f, 15f, 5f, 15.448f, 5f, 16f)
                verticalLineTo(18f)
                close()
                moveTo(18f, 5f)
                curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
                verticalLineTo(8f)
                curveTo(19f, 8.552f, 19.448f, 9f, 20f, 9f)
                curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
                verticalLineTo(6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(16f)
                curveTo(15.448f, 3f, 15f, 3.448f, 15f, 4f)
                curveTo(15f, 4.552f, 15.448f, 5f, 16f, 5f)
                horizontalLineTo(18f)
                close()
                moveTo(19f, 18f)
                curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
                horizontalLineTo(16f)
                curveTo(15.448f, 19f, 15f, 19.448f, 15f, 20f)
                curveTo(15f, 20.552f, 15.448f, 21f, 16f, 21f)
                horizontalLineTo(18f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                verticalLineTo(16f)
                curveTo(21f, 15.448f, 20.552f, 15f, 20f, 15f)
                curveTo(19.448f, 15f, 19f, 15.448f, 19f, 16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FullScreenMaximize!!
    }

@Suppress("ObjectPropertyName")
private var _FullScreenMaximize: ImageVector? = null

@Preview
@Composable
private fun FullScreenMaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FullScreenMaximize, contentDescription = null)
    }
}
