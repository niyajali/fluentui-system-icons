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

public val FluentIcons.Regular.Pill: ImageVector
    get() {
        if (_Pill != null) {
            return _Pill!!
        }
        _Pill = ImageVector.Builder(
            name = "Regular.Pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.53f, 15.47f)
                curveTo(10.823f, 15.763f, 10.823f, 16.237f, 10.53f, 16.53f)
                lineTo(8.53f, 18.53f)
                curveTo(7.687f, 19.373f, 6.321f, 19.375f, 5.476f, 18.537f)
                curveTo(5.336f, 18.401f, 5.249f, 18.211f, 5.249f, 18f)
                curveTo(5.249f, 17.586f, 5.585f, 17.25f, 5.999f, 17.25f)
                curveTo(6.206f, 17.25f, 6.394f, 17.334f, 6.53f, 17.47f)
                curveTo(6.789f, 17.729f, 7.21f, 17.729f, 7.469f, 17.47f)
                lineTo(9.469f, 15.47f)
                curveTo(9.762f, 15.177f, 10.237f, 15.177f, 10.53f, 15.47f)
                close()
                moveTo(13.302f, 3.525f)
                curveTo(15.283f, 1.545f, 18.493f, 1.545f, 20.474f, 3.525f)
                curveTo(22.454f, 5.506f, 22.454f, 8.717f, 20.474f, 10.697f)
                lineTo(10.696f, 20.475f)
                curveTo(8.716f, 22.455f, 5.505f, 22.455f, 3.524f, 20.475f)
                curveTo(1.544f, 18.494f, 1.544f, 15.284f, 3.524f, 13.303f)
                lineTo(13.302f, 3.525f)
                close()
                moveTo(19.413f, 4.586f)
                curveTo(18.019f, 3.191f, 15.757f, 3.191f, 14.363f, 4.586f)
                lineTo(10.004f, 8.945f)
                lineTo(15.055f, 13.995f)
                lineTo(19.413f, 9.636f)
                curveTo(20.808f, 8.242f, 20.808f, 5.981f, 19.413f, 4.586f)
                close()
                moveTo(13.994f, 15.056f)
                lineTo(8.944f, 10.005f)
                lineTo(4.585f, 14.364f)
                curveTo(3.19f, 15.758f, 3.19f, 18.02f, 4.585f, 19.414f)
                curveTo(5.98f, 20.809f, 8.241f, 20.809f, 9.635f, 19.414f)
                lineTo(13.994f, 15.056f)
                close()
            }
        }.build()

        return _Pill!!
    }

@Suppress("ObjectPropertyName")
private var _Pill: ImageVector? = null

@Preview
@Composable
private fun PillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Pill, contentDescription = null)
    }
}
