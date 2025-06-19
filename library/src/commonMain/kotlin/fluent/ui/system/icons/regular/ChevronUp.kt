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

public val FluentIcons.Regular.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) {
            return _ChevronUp!!
        }
        _ChevronUp = ImageVector.Builder(
            name = "Regular.ChevronUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.22f, 15.53f)
                curveTo(4.513f, 15.823f, 4.987f, 15.823f, 5.28f, 15.53f)
                lineTo(12f, 8.811f)
                lineTo(18.72f, 15.53f)
                curveTo(19.013f, 15.823f, 19.487f, 15.823f, 19.78f, 15.53f)
                curveTo(20.073f, 15.237f, 20.073f, 14.763f, 19.78f, 14.47f)
                lineTo(12.53f, 7.22f)
                curveTo(12.237f, 6.927f, 11.763f, 6.927f, 11.47f, 7.22f)
                lineTo(4.22f, 14.47f)
                curveTo(3.927f, 14.763f, 3.927f, 15.237f, 4.22f, 15.53f)
                close()
            }
        }.build()

        return _ChevronUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUp: ImageVector? = null

@Preview
@Composable
private fun ChevronUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChevronUp, contentDescription = null)
    }
}
