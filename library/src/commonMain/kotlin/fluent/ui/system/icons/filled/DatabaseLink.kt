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

public val FluentUi.Filled.DatabaseLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabaseLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 10f)
            curveTo(16.418f, 10f, 20f, 8.209f, 20f, 6f)
            curveTo(20f, 3.791f, 16.418f, 2f, 12f, 2f)
            curveTo(7.582f, 2f, 4f, 3.791f, 4f, 6f)
            curveTo(4f, 8.209f, 7.582f, 10f, 12f, 10f)
            close()
            moveTo(18.328f, 10.17f)
            curveTo(18.916f, 9.876f, 19.498f, 9.504f, 20f, 9.053f)
            verticalLineTo(13.059f)
            curveTo(19.756f, 13.02f, 19.505f, 13f, 19.25f, 13f)
            horizontalLineTo(15.75f)
            curveTo(13.127f, 13f, 11f, 15.127f, 11f, 17.75f)
            curveTo(11f, 19.556f, 12.008f, 21.127f, 13.493f, 21.931f)
            curveTo(13.009f, 21.976f, 12.51f, 22f, 12f, 22f)
            curveTo(7.582f, 22f, 4f, 20.209f, 4f, 18f)
            verticalLineTo(9.053f)
            curveTo(4.502f, 9.504f, 5.084f, 9.876f, 5.672f, 10.17f)
            curveTo(7.369f, 11.019f, 9.608f, 11.5f, 12f, 11.5f)
            curveTo(14.392f, 11.5f, 16.631f, 11.019f, 18.328f, 10.17f)
            close()
            moveTo(23f, 17.75f)
            curveTo(23f, 15.679f, 21.321f, 14f, 19.25f, 14f)
            lineTo(19.148f, 14.007f)
            curveTo(18.782f, 14.057f, 18.5f, 14.37f, 18.5f, 14.75f)
            curveTo(18.5f, 15.164f, 18.836f, 15.5f, 19.25f, 15.5f)
            lineTo(19.404f, 15.505f)
            curveTo(20.575f, 15.584f, 21.5f, 16.559f, 21.5f, 17.75f)
            curveTo(21.5f, 18.993f, 20.493f, 20f, 19.25f, 20f)
            lineTo(19.247f, 20.005f)
            lineTo(19.145f, 20.012f)
            curveTo(18.779f, 20.063f, 18.498f, 20.378f, 18.5f, 20.758f)
            curveTo(18.502f, 21.172f, 18.839f, 21.507f, 19.253f, 21.505f)
            verticalLineTo(21.5f)
            lineTo(19.452f, 21.495f)
            curveTo(21.428f, 21.391f, 23f, 19.754f, 23f, 17.75f)
            close()
            moveTo(16.5f, 14.75f)
            curveTo(16.5f, 14.336f, 16.164f, 14f, 15.75f, 14f)
            lineTo(15.551f, 14.005f)
            curveTo(13.572f, 14.109f, 12f, 15.746f, 12f, 17.75f)
            curveTo(12f, 19.821f, 13.679f, 21.5f, 15.75f, 21.5f)
            lineTo(15.852f, 21.493f)
            curveTo(16.218f, 21.444f, 16.5f, 21.13f, 16.5f, 20.75f)
            curveTo(16.5f, 20.336f, 16.164f, 20f, 15.75f, 20f)
            lineTo(15.596f, 19.995f)
            curveTo(14.425f, 19.916f, 13.5f, 18.941f, 13.5f, 17.75f)
            curveTo(13.5f, 16.507f, 14.507f, 15.5f, 15.75f, 15.5f)
            lineTo(15.852f, 15.493f)
            curveTo(16.218f, 15.443f, 16.5f, 15.13f, 16.5f, 14.75f)
            close()
            moveTo(20f, 17.75f)
            curveTo(20f, 17.336f, 19.664f, 17f, 19.25f, 17f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 17.007f)
            curveTo(15.282f, 17.056f, 15f, 17.37f, 15f, 17.75f)
            curveTo(15f, 18.164f, 15.336f, 18.5f, 15.75f, 18.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 18.493f)
            curveTo(19.718f, 18.444f, 20f, 18.13f, 20f, 17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabaseLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DatabaseLink, contentDescription = null)
    }
}
