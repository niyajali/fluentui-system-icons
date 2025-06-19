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

public val FluentIcons.Regular.LineFlowDiagonalUpRight: ImageVector
    get() {
        if (_LineFlowDiagonalUpRight != null) {
            return _LineFlowDiagonalUpRight!!
        }
        _LineFlowDiagonalUpRight = ImageVector.Builder(
            name = "Regular.LineFlowDiagonalUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.78f, 5.28f)
                curveTo(20.073f, 4.987f, 20.073f, 4.513f, 19.78f, 4.22f)
                curveTo(19.487f, 3.927f, 19.013f, 3.927f, 18.72f, 4.22f)
                lineTo(9.248f, 13.691f)
                curveTo(8.608f, 13.255f, 7.834f, 13f, 7f, 13f)
                curveTo(4.791f, 13f, 3f, 14.791f, 3f, 17f)
                curveTo(3f, 19.209f, 4.791f, 21f, 7f, 21f)
                curveTo(9.209f, 21f, 11f, 19.209f, 11f, 17f)
                curveTo(11f, 16.167f, 10.745f, 15.392f, 10.309f, 14.752f)
                lineTo(19.78f, 5.28f)
                close()
                moveTo(4.5f, 17f)
                curveTo(4.5f, 15.619f, 5.619f, 14.5f, 7f, 14.5f)
                curveTo(8.381f, 14.5f, 9.5f, 15.619f, 9.5f, 17f)
                curveTo(9.5f, 18.381f, 8.381f, 19.5f, 7f, 19.5f)
                curveTo(5.619f, 19.5f, 4.5f, 18.381f, 4.5f, 17f)
                close()
            }
        }.build()

        return _LineFlowDiagonalUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _LineFlowDiagonalUpRight: ImageVector? = null

@Preview
@Composable
private fun LineFlowDiagonalUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineFlowDiagonalUpRight, contentDescription = null)
    }
}
