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

public val FluentIcons.Filled.PersonEdit: ImageVector
    get() {
        if (_PersonEdit != null) {
            return _PersonEdit!!
        }
        _PersonEdit = ImageVector.Builder(
            name = "Filled.PersonEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.491f, 17.865f)
                lineTo(16.355f, 14f)
                horizontalLineTo(6.253f)
                curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(4.004f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
                curveTo(5.902f, 20.712f, 8.084f, 21.776f, 11f, 21.969f)
                curveTo(10.996f, 21.786f, 11.016f, 21.598f, 11.064f, 21.408f)
                lineTo(11.521f, 19.577f)
                curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.491f, 17.865f)
                close()
                moveTo(12f, 2.005f)
                curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
                curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
                curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
                curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _PersonEdit!!
    }

@Suppress("ObjectPropertyName")
private var _PersonEdit: ImageVector? = null

@Preview
@Composable
private fun PersonEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonEdit, contentDescription = null)
    }
}
