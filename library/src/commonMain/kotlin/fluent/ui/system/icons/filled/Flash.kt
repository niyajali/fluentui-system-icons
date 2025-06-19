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

public val FluentIcons.Filled.Flash: ImageVector
    get() {
        if (_Flash != null) {
            return _Flash!!
        }
        _Flash = ImageVector.Builder(
            name = "Filled.Flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.425f, 2.831f)
                curveTo(7.602f, 2.333f, 8.074f, 2f, 8.603f, 2f)
                horizontalLineTo(15.056f)
                curveTo(15.909f, 2f, 16.512f, 2.836f, 16.242f, 3.645f)
                lineTo(14.79f, 8f)
                horizontalLineTo(18.749f)
                curveTo(19.853f, 8f, 20.415f, 9.327f, 19.647f, 10.12f)
                lineTo(8.586f, 21.536f)
                curveTo(7.532f, 22.624f, 5.714f, 21.642f, 6.045f, 20.164f)
                lineTo(7.314f, 14.496f)
                lineTo(5.746f, 14.49f)
                curveTo(4.539f, 14.486f, 3.699f, 13.29f, 4.104f, 12.153f)
                lineTo(7.425f, 2.831f)
                close()
            }
        }.build()

        return _Flash!!
    }

@Suppress("ObjectPropertyName")
private var _Flash: ImageVector? = null

@Preview
@Composable
private fun FlashPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Flash, contentDescription = null)
    }
}
