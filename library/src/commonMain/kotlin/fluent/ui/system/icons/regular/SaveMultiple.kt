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

public val FluentIcons.Regular.SaveMultiple: ImageVector
    get() {
        if (_SaveMultiple != null) {
            return _SaveMultiple!!
        }
        _SaveMultiple = ImageVector.Builder(
            name = "Regular.SaveMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 18f)
                curveTo(4.231f, 18f, 3f, 16.769f, 3f, 15.25f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(12.715f)
                curveTo(13.576f, 3f, 14.403f, 3.342f, 15.013f, 3.952f)
                lineTo(17.048f, 5.987f)
                curveTo(17.658f, 6.597f, 18f, 7.424f, 18f, 8.286f)
                verticalLineTo(15.25f)
                curveTo(18f, 16.769f, 16.769f, 18f, 15.25f, 18f)
                horizontalLineTo(5.75f)
                close()
                moveTo(4.5f, 5.75f)
                verticalLineTo(15.25f)
                curveTo(4.5f, 15.94f, 5.06f, 16.5f, 5.75f, 16.5f)
                horizontalLineTo(6f)
                verticalLineTo(13.25f)
                curveTo(6f, 12.007f, 7.007f, 11f, 8.25f, 11f)
                horizontalLineTo(12.75f)
                curveTo(13.993f, 11f, 15f, 12.007f, 15f, 13.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(15.25f)
                curveTo(15.94f, 16.5f, 16.5f, 15.94f, 16.5f, 15.25f)
                verticalLineTo(8.286f)
                curveTo(16.5f, 7.821f, 16.316f, 7.376f, 15.987f, 7.048f)
                lineTo(14f, 5.061f)
                verticalLineTo(6.25f)
                curveTo(14f, 7.493f, 12.993f, 8.5f, 11.75f, 8.5f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 8.5f, 7f, 7.493f, 7f, 6.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                close()
                moveTo(13.5f, 16.5f)
                verticalLineTo(13.25f)
                curveTo(13.5f, 12.836f, 13.164f, 12.5f, 12.75f, 12.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 12.5f, 7.5f, 12.836f, 7.5f, 13.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(8.5f, 6.25f)
                curveTo(8.5f, 6.664f, 8.836f, 7f, 9.25f, 7f)
                horizontalLineTo(11.75f)
                curveTo(12.164f, 7f, 12.5f, 6.664f, 12.5f, 6.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(10.75f, 21f)
                curveTo(9.384f, 21f, 8.152f, 20.423f, 7.286f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(18.045f, 19.5f, 19.5f, 18.045f, 19.5f, 16.25f)
                verticalLineTo(8.439f)
                lineTo(20.048f, 8.988f)
                curveTo(20.657f, 9.597f, 21f, 10.424f, 21f, 11.286f)
                verticalLineTo(16.25f)
                curveTo(21f, 18.874f, 18.873f, 21f, 16.25f, 21f)
                horizontalLineTo(10.75f)
                close()
            }
        }.build()

        return _SaveMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SaveMultiple: ImageVector? = null

@Preview
@Composable
private fun SaveMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SaveMultiple, contentDescription = null)
    }
}
