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

public val FluentIcons.Filled.TicketDiagonal: ImageVector
    get() {
        if (_TicketDiagonal != null) {
            return _TicketDiagonal!!
        }
        _TicketDiagonal = ImageVector.Builder(
            name = "Filled.TicketDiagonal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.591f, 2.53f)
                curveTo(14.712f, 1.651f, 13.288f, 1.651f, 12.409f, 2.53f)
                lineTo(2.53f, 12.409f)
                curveTo(1.651f, 13.288f, 1.651f, 14.712f, 2.53f, 15.591f)
                lineTo(3.702f, 16.762f)
                curveTo(4.212f, 17.273f, 4.929f, 17.182f, 5.362f, 16.924f)
                curveTo(5.548f, 16.813f, 5.765f, 16.75f, 6f, 16.75f)
                curveTo(6.69f, 16.75f, 7.25f, 17.309f, 7.25f, 18f)
                curveTo(7.25f, 18.234f, 7.186f, 18.451f, 7.075f, 18.637f)
                curveTo(6.818f, 19.07f, 6.726f, 19.787f, 7.237f, 20.298f)
                lineTo(8.409f, 21.469f)
                curveTo(9.287f, 22.348f, 10.712f, 22.348f, 11.591f, 21.469f)
                lineTo(21.469f, 11.591f)
                curveTo(22.348f, 10.712f, 22.348f, 9.287f, 21.469f, 8.409f)
                lineTo(20.298f, 7.237f)
                curveTo(19.787f, 6.726f, 19.07f, 6.818f, 18.637f, 7.075f)
                curveTo(18.451f, 7.186f, 18.234f, 7.25f, 18f, 7.25f)
                curveTo(17.309f, 7.25f, 16.75f, 6.69f, 16.75f, 6f)
                curveTo(16.75f, 5.766f, 16.813f, 5.549f, 16.924f, 5.362f)
                curveTo(17.181f, 4.929f, 17.273f, 4.212f, 16.762f, 3.702f)
                lineTo(15.591f, 2.53f)
                close()
            }
        }.build()

        return _TicketDiagonal!!
    }

@Suppress("ObjectPropertyName")
private var _TicketDiagonal: ImageVector? = null

@Preview
@Composable
private fun TicketDiagonalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TicketDiagonal, contentDescription = null)
    }
}
