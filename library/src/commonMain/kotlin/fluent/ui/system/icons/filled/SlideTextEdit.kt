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

public val FluentIcons.Filled.SlideTextEdit: ImageVector
    get() {
        if (_SlideTextEdit != null) {
            return _SlideTextEdit!!
        }
        _SlideTextEdit = ImageVector.Builder(
            name = "Filled.SlideTextEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(11.415f)
                lineTo(11.521f, 19.577f)
                curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.49f, 17.865f)
                lineTo(18.393f, 11.962f)
                curveTo(19.368f, 10.987f, 20.804f, 10.753f, 22f, 11.26f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6f, 8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
                curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
                close()
                moveTo(6f, 11.75f)
                curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 11f, 16f, 11.336f, 16f, 11.75f)
                curveTo(16f, 12.164f, 15.664f, 12.5f, 15.25f, 12.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
                close()
                moveTo(6.75f, 15.5f)
                curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
                curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 14f, 14f, 14.336f, 14f, 14.75f)
                curveTo(14f, 15.164f, 13.664f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(6.75f)
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

        return _SlideTextEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextEdit: ImageVector? = null

@Preview
@Composable
private fun SlideTextEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideTextEdit, contentDescription = null)
    }
}
