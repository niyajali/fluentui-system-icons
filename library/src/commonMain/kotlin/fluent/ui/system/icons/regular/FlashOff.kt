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

public val FluentIcons.Regular.FlashOff: ImageVector
    get() {
        if (_FlashOff != null) {
            return _FlashOff!!
        }
        _FlashOff = ImageVector.Builder(
            name = "Regular.FlashOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.939f, 7f)
                lineTo(2.22f, 3.28f)
                curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
                curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
                lineTo(21.78f, 20.72f)
                curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
                curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
                lineTo(14.436f, 15.497f)
                lineTo(8.585f, 21.536f)
                curveTo(7.531f, 22.624f, 5.713f, 21.642f, 6.044f, 20.164f)
                lineTo(7.313f, 14.496f)
                lineTo(5.745f, 14.49f)
                curveTo(4.538f, 14.486f, 3.698f, 13.29f, 4.103f, 12.153f)
                lineTo(5.939f, 7f)
                close()
                moveTo(13.375f, 14.436f)
                lineTo(7.113f, 8.174f)
                lineTo(5.516f, 12.656f)
                curveTo(5.458f, 12.819f, 5.578f, 12.99f, 5.751f, 12.99f)
                lineTo(8.252f, 13f)
                curveTo(8.479f, 13.001f, 8.694f, 13.105f, 8.835f, 13.282f)
                curveTo(8.977f, 13.46f, 9.03f, 13.692f, 8.981f, 13.914f)
                lineTo(7.508f, 20.492f)
                lineTo(13.375f, 14.436f)
                close()
                moveTo(18.158f, 9.5f)
                lineTo(15.463f, 12.281f)
                lineTo(16.524f, 13.342f)
                lineTo(19.646f, 10.12f)
                curveTo(20.414f, 9.327f, 19.852f, 8f, 18.748f, 8f)
                horizontalLineTo(14.79f)
                lineTo(16.241f, 3.645f)
                curveTo(16.511f, 2.836f, 15.908f, 2f, 15.055f, 2f)
                horizontalLineTo(8.602f)
                curveTo(8.073f, 2f, 7.601f, 2.333f, 7.424f, 2.831f)
                lineTo(7.053f, 3.872f)
                lineTo(8.227f, 5.046f)
                lineTo(8.778f, 3.5f)
                horizontalLineTo(14.708f)
                lineTo(13.037f, 8.513f)
                curveTo(12.961f, 8.742f, 13f, 8.993f, 13.141f, 9.189f)
                curveTo(13.281f, 9.384f, 13.508f, 9.5f, 13.749f, 9.5f)
                horizontalLineTo(18.158f)
                close()
            }
        }.build()

        return _FlashOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOff: ImageVector? = null

@Preview
@Composable
private fun FlashOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FlashOff, contentDescription = null)
    }
}
