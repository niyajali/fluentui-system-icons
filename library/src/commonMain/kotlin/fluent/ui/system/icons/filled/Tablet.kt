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

public val FluentIcons.Filled.Tablet: ImageVector
    get() {
        if (_Tablet != null) {
            return _Tablet!!
        }
        _Tablet = ImageVector.Builder(
            name = "Filled.Tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.749f, 4f)
                curveTo(20.992f, 4f, 21.999f, 5.007f, 21.999f, 6.25f)
                verticalLineTo(17.752f)
                curveTo(21.999f, 18.995f, 20.992f, 20.002f, 19.749f, 20.002f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.002f, 2f, 18.995f, 2f, 17.752f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.749f)
                close()
                moveTo(13.75f, 15.5f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 15.5f, 9.5f, 15.836f, 9.5f, 16.25f)
                curveTo(9.5f, 16.665f, 9.836f, 17f, 10.25f, 17f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 17f, 14.5f, 16.665f, 14.5f, 16.25f)
                curveTo(14.5f, 15.836f, 14.164f, 15.5f, 13.75f, 15.5f)
                close()
            }
        }.build()

        return _Tablet!!
    }

@Suppress("ObjectPropertyName")
private var _Tablet: ImageVector? = null

@Preview
@Composable
private fun TabletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Tablet, contentDescription = null)
    }
}
