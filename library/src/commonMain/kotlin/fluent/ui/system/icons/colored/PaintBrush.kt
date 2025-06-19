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

public val FluentIcons.Colored.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) {
            return _PaintBrush!!
        }
        _PaintBrush = ImageVector.Builder(
            name = "Colored.PaintBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.085f to Color(0xFFFFCD0F),
                        0.991f to Color(0xFFE67505)
                    ),
                    start = Offset(9.2f, -1.281f),
                    end = Offset(15.448f, 16.05f)
                )
            ) {
                moveTo(19f, 2.75f)
                curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(19f)
                verticalLineTo(2.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFAC80FF),
                        1f to Color(0xFF5750E2)
                    ),
                    start = Offset(5f, 8.471f),
                    end = Offset(5.857f, 24.589f)
                )
            ) {
                moveTo(5f, 12f)
                verticalLineTo(14.252f)
                curveTo(5f, 15.495f, 6.007f, 16.502f, 7.25f, 16.502f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                curveTo(10f, 21.105f, 10.895f, 22f, 12f, 22f)
                curveTo(13.104f, 22f, 14f, 21.105f, 14f, 20f)
                verticalLineTo(16.502f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 16.502f, 19f, 15.495f, 19f, 14.252f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF5750E2)
                    ),
                    start = Offset(8.329f, 11.199f),
                    end = Offset(8.443f, 12.891f)
                )
            ) {
                moveTo(5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                horizontalLineTo(18f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                verticalLineTo(12.5f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF921F),
                        1f to Color(0xFFEB4824)
                    ),
                    start = Offset(12.5f, 0.611f),
                    end = Offset(16.548f, 5.929f)
                )
            ) {
                moveTo(12.5f, 5.252f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(5.252f)
                curveTo(14f, 5.666f, 13.664f, 6.002f, 13.25f, 6.002f)
                curveTo(12.836f, 6.002f, 12.5f, 5.666f, 12.5f, 5.252f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF921F),
                        1f to Color(0xFFEB4824)
                    ),
                    start = Offset(12.5f, 0.611f),
                    end = Offset(16.548f, 5.929f)
                )
            ) {
                moveTo(15f, 6.251f)
                verticalLineTo(2f)
                horizontalLineTo(16.5f)
                verticalLineTo(6.251f)
                curveTo(16.5f, 6.665f, 16.164f, 7.001f, 15.75f, 7.001f)
                curveTo(15.336f, 7.001f, 15f, 6.665f, 15f, 6.251f)
                close()
            }
        }.build()

        return _PaintBrush!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrush: ImageVector? = null

@Preview
@Composable
private fun PaintBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.PaintBrush, contentDescription = null)
    }
}
