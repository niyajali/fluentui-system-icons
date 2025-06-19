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

public val FluentIcons.Filled.BorderLeftRight: ImageVector
    get() {
        if (_BorderLeftRight != null) {
            return _BorderLeftRight!!
        }
        _BorderLeftRight = ImageVector.Builder(
            name = "Filled.BorderLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17f, 4f)
                curveTo(17f, 3.448f, 17.448f, 3f, 18f, 3f)
                curveTo(19.657f, 3f, 21f, 4.343f, 21f, 6f)
                verticalLineTo(18f)
                curveTo(21f, 19.657f, 19.657f, 21f, 18f, 21f)
                curveTo(17.448f, 21f, 17f, 20.552f, 17f, 20f)
                curveTo(17f, 19.448f, 17.448f, 19f, 18f, 19f)
                curveTo(18.552f, 19f, 19f, 18.552f, 19f, 18f)
                verticalLineTo(6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                curveTo(17.448f, 5f, 17f, 4.552f, 17f, 4f)
                close()
                moveTo(13f, 5f)
                curveTo(13.552f, 5f, 14f, 4.552f, 14f, 4f)
                curveTo(14f, 3.448f, 13.552f, 3f, 13f, 3f)
                lineTo(11f, 3f)
                curveTo(10.448f, 3f, 10f, 3.448f, 10f, 4f)
                curveTo(10f, 4.552f, 10.448f, 5f, 11f, 5f)
                horizontalLineTo(13f)
                close()
                moveTo(13f, 19f)
                curveTo(13.552f, 19f, 14f, 19.448f, 14f, 20f)
                curveTo(14f, 20.552f, 13.552f, 21f, 13f, 21f)
                horizontalLineTo(11f)
                curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
                curveTo(10f, 19.448f, 10.448f, 19f, 11f, 19f)
                horizontalLineTo(13f)
                close()
                moveTo(6f, 3f)
                curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
                curveTo(7f, 4.552f, 6.552f, 5f, 6f, 5f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                lineTo(5f, 18f)
                curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
                curveTo(6.552f, 19f, 7f, 19.448f, 7f, 20f)
                curveTo(7f, 20.552f, 6.552f, 21f, 6f, 21f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                lineTo(3f, 6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                close()
            }
        }.build()

        return _BorderLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _BorderLeftRight: ImageVector? = null

@Preview
@Composable
private fun BorderLeftRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BorderLeftRight, contentDescription = null)
    }
}
