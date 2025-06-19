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

public val FluentIcons.Regular.Classification: ImageVector
    get() {
        if (_Classification != null) {
            return _Classification!!
        }
        _Classification = ImageVector.Builder(
            name = "Regular.Classification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.572f, 5.184f)
                curveTo(15.037f, 4.348f, 15.566f, 3.484f, 16.025f, 3.025f)
                curveTo(17.392f, 1.658f, 19.608f, 1.658f, 20.975f, 3.025f)
                curveTo(22.342f, 4.392f, 22.342f, 6.608f, 20.975f, 7.975f)
                curveTo(20.516f, 8.434f, 19.652f, 8.963f, 18.815f, 9.428f)
                curveTo(18.151f, 9.797f, 17.445f, 10.157f, 16.843f, 10.454f)
                lineTo(19.051f, 12.661f)
                curveTo(20.32f, 13.931f, 20.32f, 15.988f, 19.051f, 17.258f)
                lineTo(16.672f, 19.636f)
                curveTo(16.184f, 20.124f, 15.392f, 20.124f, 14.904f, 19.636f)
                lineTo(14.498f, 19.23f)
                lineTo(12.387f, 21.342f)
                curveTo(11.508f, 22.221f, 10.083f, 22.221f, 9.205f, 21.343f)
                lineTo(2.659f, 14.798f)
                curveTo(1.78f, 13.919f, 1.78f, 12.495f, 2.659f, 11.616f)
                lineTo(4.771f, 9.504f)
                lineTo(4.366f, 9.098f)
                curveTo(3.878f, 8.61f, 3.878f, 7.819f, 4.366f, 7.33f)
                lineTo(6.745f, 4.952f)
                curveTo(8.014f, 3.683f, 10.072f, 3.683f, 11.341f, 4.952f)
                lineTo(13.546f, 7.157f)
                curveTo(13.843f, 6.555f, 14.203f, 5.848f, 14.572f, 5.184f)
                close()
                moveTo(5.832f, 10.564f)
                lineTo(3.72f, 12.677f)
                curveTo(3.427f, 12.969f, 3.427f, 13.444f, 3.72f, 13.737f)
                lineTo(10.265f, 20.282f)
                curveTo(10.558f, 20.575f, 11.033f, 20.575f, 11.326f, 20.282f)
                lineTo(13.438f, 18.17f)
                lineTo(5.832f, 10.564f)
                close()
                moveTo(18.087f, 8.117f)
                curveTo(18.947f, 7.639f, 19.626f, 7.202f, 19.914f, 6.914f)
                curveTo(20.695f, 6.133f, 20.695f, 4.867f, 19.914f, 4.086f)
                curveTo(19.133f, 3.305f, 17.867f, 3.305f, 17.086f, 4.086f)
                curveTo(16.798f, 4.374f, 16.361f, 5.053f, 15.883f, 5.913f)
                curveTo(15.432f, 6.724f, 14.99f, 7.611f, 14.668f, 8.279f)
                lineTo(15.721f, 9.332f)
                curveTo(16.389f, 9.01f, 17.276f, 8.567f, 18.087f, 8.117f)
                close()
                moveTo(10.28f, 6.012f)
                curveTo(9.597f, 5.329f, 8.489f, 5.329f, 7.805f, 6.012f)
                lineTo(5.604f, 8.214f)
                lineTo(15.788f, 18.399f)
                lineTo(17.99f, 16.197f)
                curveTo(18.673f, 15.514f, 18.673f, 14.405f, 17.99f, 13.722f)
                lineTo(10.28f, 6.012f)
                close()
            }
        }.build()

        return _Classification!!
    }

@Suppress("ObjectPropertyName")
private var _Classification: ImageVector? = null

@Preview
@Composable
private fun ClassificationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Classification, contentDescription = null)
    }
}
