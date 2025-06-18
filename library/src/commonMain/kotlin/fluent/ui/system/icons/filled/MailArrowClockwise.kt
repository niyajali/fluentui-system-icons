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

public val FluentUi.Filled.MailArrowClockwise: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailArrowClockwise",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 0.75f)
            curveTo(23f, 0.336f, 22.664f, 0f, 22.25f, 0f)
            curveTo(21.836f, 0f, 21.5f, 0.336f, 21.5f, 0.75f)
            verticalLineTo(1.376f)
            curveTo(20.515f, 0.668f, 19.305f, 0.25f, 18f, 0.25f)
            curveTo(14.686f, 0.25f, 12f, 2.936f, 12f, 6.25f)
            curveTo(12f, 9.564f, 14.686f, 12.25f, 18f, 12.25f)
            curveTo(21.314f, 12.25f, 24f, 9.564f, 24f, 6.25f)
            curveTo(24f, 5.836f, 23.664f, 5.5f, 23.25f, 5.5f)
            curveTo(22.836f, 5.5f, 22.5f, 5.836f, 22.5f, 6.25f)
            curveTo(22.5f, 8.735f, 20.485f, 10.75f, 18f, 10.75f)
            curveTo(15.515f, 10.75f, 13.5f, 8.735f, 13.5f, 6.25f)
            curveTo(13.5f, 3.765f, 15.515f, 1.75f, 18f, 1.75f)
            curveTo(19.065f, 1.75f, 20.042f, 2.119f, 20.812f, 2.737f)
            curveTo(20.815f, 2.739f, 20.817f, 2.741f, 20.82f, 2.743f)
            curveTo(20.823f, 2.745f, 20.826f, 2.748f, 20.829f, 2.75f)
            horizontalLineTo(19.5f)
            curveTo(19.086f, 2.75f, 18.75f, 3.086f, 18.75f, 3.5f)
            curveTo(18.75f, 3.914f, 19.086f, 4.25f, 19.5f, 4.25f)
            horizontalLineTo(22.25f)
            curveTo(22.664f, 4.25f, 23f, 3.914f, 23f, 3.5f)
            verticalLineTo(0.75f)
            close()
            moveTo(11f, 6.25f)
            curveTo(11f, 8.319f, 11.898f, 10.178f, 13.324f, 11.46f)
            lineTo(12f, 12.153f)
            lineTo(2.016f, 6.924f)
            curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
            lineTo(5.25f, 4f)
            horizontalLineTo(11.37f)
            curveTo(11.13f, 4.706f, 11f, 5.463f, 11f, 6.25f)
            close()
            moveTo(22f, 16.75f)
            verticalLineTo(11.995f)
            curveTo(20.866f, 12.786f, 19.487f, 13.25f, 18f, 13.25f)
            curveTo(16.809f, 13.25f, 15.689f, 12.953f, 14.707f, 12.429f)
            lineTo(12.348f, 13.664f)
            curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
            lineTo(2f, 8.608f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailArrowClockwise, contentDescription = null)
    }
}
