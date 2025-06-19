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

public val FluentIcons.Filled.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "Filled.ArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.295f, 19.715f)
                curveTo(10.688f, 20.103f, 11.321f, 20.098f, 11.709f, 19.705f)
                curveTo(12.097f, 19.311f, 12.092f, 18.678f, 11.699f, 18.291f)
                lineTo(6.328f, 12.999f)
                horizontalLineTo(20f)
                curveTo(20.552f, 12.999f, 21f, 12.551f, 21f, 11.999f)
                curveTo(21f, 11.447f, 20.552f, 10.999f, 20f, 10.999f)
                horizontalLineTo(6.335f)
                lineTo(11.699f, 5.714f)
                curveTo(12.092f, 5.327f, 12.097f, 4.694f, 11.709f, 4.3f)
                curveTo(11.321f, 3.907f, 10.688f, 3.902f, 10.295f, 4.29f)
                lineTo(3.371f, 11.112f)
                curveTo(2.874f, 11.602f, 2.874f, 12.403f, 3.371f, 12.893f)
                lineTo(10.295f, 19.715f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null

@Preview
@Composable
private fun ArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowLeft, contentDescription = null)
    }
}
