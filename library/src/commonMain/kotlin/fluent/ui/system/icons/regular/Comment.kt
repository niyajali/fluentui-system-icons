package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.Comment: ImageVector
    get() {
        if (_Comment != null) {
            return _Comment!!
        }
        _Comment = ImageVector.Builder(
            name = "Regular.Comment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 18f)
                curveTo(3.455f, 18f, 2f, 16.545f, 2f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
                horizontalLineTo(13.012f)
                lineTo(7.999f, 21.751f)
                curveTo(7.446f, 22.164f, 6.662f, 22.051f, 6.249f, 21.498f)
                curveTo(6.087f, 21.282f, 6f, 21.02f, 6f, 20.75f)
                lineTo(5.999f, 18f)
                horizontalLineTo(5.25f)
                close()
                moveTo(12.514f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(20.5f, 5.284f, 19.716f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(3.5f, 15.717f, 4.284f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.499f)
                lineTo(7.499f, 17.25f)
                lineTo(7.5f, 20.251f)
                lineTo(12.514f, 16.5f)
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
        Image(imageVector = FluentIcons.Regular.Comment, contentDescription = null)
    }
}
