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

public val FluentIcons.Colored.TextEditStyle: ImageVector
    get() {
        if (_TextEditStyle != null) {
            return _TextEditStyle!!
        }
        _TextEditStyle = ImageVector.Builder(
            name = "Colored.TextEditStyle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        0.677f to Color(0xFF0078D4),
                        0.84f to Color(0xFF0057AA),
                        1f to Color(0xFF0057AA)
                    ),
                    start = Offset(3f, 2.646f),
                    end = Offset(5.959f, 14.676f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.202f, 2.474f)
                lineTo(8.151f, 2.369f)
                curveTo(8.019f, 2.139f, 7.79f, 2.017f, 7.555f, 2.001f)
                curveTo(7.505f, 1.998f, 7.456f, 1.999f, 7.406f, 2.006f)
                curveTo(7.185f, 2.031f, 6.974f, 2.152f, 6.849f, 2.369f)
                lineTo(6.798f, 2.474f)
                lineTo(3.546f, 10.724f)
                lineTo(3.053f, 11.969f)
                lineTo(3.022f, 12.066f)
                curveTo(2.933f, 12.425f, 3.121f, 12.803f, 3.474f, 12.942f)
                lineTo(3.572f, 12.973f)
                curveTo(3.93f, 13.062f, 4.308f, 12.873f, 4.448f, 12.52f)
                lineTo(4.703f, 11.879f)
                lineTo(5.443f, 10f)
                horizontalLineTo(9.556f)
                lineTo(10.297f, 11.879f)
                lineTo(10.552f, 12.52f)
                curveTo(10.692f, 12.873f, 11.07f, 13.062f, 11.428f, 12.973f)
                lineTo(11.526f, 12.942f)
                curveTo(11.879f, 12.803f, 12.067f, 12.425f, 11.978f, 12.066f)
                lineTo(11.947f, 11.969f)
                lineTo(11.454f, 10.724f)
                lineTo(8.202f, 2.474f)
                close()
                moveTo(8.964f, 8.5f)
                lineTo(7.5f, 4.799f)
                lineTo(6.036f, 8.5f)
                horizontalLineTo(8.964f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFA43D),
                        1f to Color(0xFFFB5937)
                    ),
                    start = Offset(14.552f, 11.684f),
                    end = Offset(15.969f, 17.238f)
                )
            ) {
                moveTo(12.948f, 20.097f)
                lineTo(20.061f, 12.995f)
                lineTo(15.509f, 8.442f)
                lineTo(8.385f, 15.554f)
                lineTo(8.545f, 19.947f)
                lineTo(12.948f, 20.097f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.255f to Color(0xFFFFD394),
                        1f to Color(0xFFFF921F)
                    ),
                    start = Offset(5.464f, 17.351f),
                    end = Offset(10.112f, 22.041f)
                )
            ) {
                moveTo(12.948f, 20.097f)
                curveTo(12.676f, 20.369f, 12.339f, 20.566f, 11.969f, 20.67f)
                lineTo(7.357f, 21.973f)
                curveTo(6.785f, 22.135f, 6.262f, 21.6f, 6.435f, 21.033f)
                lineTo(7.823f, 16.489f)
                curveTo(7.931f, 16.136f, 8.124f, 15.815f, 8.385f, 15.554f)
                curveTo(8.385f, 15.554f, 8.67f, 17.244f, 9.959f, 18.533f)
                curveTo(11.248f, 19.822f, 12.948f, 20.097f, 12.948f, 20.097f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF97DBD),
                        1f to Color(0xFFDD3CE2)
                    ),
                    start = Offset(19.401f, 9.091f),
                    end = Offset(16.581f, 11.751f)
                )
            ) {
                moveTo(20.062f, 12.995f)
                curveTo(21.319f, 11.739f, 21.319f, 9.701f, 20.063f, 8.444f)
                curveTo(18.806f, 7.187f, 16.768f, 7.185f, 15.51f, 8.442f)
                lineTo(13.335f, 10.605f)
                lineTo(17.897f, 15.148f)
                lineTo(20.062f, 12.995f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF921F),
                        1f to Color(0xFFFFE994)
                    ),
                    start = Offset(16.107f, 13.738f),
                    end = Offset(11.359f, 11.656f)
                )
            ) {
                moveTo(17.19f, 15.855f)
                lineTo(19.354f, 13.703f)
                curveTo(19.354f, 13.703f, 17.654f, 13.416f, 16.371f, 12.133f)
                curveTo(15.088f, 10.849f, 14.802f, 9.149f, 14.802f, 9.149f)
                lineTo(12.628f, 11.312f)
                curveTo(12.628f, 11.312f, 12.913f, 13.001f, 14.202f, 14.29f)
                curveTo(15.491f, 15.58f, 17.19f, 15.855f, 17.19f, 15.855f)
                close()
            }
        }.build()

        return _TextEditStyle!!
    }

@Suppress("ObjectPropertyName")
private var _TextEditStyle: ImageVector? = null

@Preview
@Composable
private fun TextEditStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.TextEditStyle, contentDescription = null)
    }
}
