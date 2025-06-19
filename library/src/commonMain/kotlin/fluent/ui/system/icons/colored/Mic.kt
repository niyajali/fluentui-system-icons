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

public val FluentIcons.Colored.Mic: ImageVector
    get() {
        if (_Mic != null) {
            return _Mic!!
        }
        _Mic = ImageVector.Builder(
            name = "Colored.Mic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFCAD2D9),
                        1f to Color(0xFF70777D)
                    ),
                    start = Offset(4.75f, 5.813f),
                    end = Offset(12.11f, 23.184f)
                )
            ) {
                moveTo(19.25f, 11.742f)
                lineTo(19.242f, 11.623f)
                lineTo(19.241f, 11.615f)
                curveTo(19.175f, 11.126f, 18.757f, 10.75f, 18.25f, 10.75f)
                curveTo(17.698f, 10.75f, 17.25f, 11.198f, 17.25f, 11.75f)
                verticalLineTo(12.248f)
                lineTo(17.246f, 12.459f)
                curveTo(17.136f, 15.123f, 14.941f, 17.25f, 12.25f, 17.25f)
                horizontalLineTo(11.753f)
                lineTo(11.541f, 17.246f)
                curveTo(8.877f, 17.136f, 6.75f, 14.941f, 6.75f, 12.25f)
                verticalLineTo(11.742f)
                lineTo(6.742f, 11.623f)
                lineTo(6.741f, 11.615f)
                curveTo(6.675f, 11.126f, 6.256f, 10.75f, 5.75f, 10.75f)
                curveTo(5.198f, 10.75f, 4.75f, 11.198f, 4.75f, 11.75f)
                lineTo(4.75f, 12.25f)
                lineTo(4.754f, 12.491f)
                lineTo(4.754f, 12.495f)
                curveTo(4.875f, 15.996f, 7.566f, 18.844f, 11f, 19.21f)
                lineTo(11f, 21.258f)
                lineTo(11.008f, 21.377f)
                lineTo(11.009f, 21.385f)
                curveTo(11.075f, 21.874f, 11.494f, 22.25f, 12f, 22.25f)
                curveTo(12.552f, 22.25f, 13f, 21.802f, 13f, 21.25f)
                lineTo(13.001f, 19.21f)
                curveTo(16.514f, 18.835f, 19.25f, 15.862f, 19.25f, 12.25f)
                verticalLineTo(11.742f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFFCC23D1)
                    ),
                    start = Offset(6f, -1.182f),
                    end = Offset(13.346f, 23.828f)
                )
            ) {
                moveTo(12f, 2f)
                curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
                verticalLineTo(12f)
                curveTo(16f, 14.209f, 14.209f, 16f, 12f, 16f)
                curveTo(9.791f, 16f, 8f, 14.209f, 8f, 12f)
                verticalLineTo(6f)
                curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Mic!!
    }

@Suppress("ObjectPropertyName")
private var _Mic: ImageVector? = null

@Preview
@Composable
private fun MicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Mic, contentDescription = null)
    }
}
