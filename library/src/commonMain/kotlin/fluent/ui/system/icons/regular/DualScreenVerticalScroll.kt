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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DualScreenVerticalScroll: ImageVector
    get() {
        if (_DualScreenVerticalScroll != null) {
            return _DualScreenVerticalScroll!!
        }
        _DualScreenVerticalScroll = ImageVector.Builder(
            name = "Regular.DualScreenVerticalScroll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.748f, 4.002f)
                lineTo(12.747f, 4.004f)
                lineTo(20.245f, 4.004f)
                curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
                horizontalLineTo(11.248f)
                lineTo(11.247f, 19.997f)
                lineTo(3.75f, 19.997f)
                curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
                horizontalLineTo(12.748f)
                close()
                moveTo(20.245f, 5.504f)
                horizontalLineTo(12.748f)
                verticalLineTo(18.5f)
                horizontalLineTo(20.245f)
                curveTo(20.383f, 18.5f, 20.495f, 18.388f, 20.495f, 18.25f)
                verticalLineTo(5.754f)
                curveTo(20.495f, 5.616f, 20.383f, 5.504f, 20.245f, 5.504f)
                close()
                moveTo(11.248f, 5.502f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 5.502f, 3.5f, 5.614f, 3.5f, 5.752f)
                verticalLineTo(18.247f)
                curveTo(3.5f, 18.385f, 3.612f, 18.497f, 3.75f, 18.497f)
                horizontalLineTo(11.248f)
                verticalLineTo(5.502f)
                close()
                moveTo(14.702f, 13.402f)
                lineTo(14.785f, 13.475f)
                lineTo(16.503f, 15.225f)
                lineTo(18.217f, 13.476f)
                curveTo(18.507f, 13.18f, 18.982f, 13.175f, 19.278f, 13.465f)
                curveTo(19.547f, 13.729f, 19.575f, 14.145f, 19.36f, 14.441f)
                lineTo(19.289f, 14.526f)
                lineTo(17.039f, 16.822f)
                curveTo(16.771f, 17.094f, 16.348f, 17.119f, 16.052f, 16.896f)
                lineTo(15.968f, 16.822f)
                lineTo(13.715f, 14.526f)
                curveTo(13.425f, 14.23f, 13.429f, 13.756f, 13.725f, 13.465f)
                curveTo(13.993f, 13.202f, 14.41f, 13.181f, 14.702f, 13.402f)
                close()
                moveTo(17.039f, 7.226f)
                lineTo(19.289f, 9.522f)
                curveTo(19.579f, 9.817f, 19.574f, 10.292f, 19.278f, 10.582f)
                curveTo(18.982f, 10.872f, 18.507f, 10.867f, 18.217f, 10.571f)
                lineTo(16.503f, 8.822f)
                lineTo(14.785f, 10.572f)
                curveTo(14.495f, 10.868f, 14.02f, 10.872f, 13.725f, 10.582f)
                curveTo(13.429f, 10.292f, 13.425f, 9.817f, 13.715f, 9.521f)
                lineTo(15.968f, 7.225f)
                curveTo(16.262f, 6.926f, 16.745f, 6.926f, 17.039f, 7.226f)
                close()
            }
        }.build()

        return _DualScreenVerticalScroll!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenVerticalScroll: ImageVector? = null

@Preview
@Composable
private fun DualScreenVerticalScrollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenVerticalScroll, contentDescription = null)
    }
}
