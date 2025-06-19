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

public val FluentIcons.Filled.TabDesktop: ImageVector
    get() {
        if (_TabDesktop != null) {
            return _TabDesktop!!
        }
        _TabDesktop = ImageVector.Builder(
            name = "Filled.TabDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 19.657f, 4.343f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(13.25f)
                curveTo(12.007f, 8f, 11f, 6.993f, 11f, 5.75f)
                verticalLineTo(3f)
                close()
                moveTo(21f, 6.5f)
                verticalLineTo(6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.164f, 12.836f, 6.5f, 13.25f, 6.5f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _TabDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktop: ImageVector? = null

@Preview
@Composable
private fun TabDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktop, contentDescription = null)
    }
}
