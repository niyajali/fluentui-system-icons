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

public val FluentIcons.Colored.DocumentText: ImageVector
    get() {
        if (_DocumentText != null) {
            return _DocumentText!!
        }
        _DocumentText = ImageVector.Builder(
            name = "Colored.DocumentText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF6CE0FF),
                        1f to Color(0xFF4894FE)
                    ),
                    start = Offset(15.2f, 2f),
                    end = Offset(16.822f, 18.87f)
                )
            ) {
                moveTo(6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(9f)
                lineTo(15f, 7f)
                lineTo(13f, 2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.362f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(20.667f, 2.625f),
                    radius = 12.562f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(9f)
                lineTo(15f, 7f)
                lineTo(13f, 2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9FF0F9),
                        1f to Color(0xFFB3E0FF)
                    ),
                    start = Offset(16.488f, 4.917f),
                    end = Offset(14.738f, 7.833f)
                )
            ) {
                moveTo(13f, 7.5f)
                verticalLineTo(2f)
                lineTo(20f, 9f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 9f, 13f, 8.328f, 13f, 7.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF9DEAFF),
                        1f to Color(0xFFFFFFFF)
                    ),
                    start = Offset(16f, 21.3f),
                    end = Offset(8.196f, 8.58f)
                ),
                fillAlpha = 0.9f,
            ) {
                moveTo(8.75f, 11.5f)
                curveTo(8.336f, 11.5f, 8f, 11.836f, 8f, 12.25f)
                curveTo(8f, 12.664f, 8.336f, 13f, 8.75f, 13f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 13f, 16f, 12.664f, 16f, 12.25f)
                curveTo(16f, 11.836f, 15.664f, 11.5f, 15.25f, 11.5f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.75f, 14.25f)
                curveTo(8.336f, 14.25f, 8f, 14.586f, 8f, 15f)
                curveTo(8f, 15.414f, 8.336f, 15.75f, 8.75f, 15.75f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 15.75f, 16f, 15.414f, 16f, 15f)
                curveTo(16f, 14.586f, 15.664f, 14.25f, 15.25f, 14.25f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.75f, 17f)
                curveTo(8.336f, 17f, 8f, 17.336f, 8f, 17.75f)
                curveTo(8f, 18.164f, 8.336f, 18.5f, 8.75f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 18.5f, 16f, 18.164f, 16f, 17.75f)
                curveTo(16f, 17.336f, 15.664f, 17f, 15.25f, 17f)
                horizontalLineTo(8.75f)
                close()
            }
        }.build()

        return _DocumentText!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentText: ImageVector? = null

@Preview
@Composable
private fun DocumentTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DocumentText, contentDescription = null)
    }
}
