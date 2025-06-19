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

public val FluentIcons.Filled.TextCaseLowercase: ImageVector
    get() {
        if (_TextCaseLowercase != null) {
            return _TextCaseLowercase!!
        }
        _TextCaseLowercase = ImageVector.Builder(
            name = "Filled.TextCaseLowercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15f, 4f)
                curveTo(15f, 3.448f, 14.552f, 3f, 14f, 3f)
                curveTo(13.448f, 3f, 13f, 3.448f, 13f, 4f)
                verticalLineTo(19.25f)
                curveTo(13f, 19.802f, 13.448f, 20.25f, 14f, 20.25f)
                curveTo(14.521f, 20.25f, 14.95f, 19.851f, 14.996f, 19.342f)
                curveTo(15.614f, 19.76f, 16.337f, 20f, 17.111f, 20f)
                curveTo(19.382f, 20f, 21.222f, 17.929f, 21.222f, 15.375f)
                curveTo(21.222f, 12.821f, 19.382f, 10.75f, 17.111f, 10.75f)
                curveTo(16.339f, 10.75f, 15.617f, 10.989f, 15f, 11.406f)
                verticalLineTo(4f)
                close()
                moveTo(17.111f, 18f)
                curveTo(16.16f, 18f, 15f, 17.053f, 15f, 15.375f)
                curveTo(15f, 13.697f, 16.16f, 12.75f, 17.111f, 12.75f)
                curveTo(18.062f, 12.75f, 19.222f, 13.697f, 19.222f, 15.375f)
                curveTo(19.222f, 17.053f, 18.062f, 18f, 17.111f, 18f)
                close()
                moveTo(11f, 19.26f)
                verticalLineTo(13.76f)
                lineTo(10.995f, 13.55f)
                lineTo(10.995f, 13.544f)
                curveTo(10.953f, 12.583f, 10.62f, 11.781f, 10.019f, 11.207f)
                curveTo(9.419f, 10.635f, 8.575f, 10.313f, 7.55f, 10.262f)
                lineTo(7.259f, 10.252f)
                lineTo(7.255f, 10.252f)
                curveTo(6.097f, 10.23f, 5.141f, 10.438f, 4.424f, 10.942f)
                curveTo(3.971f, 11.259f, 3.862f, 11.882f, 4.179f, 12.335f)
                curveTo(4.496f, 12.787f, 5.12f, 12.896f, 5.572f, 12.579f)
                curveTo(5.898f, 12.35f, 6.504f, 12.212f, 7.45f, 12.259f)
                curveTo(8.035f, 12.288f, 8.409f, 12.431f, 8.639f, 12.655f)
                curveTo(8.814f, 12.824f, 8.93f, 13.065f, 8.976f, 13.403f)
                curveTo(8.103f, 13.21f, 7.236f, 13.164f, 6.38f, 13.268f)
                curveTo(5.347f, 13.393f, 4.5f, 13.794f, 3.91f, 14.408f)
                curveTo(3.319f, 15.023f, 3f, 15.838f, 3f, 16.76f)
                curveTo(3f, 18.86f, 4.53f, 20.26f, 6.5f, 20.26f)
                curveTo(7.306f, 20.26f, 8.153f, 20.016f, 9.044f, 19.553f)
                curveTo(9.169f, 19.962f, 9.549f, 20.26f, 10f, 20.26f)
                horizontalLineTo(10.008f)
                lineTo(10.127f, 20.252f)
                lineTo(10.135f, 20.251f)
                curveTo(10.624f, 20.185f, 11f, 19.767f, 11f, 19.26f)
                close()
                moveTo(5f, 16.797f)
                curveTo(5f, 16.378f, 5.132f, 16.044f, 5.383f, 15.797f)
                curveTo(5.639f, 15.545f, 6.041f, 15.36f, 6.62f, 15.29f)
                curveTo(7.349f, 15.201f, 8.1f, 15.261f, 8.877f, 15.474f)
                lineTo(8.999f, 15.51f)
                verticalLineTo(17.282f)
                lineTo(8.862f, 17.375f)
                curveTo(7.897f, 18.013f, 7.109f, 18.297f, 6.5f, 18.297f)
                curveTo(6.034f, 18.297f, 5.663f, 18.151f, 5.411f, 17.904f)
                curveTo(5.159f, 17.658f, 5f, 17.289f, 5f, 16.797f)
                close()
            }
        }.build()

        return _TextCaseLowercase!!
    }

@Suppress("ObjectPropertyName")
private var _TextCaseLowercase: ImageVector? = null

@Preview
@Composable
private fun TextCaseLowercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextCaseLowercase, contentDescription = null)
    }
}
