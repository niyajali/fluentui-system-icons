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

public val FluentIcons.Filled.ArrowTrending: ImageVector
    get() {
        if (_ArrowTrending != null) {
            return _ArrowTrending!!
        }
        _ArrowTrending = ImageVector.Builder(
            name = "Filled.ArrowTrending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.003f, 5.5f)
                horizontalLineTo(21f)
                curveTo(21.513f, 5.5f, 21.935f, 5.886f, 21.993f, 6.383f)
                lineTo(22f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(22f, 14.052f, 21.552f, 14.5f, 21f, 14.5f)
                curveTo(20.487f, 14.5f, 20.064f, 14.114f, 20.007f, 13.617f)
                lineTo(20f, 13.5f)
                lineTo(19.999f, 8.914f)
                lineTo(12.707f, 16.207f)
                curveTo(12.347f, 16.567f, 11.78f, 16.595f, 11.387f, 16.291f)
                lineTo(11.293f, 16.208f)
                lineTo(8.997f, 13.916f)
                lineTo(3.709f, 19.205f)
                curveTo(3.319f, 19.596f, 2.686f, 19.596f, 2.295f, 19.206f)
                curveTo(1.934f, 18.845f, 1.907f, 18.278f, 2.212f, 17.886f)
                lineTo(2.295f, 17.792f)
                lineTo(8.289f, 11.795f)
                curveTo(8.65f, 11.435f, 9.216f, 11.407f, 9.609f, 11.711f)
                lineTo(9.703f, 11.794f)
                lineTo(11.999f, 14.086f)
                lineTo(18.584f, 7.5f)
                horizontalLineTo(14.003f)
                curveTo(13.49f, 7.5f, 13.068f, 7.114f, 13.01f, 6.617f)
                lineTo(13.003f, 6.5f)
                curveTo(13.003f, 5.987f, 13.389f, 5.564f, 13.886f, 5.507f)
                lineTo(14.003f, 5.5f)
                horizontalLineTo(21f)
                horizontalLineTo(14.003f)
                close()
            }
        }.build()

        return _ArrowTrending!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrending: ImageVector? = null

@Preview
@Composable
private fun ArrowTrendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTrending, contentDescription = null)
    }
}
