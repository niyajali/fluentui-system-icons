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

public val FluentIcons.Regular.ReadingModeMobile: ImageVector
    get() {
        if (_ReadingModeMobile != null) {
            return _ReadingModeMobile!!
        }
        _ReadingModeMobile = ImageVector.Builder(
            name = "Regular.ReadingModeMobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 2.001f)
                curveTo(18.941f, 2.001f, 19.916f, 2.926f, 19.995f, 4.097f)
                lineTo(20f, 4.251f)
                verticalLineTo(19.749f)
                curveTo(20f, 20.94f, 19.075f, 21.915f, 17.904f, 21.994f)
                lineTo(17.75f, 21.999f)
                horizontalLineTo(6.25f)
                curveTo(5.059f, 21.999f, 4.084f, 21.074f, 4.005f, 19.903f)
                lineTo(4f, 19.749f)
                verticalLineTo(4.251f)
                curveTo(4f, 3.06f, 4.925f, 2.085f, 6.096f, 2.006f)
                lineTo(6.25f, 2.001f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 3.501f)
                horizontalLineTo(6.25f)
                curveTo(5.87f, 3.501f, 5.557f, 3.783f, 5.507f, 4.149f)
                lineTo(5.5f, 4.251f)
                verticalLineTo(19.749f)
                curveTo(5.5f, 20.129f, 5.782f, 20.442f, 6.148f, 20.492f)
                lineTo(6.25f, 20.499f)
                horizontalLineTo(17.75f)
                curveTo(18.13f, 20.499f, 18.443f, 20.217f, 18.493f, 19.851f)
                lineTo(18.5f, 19.749f)
                verticalLineTo(4.251f)
                curveTo(18.5f, 3.871f, 18.218f, 3.557f, 17.852f, 3.508f)
                lineTo(17.75f, 3.501f)
                close()
                moveTo(12.248f, 12.997f)
                curveTo(12.662f, 12.997f, 12.998f, 13.333f, 12.998f, 13.747f)
                curveTo(12.998f, 14.127f, 12.716f, 14.441f, 12.35f, 14.491f)
                lineTo(12.248f, 14.497f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 14.497f, 7f, 14.161f, 7f, 13.747f)
                curveTo(7f, 13.368f, 7.282f, 13.054f, 7.648f, 13.004f)
                lineTo(7.75f, 12.997f)
                horizontalLineTo(12.248f)
                close()
                moveTo(16.25f, 9.999f)
                curveTo(16.664f, 9.999f, 17f, 10.334f, 17f, 10.749f)
                curveTo(17f, 11.128f, 16.718f, 11.442f, 16.352f, 11.492f)
                lineTo(16.25f, 11.499f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.499f, 7f, 11.163f, 7f, 10.749f)
                curveTo(7f, 10.369f, 7.282f, 10.055f, 7.648f, 10.005f)
                lineTo(7.75f, 9.999f)
                horizontalLineTo(16.25f)
                close()
                moveTo(16.25f, 7f)
                curveTo(16.664f, 7f, 17f, 7.336f, 17f, 7.75f)
                curveTo(17f, 8.13f, 16.718f, 8.443f, 16.352f, 8.493f)
                lineTo(16.25f, 8.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 8.5f, 7f, 8.164f, 7f, 7.75f)
                curveTo(7f, 7.37f, 7.282f, 7.057f, 7.648f, 7.007f)
                lineTo(7.75f, 7f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()

        return _ReadingModeMobile!!
    }

@Suppress("ObjectPropertyName")
private var _ReadingModeMobile: ImageVector? = null

@Preview
@Composable
private fun ReadingModeMobilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ReadingModeMobile, contentDescription = null)
    }
}
