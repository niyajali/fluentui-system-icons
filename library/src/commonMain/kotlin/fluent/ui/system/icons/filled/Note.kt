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

public val FluentIcons.Filled.Note: ImageVector
    get() {
        if (_Note != null) {
            return _Note!!
        }
        _Note = ImageVector.Builder(
            name = "Filled.Note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(13f)
                horizontalLineTo(16.25f)
                curveTo(14.455f, 13f, 13f, 14.455f, 13f, 16.25f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(20.56f, 14.5f)
                lineTo(14.5f, 20.56f)
                verticalLineTo(16.25f)
                curveTo(14.5f, 15.283f, 15.283f, 14.5f, 16.25f, 14.5f)
                horizontalLineTo(20.56f)
                close()
            }
        }.build()

        return _Note!!
    }

@Suppress("ObjectPropertyName")
private var _Note: ImageVector? = null

@Preview
@Composable
private fun NotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Note, contentDescription = null)
    }
}
