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

public val FluentIcons.Filled.BinderTriangle: ImageVector
    get() {
        if (_BinderTriangle != null) {
            return _BinderTriangle!!
        }
        _BinderTriangle = ImageVector.Builder(
            name = "Filled.BinderTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 2f)
                curveTo(4.007f, 2f, 3f, 3.007f, 3f, 4.25f)
                verticalLineTo(5f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 5f, 1.5f, 5.336f, 1.5f, 5.75f)
                curveTo(1.5f, 6.164f, 1.836f, 6.5f, 2.25f, 6.5f)
                horizontalLineTo(3f)
                verticalLineTo(9.75f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 9.75f, 1.5f, 10.086f, 1.5f, 10.5f)
                curveTo(1.5f, 10.914f, 1.836f, 11.25f, 2.25f, 11.25f)
                horizontalLineTo(3f)
                verticalLineTo(14.5f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 14.5f, 1.5f, 14.836f, 1.5f, 15.25f)
                curveTo(1.5f, 15.664f, 1.836f, 16f, 2.25f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(16.75f)
                curveTo(3f, 17.993f, 4.007f, 19f, 5.25f, 19f)
                horizontalLineTo(7.035f)
                lineTo(17f, 6.546f)
                verticalLineTo(4.25f)
                curveTo(17f, 3.007f, 15.993f, 2f, 14.75f, 2f)
                horizontalLineTo(5.25f)
                close()
                moveTo(7.75f, 7f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 7f, 13f, 7.336f, 13f, 7.75f)
                curveTo(13f, 8.164f, 12.664f, 8.5f, 12.25f, 8.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 8.5f, 7f, 8.164f, 7f, 7.75f)
                curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
                close()
                moveTo(19.221f, 5.378f)
                curveTo(19.811f, 4.64f, 21.001f, 5.057f, 21.001f, 6.002f)
                verticalLineTo(19.749f)
                curveTo(21.001f, 20.992f, 19.994f, 21.999f, 18.751f, 21.999f)
                horizontalLineTo(8.002f)
                curveTo(7.163f, 21.999f, 6.697f, 21.029f, 7.221f, 20.374f)
                lineTo(19.221f, 5.378f)
                close()
                moveTo(13.975f, 17.594f)
                curveTo(13.844f, 17.758f, 13.96f, 18f, 14.17f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 18f, 17f, 17.776f, 17f, 17.5f)
                verticalLineTo(14.523f)
                curveTo(17f, 14.286f, 16.702f, 14.182f, 16.555f, 14.367f)
                lineTo(13.975f, 17.594f)
                close()
            }
        }.build()

        return _BinderTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _BinderTriangle: ImageVector? = null

@Preview
@Composable
private fun BinderTrianglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BinderTriangle, contentDescription = null)
    }
}
