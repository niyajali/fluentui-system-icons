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

public val FluentIcons.Regular.GridDots: ImageVector
    get() {
        if (_GridDots != null) {
            return _GridDots!!
        }
        _GridDots = ImageVector.Builder(
            name = "Regular.GridDots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 17.5f)
                curveTo(12.828f, 17.5f, 13.5f, 18.172f, 13.5f, 19f)
                curveTo(13.5f, 19.828f, 12.828f, 20.5f, 12f, 20.5f)
                curveTo(11.172f, 20.5f, 10.5f, 19.828f, 10.5f, 19f)
                curveTo(10.5f, 18.172f, 11.172f, 17.5f, 12f, 17.5f)
                close()
                moveTo(19f, 17.5f)
                curveTo(19.828f, 17.5f, 20.5f, 18.172f, 20.5f, 19f)
                curveTo(20.5f, 19.828f, 19.828f, 20.5f, 19f, 20.5f)
                curveTo(18.172f, 20.5f, 17.5f, 19.828f, 17.5f, 19f)
                curveTo(17.5f, 18.172f, 18.172f, 17.5f, 19f, 17.5f)
                close()
                moveTo(5f, 17.5f)
                curveTo(5.828f, 17.5f, 6.5f, 18.172f, 6.5f, 19f)
                curveTo(6.5f, 19.828f, 5.828f, 20.5f, 5f, 20.5f)
                curveTo(4.172f, 20.5f, 3.5f, 19.828f, 3.5f, 19f)
                curveTo(3.5f, 18.172f, 4.172f, 17.5f, 5f, 17.5f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12f)
                curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12f, 10.5f)
                close()
                moveTo(19f, 10.5f)
                curveTo(19.828f, 10.5f, 20.5f, 11.172f, 20.5f, 12f)
                curveTo(20.5f, 12.828f, 19.828f, 13.5f, 19f, 13.5f)
                curveTo(18.172f, 13.5f, 17.5f, 12.828f, 17.5f, 12f)
                curveTo(17.5f, 11.172f, 18.172f, 10.5f, 19f, 10.5f)
                close()
                moveTo(5f, 10.5f)
                curveTo(5.828f, 10.5f, 6.5f, 11.172f, 6.5f, 12f)
                curveTo(6.5f, 12.828f, 5.828f, 13.5f, 5f, 13.5f)
                curveTo(4.172f, 13.5f, 3.5f, 12.828f, 3.5f, 12f)
                curveTo(3.5f, 11.172f, 4.172f, 10.5f, 5f, 10.5f)
                close()
                moveTo(12f, 3.5f)
                curveTo(12.828f, 3.5f, 13.5f, 4.172f, 13.5f, 5f)
                curveTo(13.5f, 5.828f, 12.828f, 6.5f, 12f, 6.5f)
                curveTo(11.172f, 6.5f, 10.5f, 5.828f, 10.5f, 5f)
                curveTo(10.5f, 4.172f, 11.172f, 3.5f, 12f, 3.5f)
                close()
                moveTo(19f, 3.5f)
                curveTo(19.828f, 3.5f, 20.5f, 4.172f, 20.5f, 5f)
                curveTo(20.5f, 5.828f, 19.828f, 6.5f, 19f, 6.5f)
                curveTo(18.172f, 6.5f, 17.5f, 5.828f, 17.5f, 5f)
                curveTo(17.5f, 4.172f, 18.172f, 3.5f, 19f, 3.5f)
                close()
                moveTo(5f, 3.5f)
                curveTo(5.828f, 3.5f, 6.5f, 4.172f, 6.5f, 5f)
                curveTo(6.5f, 5.828f, 5.828f, 6.5f, 5f, 6.5f)
                curveTo(4.172f, 6.5f, 3.5f, 5.828f, 3.5f, 5f)
                curveTo(3.5f, 4.172f, 4.172f, 3.5f, 5f, 3.5f)
                close()
            }
        }.build()

        return _GridDots!!
    }

@Suppress("ObjectPropertyName")
private var _GridDots: ImageVector? = null

@Preview
@Composable
private fun GridDotsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GridDots, contentDescription = null)
    }
}
