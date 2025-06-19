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

public val FluentIcons.Regular.ArrowSortUp: ImageVector
    get() {
        if (_ArrowSortUp != null) {
            return _ArrowSortUp!!
        }
        _ArrowSortUp = ImageVector.Builder(
            name = "Regular.ArrowSortUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.72f, 8.715f)
                lineTo(11.214f, 4.22f)
                curveTo(11.481f, 3.954f, 11.897f, 3.929f, 12.19f, 4.147f)
                lineTo(12.274f, 4.219f)
                lineTo(16.779f, 8.714f)
                curveTo(17.073f, 9.007f, 17.073f, 9.482f, 16.781f, 9.775f)
                curveTo(16.514f, 10.041f, 16.098f, 10.066f, 15.804f, 9.848f)
                lineTo(15.72f, 9.776f)
                lineTo(12.497f, 6.559f)
                lineTo(12.498f, 19.255f)
                curveTo(12.498f, 19.635f, 12.215f, 19.948f, 11.849f, 19.998f)
                lineTo(11.748f, 20.005f)
                curveTo(11.368f, 20.005f, 11.054f, 19.723f, 11.005f, 19.357f)
                lineTo(10.998f, 19.255f)
                lineTo(10.997f, 6.557f)
                lineTo(7.78f, 9.775f)
                curveTo(7.514f, 10.042f, 7.097f, 10.066f, 6.804f, 9.848f)
                lineTo(6.72f, 9.775f)
                curveTo(6.453f, 9.509f, 6.429f, 9.092f, 6.647f, 8.799f)
                lineTo(6.72f, 8.715f)
                lineTo(11.214f, 4.22f)
                lineTo(6.72f, 8.715f)
                close()
            }
        }.build()

        return _ArrowSortUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSortUp: ImageVector? = null

@Preview
@Composable
private fun ArrowSortUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowSortUp, contentDescription = null)
    }
}
