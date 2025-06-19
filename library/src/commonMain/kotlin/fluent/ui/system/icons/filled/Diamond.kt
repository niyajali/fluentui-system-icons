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

public val FluentIcons.Filled.Diamond: ImageVector
    get() {
        if (_Diamond != null) {
            return _Diamond!!
        }
        _Diamond = ImageVector.Builder(
            name = "Filled.Diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.952f, 9.702f)
                curveTo(1.683f, 10.972f, 1.683f, 13.029f, 2.952f, 14.299f)
                lineTo(9.702f, 21.049f)
                curveTo(10.972f, 22.318f, 13.029f, 22.318f, 14.299f, 21.049f)
                lineTo(21.049f, 14.299f)
                curveTo(22.318f, 13.029f, 22.318f, 10.972f, 21.049f, 9.702f)
                lineTo(14.299f, 2.952f)
                curveTo(13.029f, 1.683f, 10.972f, 1.683f, 9.702f, 2.952f)
                lineTo(2.952f, 9.702f)
                close()
            }
        }.build()

        return _Diamond!!
    }

@Suppress("ObjectPropertyName")
private var _Diamond: ImageVector? = null

@Preview
@Composable
private fun DiamondPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Diamond, contentDescription = null)
    }
}
