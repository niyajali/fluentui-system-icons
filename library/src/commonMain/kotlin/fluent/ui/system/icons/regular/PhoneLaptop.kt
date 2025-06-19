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

public val FluentIcons.Regular.PhoneLaptop: ImageVector
    get() {
        if (_PhoneLaptop != null) {
            return _PhoneLaptop!!
        }
        _PhoneLaptop = ImageVector.Builder(
            name = "Regular.PhoneLaptop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.254f, 8.003f)
                curveTo(9.221f, 8.003f, 10.004f, 8.786f, 10.004f, 9.753f)
                verticalLineTo(19.253f)
                curveTo(10.004f, 20.219f, 9.221f, 21.003f, 8.254f, 21.003f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 21.003f, 2f, 20.219f, 2f, 19.253f)
                verticalLineTo(9.753f)
                curveTo(2f, 8.786f, 2.783f, 8.003f, 3.75f, 8.003f)
                horizontalLineTo(8.254f)
                close()
                moveTo(8.254f, 9.503f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 9.503f, 3.5f, 9.615f, 3.5f, 9.753f)
                verticalLineTo(19.253f)
                curveTo(3.5f, 19.391f, 3.612f, 19.503f, 3.75f, 19.503f)
                horizontalLineTo(8.254f)
                curveTo(8.393f, 19.503f, 8.504f, 19.391f, 8.504f, 19.253f)
                verticalLineTo(9.753f)
                curveTo(8.504f, 9.615f, 8.393f, 9.503f, 8.254f, 9.503f)
                close()
                moveTo(6.252f, 17f)
                curveTo(6.666f, 17f, 7.002f, 17.335f, 7.002f, 17.75f)
                curveTo(7.002f, 18.129f, 6.72f, 18.443f, 6.354f, 18.493f)
                lineTo(6.252f, 18.5f)
                horizontalLineTo(5.752f)
                curveTo(5.338f, 18.5f, 5.002f, 18.164f, 5.002f, 17.75f)
                curveTo(5.002f, 17.37f, 5.284f, 17.056f, 5.65f, 17.007f)
                lineTo(5.752f, 17f)
                horizontalLineTo(6.252f)
                close()
                moveTo(21.249f, 16.5f)
                curveTo(21.664f, 16.5f, 21.999f, 16.835f, 21.999f, 17.25f)
                curveTo(21.999f, 17.629f, 21.717f, 17.943f, 21.351f, 17.993f)
                lineTo(21.249f, 18f)
                lineTo(11f, 17.999f)
                verticalLineTo(16.499f)
                lineTo(21.249f, 16.5f)
                close()
                moveTo(18.25f, 5f)
                curveTo(19.216f, 5f, 20f, 5.784f, 20f, 6.75f)
                verticalLineTo(14.25f)
                curveTo(20f, 15.217f, 19.216f, 16f, 18.25f, 16f)
                lineTo(11f, 16f)
                verticalLineTo(14.5f)
                lineTo(18.25f, 14.5f)
                curveTo(18.388f, 14.5f, 18.5f, 14.388f, 18.5f, 14.25f)
                verticalLineTo(6.75f)
                curveTo(18.5f, 6.612f, 18.388f, 6.5f, 18.25f, 6.5f)
                horizontalLineTo(5.75f)
                curveTo(5.612f, 6.5f, 5.5f, 6.612f, 5.5f, 6.75f)
                lineTo(5.499f, 6.999f)
                horizontalLineTo(4f)
                verticalLineTo(6.75f)
                curveTo(4f, 5.784f, 4.784f, 5f, 5.75f, 5f)
                horizontalLineTo(18.25f)
                close()
            }
        }.build()

        return _PhoneLaptop!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneLaptop: ImageVector? = null

@Preview
@Composable
private fun PhoneLaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneLaptop, contentDescription = null)
    }
}
