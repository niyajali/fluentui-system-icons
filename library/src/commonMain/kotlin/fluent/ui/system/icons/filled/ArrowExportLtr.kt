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

public val FluentIcons.Filled.ArrowExportLtr: ImageVector
    get() {
        if (_ArrowExportLtr != null) {
            return _ArrowExportLtr!!
        }
        _ArrowExportLtr = ImageVector.Builder(
            name = "Filled.ArrowExportLtr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 4.504f)
                curveTo(3.13f, 4.504f, 3.443f, 4.786f, 3.493f, 5.152f)
                lineTo(3.5f, 5.254f)
                verticalLineTo(18.753f)
                curveTo(3.5f, 19.167f, 3.164f, 19.503f, 2.75f, 19.503f)
                curveTo(2.37f, 19.503f, 2.057f, 19.22f, 2.007f, 18.854f)
                lineTo(2f, 18.753f)
                verticalLineTo(5.254f)
                curveTo(2f, 4.84f, 2.336f, 4.504f, 2.75f, 4.504f)
                close()
                moveTo(15.21f, 6.387f)
                lineTo(15.293f, 6.293f)
                curveTo(15.653f, 5.932f, 16.221f, 5.905f, 16.613f, 6.21f)
                lineTo(16.707f, 6.293f)
                lineTo(21.704f, 11.291f)
                curveTo(22.064f, 11.651f, 22.092f, 12.218f, 21.787f, 12.61f)
                lineTo(21.704f, 12.704f)
                lineTo(16.708f, 17.708f)
                curveTo(16.317f, 18.098f, 15.684f, 18.099f, 15.293f, 17.709f)
                curveTo(14.933f, 17.348f, 14.905f, 16.781f, 15.209f, 16.389f)
                lineTo(15.292f, 16.295f)
                lineTo(18.581f, 13f)
                lineTo(6f, 13f)
                curveTo(5.487f, 13f, 5.064f, 12.614f, 5.007f, 12.117f)
                lineTo(5f, 12f)
                curveTo(5f, 11.487f, 5.386f, 11.064f, 5.883f, 11.007f)
                lineTo(6f, 11f)
                lineTo(18.584f, 11f)
                lineTo(15.293f, 7.707f)
                curveTo(14.932f, 7.347f, 14.905f, 6.779f, 15.21f, 6.387f)
                lineTo(15.293f, 6.293f)
                lineTo(15.21f, 6.387f)
                close()
            }
        }.build()

        return _ArrowExportLtr!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExportLtr: ImageVector? = null

@Preview
@Composable
private fun ArrowExportLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowExportLtr, contentDescription = null)
    }
}
