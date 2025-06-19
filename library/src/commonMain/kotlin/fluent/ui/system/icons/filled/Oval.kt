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

public val FluentIcons.Filled.Oval: ImageVector
    get() {
        if (_Oval != null) {
            return _Oval!!
        }
        _Oval = ImageVector.Builder(
            name = "Filled.Oval",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 12f)
                curveTo(2f, 7.582f, 5.582f, 4f, 10f, 4f)
                horizontalLineTo(14f)
                curveTo(18.418f, 4f, 22f, 7.582f, 22f, 12f)
                curveTo(22f, 16.418f, 18.418f, 20f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(5.582f, 20f, 2f, 16.418f, 2f, 12f)
                close()
            }
        }.build()

        return _Oval!!
    }

@Suppress("ObjectPropertyName")
private var _Oval: ImageVector? = null

@Preview
@Composable
private fun OvalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Oval, contentDescription = null)
    }
}
