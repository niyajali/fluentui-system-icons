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

public val FluentIcons.Regular.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) {
            return _Hexagon!!
        }
        _Hexagon = ImageVector.Builder(
            name = "Regular.Hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.157f, 4.125f)
                curveTo(6.559f, 3.429f, 7.301f, 3f, 8.105f, 3f)
                horizontalLineTo(15.895f)
                curveTo(16.699f, 3f, 17.442f, 3.429f, 17.844f, 4.125f)
                lineTo(21.74f, 10.875f)
                curveTo(22.141f, 11.571f, 22.141f, 12.429f, 21.74f, 13.125f)
                lineTo(17.844f, 19.875f)
                curveTo(17.442f, 20.571f, 16.699f, 21f, 15.895f, 21f)
                horizontalLineTo(8.105f)
                curveTo(7.301f, 21f, 6.559f, 20.571f, 6.157f, 19.875f)
                lineTo(2.261f, 13.125f)
                curveTo(1.86f, 12.429f, 1.86f, 11.571f, 2.261f, 10.875f)
                lineTo(6.157f, 4.125f)
                close()
                moveTo(8.105f, 4.5f)
                curveTo(7.837f, 4.5f, 7.59f, 4.643f, 7.456f, 4.875f)
                lineTo(3.56f, 11.625f)
                curveTo(3.426f, 11.857f, 3.426f, 12.143f, 3.56f, 12.375f)
                lineTo(7.456f, 19.125f)
                curveTo(7.59f, 19.357f, 7.837f, 19.5f, 8.105f, 19.5f)
                horizontalLineTo(15.895f)
                curveTo(16.163f, 19.5f, 16.411f, 19.357f, 16.545f, 19.125f)
                lineTo(20.44f, 12.375f)
                curveTo(20.574f, 12.143f, 20.574f, 11.857f, 20.44f, 11.625f)
                lineTo(16.545f, 4.875f)
                curveTo(16.411f, 4.643f, 16.163f, 4.5f, 15.895f, 4.5f)
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
        Image(imageVector = FluentIcons.Regular.Hexagon, contentDescription = null)
    }
}
