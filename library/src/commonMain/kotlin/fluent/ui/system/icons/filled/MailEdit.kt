package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.MailEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 11.26f)
            verticalLineTo(7.608f)
            lineTo(12.348f, 12.664f)
            curveTo(12.13f, 12.778f, 11.87f, 12.778f, 11.652f, 12.664f)
            lineTo(2f, 7.608f)
            verticalLineTo(15.75f)
            lineTo(2.005f, 15.934f)
            curveTo(2.101f, 17.643f, 3.517f, 19f, 5.25f, 19f)
            horizontalLineTo(11.717f)
            curveTo(11.901f, 18.578f, 12.162f, 18.193f, 12.49f, 17.865f)
            lineTo(18.393f, 11.962f)
            curveTo(19.368f, 10.987f, 20.804f, 10.753f, 22f, 11.26f)
            close()
            moveTo(18.75f, 3f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 3.005f)
            curveTo(3.464f, 3.095f, 2.174f, 4.343f, 2.016f, 5.924f)
            lineTo(12f, 11.153f)
            lineTo(21.984f, 5.924f)
            curveTo(21.82f, 4.282f, 20.435f, 3f, 18.75f, 3f)
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
        Image(imageVector = FluentUi.Filled.MailEdit, contentDescription = null)
    }
}
