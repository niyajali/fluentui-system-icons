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

public val FluentUi.Regular.MailFishHook: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailFishHook",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 3.5f)
            curveTo(15.698f, 3.5f, 15.25f, 3.948f, 15.25f, 4.5f)
            curveTo(15.25f, 5.052f, 15.698f, 5.5f, 16.25f, 5.5f)
            curveTo(16.802f, 5.5f, 17.25f, 5.052f, 17.25f, 4.5f)
            curveTo(17.25f, 3.948f, 16.802f, 3.5f, 16.25f, 3.5f)
            close()
            moveTo(18.75f, 4.5f)
            curveTo(18.75f, 5.619f, 18.014f, 6.567f, 17f, 6.886f)
            verticalLineTo(9.25f)
            curveTo(17f, 10.493f, 18.007f, 11.5f, 19.25f, 11.5f)
            curveTo(20.493f, 11.5f, 21.5f, 10.493f, 21.5f, 9.25f)
            verticalLineTo(9f)
            horizontalLineTo(20.25f)
            curveTo(19.947f, 9f, 19.673f, 8.817f, 19.557f, 8.537f)
            curveTo(19.441f, 8.257f, 19.505f, 7.934f, 19.72f, 7.72f)
            lineTo(21.72f, 5.72f)
            curveTo(21.934f, 5.505f, 22.257f, 5.441f, 22.537f, 5.557f)
            curveTo(22.817f, 5.673f, 23f, 5.947f, 23f, 6.25f)
            verticalLineTo(9.25f)
            curveTo(23f, 11.321f, 21.321f, 13f, 19.25f, 13f)
            curveTo(17.179f, 13f, 15.5f, 11.321f, 15.5f, 9.25f)
            verticalLineTo(6.886f)
            curveTo(14.486f, 6.567f, 13.75f, 5.619f, 13.75f, 4.5f)
            curveTo(13.75f, 3.119f, 14.869f, 2f, 16.25f, 2f)
            curveTo(17.631f, 2f, 18.75f, 3.119f, 18.75f, 4.5f)
            close()
            moveTo(12.785f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.066f, 4.005f)
            curveTo(3.356f, 4.101f, 2f, 5.517f, 2f, 7.25f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineTo(13.123f)
            curveTo(21.552f, 13.442f, 21.045f, 13.686f, 20.5f, 13.834f)
            verticalLineTo(16.75f)
            lineTo(20.494f, 16.893f)
            curveTo(20.421f, 17.793f, 19.668f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            lineTo(5.106f, 18.494f)
            curveTo(4.207f, 18.421f, 3.5f, 17.668f, 3.5f, 16.75f)
            verticalLineTo(9.374f)
            lineTo(11.651f, 13.664f)
            lineTo(11.747f, 13.706f)
            curveTo(11.943f, 13.776f, 12.162f, 13.762f, 12.349f, 13.664f)
            lineTo(15.413f, 12.051f)
            curveTo(15.119f, 11.649f, 14.887f, 11.199f, 14.73f, 10.715f)
            lineTo(12f, 12.153f)
            lineTo(3.5f, 7.679f)
            verticalLineTo(7.25f)
            lineTo(3.506f, 7.106f)
            curveTo(3.579f, 6.207f, 4.332f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(12.895f)
            curveTo(12.801f, 5.183f, 12.75f, 4.847f, 12.75f, 4.5f)
            curveTo(12.75f, 4.33f, 12.762f, 4.163f, 12.785f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailFishHookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailFishHook, contentDescription = null)
    }
}
