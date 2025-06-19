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

public val FluentIcons.Regular.ProtocolHandler: ImageVector
    get() {
        if (_ProtocolHandler != null) {
            return _ProtocolHandler!!
        }
        _ProtocolHandler = ImageVector.Builder(
            name = "Regular.ProtocolHandler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.732f, 17.732f)
                lineTo(12.707f, 16.707f)
                lineTo(13.767f, 15.646f)
                lineTo(14.792f, 16.671f)
                curveTo(15.183f, 17.062f, 15.816f, 17.062f, 16.207f, 16.671f)
                lineTo(20.171f, 12.707f)
                curveTo(20.562f, 12.316f, 20.562f, 11.683f, 20.171f, 11.292f)
                lineTo(16.207f, 7.328f)
                curveTo(15.816f, 6.938f, 15.183f, 6.938f, 14.792f, 7.328f)
                lineTo(13.767f, 8.353f)
                lineTo(12.707f, 7.293f)
                lineTo(13.732f, 6.267f)
                curveTo(14.708f, 5.291f, 16.291f, 5.291f, 17.267f, 6.267f)
                lineTo(21.232f, 10.232f)
                curveTo(22.208f, 11.208f, 22.208f, 12.791f, 21.232f, 13.767f)
                lineTo(17.267f, 17.732f)
                curveTo(16.291f, 18.708f, 14.708f, 18.708f, 13.732f, 17.732f)
                close()
                moveTo(6.732f, 6.267f)
                lineTo(2.767f, 10.232f)
                curveTo(1.791f, 11.208f, 1.791f, 12.791f, 2.767f, 13.767f)
                lineTo(6.732f, 17.732f)
                curveTo(7.708f, 18.708f, 9.291f, 18.708f, 10.267f, 17.732f)
                lineTo(14.232f, 13.767f)
                curveTo(15.208f, 12.791f, 15.208f, 11.208f, 14.232f, 10.232f)
                lineTo(10.267f, 6.267f)
                curveTo(9.291f, 5.291f, 7.708f, 5.291f, 6.732f, 6.267f)
                close()
                moveTo(3.828f, 11.292f)
                lineTo(7.793f, 7.328f)
                curveTo(8.183f, 6.938f, 8.816f, 6.938f, 9.207f, 7.328f)
                lineTo(13.171f, 11.292f)
                curveTo(13.562f, 11.683f, 13.562f, 12.316f, 13.171f, 12.707f)
                lineTo(9.207f, 16.671f)
                curveTo(8.816f, 17.062f, 8.183f, 17.062f, 7.793f, 16.671f)
                lineTo(3.828f, 12.707f)
                curveTo(3.438f, 12.316f, 3.438f, 11.683f, 3.828f, 11.292f)
                close()
            }
        }.build()

        return _ProtocolHandler!!
    }

@Suppress("ObjectPropertyName")
private var _ProtocolHandler: ImageVector? = null

@Preview
@Composable
private fun ProtocolHandlerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ProtocolHandler, contentDescription = null)
    }
}
