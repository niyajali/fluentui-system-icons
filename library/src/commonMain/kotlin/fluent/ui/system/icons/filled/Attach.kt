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

public val FluentIcons.Filled.Attach: ImageVector
    get() {
        if (_Attach != null) {
            return _Attach!!
        }
        _Attach = ImageVector.Builder(
            name = "Filled.Attach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.001f, 2f)
                curveTo(19.315f, 2f, 22.001f, 4.686f, 22.001f, 8f)
                curveTo(22.001f, 9.537f, 21.419f, 10.984f, 20.397f, 12.083f)
                lineTo(20.207f, 12.278f)
                lineTo(11.48f, 21.005f)
                lineTo(11.427f, 21.055f)
                lineTo(11.371f, 21.1f)
                curveTo(10.702f, 21.676f, 9.847f, 22f, 8.944f, 22f)
                curveTo(6.889f, 22f, 5.223f, 20.334f, 5.223f, 18.279f)
                curveTo(5.223f, 17.378f, 5.546f, 16.525f, 6.118f, 15.857f)
                lineTo(6.267f, 15.694f)
                lineTo(6.282f, 15.683f)
                lineTo(13.573f, 8.379f)
                curveTo(13.963f, 7.988f, 14.596f, 7.987f, 14.987f, 8.378f)
                curveTo(15.378f, 8.768f, 15.378f, 9.401f, 14.988f, 9.792f)
                lineTo(7.697f, 17.096f)
                lineTo(7.686f, 17.104f)
                curveTo(7.39f, 17.421f, 7.223f, 17.835f, 7.223f, 18.279f)
                curveTo(7.223f, 19.229f, 7.993f, 20f, 8.944f, 20f)
                curveTo(9.323f, 20f, 9.681f, 19.878f, 9.975f, 19.657f)
                lineTo(10.097f, 19.556f)
                lineTo(10.098f, 19.558f)
                lineTo(18.8f, 10.857f)
                lineTo(18.959f, 10.693f)
                curveTo(19.624f, 9.963f, 20.001f, 9.012f, 20.001f, 8f)
                curveTo(20.001f, 5.791f, 18.21f, 4f, 16.001f, 4f)
                curveTo(14.939f, 4f, 13.946f, 4.415f, 13.206f, 5.139f)
                lineTo(13.051f, 5.298f)
                lineTo(13.033f, 5.311f)
                lineTo(3.707f, 14.64f)
                curveTo(3.317f, 15.031f, 2.684f, 15.031f, 2.293f, 14.641f)
                curveTo(1.902f, 14.25f, 1.902f, 13.617f, 2.293f, 13.226f)
                lineTo(11.602f, 3.913f)
                lineTo(11.648f, 3.87f)
                curveTo(12.772f, 2.686f, 14.333f, 2f, 16.001f, 2f)
                close()
            }
        }.build()

        return _Attach!!
    }

@Suppress("ObjectPropertyName")
private var _Attach: ImageVector? = null

@Preview
@Composable
private fun AttachPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Attach, contentDescription = null)
    }
}
