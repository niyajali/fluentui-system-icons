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

public val FluentIcons.Filled.TabDesktopImage: ImageVector
    get() {
        if (_TabDesktopImage != null) {
            return _TabDesktopImage!!
        }
        _TabDesktopImage = ImageVector.Builder(
            name = "Filled.TabDesktopImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 3f)
                horizontalLineTo(6f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                verticalLineTo(10.535f)
                curveTo(3.588f, 10.195f, 4.271f, 10f, 5f, 10f)
                horizontalLineTo(10f)
                curveTo(12.209f, 10f, 14f, 11.791f, 14f, 14f)
                verticalLineTo(19f)
                curveTo(14f, 19.729f, 13.805f, 20.412f, 13.465f, 21f)
                horizontalLineTo(18f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(13.25f)
                curveTo(12.007f, 8f, 11f, 6.993f, 11f, 5.75f)
                verticalLineTo(3f)
                close()
                moveTo(21f, 6.5f)
                verticalLineTo(6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.75f)
                curveTo(12.5f, 6.164f, 12.836f, 6.5f, 13.25f, 6.5f)
                horizontalLineTo(21f)
                close()
                moveTo(5f, 11f)
                curveTo(3.343f, 11f, 2f, 12.343f, 2f, 14f)
                verticalLineTo(19f)
                curveTo(2f, 19.556f, 2.151f, 20.077f, 2.415f, 20.524f)
                lineTo(5.909f, 17.03f)
                curveTo(6.788f, 16.152f, 8.212f, 16.152f, 9.091f, 17.03f)
                lineTo(12.585f, 20.524f)
                curveTo(12.849f, 20.077f, 13f, 19.556f, 13f, 19f)
                verticalLineTo(14f)
                curveTo(13f, 12.343f, 11.657f, 11f, 10f, 11f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 22f)
                curveTo(4.444f, 22f, 3.923f, 21.849f, 3.476f, 21.585f)
                lineTo(6.97f, 18.091f)
                curveTo(7.263f, 17.798f, 7.737f, 17.798f, 8.03f, 18.091f)
                lineTo(11.524f, 21.585f)
                curveTo(11.077f, 21.849f, 10.556f, 22f, 10f, 22f)
                horizontalLineTo(5f)
                close()
                moveTo(10f, 15f)
                curveTo(9.448f, 15f, 9f, 14.552f, 9f, 14f)
                curveTo(9f, 13.448f, 9.448f, 13f, 10f, 13f)
                curveTo(10.552f, 13f, 11f, 13.448f, 11f, 14f)
                curveTo(11f, 14.552f, 10.552f, 15f, 10f, 15f)
                close()
            }
        }.build()

        return _TabDesktopImage!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopImage: ImageVector? = null

@Preview
@Composable
private fun TabDesktopImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktopImage, contentDescription = null)
    }
}
