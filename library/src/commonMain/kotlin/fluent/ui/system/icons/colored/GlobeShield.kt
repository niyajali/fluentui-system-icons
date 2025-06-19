package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.GlobeShield: ImageVector
    get() {
        if (_GlobeShield != null) {
            return _GlobeShield!!
        }
        _GlobeShield = ImageVector.Builder(
            name = "Colored.GlobeShield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF29C3FF),
                        1f to Color(0xFF2052CB)
                    ),
                    start = Offset(6.444f, 5.333f),
                    end = Offset(20.889f, 18.667f)
                )
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF003580),
                        1f to Color(0x00003580)
                    ),
                    center = Offset(18.172f, 17.156f),
                    radius = 8.401f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.412f to Color(0xFF1B44B1),
                        1f to Color(0x001B44B1)
                    ),
                    center = Offset(18.563f, 17f),
                    radius = 13.157f
                ),
                fillAlpha = 0.2f,
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.445f to Color(0x003BD5FF),
                        0.815f to Color(0xFF3BD5FF)
                    ),
                    center = Offset(18.324f, 17.003f),
                    radius = 15.12f
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.115f, 2.422f)
                curveTo(8.794f, 2.921f, 8.511f, 3.496f, 8.265f, 4.126f)
                curveTo(7.785f, 5.356f, 7.426f, 6.849f, 7.216f, 8.5f)
                horizontalLineTo(2.63f)
                curveTo(2.449f, 8.983f, 2.305f, 9.484f, 2.2f, 10f)
                horizontalLineTo(7.069f)
                curveTo(7.023f, 10.651f, 7f, 11.319f, 7f, 12f)
                curveTo(7f, 13.035f, 7.054f, 14.042f, 7.157f, 15f)
                horizontalLineTo(2.458f)
                curveTo(2.621f, 15.52f, 2.825f, 16.021f, 3.067f, 16.5f)
                horizontalLineTo(7.365f)
                curveTo(7.58f, 17.755f, 7.884f, 18.897f, 8.265f, 19.874f)
                curveTo(8.511f, 20.504f, 8.794f, 21.079f, 9.115f, 21.578f)
                curveTo(10.028f, 21.852f, 10.997f, 22f, 12f, 22f)
                curveTo(13.003f, 22f, 13.971f, 21.852f, 14.885f, 21.578f)
                curveTo(15.206f, 21.079f, 15.489f, 20.504f, 15.734f, 19.874f)
                curveTo(16.115f, 18.897f, 16.42f, 17.755f, 16.635f, 16.5f)
                horizontalLineTo(20.933f)
                curveTo(21.174f, 16.021f, 21.379f, 15.52f, 21.542f, 15f)
                horizontalLineTo(16.843f)
                curveTo(16.946f, 14.042f, 17f, 13.035f, 17f, 12f)
                curveTo(17f, 11.319f, 16.976f, 10.651f, 16.931f, 10f)
                horizontalLineTo(21.8f)
                curveTo(21.695f, 9.484f, 21.551f, 8.983f, 21.37f, 8.5f)
                horizontalLineTo(16.784f)
                curveTo(16.573f, 6.849f, 16.214f, 5.356f, 15.734f, 4.126f)
                curveTo(15.489f, 3.496f, 15.206f, 2.921f, 14.885f, 2.422f)
                curveTo(13.971f, 2.148f, 13.003f, 2f, 12f, 2f)
                curveTo(10.997f, 2f, 10.028f, 2.148f, 9.115f, 2.422f)
                close()
                moveTo(8.729f, 8.5f)
                curveTo(8.929f, 7.031f, 9.251f, 5.726f, 9.663f, 4.671f)
                curveTo(10.022f, 3.751f, 10.434f, 3.059f, 10.857f, 2.609f)
                curveTo(11.277f, 2.163f, 11.662f, 2f, 12f, 2f)
                curveTo(12.338f, 2f, 12.722f, 2.163f, 13.142f, 2.609f)
                curveTo(13.566f, 3.059f, 13.978f, 3.751f, 14.337f, 4.671f)
                curveTo(14.749f, 5.726f, 15.071f, 7.031f, 15.271f, 8.5f)
                horizontalLineTo(8.729f)
                close()
                moveTo(12f, 22f)
                curveTo(12.338f, 22f, 12.722f, 21.837f, 13.142f, 21.391f)
                curveTo(13.566f, 20.941f, 13.978f, 20.249f, 14.337f, 19.329f)
                curveTo(14.653f, 18.52f, 14.916f, 17.564f, 15.112f, 16.5f)
                horizontalLineTo(8.888f)
                curveTo(9.084f, 17.564f, 9.347f, 18.52f, 9.663f, 19.329f)
                curveTo(10.022f, 20.249f, 10.434f, 20.941f, 10.857f, 21.391f)
                curveTo(11.277f, 21.837f, 11.662f, 22f, 12f, 22f)
                close()
                moveTo(8.5f, 12f)
                curveTo(8.5f, 13.048f, 8.558f, 14.054f, 8.666f, 15f)
                horizontalLineTo(15.334f)
                curveTo(15.442f, 14.054f, 15.5f, 13.048f, 15.5f, 12f)
                curveTo(15.5f, 11.314f, 15.475f, 10.645f, 15.427f, 10f)
                horizontalLineTo(8.572f)
                curveTo(8.525f, 10.645f, 8.5f, 11.314f, 8.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF62BE55),
                        1f to Color(0xFF1E794A)
                    ),
                    start = Offset(14.875f, 11f),
                    end = Offset(23.937f, 21.821f)
                )
            ) {
                moveTo(22.5f, 13.01f)
                curveTo(20.594f, 12.838f, 19.066f, 11.724f, 18.385f, 11.139f)
                curveTo(18.168f, 10.953f, 17.832f, 10.953f, 17.615f, 11.139f)
                curveTo(16.934f, 11.724f, 15.406f, 12.838f, 13.5f, 13.01f)
                curveTo(13.224f, 13.035f, 13f, 13.257f, 13f, 13.533f)
                lineTo(13f, 17.033f)
                curveTo(13f, 21.256f, 17.094f, 22.749f, 17.873f, 22.995f)
                curveTo(17.956f, 23.022f, 18.044f, 23.022f, 18.127f, 22.995f)
                curveTo(18.907f, 22.749f, 23f, 21.256f, 23f, 17.033f)
                lineTo(23f, 13.533f)
                curveTo(23f, 13.257f, 22.775f, 13.035f, 22.5f, 13.01f)
                close()
            }
        }.build()

        return _GlobeShield!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeShield: ImageVector? = null

@Preview
@Composable
private fun GlobeShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.GlobeShield, contentDescription = null)
    }
}
