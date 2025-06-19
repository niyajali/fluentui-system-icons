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

public val FluentIcons.Filled.Line: ImageVector
    get() {
        if (_Line != null) {
            return _Line!!
        }
        _Line = ImageVector.Builder(
            name = "Filled.Line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.707f, 2.293f)
                curveTo(22.098f, 2.683f, 22.098f, 3.317f, 21.707f, 3.707f)
                lineTo(3.707f, 21.707f)
                curveTo(3.317f, 22.098f, 2.683f, 22.098f, 2.293f, 21.707f)
                curveTo(1.902f, 21.317f, 1.902f, 20.683f, 2.293f, 20.293f)
                lineTo(20.293f, 2.293f)
                curveTo(20.683f, 1.902f, 21.317f, 1.902f, 21.707f, 2.293f)
                close()
            }
        }.build()

        return _Line!!
    }

@Suppress("ObjectPropertyName")
private var _Line: ImageVector? = null

@Preview
@Composable
private fun LinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Line, contentDescription = null)
    }
}
