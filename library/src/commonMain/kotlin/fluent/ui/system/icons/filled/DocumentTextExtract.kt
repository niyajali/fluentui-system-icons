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

public val FluentIcons.Filled.DocumentTextExtract: ImageVector
    get() {
        if (_DocumentTextExtract != null) {
            return _DocumentTextExtract!!
        }
        _DocumentTextExtract = ImageVector.Builder(
            name = "Filled.DocumentTextExtract",
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
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                curveTo(11.605f, 13.5f, 12.5f, 14.395f, 12.5f, 15.5f)
                curveTo(12.5f, 16.605f, 11.605f, 17.5f, 10.5f, 17.5f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                close()
                moveTo(7.5f, 11.75f)
                curveTo(7.5f, 11.336f, 7.836f, 11f, 8.25f, 11f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 11f, 16.5f, 11.336f, 16.5f, 11.75f)
                curveTo(16.5f, 12.164f, 16.164f, 12.5f, 15.75f, 12.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 12.5f, 7.5f, 12.164f, 7.5f, 11.75f)
                close()
                moveTo(7.5f, 19.25f)
                curveTo(7.5f, 18.836f, 7.836f, 18.5f, 8.25f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 18.5f, 16.5f, 18.836f, 16.5f, 19.25f)
                curveTo(16.5f, 19.664f, 16.164f, 20f, 15.75f, 20f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 20f, 7.5f, 19.664f, 7.5f, 19.25f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
                moveTo(2.75f, 14.75f)
                curveTo(2.336f, 14.75f, 2f, 15.086f, 2f, 15.5f)
                curveTo(2f, 15.914f, 2.336f, 16.25f, 2.75f, 16.25f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 16.25f, 11f, 15.914f, 11f, 15.5f)
                curveTo(11f, 15.086f, 10.664f, 14.75f, 10.25f, 14.75f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _DocumentTextExtract!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentTextExtract: ImageVector? = null

@Preview
@Composable
private fun DocumentTextExtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentTextExtract, contentDescription = null)
    }
}
