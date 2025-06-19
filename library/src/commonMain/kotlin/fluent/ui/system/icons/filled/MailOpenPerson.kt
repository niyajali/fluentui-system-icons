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

public val FluentIcons.Filled.MailOpenPerson: ImageVector
    get() {
        if (_MailOpenPerson != null) {
            return _MailOpenPerson!!
        }
        _MailOpenPerson = ImageVector.Builder(
            name = "Filled.MailOpenPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.653f, 14.165f)
                lineTo(2f, 9.127f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                horizontalLineTo(13.002f)
                curveTo(13.001f, 19.958f, 13f, 19.917f, 13f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13f, 18.24f, 14.242f, 17f, 15.773f, 17f)
                horizontalLineTo(16.051f)
                curveTo(15.402f, 16.365f, 15f, 15.479f, 15f, 14.5f)
                curveTo(15f, 13.723f, 15.253f, 13.006f, 15.681f, 12.425f)
                lineTo(12.347f, 14.165f)
                curveTo(12.13f, 14.278f, 11.871f, 14.278f, 11.653f, 14.165f)
                close()
                moveTo(11.617f, 2.105f)
                lineTo(3.1f, 7.169f)
                lineTo(2.93f, 7.281f)
                curveTo(2.766f, 7.4f, 2.62f, 7.54f, 2.495f, 7.695f)
                lineTo(12f, 12.654f)
                lineTo(21.505f, 7.695f)
                curveTo(21.339f, 7.488f, 21.135f, 7.309f, 20.9f, 7.169f)
                lineTo(12.384f, 2.105f)
                lineTo(12.279f, 2.054f)
                curveTo(12.064f, 1.968f, 11.819f, 1.985f, 11.617f, 2.105f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _MailOpenPerson!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpenPerson: ImageVector? = null

@Preview
@Composable
private fun MailOpenPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailOpenPerson, contentDescription = null)
    }
}
