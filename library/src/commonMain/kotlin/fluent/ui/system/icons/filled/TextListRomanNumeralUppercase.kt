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

public val FluentIcons.Filled.TextListRomanNumeralUppercase: ImageVector
    get() {
        if (_TextListRomanNumeralUppercase != null) {
            return _TextListRomanNumeralUppercase!!
        }
        _TextListRomanNumeralUppercase = ImageVector.Builder(
            name = "Filled.TextListRomanNumeralUppercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 2.75f)
                curveTo(6f, 2.336f, 5.664f, 2f, 5.25f, 2f)
                curveTo(4.836f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 7.664f, 4.836f, 8f, 5.25f, 8f)
                curveTo(5.664f, 8f, 6f, 7.664f, 6f, 7.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(10f, 5f)
                curveTo(9.448f, 5f, 9f, 5.448f, 9f, 6f)
                curveTo(9f, 6.552f, 9.448f, 7f, 10f, 7f)
                horizontalLineTo(19f)
                curveTo(19.552f, 7f, 20f, 6.552f, 20f, 6f)
                curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
                horizontalLineTo(10f)
                close()
                moveTo(10f, 11.5f)
                curveTo(9.448f, 11.5f, 9f, 11.948f, 9f, 12.5f)
                curveTo(9f, 13.052f, 9.448f, 13.5f, 10f, 13.5f)
                horizontalLineTo(19f)
                curveTo(19.552f, 13.5f, 20f, 13.052f, 20f, 12.5f)
                curveTo(20f, 11.948f, 19.552f, 11.5f, 19f, 11.5f)
                horizontalLineTo(10f)
                close()
                moveTo(10f, 18f)
                curveTo(9.448f, 18f, 9f, 18.448f, 9f, 19f)
                curveTo(9f, 19.552f, 9.448f, 20f, 10f, 20f)
                horizontalLineTo(19f)
                curveTo(19.552f, 20f, 20f, 19.552f, 20f, 19f)
                curveTo(20f, 18.448f, 19.552f, 18f, 19f, 18f)
                horizontalLineTo(10f)
                close()
                moveTo(5.25f, 9f)
                curveTo(5.664f, 9f, 6f, 9.336f, 6f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(6f, 14.664f, 5.664f, 15f, 5.25f, 15f)
                curveTo(4.836f, 15f, 4.5f, 14.664f, 4.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(4.5f, 9.336f, 4.836f, 9f, 5.25f, 9f)
                close()
                moveTo(6f, 16.75f)
                curveTo(6f, 16.336f, 5.664f, 16f, 5.25f, 16f)
                curveTo(4.836f, 16f, 4.5f, 16.336f, 4.5f, 16.75f)
                verticalLineTo(21.25f)
                curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
                curveTo(5.664f, 22f, 6f, 21.664f, 6f, 21.25f)
                verticalLineTo(16.75f)
                close()
            }
        }.build()

        return _TextListRomanNumeralUppercase!!
    }

@Suppress("ObjectPropertyName")
private var _TextListRomanNumeralUppercase: ImageVector? = null

@Preview
@Composable
private fun TextListRomanNumeralUppercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextListRomanNumeralUppercase, contentDescription = null)
    }
}
