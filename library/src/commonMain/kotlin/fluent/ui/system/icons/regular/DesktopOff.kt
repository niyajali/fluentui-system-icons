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

public val FluentIcons.Regular.DesktopOff: ImageVector
    get() {
        if (_DesktopOff != null) {
            return _DesktopOff!!
        }
        _DesktopOff = ImageVector.Builder(
            name = "Regular.DesktopOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(2.629f, 3.689f)
                curveTo(2.239f, 4.094f, 2f, 4.644f, 2f, 5.25f)
                verticalLineTo(15.752f)
                lineTo(2.005f, 15.906f)
                curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
                lineTo(8.499f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(6.75f, 20.5f)
                lineTo(6.648f, 20.507f)
                curveTo(6.282f, 20.556f, 6f, 20.87f, 6f, 21.25f)
                curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 21.993f)
                curveTo(17.718f, 21.944f, 18f, 21.63f, 18f, 21.25f)
                curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
                lineTo(15.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(16.941f, 18.002f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.441f, 16.502f)
                horizontalLineTo(4.25f)
                lineTo(4.148f, 16.495f)
                curveTo(3.782f, 16.445f, 3.5f, 16.132f, 3.5f, 15.752f)
                verticalLineTo(5.25f)
                lineTo(3.507f, 5.148f)
                curveTo(3.527f, 4.996f, 3.593f, 4.859f, 3.69f, 4.751f)
                lineTo(15.441f, 16.502f)
                close()
                moveTo(19.749f, 16.502f)
                horizontalLineTo(19.684f)
                lineTo(20.879f, 17.698f)
                curveTo(21.549f, 17.308f, 21.999f, 16.582f, 21.999f, 15.752f)
                verticalLineTo(5.25f)
                lineTo(21.994f, 5.096f)
                curveTo(21.914f, 3.925f, 20.94f, 3f, 19.749f, 3f)
                horizontalLineTo(6.182f)
                lineTo(7.682f, 4.5f)
                horizontalLineTo(19.749f)
                lineTo(19.851f, 4.506f)
                curveTo(20.217f, 4.556f, 20.499f, 4.87f, 20.499f, 5.25f)
                verticalLineTo(15.752f)
                lineTo(20.492f, 15.854f)
                curveTo(20.442f, 16.22f, 20.128f, 16.502f, 19.749f, 16.502f)
                close()
                moveTo(13.998f, 18.002f)
                lineTo(13.999f, 20.5f)
                horizontalLineTo(9.999f)
                lineTo(9.998f, 18.002f)
                horizontalLineTo(13.998f)
                close()
            }
        }.build()

        return _DesktopOff!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopOff: ImageVector? = null

@Preview
@Composable
private fun DesktopOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DesktopOff, contentDescription = null)
    }
}
