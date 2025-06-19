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

public val FluentIcons.Colored.Beach: ImageVector
    get() {
        if (_Beach != null) {
            return _Beach!!
        }
        _Beach = ImageVector.Builder(
            name = "Colored.Beach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCD3E1D),
                        1f to Color(0xFF592A00)
                    ),
                    start = Offset(12.073f, 13.327f),
                    end = Offset(17.739f, 7.042f)
                )
            ) {
                moveTo(16.552f, 7.8f)
                lineTo(15.25f, 7.061f)
                lineTo(10.934f, 14.668f)
                lineTo(12.236f, 15.407f)
                lineTo(16.552f, 7.8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC7A3),
                        1f to Color(0xFFFFA43D)
                    ),
                    start = Offset(12f, 19.695f),
                    end = Offset(12f, 14.062f)
                )
            ) {
                moveTo(6.347f, 19.448f)
                lineTo(8.809f, 21.062f)
                lineTo(11.861f, 19.604f)
                lineTo(14.914f, 20.984f)
                lineTo(17.634f, 19.526f)
                lineTo(19f, 20.305f)
                curveTo(18.963f, 18.135f, 17.695f, 16.032f, 15.455f, 14.886f)
                curveTo(12.095f, 13.162f, 7.812f, 14.23f, 5.904f, 17.267f)
                curveTo(5.239f, 18.324f, 4.956f, 19.47f, 5.005f, 20.594f)
                lineTo(6.347f, 19.437f)
                verticalLineTo(19.448f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.061f to Color(0xFF0FAFFF),
                        1f to Color(0xFF0078D4)
                    ),
                    start = Offset(12.013f, 21.467f),
                    end = Offset(12.013f, 18.318f)
                )
            ) {
                moveTo(17.915f, 18.061f)
                curveTo(17.531f, 18.061f, 17.201f, 18.307f, 17.08f, 18.668f)
                lineTo(17.08f, 18.669f)
                curveTo(16.357f, 20.872f, 13.539f, 20.84f, 12.821f, 18.777f)
                curveTo(12.7f, 18.429f, 12.37f, 18.186f, 11.988f, 18.186f)
                curveTo(11.6f, 18.186f, 11.286f, 18.434f, 11.166f, 18.776f)
                lineTo(11.166f, 18.778f)
                curveTo(10.46f, 20.84f, 7.642f, 20.885f, 6.907f, 18.693f)
                curveTo(6.785f, 18.326f, 6.437f, 18.084f, 6.042f, 18.098f)
                curveTo(5.639f, 18.101f, 5.321f, 18.406f, 5.222f, 18.753f)
                lineTo(5.219f, 18.763f)
                curveTo(5.021f, 19.578f, 4.659f, 19.99f, 4.263f, 20.226f)
                lineTo(4.262f, 20.227f)
                curveTo(3.844f, 20.48f, 3.273f, 20.589f, 2.62f, 20.601f)
                curveTo(2.131f, 20.603f, 1.75f, 21.004f, 1.75f, 21.474f)
                curveTo(1.75f, 21.948f, 2.148f, 22.347f, 2.623f, 22.347f)
                curveTo(3.445f, 22.347f, 4.367f, 22.206f, 5.167f, 21.726f)
                curveTo(5.548f, 21.497f, 5.885f, 21.198f, 6.168f, 20.824f)
                curveTo(7.743f, 22.509f, 10.473f, 22.495f, 12f, 20.772f)
                curveTo(13.559f, 22.522f, 16.369f, 22.484f, 17.915f, 20.693f)
                curveTo(18.781f, 21.711f, 20.084f, 22.297f, 21.377f, 22.297f)
                curveTo(21.867f, 22.297f, 22.25f, 21.895f, 22.25f, 21.424f)
                curveTo(22.25f, 20.95f, 21.852f, 20.552f, 21.377f, 20.552f)
                curveTo(20.245f, 20.552f, 19.126f, 19.817f, 18.751f, 18.669f)
                lineTo(18.75f, 18.668f)
                curveTo(18.63f, 18.307f, 18.3f, 18.061f, 17.915f, 18.061f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFAA1D2D),
                        1f to Color(0xFFFB6F7B)
                    ),
                    start = Offset(20.619f, 15.15f),
                    end = Offset(10.728f, 1.963f)
                )
            ) {
                moveTo(19.647f, 12.813f)
                curveTo(20.126f, 13.084f, 20.735f, 12.918f, 21.008f, 12.44f)
                lineTo(21.08f, 12.315f)
                curveTo(22.966f, 8.992f, 21.871f, 4.812f, 18.535f, 2.913f)
                curveTo(15.199f, 1.014f, 10.953f, 2.174f, 9.067f, 5.497f)
                lineTo(8.875f, 5.833f)
                curveTo(8.668f, 6.193f, 8.794f, 6.653f, 9.155f, 6.858f)
                lineTo(19.647f, 12.813f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFECBE6),
                        1f to Color(0xFFFDAFD9)
                    ),
                    start = Offset(18.483f, 8.005f),
                    end = Offset(12.915f, 6.15f)
                )
            ) {
                moveTo(18.618f, 2.97f)
                curveTo(17.067f, 3.476f, 14.068f, 5.592f, 12.4f, 8.704f)
                lineTo(16.9f, 11.253f)
                curveTo(18.711f, 8.222f, 18.983f, 4.561f, 18.618f, 2.97f)
                close()
            }
        }.build()

        return _Beach!!
    }

@Suppress("ObjectPropertyName")
private var _Beach: ImageVector? = null

@Preview
@Composable
private fun BeachPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Beach, contentDescription = null)
    }
}
