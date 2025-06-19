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

public val FluentIcons.Regular.LightbulbCheckmark: ImageVector
    get() {
        if (_LightbulbCheckmark != null) {
            return _LightbulbCheckmark!!
        }
        _LightbulbCheckmark = ImageVector.Builder(
            name = "Regular.LightbulbCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
                curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
                curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
                close()
                moveTo(20.854f, 4.146f)
                curveTo(20.658f, 3.951f, 20.342f, 3.951f, 20.146f, 4.146f)
                lineTo(16.5f, 7.793f)
                lineTo(14.854f, 6.146f)
                curveTo(14.658f, 5.951f, 14.342f, 5.951f, 14.146f, 6.146f)
                curveTo(13.951f, 6.342f, 13.951f, 6.658f, 14.146f, 6.854f)
                lineTo(16.146f, 8.854f)
                curveTo(16.342f, 9.049f, 16.658f, 9.049f, 16.854f, 8.854f)
                lineTo(20.854f, 4.854f)
                curveTo(21.049f, 4.658f, 21.049f, 4.342f, 20.854f, 4.146f)
                close()
                moveTo(16.587f, 14.993f)
                curveTo(17.251f, 14.344f, 17.793f, 13.667f, 18.211f, 12.962f)
                curveTo(17.977f, 12.987f, 17.74f, 13f, 17.5f, 13f)
                curveTo(17.138f, 13f, 16.782f, 12.97f, 16.436f, 12.913f)
                curveTo(16.176f, 13.254f, 15.877f, 13.59f, 15.539f, 13.921f)
                lineTo(15.412f, 14.054f)
                curveTo(15.172f, 14.331f, 15.002f, 14.664f, 14.919f, 15.023f)
                lineTo(14.461f, 17f)
                horizontalLineTo(9.538f)
                lineTo(9.083f, 15.024f)
                lineTo(9.034f, 14.846f)
                curveTo(8.923f, 14.497f, 8.727f, 14.178f, 8.463f, 13.92f)
                curveTo(7.057f, 12.548f, 6.333f, 11.092f, 6.257f, 9.528f)
                lineTo(6.25f, 9.251f)
                lineTo(6.254f, 9.031f)
                curveTo(6.367f, 6.048f, 8.752f, 3.646f, 11.728f, 3.508f)
                curveTo(12.007f, 2.971f, 12.359f, 2.478f, 12.77f, 2.042f)
                curveTo(12.517f, 2.015f, 12.26f, 2.001f, 12f, 2.001f)
                curveTo(8.076f, 2.001f, 4.88f, 5.119f, 4.754f, 9.012f)
                lineTo(4.75f, 9.251f)
                lineTo(4.756f, 9.55f)
                curveTo(4.838f, 11.53f, 5.735f, 13.353f, 7.415f, 14.993f)
                curveTo(7.517f, 15.094f, 7.589f, 15.221f, 7.621f, 15.361f)
                lineTo(8.751f, 20.256f)
                lineTo(8.796f, 20.423f)
                curveTo(9.088f, 21.355f, 9.954f, 22f, 10.943f, 22f)
                horizontalLineTo(13.057f)
                lineTo(13.23f, 21.993f)
                curveTo(14.203f, 21.919f, 15.027f, 21.221f, 15.249f, 20.257f)
                lineTo(16.38f, 15.361f)
                lineTo(16.412f, 15.259f)
                curveTo(16.45f, 15.159f, 16.51f, 15.069f, 16.587f, 14.993f)
                close()
                moveTo(14.115f, 18.5f)
                lineTo(13.788f, 19.919f)
                lineTo(13.758f, 20.018f)
                curveTo(13.648f, 20.305f, 13.371f, 20.5f, 13.057f, 20.5f)
                horizontalLineTo(10.943f)
                lineTo(10.84f, 20.493f)
                curveTo(10.536f, 20.451f, 10.283f, 20.225f, 10.212f, 19.919f)
                lineTo(9.884f, 18.5f)
                horizontalLineTo(14.115f)
                close()
            }
        }.build()

        return _LightbulbCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCheckmark: ImageVector? = null

@Preview
@Composable
private fun LightbulbCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LightbulbCheckmark, contentDescription = null)
    }
}
