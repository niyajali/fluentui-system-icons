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

public val FluentIcons.Filled.DualScreenMirror: ImageVector
    get() {
        if (_DualScreenMirror != null) {
            return _DualScreenMirror!!
        }
        _DualScreenMirror = ImageVector.Builder(
            name = "Filled.DualScreenMirror",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.253f, 4.004f)
                curveTo(21.219f, 4.004f, 22.003f, 4.788f, 22.003f, 5.754f)
                verticalLineTo(18.25f)
                curveTo(22.003f, 19.216f, 21.219f, 20f, 20.253f, 20f)
                horizontalLineTo(13.005f)
                curveTo(12.919f, 20f, 12.833f, 19.993f, 12.75f, 19.981f)
                lineTo(12.75f, 4.023f)
                curveTo(12.833f, 4.011f, 12.919f, 4.004f, 13.005f, 4.004f)
                horizontalLineTo(20.253f)
                close()
                moveTo(18.172f, 9.415f)
                curveTo(18.045f, 9.161f, 17.785f, 9.001f, 17.501f, 9.001f)
                curveTo(17.217f, 9.001f, 16.957f, 9.161f, 16.83f, 9.415f)
                lineTo(14.58f, 13.915f)
                curveTo(14.464f, 14.148f, 14.476f, 14.424f, 14.613f, 14.645f)
                curveTo(14.749f, 14.866f, 14.991f, 15.001f, 15.251f, 15.001f)
                horizontalLineTo(19.751f)
                curveTo(20.011f, 15.001f, 20.252f, 14.866f, 20.389f, 14.645f)
                curveTo(20.525f, 14.424f, 20.538f, 14.148f, 20.422f, 13.915f)
                lineTo(18.172f, 9.415f)
                close()
                moveTo(11.005f, 4.002f)
                curveTo(11.089f, 4.002f, 11.171f, 4.008f, 11.251f, 4.019f)
                lineTo(11.251f, 19.98f)
                curveTo(11.17f, 19.991f, 11.089f, 19.997f, 11.005f, 19.997f)
                horizontalLineTo(3.758f)
                curveTo(2.791f, 19.997f, 2.008f, 19.214f, 2.008f, 18.247f)
                verticalLineTo(5.752f)
                curveTo(2.008f, 4.785f, 2.791f, 4.002f, 3.758f, 4.002f)
                horizontalLineTo(11.005f)
                close()
                moveTo(7.172f, 9.415f)
                curveTo(7.045f, 9.161f, 6.785f, 9.001f, 6.501f, 9.001f)
                curveTo(6.217f, 9.001f, 5.957f, 9.161f, 5.83f, 9.415f)
                lineTo(3.58f, 13.915f)
                curveTo(3.464f, 14.148f, 3.476f, 14.424f, 3.613f, 14.645f)
                curveTo(3.749f, 14.866f, 3.991f, 15.001f, 4.251f, 15.001f)
                horizontalLineTo(8.751f)
                curveTo(9.011f, 15.001f, 9.252f, 14.866f, 9.389f, 14.645f)
                curveTo(9.525f, 14.424f, 9.538f, 14.148f, 9.422f, 13.915f)
                lineTo(7.172f, 9.415f)
                close()
            }
        }.build()

        return _DualScreenMirror!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenMirror: ImageVector? = null

@Preview
@Composable
private fun DualScreenMirrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreenMirror, contentDescription = null)
    }
}
