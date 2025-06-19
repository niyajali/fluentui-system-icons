package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Colored.Notebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD373FC),
                        1f to Color(0xFF2052CB)
                    ),
                    start = Offset(18.5f, 0.501f),
                    end = Offset(27.052f, 20.789f)
                )
            ) {
                moveTo(18.5f, 15f)
                lineTo(20.25f, 15f)
                curveTo(20.63f, 15f, 20.944f, 15.282f, 20.993f, 15.648f)
                lineTo(21f, 15.75f)
                verticalLineTo(17.248f)
                curveTo(21f, 17.628f, 20.718f, 17.942f, 20.352f, 17.991f)
                lineTo(20.25f, 17.998f)
                lineTo(18.5f, 17.998f)
                verticalLineTo(15f)
                lineTo(20.25f, 15f)
                lineTo(18.5f, 15f)
                close()
                moveTo(18.5f, 11f)
                lineTo(20.25f, 11f)
                curveTo(20.63f, 11f, 20.944f, 11.282f, 20.993f, 11.648f)
                lineTo(21f, 11.75f)
                verticalLineTo(13.248f)
                curveTo(21f, 13.628f, 20.718f, 13.942f, 20.352f, 13.991f)
                lineTo(20.25f, 13.998f)
                lineTo(18.5f, 13.998f)
                verticalLineTo(11f)
                lineTo(20.25f, 11f)
                lineTo(18.5f, 11f)
                close()
                moveTo(18.5f, 7f)
                lineTo(20.25f, 7f)
                curveTo(20.63f, 7f, 20.944f, 7.282f, 20.993f, 7.648f)
                lineTo(21f, 7.75f)
                verticalLineTo(9.248f)
                curveTo(21f, 9.628f, 20.718f, 9.942f, 20.352f, 9.991f)
                lineTo(20.25f, 9.998f)
                lineTo(18.5f, 9.998f)
                verticalLineTo(7f)
                lineTo(20.25f, 7f)
                lineTo(18.5f, 7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE587F2),
                        1f to Color(0xFF816CDE)
                    ),
                    start = Offset(2.125f, 2f),
                    end = Offset(1.006f, 24.381f)
                )
            ) {
                moveTo(16.749f, 2f)
                curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(16.749f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.5f to Color(0x00DD3CE2),
                        1f to Color(0xFFDD3CE2)
                    ),
                    center = Offset(10.875f, 0.75f),
                    radius = 22.901f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(16.749f, 2f)
                curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(16.749f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDD3FF),
                        1f to Color(0xFFF3D8FF)
                    ),
                    start = Offset(8.687f, 5f),
                    end = Offset(17.134f, 10.128f)
                )
            ) {
                moveTo(15.249f, 5f)
                curveTo(15.663f, 5f, 15.999f, 5.336f, 15.999f, 5.75f)
                verticalLineTo(8.248f)
                curveTo(15.999f, 8.663f, 15.663f, 8.998f, 15.249f, 8.998f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 8.998f, 7f, 8.663f, 7f, 8.248f)
                verticalLineTo(5.75f)
                curveTo(7f, 5.336f, 7.336f, 5f, 7.75f, 5f)
                horizontalLineTo(15.249f)
                close()
            }
        }.build()

        return _Notebook!!
    }

@Suppress("ObjectPropertyName")
private var _Notebook: ImageVector? = null

@Preview
@Composable
private fun NotebookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Notebook, contentDescription = null)
    }
}
