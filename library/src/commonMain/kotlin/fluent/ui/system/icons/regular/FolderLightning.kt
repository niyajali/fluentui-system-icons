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

public val FluentIcons.Regular.FolderLightning: ImageVector
    get() {
        if (_FolderLightning != null) {
            return _FolderLightning!!
        }
        _FolderLightning = ImageVector.Builder(
            name = "Regular.FolderLightning",
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
                verticalLineTo(11f)
                horizontalLineTo(20.5f)
                verticalLineTo(8.75f)
                curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
                horizontalLineTo(11.561f)
                lineTo(9.72f, 8.841f)
                curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(13.379f)
                curveTo(13.648f, 19.802f, 14.04f, 20f, 14.497f, 20f)
                horizontalLineTo(16.22f)
                lineTo(15.971f, 21f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(17.318f, 12f)
                horizontalLineTo(22.145f)
                curveTo(22.528f, 12f, 22.768f, 12.412f, 22.581f, 12.745f)
                lineTo(20.75f, 16f)
                horizontalLineTo(22.246f)
                curveTo(22.891f, 16f, 23.235f, 16.759f, 22.81f, 17.244f)
                lineTo(17.987f, 22.752f)
                curveTo(17.482f, 23.328f, 16.544f, 22.837f, 16.729f, 22.094f)
                lineTo(17.5f, 19f)
                horizontalLineTo(14.498f)
                curveTo(14.131f, 19f, 13.889f, 18.619f, 14.045f, 18.287f)
                lineTo(16.865f, 12.287f)
                curveTo(16.948f, 12.112f, 17.124f, 12f, 17.318f, 12f)
                close()
            }
        }.build()

        return _FolderLightning!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLightning: ImageVector? = null

@Preview
@Composable
private fun FolderLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderLightning, contentDescription = null)
    }
}
