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

public val FluentIcons.Filled.HapticStrong: ImageVector
    get() {
        if (_HapticStrong != null) {
            return _HapticStrong!!
        }
        _HapticStrong = ImageVector.Builder(
            name = "Filled.HapticStrong",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.001f, 21.25f)
                curveTo(9.932f, 21.25f, 9.862f, 21.243f, 9.796f, 21.229f)
                curveTo(9.254f, 21.116f, 4.5f, 20.032f, 4.5f, 16.871f)
                curveTo(4.5f, 15.056f, 6.103f, 14.187f, 7.273f, 13.553f)
                curveTo(8.347f, 12.97f, 9f, 12.574f, 9f, 11.992f)
                curveTo(9f, 11.41f, 8.348f, 11.016f, 7.273f, 10.435f)
                curveTo(6.101f, 9.8f, 4.5f, 8.932f, 4.5f, 7.12f)
                curveTo(4.5f, 3.961f, 9.255f, 2.883f, 9.797f, 2.771f)
                curveTo(9.863f, 2.757f, 9.931f, 2.75f, 9.999f, 2.75f)
                curveTo(10.471f, 2.75f, 10.883f, 3.084f, 10.978f, 3.546f)
                curveTo(11.033f, 3.807f, 10.982f, 4.074f, 10.836f, 4.297f)
                curveTo(10.69f, 4.521f, 10.465f, 4.674f, 10.204f, 4.729f)
                curveTo(9.043f, 4.973f, 6.499f, 5.913f, 6.499f, 7.12f)
                curveTo(6.499f, 7.7f, 7.151f, 8.095f, 8.225f, 8.676f)
                curveTo(9.397f, 9.31f, 10.999f, 10.178f, 10.999f, 11.991f)
                curveTo(10.999f, 13.804f, 9.396f, 14.675f, 8.226f, 15.309f)
                curveTo(7.152f, 15.892f, 6.499f, 16.288f, 6.499f, 16.87f)
                curveTo(6.499f, 18.099f, 8.995f, 19.018f, 10.203f, 19.27f)
                curveTo(10.742f, 19.383f, 11.09f, 19.914f, 10.978f, 20.453f)
                curveTo(10.88f, 20.914f, 10.469f, 21.249f, 9.999f, 21.249f)
                lineTo(10.001f, 21.25f)
                close()
                moveTo(18.979f, 20.454f)
                curveTo(19.09f, 19.914f, 18.743f, 19.384f, 18.204f, 19.271f)
                curveTo(16.996f, 19.019f, 14.5f, 18.1f, 14.5f, 16.871f)
                curveTo(14.5f, 16.289f, 15.152f, 15.893f, 16.227f, 15.31f)
                curveTo(17.398f, 14.676f, 19f, 13.807f, 19f, 11.992f)
                curveTo(19f, 10.177f, 17.397f, 9.311f, 16.226f, 8.677f)
                curveTo(15.153f, 8.095f, 14.5f, 7.701f, 14.5f, 7.121f)
                curveTo(14.5f, 5.913f, 17.044f, 4.974f, 18.205f, 4.73f)
                curveTo(18.466f, 4.675f, 18.69f, 4.522f, 18.837f, 4.298f)
                curveTo(18.983f, 4.074f, 19.033f, 3.807f, 18.979f, 3.547f)
                curveTo(18.883f, 3.086f, 18.471f, 2.751f, 18f, 2.751f)
                curveTo(17.932f, 2.751f, 17.863f, 2.758f, 17.798f, 2.772f)
                curveTo(17.256f, 2.884f, 12.501f, 3.962f, 12.501f, 7.121f)
                curveTo(12.501f, 8.933f, 14.103f, 9.801f, 15.274f, 10.436f)
                curveTo(16.348f, 11.017f, 17.001f, 11.412f, 17.001f, 11.993f)
                curveTo(17.001f, 12.574f, 16.349f, 12.971f, 15.274f, 13.554f)
                curveTo(14.103f, 14.188f, 12.501f, 15.057f, 12.501f, 16.872f)
                curveTo(12.501f, 20.034f, 17.255f, 21.117f, 17.797f, 21.23f)
                curveTo(17.863f, 21.244f, 17.933f, 21.251f, 18.002f, 21.251f)
                curveTo(18.472f, 21.251f, 18.883f, 20.917f, 18.981f, 20.455f)
                lineTo(18.979f, 20.454f)
                close()
            }
        }.build()

        return _HapticStrong!!
    }

@Suppress("ObjectPropertyName")
private var _HapticStrong: ImageVector? = null

@Preview
@Composable
private fun HapticStrongPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HapticStrong, contentDescription = null)
    }
}
