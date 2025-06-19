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

public val FluentIcons.Regular.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) {
            return _ArrowDownRight!!
        }
        _ArrowDownRight = ImageVector.Builder(
            name = "Regular.ArrowDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.751f, 21.005f)
                curveTo(10.337f, 21.005f, 10.001f, 20.669f, 10.001f, 20.255f)
                curveTo(10.001f, 19.841f, 10.337f, 19.505f, 10.751f, 19.505f)
                horizontalLineTo(18.42f)
                lineTo(3.22f, 4.305f)
                curveTo(2.921f, 4.007f, 2.921f, 3.523f, 3.22f, 3.224f)
                curveTo(3.519f, 2.925f, 4.003f, 2.925f, 4.301f, 3.224f)
                lineTo(19.501f, 18.423f)
                verticalLineTo(10.755f)
                curveTo(19.501f, 10.341f, 19.837f, 10.005f, 20.251f, 10.005f)
                curveTo(20.665f, 10.005f, 21.001f, 10.341f, 21.001f, 10.755f)
                verticalLineTo(20.255f)
                curveTo(21.001f, 20.669f, 20.665f, 21.005f, 20.251f, 21.005f)
                horizontalLineTo(10.751f)
                close()
            }
        }.build()

        return _ArrowDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRight: ImageVector? = null

@Preview
@Composable
private fun ArrowDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowDownRight, contentDescription = null)
    }
}
