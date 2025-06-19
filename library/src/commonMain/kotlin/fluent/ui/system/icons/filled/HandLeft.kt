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

public val FluentIcons.Filled.HandLeft: ImageVector
    get() {
        if (_HandLeft != null) {
            return _HandLeft!!
        }
        _HandLeft = ImageVector.Builder(
            name = "Filled.HandLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 4.253f)
                curveTo(14f, 3.701f, 14.448f, 3.253f, 15f, 3.253f)
                curveTo(15.552f, 3.253f, 16f, 3.701f, 16f, 4.253f)
                verticalLineTo(10.999f)
                curveTo(16f, 11.275f, 16.224f, 11.499f, 16.5f, 11.499f)
                curveTo(16.776f, 11.499f, 17f, 11.275f, 17f, 10.999f)
                verticalLineTo(5.999f)
                curveTo(17f, 5.447f, 17.448f, 4.999f, 18f, 4.999f)
                curveTo(18.552f, 4.999f, 19f, 5.447f, 19f, 5.999f)
                verticalLineTo(14.754f)
                curveTo(19f, 16.933f, 17.832f, 19.262f, 17.086f, 20.542f)
                curveTo(16.53f, 21.496f, 15.506f, 22f, 14.463f, 22f)
                horizontalLineTo(12.295f)
                curveTo(11.064f, 22f, 9.939f, 21.304f, 9.388f, 20.203f)
                lineTo(9.255f, 19.937f)
                curveTo(8.834f, 19.095f, 8.31f, 18.309f, 7.693f, 17.599f)
                lineTo(5.481f, 15.047f)
                lineTo(3.29f, 13.343f)
                curveTo(3.107f, 13.2f, 3f, 12.982f, 3f, 12.751f)
                curveTo(3f, 12.266f, 3.259f, 11.906f, 3.592f, 11.691f)
                curveTo(3.888f, 11.5f, 4.242f, 11.418f, 4.554f, 11.381f)
                curveTo(5.19f, 11.306f, 5.964f, 11.383f, 6.643f, 11.515f)
                curveTo(7.156f, 11.614f, 7.617f, 11.809f, 8f, 12.019f)
                verticalLineTo(4.253f)
                curveTo(8f, 3.701f, 8.448f, 3.253f, 9f, 3.253f)
                curveTo(9.552f, 3.253f, 10f, 3.701f, 10f, 4.253f)
                verticalLineTo(10.501f)
                curveTo(10f, 10.777f, 10.224f, 11.001f, 10.5f, 11.001f)
                curveTo(10.776f, 11.001f, 11f, 10.777f, 11f, 10.501f)
                verticalLineTo(3f)
                curveTo(11f, 2.448f, 11.448f, 2f, 12f, 2f)
                curveTo(12.552f, 2f, 13f, 2.448f, 13f, 3f)
                verticalLineTo(10.501f)
                curveTo(13f, 10.777f, 13.224f, 11.001f, 13.5f, 11.001f)
                curveTo(13.776f, 11.001f, 14f, 10.777f, 14f, 10.501f)
                verticalLineTo(4.253f)
                close()
            }
        }.build()

        return _HandLeft!!
    }

@Suppress("ObjectPropertyName")
private var _HandLeft: ImageVector? = null

@Preview
@Composable
private fun HandLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandLeft, contentDescription = null)
    }
}
