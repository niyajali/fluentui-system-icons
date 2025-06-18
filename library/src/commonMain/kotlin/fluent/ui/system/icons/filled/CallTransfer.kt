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

public val FluentUi.Filled.CallTransfer: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallTransfer",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 2.75f)
            curveTo(14f, 2.336f, 14.336f, 2f, 14.75f, 2f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 2f, 22f, 2.336f, 22f, 2.75f)
            verticalLineTo(9.25f)
            curveTo(22f, 9.664f, 21.664f, 10f, 21.25f, 10f)
            curveTo(20.836f, 10f, 20.5f, 9.664f, 20.5f, 9.25f)
            verticalLineTo(4.561f)
            lineTo(16.53f, 8.53f)
            curveTo(16.237f, 8.823f, 15.763f, 8.823f, 15.47f, 8.53f)
            curveTo(15.177f, 8.237f, 15.177f, 7.763f, 15.47f, 7.47f)
            lineTo(19.439f, 3.5f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 3.5f, 14f, 3.164f, 14f, 2.75f)
            close()
            moveTo(14f, 10.75f)
            curveTo(14.414f, 10.75f, 14.75f, 10.414f, 14.75f, 10f)
            curveTo(14.75f, 9.586f, 14.414f, 9.25f, 14f, 9.25f)
            curveTo(13.586f, 9.25f, 13.25f, 9.586f, 13.25f, 10f)
            curveTo(13.25f, 10.414f, 13.586f, 10.75f, 14f, 10.75f)
            close()
            moveTo(12.75f, 12f)
            curveTo(12.75f, 12.414f, 12.414f, 12.75f, 12f, 12.75f)
            curveTo(11.586f, 12.75f, 11.25f, 12.414f, 11.25f, 12f)
            curveTo(11.25f, 11.586f, 11.586f, 11.25f, 12f, 11.25f)
            curveTo(12.414f, 11.25f, 12.75f, 11.586f, 12.75f, 12f)
            close()
            moveTo(10.224f, 5.34f)
            lineTo(9.364f, 3.312f)
            curveTo(8.932f, 2.294f, 7.855f, 1.773f, 6.846f, 2.095f)
            lineTo(5.769f, 2.439f)
            curveTo(4.702f, 2.78f, 3.884f, 3.695f, 3.62f, 4.843f)
            curveTo(2.993f, 7.572f, 3.746f, 10.894f, 5.878f, 14.811f)
            curveTo(8.008f, 18.721f, 10.342f, 21.072f, 12.881f, 21.864f)
            curveTo(13.957f, 22.2f, 15.119f, 21.903f, 15.933f, 21.086f)
            lineTo(16.751f, 20.265f)
            curveTo(17.514f, 19.499f, 17.625f, 18.253f, 17.01f, 17.35f)
            lineTo(15.777f, 15.539f)
            curveTo(15.248f, 14.762f, 14.309f, 14.431f, 13.447f, 14.719f)
            lineTo(11.172f, 15.478f)
            curveTo(10.264f, 14.79f, 9.507f, 13.926f, 8.9f, 12.883f)
            curveTo(8.294f, 11.841f, 7.933f, 10.782f, 7.816f, 9.706f)
            lineTo(9.71f, 7.908f)
            curveTo(10.391f, 7.262f, 10.599f, 6.223f, 10.224f, 5.34f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallTransferPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CallTransfer, contentDescription = null)
    }
}
