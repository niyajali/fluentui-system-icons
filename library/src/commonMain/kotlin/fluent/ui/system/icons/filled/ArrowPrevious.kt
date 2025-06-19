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

public val FluentIcons.Filled.ArrowPrevious: ImageVector
    get() {
        if (_ArrowPrevious != null) {
            return _ArrowPrevious!!
        }
        _ArrowPrevious = ImageVector.Builder(
            name = "Filled.ArrowPrevious",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 3f)
                curveTo(5.487f, 3f, 5.064f, 3.386f, 5.007f, 3.883f)
                lineTo(5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                curveTo(6.513f, 21f, 6.936f, 20.614f, 6.993f, 20.117f)
                lineTo(7f, 20f)
                verticalLineTo(4f)
                curveTo(7f, 3.448f, 6.552f, 3f, 6f, 3f)
                close()
                moveTo(18.707f, 3.293f)
                curveTo(18.347f, 2.932f, 17.779f, 2.905f, 17.387f, 3.21f)
                lineTo(17.293f, 3.293f)
                lineTo(9.293f, 11.293f)
                curveTo(8.932f, 11.653f, 8.905f, 12.221f, 9.21f, 12.613f)
                lineTo(9.293f, 12.707f)
                lineTo(17.293f, 20.707f)
                curveTo(17.683f, 21.098f, 18.317f, 21.098f, 18.707f, 20.707f)
                curveTo(19.068f, 20.347f, 19.095f, 19.779f, 18.79f, 19.387f)
                lineTo(18.707f, 19.293f)
                lineTo(11.414f, 12f)
                lineTo(18.707f, 4.707f)
                curveTo(19.098f, 4.317f, 19.098f, 3.683f, 18.707f, 3.293f)
                close()
            }
        }.build()

        return _ArrowPrevious!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPrevious: ImageVector? = null

@Preview
@Composable
private fun ArrowPreviousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowPrevious, contentDescription = null)
    }
}
