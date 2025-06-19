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

public val FluentIcons.Regular.PresenterOff: ImageVector
    get() {
        if (_PresenterOff != null) {
            return _PresenterOff!!
        }
        _PresenterOff = ImageVector.Builder(
            name = "Regular.PresenterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(8.074f, 9.135f)
                curveTo(7.443f, 9.4f, 7f, 10.023f, 7f, 10.75f)
                verticalLineTo(12f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.75f)
                lineTo(8.507f, 10.693f)
                curveTo(8.532f, 10.582f, 8.632f, 10.5f, 8.75f, 10.5f)
                horizontalLineTo(9.439f)
                lineTo(11.936f, 12.997f)
                horizontalLineTo(3.749f)
                curveTo(3.04f, 12.997f, 2.727f, 13.89f, 3.28f, 14.333f)
                lineTo(8f, 18.11f)
                verticalLineTo(19.755f)
                curveTo(8f, 20.997f, 9.007f, 22.005f, 10.25f, 22.005f)
                horizontalLineTo(13.745f)
                curveTo(14.988f, 22.005f, 15.995f, 20.997f, 15.995f, 19.755f)
                verticalLineTo(18.11f)
                lineTo(16.581f, 17.642f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.514f, 16.574f)
                lineTo(14.776f, 17.165f)
                curveTo(14.599f, 17.307f, 14.495f, 17.522f, 14.495f, 17.75f)
                verticalLineTo(19.755f)
                curveTo(14.495f, 20.169f, 14.16f, 20.505f, 13.745f, 20.505f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 20.505f, 9.5f, 20.169f, 9.5f, 19.755f)
                verticalLineTo(17.75f)
                curveTo(9.5f, 17.522f, 9.396f, 17.307f, 9.219f, 17.164f)
                lineTo(5.886f, 14.497f)
                horizontalLineTo(13.436f)
                lineTo(15.514f, 16.574f)
                close()
                moveTo(12f, 8f)
                curveTo(11.656f, 8f, 11.326f, 7.943f, 11.018f, 7.836f)
                lineTo(9.164f, 5.982f)
                curveTo(9.058f, 5.675f, 9f, 5.344f, 9f, 5.001f)
                curveTo(9f, 3.344f, 10.343f, 2f, 12f, 2f)
                curveTo(13.657f, 2f, 15f, 3.344f, 15f, 5.001f)
                curveTo(15f, 6.657f, 13.657f, 8f, 12f, 8f)
                close()
                moveTo(12f, 3.5f)
                curveTo(11.172f, 3.5f, 10.5f, 4.172f, 10.5f, 5.001f)
                curveTo(10.5f, 5.829f, 11.172f, 6.501f, 12f, 6.501f)
                curveTo(12.828f, 6.501f, 13.5f, 5.829f, 13.5f, 5.001f)
                curveTo(13.5f, 4.172f, 12.828f, 3.5f, 12f, 3.5f)
                close()
                moveTo(20.244f, 12.997f)
                horizontalLineTo(16.179f)
                lineTo(18.937f, 15.755f)
                lineTo(20.713f, 14.333f)
                curveTo(21.267f, 13.889f, 20.953f, 12.997f, 20.244f, 12.997f)
                close()
                moveTo(13.682f, 10.5f)
                lineTo(12.182f, 9f)
                horizontalLineTo(15.245f)
                curveTo(16.163f, 9f, 16.916f, 9.707f, 16.989f, 10.606f)
                lineTo(16.995f, 10.75f)
                verticalLineTo(12f)
                horizontalLineTo(15.495f)
                verticalLineTo(10.75f)
                curveTo(15.495f, 10.632f, 15.412f, 10.533f, 15.302f, 10.507f)
                lineTo(15.245f, 10.5f)
                horizontalLineTo(13.682f)
                close()
            }
        }.build()

        return _PresenterOff!!
    }

@Suppress("ObjectPropertyName")
private var _PresenterOff: ImageVector? = null

@Preview
@Composable
private fun PresenterOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PresenterOff, contentDescription = null)
    }
}
