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

public val FluentIcons.Filled.SlideTextTitleEdit: ImageVector
    get() {
        if (_SlideTextTitleEdit != null) {
            return _SlideTextTitleEdit!!
        }
        _SlideTextTitleEdit = ImageVector.Builder(
            name = "Filled.SlideTextTitleEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(11.26f)
                curveTo(20.804f, 10.753f, 19.369f, 10.987f, 18.394f, 11.962f)
                lineTo(12.491f, 17.865f)
                curveTo(12.019f, 18.337f, 11.684f, 18.929f, 11.522f, 19.577f)
                lineTo(11.416f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(16.5f, 8f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 8f, 6f, 8.672f, 6f, 9.5f)
                curveTo(6f, 10.328f, 6.672f, 11f, 7.5f, 11f)
                horizontalLineTo(16.5f)
                curveTo(17.328f, 11f, 18f, 10.328f, 18f, 9.5f)
                curveTo(18f, 8.672f, 17.328f, 8f, 16.5f, 8f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _SlideTextTitleEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextTitleEdit: ImageVector? = null

@Preview
@Composable
private fun SlideTextTitleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideTextTitleEdit, contentDescription = null)
    }
}
