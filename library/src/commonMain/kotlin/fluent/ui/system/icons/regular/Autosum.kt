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

public val FluentIcons.Regular.Autosum: ImageVector
    get() {
        if (_Autosum != null) {
            return _Autosum!!
        }
        _Autosum = ImageVector.Builder(
            name = "Regular.Autosum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.059f, 4.457f)
                curveTo(5.177f, 4.18f, 5.449f, 4f, 5.75f, 4f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 4f, 19f, 4.336f, 19f, 4.75f)
                curveTo(19f, 5.164f, 18.664f, 5.5f, 18.25f, 5.5f)
                horizontalLineTo(7.52f)
                lineTo(12.88f, 11.039f)
                curveTo(13.149f, 11.317f, 13.162f, 11.755f, 12.91f, 12.049f)
                lineTo(7.381f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 18.5f, 19f, 18.836f, 19f, 19.25f)
                curveTo(19f, 19.664f, 18.664f, 20f, 18.25f, 20f)
                horizontalLineTo(5.75f)
                curveTo(5.457f, 20f, 5.191f, 19.83f, 5.069f, 19.563f)
                curveTo(4.946f, 19.297f, 4.99f, 18.984f, 5.181f, 18.762f)
                lineTo(11.327f, 11.591f)
                lineTo(5.211f, 5.272f)
                curveTo(5.002f, 5.055f, 4.942f, 4.735f, 5.059f, 4.457f)
                close()
            }
        }.build()

        return _Autosum!!
    }

@Suppress("ObjectPropertyName")
private var _Autosum: ImageVector? = null

@Preview
@Composable
private fun AutosumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Autosum, contentDescription = null)
    }
}
