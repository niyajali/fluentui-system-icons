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

public val FluentIcons.Regular.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) {
            return _CaretRight!!
        }
        _CaretRight = ImageVector.Builder(
            name = "Regular.CaretRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.073f, 18.839f)
                curveTo(10.265f, 19.546f, 9f, 18.972f, 9f, 17.898f)
                lineTo(9f, 6.102f)
                curveTo(9f, 5.028f, 10.265f, 4.454f, 11.073f, 5.161f)
                lineTo(17.384f, 10.683f)
                curveTo(18.181f, 11.38f, 18.181f, 12.62f, 17.384f, 13.317f)
                lineTo(11.073f, 18.839f)
                close()
                moveTo(10.5f, 17.347f)
                lineTo(16.396f, 12.188f)
                curveTo(16.51f, 12.089f, 16.51f, 11.912f, 16.396f, 11.812f)
                lineTo(10.5f, 6.653f)
                lineTo(10.5f, 17.347f)
                close()
            }
        }.build()

        return _CaretRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRight: ImageVector? = null

@Preview
@Composable
private fun CaretRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CaretRight, contentDescription = null)
    }
}
