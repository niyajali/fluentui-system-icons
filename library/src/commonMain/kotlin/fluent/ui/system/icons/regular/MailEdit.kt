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

public val FluentUi.Regular.MailEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.75f, 3f)
            horizontalLineTo(5.25f)
            lineTo(5.066f, 3.005f)
            curveTo(3.356f, 3.101f, 2f, 4.517f, 2f, 6.25f)
            verticalLineTo(15.75f)
            lineTo(2.005f, 15.934f)
            curveTo(2.101f, 17.643f, 3.517f, 19f, 5.25f, 19f)
            horizontalLineTo(11.717f)
            curveTo(11.901f, 18.578f, 12.162f, 18.193f, 12.49f, 17.865f)
            lineTo(12.855f, 17.5f)
            horizontalLineTo(5.25f)
            lineTo(5.106f, 17.494f)
            curveTo(4.207f, 17.421f, 3.5f, 16.668f, 3.5f, 15.75f)
            verticalLineTo(8.374f)
            lineTo(11.651f, 12.664f)
            lineTo(11.747f, 12.706f)
            curveTo(11.943f, 12.776f, 12.162f, 12.762f, 12.349f, 12.664f)
            lineTo(20.5f, 8.373f)
            verticalLineTo(11.007f)
            curveTo(21.008f, 10.974f, 21.523f, 11.058f, 22f, 11.26f)
            verticalLineTo(6.25f)
            lineTo(21.995f, 6.066f)
            curveTo(21.899f, 4.356f, 20.483f, 3f, 18.75f, 3f)
            close()
            moveTo(5.25f, 4.5f)
            horizontalLineTo(18.75f)
            lineTo(18.893f, 4.506f)
            curveTo(19.793f, 4.579f, 20.5f, 5.332f, 20.5f, 6.25f)
            verticalLineTo(6.678f)
            lineTo(12f, 11.153f)
            lineTo(3.5f, 6.679f)
            verticalLineTo(6.25f)
            lineTo(3.506f, 6.106f)
            curveTo(3.579f, 5.207f, 4.332f, 4.5f, 5.25f, 4.5f)
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
}

@Preview
@Composable
private fun MailEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailEdit, contentDescription = null)
    }
}
