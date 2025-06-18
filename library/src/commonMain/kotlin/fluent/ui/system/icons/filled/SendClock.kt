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

public val FluentUi.Filled.SendClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SendClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.283f, 13.452f)
            lineTo(12.815f, 12.197f)
            curveTo(12.899f, 12.183f, 12.965f, 12.117f, 12.979f, 12.033f)
            curveTo(12.997f, 11.924f, 12.924f, 11.821f, 12.815f, 11.802f)
            lineTo(5.283f, 10.547f)
            curveTo(5.107f, 10.518f, 4.96f, 10.396f, 4.897f, 10.229f)
            lineTo(2.299f, 3.272f)
            curveTo(2.051f, 2.632f, 2.72f, 2.022f, 3.334f, 2.329f)
            lineTo(21.334f, 11.329f)
            curveTo(21.777f, 11.55f, 21.865f, 12.101f, 21.597f, 12.454f)
            curveTo(20.479f, 11.545f, 19.053f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 17.612f, 11.003f, 17.723f, 11.008f, 17.833f)
            lineTo(3.334f, 21.67f)
            curveTo(2.72f, 21.977f, 2.051f, 21.367f, 2.299f, 20.728f)
            lineTo(4.897f, 13.77f)
            curveTo(4.96f, 13.603f, 5.107f, 13.481f, 5.283f, 13.452f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(20f)
            curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
            curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
            verticalLineTo(14.5f)
            curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SendClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SendClock, contentDescription = null)
    }
}
