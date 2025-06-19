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

public val FluentIcons.Filled.NoteEdit: ImageVector
    get() {
        if (_NoteEdit != null) {
            return _NoteEdit!!
        }
        _NoteEdit = ImageVector.Builder(
            name = "Filled.NoteEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(11.165f)
                lineTo(11.521f, 19.577f)
                curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.49f, 17.865f)
                lineTo(18.393f, 11.962f)
                curveTo(19.107f, 11.248f, 20.067f, 10.932f, 21f, 11.012f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(7.75f)
                curveTo(11f, 9.545f, 9.545f, 11f, 7.75f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                close()
                moveTo(9.5f, 3.44f)
                lineTo(3.44f, 9.5f)
                horizontalLineTo(7.75f)
                curveTo(8.717f, 9.5f, 9.5f, 8.717f, 9.5f, 7.75f)
                verticalLineTo(3.44f)
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

        return _NoteEdit!!
    }

@Suppress("ObjectPropertyName")
private var _NoteEdit: ImageVector? = null

@Preview
@Composable
private fun NoteEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NoteEdit, contentDescription = null)
    }
}
