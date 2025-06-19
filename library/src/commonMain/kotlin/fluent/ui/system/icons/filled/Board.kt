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

public val FluentIcons.Filled.Board: ImageVector
    get() {
        if (_Board != null) {
            return _Board!!
        }
        _Board = ImageVector.Builder(
            name = "Filled.Board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.499f, 9.499f)
                lineTo(11.5f, 21.001f)
                lineTo(6.25f, 21.002f)
                curveTo(4.517f, 21.002f, 3.101f, 19.645f, 3.005f, 17.936f)
                lineTo(3f, 17.752f)
                verticalLineTo(9.499f)
                horizontalLineTo(11.499f)
                close()
                moveTo(12.999f, 15.499f)
                horizontalLineTo(21.5f)
                lineTo(21.501f, 17.752f)
                curveTo(21.501f, 19.547f, 20.046f, 21.002f, 18.251f, 21.002f)
                lineTo(13f, 21.001f)
                lineTo(12.999f, 15.499f)
                close()
                moveTo(18.251f, 2.498f)
                curveTo(19.984f, 2.498f, 21.401f, 3.854f, 21.496f, 5.564f)
                lineTo(21.501f, 5.748f)
                lineTo(21.5f, 13.999f)
                horizontalLineTo(12.999f)
                lineTo(13f, 2.498f)
                horizontalLineTo(18.251f)
                close()
                moveTo(11.5f, 2.498f)
                lineTo(11.499f, 7.999f)
                horizontalLineTo(3f)
                lineTo(3.001f, 5.748f)
                curveTo(3.001f, 3.953f, 4.456f, 2.498f, 6.251f, 2.498f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _Board!!
    }

@Suppress("ObjectPropertyName")
private var _Board: ImageVector? = null

@Preview
@Composable
private fun BoardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Board, contentDescription = null)
    }
}
