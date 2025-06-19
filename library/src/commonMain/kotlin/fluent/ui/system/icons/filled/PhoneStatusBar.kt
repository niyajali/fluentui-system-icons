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

public val FluentIcons.Filled.PhoneStatusBar: ImageVector
    get() {
        if (_PhoneStatusBar != null) {
            return _PhoneStatusBar!!
        }
        _PhoneStatusBar = ImageVector.Builder(
            name = "Filled.PhoneStatusBar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.75f, 2f)
                curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
                horizontalLineTo(15.75f)
                close()
                moveTo(14.75f, 4.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 4.5f, 8.5f, 4.836f, 8.5f, 5.25f)
                curveTo(8.5f, 5.63f, 8.782f, 5.943f, 9.148f, 5.993f)
                lineTo(9.25f, 6f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 6f, 15.5f, 5.664f, 15.5f, 5.25f)
                curveTo(15.5f, 4.87f, 15.218f, 4.557f, 14.852f, 4.507f)
                lineTo(14.75f, 4.5f)
                close()
            }
        }.build()

        return _PhoneStatusBar!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneStatusBar: ImageVector? = null

@Preview
@Composable
private fun PhoneStatusBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneStatusBar, contentDescription = null)
    }
}
