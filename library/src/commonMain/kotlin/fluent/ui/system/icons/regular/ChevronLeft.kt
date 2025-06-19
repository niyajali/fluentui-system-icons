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

public val FluentIcons.Regular.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) {
            return _ChevronLeft!!
        }
        _ChevronLeft = ImageVector.Builder(
            name = "Regular.ChevronLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.53f, 4.22f)
                curveTo(15.823f, 4.513f, 15.823f, 4.987f, 15.53f, 5.28f)
                lineTo(8.811f, 12f)
                lineTo(15.53f, 18.72f)
                curveTo(15.823f, 19.013f, 15.823f, 19.487f, 15.53f, 19.78f)
                curveTo(15.237f, 20.073f, 14.763f, 20.073f, 14.47f, 19.78f)
                lineTo(7.22f, 12.53f)
                curveTo(6.927f, 12.237f, 6.927f, 11.763f, 7.22f, 11.47f)
                lineTo(14.47f, 4.22f)
                curveTo(14.763f, 3.927f, 15.237f, 3.927f, 15.53f, 4.22f)
                close()
            }
        }.build()

        return _ChevronLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeft: ImageVector? = null

@Preview
@Composable
private fun ChevronLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChevronLeft, contentDescription = null)
    }
}
