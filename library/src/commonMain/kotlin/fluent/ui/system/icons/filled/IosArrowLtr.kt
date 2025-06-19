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

public val FluentIcons.Filled.IosArrowLtr: ImageVector
    get() {
        if (_IosArrowLtr != null) {
            return _IosArrowLtr!!
        }
        _IosArrowLtr = ImageVector.Builder(
            name = "Filled.IosArrowLtr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.727f, 3.687f)
                curveTo(13.106f, 3.285f, 13.088f, 2.652f, 12.686f, 2.273f)
                curveTo(12.285f, 1.894f, 11.652f, 1.912f, 11.273f, 2.313f)
                lineTo(2.773f, 11.313f)
                curveTo(2.409f, 11.699f, 2.409f, 12.301f, 2.772f, 12.687f)
                lineTo(11.273f, 21.688f)
                curveTo(11.652f, 22.09f, 12.285f, 22.108f, 12.686f, 21.729f)
                curveTo(13.088f, 21.349f, 13.106f, 20.716f, 12.727f, 20.315f)
                lineTo(4.875f, 12f)
                lineTo(12.727f, 3.687f)
                close()
            }
        }.build()

        return _IosArrowLtr!!
    }

@Suppress("ObjectPropertyName")
private var _IosArrowLtr: ImageVector? = null

@Preview
@Composable
private fun IosArrowLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.IosArrowLtr, contentDescription = null)
    }
}
