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

public val FluentIcons.Filled.ArrowSplit: ImageVector
    get() {
        if (_ArrowSplit != null) {
            return _ArrowSplit!!
        }
        _ArrowSplit = ImageVector.Builder(
            name = "Filled.ArrowSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3f)
                curveTo(12.552f, 3f, 13f, 3.448f, 13f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(15.25f)
                curveTo(16.769f, 9f, 18f, 10.231f, 18f, 11.75f)
                verticalLineTo(17.586f)
                lineTo(19.293f, 16.293f)
                curveTo(19.683f, 15.902f, 20.317f, 15.902f, 20.707f, 16.293f)
                curveTo(21.098f, 16.683f, 21.098f, 17.317f, 20.707f, 17.707f)
                lineTo(17.707f, 20.707f)
                curveTo(17.317f, 21.098f, 16.683f, 21.098f, 16.293f, 20.707f)
                lineTo(13.293f, 17.707f)
                curveTo(12.902f, 17.317f, 12.902f, 16.683f, 13.293f, 16.293f)
                curveTo(13.683f, 15.902f, 14.317f, 15.902f, 14.707f, 16.293f)
                lineTo(16f, 17.586f)
                verticalLineTo(11.75f)
                curveTo(16f, 11.336f, 15.664f, 11f, 15.25f, 11f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 11f, 8f, 11.336f, 8f, 11.75f)
                verticalLineTo(17.586f)
                lineTo(9.293f, 16.293f)
                curveTo(9.683f, 15.902f, 10.317f, 15.902f, 10.707f, 16.293f)
                curveTo(11.098f, 16.683f, 11.098f, 17.317f, 10.707f, 17.707f)
                lineTo(7.707f, 20.707f)
                curveTo(7.317f, 21.098f, 6.683f, 21.098f, 6.293f, 20.707f)
                lineTo(3.293f, 17.707f)
                curveTo(2.902f, 17.317f, 2.902f, 16.683f, 3.293f, 16.293f)
                curveTo(3.683f, 15.902f, 4.317f, 15.902f, 4.707f, 16.293f)
                lineTo(6f, 17.586f)
                verticalLineTo(11.75f)
                curveTo(6f, 10.231f, 7.231f, 9f, 8.75f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                curveTo(11f, 3.448f, 11.448f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _ArrowSplit!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSplit: ImageVector? = null

@Preview
@Composable
private fun ArrowSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSplit, contentDescription = null)
    }
}
