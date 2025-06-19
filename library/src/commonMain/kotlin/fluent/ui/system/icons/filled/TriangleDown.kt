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

public val FluentIcons.Filled.TriangleDown: ImageVector
    get() {
        if (_TriangleDown != null) {
            return _TriangleDown!!
        }
        _TriangleDown = ImageVector.Builder(
            name = "Filled.TriangleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.253f, 3f)
                curveTo(2.524f, 3f, 1.441f, 4.869f, 2.302f, 6.369f)
                lineTo(10.046f, 19.872f)
                curveTo(10.911f, 21.379f, 13.085f, 21.379f, 13.95f, 19.872f)
                lineTo(21.694f, 6.369f)
                curveTo(22.555f, 4.869f, 21.472f, 3f, 19.742f, 3f)
                horizontalLineTo(4.253f)
                close()
            }
        }.build()

        return _TriangleDown!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleDown: ImageVector? = null

@Preview
@Composable
private fun TriangleDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TriangleDown, contentDescription = null)
    }
}
