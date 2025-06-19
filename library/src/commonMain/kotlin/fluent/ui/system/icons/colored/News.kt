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

public val FluentIcons.Colored.News: ImageVector
    get() {
        if (_News != null) {
            return _News!!
        }
        _News = ImageVector.Builder(
            name = "Colored.News",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF068BEB),
                        0.617f to Color(0xFF0056CF),
                        0.974f to Color(0xFF0027A7)
                    ),
                    center = Offset(24.1f, 8.95f),
                    radius = 9.082f
                )
            ) {
                moveTo(19.75f, 7f)
                curveTo(20.941f, 7f, 21.916f, 7.925f, 21.995f, 9.096f)
                lineTo(22f, 9.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(18.5f)
                verticalLineTo(7f)
                horizontalLineTo(19.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3BD5FF),
                        1f to Color(0xFF367AF2)
                    ),
                    start = Offset(6.857f, 1.538f),
                    end = Offset(19.923f, 18.667f)
                )
            ) {
                moveTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.059f, 2.925f, 4.084f, 4.096f, 4.005f)
                lineTo(4.25f, 4f)
                horizontalLineTo(16.75f)
                curveTo(17.941f, 4f, 18.916f, 4.925f, 18.995f, 6.096f)
                lineTo(19f, 19.99f)
                curveTo(18.978f, 19.992f, 18.956f, 19.994f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.181f to Color(0x002764E7),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(11.714f, 16.923f),
                    end = Offset(11.714f, 20f)
                )
            ) {
                moveTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.059f, 2.925f, 4.084f, 4.096f, 4.005f)
                lineTo(4.25f, 4f)
                horizontalLineTo(16.75f)
                curveTo(17.941f, 4f, 18.916f, 4.925f, 18.995f, 6.096f)
                lineTo(19f, 19.99f)
                curveTo(18.978f, 19.992f, 18.956f, 19.994f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00DCF8FF),
                        1f to Color(0xB2FF6CE8)
                    ),
                    start = Offset(11.107f, 8.923f),
                    end = Offset(17.197f, 24.439f)
                )
            ) {
                moveTo(18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.643f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.059f, 2.925f, 4.084f, 4.096f, 4.005f)
                lineTo(4.25f, 4f)
                horizontalLineTo(16.75f)
                curveTo(17.941f, 4f, 18.916f, 4.925f, 18.995f, 6.096f)
                lineTo(19f, 19.99f)
                curveTo(18.978f, 19.992f, 18.956f, 19.994f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDEFCFF),
                        1f to Color(0xFF9FF0F9)
                    ),
                    start = Offset(5.474f, 10.76f),
                    end = Offset(7.973f, 15.762f)
                )
            ) {
                moveTo(9.243f, 11.005f)
                curveTo(9.657f, 11.005f, 9.993f, 11.34f, 9.993f, 11.755f)
                verticalLineTo(15.25f)
                curveTo(9.993f, 15.664f, 9.657f, 16f, 9.243f, 16f)
                horizontalLineTo(5.748f)
                curveTo(5.333f, 16f, 4.998f, 15.664f, 4.998f, 15.25f)
                verticalLineTo(11.755f)
                curveTo(4.998f, 11.34f, 5.333f, 11.005f, 5.748f, 11.005f)
                horizontalLineTo(9.243f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFCCEAFF)
                    ),
                    start = Offset(5.961f, 7.652f),
                    end = Offset(7.062f, 16.846f)
                )
            ) {
                moveTo(12.246f, 14.5f)
                horizontalLineTo(15.252f)
                curveTo(15.667f, 14.5f, 16.003f, 14.836f, 16.003f, 15.25f)
                curveTo(16.003f, 15.63f, 15.72f, 15.943f, 15.354f, 15.993f)
                lineTo(15.252f, 16f)
                horizontalLineTo(12.246f)
                curveTo(11.832f, 16f, 11.496f, 15.664f, 11.496f, 15.25f)
                curveTo(11.496f, 14.87f, 11.778f, 14.557f, 12.144f, 14.507f)
                lineTo(12.246f, 14.5f)
                horizontalLineTo(15.252f)
                horizontalLineTo(12.246f)
                close()
                moveTo(12.246f, 11.004f)
                horizontalLineTo(15.252f)
                curveTo(15.667f, 11.004f, 16.003f, 11.34f, 16.003f, 11.754f)
                curveTo(16.003f, 12.134f, 15.72f, 12.448f, 15.354f, 12.498f)
                lineTo(15.252f, 12.504f)
                horizontalLineTo(12.246f)
                curveTo(11.832f, 12.504f, 11.496f, 12.169f, 11.496f, 11.754f)
                curveTo(11.496f, 11.375f, 11.778f, 11.061f, 12.144f, 11.011f)
                lineTo(12.246f, 11.004f)
                horizontalLineTo(15.252f)
                horizontalLineTo(12.246f)
                close()
                moveTo(5.748f, 7.502f)
                horizontalLineTo(15.252f)
                curveTo(15.667f, 7.502f, 16.003f, 7.838f, 16.003f, 8.252f)
                curveTo(16.003f, 8.632f, 15.72f, 8.946f, 15.354f, 8.996f)
                lineTo(15.252f, 9.002f)
                horizontalLineTo(5.748f)
                curveTo(5.334f, 9.002f, 4.998f, 8.667f, 4.998f, 8.252f)
                curveTo(4.998f, 7.873f, 5.28f, 7.559f, 5.646f, 7.509f)
                lineTo(5.748f, 7.502f)
                horizontalLineTo(15.252f)
                horizontalLineTo(5.748f)
                close()
            }
        }.build()

        return _News!!
    }

@Suppress("ObjectPropertyName")
private var _News: ImageVector? = null

@Preview
@Composable
private fun NewsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.News, contentDescription = null)
    }
}
