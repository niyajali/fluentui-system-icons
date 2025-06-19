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

public val FluentIcons.Filled.TabDesktopSearch: ImageVector
    get() {
        if (_TabDesktopSearch != null) {
            return _TabDesktopSearch!!
        }
        _TabDesktopSearch = ImageVector.Builder(
            name = "Filled.TabDesktopSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5.75f)
                curveTo(11f, 6.993f, 12.007f, 8f, 13.25f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(18.25f)
                curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
                horizontalLineTo(13.982f)
                curveTo(13.93f, 20.639f, 13.765f, 20.291f, 13.487f, 20.013f)
                lineTo(11.425f, 17.95f)
                curveTo(11.793f, 17.213f, 12f, 16.381f, 12f, 15.5f)
                curveTo(12f, 12.462f, 9.538f, 10f, 6.5f, 10f)
                curveTo(5.17f, 10f, 3.951f, 10.472f, 3f, 11.257f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                close()
                moveTo(21f, 5.75f)
                verticalLineTo(6.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 6.5f, 12.5f, 6.164f, 12.5f, 5.75f)
                verticalLineTo(3f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                close()
                moveTo(6.5f, 20f)
                curveTo(7.472f, 20f, 8.372f, 19.692f, 9.107f, 19.168f)
                lineTo(11.72f, 21.78f)
                curveTo(12.013f, 22.073f, 12.487f, 22.073f, 12.78f, 21.78f)
                curveTo(13.073f, 21.487f, 13.073f, 21.013f, 12.78f, 20.72f)
                lineTo(10.168f, 18.107f)
                curveTo(10.692f, 17.372f, 11f, 16.472f, 11f, 15.5f)
                curveTo(11f, 13.015f, 8.985f, 11f, 6.5f, 11f)
                curveTo(4.015f, 11f, 2f, 13.015f, 2f, 15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                close()
                moveTo(6.5f, 18.5f)
                curveTo(4.843f, 18.5f, 3.5f, 17.157f, 3.5f, 15.5f)
                curveTo(3.5f, 13.843f, 4.843f, 12.5f, 6.5f, 12.5f)
                curveTo(8.157f, 12.5f, 9.5f, 13.843f, 9.5f, 15.5f)
                curveTo(9.5f, 17.157f, 8.157f, 18.5f, 6.5f, 18.5f)
                close()
            }
        }.build()

        return _TabDesktopSearch!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopSearch: ImageVector? = null

@Preview
@Composable
private fun TabDesktopSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktopSearch, contentDescription = null)
    }
}
