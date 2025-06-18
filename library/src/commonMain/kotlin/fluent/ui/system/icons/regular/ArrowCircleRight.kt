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

public val FluentUi.Regular.ArrowCircleRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.001f, 2f)
            curveTo(17.524f, 2f, 22.001f, 6.477f, 22.001f, 12f)
            curveTo(22.001f, 17.523f, 17.524f, 22f, 12.001f, 22f)
            curveTo(6.478f, 22f, 2.001f, 17.523f, 2.001f, 12f)
            curveTo(2.001f, 6.477f, 6.478f, 2f, 12.001f, 2f)
            close()
            moveTo(12.001f, 3.5f)
            curveTo(7.307f, 3.5f, 3.501f, 7.306f, 3.501f, 12f)
            curveTo(3.501f, 16.694f, 7.307f, 20.5f, 12.001f, 20.5f)
            curveTo(16.695f, 20.5f, 20.501f, 16.694f, 20.501f, 12f)
            curveTo(20.501f, 7.306f, 16.695f, 3.5f, 12.001f, 3.5f)
            close()
            moveTo(11.648f, 7.553f)
            lineTo(11.721f, 7.469f)
            curveTo(11.987f, 7.203f, 12.404f, 7.178f, 12.697f, 7.396f)
            lineTo(12.781f, 7.469f)
            lineTo(16.782f, 11.47f)
            curveTo(17.048f, 11.736f, 17.073f, 12.153f, 16.855f, 12.446f)
            lineTo(16.782f, 12.531f)
            lineTo(12.781f, 16.531f)
            curveTo(12.488f, 16.823f, 12.013f, 16.823f, 11.72f, 16.53f)
            curveTo(11.454f, 16.264f, 11.429f, 15.847f, 11.647f, 15.554f)
            lineTo(11.72f, 15.47f)
            lineTo(14.442f, 12.749f)
            lineTo(7.75f, 12.749f)
            curveTo(7.371f, 12.749f, 7.057f, 12.467f, 7.007f, 12.101f)
            lineTo(7f, 11.999f)
            curveTo(7f, 11.62f, 7.282f, 11.306f, 7.648f, 11.256f)
            lineTo(7.75f, 11.249f)
            lineTo(14.44f, 11.249f)
            lineTo(11.721f, 8.53f)
            curveTo(11.454f, 8.263f, 11.43f, 7.847f, 11.648f, 7.553f)
            lineTo(11.721f, 7.469f)
            lineTo(11.648f, 7.553f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowCircleRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowCircleRight, contentDescription = null)
    }
}
