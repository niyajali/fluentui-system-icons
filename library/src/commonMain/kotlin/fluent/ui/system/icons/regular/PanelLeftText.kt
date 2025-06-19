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

public val FluentIcons.Regular.PanelLeftText: ImageVector
    get() {
        if (_PanelLeftText != null) {
            return _PanelLeftText!!
        }
        _PanelLeftText = ImageVector.Builder(
            name = "Regular.PanelLeftText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 8.5f)
                curveTo(4.75f, 8.086f, 5.086f, 7.75f, 5.5f, 7.75f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 7.75f, 7.5f, 8.086f, 7.5f, 8.5f)
                curveTo(7.5f, 8.914f, 7.164f, 9.25f, 6.75f, 9.25f)
                horizontalLineTo(5.5f)
                curveTo(5.086f, 9.25f, 4.75f, 8.914f, 4.75f, 8.5f)
                close()
                moveTo(4.75f, 12f)
                curveTo(4.75f, 11.586f, 5.086f, 11.25f, 5.5f, 11.25f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 11.25f, 7.5f, 11.586f, 7.5f, 12f)
                curveTo(7.5f, 12.414f, 7.164f, 12.75f, 6.75f, 12.75f)
                horizontalLineTo(5.5f)
                curveTo(5.086f, 12.75f, 4.75f, 12.414f, 4.75f, 12f)
                close()
                moveTo(4.75f, 15.5f)
                curveTo(4.75f, 15.086f, 5.086f, 14.75f, 5.5f, 14.75f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 14.75f, 7.5f, 15.086f, 7.5f, 15.5f)
                curveTo(7.5f, 15.914f, 7.164f, 16.25f, 6.75f, 16.25f)
                horizontalLineTo(5.5f)
                curveTo(5.086f, 16.25f, 4.75f, 15.914f, 4.75f, 15.5f)
                close()
                moveTo(5.25f, 4f)
                curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(5.25f)
                close()
                moveTo(18.75f, 18.5f)
                horizontalLineTo(10f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
                close()
                moveTo(5.25f, 5.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
                close()
            }
        }.build()

        return _PanelLeftText!!
    }

@Suppress("ObjectPropertyName")
private var _PanelLeftText: ImageVector? = null

@Preview
@Composable
private fun PanelLeftTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PanelLeftText, contentDescription = null)
    }
}
