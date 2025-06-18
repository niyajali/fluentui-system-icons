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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PhoneEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
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
            moveTo(15.75f, 2f)
            curveTo(16.206f, 2f, 16.631f, 2.136f, 16.986f, 2.369f)
            lineTo(15.849f, 3.506f)
            curveTo(15.816f, 3.502f, 15.783f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
            verticalLineTo(12.021f)
            curveTo(16.729f, 11.876f, 16.943f, 11.705f, 17.137f, 11.511f)
            lineTo(18f, 10.648f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
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
}

@Preview
@Composable
private fun PhoneEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneEdit, contentDescription = null)
    }
}
