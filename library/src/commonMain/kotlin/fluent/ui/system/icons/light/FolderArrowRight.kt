package fluent.ui.system.icons.light

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

public val FluentIcons.Light.FolderArrowRight: ImageVector
    get() {
        if (_FolderArrowRight != null) {
            return _FolderArrowRight!!
        }
        _FolderArrowRight = ImageVector.Builder(
            name = "Light.FolderArrowRight",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 12f)
                horizontalLineTo(10.592f)
                curveTo(11.313f, 12f, 11.999f, 11.689f, 12.474f, 11.146f)
                lineTo(15.227f, 8f)
                horizontalLineTo(25.5f)
                curveTo(27.433f, 8f, 29f, 9.567f, 29f, 11.5f)
                verticalLineTo(15.516f)
                curveTo(29.352f, 15.751f, 29.686f, 16.01f, 30f, 16.292f)
                verticalLineTo(11.5f)
                curveTo(30f, 9.015f, 27.985f, 7f, 25.5f, 7f)
                horizontalLineTo(14.707f)
                lineTo(12.439f, 4.732f)
                curveTo(11.97f, 4.263f, 11.335f, 4f, 10.672f, 4f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(23.5f)
                curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
                horizontalLineTo(16.515f)
                curveTo(16.302f, 27.681f, 16.108f, 27.347f, 15.936f, 27f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 27f, 3f, 25.433f, 3f, 23.5f)
                verticalLineTo(12f)
                close()
                moveTo(3f, 8.5f)
                curveTo(3f, 6.567f, 4.567f, 5f, 6.5f, 5f)
                horizontalLineTo(10.672f)
                curveTo(11.069f, 5f, 11.451f, 5.158f, 11.732f, 5.439f)
                lineTo(14.082f, 7.789f)
                lineTo(11.721f, 10.488f)
                curveTo(11.436f, 10.813f, 11.025f, 11f, 10.592f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(8.5f)
                close()
                moveTo(31.5f, 23f)
                curveTo(31.5f, 27.142f, 28.142f, 30.5f, 24f, 30.5f)
                curveTo(19.858f, 30.5f, 16.5f, 27.142f, 16.5f, 23f)
                curveTo(16.5f, 18.858f, 19.858f, 15.5f, 24f, 15.5f)
                curveTo(28.142f, 15.5f, 31.5f, 18.858f, 31.5f, 23f)
                close()
                moveTo(19.25f, 22f)
                curveTo(18.836f, 22f, 18.5f, 22.336f, 18.5f, 22.75f)
                curveTo(18.5f, 23.164f, 18.836f, 23.5f, 19.25f, 23.5f)
                horizontalLineTo(26.939f)
                lineTo(24.22f, 26.22f)
                curveTo(23.927f, 26.513f, 23.927f, 26.987f, 24.22f, 27.28f)
                curveTo(24.513f, 27.573f, 24.987f, 27.573f, 25.28f, 27.28f)
                lineTo(29.28f, 23.28f)
                curveTo(29.573f, 22.987f, 29.573f, 22.513f, 29.28f, 22.22f)
                lineTo(25.28f, 18.22f)
                curveTo(24.987f, 17.927f, 24.513f, 17.927f, 24.22f, 18.22f)
                curveTo(23.927f, 18.513f, 23.927f, 18.987f, 24.22f, 19.28f)
                lineTo(26.939f, 22f)
                horizontalLineTo(19.25f)
                close()
            }
        }.build()

        return _FolderArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _FolderArrowRight: ImageVector? = null

@Preview
@Composable
private fun FolderArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.FolderArrowRight, contentDescription = null)
    }
}
