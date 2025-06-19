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

public val FluentIcons.Colored.ContactCard: ImageVector
    get() {
        if (_ContactCard != null) {
            return _ContactCard!!
        }
        _ContactCard = ImageVector.Builder(
            name = "Colored.ContactCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3E0FF),
                        1f to Color(0xFF8CD0FF)
                    ),
                    start = Offset(9.143f, 4f),
                    end = Offset(14.312f, 19.95f)
                )
            ) {
                moveTo(19.75f, 4f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(22f, 18.997f, 20.993f, 20.005f, 19.75f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.447f to Color(0x00FF6CE8),
                        1f to Color(0xFFFF6CE8)
                    ),
                    start = Offset(15.095f, 5.965f),
                    end = Offset(19.486f, 28.797f)
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(19.75f, 4f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(22f, 18.997f, 20.993f, 20.005f, 19.75f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0078D4),
                        1f to Color(0xFF0067BF)
                    ),
                    start = Offset(14.956f, 8.924f),
                    end = Offset(17.097f, 18.686f)
                )
            ) {
                moveTo(13.252f, 12.996f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 12.996f, 18.5f, 13.332f, 18.5f, 13.746f)
                curveTo(18.5f, 14.126f, 18.218f, 14.44f, 17.852f, 14.489f)
                lineTo(17.75f, 14.496f)
                horizontalLineTo(13.252f)
                curveTo(12.838f, 14.496f, 12.502f, 14.16f, 12.502f, 13.746f)
                curveTo(12.502f, 13.366f, 12.785f, 13.053f, 13.151f, 13.003f)
                lineTo(13.252f, 12.996f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.252f)
                close()
                moveTo(13.252f, 9.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 9.5f, 18.5f, 9.836f, 18.5f, 10.25f)
                curveTo(18.5f, 10.63f, 18.218f, 10.943f, 17.852f, 10.993f)
                lineTo(17.75f, 11f)
                horizontalLineTo(13.252f)
                curveTo(12.838f, 11f, 12.502f, 10.664f, 12.502f, 10.25f)
                curveTo(12.502f, 9.87f, 12.785f, 9.557f, 13.151f, 9.507f)
                lineTo(13.252f, 9.5f)
                horizontalLineTo(17.75f)
                horizontalLineTo(13.252f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(5.5f, 10.678f),
                    end = Offset(6.693f, 15.92f)
                )
            ) {
                moveTo(9.75f, 12.5f)
                curveTo(10.164f, 12.5f, 10.5f, 12.836f, 10.5f, 13.25f)
                verticalLineTo(13.743f)
                lineTo(10.492f, 13.851f)
                curveTo(10.329f, 14.964f, 9.398f, 15.501f, 8f, 15.501f)
                curveTo(6.602f, 15.501f, 5.67f, 14.964f, 5.508f, 13.85f)
                lineTo(5.5f, 13.742f)
                verticalLineTo(13.25f)
                curveTo(5.5f, 12.836f, 5.836f, 12.5f, 6.25f, 12.5f)
                horizontalLineTo(9.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(6.5f, 7.502f),
                    end = Offset(8.742f, 11.342f)
                )
            ) {
                moveTo(8f, 8.502f)
                curveTo(8.828f, 8.502f, 9.5f, 9.174f, 9.5f, 10.002f)
                curveTo(9.5f, 10.831f, 8.828f, 11.502f, 8f, 11.502f)
                curveTo(7.172f, 11.502f, 6.5f, 10.831f, 6.5f, 10.002f)
                curveTo(6.5f, 9.174f, 7.172f, 8.502f, 8f, 8.502f)
                close()
            }
        }.build()

        return _ContactCard!!
    }

@Suppress("ObjectPropertyName")
private var _ContactCard: ImageVector? = null

@Preview
@Composable
private fun ContactCardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ContactCard, contentDescription = null)
    }
}
