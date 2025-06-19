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

public val FluentIcons.Regular.DataFunnel: ImageVector
    get() {
        if (_DataFunnel != null) {
            return _DataFunnel!!
        }
        _DataFunnel = ImageVector.Builder(
            name = "Regular.DataFunnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22.002f, 4.752f)
                curveTo(22.002f, 6.272f, 20.77f, 7.504f, 19.25f, 7.504f)
                lineTo(4.752f, 7.504f)
                curveTo(3.232f, 7.504f, 2f, 6.272f, 2f, 4.752f)
                curveTo(2f, 3.232f, 3.232f, 2f, 4.752f, 2f)
                lineTo(19.25f, 2f)
                curveTo(20.77f, 2f, 22.002f, 3.232f, 22.002f, 4.752f)
                close()
                moveTo(20.002f, 11.752f)
                curveTo(20.002f, 13.272f, 18.77f, 14.504f, 17.25f, 14.504f)
                lineTo(6.752f, 14.504f)
                curveTo(5.232f, 14.504f, 4f, 13.272f, 4f, 11.752f)
                curveTo(4f, 10.232f, 5.232f, 9f, 6.752f, 9f)
                horizontalLineTo(17.25f)
                curveTo(18.77f, 9f, 20.002f, 10.232f, 20.002f, 11.752f)
                close()
                moveTo(17.002f, 18.752f)
                curveTo(17.002f, 20.272f, 15.77f, 21.504f, 14.25f, 21.504f)
                horizontalLineTo(9.752f)
                curveTo(8.232f, 21.504f, 7f, 20.272f, 7f, 18.752f)
                curveTo(7f, 17.232f, 8.232f, 16f, 9.752f, 16f)
                horizontalLineTo(14.25f)
                curveTo(15.77f, 16f, 17.002f, 17.232f, 17.002f, 18.752f)
                close()
                moveTo(20.502f, 4.752f)
                curveTo(20.502f, 4.06f, 19.941f, 3.5f, 19.25f, 3.5f)
                lineTo(4.752f, 3.5f)
                curveTo(4.06f, 3.5f, 3.5f, 4.06f, 3.5f, 4.752f)
                curveTo(3.5f, 5.443f, 4.06f, 6.004f, 4.752f, 6.004f)
                lineTo(19.25f, 6.004f)
                curveTo(19.941f, 6.004f, 20.502f, 5.443f, 20.502f, 4.752f)
                close()
                moveTo(18.502f, 11.752f)
                curveTo(18.502f, 11.061f, 17.941f, 10.5f, 17.25f, 10.5f)
                lineTo(6.752f, 10.5f)
                curveTo(6.06f, 10.5f, 5.5f, 11.061f, 5.5f, 11.752f)
                curveTo(5.5f, 12.443f, 6.06f, 13.004f, 6.752f, 13.004f)
                lineTo(17.25f, 13.004f)
                curveTo(17.941f, 13.004f, 18.502f, 12.443f, 18.502f, 11.752f)
                close()
                moveTo(15.502f, 18.752f)
                curveTo(15.502f, 18.06f, 14.941f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(9.752f)
                curveTo(9.06f, 17.5f, 8.5f, 18.06f, 8.5f, 18.752f)
                curveTo(8.5f, 19.443f, 9.06f, 20.004f, 9.752f, 20.004f)
                horizontalLineTo(14.25f)
                curveTo(14.941f, 20.004f, 15.502f, 19.443f, 15.502f, 18.752f)
                close()
            }
        }.build()

        return _DataFunnel!!
    }

@Suppress("ObjectPropertyName")
private var _DataFunnel: ImageVector? = null

@Preview
@Composable
private fun DataFunnelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataFunnel, contentDescription = null)
    }
}
