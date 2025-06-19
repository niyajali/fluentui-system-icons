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

public val FluentIcons.Filled.Comment: ImageVector
    get() {
        if (_Comment != null) {
            return _Comment!!
        }
        _Comment = ImageVector.Builder(
            name = "Filled.Comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 3f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(20.75f)
                curveTo(6f, 21.78f, 7.176f, 22.368f, 8f, 21.75f)
                lineTo(13f, 18f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 18f, 22f, 16.545f, 22f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _Comment!!
    }

@Suppress("ObjectPropertyName")
private var _Comment: ImageVector? = null

@Preview
@Composable
private fun CommentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Comment, contentDescription = null)
    }
}
