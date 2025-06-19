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

public val FluentIcons.Regular.AlignTop: ImageVector
    get() {
        if (_AlignTop != null) {
            return _AlignTop!!
        }
        _AlignTop = ImageVector.Builder(
            name = "Regular.AlignTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 3f)
                curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
                curveTo(2f, 4.164f, 2.336f, 4.5f, 2.75f, 4.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 4.5f, 22f, 4.164f, 22f, 3.75f)
                curveTo(22f, 3.336f, 21.664f, 3f, 21.25f, 3f)
                lineTo(2.75f, 3f)
                close()
                moveTo(4f, 8.25f)
                curveTo(4f, 7.007f, 5.007f, 6f, 6.25f, 6f)
                horizontalLineTo(8.75f)
                curveTo(9.993f, 6f, 11f, 7.007f, 11f, 8.25f)
                lineTo(11f, 18.75f)
                curveTo(11f, 19.993f, 9.993f, 21f, 8.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 21f, 4f, 19.993f, 4f, 18.75f)
                lineTo(4f, 8.25f)
                close()
                moveTo(6.25f, 7.5f)
                curveTo(5.836f, 7.5f, 5.5f, 7.836f, 5.5f, 8.25f)
                lineTo(5.5f, 18.75f)
                curveTo(5.5f, 19.164f, 5.836f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(9.164f, 19.5f, 9.5f, 19.164f, 9.5f, 18.75f)
                lineTo(9.5f, 8.25f)
                curveTo(9.5f, 7.836f, 9.164f, 7.5f, 8.75f, 7.5f)
                lineTo(6.25f, 7.5f)
                close()
                moveTo(13f, 8.25f)
                curveTo(13f, 7.007f, 14.007f, 6f, 15.25f, 6f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 6f, 20f, 7.007f, 20f, 8.25f)
                verticalLineTo(15.25f)
                curveTo(20f, 16.493f, 18.993f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(14.007f, 17.5f, 13f, 16.493f, 13f, 15.25f)
                lineTo(13f, 8.25f)
                close()
                moveTo(15.25f, 7.5f)
                curveTo(14.836f, 7.5f, 14.5f, 7.836f, 14.5f, 8.25f)
                lineTo(14.5f, 15.25f)
                curveTo(14.5f, 15.664f, 14.836f, 16f, 15.25f, 16f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 16f, 18.5f, 15.664f, 18.5f, 15.25f)
                verticalLineTo(8.25f)
                curveTo(18.5f, 7.836f, 18.164f, 7.5f, 17.75f, 7.5f)
                lineTo(15.25f, 7.5f)
                close()
            }
        }.build()

        return _AlignTop!!
    }

@Suppress("ObjectPropertyName")
private var _AlignTop: ImageVector? = null

@Preview
@Composable
private fun AlignTopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlignTop, contentDescription = null)
    }
}
