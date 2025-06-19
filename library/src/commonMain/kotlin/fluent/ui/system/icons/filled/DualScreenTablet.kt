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

public val FluentIcons.Filled.DualScreenTablet: ImageVector
    get() {
        if (_DualScreenTablet != null) {
            return _DualScreenTablet!!
        }
        _DualScreenTablet = ImageVector.Builder(
            name = "Filled.DualScreenTablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 9f)
                verticalLineTo(21f)
                lineTo(3.75f, 21f)
                curveTo(2.832f, 21f, 2.079f, 20.293f, 2.006f, 19.393f)
                lineTo(2f, 19.25f)
                verticalLineTo(10.75f)
                curveTo(2f, 9.832f, 2.707f, 9.079f, 3.606f, 9.006f)
                lineTo(3.75f, 9f)
                lineTo(7.5f, 9f)
                close()
                moveTo(12.25f, 9f)
                curveTo(13.168f, 9f, 13.921f, 9.707f, 13.994f, 10.606f)
                lineTo(14f, 10.75f)
                verticalLineTo(19.25f)
                curveTo(14f, 20.168f, 13.293f, 20.921f, 12.394f, 20.994f)
                lineTo(12.25f, 21f)
                lineTo(8.5f, 21f)
                verticalLineTo(9f)
                lineTo(12.25f, 9f)
                close()
                moveTo(10.644f, 17.5f)
                horizontalLineTo(10.144f)
                lineTo(10.042f, 17.507f)
                curveTo(9.676f, 17.556f, 9.394f, 17.87f, 9.394f, 18.25f)
                curveTo(9.394f, 18.63f, 9.676f, 18.944f, 10.042f, 18.993f)
                lineTo(10.144f, 19f)
                horizontalLineTo(10.644f)
                lineTo(10.745f, 18.993f)
                curveTo(11.112f, 18.944f, 11.394f, 18.63f, 11.394f, 18.25f)
                curveTo(11.394f, 17.836f, 11.058f, 17.5f, 10.644f, 17.5f)
                close()
                moveTo(5.894f, 17.5f)
                horizontalLineTo(5.394f)
                lineTo(5.292f, 17.507f)
                curveTo(4.926f, 17.556f, 4.644f, 17.87f, 4.644f, 18.25f)
                curveTo(4.644f, 18.63f, 4.926f, 18.944f, 5.292f, 18.993f)
                lineTo(5.394f, 19f)
                horizontalLineTo(5.894f)
                lineTo(5.996f, 18.993f)
                curveTo(6.362f, 18.944f, 6.644f, 18.63f, 6.644f, 18.25f)
                curveTo(6.644f, 17.836f, 6.308f, 17.5f, 5.894f, 17.5f)
                close()
                moveTo(19.75f, 3f)
                curveTo(20.941f, 3f, 21.916f, 3.925f, 21.995f, 5.096f)
                lineTo(22f, 5.25f)
                verticalLineTo(13.75f)
                curveTo(22f, 14.941f, 21.075f, 15.916f, 19.904f, 15.995f)
                lineTo(19.75f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13.5f, 17f, 13.164f, 17f, 12.75f)
                curveTo(17f, 12.336f, 16.664f, 12f, 16.25f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                curveTo(15f, 9.175f, 13.969f, 8.09f, 12.664f, 8.005f)
                lineTo(12.5f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(5.25f)
                curveTo(6f, 4.059f, 6.925f, 3.084f, 8.096f, 3.005f)
                lineTo(8.25f, 3f)
                horizontalLineTo(19.75f)
                close()
            }
        }.build()

        return _DualScreenTablet!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenTablet: ImageVector? = null

@Preview
@Composable
private fun DualScreenTabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenTablet, contentDescription = null)
    }
}
