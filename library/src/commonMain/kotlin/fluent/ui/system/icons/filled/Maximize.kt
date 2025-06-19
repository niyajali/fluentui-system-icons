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

public val FluentIcons.Filled.Maximize: ImageVector
    get() {
        if (_Maximize != null) {
            return _Maximize!!
        }
        _Maximize = ImageVector.Builder(
            name = "Filled.Maximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 3f)
                horizontalLineTo(18f)
                curveTo(19.657f, 3f, 21f, 4.343f, 21f, 6f)
                verticalLineTo(18f)
                curveTo(21f, 19.657f, 19.657f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                verticalLineTo(6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                close()
                moveTo(6f, 5f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                verticalLineTo(18f)
                curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
                horizontalLineTo(18f)
                curveTo(18.552f, 19f, 19f, 18.552f, 19f, 18f)
                verticalLineTo(6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Maximize!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize: ImageVector? = null

@Preview
@Composable
private fun MaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Maximize, contentDescription = null)
    }
}
