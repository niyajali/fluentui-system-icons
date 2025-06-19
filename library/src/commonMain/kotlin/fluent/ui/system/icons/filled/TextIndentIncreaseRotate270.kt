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

public val FluentIcons.Filled.TextIndentIncreaseRotate270: ImageVector
    get() {
        if (_TextIndentIncreaseRotate270 != null) {
            return _TextIndentIncreaseRotate270!!
        }
        _TextIndentIncreaseRotate270 = ImageVector.Builder(
            name = "Filled.TextIndentIncreaseRotate270",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 15f)
                verticalLineTo(6.5f)
                curveTo(16f, 5.948f, 16.448f, 5.5f, 17f, 5.5f)
                curveTo(17.513f, 5.5f, 17.935f, 5.886f, 17.993f, 6.383f)
                lineTo(18f, 6.5f)
                verticalLineTo(15f)
                curveTo(18f, 15.552f, 17.552f, 16f, 17f, 16f)
                curveTo(16.487f, 16f, 16.065f, 15.614f, 16.007f, 15.117f)
                lineTo(16f, 15f)
                close()
                moveTo(9.293f, 21.707f)
                curveTo(8.932f, 21.347f, 8.905f, 20.779f, 9.21f, 20.387f)
                lineTo(9.293f, 20.293f)
                lineTo(11.293f, 18.293f)
                curveTo(11.653f, 17.932f, 12.221f, 17.905f, 12.613f, 18.21f)
                lineTo(12.707f, 18.293f)
                lineTo(14.707f, 20.293f)
                curveTo(15.098f, 20.683f, 15.098f, 21.317f, 14.707f, 21.707f)
                curveTo(14.347f, 22.068f, 13.779f, 22.095f, 13.387f, 21.79f)
                lineTo(13.293f, 21.707f)
                lineTo(12f, 20.414f)
                lineTo(10.707f, 21.707f)
                curveTo(10.317f, 22.098f, 9.683f, 22.098f, 9.293f, 21.707f)
                close()
                moveTo(11f, 15f)
                lineTo(10.999f, 3.5f)
                curveTo(10.999f, 2.948f, 11.446f, 2.5f, 11.999f, 2.5f)
                curveTo(12.512f, 2.5f, 12.934f, 2.886f, 12.992f, 3.383f)
                lineTo(12.999f, 3.5f)
                lineTo(13f, 15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.487f, 16f, 11.065f, 15.614f, 11.007f, 15.117f)
                lineTo(11f, 15f)
                close()
                moveTo(6f, 15f)
                verticalLineTo(6.5f)
                curveTo(6f, 5.948f, 6.448f, 5.5f, 7f, 5.5f)
                curveTo(7.513f, 5.5f, 7.936f, 5.886f, 7.993f, 6.383f)
                lineTo(8f, 6.5f)
                verticalLineTo(15f)
                curveTo(8f, 15.552f, 7.552f, 16f, 7f, 16f)
                curveTo(6.487f, 16f, 6.064f, 15.614f, 6.007f, 15.117f)
                lineTo(6f, 15f)
                close()
            }
        }.build()

        return _TextIndentIncreaseRotate270!!
    }

@Suppress("ObjectPropertyName")
private var _TextIndentIncreaseRotate270: ImageVector? = null

@Preview
@Composable
private fun TextIndentIncreaseRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextIndentIncreaseRotate270, contentDescription = null)
    }
}
