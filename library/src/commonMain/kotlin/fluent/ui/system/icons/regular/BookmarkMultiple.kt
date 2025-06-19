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

public val FluentIcons.Regular.BookmarkMultiple: ImageVector
    get() {
        if (_BookmarkMultiple != null) {
            return _BookmarkMultiple!!
        }
        _BookmarkMultiple = ImageVector.Builder(
            name = "Regular.BookmarkMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6.748f)
                curveTo(4f, 5.505f, 5.007f, 4.498f, 6.25f, 4.498f)
                horizontalLineTo(15.251f)
                curveTo(16.493f, 4.498f, 17.501f, 5.505f, 17.501f, 6.748f)
                verticalLineTo(21.25f)
                curveTo(17.501f, 21.518f, 17.357f, 21.767f, 17.124f, 21.9f)
                curveTo(16.891f, 22.034f, 16.605f, 22.033f, 16.373f, 21.898f)
                lineTo(10.75f, 18.618f)
                lineTo(5.128f, 21.898f)
                curveTo(4.896f, 22.033f, 4.609f, 22.034f, 4.376f, 21.9f)
                curveTo(4.144f, 21.767f, 4f, 21.518f, 4f, 21.25f)
                verticalLineTo(6.748f)
                close()
                moveTo(6.25f, 5.998f)
                curveTo(5.836f, 5.998f, 5.5f, 6.334f, 5.5f, 6.748f)
                verticalLineTo(19.944f)
                lineTo(10.373f, 17.102f)
                curveTo(10.606f, 16.965f, 10.895f, 16.965f, 11.128f, 17.102f)
                lineTo(16.001f, 19.944f)
                verticalLineTo(6.748f)
                curveTo(16.001f, 6.334f, 15.665f, 5.998f, 15.251f, 5.998f)
                horizontalLineTo(6.25f)
                close()
                moveTo(15.25f, 2f)
                curveTo(17.873f, 2f, 20f, 4.127f, 20f, 6.751f)
                verticalLineTo(18.623f)
                curveTo(20f, 19.037f, 19.664f, 19.373f, 19.25f, 19.373f)
                curveTo(18.836f, 19.373f, 18.5f, 19.037f, 18.5f, 18.623f)
                verticalLineTo(6.751f)
                curveTo(18.5f, 4.955f, 17.045f, 3.5f, 15.25f, 3.5f)
                horizontalLineTo(6.637f)
                curveTo(6.637f, 3.5f, 6.75f, 2.943f, 7.434f, 2.419f)
                curveTo(8f, 2f, 8.602f, 2f, 8.602f, 2f)
                horizontalLineTo(15.25f)
                close()
            }
        }.build()

        return _BookmarkMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkMultiple: ImageVector? = null

@Preview
@Composable
private fun BookmarkMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BookmarkMultiple, contentDescription = null)
    }
}
