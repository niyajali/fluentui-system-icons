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

public val FluentIcons.Filled.TetrisApp: ImageVector
    get() {
        if (_TetrisApp != null) {
            return _TetrisApp!!
        }
        _TetrisApp = ImageVector.Builder(
            name = "Filled.TetrisApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 3f)
                curveTo(8f, 2.448f, 8.448f, 2f, 9f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                close()
                moveTo(3f, 8f)
                curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
                verticalLineTo(12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
                moveTo(13f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                curveTo(12.552f, 13f, 13f, 12.552f, 13f, 12f)
                verticalLineTo(8f)
                close()
                moveTo(18f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                curveTo(18.552f, 7f, 19f, 6.552f, 19f, 6f)
                verticalLineTo(3f)
                curveTo(19f, 2.448f, 18.552f, 2f, 18f, 2f)
                close()
                moveTo(4f, 17f)
                curveTo(4f, 16.448f, 4.448f, 16f, 5f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(4.448f, 21f, 4f, 20.552f, 4f, 20f)
                verticalLineTo(17f)
                close()
                moveTo(15f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                close()
                moveTo(16f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
                moveTo(17f, 10f)
                curveTo(16.448f, 10f, 16f, 10.448f, 16f, 11f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                curveTo(21f, 10.448f, 20.552f, 10f, 20f, 10f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _TetrisApp!!
    }

@Suppress("ObjectPropertyName")
private var _TetrisApp: ImageVector? = null

@Preview
@Composable
private fun TetrisAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TetrisApp, contentDescription = null)
    }
}
