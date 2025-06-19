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

public val FluentIcons.Filled.TextDensity: ImageVector
    get() {
        if (_TextDensity != null) {
            return _TextDensity!!
        }
        _TextDensity = ImageVector.Builder(
            name = "Filled.TextDensity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.25f, 2f)
                curveTo(12.664f, 2f, 13f, 2.336f, 13f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(13f, 21.664f, 12.664f, 22f, 12.25f, 22f)
                curveTo(11.836f, 22f, 11.5f, 21.664f, 11.5f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(11.5f, 2.336f, 11.836f, 2f, 12.25f, 2f)
                close()
                moveTo(10f, 5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
                curveTo(2f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                close()
                moveTo(10f, 9f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 9f, 2f, 9.336f, 2f, 9.75f)
                curveTo(2f, 10.164f, 2.336f, 10.5f, 2.75f, 10.5f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
                moveTo(10f, 13f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13f, 2f, 13.336f, 2f, 13.75f)
                curveTo(2f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                close()
                moveTo(10f, 17f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 17f, 2f, 17.336f, 2f, 17.75f)
                curveTo(2f, 18.164f, 2.336f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                close()
                moveTo(19.75f, 18f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 13.5f, 22f, 14.507f, 22f, 15.75f)
                curveTo(22f, 16.993f, 20.993f, 18f, 19.75f, 18f)
                close()
                moveTo(19.75f, 10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 6f, 22f, 7.007f, 22f, 8.25f)
                curveTo(22f, 9.493f, 20.993f, 10.5f, 19.75f, 10.5f)
                close()
            }
        }.build()

        return _TextDensity!!
    }

@Suppress("ObjectPropertyName")
private var _TextDensity: ImageVector? = null

@Preview
@Composable
private fun TextDensityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDensity, contentDescription = null)
    }
}
