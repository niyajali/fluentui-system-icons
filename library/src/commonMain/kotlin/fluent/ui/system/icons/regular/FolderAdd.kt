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

public val FluentIcons.Regular.FolderAdd: ImageVector
    get() {
        if (_FolderAdd != null) {
            return _FolderAdd!!
        }
        _FolderAdd = ImageVector.Builder(
            name = "Regular.FolderAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(8.129f)
                curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
                lineTo(10.189f, 6.25f)
                lineTo(8.659f, 4.72f)
                curveTo(8.518f, 4.579f, 8.328f, 4.5f, 8.129f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                close()
                moveTo(2f, 6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
                lineTo(11.561f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
                verticalLineTo(12.81f)
                curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
                horizontalLineTo(11.561f)
                lineTo(9.72f, 8.841f)
                curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _FolderAdd!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAdd: ImageVector? = null

@Preview
@Composable
private fun FolderAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderAdd, contentDescription = null)
    }
}
