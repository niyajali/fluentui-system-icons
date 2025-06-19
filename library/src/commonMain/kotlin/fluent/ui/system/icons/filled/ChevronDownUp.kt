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

public val FluentIcons.Filled.ChevronDownUp: ImageVector
    get() {
        if (_ChevronDownUp != null) {
            return _ChevronDownUp!!
        }
        _ChevronDownUp = ImageVector.Builder(
            name = "Filled.ChevronDownUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.707f, 2.793f)
                curveTo(6.317f, 2.402f, 5.683f, 2.402f, 5.293f, 2.793f)
                curveTo(4.902f, 3.183f, 4.902f, 3.817f, 5.293f, 4.207f)
                lineTo(11.293f, 10.207f)
                curveTo(11.683f, 10.598f, 12.317f, 10.598f, 12.707f, 10.207f)
                lineTo(18.707f, 4.207f)
                curveTo(19.098f, 3.817f, 19.098f, 3.183f, 18.707f, 2.793f)
                curveTo(18.317f, 2.402f, 17.683f, 2.402f, 17.293f, 2.793f)
                lineTo(12f, 8.086f)
                lineTo(6.707f, 2.793f)
                close()
                moveTo(6.707f, 21.207f)
                curveTo(6.317f, 21.598f, 5.683f, 21.598f, 5.293f, 21.207f)
                curveTo(4.902f, 20.817f, 4.902f, 20.183f, 5.293f, 19.793f)
                lineTo(11.293f, 13.793f)
                curveTo(11.683f, 13.402f, 12.317f, 13.402f, 12.707f, 13.793f)
                lineTo(18.707f, 19.793f)
                curveTo(19.098f, 20.183f, 19.098f, 20.817f, 18.707f, 21.207f)
                curveTo(18.317f, 21.598f, 17.683f, 21.598f, 17.293f, 21.207f)
                lineTo(12f, 15.914f)
                lineTo(6.707f, 21.207f)
                close()
            }
        }.build()

        return _ChevronDownUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownUp: ImageVector? = null

@Preview
@Composable
private fun ChevronDownUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChevronDownUp, contentDescription = null)
    }
}
