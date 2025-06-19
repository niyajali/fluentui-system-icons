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

public val FluentIcons.Colored.SendClock: ImageVector
    get() {
        if (_SendClock != null) {
            return _SendClock!!
        }
        _SendClock = ImageVector.Builder(
            name = "Colored.SendClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0094F0),
                        1f to Color(0xFF2052CB)
                    ),
                    center = Offset(1.494f, 12f),
                    radius = 8.006f
                )
            ) {
                moveTo(5.57f, 12f)
                lineTo(4.446f, 9f)
                lineTo(13.589f, 11.024f)
                curveTo(14.634f, 11.255f, 14.634f, 12.745f, 13.589f, 12.976f)
                lineTo(4.446f, 15f)
                lineTo(5.57f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3BD5FF),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(2.246f, -5.676f),
                    end = Offset(18.952f, 16.518f)
                )
            ) {
                moveTo(12.815f, 12.197f)
                lineTo(5.283f, 13.453f)
                curveTo(5.107f, 13.482f, 4.96f, 13.603f, 4.897f, 13.771f)
                lineTo(2.299f, 20.728f)
                curveTo(2.051f, 21.368f, 2.72f, 21.978f, 3.334f, 21.671f)
                lineTo(21.334f, 12.671f)
                curveTo(21.886f, 12.395f, 21.886f, 11.606f, 21.334f, 11.329f)
                lineTo(3.334f, 2.329f)
                curveTo(2.72f, 2.023f, 2.051f, 2.633f, 2.299f, 3.272f)
                lineTo(4.897f, 10.229f)
                curveTo(4.96f, 10.397f, 5.107f, 10.518f, 5.283f, 10.548f)
                lineTo(12.815f, 11.803f)
                curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
                curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0x00DCF8FF),
                        0.769f to Color(0xB2FF6CE8)
                    ),
                    start = Offset(11.997f, 7.505f),
                    end = Offset(17.07f, 21.229f)
                )
            ) {
                moveTo(12.815f, 12.197f)
                lineTo(5.283f, 13.453f)
                curveTo(5.107f, 13.482f, 4.96f, 13.603f, 4.897f, 13.771f)
                lineTo(2.299f, 20.728f)
                curveTo(2.051f, 21.368f, 2.72f, 21.978f, 3.334f, 21.671f)
                lineTo(21.334f, 12.671f)
                curveTo(21.886f, 12.395f, 21.886f, 11.606f, 21.334f, 11.329f)
                lineTo(3.334f, 2.329f)
                curveTo(2.72f, 2.023f, 2.051f, 2.633f, 2.299f, 3.272f)
                lineTo(4.897f, 10.229f)
                curveTo(4.96f, 10.397f, 5.107f, 10.518f, 5.283f, 10.548f)
                lineTo(12.815f, 11.803f)
                curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
                curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.711f to Color(0xFF1B44B1),
                        1f to Color(0x001B44B1)
                    ),
                    center = Offset(17.5f, 20.5f),
                    radius = 9.552f
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(12.815f, 12.197f)
                lineTo(5.283f, 13.453f)
                curveTo(5.107f, 13.482f, 4.96f, 13.603f, 4.897f, 13.771f)
                lineTo(2.299f, 20.728f)
                curveTo(2.051f, 21.368f, 2.72f, 21.978f, 3.334f, 21.671f)
                lineTo(21.334f, 12.671f)
                curveTo(21.886f, 12.395f, 21.886f, 11.606f, 21.334f, 11.329f)
                lineTo(3.334f, 2.329f)
                curveTo(2.72f, 2.023f, 2.051f, 2.633f, 2.299f, 3.272f)
                lineTo(4.897f, 10.229f)
                curveTo(4.96f, 10.397f, 5.107f, 10.518f, 5.283f, 10.548f)
                lineTo(12.815f, 11.803f)
                curveTo(12.924f, 11.821f, 12.997f, 11.924f, 12.979f, 12.033f)
                curveTo(12.965f, 12.117f, 12.899f, 12.183f, 12.815f, 12.197f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF43E5CA),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(13.833f, 11.389f),
                    end = Offset(19.333f, 23.611f)
                )
            ) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFD1D1FF)
                    ),
                    start = Offset(17.306f, 14.612f),
                    end = Offset(16.398f, 17.88f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.5f, 14f)
                curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
                curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
                close()
            }
        }.build()

        return _SendClock!!
    }

@Suppress("ObjectPropertyName")
private var _SendClock: ImageVector? = null

@Preview
@Composable
private fun SendClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.SendClock, contentDescription = null)
    }
}
