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

public val FluentIcons.Filled.PanelLeftExpand: ImageVector
    get() {
        if (_PanelLeftExpand != null) {
            return _PanelLeftExpand!!
        }
        _PanelLeftExpand = ImageVector.Builder(
            name = "Filled.PanelLeftExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.193f, 14.751f)
                curveTo(14.47f, 15.059f, 14.944f, 15.084f, 15.252f, 14.807f)
                lineTo(17.752f, 12.557f)
                curveTo(17.91f, 12.415f, 18f, 12.213f, 18f, 12f)
                curveTo(18f, 11.788f, 17.91f, 11.585f, 17.752f, 11.443f)
                lineTo(15.252f, 9.193f)
                curveTo(14.944f, 8.916f, 14.47f, 8.941f, 14.193f, 9.249f)
                curveTo(13.915f, 9.557f, 13.94f, 10.031f, 14.248f, 10.308f)
                lineTo(15.295f, 11.25f)
                lineTo(11.75f, 11.25f)
                curveTo(11.336f, 11.25f, 11f, 11.586f, 11f, 12f)
                curveTo(11f, 12.414f, 11.336f, 12.75f, 11.75f, 12.75f)
                horizontalLineTo(15.295f)
                lineTo(14.248f, 13.692f)
                curveTo(13.94f, 13.969f, 13.915f, 14.443f, 14.193f, 14.751f)
                close()
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(9f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 18.5f, 20.5f, 17.94f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _PanelLeftExpand!!
    }

@Suppress("ObjectPropertyName")
private var _PanelLeftExpand: ImageVector? = null

@Preview
@Composable
private fun PanelLeftExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PanelLeftExpand, contentDescription = null)
    }
}
