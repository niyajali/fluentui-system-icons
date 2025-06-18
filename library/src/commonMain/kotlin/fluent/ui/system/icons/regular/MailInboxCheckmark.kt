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

public val FluentUi.Regular.MailInboxCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInboxCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            close()
            moveTo(19.854f, 4.146f)
            curveTo(19.658f, 3.951f, 19.342f, 3.951f, 19.146f, 4.146f)
            lineTo(15.5f, 7.793f)
            lineTo(13.854f, 6.146f)
            curveTo(13.658f, 5.951f, 13.342f, 5.951f, 13.146f, 6.146f)
            curveTo(12.951f, 6.342f, 12.951f, 6.658f, 13.146f, 6.854f)
            lineTo(15.146f, 8.854f)
            curveTo(15.342f, 9.049f, 15.658f, 9.049f, 15.854f, 8.854f)
            lineTo(19.854f, 4.854f)
            curveTo(20.049f, 4.658f, 20.049f, 4.342f, 19.854f, 4.146f)
            close()
            moveTo(19.5f, 12.268f)
            verticalLineTo(14f)
            horizontalLineTo(15f)
            lineTo(14.898f, 14.007f)
            curveTo(14.532f, 14.057f, 14.25f, 14.37f, 14.25f, 14.75f)
            lineTo(14.245f, 14.904f)
            curveTo(14.166f, 16.075f, 13.191f, 17f, 12f, 17f)
            curveTo(10.757f, 17f, 9.75f, 15.993f, 9.75f, 14.75f)
            lineTo(9.743f, 14.648f)
            curveTo(9.693f, 14.282f, 9.38f, 14f, 9f, 14f)
            horizontalLineTo(4.5f)
            verticalLineTo(7.25f)
            lineTo(4.506f, 7.106f)
            curveTo(4.579f, 6.207f, 5.332f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(10.076f)
            curveTo(10.157f, 4.977f, 10.3f, 4.474f, 10.498f, 4f)
            horizontalLineTo(6.25f)
            lineTo(6.066f, 4.005f)
            curveTo(4.356f, 4.101f, 3f, 5.517f, 3f, 7.25f)
            verticalLineTo(18.75f)
            lineTo(3.005f, 18.934f)
            curveTo(3.101f, 20.643f, 4.517f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            lineTo(17.934f, 21.995f)
            curveTo(19.643f, 21.899f, 21f, 20.483f, 21f, 18.75f)
            verticalLineTo(11.19f)
            curveTo(20.556f, 11.617f, 20.051f, 11.981f, 19.5f, 12.268f)
            close()
            moveTo(4.5f, 18.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(8.325f)
            lineTo(8.368f, 15.688f)
            curveTo(8.785f, 17.305f, 10.253f, 18.5f, 12f, 18.5f)
            lineTo(12.2f, 18.495f)
            curveTo(13.925f, 18.404f, 15.34f, 17.148f, 15.675f, 15.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(18.75f)
            lineTo(19.494f, 18.893f)
            curveTo(19.421f, 19.793f, 18.668f, 20.5f, 17.75f, 20.5f)
            horizontalLineTo(6.25f)
            lineTo(6.106f, 20.494f)
            curveTo(5.207f, 20.421f, 4.5f, 19.668f, 4.5f, 18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailInboxCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailInboxCheckmark, contentDescription = null)
    }
}
