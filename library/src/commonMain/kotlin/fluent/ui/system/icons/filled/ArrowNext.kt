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

public val FluentIcons.Filled.ArrowNext: ImageVector
    get() {
        if (_ArrowNext != null) {
            return _ArrowNext!!
        }
        _ArrowNext = ImageVector.Builder(
            name = "Filled.ArrowNext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 3f)
                curveTo(18.513f, 3f, 18.935f, 3.386f, 18.993f, 3.883f)
                lineTo(19f, 4f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                curveTo(17.487f, 21f, 17.065f, 20.614f, 17.007f, 20.117f)
                lineTo(17f, 20f)
                verticalLineTo(4f)
                curveTo(17f, 3.448f, 17.448f, 3f, 18f, 3f)
                close()
                moveTo(5.293f, 3.293f)
                curveTo(5.653f, 2.932f, 6.221f, 2.905f, 6.613f, 3.21f)
                lineTo(6.707f, 3.293f)
                lineTo(14.707f, 11.293f)
                curveTo(15.068f, 11.653f, 15.095f, 12.221f, 14.79f, 12.613f)
                lineTo(14.707f, 12.707f)
                lineTo(6.707f, 20.707f)
                curveTo(6.317f, 21.098f, 5.683f, 21.098f, 5.293f, 20.707f)
                curveTo(4.932f, 20.347f, 4.905f, 19.779f, 5.21f, 19.387f)
                lineTo(5.293f, 19.293f)
                lineTo(12.586f, 12f)
                lineTo(5.293f, 4.707f)
                curveTo(4.902f, 4.317f, 4.902f, 3.683f, 5.293f, 3.293f)
                close()
            }
        }.build()

        return _ArrowNext!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNext: ImageVector? = null

@Preview
@Composable
private fun ArrowNextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowNext, contentDescription = null)
    }
}
