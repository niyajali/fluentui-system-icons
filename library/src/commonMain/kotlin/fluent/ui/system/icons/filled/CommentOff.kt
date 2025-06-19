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

public val FluentIcons.Filled.CommentOff: ImageVector
    get() {
        if (_CommentOff != null) {
            return _CommentOff!!
        }
        _CommentOff = ImageVector.Builder(
            name = "Filled.CommentOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(2.922f, 3.982f)
                curveTo(2.351f, 4.568f, 2f, 5.368f, 2f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2f, 16.545f, 3.455f, 18f, 5.25f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(20.75f)
                curveTo(6f, 21.78f, 7.176f, 22.368f, 8f, 21.75f)
                lineTo(13f, 18f)
                horizontalLineTo(16.939f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(22f, 14.75f)
                curveTo(22f, 15.856f, 21.447f, 16.834f, 20.602f, 17.421f)
                lineTo(6.182f, 3f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
                verticalLineTo(14.75f)
                close()
            }
        }.build()

        return _CommentOff!!
    }

@Suppress("ObjectPropertyName")
private var _CommentOff: ImageVector? = null

@Preview
@Composable
private fun CommentOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentOff, contentDescription = null)
    }
}
