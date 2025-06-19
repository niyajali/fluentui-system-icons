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

public val FluentIcons.Colored.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) {
            return _LockClosed!!
        }
        _LockClosed = ImageVector.Builder(
            name = "Colored.LockClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC205),
                        1f to Color(0xFFFB5937)
                    ),
                    start = Offset(9.714f, 0.949f),
                    end = Offset(15.835f, 11.057f)
                )
            ) {
                moveTo(12f, 2f)
                curveTo(9.791f, 2f, 8f, 3.791f, 8f, 6f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(6f)
                curveTo(9.5f, 4.619f, 10.619f, 3.5f, 12f, 3.5f)
                curveTo(13.381f, 3.5f, 14.5f, 4.619f, 14.5f, 6f)
                verticalLineTo(7.5f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(21.143f, 21.875f),
                    end = Offset(6.542f, 8.278f)
                )
            ) {
                moveTo(20f, 10.25f)
                curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
                horizontalLineTo(7.25f)
                curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
                verticalLineTo(17.75f)
                curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 21f, 20f, 19.545f, 20f, 17.75f)
                verticalLineTo(10.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF944600),
                        1f to Color(0xFFCD8E02)
                    ),
                    center = Offset(12.75f, 15.5f),
                    radius = 5.46f
                )
            ) {
                moveTo(12f, 15.5f)
                curveTo(12.828f, 15.5f, 13.5f, 14.828f, 13.5f, 14f)
                curveTo(13.5f, 13.172f, 12.828f, 12.5f, 12f, 12.5f)
                curveTo(11.172f, 12.5f, 10.5f, 13.172f, 10.5f, 14f)
                curveTo(10.5f, 14.828f, 11.172f, 15.5f, 12f, 15.5f)
                close()
            }
        }.build()

        return _LockClosed!!
    }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null

@Preview
@Composable
private fun LockClosedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.LockClosed, contentDescription = null)
    }
}
