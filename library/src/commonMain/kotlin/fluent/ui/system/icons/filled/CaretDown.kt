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

public val FluentIcons.Filled.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) {
            return _CaretDown!!
        }
        _CaretDown = ImageVector.Builder(
            name = "Filled.CaretDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.102f, 8f)
                curveTo(5.028f, 8f, 4.454f, 9.265f, 5.161f, 10.073f)
                lineTo(10.683f, 16.384f)
                curveTo(11.38f, 17.181f, 12.62f, 17.181f, 13.317f, 16.384f)
                lineTo(18.839f, 10.073f)
                curveTo(19.546f, 9.265f, 18.972f, 8f, 17.898f, 8f)
                horizontalLineTo(6.102f)
                close()
            }
        }.build()

        return _CaretDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDown: ImageVector? = null

@Preview
@Composable
private fun CaretDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CaretDown, contentDescription = null)
    }
}
