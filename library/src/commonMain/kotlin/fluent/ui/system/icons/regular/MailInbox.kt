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

public val FluentUi.Regular.MailInbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.483f, 3f, 20.899f, 4.356f, 20.995f, 6.066f)
            lineTo(21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.483f, 19.643f, 20.899f, 17.934f, 20.995f)
            lineTo(17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.517f, 21f, 3.101f, 19.643f, 3.005f, 17.934f)
            lineTo(3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.517f, 4.356f, 3.101f, 6.066f, 3.005f)
            lineTo(6.25f, 3f)
            horizontalLineTo(17.75f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 14.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.668f, 5.207f, 19.421f, 6.106f, 19.494f)
            lineTo(6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.668f, 19.5f, 19.421f, 18.793f, 19.494f, 17.893f)
            lineTo(19.5f, 17.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(15.675f)
            curveTo(15.34f, 16.148f, 13.925f, 17.404f, 12.2f, 17.495f)
            lineTo(12f, 17.5f)
            curveTo(10.253f, 17.5f, 8.785f, 16.305f, 8.368f, 14.688f)
            lineTo(8.325f, 14.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            verticalLineTo(14.5f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.332f, 4.5f, 4.579f, 5.207f, 4.506f, 6.106f)
            lineTo(4.5f, 6.25f)
            verticalLineTo(13f)
            horizontalLineTo(9f)
            curveTo(9.38f, 13f, 9.693f, 13.282f, 9.743f, 13.648f)
            lineTo(9.75f, 13.75f)
            curveTo(9.75f, 14.993f, 10.757f, 16f, 12f, 16f)
            curveTo(13.191f, 16f, 14.166f, 15.075f, 14.245f, 13.904f)
            lineTo(14.25f, 13.75f)
            curveTo(14.25f, 13.37f, 14.532f, 13.057f, 14.898f, 13.007f)
            lineTo(15f, 13f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.332f, 18.793f, 4.579f, 17.893f, 4.506f)
            lineTo(17.75f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailInboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailInbox, contentDescription = null)
    }
}
