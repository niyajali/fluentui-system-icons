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

public val FluentIcons.Filled.CaretDownRight: ImageVector
    get() {
        if (_CaretDownRight != null) {
            return _CaretDownRight!!
        }
        _CaretDownRight = ImageVector.Builder(
            name = "Filled.CaretDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 7.208f)
                curveTo(18f, 6.094f, 16.654f, 5.536f, 15.867f, 6.324f)
                lineTo(6.324f, 15.867f)
                curveTo(5.536f, 16.654f, 6.094f, 18f, 7.208f, 18f)
                horizontalLineTo(16.25f)
                curveTo(17.217f, 18f, 18f, 17.217f, 18f, 16.25f)
                verticalLineTo(7.208f)
                close()
            }
        }.build()

        return _CaretDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDownRight: ImageVector? = null

@Preview
@Composable
private fun CaretDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CaretDownRight, contentDescription = null)
    }
}
