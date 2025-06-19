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

public val FluentIcons.Regular.Phone: ImageVector
    get() {
        if (_Phone != null) {
            return _Phone!!
        }
        _Phone = ImageVector.Builder(
            name = "Regular.Phone",
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
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.836f, 16.164f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(13.249f, 17.5f)
                curveTo(13.663f, 17.499f, 13.999f, 17.835f, 14f, 18.249f)
                curveTo(14.001f, 18.663f, 13.665f, 18.999f, 13.251f, 19f)
                lineTo(10.751f, 19.004f)
                curveTo(10.337f, 19.004f, 10.001f, 18.669f, 10f, 18.255f)
                curveTo(9.999f, 17.841f, 10.335f, 17.504f, 10.749f, 17.504f)
                lineTo(13.249f, 17.5f)
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
        Image(imageVector = FluentIcons.Regular.Phone, contentDescription = null)
    }
}
