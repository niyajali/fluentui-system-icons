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

public val FluentIcons.Filled.DocumentSplitHint: ImageVector
    get() {
        if (_DocumentSplitHint != null) {
            return _DocumentSplitHint!!
        }
        _DocumentSplitHint = ImageVector.Builder(
            name = "Filled.DocumentSplitHint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.776f, 4.224f, 12f, 4.5f, 12f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 12f, 20f, 11.776f, 20f, 11.5f)
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
                moveTo(5.5f, 13.75f)
                curveTo(5.5f, 13.336f, 5.164f, 13f, 4.75f, 13f)
                curveTo(4.336f, 13f, 4f, 13.336f, 4f, 13.75f)
                verticalLineTo(16.245f)
                curveTo(4f, 16.659f, 4.336f, 16.995f, 4.75f, 16.995f)
                curveTo(5.164f, 16.995f, 5.5f, 16.659f, 5.5f, 16.245f)
                verticalLineTo(13.75f)
                close()
                moveTo(19.25f, 13f)
                curveTo(19.664f, 13f, 20f, 13.336f, 20f, 13.75f)
                verticalLineTo(16.245f)
                curveTo(20f, 16.659f, 19.664f, 16.995f, 19.25f, 16.995f)
                curveTo(18.836f, 16.995f, 18.5f, 16.659f, 18.5f, 16.245f)
                verticalLineTo(13.75f)
                curveTo(18.5f, 13.336f, 18.836f, 13f, 19.25f, 13f)
                close()
                moveTo(10.25f, 20.5f)
                curveTo(9.836f, 20.5f, 9.5f, 20.836f, 9.5f, 21.25f)
                curveTo(9.5f, 21.664f, 9.836f, 22f, 10.25f, 22f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 22f, 14.5f, 21.664f, 14.5f, 21.25f)
                curveTo(14.5f, 20.836f, 14.164f, 20.5f, 13.75f, 20.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(4.75f, 18.5f)
                curveTo(5.164f, 18.5f, 5.5f, 18.836f, 5.5f, 19.25f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.276f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 20.5f, 8f, 20.836f, 8f, 21.25f)
                curveTo(8f, 21.664f, 7.664f, 22f, 7.25f, 22f)
                horizontalLineTo(6f)
                curveTo(4.895f, 22f, 4f, 21.105f, 4f, 20f)
                verticalLineTo(19.25f)
                curveTo(4f, 18.836f, 4.336f, 18.5f, 4.75f, 18.5f)
                close()
                moveTo(18.5f, 19.25f)
                curveTo(18.5f, 18.836f, 18.836f, 18.5f, 19.25f, 18.5f)
                curveTo(19.664f, 18.5f, 20f, 18.836f, 20f, 19.25f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(16.75f)
                curveTo(16.336f, 22f, 16f, 21.664f, 16f, 21.25f)
                curveTo(16f, 20.836f, 16.336f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.276f, 18.5f, 20f)
                verticalLineTo(19.25f)
                close()
            }
        }.build()

        return _DocumentSplitHint!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSplitHint: ImageVector? = null

@Preview
@Composable
private fun DocumentSplitHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentSplitHint, contentDescription = null)
    }
}
