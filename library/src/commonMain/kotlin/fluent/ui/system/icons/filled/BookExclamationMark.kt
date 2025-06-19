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

public val FluentIcons.Filled.BookExclamationMark: ImageVector
    get() {
        if (_BookExclamationMark != null) {
            return _BookExclamationMark!!
        }
        _BookExclamationMark = ImageVector.Builder(
            name = "Filled.BookExclamationMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
                curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
                close()
                moveTo(11.5f, 11.75f)
                lineTo(11.5f, 6.75f)
                curveTo(11.5f, 6.336f, 11.836f, 6f, 12.25f, 6f)
                curveTo(12.664f, 6f, 13f, 6.336f, 13f, 6.75f)
                verticalLineTo(11.75f)
                curveTo(13f, 12.164f, 12.664f, 12.5f, 12.25f, 12.5f)
                curveTo(11.836f, 12.5f, 11.5f, 12.164f, 11.5f, 11.75f)
                close()
                moveTo(13.25f, 14.5f)
                curveTo(13.25f, 15.052f, 12.802f, 15.5f, 12.25f, 15.5f)
                curveTo(11.698f, 15.5f, 11.25f, 15.052f, 11.25f, 14.5f)
                curveTo(11.25f, 13.948f, 11.698f, 13.5f, 12.25f, 13.5f)
                curveTo(12.802f, 13.5f, 13.25f, 13.948f, 13.25f, 14.5f)
                close()
            }
        }.build()

        return _BookExclamationMark!!
    }

@Suppress("ObjectPropertyName")
private var _BookExclamationMark: ImageVector? = null

@Preview
@Composable
private fun BookExclamationMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookExclamationMark, contentDescription = null)
    }
}
