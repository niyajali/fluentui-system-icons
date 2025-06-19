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

public val FluentIcons.Regular.Receipt: ImageVector
    get() {
        if (_Receipt != null) {
            return _Receipt!!
        }
        _Receipt = ImageVector.Builder(
            name = "Regular.Receipt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.25f)
                curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
                horizontalLineTo(14.75f)
                curveTo(15.993f, 3f, 17f, 4.007f, 17f, 5.25f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(17f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(17f)
                verticalLineTo(19.5f)
                close()
                moveTo(5.25f, 4.5f)
                curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(5.25f)
                curveTo(15.5f, 4.836f, 15.164f, 4.5f, 14.75f, 4.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(7.25f, 7f)
                curveTo(6.836f, 7f, 6.5f, 7.336f, 6.5f, 7.75f)
                curveTo(6.5f, 8.164f, 6.836f, 8.5f, 7.25f, 8.5f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 8.5f, 13.5f, 8.164f, 13.5f, 7.75f)
                curveTo(13.5f, 7.336f, 13.164f, 7f, 12.75f, 7f)
                horizontalLineTo(7.25f)
                close()
                moveTo(6.5f, 11.75f)
                curveTo(6.5f, 11.336f, 6.836f, 11f, 7.25f, 11f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 11f, 13.5f, 11.336f, 13.5f, 11.75f)
                curveTo(13.5f, 12.164f, 13.164f, 12.5f, 12.75f, 12.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 12.5f, 6.5f, 12.164f, 6.5f, 11.75f)
                close()
                moveTo(7.25f, 15f)
                curveTo(6.836f, 15f, 6.5f, 15.336f, 6.5f, 15.75f)
                curveTo(6.5f, 16.164f, 6.836f, 16.5f, 7.25f, 16.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 16.5f, 11f, 16.164f, 11f, 15.75f)
                curveTo(11f, 15.336f, 10.664f, 15f, 10.25f, 15f)
                horizontalLineTo(7.25f)
                close()
            }
        }.build()

        return _Receipt!!
    }

@Suppress("ObjectPropertyName")
private var _Receipt: ImageVector? = null

@Preview
@Composable
private fun ReceiptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Receipt, contentDescription = null)
    }
}
