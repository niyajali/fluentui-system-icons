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

public val FluentIcons.Filled.DocumentBorder: ImageVector
    get() {
        if (_DocumentBorder != null) {
            return _DocumentBorder!!
        }
        _DocumentBorder = ImageVector.Builder(
            name = "Filled.DocumentBorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.25f, 2f)
                curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 22f, 20f, 20.545f, 20f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(20f, 3.455f, 18.545f, 2f, 16.75f, 2f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.5f, 5.25f)
                curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(17.716f, 3.5f, 18.5f, 4.284f, 18.5f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.716f, 17.716f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(8f, 5f)
                curveTo(7.448f, 5f, 7f, 5.448f, 7f, 6f)
                verticalLineTo(18f)
                curveTo(7f, 18.552f, 7.448f, 19f, 8f, 19f)
                horizontalLineTo(16f)
                curveTo(16.552f, 19f, 17f, 18.552f, 17f, 18f)
                verticalLineTo(6f)
                curveTo(17f, 5.448f, 16.552f, 5f, 16f, 5f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _DocumentBorder!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentBorder: ImageVector? = null

@Preview
@Composable
private fun DocumentBorderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentBorder, contentDescription = null)
    }
}
