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

public val FluentIcons.Filled.LineStyleSketch: ImageVector
    get() {
        if (_LineStyleSketch != null) {
            return _LineStyleSketch!!
        }
        _LineStyleSketch = ImageVector.Builder(
            name = "Filled.LineStyleSketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 4f)
                curveTo(2.448f, 4f, 2f, 4.448f, 2f, 5f)
                curveTo(2f, 5.552f, 2.448f, 6f, 3f, 6f)
                horizontalLineTo(21f)
                curveTo(21.552f, 6f, 22f, 5.552f, 22f, 5f)
                curveTo(22f, 4.448f, 21.552f, 4f, 21f, 4f)
                horizontalLineTo(3f)
                close()
                moveTo(5.591f, 10.82f)
                curveTo(6.45f, 10.445f, 7.471f, 10f, 8.92f, 10f)
                curveTo(10.369f, 10f, 11.39f, 10.445f, 12.249f, 10.82f)
                lineTo(12.28f, 10.833f)
                curveTo(13.134f, 11.206f, 13.826f, 11.5f, 14.84f, 11.5f)
                curveTo(15.74f, 11.5f, 16.388f, 11.27f, 17.18f, 10.99f)
                curveTo(17.293f, 10.95f, 17.408f, 10.909f, 17.528f, 10.868f)
                curveTo(18.5f, 10.53f, 19.618f, 10.22f, 21.186f, 10.517f)
                curveTo(21.729f, 10.62f, 22.085f, 11.143f, 21.983f, 11.686f)
                curveTo(21.88f, 12.229f, 21.357f, 12.585f, 20.814f, 12.483f)
                curveTo(19.742f, 12.28f, 19.013f, 12.47f, 18.183f, 12.757f)
                curveTo(18.081f, 12.793f, 17.976f, 12.83f, 17.867f, 12.869f)
                curveTo(17.078f, 13.152f, 16.105f, 13.5f, 14.84f, 13.5f)
                curveTo(13.391f, 13.5f, 12.37f, 13.055f, 11.511f, 12.68f)
                lineTo(11.48f, 12.667f)
                curveTo(10.626f, 12.294f, 9.934f, 12f, 8.92f, 12f)
                curveTo(7.906f, 12f, 7.214f, 12.294f, 6.36f, 12.667f)
                lineTo(6.329f, 12.68f)
                curveTo(5.47f, 13.055f, 4.449f, 13.5f, 3f, 13.5f)
                curveTo(2.448f, 13.5f, 2f, 13.052f, 2f, 12.5f)
                curveTo(2f, 11.948f, 2.448f, 11.5f, 3f, 11.5f)
                curveTo(4.014f, 11.5f, 4.706f, 11.206f, 5.56f, 10.833f)
                lineTo(5.591f, 10.82f)
                close()
                moveTo(20.459f, 17.159f)
                curveTo(20.924f, 16.86f, 21.542f, 16.995f, 21.841f, 17.459f)
                curveTo(22.138f, 17.92f, 21.997f, 18.549f, 21.537f, 18.844f)
                curveTo(21.498f, 18.869f, 21.458f, 18.893f, 21.418f, 18.917f)
                curveTo(21.344f, 18.963f, 21.239f, 19.026f, 21.108f, 19.101f)
                curveTo(20.846f, 19.252f, 20.479f, 19.452f, 20.053f, 19.654f)
                curveTo(19.244f, 20.037f, 18.071f, 20.5f, 17f, 20.5f)
                curveTo(15.87f, 20.5f, 15.072f, 19.986f, 14.507f, 19.622f)
                lineTo(14.459f, 19.591f)
                curveTo(13.861f, 19.206f, 13.505f, 19f, 13f, 19f)
                curveTo(12.481f, 19f, 12.081f, 19.218f, 11.434f, 19.607f)
                lineTo(11.38f, 19.639f)
                curveTo(10.783f, 19.999f, 9.951f, 20.5f, 8.838f, 20.5f)
                curveTo(8.258f, 20.5f, 7.78f, 20.365f, 7.377f, 20.11f)
                curveTo(7.021f, 19.884f, 6.778f, 19.592f, 6.631f, 19.415f)
                lineTo(6.611f, 19.391f)
                curveTo(6.442f, 19.188f, 6.378f, 19.123f, 6.308f, 19.079f)
                curveTo(6.267f, 19.053f, 6.172f, 19f, 5.919f, 19f)
                curveTo(5.381f, 19f, 4.856f, 19.247f, 4.418f, 19.562f)
                curveTo(4.207f, 19.713f, 4.038f, 19.866f, 3.922f, 19.98f)
                curveTo(3.864f, 20.036f, 3.822f, 20.081f, 3.795f, 20.11f)
                curveTo(3.785f, 20.121f, 3.775f, 20.133f, 3.765f, 20.144f)
                curveTo(3.41f, 20.565f, 2.782f, 20.621f, 2.359f, 20.268f)
                curveTo(1.935f, 19.914f, 1.878f, 19.283f, 2.232f, 18.859f)
                lineTo(2.261f, 18.826f)
                curveTo(2.275f, 18.809f, 2.295f, 18.788f, 2.319f, 18.761f)
                curveTo(2.367f, 18.708f, 2.436f, 18.636f, 2.522f, 18.552f)
                curveTo(2.693f, 18.384f, 2.94f, 18.162f, 3.25f, 17.938f)
                curveTo(3.856f, 17.503f, 4.79f, 17f, 5.919f, 17f)
                curveTo(6.499f, 17f, 6.977f, 17.135f, 7.38f, 17.39f)
                curveTo(7.736f, 17.616f, 7.979f, 17.908f, 8.126f, 18.085f)
                lineTo(8.146f, 18.109f)
                curveTo(8.315f, 18.312f, 8.379f, 18.377f, 8.449f, 18.421f)
                curveTo(8.489f, 18.447f, 8.585f, 18.5f, 8.838f, 18.5f)
                curveTo(9.357f, 18.5f, 9.757f, 18.282f, 10.404f, 17.893f)
                lineTo(10.458f, 17.861f)
                curveTo(11.055f, 17.501f, 11.886f, 17f, 13f, 17f)
                curveTo(14.13f, 17f, 14.928f, 17.514f, 15.493f, 17.878f)
                lineTo(15.541f, 17.909f)
                curveTo(16.14f, 18.294f, 16.495f, 18.5f, 17f, 18.5f)
                curveTo(17.596f, 18.5f, 18.424f, 18.213f, 19.197f, 17.846f)
                curveTo(19.563f, 17.673f, 19.883f, 17.498f, 20.111f, 17.367f)
                curveTo(20.225f, 17.302f, 20.315f, 17.248f, 20.375f, 17.211f)
                curveTo(20.403f, 17.194f, 20.431f, 17.177f, 20.459f, 17.159f)
                close()
            }
        }.build()

        return _LineStyleSketch!!
    }

@Suppress("ObjectPropertyName")
private var _LineStyleSketch: ImageVector? = null

@Preview
@Composable
private fun LineStyleSketchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineStyleSketch, contentDescription = null)
    }
}
