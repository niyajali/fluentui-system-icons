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

public val FluentIcons.Filled.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) {
            return _ChevronUpDown!!
        }
        _ChevronUpDown = ImageVector.Builder(
            name = "Filled.ChevronUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.79f, 8.387f)
                curveTo(19.095f, 8.779f, 19.068f, 9.347f, 18.707f, 9.707f)
                curveTo(18.317f, 10.098f, 17.683f, 10.098f, 17.293f, 9.707f)
                lineTo(12f, 4.414f)
                lineTo(6.707f, 9.707f)
                lineTo(6.613f, 9.79f)
                curveTo(6.221f, 10.095f, 5.653f, 10.068f, 5.293f, 9.707f)
                curveTo(4.902f, 9.317f, 4.902f, 8.683f, 5.293f, 8.293f)
                lineTo(11.293f, 2.293f)
                lineTo(11.387f, 2.21f)
                curveTo(11.779f, 1.905f, 12.347f, 1.932f, 12.707f, 2.293f)
                lineTo(18.707f, 8.293f)
                lineTo(18.79f, 8.387f)
                close()
                moveTo(5.21f, 15.613f)
                curveTo(4.905f, 15.221f, 4.932f, 14.653f, 5.293f, 14.293f)
                curveTo(5.683f, 13.902f, 6.317f, 13.902f, 6.707f, 14.293f)
                lineTo(12f, 19.586f)
                lineTo(17.293f, 14.293f)
                lineTo(17.387f, 14.21f)
                curveTo(17.779f, 13.905f, 18.347f, 13.932f, 18.707f, 14.293f)
                curveTo(19.098f, 14.683f, 19.098f, 15.317f, 18.707f, 15.707f)
                lineTo(12.707f, 21.707f)
                lineTo(12.613f, 21.79f)
                curveTo(12.221f, 22.095f, 11.653f, 22.068f, 11.293f, 21.707f)
                lineTo(5.293f, 15.707f)
                lineTo(5.21f, 15.613f)
                close()
            }
        }.build()

        return _ChevronUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpDown: ImageVector? = null

@Preview
@Composable
private fun ChevronUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronUpDown, contentDescription = null)
    }
}
