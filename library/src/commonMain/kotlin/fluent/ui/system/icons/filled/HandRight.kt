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

public val FluentIcons.Filled.HandRight: ImageVector
    get() {
        if (_HandRight != null) {
            return _HandRight!!
        }
        _HandRight = ImageVector.Builder(
            name = "Filled.HandRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 4.249f)
                curveTo(10f, 3.697f, 9.552f, 3.249f, 9f, 3.249f)
                curveTo(8.448f, 3.249f, 8f, 3.697f, 8f, 4.249f)
                verticalLineTo(10.997f)
                curveTo(8f, 11.274f, 7.776f, 11.497f, 7.5f, 11.497f)
                curveTo(7.224f, 11.497f, 7f, 11.274f, 7f, 10.997f)
                verticalLineTo(5.996f)
                curveTo(7f, 5.444f, 6.552f, 4.996f, 6f, 4.996f)
                curveTo(5.448f, 4.996f, 5f, 5.444f, 5f, 5.996f)
                verticalLineTo(14.753f)
                curveTo(5f, 16.932f, 6.168f, 19.262f, 6.914f, 20.542f)
                curveTo(7.47f, 21.496f, 8.494f, 22.001f, 9.537f, 22.001f)
                horizontalLineTo(11.705f)
                curveTo(12.936f, 22.001f, 14.061f, 21.305f, 14.612f, 20.204f)
                lineTo(14.745f, 19.937f)
                curveTo(15.166f, 19.095f, 15.69f, 18.309f, 16.307f, 17.598f)
                lineTo(18.519f, 15.046f)
                lineTo(20.711f, 13.341f)
                curveTo(20.893f, 13.199f, 21f, 12.981f, 21f, 12.749f)
                curveTo(21f, 12.264f, 20.741f, 11.904f, 20.408f, 11.69f)
                curveTo(20.112f, 11.498f, 19.758f, 11.417f, 19.446f, 11.38f)
                curveTo(18.81f, 11.304f, 18.036f, 11.381f, 17.357f, 11.513f)
                curveTo(16.844f, 11.613f, 16.383f, 11.807f, 16f, 12.017f)
                verticalLineTo(4.249f)
                curveTo(16f, 3.697f, 15.552f, 3.249f, 15f, 3.249f)
                curveTo(14.448f, 3.249f, 14f, 3.697f, 14f, 4.249f)
                verticalLineTo(10.499f)
                curveTo(14f, 10.775f, 13.776f, 10.999f, 13.5f, 10.999f)
                curveTo(13.224f, 10.999f, 13f, 10.775f, 13f, 10.499f)
                verticalLineTo(2.996f)
                curveTo(13f, 2.444f, 12.552f, 1.996f, 12f, 1.996f)
                curveTo(11.448f, 1.996f, 11f, 2.444f, 11f, 2.996f)
                verticalLineTo(10.499f)
                curveTo(11f, 10.775f, 10.776f, 10.999f, 10.5f, 10.999f)
                curveTo(10.224f, 10.999f, 10f, 10.775f, 10f, 10.499f)
                verticalLineTo(4.249f)
                close()
            }
        }.build()

        return _HandRight!!
    }

@Suppress("ObjectPropertyName")
private var _HandRight: ImageVector? = null

@Preview
@Composable
private fun HandRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandRight, contentDescription = null)
    }
}
