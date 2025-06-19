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

public val FluentIcons.Regular.LocationRipple: ImageVector
    get() {
        if (_LocationRipple != null) {
            return _LocationRipple!!
        }
        _LocationRipple = ImageVector.Builder(
            name = "Regular.LocationRipple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(8.686f, 3.5f, 6f, 6.186f, 6f, 9.5f)
                curveTo(6f, 10.914f, 6.802f, 12.446f, 7.943f, 13.884f)
                curveTo(9.067f, 15.3f, 10.432f, 16.513f, 11.368f, 17.273f)
                curveTo(11.743f, 17.577f, 12.257f, 17.577f, 12.632f, 17.273f)
                curveTo(13.568f, 16.513f, 14.933f, 15.3f, 16.057f, 13.884f)
                curveTo(17.198f, 12.446f, 18f, 10.914f, 18f, 9.5f)
                curveTo(18f, 6.186f, 15.314f, 3.5f, 12f, 3.5f)
                close()
                moveTo(4.5f, 9.5f)
                curveTo(4.5f, 5.358f, 7.858f, 2f, 12f, 2f)
                curveTo(16.142f, 2f, 19.5f, 5.358f, 19.5f, 9.5f)
                curveTo(19.5f, 11.432f, 18.436f, 13.301f, 17.232f, 14.816f)
                curveTo(16.012f, 16.353f, 14.554f, 17.645f, 13.577f, 18.438f)
                curveTo(12.651f, 19.188f, 11.349f, 19.188f, 10.423f, 18.438f)
                curveTo(9.446f, 17.645f, 7.988f, 16.353f, 6.768f, 14.816f)
                curveTo(5.564f, 13.301f, 4.5f, 11.432f, 4.5f, 9.5f)
                close()
                moveTo(12f, 8f)
                curveTo(11.172f, 8f, 10.5f, 8.672f, 10.5f, 9.5f)
                curveTo(10.5f, 10.328f, 11.172f, 11f, 12f, 11f)
                curveTo(12.828f, 11f, 13.5f, 10.328f, 13.5f, 9.5f)
                curveTo(13.5f, 8.672f, 12.828f, 8f, 12f, 8f)
                close()
                moveTo(9f, 9.5f)
                curveTo(9f, 7.843f, 10.343f, 6.5f, 12f, 6.5f)
                curveTo(13.657f, 6.5f, 15f, 7.843f, 15f, 9.5f)
                curveTo(15f, 11.157f, 13.657f, 12.5f, 12f, 12.5f)
                curveTo(10.343f, 12.5f, 9f, 11.157f, 9f, 9.5f)
                close()
                moveTo(17.682f, 15.846f)
                curveTo(17.318f, 16.279f, 16.942f, 16.688f, 16.568f, 17.07f)
                curveTo(16.924f, 17.17f, 17.255f, 17.28f, 17.559f, 17.4f)
                curveTo(18.254f, 17.673f, 18.765f, 17.981f, 19.09f, 18.284f)
                curveTo(19.415f, 18.586f, 19.5f, 18.828f, 19.5f, 19f)
                curveTo(19.5f, 19.171f, 19.415f, 19.414f, 19.09f, 19.716f)
                curveTo(18.765f, 20.019f, 18.254f, 20.326f, 17.559f, 20.6f)
                curveTo(16.173f, 21.146f, 14.208f, 21.5f, 12f, 21.5f)
                curveTo(9.792f, 21.5f, 7.827f, 21.146f, 6.441f, 20.6f)
                curveTo(5.746f, 20.326f, 5.235f, 20.019f, 4.909f, 19.716f)
                curveTo(4.585f, 19.414f, 4.5f, 19.171f, 4.5f, 19f)
                curveTo(4.5f, 18.828f, 4.585f, 18.586f, 4.909f, 18.284f)
                curveTo(5.235f, 17.981f, 5.746f, 17.673f, 6.441f, 17.4f)
                curveTo(6.745f, 17.28f, 7.076f, 17.17f, 7.432f, 17.07f)
                curveTo(7.058f, 16.688f, 6.682f, 16.279f, 6.318f, 15.846f)
                curveTo(6.172f, 15.897f, 6.03f, 15.95f, 5.891f, 16.004f)
                curveTo(5.093f, 16.318f, 4.397f, 16.711f, 3.887f, 17.186f)
                curveTo(3.376f, 17.662f, 3f, 18.274f, 3f, 19f)
                curveTo(3f, 19.726f, 3.376f, 20.338f, 3.887f, 20.814f)
                curveTo(4.397f, 21.288f, 5.093f, 21.681f, 5.891f, 21.996f)
                curveTo(7.492f, 22.626f, 9.652f, 23f, 12f, 23f)
                curveTo(14.348f, 23f, 16.508f, 22.626f, 18.108f, 21.996f)
                curveTo(18.907f, 21.681f, 19.603f, 21.288f, 20.113f, 20.814f)
                curveTo(20.624f, 20.338f, 21f, 19.726f, 21f, 19f)
                curveTo(21f, 18.274f, 20.624f, 17.662f, 20.113f, 17.186f)
                curveTo(19.603f, 16.711f, 18.907f, 16.318f, 18.108f, 16.004f)
                curveTo(17.97f, 15.95f, 17.828f, 15.897f, 17.682f, 15.846f)
                close()
            }
        }.build()

        return _LocationRipple!!
    }

@Suppress("ObjectPropertyName")
private var _LocationRipple: ImageVector? = null

@Preview
@Composable
private fun LocationRipplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LocationRipple, contentDescription = null)
    }
}
