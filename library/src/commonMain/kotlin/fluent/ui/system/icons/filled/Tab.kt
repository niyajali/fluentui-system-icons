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

public val FluentIcons.Filled.Tab: ImageVector
    get() {
        if (_Tab != null) {
            return _Tab!!
        }
        _Tab = ImageVector.Builder(
            name = "Filled.Tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 5f)
                curveTo(5.336f, 5f, 5f, 5.336f, 5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5f, 18.664f, 5.336f, 19f, 5.75f, 19f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 19f, 19f, 18.664f, 19f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19f, 5.336f, 18.664f, 5f, 18.25f, 5f)
                horizontalLineTo(5.75f)
                close()
            }
        }.build()

        return _Tab!!
    }

@Suppress("ObjectPropertyName")
private var _Tab: ImageVector? = null

@Preview
@Composable
private fun TabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Tab, contentDescription = null)
    }
}
