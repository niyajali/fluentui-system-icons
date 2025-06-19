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

public val FluentIcons.Filled.Games: ImageVector
    get() {
        if (_Games != null) {
            return _Games!!
        }
        _Games = ImageVector.Builder(
            name = "Filled.Games",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.998f, 5f)
                curveTo(18.864f, 5f, 21.998f, 8.134f, 21.998f, 12f)
                curveTo(21.998f, 15.785f, 18.993f, 18.869f, 15.238f, 18.996f)
                lineTo(14.998f, 19f)
                horizontalLineTo(9.002f)
                curveTo(5.136f, 19f, 2.002f, 15.866f, 2.002f, 12f)
                curveTo(2.002f, 8.215f, 5.007f, 5.131f, 8.761f, 5.004f)
                lineTo(9.002f, 5f)
                horizontalLineTo(14.998f)
                close()
                moveTo(14.75f, 12.5f)
                curveTo(14.06f, 12.5f, 13.5f, 13.06f, 13.5f, 13.75f)
                curveTo(13.5f, 14.44f, 14.06f, 15f, 14.75f, 15f)
                curveTo(15.44f, 15f, 16f, 14.44f, 16f, 13.75f)
                curveTo(16f, 13.06f, 15.44f, 12.5f, 14.75f, 12.5f)
                close()
                moveTo(8f, 9f)
                curveTo(7.62f, 9f, 7.306f, 9.282f, 7.257f, 9.648f)
                lineTo(7.25f, 9.75f)
                verticalLineTo(11.248f)
                lineTo(5.75f, 11.249f)
                curveTo(5.336f, 11.249f, 5f, 11.585f, 5f, 11.999f)
                curveTo(5f, 12.378f, 5.282f, 12.692f, 5.648f, 12.742f)
                lineTo(5.75f, 12.749f)
                lineTo(7.25f, 12.748f)
                verticalLineTo(14.25f)
                curveTo(7.25f, 14.664f, 7.586f, 15f, 8f, 15f)
                curveTo(8.38f, 15f, 8.693f, 14.718f, 8.743f, 14.352f)
                lineTo(8.75f, 14.25f)
                verticalLineTo(12.748f)
                lineTo(10.25f, 12.749f)
                curveTo(10.664f, 12.749f, 11f, 12.413f, 11f, 11.999f)
                curveTo(11f, 11.619f, 10.718f, 11.305f, 10.352f, 11.256f)
                lineTo(10.25f, 11.249f)
                lineTo(8.75f, 11.248f)
                verticalLineTo(9.75f)
                curveTo(8.75f, 9.336f, 8.414f, 9f, 8f, 9f)
                close()
                moveTo(16.75f, 9f)
                curveTo(16.06f, 9f, 15.5f, 9.56f, 15.5f, 10.25f)
                curveTo(15.5f, 10.94f, 16.06f, 11.5f, 16.75f, 11.5f)
                curveTo(17.44f, 11.5f, 18f, 10.94f, 18f, 10.25f)
                curveTo(18f, 9.56f, 17.44f, 9f, 16.75f, 9f)
                close()
            }
        }.build()

        return _Games!!
    }

@Suppress("ObjectPropertyName")
private var _Games: ImageVector? = null

@Preview
@Composable
private fun GamesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Games, contentDescription = null)
    }
}
