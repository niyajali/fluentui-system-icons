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

public val FluentIcons.Regular.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) {
            return _CaretDown!!
        }
        _CaretDown = ImageVector.Builder(
            name = "Regular.CaretDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.161f, 10.073f)
                curveTo(4.454f, 9.265f, 5.028f, 8f, 6.102f, 8f)
                horizontalLineTo(17.898f)
                curveTo(18.972f, 8f, 19.546f, 9.265f, 18.839f, 10.073f)
                lineTo(13.317f, 16.384f)
                curveTo(12.62f, 17.181f, 11.38f, 17.181f, 10.683f, 16.384f)
                lineTo(5.161f, 10.073f)
                close()
                moveTo(6.653f, 9.5f)
                lineTo(11.812f, 15.396f)
                curveTo(11.912f, 15.51f, 12.089f, 15.51f, 12.188f, 15.396f)
                lineTo(17.347f, 9.5f)
                horizontalLineTo(6.653f)
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
        Image(imageVector = FluentIcons.Regular.CaretDown, contentDescription = null)
    }
}
