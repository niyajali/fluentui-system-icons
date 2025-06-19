package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.MailLink: ImageVector
    get() {
        if (_MailLink != null) {
            return _MailLink!!
        }
        _MailLink = ImageVector.Builder(
            name = "Filled.MailLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.75f)
                curveTo(23f, 4.679f, 21.321f, 3f, 19.25f, 3f)
                lineTo(19.148f, 3.007f)
                curveTo(18.782f, 3.057f, 18.5f, 3.37f, 18.5f, 3.75f)
                curveTo(18.5f, 4.164f, 18.836f, 4.5f, 19.25f, 4.5f)
                lineTo(19.404f, 4.505f)
                curveTo(20.575f, 4.584f, 21.5f, 5.559f, 21.5f, 6.75f)
                curveTo(21.5f, 7.993f, 20.493f, 9f, 19.25f, 9f)
                lineTo(19.247f, 9.005f)
                lineTo(19.145f, 9.012f)
                curveTo(18.779f, 9.063f, 18.498f, 9.378f, 18.5f, 9.758f)
                curveTo(18.502f, 10.172f, 18.839f, 10.507f, 19.253f, 10.505f)
                verticalLineTo(10.5f)
                lineTo(19.452f, 10.495f)
                curveTo(21.428f, 10.391f, 23f, 8.754f, 23f, 6.75f)
                close()
                moveTo(16.5f, 3.75f)
                curveTo(16.5f, 3.336f, 16.164f, 3f, 15.75f, 3f)
                lineTo(15.551f, 3.005f)
                curveTo(13.572f, 3.109f, 12f, 4.746f, 12f, 6.75f)
                curveTo(12f, 8.821f, 13.679f, 10.5f, 15.75f, 10.5f)
                lineTo(15.852f, 10.493f)
                curveTo(16.218f, 10.443f, 16.5f, 10.13f, 16.5f, 9.75f)
                curveTo(16.5f, 9.336f, 16.164f, 9f, 15.75f, 9f)
                lineTo(15.596f, 8.995f)
                curveTo(14.425f, 8.916f, 13.5f, 7.941f, 13.5f, 6.75f)
                curveTo(13.5f, 5.507f, 14.507f, 4.5f, 15.75f, 4.5f)
                lineTo(15.852f, 4.493f)
                curveTo(16.218f, 4.443f, 16.5f, 4.13f, 16.5f, 3.75f)
                close()
                moveTo(20f, 6.75f)
                curveTo(20f, 6.336f, 19.664f, 6f, 19.25f, 6f)
                horizontalLineTo(15.75f)
                lineTo(15.648f, 6.007f)
                curveTo(15.282f, 6.057f, 15f, 6.37f, 15f, 6.75f)
                curveTo(15f, 7.164f, 15.336f, 7.5f, 15.75f, 7.5f)
                horizontalLineTo(19.25f)
                lineTo(19.352f, 7.493f)
                curveTo(19.718f, 7.443f, 20f, 7.13f, 20f, 6.75f)
                close()
                moveTo(19.25f, 11.5f)
                horizontalLineTo(16.48f)
                lineTo(12.348f, 13.664f)
                curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
                lineTo(2f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                verticalLineTo(10.623f)
                curveTo(21.224f, 11.175f, 20.275f, 11.5f, 19.25f, 11.5f)
                close()
                moveTo(5.25f, 4f)
                horizontalLineTo(11.877f)
                curveTo(11.325f, 4.776f, 11f, 5.725f, 11f, 6.75f)
                curveTo(11f, 8.73f, 12.212f, 10.427f, 13.934f, 11.14f)
                lineTo(12f, 12.153f)
                lineTo(2.016f, 6.924f)
                curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
                lineTo(5.25f, 4f)
                close()
            }
        }.build()

        return _MailLink!!
    }

@Suppress("ObjectPropertyName")
private var _MailLink: ImageVector? = null

@Preview
@Composable
private fun MailLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailLink, contentDescription = null)
    }
}
