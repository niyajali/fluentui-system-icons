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

public val FluentIcons.Regular.SwipeRight: ImageVector
    get() {
        if (_SwipeRight != null) {
            return _SwipeRight!!
        }
        _SwipeRight = ImageVector.Builder(
            name = "Regular.SwipeRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.997f, 12f)
                curveTo(5.997f, 12.38f, 6.279f, 12.693f, 6.644f, 12.743f)
                lineTo(6.746f, 12.75f)
                horizontalLineTo(19.44f)
                lineTo(17.224f, 14.97f)
                curveTo(16.958f, 15.236f, 16.934f, 15.653f, 17.151f, 15.946f)
                lineTo(17.224f, 16.03f)
                curveTo(17.49f, 16.297f, 17.906f, 16.321f, 18.199f, 16.103f)
                lineTo(18.284f, 16.03f)
                lineTo(21.781f, 12.53f)
                curveTo(22.047f, 12.264f, 22.071f, 11.847f, 21.853f, 11.554f)
                lineTo(21.781f, 11.47f)
                lineTo(18.284f, 7.97f)
                curveTo(17.991f, 7.677f, 17.516f, 7.677f, 17.224f, 7.97f)
                curveTo(16.958f, 8.236f, 16.934f, 8.653f, 17.151f, 8.946f)
                lineTo(17.224f, 9.03f)
                lineTo(19.44f, 11.25f)
                horizontalLineTo(6.746f)
                curveTo(6.332f, 11.25f, 5.997f, 11.586f, 5.997f, 12f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 14.761f, 4.237f, 17f, 6.996f, 17f)
                curveTo(9.139f, 17f, 10.968f, 15.649f, 11.677f, 13.751f)
                lineTo(10.025f, 13.751f)
                curveTo(9.42f, 14.797f, 8.29f, 15.5f, 6.996f, 15.5f)
                curveTo(5.064f, 15.5f, 3.499f, 13.933f, 3.499f, 12f)
                curveTo(3.499f, 10.067f, 5.064f, 8.5f, 6.996f, 8.5f)
                curveTo(8.29f, 8.5f, 9.421f, 9.204f, 10.025f, 10.25f)
                lineTo(11.677f, 10.25f)
                curveTo(10.968f, 8.352f, 9.14f, 7f, 6.996f, 7f)
                curveTo(4.237f, 7f, 2f, 9.239f, 2f, 12f)
                close()
            }
        }.build()

        return _SwipeRight!!
    }

@Suppress("ObjectPropertyName")
private var _SwipeRight: ImageVector? = null

@Preview
@Composable
private fun SwipeRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SwipeRight, contentDescription = null)
    }
}
