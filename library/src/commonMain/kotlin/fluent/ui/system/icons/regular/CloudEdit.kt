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

public val FluentUi.Regular.CloudEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5.5f)
            curveTo(9.587f, 5.5f, 7.617f, 7.4f, 7.505f, 9.785f)
            curveTo(7.486f, 10.185f, 7.156f, 10.5f, 6.756f, 10.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 10.5f, 3.5f, 11.843f, 3.5f, 13.5f)
            curveTo(3.5f, 15.157f, 4.843f, 16.5f, 6.5f, 16.5f)
            horizontalLineTo(12.855f)
            lineTo(12.49f, 16.865f)
            curveTo(12.162f, 17.193f, 11.901f, 17.578f, 11.717f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
            curveTo(18.839f, 9.104f, 19.678f, 9.466f, 20.353f, 10.02f)
            curveTo(19.745f, 10.087f, 19.153f, 10.323f, 18.652f, 10.729f)
            curveTo(18.297f, 10.582f, 17.908f, 10.5f, 17.5f, 10.5f)
            horizontalLineTo(17.244f)
            curveTo(16.844f, 10.5f, 16.514f, 10.185f, 16.495f, 9.785f)
            curveTo(16.383f, 7.4f, 14.413f, 5.5f, 12f, 5.5f)
            close()
            moveTo(19.1f, 11.67f)
            lineTo(13.197f, 17.572f)
            curveTo(12.853f, 17.916f, 12.609f, 18.347f, 12.491f, 18.819f)
            lineTo(12.033f, 20.65f)
            curveTo(11.834f, 21.446f, 12.556f, 22.167f, 13.352f, 21.968f)
            lineTo(15.182f, 21.511f)
            curveTo(15.655f, 21.393f, 16.086f, 21.149f, 16.43f, 20.804f)
            lineTo(22.332f, 14.902f)
            curveTo(23.225f, 14.009f, 23.225f, 12.562f, 22.332f, 11.67f)
            curveTo(21.44f, 10.777f, 19.993f, 10.777f, 19.1f, 11.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CloudEdit, contentDescription = null)
    }
}
