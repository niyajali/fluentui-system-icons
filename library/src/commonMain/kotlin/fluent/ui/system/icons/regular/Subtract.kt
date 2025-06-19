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

public val FluentIcons.Regular.Subtract: ImageVector
    get() {
        if (_Subtract != null) {
            return _Subtract!!
        }
        _Subtract = ImageVector.Builder(
            name = "Regular.Subtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.754f, 12.5f)
                horizontalLineTo(20.246f)
                curveTo(20.66f, 12.5f, 20.996f, 12.164f, 20.996f, 11.75f)
                curveTo(20.996f, 11.336f, 20.66f, 11f, 20.246f, 11f)
                horizontalLineTo(3.754f)
                curveTo(3.34f, 11f, 3.004f, 11.336f, 3.004f, 11.75f)
                curveTo(3.004f, 12.164f, 3.34f, 12.5f, 3.754f, 12.5f)
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
        Image(imageVector = FluentIcons.Regular.Subtract, contentDescription = null)
    }
}
