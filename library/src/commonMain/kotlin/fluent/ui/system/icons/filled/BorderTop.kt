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

public val FluentIcons.Filled.BorderTop: ImageVector
    get() {
        if (_BorderTop != null) {
            return _BorderTop!!
        }
        _BorderTop = ImageVector.Builder(
            name = "Filled.BorderTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6f)
                curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
                curveTo(4.552f, 7f, 5f, 6.552f, 5f, 6f)
                curveTo(5f, 5.448f, 5.448f, 5f, 6f, 5f)
                horizontalLineTo(18f)
                curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
                curveTo(19f, 6.552f, 19.448f, 7f, 20f, 7f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                close()
                moveTo(5f, 11f)
                curveTo(5f, 10.448f, 4.552f, 10f, 4f, 10f)
                curveTo(3.448f, 10f, 3f, 10.448f, 3f, 11f)
                verticalLineTo(13f)
                curveTo(3f, 13.552f, 3.448f, 14f, 4f, 14f)
                curveTo(4.552f, 14f, 5f, 13.552f, 5f, 13f)
                verticalLineTo(11f)
                close()
                moveTo(19f, 11f)
                curveTo(19f, 10.448f, 19.448f, 10f, 20f, 10f)
                curveTo(20.552f, 10f, 21f, 10.448f, 21f, 11f)
                verticalLineTo(13f)
                curveTo(21f, 13.552f, 20.552f, 14f, 20f, 14f)
                curveTo(19.448f, 14f, 19f, 13.552f, 19f, 13f)
                verticalLineTo(11f)
                close()
                moveTo(14f, 20f)
                curveTo(14f, 20.552f, 13.552f, 21f, 13f, 21f)
                horizontalLineTo(11f)
                curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
                curveTo(10f, 19.448f, 10.448f, 19f, 11f, 19f)
                horizontalLineTo(13f)
                curveTo(13.552f, 19f, 14f, 19.448f, 14f, 20f)
                close()
                moveTo(6f, 21f)
                curveTo(6.552f, 21f, 7f, 20.552f, 7f, 20f)
                curveTo(7f, 19.448f, 6.552f, 19f, 6f, 19f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                curveTo(5f, 17.448f, 4.552f, 17f, 4f, 17f)
                curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                close()
                moveTo(17f, 20f)
                curveTo(17f, 20.552f, 17.448f, 21f, 18f, 21f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                curveTo(19.448f, 17f, 19f, 17.448f, 19f, 18f)
                curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
                curveTo(17.448f, 19f, 17f, 19.448f, 17f, 20f)
                close()
            }
        }.build()

        return _BorderTop!!
    }

@Suppress("ObjectPropertyName")
private var _BorderTop: ImageVector? = null

@Preview
@Composable
private fun BorderTopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BorderTop, contentDescription = null)
    }
}
