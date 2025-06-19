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

public val FluentIcons.Regular.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "Regular.ArrowUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.751f, 3f)
                curveTo(10.337f, 3f, 10.001f, 3.336f, 10.001f, 3.75f)
                curveTo(10.001f, 4.164f, 10.337f, 4.5f, 10.751f, 4.5f)
                horizontalLineTo(18.42f)
                lineTo(3.22f, 19.7f)
                curveTo(2.921f, 19.998f, 2.921f, 20.482f, 3.22f, 20.781f)
                curveTo(3.519f, 21.08f, 4.003f, 21.08f, 4.301f, 20.781f)
                lineTo(19.501f, 5.582f)
                verticalLineTo(13.25f)
                curveTo(19.501f, 13.664f, 19.837f, 14f, 20.251f, 14f)
                curveTo(20.665f, 14f, 21.001f, 13.664f, 21.001f, 13.25f)
                verticalLineTo(3.75f)
                curveTo(21.001f, 3.336f, 20.665f, 3f, 20.251f, 3f)
                horizontalLineTo(10.751f)
                close()
            }
        }.build()

        return _ArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRight: ImageVector? = null

@Preview
@Composable
private fun ArrowUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowUpRight, contentDescription = null)
    }
}
