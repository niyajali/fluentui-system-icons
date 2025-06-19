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

public val FluentIcons.Regular.PhonePageHeader: ImageVector
    get() {
        if (_PhonePageHeader != null) {
            return _PhonePageHeader!!
        }
        _PhonePageHeader = ImageVector.Builder(
            name = "Regular.PhonePageHeader",
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
                moveTo(16.5f, 5.005f)
                horizontalLineTo(7.5f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
                verticalLineTo(5.005f)
                close()
            }
        }.build()

        return _PhonePageHeader!!
    }

@Suppress("ObjectPropertyName")
private var _PhonePageHeader: ImageVector? = null

@Preview
@Composable
private fun PhonePageHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhonePageHeader, contentDescription = null)
    }
}
