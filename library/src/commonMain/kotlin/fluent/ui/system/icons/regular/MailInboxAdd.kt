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

public val FluentUi.Regular.MailInboxAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInboxAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 3.462f, 19.538f, 1f, 16.5f, 1f)
            curveTo(13.462f, 1f, 11f, 3.462f, 11f, 6.5f)
            curveTo(11f, 9.538f, 13.462f, 12f, 16.5f, 12f)
            curveTo(19.538f, 12f, 22f, 9.538f, 22f, 6.5f)
            close()
            moveTo(17.001f, 7f)
            lineTo(17.001f, 9.504f)
            curveTo(17.001f, 9.78f, 16.777f, 10.003f, 16.501f, 10.003f)
            curveTo(16.225f, 10.003f, 16.001f, 9.78f, 16.001f, 9.504f)
            lineTo(16.001f, 7f)
            horizontalLineTo(13.496f)
            curveTo(13.22f, 7f, 12.996f, 6.776f, 12.996f, 6.5f)
            curveTo(12.996f, 6.224f, 13.22f, 6f, 13.496f, 6f)
            horizontalLineTo(16f)
            lineTo(16f, 3.499f)
            curveTo(16f, 3.223f, 16.224f, 2.999f, 16.5f, 2.999f)
            curveTo(16.776f, 2.999f, 17f, 3.223f, 17f, 3.499f)
            lineTo(17f, 6f)
            horizontalLineTo(19.503f)
            curveTo(19.779f, 6f, 20.003f, 6.224f, 20.003f, 6.5f)
            curveTo(20.003f, 6.776f, 19.779f, 7f, 19.503f, 7f)
            horizontalLineTo(17.001f)
            close()
            moveTo(19.5f, 14f)
            verticalLineTo(12.268f)
            curveTo(20.051f, 11.981f, 20.556f, 11.617f, 21f, 11.19f)
            verticalLineTo(18.75f)
            curveTo(21f, 20.483f, 19.643f, 21.899f, 17.934f, 21.995f)
            lineTo(17.75f, 22f)
            horizontalLineTo(6.25f)
            curveTo(4.517f, 22f, 3.101f, 20.643f, 3.005f, 18.934f)
            lineTo(3f, 18.75f)
            verticalLineTo(7.25f)
            curveTo(3f, 5.517f, 4.356f, 4.101f, 6.066f, 4.005f)
            lineTo(6.25f, 4f)
            horizontalLineTo(10.498f)
            curveTo(10.3f, 4.474f, 10.157f, 4.977f, 10.076f, 5.5f)
            horizontalLineTo(6.25f)
            curveTo(5.332f, 5.5f, 4.579f, 6.207f, 4.506f, 7.106f)
            lineTo(4.5f, 7.25f)
            verticalLineTo(14f)
            horizontalLineTo(9f)
            curveTo(9.38f, 14f, 9.693f, 14.282f, 9.743f, 14.648f)
            lineTo(9.75f, 14.75f)
            curveTo(9.75f, 15.993f, 10.757f, 17f, 12f, 17f)
            curveTo(13.191f, 17f, 14.166f, 16.075f, 14.245f, 14.904f)
            lineTo(14.25f, 14.75f)
            curveTo(14.25f, 14.37f, 14.532f, 14.057f, 14.898f, 14.007f)
            lineTo(15f, 14f)
            horizontalLineTo(19.5f)
            close()
            moveTo(4.5f, 15.5f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.668f, 5.207f, 20.421f, 6.106f, 20.494f)
            lineTo(6.25f, 20.5f)
            horizontalLineTo(17.75f)
            curveTo(18.668f, 20.5f, 19.421f, 19.793f, 19.494f, 18.893f)
            lineTo(19.5f, 18.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(15.675f)
            curveTo(15.34f, 17.148f, 13.925f, 18.404f, 12.2f, 18.495f)
            lineTo(12f, 18.5f)
            curveTo(10.253f, 18.5f, 8.785f, 17.305f, 8.368f, 15.688f)
            lineTo(8.325f, 15.5f)
            horizontalLineTo(4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailInboxAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MailInboxAdd, contentDescription = null)
    }
}
