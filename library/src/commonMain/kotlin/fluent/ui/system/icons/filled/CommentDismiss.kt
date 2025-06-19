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

public val FluentIcons.Filled.CommentDismiss: ImageVector
    get() {
        if (_CommentDismiss != null) {
            return _CommentDismiss!!
        }
        _CommentDismiss = ImageVector.Builder(
            name = "Filled.CommentDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
                curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
                curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
                close()
                moveTo(15.854f, 4.146f)
                curveTo(15.658f, 3.951f, 15.342f, 3.951f, 15.146f, 4.146f)
                curveTo(14.951f, 4.342f, 14.951f, 4.658f, 15.146f, 4.854f)
                lineTo(16.793f, 6.5f)
                lineTo(15.146f, 8.146f)
                curveTo(14.951f, 8.342f, 14.951f, 8.658f, 15.146f, 8.854f)
                curveTo(15.342f, 9.049f, 15.658f, 9.049f, 15.854f, 8.854f)
                lineTo(17.5f, 7.207f)
                lineTo(19.146f, 8.854f)
                curveTo(19.342f, 9.049f, 19.658f, 9.049f, 19.854f, 8.854f)
                curveTo(20.049f, 8.658f, 20.049f, 8.342f, 19.854f, 8.146f)
                lineTo(18.207f, 6.5f)
                lineTo(19.854f, 4.854f)
                curveTo(20.049f, 4.658f, 20.049f, 4.342f, 19.854f, 4.146f)
                curveTo(19.658f, 3.951f, 19.342f, 3.951f, 19.146f, 4.146f)
                lineTo(17.5f, 5.793f)
                lineTo(15.854f, 4.146f)
                close()
                moveTo(17.5f, 13f)
                curveTo(19.247f, 13f, 20.832f, 12.311f, 22f, 11.19f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
                horizontalLineTo(13f)
                lineTo(8f, 21.75f)
                curveTo(7.176f, 22.368f, 6f, 21.78f, 6f, 20.75f)
                verticalLineTo(18f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(12.022f)
                curveTo(11.375f, 4.01f, 11f, 5.211f, 11f, 6.5f)
                curveTo(11f, 10.09f, 13.91f, 13f, 17.5f, 13f)
                close()
            }
        }.build()

        return _CommentDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _CommentDismiss: ImageVector? = null

@Preview
@Composable
private fun CommentDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CommentDismiss, contentDescription = null)
    }
}
