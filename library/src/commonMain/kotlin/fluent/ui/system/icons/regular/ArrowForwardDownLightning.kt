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

public val FluentIcons.Regular.ArrowForwardDownLightning: ImageVector
    get() {
        if (_ArrowForwardDownLightning != null) {
            return _ArrowForwardDownLightning!!
        }
        _ArrowForwardDownLightning = ImageVector.Builder(
            name = "Regular.ArrowForwardDownLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.587f, 9.5f)
                lineTo(16.624f, 6.537f)
                curveTo(16.331f, 6.245f, 16.331f, 5.77f, 16.624f, 5.477f)
                curveTo(16.89f, 5.21f, 17.307f, 5.186f, 17.601f, 5.404f)
                lineTo(17.685f, 5.477f)
                lineTo(21.927f, 9.719f)
                curveTo(22.194f, 9.986f, 22.218f, 10.402f, 22f, 10.696f)
                lineTo(21.927f, 10.78f)
                lineTo(17.685f, 15.023f)
                curveTo(17.392f, 15.316f, 16.917f, 15.316f, 16.624f, 15.023f)
                curveTo(16.358f, 14.756f, 16.334f, 14.34f, 16.552f, 14.046f)
                lineTo(16.624f, 13.962f)
                lineTo(19.587f, 11f)
                lineTo(13.897f, 11f)
                curveTo(9.699f, 11f, 6.281f, 7.662f, 6.151f, 3.496f)
                lineTo(6.147f, 3.25f)
                curveTo(6.147f, 2.836f, 6.483f, 2.5f, 6.897f, 2.5f)
                curveTo(7.311f, 2.5f, 7.647f, 2.836f, 7.647f, 3.25f)
                curveTo(7.647f, 6.625f, 10.323f, 9.375f, 13.668f, 9.496f)
                lineTo(13.897f, 9.5f)
                lineTo(19.587f, 9.5f)
                close()
                moveTo(5.318f, 12f)
                horizontalLineTo(10.145f)
                curveTo(10.528f, 12f, 10.769f, 12.412f, 10.581f, 12.745f)
                lineTo(8.75f, 16f)
                horizontalLineTo(10.246f)
                curveTo(10.891f, 16f, 11.235f, 16.759f, 10.811f, 17.244f)
                lineTo(5.987f, 22.752f)
                curveTo(5.482f, 23.328f, 4.544f, 22.837f, 4.729f, 22.094f)
                lineTo(5.5f, 19f)
                horizontalLineTo(2.498f)
                curveTo(2.131f, 19f, 1.889f, 18.619f, 2.045f, 18.287f)
                lineTo(4.865f, 12.287f)
                curveTo(4.948f, 12.112f, 5.124f, 12f, 5.318f, 12f)
                close()
            }
        }.build()

        return _ArrowForwardDownLightning!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowForwardDownLightning: ImageVector? = null

@Preview
@Composable
private fun ArrowForwardDownLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowForwardDownLightning, contentDescription = null)
    }
}
