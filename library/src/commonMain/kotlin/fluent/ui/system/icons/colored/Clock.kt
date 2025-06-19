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

public val FluentIcons.Colored.Clock: ImageVector
    get() {
        if (_Clock != null) {
            return _Clock!!
        }
        _Clock = ImageVector.Builder(
            name = "Colored.Clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1EC8B0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(5.333f, 0.889f),
                    end = Offset(15.333f, 23.111f)
                )
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFD1D1FF)
                    ),
                    start = Offset(10.981f, 7.148f),
                    end = Offset(9.01f, 13.094f)
                )
            ) {
                moveTo(11.993f, 6.648f)
                curveTo(11.943f, 6.282f, 11.63f, 6f, 11.25f, 6f)
                curveTo(10.836f, 6f, 10.5f, 6.336f, 10.5f, 6.75f)
                verticalLineTo(12.75f)
                lineTo(10.507f, 12.852f)
                curveTo(10.557f, 13.218f, 10.87f, 13.5f, 11.25f, 13.5f)
                horizontalLineTo(15.25f)
                lineTo(15.352f, 13.493f)
                curveTo(15.718f, 13.443f, 16f, 13.13f, 16f, 12.75f)
                curveTo(16f, 12.336f, 15.664f, 12f, 15.25f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(6.75f)
                lineTo(11.993f, 6.648f)
                close()
            }
        }.build()

        return _Clock!!
    }

@Suppress("ObjectPropertyName")
private var _Clock: ImageVector? = null

@Preview
@Composable
private fun ClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Clock, contentDescription = null)
    }
}
