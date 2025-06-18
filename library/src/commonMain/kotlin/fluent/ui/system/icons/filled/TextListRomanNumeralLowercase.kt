package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.TextListRomanNumeralLowercase: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextListRomanNumeralLowercase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 3.5f)
            curveTo(5.664f, 3.5f, 6f, 3.164f, 6f, 2.75f)
            curveTo(6f, 2.336f, 5.664f, 2f, 5.25f, 2f)
            curveTo(4.836f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
            curveTo(4.5f, 3.164f, 4.836f, 3.5f, 5.25f, 3.5f)
            close()
            moveTo(5.25f, 4f)
            curveTo(5.664f, 4f, 6f, 4.336f, 6f, 4.75f)
            verticalLineTo(7.25f)
            curveTo(6f, 7.664f, 5.664f, 8f, 5.25f, 8f)
            curveTo(4.836f, 8f, 4.5f, 7.664f, 4.5f, 7.25f)
            verticalLineTo(4.75f)
            curveTo(4.5f, 4.336f, 4.836f, 4f, 5.25f, 4f)
            close()
            moveTo(9f, 6f)
            curveTo(9f, 5.448f, 9.448f, 5f, 10f, 5f)
            horizontalLineTo(19f)
            curveTo(19.552f, 5f, 20f, 5.448f, 20f, 6f)
            curveTo(20f, 6.552f, 19.552f, 7f, 19f, 7f)
            horizontalLineTo(10f)
            curveTo(9.448f, 7f, 9f, 6.552f, 9f, 6f)
            close()
            moveTo(9f, 12.5f)
            curveTo(9f, 11.948f, 9.448f, 11.5f, 10f, 11.5f)
            horizontalLineTo(19f)
            curveTo(19.552f, 11.5f, 20f, 11.948f, 20f, 12.5f)
            curveTo(20f, 13.052f, 19.552f, 13.5f, 19f, 13.5f)
            horizontalLineTo(10f)
            curveTo(9.448f, 13.5f, 9f, 13.052f, 9f, 12.5f)
            close()
            moveTo(9f, 19f)
            curveTo(9f, 18.448f, 9.448f, 18f, 10f, 18f)
            horizontalLineTo(19f)
            curveTo(19.552f, 18f, 20f, 18.448f, 20f, 19f)
            curveTo(20f, 19.552f, 19.552f, 20f, 19f, 20f)
            horizontalLineTo(10f)
            curveTo(9.448f, 20f, 9f, 19.552f, 9f, 19f)
            close()
            moveTo(5.25f, 18f)
            curveTo(5.664f, 18f, 6f, 18.336f, 6f, 18.75f)
            verticalLineTo(21.25f)
            curveTo(6f, 21.664f, 5.664f, 22f, 5.25f, 22f)
            curveTo(4.836f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 18.336f, 4.836f, 18f, 5.25f, 18f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.336f, 5.664f, 11f, 5.25f, 11f)
            curveTo(4.836f, 11f, 4.5f, 11.336f, 4.5f, 11.75f)
            verticalLineTo(14.25f)
            curveTo(4.5f, 14.664f, 4.836f, 15f, 5.25f, 15f)
            curveTo(5.664f, 15f, 6f, 14.664f, 6f, 14.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(5.25f, 17.5f)
            curveTo(5.664f, 17.5f, 6f, 17.164f, 6f, 16.75f)
            curveTo(6f, 16.336f, 5.664f, 16f, 5.25f, 16f)
            curveTo(4.836f, 16f, 4.5f, 16.336f, 4.5f, 16.75f)
            curveTo(4.5f, 17.164f, 4.836f, 17.5f, 5.25f, 17.5f)
            close()
            moveTo(6f, 9.75f)
            curveTo(6f, 10.164f, 5.664f, 10.5f, 5.25f, 10.5f)
            curveTo(4.836f, 10.5f, 4.5f, 10.164f, 4.5f, 9.75f)
            curveTo(4.5f, 9.336f, 4.836f, 9f, 5.25f, 9f)
            curveTo(5.664f, 9f, 6f, 9.336f, 6f, 9.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextListRomanNumeralLowercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextListRomanNumeralLowercase, contentDescription = null)
    }
}
