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

public val FluentIcons.Colored.PersonKey: ImageVector
    get() {
        if (_PersonKey != null) {
            return _PersonKey!!
        }
        _PersonKey = ImageVector.Builder(
            name = "Colored.PersonKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(7.808f, 15.064f),
                    end = Offset(10.394f, 23.319f)
                )
            ) {
                moveTo(18f, 14.013f)
                curveTo(17.919f, 14.005f, 17.837f, 14f, 17.754f, 14f)
                horizontalLineTo(6.252f)
                curveTo(5.01f, 14f, 4.003f, 15.007f, 4.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(4.003f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
                curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
                curveTo(12.765f, 22.001f, 13.485f, 21.948f, 14.16f, 21.84f)
                lineTo(18f, 18f)
                verticalLineTo(14.013f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(12.003f, 13.047f),
                    end = Offset(15.623f, 26.573f)
                )
            ) {
                moveTo(18f, 14.013f)
                curveTo(17.919f, 14.005f, 17.837f, 14f, 17.754f, 14f)
                horizontalLineTo(6.252f)
                curveTo(5.01f, 14f, 4.003f, 15.007f, 4.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(4.003f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
                curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
                curveTo(12.765f, 22.001f, 13.485f, 21.948f, 14.16f, 21.84f)
                lineTo(18f, 18f)
                verticalLineTo(14.013f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xBF0A1852),
                        1f to Color(0x000A1852)
                    ),
                    center = Offset(15.084f, 24.859f),
                    radius = 13.299f
                ),
                fillAlpha = 0.75f,
            ) {
                moveTo(18f, 14.013f)
                curveTo(17.919f, 14.005f, 17.837f, 14f, 17.754f, 14f)
                horizontalLineTo(6.252f)
                curveTo(5.01f, 14f, 4.003f, 15.007f, 4.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(4.003f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
                curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
                curveTo(12.765f, 22.001f, 13.485f, 21.948f, 14.16f, 21.84f)
                lineTo(18f, 18f)
                verticalLineTo(14.013f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xBF0A1852),
                        1f to Color(0x000A1852)
                    ),
                    center = Offset(19.5f, 16f),
                    radius = 3.5f
                ),
                fillAlpha = 0.75f,
            ) {
                moveTo(18f, 14.013f)
                curveTo(17.919f, 14.005f, 17.837f, 14f, 17.754f, 14f)
                horizontalLineTo(6.252f)
                curveTo(5.01f, 14f, 4.003f, 15.007f, 4.003f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(4.003f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
                curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
                curveTo(12.765f, 22.001f, 13.485f, 21.948f, 14.16f, 21.84f)
                lineTo(18f, 18f)
                verticalLineTo(14.013f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(9.379f, 3.334f),
                    end = Offset(14.475f, 11.472f)
                )
            ) {
                moveTo(12f, 2.005f)
                curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
                curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
                curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
                curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(23.016f, 22.996f),
                    end = Offset(12.568f, 14.449f)
                )
            ) {
                moveTo(23f, 15.5f)
                curveTo(23f, 17.433f, 21.433f, 19f, 19.5f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                curveTo(18f, 20.276f, 17.776f, 20.5f, 17.5f, 20.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.5f)
                curveTo(16.5f, 21.776f, 16.276f, 22f, 16f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(22.5f)
                curveTo(15f, 22.776f, 14.776f, 23f, 14.5f, 23f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 23f, 12f, 22.776f, 12f, 22.5f)
                verticalLineTo(20.914f)
                curveTo(12f, 20.649f, 12.105f, 20.395f, 12.293f, 20.207f)
                lineTo(16.113f, 16.387f)
                curveTo(16.039f, 16.104f, 16f, 15.806f, 16f, 15.5f)
                curveTo(16f, 13.567f, 17.567f, 12f, 19.5f, 12f)
                curveTo(21.433f, 12f, 23f, 13.567f, 23f, 15.5f)
                close()
                moveTo(21f, 15f)
                curveTo(21f, 14.448f, 20.552f, 14f, 20f, 14f)
                curveTo(19.448f, 14f, 19f, 14.448f, 19f, 15f)
                curveTo(19f, 15.552f, 19.448f, 16f, 20f, 16f)
                curveTo(20.552f, 16f, 21f, 15.552f, 21f, 15f)
                close()
            }
        }.build()

        return _PersonKey!!
    }

@Suppress("ObjectPropertyName")
private var _PersonKey: ImageVector? = null

@Preview
@Composable
private fun PersonKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.PersonKey, contentDescription = null)
    }
}
