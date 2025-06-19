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

public val FluentIcons.Filled.DualScreenDesktop: ImageVector
    get() {
        if (_DualScreenDesktop != null) {
            return _DualScreenDesktop!!
        }
        _DualScreenDesktop = ImageVector.Builder(
            name = "Filled.DualScreenDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 10f)
                verticalLineTo(22f)
                lineTo(3.75f, 22f)
                curveTo(2.832f, 22f, 2.079f, 21.293f, 2.006f, 20.393f)
                lineTo(2f, 20.25f)
                verticalLineTo(11.75f)
                curveTo(2f, 10.832f, 2.707f, 10.079f, 3.606f, 10.006f)
                lineTo(3.75f, 10f)
                lineTo(7.5f, 10f)
                close()
                moveTo(12.25f, 10f)
                curveTo(13.168f, 10f, 13.921f, 10.707f, 13.994f, 11.606f)
                lineTo(14f, 11.75f)
                verticalLineTo(20.25f)
                curveTo(14f, 21.168f, 13.293f, 21.921f, 12.394f, 21.994f)
                lineTo(12.25f, 22f)
                lineTo(8.5f, 22f)
                verticalLineTo(10f)
                lineTo(12.25f, 10f)
                close()
                moveTo(10.644f, 18.5f)
                horizontalLineTo(10.144f)
                lineTo(10.042f, 18.507f)
                curveTo(9.676f, 18.556f, 9.394f, 18.87f, 9.394f, 19.25f)
                curveTo(9.394f, 19.63f, 9.676f, 19.944f, 10.042f, 19.993f)
                lineTo(10.144f, 20f)
                horizontalLineTo(10.644f)
                lineTo(10.745f, 19.993f)
                curveTo(11.112f, 19.944f, 11.394f, 19.63f, 11.394f, 19.25f)
                curveTo(11.394f, 18.836f, 11.058f, 18.5f, 10.644f, 18.5f)
                close()
                moveTo(5.894f, 18.5f)
                horizontalLineTo(5.394f)
                lineTo(5.292f, 18.507f)
                curveTo(4.926f, 18.556f, 4.644f, 18.87f, 4.644f, 19.25f)
                curveTo(4.644f, 19.63f, 4.926f, 19.944f, 5.292f, 19.993f)
                lineTo(5.394f, 20f)
                horizontalLineTo(5.894f)
                lineTo(5.996f, 19.993f)
                curveTo(6.362f, 19.944f, 6.644f, 19.63f, 6.644f, 19.25f)
                curveTo(6.644f, 18.836f, 6.308f, 18.5f, 5.894f, 18.5f)
                close()
                moveTo(19.75f, 2f)
                curveTo(20.941f, 2f, 21.916f, 2.925f, 21.995f, 4.096f)
                lineTo(22f, 4.25f)
                verticalLineTo(13.25f)
                curveTo(22f, 14.441f, 21.075f, 15.416f, 19.904f, 15.495f)
                lineTo(19.75f, 15.5f)
                horizontalLineTo(17f)
                verticalLineTo(17.5f)
                horizontalLineTo(18.25f)
                curveTo(18.665f, 17.5f, 19f, 17.836f, 19f, 18.25f)
                curveTo(19f, 18.63f, 18.718f, 18.944f, 18.352f, 18.993f)
                lineTo(18.25f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(15f)
                verticalLineTo(11.5f)
                curveTo(15f, 10.175f, 13.969f, 9.09f, 12.664f, 9.005f)
                lineTo(12.5f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
                lineTo(6.25f, 2f)
                horizontalLineTo(19.75f)
                close()
            }
        }.build()

        return _DualScreenDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenDesktop: ImageVector? = null

@Preview
@Composable
private fun DualScreenDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenDesktop, contentDescription = null)
    }
}
