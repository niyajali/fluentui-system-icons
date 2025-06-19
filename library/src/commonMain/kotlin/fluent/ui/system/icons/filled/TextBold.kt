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

public val FluentIcons.Filled.TextBold: ImageVector
    get() {
        if (_TextBold != null) {
            return _TextBold!!
        }
        _TextBold = ImageVector.Builder(
            name = "Filled.TextBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.25f, 5.5f)
                curveTo(9.25f, 4.534f, 8.467f, 3.75f, 7.5f, 3.75f)
                curveTo(6.534f, 3.75f, 5.75f, 4.534f, 5.75f, 5.5f)
                verticalLineTo(9.887f)
                curveTo(5.75f, 13.246f, 8.86f, 15.74f, 12.139f, 15.012f)
                lineTo(13.5f, 14.709f)
                verticalLineTo(18.25f)
                curveTo(13.5f, 19.216f, 14.283f, 20f, 15.25f, 20f)
                curveTo(16.216f, 20f, 17f, 19.216f, 17f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(17f, 4.784f, 16.216f, 4f, 15.25f, 4f)
                curveTo(14.283f, 4f, 13.5f, 4.784f, 13.5f, 5.75f)
                verticalLineTo(11.124f)
                lineTo(11.38f, 11.595f)
                curveTo(10.287f, 11.838f, 9.25f, 11.007f, 9.25f, 9.887f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()

        return _TextBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBold: ImageVector? = null

@Preview
@Composable
private fun TextBoldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBold, contentDescription = null)
    }
}
