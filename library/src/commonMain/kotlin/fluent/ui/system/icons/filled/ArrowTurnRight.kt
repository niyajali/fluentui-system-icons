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

public val FluentIcons.Filled.ArrowTurnRight: ImageVector
    get() {
        if (_ArrowTurnRight != null) {
            return _ArrowTurnRight!!
        }
        _ArrowTurnRight = ImageVector.Builder(
            name = "Filled.ArrowTurnRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.458f, 3.293f)
                curveTo(16.068f, 2.902f, 15.435f, 2.902f, 15.044f, 3.293f)
                curveTo(14.654f, 3.683f, 14.654f, 4.317f, 15.044f, 4.707f)
                lineTo(17.337f, 7f)
                horizontalLineTo(10.5f)
                curveTo(8.015f, 7f, 6f, 9.015f, 6f, 11.5f)
                verticalLineTo(20f)
                curveTo(6f, 20.552f, 6.448f, 21f, 7f, 21f)
                curveTo(7.552f, 21f, 8f, 20.552f, 8f, 20f)
                verticalLineTo(11.5f)
                curveTo(8f, 10.119f, 9.119f, 9f, 10.5f, 9f)
                horizontalLineTo(17.835f)
                lineTo(15.043f, 11.792f)
                curveTo(14.652f, 12.182f, 14.652f, 12.815f, 15.043f, 13.206f)
                curveTo(15.433f, 13.596f, 16.066f, 13.596f, 16.457f, 13.206f)
                lineTo(20.707f, 8.957f)
                curveTo(20.895f, 8.769f, 21f, 8.515f, 21f, 8.25f)
                curveTo(21f, 7.985f, 20.895f, 7.73f, 20.708f, 7.543f)
                lineTo(16.458f, 3.293f)
                close()
            }
        }.build()

        return _ArrowTurnRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnRight: ImageVector? = null

@Preview
@Composable
private fun ArrowTurnRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTurnRight, contentDescription = null)
    }
}
