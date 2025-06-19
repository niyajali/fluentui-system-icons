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

public val FluentIcons.Filled.Phone: ImageVector
    get() {
        if (_Phone != null) {
            return _Phone!!
        }
        _Phone = ImageVector.Builder(
            name = "Filled.Phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.75f, 2f)
                curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
                horizontalLineTo(15.75f)
                close()
                moveTo(13.25f, 18f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 18f, 10f, 18.336f, 10f, 18.75f)
                curveTo(10f, 19.164f, 10.336f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 19.5f, 14f, 19.164f, 14f, 18.75f)
                curveTo(14f, 18.336f, 13.664f, 18f, 13.25f, 18f)
                close()
            }
        }.build()

        return _Phone!!
    }

@Suppress("ObjectPropertyName")
private var _Phone: ImageVector? = null

@Preview
@Composable
private fun PhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Phone, contentDescription = null)
    }
}
