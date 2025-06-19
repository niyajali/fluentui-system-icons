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

public val FluentIcons.Filled.EyeLines: ImageVector
    get() {
        if (_EyeLines != null) {
            return _EyeLines!!
        }
        _EyeLines = ImageVector.Builder(
            name = "Filled.EyeLines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.388f, 7.056f)
                curveTo(4.684f, 6.694f, 5.016f, 6.338f, 5.385f, 6f)
                horizontalLineTo(11.999f)
                verticalLineTo(5f)
                horizontalLineTo(6.678f)
                curveTo(8.062f, 4.111f, 9.817f, 3.5f, 11.999f, 3.5f)
                curveTo(15.64f, 3.5f, 18.091f, 5.198f, 19.612f, 7.056f)
                curveTo(20.367f, 7.979f, 20.895f, 8.943f, 21.236f, 9.763f)
                curveTo(21.566f, 10.557f, 21.75f, 11.291f, 21.75f, 11.75f)
                curveTo(21.75f, 12.209f, 21.566f, 12.943f, 21.236f, 13.737f)
                curveTo(20.895f, 14.557f, 20.367f, 15.521f, 19.612f, 16.444f)
                curveTo(18.091f, 18.302f, 15.641f, 20f, 12f, 20f)
                curveTo(9.817f, 20f, 8.062f, 19.389f, 6.678f, 18.5f)
                horizontalLineTo(11.999f)
                verticalLineTo(17.5f)
                horizontalLineTo(5.385f)
                curveTo(5.016f, 17.162f, 4.684f, 16.806f, 4.388f, 16.444f)
                curveTo(4.268f, 16.297f, 4.153f, 16.148f, 4.044f, 16f)
                horizontalLineTo(11.999f)
                verticalLineTo(15.25f)
                curveTo(12f, 15.25f, 11.999f, 15.25f, 11.999f, 15.25f)
                curveTo(13.932f, 15.25f, 15.5f, 13.683f, 15.5f, 11.75f)
                curveTo(15.5f, 9.817f, 13.933f, 8.25f, 12f, 8.25f)
                curveTo(12f, 8.25f, 12f, 8.25f, 12f, 8.25f)
                lineTo(11.999f, 7.5f)
                horizontalLineTo(4.044f)
                curveTo(4.153f, 7.352f, 4.268f, 7.203f, 4.388f, 7.056f)
                close()
                moveTo(10.698f, 8.5f)
                horizontalLineTo(3.391f)
                curveTo(3.136f, 8.941f, 2.928f, 9.368f, 2.764f, 9.763f)
                curveTo(2.731f, 9.843f, 2.7f, 9.922f, 2.67f, 10f)
                horizontalLineTo(8.968f)
                curveTo(9.359f, 9.325f, 9.968f, 8.793f, 10.698f, 8.5f)
                close()
                moveTo(8.581f, 11f)
                horizontalLineTo(2.354f)
                curveTo(2.286f, 11.291f, 2.25f, 11.547f, 2.25f, 11.75f)
                curveTo(2.25f, 11.953f, 2.286f, 12.209f, 2.354f, 12.5f)
                horizontalLineTo(8.581f)
                curveTo(8.528f, 12.258f, 8.5f, 12.007f, 8.5f, 11.75f)
                curveTo(8.5f, 11.493f, 8.528f, 11.242f, 8.581f, 11f)
                close()
                moveTo(8.968f, 13.5f)
                horizontalLineTo(2.67f)
                curveTo(2.7f, 13.578f, 2.731f, 13.657f, 2.764f, 13.737f)
                curveTo(2.928f, 14.132f, 3.136f, 14.559f, 3.391f, 15f)
                horizontalLineTo(10.698f)
                curveTo(9.968f, 14.707f, 9.359f, 14.175f, 8.968f, 13.5f)
                close()
            }
        }.build()

        return _EyeLines!!
    }

@Suppress("ObjectPropertyName")
private var _EyeLines: ImageVector? = null

@Preview
@Composable
private fun EyeLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EyeLines, contentDescription = null)
    }
}
