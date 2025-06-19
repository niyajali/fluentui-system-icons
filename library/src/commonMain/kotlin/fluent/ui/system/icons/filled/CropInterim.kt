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

public val FluentIcons.Filled.CropInterim: ImageVector
    get() {
        if (_CropInterim != null) {
            return _CropInterim!!
        }
        _CropInterim = ImageVector.Builder(
            name = "Filled.CropInterim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.671f, 9.104f)
                curveTo(19.704f, 9.654f, 22.004f, 12.308f, 22.004f, 15.5f)
                curveTo(22.004f, 19.09f, 19.094f, 22f, 15.505f, 22f)
                curveTo(14.022f, 22f, 12.621f, 21.5f, 11.497f, 20.618f)
                lineTo(11.496f, 21.25f)
                curveTo(11.496f, 21.63f, 11.214f, 21.944f, 10.848f, 21.993f)
                lineTo(10.746f, 22f)
                curveTo(10.366f, 22f, 10.053f, 21.718f, 10.003f, 21.352f)
                lineTo(9.996f, 21.25f)
                verticalLineTo(18.751f)
                curveTo(9.996f, 18.372f, 10.278f, 18.058f, 10.644f, 18.008f)
                lineTo(10.746f, 18.001f)
                horizontalLineTo(13.251f)
                curveTo(13.665f, 18.001f, 14.001f, 18.337f, 14.001f, 18.751f)
                curveTo(14.001f, 19.131f, 13.719f, 19.445f, 13.352f, 19.494f)
                lineTo(13.251f, 19.501f)
                lineTo(12.507f, 19.503f)
                curveTo(13.356f, 20.14f, 14.4f, 20.5f, 15.505f, 20.5f)
                curveTo(18.266f, 20.5f, 20.504f, 18.261f, 20.504f, 15.5f)
                curveTo(20.504f, 13.229f, 18.991f, 11.312f, 16.918f, 10.703f)
                lineTo(16.671f, 9.104f)
                close()
                moveTo(14.486f, 3.004f)
                curveTo(15.867f, 3.004f, 16.986f, 4.123f, 16.986f, 5.504f)
                curveTo(16.986f, 6.539f, 16.357f, 7.428f, 15.46f, 7.807f)
                lineTo(16.278f, 13.122f)
                curveTo(17.28f, 13.448f, 18.004f, 14.389f, 18.004f, 15.5f)
                curveTo(18.004f, 16.881f, 16.885f, 18f, 15.505f, 18f)
                curveTo(14.687f, 18f, 13.961f, 17.608f, 13.505f, 17.001f)
                horizontalLineTo(6.499f)
                curveTo(6.043f, 17.608f, 5.317f, 18f, 4.5f, 18f)
                curveTo(3.119f, 18f, 2f, 16.881f, 2f, 15.5f)
                curveTo(2f, 14.391f, 2.722f, 13.451f, 3.722f, 13.123f)
                lineTo(4.539f, 7.812f)
                curveTo(3.635f, 7.436f, 3f, 6.544f, 3f, 5.504f)
                curveTo(3f, 4.123f, 4.119f, 3.004f, 5.5f, 3.004f)
                curveTo(6.316f, 3.004f, 7.041f, 3.395f, 7.497f, 4f)
                horizontalLineTo(12.489f)
                curveTo(12.945f, 3.395f, 13.67f, 3.004f, 14.486f, 3.004f)
                close()
                moveTo(11.986f, 5.5f)
                horizontalLineTo(8f)
                curveTo(8f, 6.701f, 7.159f, 7.701f, 6.036f, 7.946f)
                lineTo(5.241f, 13.111f)
                curveTo(6.203f, 13.41f, 6.917f, 14.274f, 6.993f, 15.314f)
                lineTo(7f, 15.5f)
                horizontalLineTo(13.005f)
                curveTo(13.005f, 14.38f, 13.741f, 13.432f, 14.757f, 13.114f)
                lineTo(13.964f, 7.949f)
                curveTo(12.887f, 7.72f, 12.068f, 6.799f, 11.992f, 5.674f)
                lineTo(11.986f, 5.5f)
                close()
            }
        }.build()

        return _CropInterim!!
    }

@Suppress("ObjectPropertyName")
private var _CropInterim: ImageVector? = null

@Preview
@Composable
private fun CropInterimPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CropInterim, contentDescription = null)
    }
}
