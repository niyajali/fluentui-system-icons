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

public val FluentIcons.Filled.TextAlignDistributed: ImageVector
    get() {
        if (_TextAlignDistributed != null) {
            return _TextAlignDistributed!!
        }
        _TextAlignDistributed = ImageVector.Builder(
            name = "Filled.TextAlignDistributed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.293f, 3.293f)
                curveTo(4.683f, 2.902f, 5.317f, 2.902f, 5.707f, 3.293f)
                curveTo(6.098f, 3.683f, 6.098f, 4.317f, 5.707f, 4.707f)
                lineTo(5.414f, 5f)
                lineTo(21f, 5f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
                horizontalLineTo(5.414f)
                lineTo(5.707f, 7.293f)
                curveTo(6.098f, 7.683f, 6.098f, 8.317f, 5.707f, 8.707f)
                curveTo(5.317f, 9.098f, 4.683f, 9.098f, 4.293f, 8.707f)
                lineTo(2.293f, 6.707f)
                curveTo(1.902f, 6.317f, 1.902f, 5.683f, 2.293f, 5.293f)
                lineTo(4.293f, 3.293f)
                close()
                moveTo(18.586f, 19f)
                lineTo(18.293f, 19.293f)
                curveTo(17.902f, 19.683f, 17.902f, 20.317f, 18.293f, 20.707f)
                curveTo(18.683f, 21.098f, 19.317f, 21.098f, 19.707f, 20.707f)
                lineTo(21.707f, 18.707f)
                curveTo(22.098f, 18.317f, 22.098f, 17.683f, 21.707f, 17.293f)
                lineTo(19.707f, 15.293f)
                curveTo(19.317f, 14.902f, 18.683f, 14.902f, 18.293f, 15.293f)
                curveTo(17.902f, 15.683f, 17.902f, 16.317f, 18.293f, 16.707f)
                lineTo(18.586f, 17f)
                horizontalLineTo(3f)
                curveTo(2.448f, 17f, 2f, 17.448f, 2f, 18f)
                curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
                horizontalLineTo(18.586f)
                close()
                moveTo(3f, 11f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                horizontalLineTo(21f)
                curveTo(21.552f, 13f, 22f, 12.552f, 22f, 12f)
                curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TextAlignDistributed!!
    }

@Suppress("ObjectPropertyName")
private var _TextAlignDistributed: ImageVector? = null

@Preview
@Composable
private fun TextAlignDistributedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextAlignDistributed, contentDescription = null)
    }
}
