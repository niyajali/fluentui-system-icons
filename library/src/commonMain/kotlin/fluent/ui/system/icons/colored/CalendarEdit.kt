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

public val FluentIcons.Colored.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "Colored.CalendarEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3E0FF),
                        1f to Color(0xFFB3E0FF)
                    ),
                    start = Offset(15.25f, 22.781f),
                    end = Offset(9.834f, 7.321f)
                )
            ) {
                moveTo(21f, 16f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(3f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(16f)
                lineTo(21f, 16f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00DCF8FF),
                        1f to Color(0xB2FF6CE8)
                    ),
                    start = Offset(13.929f, 12.432f),
                    end = Offset(16.625f, 24.267f)
                )
            ) {
                moveTo(21f, 16f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(3f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(16f)
                lineTo(21f, 16f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.535f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(18.5f, 18.5f),
                    radius = 11.029f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(21f, 16f)
                verticalLineTo(7.5f)
                lineTo(12f, 6.5f)
                lineTo(3f, 7.5f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(16f)
                lineTo(21f, 16f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0078D4),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(10.909f, 9.692f),
                    end = Offset(13.059f, 23.697f)
                )
            ) {
                moveTo(7.25f, 15f)
                curveTo(7.94f, 15f, 8.5f, 15.56f, 8.5f, 16.25f)
                curveTo(8.5f, 16.94f, 7.94f, 17.5f, 7.25f, 17.5f)
                curveTo(6.56f, 17.5f, 6f, 16.94f, 6f, 16.25f)
                curveTo(6f, 15.56f, 6.56f, 15f, 7.25f, 15f)
                close()
                moveTo(12f, 15f)
                curveTo(12.69f, 15f, 13.25f, 15.56f, 13.25f, 16.25f)
                curveTo(13.25f, 16.94f, 12.69f, 17.5f, 12f, 17.5f)
                curveTo(11.31f, 17.5f, 10.75f, 16.94f, 10.75f, 16.25f)
                curveTo(10.75f, 15.56f, 11.31f, 15f, 12f, 15f)
                close()
                moveTo(7.25f, 10.5f)
                curveTo(7.94f, 10.5f, 8.5f, 11.06f, 8.5f, 11.75f)
                curveTo(8.5f, 12.44f, 7.94f, 13f, 7.25f, 13f)
                curveTo(6.56f, 13f, 6f, 12.44f, 6f, 11.75f)
                curveTo(6f, 11.06f, 6.56f, 10.5f, 7.25f, 10.5f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
                curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
                curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
                curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
                close()
                moveTo(16.75f, 10.5f)
                curveTo(17.44f, 10.5f, 18f, 11.06f, 18f, 11.75f)
                curveTo(18f, 12.44f, 17.44f, 13f, 16.75f, 13f)
                curveTo(16.06f, 13f, 15.5f, 12.44f, 15.5f, 11.75f)
                curveTo(15.5f, 11.06f, 16.06f, 10.5f, 16.75f, 10.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(3f, 3f),
                    end = Offset(18.372f, -1.963f)
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFA43D),
                        1f to Color(0xFFFB5937)
                    ),
                    start = Offset(15.03f, 16.308f),
                    end = Offset(18.73f, 20.018f)
                )
            ) {
                moveTo(20.585f, 14.456f)
                horizontalLineTo(17.344f)
                lineTo(13.202f, 18.602f)
                curveTo(13.139f, 18.664f, 13.08f, 18.73f, 13.024f, 18.798f)
                verticalLineTo(22.006f)
                lineTo(16.275f, 22.006f)
                curveTo(16.334f, 21.956f, 16.391f, 21.904f, 16.445f, 21.849f)
                lineTo(20.585f, 17.705f)
                verticalLineTo(14.456f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.255f to Color(0xFFFFD394),
                        1f to Color(0xFFFF921F)
                    ),
                    start = Offset(11.387f, 19.976f),
                    end = Offset(14.456f, 23.042f)
                )
            ) {
                moveTo(16.279f, 21.998f)
                curveTo(15.965f, 22.263f, 15.594f, 22.454f, 15.193f, 22.554f)
                lineTo(13.356f, 23.014f)
                curveTo(12.557f, 23.214f, 11.834f, 22.49f, 12.034f, 21.69f)
                lineTo(12.493f, 19.851f)
                curveTo(12.59f, 19.461f, 12.773f, 19.098f, 13.027f, 18.79f)
                curveTo(13.404f, 20.389f, 14.673f, 21.644f, 16.279f, 21.998f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF97DBD),
                        1f to Color(0xFFDD3CE2)
                    ),
                    start = Offset(21.904f, 13.116f),
                    end = Offset(19.926f, 15.016f)
                )
            ) {
                moveTo(17.574f, 14.235f)
                lineTo(19.134f, 12.673f)
                curveTo(20.03f, 11.776f, 21.482f, 11.776f, 22.378f, 12.673f)
                curveTo(23.274f, 13.569f, 23.274f, 15.023f, 22.378f, 15.92f)
                lineTo(20.937f, 17.362f)
                lineTo(17.574f, 14.235f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF921F),
                        1f to Color(0xFFFFE994)
                    ),
                    start = Offset(19.657f, 16.292f),
                    end = Offset(16.488f, 14.902f)
                )
            ) {
                moveTo(21.824f, 16.477f)
                curveTo(20.204f, 16.121f, 18.926f, 14.848f, 18.562f, 13.228f)
                lineTo(17.335f, 14.456f)
                curveTo(17.7f, 16.075f, 18.977f, 17.349f, 20.598f, 17.705f)
                lineTo(21.824f, 16.477f)
                close()
            }
        }.build()

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null

@Preview
@Composable
private fun CalendarEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CalendarEdit, contentDescription = null)
    }
}
