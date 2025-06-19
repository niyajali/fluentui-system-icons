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

public val FluentIcons.Regular.SubtractParentheses: ImageVector
    get() {
        if (_SubtractParentheses != null) {
            return _SubtractParentheses!!
        }
        _SubtractParentheses = ImageVector.Builder(
            name = "Regular.SubtractParentheses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.719f, 5.339f)
                curveTo(7.043f, 5.082f, 7.097f, 4.61f, 6.84f, 4.286f)
                curveTo(6.582f, 3.961f, 6.11f, 3.907f, 5.786f, 4.165f)
                curveTo(3.481f, 5.995f, 2f, 8.825f, 2f, 12f)
                curveTo(2f, 15.175f, 3.481f, 18.005f, 5.786f, 19.835f)
                curveTo(6.11f, 20.093f, 6.582f, 20.039f, 6.84f, 19.714f)
                curveTo(7.097f, 19.39f, 7.043f, 18.918f, 6.719f, 18.661f)
                curveTo(4.756f, 17.102f, 3.5f, 14.698f, 3.5f, 12f)
                curveTo(3.5f, 9.302f, 4.756f, 6.898f, 6.719f, 5.339f)
                close()
                moveTo(18.214f, 4.165f)
                curveTo(17.89f, 3.907f, 17.418f, 3.961f, 17.16f, 4.286f)
                curveTo(16.903f, 4.61f, 16.957f, 5.082f, 17.281f, 5.339f)
                curveTo(19.244f, 6.898f, 20.5f, 9.302f, 20.5f, 12f)
                curveTo(20.5f, 14.698f, 19.244f, 17.102f, 17.281f, 18.661f)
                curveTo(16.957f, 18.918f, 16.903f, 19.39f, 17.16f, 19.714f)
                curveTo(17.418f, 20.039f, 17.89f, 20.093f, 18.214f, 19.835f)
                curveTo(20.519f, 18.005f, 22f, 15.175f, 22f, 12f)
                curveTo(22f, 8.825f, 20.519f, 5.995f, 18.214f, 4.165f)
                close()
                moveTo(7.75f, 11.25f)
                curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
                curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
                horizontalLineTo(7.75f)
                close()
            }
        }.build()

        return _SubtractParentheses!!
    }

@Suppress("ObjectPropertyName")
private var _SubtractParentheses: ImageVector? = null

@Preview
@Composable
private fun SubtractParenthesesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SubtractParentheses, contentDescription = null)
    }
}
