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

public val FluentIcons.Filled.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) {
            return _Hexagon!!
        }
        _Hexagon = ImageVector.Builder(
            name = "Filled.Hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.105f, 3f)
                curveTo(7.301f, 3f, 6.559f, 3.429f, 6.157f, 4.125f)
                lineTo(2.261f, 10.875f)
                curveTo(1.86f, 11.571f, 1.86f, 12.429f, 2.261f, 13.125f)
                lineTo(6.157f, 19.875f)
                curveTo(6.559f, 20.571f, 7.301f, 21f, 8.105f, 21f)
                horizontalLineTo(15.895f)
                curveTo(16.699f, 21f, 17.442f, 20.571f, 17.844f, 19.875f)
                lineTo(21.74f, 13.125f)
                curveTo(22.141f, 12.429f, 22.141f, 11.571f, 21.74f, 10.875f)
                lineTo(17.844f, 4.125f)
                curveTo(17.442f, 3.429f, 16.699f, 3f, 15.895f, 3f)
                horizontalLineTo(8.105f)
                close()
            }
        }.build()

        return _Hexagon!!
    }

@Suppress("ObjectPropertyName")
private var _Hexagon: ImageVector? = null

@Preview
@Composable
private fun HexagonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Hexagon, contentDescription = null)
    }
}
