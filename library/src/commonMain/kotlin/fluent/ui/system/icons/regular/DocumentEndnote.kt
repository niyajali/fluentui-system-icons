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

public val FluentIcons.Regular.DocumentEndnote: ImageVector
    get() {
        if (_DocumentEndnote != null) {
            return _DocumentEndnote!!
        }
        _DocumentEndnote = ImageVector.Builder(
            name = "Regular.DocumentEndnote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 4.25f)
                curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.164f, 18.164f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
                verticalLineTo(9.664f)
                curveTo(20f, 9.2f, 19.816f, 8.755f, 19.487f, 8.427f)
                lineTo(13.573f, 2.513f)
                curveTo(13.245f, 2.184f, 12.8f, 2f, 12.336f, 2f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                verticalLineTo(4.25f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(4.561f)
                lineTo(17.439f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
                moveTo(4.5f, 13.75f)
                curveTo(4.5f, 14.164f, 4.164f, 14.5f, 3.75f, 14.5f)
                horizontalLineTo(2.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(3.75f)
                curveTo(4.164f, 21.5f, 4.5f, 21.836f, 4.5f, 22.25f)
                curveTo(4.5f, 22.664f, 4.164f, 23f, 3.75f, 23f)
                horizontalLineTo(2.5f)
                curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
                verticalLineTo(14.5f)
                curveTo(1f, 13.672f, 1.672f, 13f, 2.5f, 13f)
                horizontalLineTo(3.75f)
                curveTo(4.164f, 13f, 4.5f, 13.336f, 4.5f, 13.75f)
                close()
                moveTo(9.25f, 14.5f)
                curveTo(8.836f, 14.5f, 8.5f, 14.164f, 8.5f, 13.75f)
                curveTo(8.5f, 13.336f, 8.836f, 13f, 9.25f, 13f)
                horizontalLineTo(10.5f)
                curveTo(11.328f, 13f, 12f, 13.672f, 12f, 14.5f)
                verticalLineTo(21.5f)
                curveTo(12f, 22.328f, 11.328f, 23f, 10.5f, 23f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 23f, 8.5f, 22.664f, 8.5f, 22.25f)
                curveTo(8.5f, 21.836f, 8.836f, 21.5f, 9.25f, 21.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.25f)
                close()
                moveTo(6.5f, 16.75f)
                curveTo(6.914f, 16.75f, 7.25f, 17.086f, 7.25f, 17.5f)
                verticalLineTo(21f)
                curveTo(7.25f, 21.414f, 6.914f, 21.75f, 6.5f, 21.75f)
                curveTo(6.086f, 21.75f, 5.75f, 21.414f, 5.75f, 21f)
                verticalLineTo(17.5f)
                curveTo(5.75f, 17.086f, 6.086f, 16.75f, 6.5f, 16.75f)
                close()
                moveTo(6.5f, 16f)
                curveTo(6.914f, 16f, 7.25f, 15.664f, 7.25f, 15.25f)
                curveTo(7.25f, 14.836f, 6.914f, 14.5f, 6.5f, 14.5f)
                curveTo(6.086f, 14.5f, 5.75f, 14.836f, 5.75f, 15.25f)
                curveTo(5.75f, 15.664f, 6.086f, 16f, 6.5f, 16f)
                close()
            }
        }.build()

        return _DocumentEndnote!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentEndnote: ImageVector? = null

@Preview
@Composable
private fun DocumentEndnotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentEndnote, contentDescription = null)
    }
}
