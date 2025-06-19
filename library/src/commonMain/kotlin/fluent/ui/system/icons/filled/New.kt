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

public val FluentIcons.Filled.New: ImageVector
    get() {
        if (_New != null) {
            return _New!!
        }
        _New = ImageVector.Builder(
            name = "Filled.New",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 4f)
                curveTo(18.552f, 4f, 19f, 4.448f, 19f, 5f)
                verticalLineTo(13f)
                curveTo(19f, 13.552f, 18.552f, 14f, 18f, 14f)
                curveTo(17.448f, 14f, 17f, 13.552f, 17f, 13f)
                verticalLineTo(5f)
                curveTo(17f, 4.448f, 17.448f, 4f, 18f, 4f)
                close()
                moveTo(4f, 18f)
                curveTo(4f, 17.448f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(13f)
                curveTo(13.552f, 17f, 14f, 17.448f, 14f, 18f)
                curveTo(14f, 18.552f, 13.552f, 19f, 13f, 19f)
                horizontalLineTo(5f)
                curveTo(4.448f, 19f, 4f, 18.552f, 4f, 18f)
                close()
                moveTo(7.707f, 6.293f)
                curveTo(7.317f, 5.902f, 6.683f, 5.902f, 6.293f, 6.293f)
                curveTo(5.902f, 6.683f, 5.902f, 7.317f, 6.293f, 7.707f)
                lineTo(13.293f, 14.707f)
                curveTo(13.683f, 15.098f, 14.317f, 15.098f, 14.707f, 14.707f)
                curveTo(15.098f, 14.317f, 15.098f, 13.683f, 14.707f, 13.293f)
                lineTo(7.707f, 6.293f)
                close()
            }
        }.build()

        return _New!!
    }

@Suppress("ObjectPropertyName")
private var _New: ImageVector? = null

@Preview
@Composable
private fun NewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.New, contentDescription = null)
    }
}
