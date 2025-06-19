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

public val FluentIcons.Regular.BoardHeart: ImageVector
    get() {
        if (_BoardHeart != null) {
            return _BoardHeart!!
        }
        _BoardHeart = ImageVector.Builder(
            name = "Regular.BoardHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.496f, 5.564f)
                curveTo(21.401f, 3.854f, 19.984f, 2.498f, 18.251f, 2.498f)
                horizontalLineTo(6.251f)
                curveTo(4.456f, 2.498f, 3.001f, 3.953f, 3.001f, 5.748f)
                lineTo(3f, 17.752f)
                lineTo(3.005f, 17.936f)
                curveTo(3.101f, 19.645f, 4.517f, 21.002f, 6.25f, 21.002f)
                horizontalLineTo(13.366f)
                lineTo(11.915f, 19.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(19.501f)
                lineTo(6.25f, 19.502f)
                curveTo(5.338f, 19.502f, 4.588f, 18.804f, 4.507f, 17.912f)
                lineTo(4.5f, 17.752f)
                lineTo(4.5f, 9.499f)
                lineTo(11.5f, 9.498f)
                verticalLineTo(12.173f)
                curveTo(11.949f, 11.76f, 12.46f, 11.456f, 13f, 11.261f)
                verticalLineTo(3.997f)
                lineTo(18.251f, 3.998f)
                curveTo(19.164f, 3.998f, 19.913f, 4.696f, 19.994f, 5.587f)
                lineTo(20.001f, 5.748f)
                lineTo(20f, 11.028f)
                curveTo(20.517f, 11.086f, 21.026f, 11.236f, 21.501f, 11.478f)
                lineTo(21.501f, 5.748f)
                lineTo(21.496f, 5.564f)
                close()
                moveTo(6.251f, 3.998f)
                lineTo(11.5f, 3.997f)
                verticalLineTo(7.998f)
                lineTo(4.5f, 7.999f)
                lineTo(4.501f, 5.748f)
                curveTo(4.501f, 4.83f, 5.208f, 4.077f, 6.107f, 4.004f)
                lineTo(6.251f, 3.998f)
                close()
                moveTo(21.977f, 13.059f)
                curveTo(23.341f, 14.471f, 23.341f, 16.76f, 21.977f, 18.173f)
                lineTo(17.535f, 22.771f)
                curveTo(17.387f, 22.924f, 17.194f, 23f, 17f, 23f)
                curveTo(16.806f, 23f, 16.613f, 22.924f, 16.465f, 22.771f)
                lineTo(12.023f, 18.173f)
                curveTo(11.818f, 17.96f, 11.644f, 17.728f, 11.5f, 17.482f)
                curveTo(10.833f, 16.338f, 10.833f, 14.894f, 11.5f, 13.75f)
                curveTo(11.644f, 13.504f, 11.818f, 13.271f, 12.023f, 13.059f)
                curveTo(12.316f, 12.756f, 12.647f, 12.519f, 13f, 12.346f)
                curveTo(14.296f, 11.712f, 15.892f, 11.949f, 16.964f, 13.059f)
                lineTo(17f, 13.097f)
                lineTo(17.036f, 13.059f)
                curveTo(17.844f, 12.222f, 18.95f, 11.882f, 20f, 12.036f)
                curveTo(20.529f, 12.114f, 21.045f, 12.317f, 21.501f, 12.646f)
                curveTo(21.668f, 12.767f, 21.828f, 12.905f, 21.977f, 13.059f)
                close()
            }
        }.build()

        return _BoardHeart!!
    }

@Suppress("ObjectPropertyName")
private var _BoardHeart: ImageVector? = null

@Preview
@Composable
private fun BoardHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BoardHeart, contentDescription = null)
    }
}
