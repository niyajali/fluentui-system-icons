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

public val FluentIcons.Filled.DocumentPill: ImageVector
    get() {
        if (_DocumentPill != null) {
            return _DocumentPill!!
        }
        _DocumentPill = ImageVector.Builder(
            name = "Filled.DocumentPill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(4f, 21.328f, 4.672f, 22f, 5.5f, 22f)
                horizontalLineTo(11.467f)
                curveTo(11.537f, 22f, 11.607f, 21.995f, 11.675f, 21.986f)
                curveTo(10.786f, 20.499f, 10.982f, 18.544f, 12.262f, 17.263f)
                lineTo(17.263f, 12.263f)
                curveTo(18.018f, 11.507f, 19.009f, 11.129f, 20f, 11.129f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
                moveTo(22.03f, 12.97f)
                curveTo(20.909f, 11.849f, 19.091f, 11.849f, 17.97f, 12.97f)
                lineTo(12.97f, 17.97f)
                curveTo(11.848f, 19.091f, 11.848f, 20.909f, 12.97f, 22.031f)
                curveTo(14.091f, 23.152f, 15.909f, 23.152f, 17.03f, 22.031f)
                lineTo(22.03f, 17.031f)
                curveTo(23.152f, 15.909f, 23.152f, 14.091f, 22.03f, 12.97f)
                close()
                moveTo(19.03f, 14.031f)
                curveTo(19.566f, 13.495f, 20.434f, 13.495f, 20.97f, 14.031f)
                curveTo(21.505f, 14.566f, 21.505f, 15.434f, 20.97f, 15.97f)
                lineTo(19f, 17.94f)
                lineTo(17.061f, 16f)
                lineTo(19.03f, 14.031f)
                close()
                moveTo(17.03f, 18.97f)
                curveTo(17.323f, 19.263f, 17.323f, 19.737f, 17.03f, 20.03f)
                lineTo(16.03f, 21.03f)
                curveTo(15.737f, 21.323f, 15.263f, 21.323f, 14.97f, 21.03f)
                curveTo(14.677f, 20.737f, 14.677f, 20.263f, 14.97f, 19.97f)
                lineTo(15.97f, 18.97f)
                curveTo(16.263f, 18.677f, 16.737f, 18.677f, 17.03f, 18.97f)
                close()
            }
        }.build()

        return _DocumentPill!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPill: ImageVector? = null

@Preview
@Composable
private fun DocumentPillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPill, contentDescription = null)
    }
}
