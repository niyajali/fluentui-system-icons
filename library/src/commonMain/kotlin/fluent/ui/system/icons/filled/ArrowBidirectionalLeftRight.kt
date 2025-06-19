package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.ArrowBidirectionalLeftRight: ImageVector
    get() {
        if (_ArrowBidirectionalLeftRight != null) {
            return _ArrowBidirectionalLeftRight!!
        }
        _ArrowBidirectionalLeftRight = ImageVector.Builder(
            name = "Filled.ArrowBidirectionalLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.457f, 6.543f)
                curveTo(9.848f, 6.933f, 9.848f, 7.567f, 9.457f, 7.957f)
                lineTo(6.414f, 11f)
                horizontalLineTo(17.586f)
                lineTo(14.543f, 7.957f)
                curveTo(14.152f, 7.567f, 14.152f, 6.933f, 14.543f, 6.543f)
                curveTo(14.933f, 6.152f, 15.567f, 6.152f, 15.957f, 6.543f)
                lineTo(20.707f, 11.293f)
                curveTo(21.098f, 11.683f, 21.098f, 12.317f, 20.707f, 12.707f)
                lineTo(15.957f, 17.457f)
                curveTo(15.567f, 17.848f, 14.933f, 17.848f, 14.543f, 17.457f)
                curveTo(14.152f, 17.067f, 14.152f, 16.433f, 14.543f, 16.043f)
                lineTo(17.586f, 13f)
                horizontalLineTo(6.414f)
                lineTo(9.457f, 16.043f)
                curveTo(9.848f, 16.433f, 9.848f, 17.067f, 9.457f, 17.457f)
                curveTo(9.067f, 17.848f, 8.433f, 17.848f, 8.043f, 17.457f)
                lineTo(3.293f, 12.707f)
                curveTo(2.902f, 12.317f, 2.902f, 11.683f, 3.293f, 11.293f)
                lineTo(8.043f, 6.543f)
                curveTo(8.433f, 6.152f, 9.067f, 6.152f, 9.457f, 6.543f)
                close()
            }
        }.build()

        return _ArrowBidirectionalLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBidirectionalLeftRight: ImageVector? = null

@Preview
@Composable
private fun ArrowBidirectionalLeftRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowBidirectionalLeftRight, contentDescription = null)
    }
}
