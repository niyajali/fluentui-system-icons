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

public val FluentIcons.Filled.BoardHeart: ImageVector
    get() {
        if (_BoardHeart != null) {
            return _BoardHeart!!
        }
        _BoardHeart = ImageVector.Builder(
            name = "Filled.BoardHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 21.001f)
                lineTo(11.5f, 19.07f)
                lineTo(11.304f, 18.868f)
                curveTo(9.565f, 17.068f, 9.565f, 14.164f, 11.304f, 12.364f)
                curveTo(11.368f, 12.298f, 11.433f, 12.235f, 11.499f, 12.174f)
                lineTo(11.499f, 9.499f)
                horizontalLineTo(3f)
                verticalLineTo(17.752f)
                lineTo(3.005f, 17.936f)
                curveTo(3.101f, 19.645f, 4.517f, 21.002f, 6.25f, 21.002f)
                lineTo(11.5f, 21.001f)
                close()
                moveTo(21.501f, 5.748f)
                lineTo(21.5f, 11.478f)
                curveTo(20.072f, 10.751f, 18.345f, 10.853f, 17f, 11.784f)
                curveTo(15.809f, 10.959f, 14.317f, 10.785f, 12.999f, 11.262f)
                lineTo(13f, 2.498f)
                horizontalLineTo(18.251f)
                curveTo(19.984f, 2.498f, 21.401f, 3.854f, 21.496f, 5.564f)
                lineTo(21.501f, 5.748f)
                close()
                moveTo(11.5f, 17.481f)
                curveTo(10.833f, 16.338f, 10.833f, 14.895f, 11.499f, 13.751f)
                curveTo(11.643f, 13.505f, 11.818f, 13.272f, 12.023f, 13.059f)
                curveTo(12.315f, 12.757f, 12.646f, 12.519f, 12.999f, 12.346f)
                curveTo(14.213f, 11.752f, 15.689f, 11.922f, 16.752f, 12.857f)
                curveTo(16.825f, 12.921f, 16.895f, 12.988f, 16.964f, 13.059f)
                lineTo(17f, 13.097f)
                lineTo(17.036f, 13.059f)
                curveTo(17.105f, 12.988f, 17.175f, 12.921f, 17.248f, 12.857f)
                curveTo(18.462f, 11.79f, 20.215f, 11.719f, 21.5f, 12.646f)
                curveTo(21.668f, 12.767f, 21.827f, 12.904f, 21.977f, 13.059f)
                curveTo(23.341f, 14.471f, 23.341f, 16.761f, 21.977f, 18.173f)
                lineTo(17.535f, 22.771f)
                curveTo(17.387f, 22.924f, 17.194f, 23f, 17f, 23f)
                curveTo(16.806f, 23f, 16.613f, 22.924f, 16.465f, 22.771f)
                lineTo(12.023f, 18.173f)
                curveTo(11.818f, 17.96f, 11.643f, 17.728f, 11.5f, 17.481f)
                close()
                moveTo(11.499f, 7.999f)
                lineTo(11.5f, 2.498f)
                horizontalLineTo(6.251f)
                curveTo(4.456f, 2.498f, 3.001f, 3.953f, 3.001f, 5.748f)
                lineTo(3f, 7.999f)
                horizontalLineTo(11.499f)
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
        Image(imageVector = FluentIcons.Filled.BoardHeart, contentDescription = null)
    }
}
