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

public val FluentIcons.Filled.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) {
            return _ChevronUp!!
        }
        _ChevronUp = ImageVector.Builder(
            name = "Filled.ChevronUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.293f, 15.707f)
                curveTo(4.683f, 16.098f, 5.317f, 16.098f, 5.707f, 15.707f)
                lineTo(12f, 9.414f)
                lineTo(18.293f, 15.707f)
                curveTo(18.683f, 16.098f, 19.317f, 16.098f, 19.707f, 15.707f)
                curveTo(20.098f, 15.317f, 20.098f, 14.683f, 19.707f, 14.293f)
                lineTo(12.707f, 7.293f)
                curveTo(12.317f, 6.902f, 11.683f, 6.902f, 11.293f, 7.293f)
                lineTo(4.293f, 14.293f)
                curveTo(3.902f, 14.683f, 3.902f, 15.317f, 4.293f, 15.707f)
                close()
            }
        }.build()

        return _ChevronUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUp: ImageVector? = null

@Preview
@Composable
private fun ChevronUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronUp, contentDescription = null)
    }
}
