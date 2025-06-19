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

public val FluentIcons.Filled.Hd: ImageVector
    get() {
        if (_Hd != null) {
            return _Hd!!
        }
        _Hd = ImageVector.Builder(
            name = "Filled.Hd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.75f)
                curveTo(15.717f, 9.5f, 16.5f, 10.283f, 16.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(16.5f, 13.717f, 15.717f, 14.5f, 14.75f, 14.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(7.25f, 8f)
                curveTo(7.664f, 8f, 8f, 8.336f, 8f, 8.75f)
                verticalLineTo(11.5f)
                horizontalLineTo(10f)
                verticalLineTo(8.75f)
                curveTo(10f, 8.336f, 10.336f, 8f, 10.75f, 8f)
                curveTo(11.164f, 8f, 11.5f, 8.336f, 11.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(11.5f, 15.664f, 11.164f, 16f, 10.75f, 16f)
                curveTo(10.336f, 16f, 10f, 15.664f, 10f, 15.25f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15.25f)
                curveTo(8f, 15.664f, 7.664f, 16f, 7.25f, 16f)
                curveTo(6.836f, 16f, 6.5f, 15.664f, 6.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(6.5f, 8.336f, 6.836f, 8f, 7.25f, 8f)
                close()
                moveTo(13.75f, 8f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 8f, 18f, 9.455f, 18f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(18f, 14.545f, 16.545f, 16f, 14.75f, 16f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 16f, 13f, 15.664f, 13f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(13f, 8.336f, 13.336f, 8f, 13.75f, 8f)
                close()
            }
        }.build()

        return _Hd!!
    }

@Suppress("ObjectPropertyName")
private var _Hd: ImageVector? = null

@Preview
@Composable
private fun HdPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Hd, contentDescription = null)
    }
}
