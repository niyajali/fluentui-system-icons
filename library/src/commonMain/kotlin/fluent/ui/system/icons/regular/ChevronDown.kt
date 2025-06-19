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

public val FluentIcons.Regular.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) {
            return _ChevronDown!!
        }
        _ChevronDown = ImageVector.Builder(
            name = "Regular.ChevronDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.22f, 8.47f)
                curveTo(4.513f, 8.177f, 4.987f, 8.177f, 5.28f, 8.47f)
                lineTo(12f, 15.189f)
                lineTo(18.72f, 8.47f)
                curveTo(19.013f, 8.177f, 19.487f, 8.177f, 19.78f, 8.47f)
                curveTo(20.073f, 8.763f, 20.073f, 9.237f, 19.78f, 9.53f)
                lineTo(12.53f, 16.78f)
                curveTo(12.237f, 17.073f, 11.763f, 17.073f, 11.47f, 16.78f)
                lineTo(4.22f, 9.53f)
                curveTo(3.927f, 9.237f, 3.927f, 8.763f, 4.22f, 8.47f)
                close()
            }
        }.build()

        return _ChevronDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDown: ImageVector? = null

@Preview
@Composable
private fun ChevronDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChevronDown, contentDescription = null)
    }
}
