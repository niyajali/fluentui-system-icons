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

public val FluentIcons.Filled.AppFolder: ImageVector
    get() {
        if (_AppFolder != null) {
            return _AppFolder!!
        }
        _AppFolder = ImageVector.Builder(
            name = "Filled.AppFolder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.501f, 14.25f)
                curveTo(11.501f, 13.283f, 10.718f, 12.5f, 9.751f, 12.5f)
                horizontalLineTo(7.751f)
                curveTo(6.785f, 12.5f, 6.001f, 13.283f, 6.001f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(6.001f, 17.216f, 6.785f, 18f, 7.751f, 18f)
                horizontalLineTo(9.751f)
                curveTo(10.718f, 18f, 11.501f, 17.216f, 11.501f, 16.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(17.999f, 14.25f)
                curveTo(17.999f, 13.283f, 17.215f, 12.5f, 16.249f, 12.5f)
                horizontalLineTo(14.249f)
                curveTo(13.282f, 12.5f, 12.499f, 13.283f, 12.499f, 14.25f)
                verticalLineTo(16.25f)
                curveTo(12.499f, 17.216f, 13.282f, 18f, 14.249f, 18f)
                horizontalLineTo(16.249f)
                curveTo(17.215f, 18f, 17.999f, 17.216f, 17.999f, 16.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(11.5f, 7.75f)
                curveTo(11.5f, 6.784f, 10.717f, 6f, 9.75f, 6f)
                horizontalLineTo(7.75f)
                curveTo(6.784f, 6f, 6f, 6.784f, 6f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(6f, 10.717f, 6.784f, 11.5f, 7.75f, 11.5f)
                horizontalLineTo(9.75f)
                curveTo(10.717f, 11.5f, 11.5f, 10.717f, 11.5f, 9.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(17.997f, 7.75f)
                curveTo(17.997f, 6.784f, 17.214f, 6f, 16.247f, 6f)
                horizontalLineTo(14.248f)
                curveTo(13.281f, 6f, 12.498f, 6.784f, 12.498f, 7.75f)
                verticalLineTo(9.75f)
                curveTo(12.498f, 10.717f, 13.281f, 11.5f, 14.248f, 11.5f)
                horizontalLineTo(16.247f)
                curveTo(17.214f, 11.5f, 17.997f, 10.717f, 17.997f, 9.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _AppFolder!!
    }

@Suppress("ObjectPropertyName")
private var _AppFolder: ImageVector? = null

@Preview
@Composable
private fun AppFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AppFolder, contentDescription = null)
    }
}
