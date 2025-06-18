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

public val FluentUi.Filled.Lottery: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lottery",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.56f, 4.174f)
            curveTo(14.082f, 4.538f, 12.819f, 5.45f, 12f, 6.682f)
            curveTo(11.181f, 5.45f, 9.918f, 4.538f, 8.44f, 4.174f)
            curveTo(9.104f, 2.883f, 10.449f, 2f, 12f, 2f)
            curveTo(13.551f, 2f, 14.896f, 2.883f, 15.56f, 4.174f)
            close()
            moveTo(4.057f, 14.042f)
            curveTo(4.492f, 10.39f, 7.39f, 7.492f, 11.042f, 7.057f)
            curveTo(10.133f, 5.81f, 8.661f, 5f, 7f, 5f)
            curveTo(4.239f, 5f, 2f, 7.239f, 2f, 10f)
            curveTo(2f, 11.661f, 2.81f, 13.133f, 4.057f, 14.042f)
            close()
            moveTo(19.943f, 14.042f)
            curveTo(21.19f, 13.133f, 22f, 11.661f, 22f, 10f)
            curveTo(22f, 7.239f, 19.761f, 5f, 17f, 5f)
            curveTo(15.339f, 5f, 13.867f, 5.81f, 12.958f, 7.057f)
            curveTo(16.61f, 7.492f, 19.507f, 10.39f, 19.943f, 14.042f)
            close()
            moveTo(12f, 22f)
            curveTo(15.866f, 22f, 19f, 18.866f, 19f, 15f)
            curveTo(19f, 11.134f, 15.866f, 8f, 12f, 8f)
            curveTo(8.134f, 8f, 5f, 11.134f, 5f, 15f)
            curveTo(5f, 18.866f, 8.134f, 22f, 12f, 22f)
            close()
            moveTo(9.5f, 13.25f)
            curveTo(9.5f, 12.836f, 9.836f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(14.5f)
            curveTo(14.813f, 12.5f, 15.092f, 12.694f, 15.202f, 12.986f)
            curveTo(15.312f, 13.278f, 15.229f, 13.608f, 14.995f, 13.813f)
            lineTo(14.994f, 13.814f)
            lineTo(14.982f, 13.825f)
            curveTo(14.971f, 13.835f, 14.953f, 13.852f, 14.929f, 13.875f)
            curveTo(14.88f, 13.921f, 14.807f, 13.992f, 14.716f, 14.086f)
            curveTo(14.534f, 14.276f, 14.28f, 14.559f, 14.003f, 14.923f)
            curveTo(13.447f, 15.654f, 12.816f, 16.693f, 12.474f, 17.947f)
            curveTo(12.365f, 18.347f, 11.952f, 18.583f, 11.553f, 18.474f)
            curveTo(11.153f, 18.365f, 10.917f, 17.952f, 11.026f, 17.553f)
            curveTo(11.434f, 16.057f, 12.178f, 14.846f, 12.809f, 14.015f)
            lineTo(12.821f, 14f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 14f, 9.5f, 13.664f, 9.5f, 13.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LotteryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Lottery, contentDescription = null)
    }
}
