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

public val FluentIcons.Filled.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Filled.Umbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.248f, 10.913f)
                curveTo(10.721f, 10.514f, 11.325f, 10.179f, 12f, 10.179f)
                curveTo(12.675f, 10.179f, 13.279f, 10.514f, 13.752f, 10.913f)
                curveTo(13.982f, 11.107f, 14.165f, 11.303f, 14.289f, 11.45f)
                curveTo(14.351f, 11.523f, 14.397f, 11.582f, 14.427f, 11.622f)
                lineTo(14.463f, 11.672f)
                curveTo(14.603f, 11.878f, 14.835f, 12f, 15.083f, 12f)
                curveTo(15.332f, 12f, 15.564f, 11.876f, 15.704f, 11.671f)
                curveTo(15.733f, 11.632f, 15.816f, 11.523f, 15.877f, 11.45f)
                curveTo(16.002f, 11.303f, 16.184f, 11.107f, 16.415f, 10.913f)
                curveTo(16.888f, 10.514f, 17.491f, 10.179f, 18.167f, 10.179f)
                curveTo(18.842f, 10.179f, 19.446f, 10.514f, 19.918f, 10.913f)
                curveTo(20.149f, 11.107f, 20.332f, 11.303f, 20.456f, 11.45f)
                lineTo(20.629f, 11.671f)
                curveTo(20.814f, 11.943f, 21.155f, 12.064f, 21.47f, 11.967f)
                curveTo(21.785f, 11.87f, 22f, 11.58f, 22f, 11.25f)
                curveTo(22f, 6.575f, 17.953f, 2f, 12f, 2f)
                curveTo(6.047f, 2f, 2f, 6.575f, 2f, 11.25f)
                curveTo(2f, 11.58f, 2.215f, 11.87f, 2.53f, 11.967f)
                curveTo(2.845f, 12.064f, 3.186f, 11.943f, 3.371f, 11.671f)
                lineTo(3.544f, 11.45f)
                curveTo(3.668f, 11.303f, 3.851f, 11.107f, 4.082f, 10.913f)
                curveTo(4.554f, 10.514f, 5.158f, 10.179f, 5.833f, 10.179f)
                curveTo(6.509f, 10.179f, 7.113f, 10.514f, 7.585f, 10.913f)
                curveTo(7.816f, 11.107f, 7.998f, 11.303f, 8.123f, 11.45f)
                curveTo(8.184f, 11.523f, 8.266f, 11.632f, 8.296f, 11.671f)
                curveTo(8.436f, 11.876f, 8.668f, 12f, 8.917f, 12f)
                curveTo(9.165f, 12f, 9.397f, 11.878f, 9.537f, 11.672f)
                lineTo(9.573f, 11.622f)
                curveTo(9.603f, 11.582f, 9.649f, 11.523f, 9.711f, 11.45f)
                curveTo(9.835f, 11.303f, 10.018f, 11.107f, 10.248f, 10.913f)
                close()
                moveTo(12f, 11.179f)
                curveTo(11.764f, 11.179f, 11.51f, 11.261f, 11.25f, 11.418f)
                verticalLineTo(19f)
                curveTo(11.25f, 19.829f, 10.578f, 20.5f, 9.75f, 20.5f)
                curveTo(8.922f, 20.5f, 8.25f, 19.829f, 8.25f, 19f)
                verticalLineTo(18.75f)
                curveTo(8.25f, 18.336f, 7.914f, 18f, 7.5f, 18f)
                curveTo(7.086f, 18f, 6.75f, 18.336f, 6.75f, 18.75f)
                verticalLineTo(19f)
                curveTo(6.75f, 20.657f, 8.093f, 22f, 9.75f, 22f)
                curveTo(11.407f, 22f, 12.75f, 20.657f, 12.75f, 19f)
                verticalLineTo(11.418f)
                curveTo(12.49f, 11.261f, 12.236f, 11.179f, 12f, 11.179f)
                close()
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null

@Preview
@Composable
private fun UmbrellaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Umbrella, contentDescription = null)
    }
}
