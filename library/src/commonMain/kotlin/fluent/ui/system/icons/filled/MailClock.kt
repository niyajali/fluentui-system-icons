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

public val FluentIcons.Filled.MailClock: ImageVector
    get() {
        if (_MailClock != null) {
            return _MailClock!!
        }
        _MailClock = ImageVector.Builder(
            name = "Filled.MailClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                close()
                moveTo(17.5f, 3f)
                curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                curveTo(20.276f, 6f, 20.5f, 6.224f, 20.5f, 6.5f)
                curveTo(20.5f, 6.776f, 20.276f, 7f, 20f, 7f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
                verticalLineTo(3.5f)
                curveTo(17f, 3.224f, 17.224f, 3f, 17.5f, 3f)
                close()
                moveTo(22f, 11.19f)
                curveTo(20.832f, 12.311f, 19.247f, 13f, 17.5f, 13f)
                curveTo(16.523f, 13f, 15.596f, 12.784f, 14.765f, 12.398f)
                lineTo(12.348f, 13.664f)
                curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
                lineTo(2f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                lineTo(18.934f, 19.995f)
                curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
                verticalLineTo(11.19f)
                close()
                moveTo(11.498f, 4f)
                horizontalLineTo(5.25f)
                lineTo(5.064f, 4.005f)
                curveTo(3.464f, 4.095f, 2.174f, 5.343f, 2.016f, 6.924f)
                lineTo(12f, 12.153f)
                lineTo(13.308f, 11.468f)
                curveTo(11.897f, 10.276f, 11f, 8.493f, 11f, 6.5f)
                curveTo(11f, 5.614f, 11.177f, 4.77f, 11.498f, 4f)
                close()
            }
        }.build()

        return _MailClock!!
    }

@Suppress("ObjectPropertyName")
private var _MailClock: ImageVector? = null

@Preview
@Composable
private fun MailClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailClock, contentDescription = null)
    }
}
