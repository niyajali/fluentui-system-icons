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

public val FluentIcons.Filled.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) {
            return _StarHalf!!
        }
        _StarHalf = ImageVector.Builder(
            name = "Filled.StarHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2.35f)
                curveTo(12f, 2.35f, 12f, 2.35f, 12f, 2.35f)
                curveTo(11.518f, 2.349f, 11.036f, 2.6f, 10.788f, 3.102f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.174f, 20.792f, 5.868f, 21.501f, 6.655f, 21.5f)
                curveTo(6.863f, 21.5f, 7.077f, 21.451f, 7.284f, 21.342f)
                lineTo(11.999f, 18.863f)
                lineTo(12f, 2.35f)
                close()
            }
        }.build()

        return _StarHalf!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalf: ImageVector? = null

@Preview
@Composable
private fun StarHalfPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarHalf, contentDescription = null)
    }
}
