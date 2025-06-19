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

public val FluentIcons.Filled.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) {
            return _CaretUp!!
        }
        _CaretUp = ImageVector.Builder(
            name = "Filled.CaretUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.102f, 16.98f)
                curveTo(5.028f, 16.98f, 4.454f, 15.716f, 5.161f, 14.907f)
                lineTo(10.683f, 8.597f)
                curveTo(11.38f, 7.8f, 12.62f, 7.8f, 13.317f, 8.597f)
                lineTo(18.839f, 14.907f)
                curveTo(19.546f, 15.716f, 18.972f, 16.98f, 17.898f, 16.98f)
                horizontalLineTo(6.102f)
                close()
            }
        }.build()

        return _CaretUp!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUp: ImageVector? = null

@Preview
@Composable
private fun CaretUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CaretUp, contentDescription = null)
    }
}
