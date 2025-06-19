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

public val FluentIcons.Regular.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Regular.Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.25f, 2f)
                curveTo(8.007f, 2f, 7f, 3.007f, 7f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7f, 20.993f, 8.007f, 22f, 9.25f, 22f)
                horizontalLineTo(14.75f)
                curveTo(15.993f, 22f, 17f, 20.993f, 17f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(17f, 3.007f, 15.993f, 2f, 14.75f, 2f)
                horizontalLineTo(9.25f)
                close()
                moveTo(8.5f, 19f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 19f, 11f, 18.664f, 11f, 18.25f)
                curveTo(11f, 17.836f, 10.664f, 17.5f, 10.25f, 17.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(16f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 16f, 13f, 15.664f, 13f, 15.25f)
                curveTo(13f, 14.836f, 12.664f, 14.5f, 12.25f, 14.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 12.75f, 11f, 12.414f, 11f, 12f)
                curveTo(11f, 11.586f, 10.664f, 11.25f, 10.25f, 11.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 9.5f, 13f, 9.164f, 13f, 8.75f)
                curveTo(13f, 8.336f, 12.664f, 8f, 12.25f, 8f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 6.5f, 11f, 6.164f, 11f, 5.75f)
                curveTo(11f, 5.336f, 10.664f, 5f, 10.25f, 5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.25f)
                curveTo(8.5f, 3.836f, 8.836f, 3.5f, 9.25f, 3.5f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 3.5f, 15.5f, 3.836f, 15.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(15.5f, 20.164f, 15.164f, 20.5f, 14.75f, 20.5f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 20.5f, 8.5f, 20.164f, 8.5f, 19.75f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null

@Preview
@Composable
private fun RulerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Ruler, contentDescription = null)
    }
}
