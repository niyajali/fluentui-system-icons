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

public val FluentIcons.Filled.PaddingTop: ImageVector
    get() {
        if (_PaddingTop != null) {
            return _PaddingTop!!
        }
        _PaddingTop = ImageVector.Builder(
            name = "Filled.PaddingTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 3f)
                curveTo(4f, 2.448f, 4.448f, 2f, 5f, 2f)
                horizontalLineTo(6.75f)
                curveTo(7.302f, 2f, 7.75f, 2.448f, 7.75f, 3f)
                curveTo(7.75f, 3.552f, 7.302f, 4f, 6.75f, 4f)
                horizontalLineTo(5f)
                curveTo(4.448f, 4f, 4f, 3.552f, 4f, 3f)
                close()
                moveTo(9.25f, 3f)
                curveTo(9.25f, 2.448f, 9.698f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.302f, 2f, 14.75f, 2.448f, 14.75f, 3f)
                curveTo(14.75f, 3.552f, 14.302f, 4f, 13.75f, 4f)
                horizontalLineTo(10.25f)
                curveTo(9.698f, 4f, 9.25f, 3.552f, 9.25f, 3f)
                close()
                moveTo(16.25f, 3f)
                curveTo(16.25f, 2.448f, 16.698f, 2f, 17.25f, 2f)
                horizontalLineTo(19f)
                curveTo(19.552f, 2f, 20f, 2.448f, 20f, 3f)
                curveTo(20f, 3.552f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(17.25f)
                curveTo(16.698f, 4f, 16.25f, 3.552f, 16.25f, 3f)
                close()
                moveTo(4f, 21f)
                curveTo(4f, 20.448f, 4.448f, 20f, 5f, 20f)
                horizontalLineTo(19f)
                curveTo(19.552f, 20f, 20f, 20.448f, 20f, 21f)
                curveTo(20f, 21.552f, 19.552f, 22f, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(4.448f, 22f, 4f, 21.552f, 4f, 21f)
                close()
                moveTo(12.707f, 5.293f)
                curveTo(12.317f, 4.902f, 11.683f, 4.902f, 11.293f, 5.293f)
                lineTo(6.293f, 10.293f)
                curveTo(5.902f, 10.683f, 5.902f, 11.317f, 6.293f, 11.707f)
                curveTo(6.683f, 12.098f, 7.317f, 12.098f, 7.707f, 11.707f)
                lineTo(11f, 8.414f)
                verticalLineTo(18f)
                curveTo(11f, 18.552f, 11.448f, 19f, 12f, 19f)
                curveTo(12.552f, 19f, 13f, 18.552f, 13f, 18f)
                verticalLineTo(8.414f)
                lineTo(16.293f, 11.707f)
                curveTo(16.683f, 12.098f, 17.317f, 12.098f, 17.707f, 11.707f)
                curveTo(18.098f, 11.317f, 18.098f, 10.683f, 17.707f, 10.293f)
                lineTo(12.707f, 5.293f)
                close()
            }
        }.build()

        return _PaddingTop!!
    }

@Suppress("ObjectPropertyName")
private var _PaddingTop: ImageVector? = null

@Preview
@Composable
private fun PaddingTopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaddingTop, contentDescription = null)
    }
}
