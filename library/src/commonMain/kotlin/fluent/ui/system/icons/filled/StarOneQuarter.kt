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

public val FluentIcons.Filled.StarOneQuarter: ImageVector
    get() {
        if (_StarOneQuarter != null) {
            return _StarOneQuarter!!
        }
        _StarOneQuarter = ImageVector.Builder(
            name = "Filled.StarOneQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 6.725f)
                lineTo(8.43f, 7.88f)
                lineTo(3.157f, 8.646f)
                curveTo(2.05f, 8.807f, 1.608f, 10.168f, 2.409f, 10.949f)
                lineTo(6.224f, 14.668f)
                lineTo(5.324f, 19.919f)
                curveTo(5.174f, 20.789f, 5.864f, 21.497f, 6.649f, 21.5f)
                curveTo(6.859f, 21.501f, 7.075f, 21.452f, 7.284f, 21.342f)
                lineTo(9f, 20.44f)
                verticalLineTo(6.725f)
                close()
            }
        }.build()

        return _StarOneQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _StarOneQuarter: ImageVector? = null

@Preview
@Composable
private fun StarOneQuarterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarOneQuarter, contentDescription = null)
    }
}
