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

public val FluentIcons.Filled.TextPercent: ImageVector
    get() {
        if (_TextPercent != null) {
            return _TextPercent!!
        }
        _TextPercent = ImageVector.Builder(
            name = "Filled.TextPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.956f, 3.171f)
                curveTo(18.413f, 3.48f, 18.534f, 4.101f, 18.226f, 4.559f)
                lineTo(7.433f, 20.559f)
                curveTo(7.125f, 21.017f, 6.503f, 21.138f, 6.045f, 20.829f)
                curveTo(5.587f, 20.52f, 5.466f, 19.899f, 5.775f, 19.441f)
                lineTo(16.567f, 3.441f)
                curveTo(16.876f, 2.983f, 17.498f, 2.862f, 17.956f, 3.171f)
                close()
                moveTo(6.5f, 5f)
                curveTo(5.395f, 5f, 4.5f, 5.895f, 4.5f, 7f)
                curveTo(4.5f, 8.105f, 5.395f, 9f, 6.5f, 9f)
                curveTo(7.605f, 9f, 8.5f, 8.105f, 8.5f, 7f)
                curveTo(8.5f, 5.895f, 7.605f, 5f, 6.5f, 5f)
                close()
                moveTo(2.5f, 7f)
                curveTo(2.5f, 4.791f, 4.291f, 3f, 6.5f, 3f)
                curveTo(8.709f, 3f, 10.5f, 4.791f, 10.5f, 7f)
                curveTo(10.5f, 9.209f, 8.709f, 11f, 6.5f, 11f)
                curveTo(4.291f, 11f, 2.5f, 9.209f, 2.5f, 7f)
                close()
                moveTo(15.5f, 17f)
                curveTo(15.5f, 15.895f, 16.395f, 15f, 17.5f, 15f)
                curveTo(18.605f, 15f, 19.5f, 15.895f, 19.5f, 17f)
                curveTo(19.5f, 18.105f, 18.605f, 19f, 17.5f, 19f)
                curveTo(16.395f, 19f, 15.5f, 18.105f, 15.5f, 17f)
                close()
                moveTo(17.5f, 13f)
                curveTo(15.291f, 13f, 13.5f, 14.791f, 13.5f, 17f)
                curveTo(13.5f, 19.209f, 15.291f, 21f, 17.5f, 21f)
                curveTo(19.709f, 21f, 21.5f, 19.209f, 21.5f, 17f)
                curveTo(21.5f, 14.791f, 19.709f, 13f, 17.5f, 13f)
                close()
            }
        }.build()

        return _TextPercent!!
    }

@Suppress("ObjectPropertyName")
private var _TextPercent: ImageVector? = null

@Preview
@Composable
private fun TextPercentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextPercent, contentDescription = null)
    }
}
