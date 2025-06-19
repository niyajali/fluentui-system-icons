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

public val FluentIcons.Filled.BotAdd: ImageVector
    get() {
        if (_BotAdd != null) {
            return _BotAdd!!
        }
        _BotAdd = ImageVector.Builder(
            name = "Filled.BotAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 17.5f)
                curveTo(11f, 16.211f, 11.375f, 15.01f, 12.022f, 14f)
                horizontalLineTo(6.254f)
                curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.25f)
                verticalLineTo(17.157f)
                curveTo(4.004f, 18.25f, 4.481f, 19.288f, 5.309f, 20.001f)
                curveTo(6.872f, 21.344f, 9.111f, 22.001f, 12f, 22.001f)
                curveTo(12.271f, 22.001f, 12.535f, 21.995f, 12.794f, 21.984f)
                curveTo(11.682f, 20.817f, 11f, 19.238f, 11f, 17.5f)
                close()
                moveTo(17.5f, 11f)
                curveTo(17.789f, 11f, 18.074f, 11.019f, 18.354f, 11.056f)
                curveTo(18.448f, 10.807f, 18.5f, 10.537f, 18.5f, 10.255f)
                verticalLineTo(5.75f)
                curveTo(18.5f, 4.507f, 17.493f, 3.5f, 16.25f, 3.5f)
                lineTo(12.75f, 3.499f)
                lineTo(12.751f, 2.75f)
                lineTo(12.744f, 2.649f)
                curveTo(12.694f, 2.283f, 12.38f, 2f, 12.001f, 2f)
                lineTo(11.899f, 2.007f)
                curveTo(11.533f, 2.057f, 11.251f, 2.371f, 11.251f, 2.75f)
                lineTo(11.25f, 3.499f)
                lineTo(7.75f, 3.5f)
                curveTo(6.508f, 3.5f, 5.5f, 4.507f, 5.5f, 5.75f)
                verticalLineTo(10.255f)
                curveTo(5.5f, 11.497f, 6.508f, 12.505f, 7.75f, 12.505f)
                horizontalLineTo(13.341f)
                curveTo(14.468f, 11.565f, 15.918f, 11f, 17.5f, 11f)
                close()
                moveTo(9.75f, 6.5f)
                curveTo(10.44f, 6.5f, 10.999f, 7.059f, 10.999f, 7.749f)
                curveTo(10.999f, 8.439f, 10.44f, 8.999f, 9.75f, 8.999f)
                curveTo(9.06f, 8.999f, 8.5f, 8.439f, 8.5f, 7.749f)
                curveTo(8.5f, 7.059f, 9.06f, 6.5f, 9.75f, 6.5f)
                close()
                moveTo(14.242f, 6.5f)
                curveTo(14.932f, 6.5f, 15.492f, 7.059f, 15.492f, 7.749f)
                curveTo(15.492f, 8.439f, 14.932f, 8.999f, 14.242f, 8.999f)
                curveTo(13.552f, 8.999f, 12.993f, 8.439f, 12.993f, 7.749f)
                curveTo(12.993f, 7.059f, 13.552f, 6.5f, 14.242f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(18.001f, 18f)
                lineTo(18.001f, 20.503f)
                curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
                curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
                lineTo(17.001f, 18f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
                curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
                horizontalLineTo(17f)
                lineTo(17f, 14.499f)
                curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
                curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
                lineTo(18f, 17f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
                curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
                horizontalLineTo(18.001f)
                close()
            }
        }.build()

        return _BotAdd!!
    }

@Suppress("ObjectPropertyName")
private var _BotAdd: ImageVector? = null

@Preview
@Composable
private fun BotAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BotAdd, contentDescription = null)
    }
}
