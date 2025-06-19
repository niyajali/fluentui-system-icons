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

public val FluentIcons.Filled.PhoneEdit: ImageVector
    get() {
        if (_PhoneEdit != null) {
            return _PhoneEdit!!
        }
        _PhoneEdit = ImageVector.Builder(
            name = "Filled.PhoneEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.197f, 7.572f)
                lineTo(19.1f, 1.669f)
                curveTo(19.993f, 0.777f, 21.44f, 0.777f, 22.332f, 1.669f)
                curveTo(23.225f, 2.562f, 23.225f, 4.009f, 22.332f, 4.902f)
                lineTo(16.43f, 10.804f)
                curveTo(16.086f, 11.149f, 15.655f, 11.393f, 15.182f, 11.511f)
                lineTo(13.352f, 11.968f)
                curveTo(12.556f, 12.167f, 11.834f, 11.446f, 12.033f, 10.65f)
                lineTo(12.491f, 8.819f)
                curveTo(12.609f, 8.347f, 12.853f, 7.916f, 13.197f, 7.572f)
                close()
                moveTo(12.49f, 6.865f)
                lineTo(16.986f, 2.369f)
                curveTo(16.631f, 2.136f, 16.206f, 2f, 15.75f, 2f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(6f, 20.993f, 7.007f, 22f, 8.25f, 22f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 22f, 18f, 20.993f, 18f, 19.75f)
                verticalLineTo(10.648f)
                lineTo(17.137f, 11.511f)
                curveTo(16.665f, 11.984f, 16.073f, 12.319f, 15.425f, 12.481f)
                lineTo(13.594f, 12.939f)
                curveTo(12.066f, 13.321f, 10.681f, 11.936f, 11.063f, 10.408f)
                lineTo(11.521f, 8.577f)
                curveTo(11.683f, 7.929f, 12.018f, 7.337f, 12.49f, 6.865f)
                close()
                moveTo(13.25f, 18f)
                curveTo(13.664f, 18f, 14f, 18.336f, 14f, 18.75f)
                curveTo(14f, 19.164f, 13.664f, 19.5f, 13.25f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 19.5f, 10f, 19.164f, 10f, 18.75f)
                curveTo(10f, 18.336f, 10.336f, 18f, 10.75f, 18f)
                horizontalLineTo(13.25f)
                close()
            }
        }.build()

        return _PhoneEdit!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneEdit: ImageVector? = null

@Preview
@Composable
private fun PhoneEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneEdit, contentDescription = null)
    }
}
