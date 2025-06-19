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

public val FluentIcons.Regular.FolderSearch: ImageVector
    get() {
        if (_FolderSearch != null) {
            return _FolderSearch!!
        }
        _FolderSearch = ImageVector.Builder(
            name = "Regular.FolderSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 3f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(16.5f)
                horizontalLineTo(17f)
                verticalLineTo(20.978f)
                curveTo(16.835f, 20.992f, 16.669f, 21f, 16.5f, 21f)
                curveTo(15.038f, 21f, 13.71f, 20.43f, 12.725f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 9.5f, 9.298f, 9.263f, 9.72f, 8.841f)
                lineTo(11.561f, 7f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 7f, 20.5f, 7.784f, 20.5f, 8.75f)
                verticalLineTo(11.725f)
                curveTo(21.323f, 12.597f, 21.864f, 13.737f, 21.978f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(8.75f)
                curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(11.561f)
                lineTo(9.72f, 3.659f)
                curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 8f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.284f, 4.284f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(8.129f)
                curveTo(8.328f, 4.5f, 8.518f, 4.579f, 8.659f, 4.72f)
                lineTo(10.189f, 6.25f)
                lineTo(8.659f, 7.78f)
                curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
                horizontalLineTo(3.5f)
                close()
                moveTo(16.5f, 20f)
                curveTo(17.472f, 20f, 18.372f, 19.692f, 19.107f, 19.168f)
                lineTo(21.72f, 21.78f)
                curveTo(22.013f, 22.073f, 22.487f, 22.073f, 22.78f, 21.78f)
                curveTo(23.073f, 21.487f, 23.073f, 21.013f, 22.78f, 20.72f)
                lineTo(20.168f, 18.107f)
                curveTo(20.692f, 17.372f, 21f, 16.472f, 21f, 15.5f)
                curveTo(21f, 13.015f, 18.985f, 11f, 16.5f, 11f)
                curveTo(14.015f, 11f, 12f, 13.015f, 12f, 15.5f)
                curveTo(12f, 17.985f, 14.015f, 20f, 16.5f, 20f)
                close()
                moveTo(16.5f, 18.5f)
                curveTo(14.843f, 18.5f, 13.5f, 17.157f, 13.5f, 15.5f)
                curveTo(13.5f, 13.843f, 14.843f, 12.5f, 16.5f, 12.5f)
                curveTo(18.157f, 12.5f, 19.5f, 13.843f, 19.5f, 15.5f)
                curveTo(19.5f, 17.157f, 18.157f, 18.5f, 16.5f, 18.5f)
                close()
            }
        }.build()

        return _FolderSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSearch: ImageVector? = null

@Preview
@Composable
private fun FolderSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderSearch, contentDescription = null)
    }
}
