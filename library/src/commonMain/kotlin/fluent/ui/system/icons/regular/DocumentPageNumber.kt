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

public val FluentIcons.Regular.DocumentPageNumber: ImageVector
    get() {
        if (_DocumentPageNumber != null) {
            return _DocumentPageNumber!!
        }
        _DocumentPageNumber = ImageVector.Builder(
            name = "Regular.DocumentPageNumber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.744f, 1.996f)
                curveTo(18.935f, 1.996f, 19.91f, 2.921f, 19.989f, 4.092f)
                lineTo(19.994f, 4.246f)
                verticalLineTo(19.744f)
                curveTo(19.994f, 20.935f, 19.069f, 21.91f, 17.898f, 21.989f)
                lineTo(17.744f, 21.994f)
                horizontalLineTo(6.244f)
                curveTo(5.053f, 21.994f, 4.078f, 21.069f, 3.999f, 19.898f)
                lineTo(3.994f, 19.744f)
                verticalLineTo(4.246f)
                curveTo(3.994f, 3.055f, 4.919f, 2.08f, 6.09f, 2.001f)
                lineTo(6.244f, 1.996f)
                horizontalLineTo(17.744f)
                close()
                moveTo(17.744f, 3.496f)
                horizontalLineTo(6.244f)
                curveTo(5.864f, 3.496f, 5.551f, 3.778f, 5.501f, 4.144f)
                lineTo(5.494f, 4.246f)
                verticalLineTo(19.744f)
                curveTo(5.494f, 20.124f, 5.776f, 20.438f, 6.142f, 20.487f)
                lineTo(6.244f, 20.494f)
                horizontalLineTo(17.744f)
                curveTo(18.124f, 20.494f, 18.438f, 20.212f, 18.487f, 19.846f)
                lineTo(18.494f, 19.744f)
                verticalLineTo(4.246f)
                curveTo(18.494f, 3.866f, 18.212f, 3.553f, 17.846f, 3.503f)
                lineTo(17.744f, 3.496f)
                close()
                moveTo(13.018f, 16.019f)
                curveTo(12.609f, 15.954f, 12.33f, 15.57f, 12.395f, 15.161f)
                lineTo(12.499f, 14.5f)
                horizontalLineTo(11.018f)
                lineTo(10.876f, 15.396f)
                curveTo(10.811f, 15.805f, 10.427f, 16.084f, 10.018f, 16.019f)
                curveTo(9.609f, 15.954f, 9.33f, 15.57f, 9.395f, 15.161f)
                lineTo(9.499f, 14.5f)
                horizontalLineTo(8.749f)
                curveTo(8.335f, 14.5f, 7.999f, 14.165f, 7.999f, 13.75f)
                curveTo(7.999f, 13.336f, 8.335f, 13f, 8.749f, 13f)
                horizontalLineTo(9.737f)
                lineTo(9.974f, 11.5f)
                horizontalLineTo(9.249f)
                curveTo(8.835f, 11.5f, 8.499f, 11.165f, 8.499f, 10.75f)
                curveTo(8.499f, 10.336f, 8.835f, 10f, 9.249f, 10f)
                horizontalLineTo(10.212f)
                lineTo(10.411f, 8.741f)
                curveTo(10.476f, 8.332f, 10.86f, 8.053f, 11.269f, 8.118f)
                curveTo(11.678f, 8.182f, 11.958f, 8.567f, 11.893f, 8.976f)
                lineTo(11.731f, 10f)
                horizontalLineTo(13.212f)
                lineTo(13.411f, 8.741f)
                curveTo(13.476f, 8.332f, 13.86f, 8.053f, 14.269f, 8.118f)
                curveTo(14.678f, 8.182f, 14.958f, 8.567f, 14.893f, 8.976f)
                lineTo(14.731f, 10f)
                horizontalLineTo(15.249f)
                curveTo(15.663f, 10f, 15.999f, 10.336f, 15.999f, 10.75f)
                curveTo(15.999f, 11.165f, 15.663f, 11.5f, 15.249f, 11.5f)
                horizontalLineTo(14.493f)
                lineTo(14.255f, 13f)
                horizontalLineTo(14.749f)
                curveTo(15.163f, 13f, 15.499f, 13.336f, 15.499f, 13.75f)
                curveTo(15.499f, 14.165f, 15.163f, 14.5f, 14.749f, 14.5f)
                horizontalLineTo(14.018f)
                lineTo(13.876f, 15.396f)
                curveTo(13.811f, 15.805f, 13.427f, 16.084f, 13.018f, 16.019f)
                close()
                moveTo(11.493f, 11.5f)
                lineTo(11.255f, 13f)
                horizontalLineTo(12.737f)
                lineTo(12.974f, 11.5f)
                horizontalLineTo(11.493f)
                close()
            }
        }.build()

        return _DocumentPageNumber!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageNumber: ImageVector? = null

@Preview
@Composable
private fun DocumentPageNumberPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentPageNumber, contentDescription = null)
    }
}
