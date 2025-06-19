package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.Add: ImageVector
    get() {
        if (_Add != null) {
            return _Add!!
        }
        _Add = ImageVector.Builder(
            name = "Regular.Add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.25f)
                curveTo(12.414f, 3.25f, 12.75f, 3.586f, 12.75f, 4f)
                verticalLineTo(11.25f)
                horizontalLineTo(20f)
                curveTo(20.414f, 11.25f, 20.75f, 11.586f, 20.75f, 12f)
                curveTo(20.75f, 12.414f, 20.414f, 12.75f, 20f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(20f)
                curveTo(12.75f, 20.414f, 12.414f, 20.75f, 12f, 20.75f)
                curveTo(11.586f, 20.75f, 11.25f, 20.414f, 11.25f, 20f)
                verticalLineTo(12.75f)
                horizontalLineTo(4f)
                curveTo(3.586f, 12.75f, 3.25f, 12.414f, 3.25f, 12f)
                curveTo(3.25f, 11.586f, 3.586f, 11.25f, 4f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(4f)
                curveTo(11.25f, 3.586f, 11.586f, 3.25f, 12f, 3.25f)
                close()
            }
        }.build()

        return _Add!!
    }

@Suppress("ObjectPropertyName")
private var _Add: ImageVector? = null

@Preview
@Composable
private fun AddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Add, contentDescription = null)
    }
}
