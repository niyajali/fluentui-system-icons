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

public val FluentIcons.Filled.CubeCheckmark: ImageVector
    get() {
        if (_CubeCheckmark != null) {
            return _CubeCheckmark!!
        }
        _CubeCheckmark = ImageVector.Builder(
            name = "Filled.CubeCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.409f, 2.512f)
                curveTo(12.505f, 2.146f, 11.495f, 2.146f, 10.591f, 2.512f)
                lineTo(3.093f, 5.552f)
                curveTo(2.432f, 5.82f, 2f, 6.461f, 2f, 7.174f)
                verticalLineTo(16.826f)
                curveTo(2f, 17.539f, 2.432f, 18.181f, 3.093f, 18.448f)
                lineTo(10.591f, 21.488f)
                curveTo(11.219f, 21.743f, 11.898f, 21.82f, 12.557f, 21.721f)
                curveTo(11.586f, 20.586f, 11f, 19.111f, 11f, 17.5f)
                curveTo(11f, 16.879f, 11.087f, 16.278f, 11.25f, 15.709f)
                verticalLineTo(10.759f)
                lineTo(6.484f, 8.951f)
                curveTo(6.097f, 8.804f, 5.902f, 8.371f, 6.049f, 7.984f)
                curveTo(6.196f, 7.597f, 6.629f, 7.402f, 7.016f, 7.549f)
                lineTo(12f, 9.44f)
                lineTo(16.984f, 7.549f)
                curveTo(17.371f, 7.402f, 17.804f, 7.597f, 17.951f, 7.984f)
                curveTo(18.098f, 8.371f, 17.903f, 8.804f, 17.516f, 8.951f)
                lineTo(12.75f, 10.759f)
                verticalLineTo(13.063f)
                curveTo(13.936f, 11.793f, 15.625f, 11f, 17.5f, 11f)
                curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
                verticalLineTo(7.174f)
                curveTo(22f, 6.461f, 21.568f, 5.82f, 20.907f, 5.552f)
                lineTo(13.409f, 2.512f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                close()
            }
        }.build()

        return _CubeCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _CubeCheckmark: ImageVector? = null

@Preview
@Composable
private fun CubeCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CubeCheckmark, contentDescription = null)
    }
}
