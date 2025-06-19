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

public val FluentIcons.Colored.DataBarVerticalAscending: ImageVector
    get() {
        if (_DataBarVerticalAscending != null) {
            return _DataBarVerticalAscending!!
        }
        _DataBarVerticalAscending = ImageVector.Builder(
            name = "Colored.DataBarVerticalAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(19.908f, -2.529f),
                    end = Offset(31.994f, 3.112f)
                )
            ) {
                moveTo(20.5f, 5.25f)
                curveTo(20.5f, 4.007f, 19.493f, 3f, 18.25f, 3f)
                curveTo(17.007f, 3f, 16f, 4.007f, 16f, 5.25f)
                lineTo(16f, 18.75f)
                curveTo(16f, 19.993f, 17.007f, 21f, 18.25f, 21f)
                curveTo(19.493f, 21f, 20.5f, 19.993f, 20.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(9.934f, 3.58f),
                    end = Offset(20.859f, 10.018f)
                )
            ) {
                moveTo(14f, 9.25f)
                curveTo(14f, 8.007f, 12.993f, 7f, 11.75f, 7f)
                curveTo(10.507f, 7f, 9.5f, 8.007f, 9.5f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(9.5f, 19.993f, 10.507f, 21f, 11.75f, 21f)
                curveTo(12.993f, 21f, 14f, 19.993f, 14f, 18.75f)
                verticalLineTo(9.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(2.719f, 5.375f),
                    end = Offset(11.477f, 12.6f)
                )
            ) {
                moveTo(7.5f, 13.25f)
                curveTo(7.5f, 12.007f, 6.493f, 11f, 5.25f, 11f)
                curveTo(4.007f, 11f, 3f, 12.007f, 3f, 13.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
                curveTo(6.493f, 21f, 7.5f, 19.993f, 7.5f, 18.75f)
                verticalLineTo(13.25f)
                close()
            }
        }.build()

        return _DataBarVerticalAscending!!
    }

@Suppress("ObjectPropertyName")
private var _DataBarVerticalAscending: ImageVector? = null

@Preview
@Composable
private fun DataBarVerticalAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DataBarVerticalAscending, contentDescription = null)
    }
}
