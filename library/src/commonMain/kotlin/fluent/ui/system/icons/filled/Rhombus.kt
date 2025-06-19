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

public val FluentIcons.Filled.Rhombus: ImageVector
    get() {
        if (_Rhombus != null) {
            return _Rhombus!!
        }
        _Rhombus = ImageVector.Builder(
            name = "Filled.Rhombus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.807f, 5.408f)
                curveTo(6.151f, 4.557f, 6.976f, 4f, 7.894f, 4f)
                horizontalLineTo(20.752f)
                curveTo(22.347f, 4f, 23.435f, 5.613f, 22.838f, 7.092f)
                lineTo(18.197f, 18.592f)
                curveTo(17.854f, 19.443f, 17.028f, 20f, 16.111f, 20f)
                horizontalLineTo(3.252f)
                curveTo(1.657f, 20f, 0.569f, 18.387f, 1.166f, 16.908f)
                lineTo(5.807f, 5.408f)
                close()
            }
        }.build()

        return _Rhombus!!
    }

@Suppress("ObjectPropertyName")
private var _Rhombus: ImageVector? = null

@Preview
@Composable
private fun RhombusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Rhombus, contentDescription = null)
    }
}
