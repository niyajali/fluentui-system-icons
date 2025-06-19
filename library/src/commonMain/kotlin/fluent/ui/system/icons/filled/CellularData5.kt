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

public val FluentIcons.Filled.CellularData5: ImageVector
    get() {
        if (_CellularData5 != null) {
            return _CellularData5!!
        }
        _CellularData5 = ImageVector.Builder(
            name = "Filled.CellularData5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 17f)
                curveTo(4.552f, 17f, 5f, 17.44f, 5f, 17.984f)
                verticalLineTo(19.016f)
                curveTo(5f, 19.56f, 4.552f, 20f, 4f, 20f)
                curveTo(3.448f, 20f, 3f, 19.56f, 3f, 19.016f)
                verticalLineTo(17.984f)
                curveTo(3f, 17.44f, 3.448f, 17f, 4f, 17f)
                close()
            }
        }.build()

        return _CellularData5!!
    }

@Suppress("ObjectPropertyName")
private var _CellularData5: ImageVector? = null

@Preview
@Composable
private fun CellularData5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CellularData5, contentDescription = null)
    }
}
