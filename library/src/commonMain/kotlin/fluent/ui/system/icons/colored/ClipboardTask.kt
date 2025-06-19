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

public val FluentIcons.Colored.ClipboardTask: ImageVector
    get() {
        if (_ClipboardTask != null) {
            return _ClipboardTask!!
        }
        _ClipboardTask = ImageVector.Builder(
            name = "Colored.ClipboardTask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(4f, 5.8f),
                    end = Offset(18.146f, 23.483f)
                )
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0A1852),
                        0.9f to Color(0x000A1852)
                    ),
                    center = Offset(12f, 3f),
                    radius = 6.169f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0A1852),
                        1f to Color(0x000A1852)
                    ),
                    center = Offset(12f, 4.618f),
                    radius = 2.793f
                ),
                fillAlpha = 0.4f,
            ) {
                moveTo(4f, 6.25f)
                curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE06B),
                        1f to Color(0xFFFAB500)
                    ),
                    start = Offset(12f, 2f),
                    end = Offset(12f, 6.5f)
                )
            ) {
                moveTo(8f, 4.25f)
                curveTo(8f, 5.493f, 9.007f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.993f, 6.5f, 16f, 5.493f, 16f, 4.25f)
                curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9DEAFF),
                        1f to Color(0xFFFFFFFF)
                    ),
                    start = Offset(18f, 18.5f),
                    end = Offset(10.265f, 7.732f)
                ),
                fillAlpha = 0.9f,
            ) {
                moveTo(17.03f, 11.03f)
                curveTo(17.323f, 10.737f, 17.323f, 10.263f, 17.03f, 9.97f)
                curveTo(16.737f, 9.677f, 16.263f, 9.677f, 15.97f, 9.97f)
                lineTo(11f, 14.939f)
                lineTo(9.03f, 12.97f)
                curveTo(8.737f, 12.677f, 8.263f, 12.677f, 7.97f, 12.97f)
                curveTo(7.677f, 13.263f, 7.677f, 13.737f, 7.97f, 14.03f)
                lineTo(10.47f, 16.53f)
                curveTo(10.763f, 16.823f, 11.237f, 16.823f, 11.53f, 16.53f)
                lineTo(17.03f, 11.03f)
                close()
            }
        }.build()

        return _ClipboardTask!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTask: ImageVector? = null

@Preview
@Composable
private fun ClipboardTaskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ClipboardTask, contentDescription = null)
    }
}
