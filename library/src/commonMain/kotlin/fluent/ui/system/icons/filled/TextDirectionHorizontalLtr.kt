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

public val FluentIcons.Filled.TextDirectionHorizontalLtr: ImageVector
    get() {
        if (_TextDirectionHorizontalLtr != null) {
            return _TextDirectionHorizontalLtr!!
        }
        _TextDirectionHorizontalLtr = ImageVector.Builder(
            name = "Filled.TextDirectionHorizontalLtr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 3f)
                curveTo(8.154f, 3f, 8.518f, 3.243f, 8.673f, 3.615f)
                lineTo(12.423f, 12.615f)
                curveTo(12.636f, 13.125f, 12.395f, 13.711f, 11.885f, 13.923f)
                curveTo(11.375f, 14.135f, 10.79f, 13.894f, 10.577f, 13.385f)
                lineTo(9.584f, 11f)
                horizontalLineTo(5.917f)
                lineTo(4.923f, 13.385f)
                curveTo(4.711f, 13.894f, 4.125f, 14.135f, 3.616f, 13.923f)
                curveTo(3.106f, 13.711f, 2.865f, 13.125f, 3.077f, 12.615f)
                lineTo(6.827f, 3.615f)
                curveTo(6.982f, 3.243f, 7.347f, 3f, 7.75f, 3f)
                close()
                moveTo(7.75f, 6.6f)
                lineTo(6.75f, 9f)
                horizontalLineTo(8.75f)
                lineTo(7.75f, 6.6f)
                close()
                moveTo(17.293f, 5.293f)
                curveTo(17.684f, 4.902f, 18.317f, 4.902f, 18.707f, 5.293f)
                lineTo(20.634f, 7.227f)
                curveTo(20.857f, 7.409f, 20.999f, 7.687f, 21f, 7.997f)
                lineTo(21f, 8f)
                lineTo(21f, 8.003f)
                curveTo(20.999f, 8.313f, 20.857f, 8.591f, 20.634f, 8.773f)
                lineTo(18.707f, 10.707f)
                curveTo(18.317f, 11.098f, 17.684f, 11.098f, 17.293f, 10.707f)
                curveTo(16.903f, 10.317f, 16.903f, 9.683f, 17.293f, 9.293f)
                lineTo(17.586f, 9f)
                horizontalLineTo(13f)
                curveTo(12.448f, 9f, 12f, 8.552f, 12f, 8f)
                curveTo(12f, 7.448f, 12.448f, 7f, 13f, 7f)
                horizontalLineTo(17.586f)
                lineTo(17.293f, 6.707f)
                curveTo(16.903f, 6.317f, 16.903f, 5.683f, 17.293f, 5.293f)
                close()
                moveTo(18.707f, 14.293f)
                curveTo(18.317f, 13.902f, 17.684f, 13.902f, 17.293f, 14.293f)
                curveTo(16.903f, 14.683f, 16.903f, 15.317f, 17.293f, 15.707f)
                lineTo(17.586f, 16f)
                horizontalLineTo(4f)
                curveTo(3.448f, 16f, 3f, 16.448f, 3f, 17f)
                curveTo(3f, 17.552f, 3.448f, 18f, 4f, 18f)
                horizontalLineTo(17.586f)
                lineTo(17.293f, 18.293f)
                curveTo(16.903f, 18.683f, 16.903f, 19.317f, 17.293f, 19.707f)
                curveTo(17.684f, 20.098f, 18.317f, 20.098f, 18.707f, 19.707f)
                lineTo(20.707f, 17.707f)
                curveTo(21.098f, 17.317f, 21.098f, 16.683f, 20.707f, 16.293f)
                lineTo(18.707f, 14.293f)
                close()
            }
        }.build()

        return _TextDirectionHorizontalLtr!!
    }

@Suppress("ObjectPropertyName")
private var _TextDirectionHorizontalLtr: ImageVector? = null

@Preview
@Composable
private fun TextDirectionHorizontalLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionHorizontalLtr, contentDescription = null)
    }
}
