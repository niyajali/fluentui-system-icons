package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.LineHorizontal3: ImageVector
    get() {
        if (_LineHorizontal3 != null) {
            return _LineHorizontal3!!
        }
        _LineHorizontal3 = ImageVector.Builder(
            name = "Regular.LineHorizontal3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.753f, 18f)
                horizontalLineTo(21.253f)
                curveTo(21.667f, 18f, 22.003f, 18.336f, 22.003f, 18.75f)
                curveTo(22.003f, 19.129f, 21.721f, 19.443f, 21.355f, 19.493f)
                lineTo(21.253f, 19.5f)
                horizontalLineTo(2.753f)
                curveTo(2.339f, 19.5f, 2.003f, 19.164f, 2.003f, 18.75f)
                curveTo(2.003f, 18.37f, 2.285f, 18.056f, 2.651f, 18.007f)
                lineTo(2.753f, 18f)
                horizontalLineTo(21.253f)
                horizontalLineTo(2.753f)
                close()
                moveTo(2.753f, 11.503f)
                horizontalLineTo(21.253f)
                curveTo(21.667f, 11.503f, 22.003f, 11.839f, 22.003f, 12.253f)
                curveTo(22.003f, 12.632f, 21.721f, 12.946f, 21.355f, 12.996f)
                lineTo(21.253f, 13.003f)
                horizontalLineTo(2.753f)
                curveTo(2.339f, 13.003f, 2.003f, 12.667f, 2.003f, 12.253f)
                curveTo(2.003f, 11.873f, 2.285f, 11.559f, 2.651f, 11.509f)
                lineTo(2.753f, 11.503f)
                horizontalLineTo(21.253f)
                horizontalLineTo(2.753f)
                close()
                moveTo(2.752f, 5.003f)
                horizontalLineTo(21.252f)
                curveTo(21.666f, 5.003f, 22.002f, 5.339f, 22.002f, 5.753f)
                curveTo(22.002f, 6.133f, 21.72f, 6.446f, 21.354f, 6.496f)
                lineTo(21.252f, 6.503f)
                horizontalLineTo(2.752f)
                curveTo(2.338f, 6.503f, 2.002f, 6.167f, 2.002f, 5.753f)
                curveTo(2.002f, 5.373f, 2.284f, 5.059f, 2.65f, 5.01f)
                lineTo(2.752f, 5.003f)
                horizontalLineTo(21.252f)
                horizontalLineTo(2.752f)
                close()
            }
        }.build()

        return _LineHorizontal3!!
    }

@Suppress("ObjectPropertyName")
private var _LineHorizontal3: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineHorizontal3, contentDescription = null)
    }
}
