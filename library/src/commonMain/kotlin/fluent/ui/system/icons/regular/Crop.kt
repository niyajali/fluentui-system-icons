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

public val FluentIcons.Regular.Crop: ImageVector
    get() {
        if (_Crop != null) {
            return _Crop!!
        }
        _Crop = ImageVector.Builder(
            name = "Regular.Crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.25f, 17f)
                curveTo(21.664f, 17f, 22f, 17.336f, 22f, 17.75f)
                curveTo(22f, 18.13f, 21.718f, 18.444f, 21.352f, 18.493f)
                lineTo(21.25f, 18.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(21.25f)
                curveTo(18.5f, 21.664f, 18.164f, 22f, 17.75f, 22f)
                curveTo(17.37f, 22f, 17.056f, 21.718f, 17.007f, 21.352f)
                lineTo(17f, 21.25f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.75f)
                curveTo(7.017f, 18.5f, 5.601f, 17.143f, 5.505f, 15.434f)
                lineTo(5.5f, 15.25f)
                lineTo(5.499f, 7f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 7f, 2f, 6.664f, 2f, 6.25f)
                curveTo(2f, 5.87f, 2.282f, 5.557f, 2.648f, 5.507f)
                lineTo(2.75f, 5.5f)
                horizontalLineTo(5.499f)
                lineTo(5.5f, 2.75f)
                curveTo(5.5f, 2.336f, 5.836f, 2f, 6.25f, 2f)
                curveTo(6.63f, 2f, 6.943f, 2.282f, 6.993f, 2.648f)
                lineTo(7f, 2.75f)
                lineTo(6.999f, 5.5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(6.999f)
                lineTo(7f, 15.25f)
                curveTo(7f, 16.168f, 7.707f, 16.921f, 8.606f, 16.994f)
                lineTo(8.75f, 17f)
                horizontalLineTo(21.25f)
                close()
                moveTo(8f, 5.5f)
                horizontalLineTo(15.25f)
                curveTo(16.983f, 5.5f, 18.399f, 6.856f, 18.495f, 8.566f)
                lineTo(18.5f, 8.75f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(8.75f)
                curveTo(17f, 7.832f, 16.293f, 7.079f, 15.394f, 7.006f)
                lineTo(15.25f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()

        return _Crop!!
    }

@Suppress("ObjectPropertyName")
private var _Crop: ImageVector? = null

@Preview
@Composable
private fun CropPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Crop, contentDescription = null)
    }
}
