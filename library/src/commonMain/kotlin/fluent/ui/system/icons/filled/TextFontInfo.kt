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

public val FluentUi.Filled.TextFontInfo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextFontInfo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.514f, 1.75f)
            curveTo(9.933f, 1.756f, 10.303f, 2.022f, 10.443f, 2.416f)
            lineTo(13.596f, 11.302f)
            curveTo(12.993f, 11.756f, 12.471f, 12.313f, 12.057f, 12.946f)
            lineTo(9.46f, 5.625f)
            lineTo(6.605f, 13f)
            lineTo(12.022f, 13f)
            curveTo(11.634f, 13.606f, 11.344f, 14.28f, 11.174f, 15f)
            lineTo(5.831f, 15f)
            lineTo(4.433f, 18.611f)
            curveTo(4.233f, 19.126f, 3.654f, 19.382f, 3.139f, 19.183f)
            curveTo(2.624f, 18.983f, 2.368f, 18.404f, 2.568f, 17.889f)
            lineTo(8.568f, 2.389f)
            curveTo(8.719f, 1.999f, 9.096f, 1.744f, 9.514f, 1.75f)
            close()
            moveTo(17f, 16f)
            verticalLineTo(19f)
            curveTo(17f, 19.276f, 17.224f, 19.5f, 17.5f, 19.5f)
            curveTo(17.776f, 19.5f, 18f, 19.276f, 18f, 19f)
            verticalLineTo(16f)
            curveTo(18f, 15.724f, 17.776f, 15.5f, 17.5f, 15.5f)
            curveTo(17.224f, 15.5f, 17f, 15.724f, 17f, 16f)
            close()
            moveTo(18.25f, 13.75f)
            curveTo(18.25f, 14.164f, 17.914f, 14.5f, 17.5f, 14.5f)
            curveTo(17.086f, 14.5f, 16.75f, 14.164f, 16.75f, 13.75f)
            curveTo(16.75f, 13.336f, 17.086f, 13f, 17.5f, 13f)
            curveTo(17.914f, 13f, 18.25f, 13.336f, 18.25f, 13.75f)
            close()
            moveTo(23f, 16.5f)
            curveTo(23f, 19.538f, 20.538f, 22f, 17.5f, 22f)
            curveTo(14.462f, 22f, 12f, 19.538f, 12f, 16.5f)
            curveTo(12f, 13.462f, 14.462f, 11f, 17.5f, 11f)
            curveTo(20.538f, 11f, 23f, 13.462f, 23f, 16.5f)
            close()
            moveTo(22f, 16.5f)
            curveTo(22f, 14.015f, 19.985f, 12f, 17.5f, 12f)
            curveTo(15.015f, 12f, 13f, 14.015f, 13f, 16.5f)
            curveTo(13f, 18.985f, 15.015f, 21f, 17.5f, 21f)
            curveTo(19.985f, 21f, 22f, 18.985f, 22f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextFontInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextFontInfo, contentDescription = null)
    }
}
