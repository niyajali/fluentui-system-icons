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

public val FluentIcons.Regular.PersonAvailable: ImageVector
    get() {
        if (_PersonAvailable != null) {
            return _PersonAvailable!!
        }
        _PersonAvailable = ImageVector.Builder(
            name = "Regular.PersonAvailable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(14.854f, 17.147f)
                curveTo(14.659f, 16.951f, 14.342f, 16.951f, 14.147f, 17.147f)
                curveTo(13.951f, 17.342f, 13.951f, 17.659f, 14.147f, 17.854f)
                lineTo(16.147f, 19.854f)
                curveTo(16.342f, 20.049f, 16.659f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.659f, 21.049f, 15.342f, 20.854f, 15.147f)
                curveTo(20.659f, 14.951f, 20.342f, 14.951f, 20.147f, 15.147f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.147f)
                close()
                moveTo(12.023f, 14f)
                curveTo(11.726f, 14.463f, 11.486f, 14.966f, 11.314f, 15.5f)
                lineTo(4.253f, 15.5f)
                curveTo(3.839f, 15.5f, 3.504f, 15.835f, 3.504f, 16.249f)
                verticalLineTo(16.827f)
                curveTo(3.504f, 17.362f, 3.695f, 17.881f, 4.043f, 18.288f)
                curveTo(5.296f, 19.756f, 7.262f, 20.501f, 10f, 20.501f)
                curveTo(10.597f, 20.501f, 11.157f, 20.466f, 11.681f, 20.395f)
                curveTo(11.926f, 20.89f, 12.233f, 21.349f, 12.592f, 21.762f)
                curveTo(11.797f, 21.922f, 10.932f, 22.001f, 10f, 22.001f)
                curveTo(6.854f, 22.001f, 4.468f, 21.096f, 2.902f, 19.262f)
                curveTo(2.322f, 18.583f, 2.004f, 17.719f, 2.004f, 16.827f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
                moveTo(10f, 3.505f)
                curveTo(8.067f, 3.505f, 6.5f, 5.072f, 6.5f, 7.005f)
                curveTo(6.5f, 8.938f, 8.067f, 10.505f, 10f, 10.505f)
                curveTo(11.933f, 10.505f, 13.5f, 8.938f, 13.5f, 7.005f)
                curveTo(13.5f, 5.072f, 11.933f, 3.505f, 10f, 3.505f)
                close()
            }
        }.build()

        return _PersonAvailable!!
    }

@Suppress("ObjectPropertyName")
private var _PersonAvailable: ImageVector? = null

@Preview
@Composable
private fun PersonAvailablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonAvailable, contentDescription = null)
    }
}
