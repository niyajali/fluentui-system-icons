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

public val FluentIcons.Filled.TicketHorizontal: ImageVector
    get() {
        if (_TicketHorizontal != null) {
            return _TicketHorizontal!!
        }
        _TicketHorizontal = ImageVector.Builder(
            name = "Filled.TicketHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.75f, 5f)
                curveTo(21.441f, 5f, 22f, 5.56f, 22f, 6.25f)
                verticalLineTo(8.509f)
                curveTo(22f, 8.903f, 21.696f, 9.229f, 21.303f, 9.257f)
                curveTo(19.87f, 9.358f, 18.75f, 10.554f, 18.75f, 12f)
                curveTo(18.75f, 13.446f, 19.87f, 14.642f, 21.303f, 14.743f)
                curveTo(21.696f, 14.771f, 22f, 15.097f, 22f, 15.491f)
                verticalLineTo(17.75f)
                curveTo(22f, 18.44f, 21.441f, 19f, 20.75f, 19f)
                horizontalLineTo(3.25f)
                curveTo(2.56f, 19f, 2f, 18.44f, 2f, 17.75f)
                lineTo(2f, 15.491f)
                curveTo(2f, 15.097f, 2.304f, 14.771f, 2.697f, 14.743f)
                curveTo(4.131f, 14.642f, 5.25f, 13.446f, 5.25f, 12f)
                curveTo(5.25f, 10.554f, 4.131f, 9.358f, 2.697f, 9.257f)
                curveTo(2.304f, 9.229f, 2f, 8.902f, 2f, 8.509f)
                lineTo(2f, 6.25f)
                curveTo(2f, 5.56f, 2.56f, 5f, 3.25f, 5f)
                horizontalLineTo(20.75f)
                close()
            }
        }.build()

        return _TicketHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _TicketHorizontal: ImageVector? = null

@Preview
@Composable
private fun TicketHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TicketHorizontal, contentDescription = null)
    }
}
