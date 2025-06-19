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

public val FluentIcons.Regular.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Regular.Filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.5f, 16f)
                curveTo(13.914f, 16f, 14.25f, 16.336f, 14.25f, 16.75f)
                curveTo(14.25f, 17.164f, 13.914f, 17.5f, 13.5f, 17.5f)
                horizontalLineTo(10.5f)
                curveTo(10.086f, 17.5f, 9.75f, 17.164f, 9.75f, 16.75f)
                curveTo(9.75f, 16.336f, 10.086f, 16f, 10.5f, 16f)
                horizontalLineTo(13.5f)
                close()
                moveTo(16.5f, 11f)
                curveTo(16.914f, 11f, 17.25f, 11.336f, 17.25f, 11.75f)
                curveTo(17.25f, 12.164f, 16.914f, 12.5f, 16.5f, 12.5f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 12.5f, 6.75f, 12.164f, 6.75f, 11.75f)
                curveTo(6.75f, 11.336f, 7.086f, 11f, 7.5f, 11f)
                horizontalLineTo(16.5f)
                close()
                moveTo(19.5f, 6f)
                curveTo(19.914f, 6f, 20.25f, 6.336f, 20.25f, 6.75f)
                curveTo(20.25f, 7.164f, 19.914f, 7.5f, 19.5f, 7.5f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 7.5f, 3.75f, 7.164f, 3.75f, 6.75f)
                curveTo(3.75f, 6.336f, 4.086f, 6f, 4.5f, 6f)
                horizontalLineTo(19.5f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null

@Preview
@Composable
private fun FilterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Filter, contentDescription = null)
    }
}
