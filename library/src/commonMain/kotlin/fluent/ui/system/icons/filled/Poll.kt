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

public val FluentIcons.Filled.Poll: ImageVector
    get() {
        if (_Poll != null) {
            return _Poll!!
        }
        _Poll = ImageVector.Builder(
            name = "Filled.Poll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.752f, 2f)
                curveTo(13.272f, 2f, 14.504f, 3.232f, 14.504f, 4.752f)
                verticalLineTo(19.25f)
                curveTo(14.504f, 20.77f, 13.272f, 22.002f, 11.752f, 22.002f)
                curveTo(10.232f, 22.002f, 9f, 20.77f, 9f, 19.25f)
                verticalLineTo(4.752f)
                curveTo(9f, 3.232f, 10.232f, 2f, 11.752f, 2f)
                close()
                moveTo(18.752f, 7f)
                curveTo(20.272f, 7f, 21.504f, 8.232f, 21.504f, 9.752f)
                verticalLineTo(19.25f)
                curveTo(21.504f, 20.77f, 20.272f, 22.002f, 18.752f, 22.002f)
                curveTo(17.232f, 22.002f, 16f, 20.77f, 16f, 19.25f)
                verticalLineTo(9.752f)
                curveTo(16f, 8.232f, 17.232f, 7f, 18.752f, 7f)
                close()
                moveTo(4.752f, 12f)
                curveTo(6.272f, 12f, 7.504f, 13.232f, 7.504f, 14.752f)
                verticalLineTo(19.25f)
                curveTo(7.504f, 20.77f, 6.272f, 22.002f, 4.752f, 22.002f)
                curveTo(3.232f, 22.002f, 2f, 20.77f, 2f, 19.25f)
                verticalLineTo(14.752f)
                curveTo(2f, 13.232f, 3.232f, 12f, 4.752f, 12f)
                close()
            }
        }.build()

        return _Poll!!
    }

@Suppress("ObjectPropertyName")
private var _Poll: ImageVector? = null

@Preview
@Composable
private fun PollPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Poll, contentDescription = null)
    }
}
