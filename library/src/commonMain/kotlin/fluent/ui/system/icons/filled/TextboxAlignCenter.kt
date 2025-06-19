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

public val FluentIcons.Filled.TextboxAlignCenter: ImageVector
    get() {
        if (_TextboxAlignCenter != null) {
            return _TextboxAlignCenter!!
        }
        _TextboxAlignCenter = ImageVector.Builder(
            name = "Filled.TextboxAlignCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 3f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(5.75f)
                close()
                moveTo(7.25f, 9f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 9f, 17.5f, 9.336f, 17.5f, 9.75f)
                curveTo(17.5f, 10.164f, 17.164f, 10.5f, 16.75f, 10.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 10.5f, 6.5f, 10.164f, 6.5f, 9.75f)
                curveTo(6.5f, 9.336f, 6.836f, 9f, 7.25f, 9f)
                close()
                moveTo(9.25f, 13f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 13f, 15.5f, 13.336f, 15.5f, 13.75f)
                curveTo(15.5f, 14.164f, 15.164f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 14.5f, 8.5f, 14.164f, 8.5f, 13.75f)
                curveTo(8.5f, 13.336f, 8.836f, 13f, 9.25f, 13f)
                close()
            }
        }.build()

        return _TextboxAlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _TextboxAlignCenter: ImageVector? = null

@Preview
@Composable
private fun TextboxAlignCenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextboxAlignCenter, contentDescription = null)
    }
}
