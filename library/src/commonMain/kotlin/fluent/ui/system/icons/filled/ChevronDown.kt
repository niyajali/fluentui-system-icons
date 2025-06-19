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

public val FluentIcons.Filled.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) {
            return _ChevronDown!!
        }
        _ChevronDown = ImageVector.Builder(
            name = "Filled.ChevronDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.293f, 8.293f)
                curveTo(4.683f, 7.902f, 5.317f, 7.902f, 5.707f, 8.293f)
                lineTo(12f, 14.586f)
                lineTo(18.293f, 8.293f)
                curveTo(18.683f, 7.902f, 19.317f, 7.902f, 19.707f, 8.293f)
                curveTo(20.098f, 8.683f, 20.098f, 9.317f, 19.707f, 9.707f)
                lineTo(12.707f, 16.707f)
                curveTo(12.317f, 17.098f, 11.683f, 17.098f, 11.293f, 16.707f)
                lineTo(4.293f, 9.707f)
                curveTo(3.902f, 9.317f, 3.902f, 8.683f, 4.293f, 8.293f)
                close()
            }
        }.build()

        return _ChevronDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDown: ImageVector? = null

@Preview
@Composable
private fun ChevronDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDown, contentDescription = null)
    }
}
