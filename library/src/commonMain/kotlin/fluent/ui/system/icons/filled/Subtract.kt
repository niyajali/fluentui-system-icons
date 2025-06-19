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

public val FluentIcons.Filled.Subtract: ImageVector
    get() {
        if (_Subtract != null) {
            return _Subtract!!
        }
        _Subtract = ImageVector.Builder(
            name = "Filled.Subtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.996f, 13f)
                horizontalLineTo(20f)
                curveTo(20.552f, 13f, 21f, 12.552f, 21f, 12f)
                curveTo(21f, 11.448f, 20.552f, 11f, 20f, 11f)
                horizontalLineTo(3.996f)
                curveTo(3.444f, 11f, 2.996f, 11.448f, 2.996f, 12f)
                curveTo(2.996f, 12.552f, 3.444f, 13f, 3.996f, 13f)
                close()
            }
        }.build()

        return _Subtract!!
    }

@Suppress("ObjectPropertyName")
private var _Subtract: ImageVector? = null

@Preview
@Composable
private fun SubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Subtract, contentDescription = null)
    }
}
