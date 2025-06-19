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

public val FluentIcons.Filled.PanelLeftHeader: ImageVector
    get() {
        if (_PanelLeftHeader != null) {
            return _PanelLeftHeader!!
        }
        _PanelLeftHeader = ImageVector.Builder(
            name = "Filled.PanelLeftHeader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(20.5f, 7.25f)
                curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                horizontalLineTo(20.5f)
                verticalLineTo(7.25f)
                close()
                moveTo(20.5f, 10.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 18.5f, 20.5f, 17.716f, 20.5f, 16.75f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _PanelLeftHeader!!
    }

@Suppress("ObjectPropertyName")
private var _PanelLeftHeader: ImageVector? = null

@Preview
@Composable
private fun PanelLeftHeaderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelLeftHeader, contentDescription = null)
    }
}
