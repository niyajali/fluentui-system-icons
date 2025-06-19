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

public val FluentIcons.Regular.Speaker2: ImageVector
    get() {
        if (_Speaker2 != null) {
            return _Speaker2!!
        }
        _Speaker2 = ImageVector.Builder(
            name = "Regular.Speaker2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15f, 4.25f)
                curveTo(15f, 3.171f, 13.726f, 2.599f, 12.92f, 3.315f)
                lineTo(8.428f, 7.309f)
                curveTo(8.291f, 7.431f, 8.113f, 7.498f, 7.93f, 7.498f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 7.498f, 2f, 8.505f, 2f, 9.748f)
                verticalLineTo(14.246f)
                curveTo(2f, 15.489f, 3.007f, 16.496f, 4.25f, 16.496f)
                horizontalLineTo(7.93f)
                curveTo(8.113f, 16.496f, 8.291f, 16.563f, 8.428f, 16.685f)
                lineTo(12.919f, 20.679f)
                curveTo(13.726f, 21.396f, 15f, 20.824f, 15f, 19.745f)
                verticalLineTo(4.25f)
                close()
                moveTo(9.425f, 8.43f)
                lineTo(13.5f, 4.806f)
                verticalLineTo(19.188f)
                lineTo(9.425f, 15.565f)
                curveTo(9.013f, 15.198f, 8.481f, 14.996f, 7.93f, 14.996f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 14.996f, 3.5f, 14.66f, 3.5f, 14.246f)
                verticalLineTo(9.748f)
                curveTo(3.5f, 9.334f, 3.836f, 8.998f, 4.25f, 8.998f)
                horizontalLineTo(7.93f)
                curveTo(8.481f, 8.998f, 9.013f, 8.796f, 9.425f, 8.43f)
                close()
                moveTo(18.992f, 5.897f)
                curveTo(19.324f, 5.65f, 19.794f, 5.72f, 20.041f, 6.053f)
                curveTo(21.272f, 7.715f, 22f, 9.773f, 22f, 12f)
                curveTo(22f, 14.226f, 21.272f, 16.284f, 20.041f, 17.946f)
                curveTo(19.794f, 18.279f, 19.324f, 18.349f, 18.992f, 18.102f)
                curveTo(18.659f, 17.856f, 18.589f, 17.386f, 18.835f, 17.053f)
                curveTo(19.882f, 15.641f, 20.5f, 13.893f, 20.5f, 12f)
                curveTo(20.5f, 10.106f, 19.882f, 8.358f, 18.835f, 6.946f)
                curveTo(18.589f, 6.613f, 18.659f, 6.143f, 18.992f, 5.897f)
                close()
                moveTo(17.143f, 8.369f)
                curveTo(17.507f, 8.172f, 17.962f, 8.307f, 18.16f, 8.671f)
                curveTo(18.696f, 9.662f, 19f, 10.796f, 19f, 12f)
                curveTo(19f, 13.203f, 18.696f, 14.337f, 18.16f, 15.328f)
                curveTo(17.962f, 15.692f, 17.507f, 15.827f, 17.143f, 15.63f)
                curveTo(16.779f, 15.433f, 16.643f, 14.978f, 16.84f, 14.614f)
                curveTo(17.261f, 13.837f, 17.5f, 12.947f, 17.5f, 12f)
                curveTo(17.5f, 11.052f, 17.261f, 10.162f, 16.84f, 9.385f)
                curveTo(16.643f, 9.021f, 16.779f, 8.566f, 17.143f, 8.369f)
                close()
            }
        }.build()

        return _Speaker2!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker2: ImageVector? = null

@Preview
@Composable
private fun Speaker2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Speaker2, contentDescription = null)
    }
}
