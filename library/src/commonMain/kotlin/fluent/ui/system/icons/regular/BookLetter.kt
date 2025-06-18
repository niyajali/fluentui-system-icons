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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.BookLetter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookLetter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 6f)
            curveTo(12.195f, 6f, 11.92f, 6.185f, 11.805f, 6.468f)
            lineTo(8.555f, 14.468f)
            curveTo(8.399f, 14.851f, 8.584f, 15.289f, 8.968f, 15.445f)
            curveTo(9.351f, 15.601f, 9.789f, 15.416f, 9.945f, 15.032f)
            lineTo(10.771f, 13f)
            horizontalLineTo(14.23f)
            lineTo(15.055f, 15.032f)
            curveTo(15.211f, 15.416f, 15.649f, 15.601f, 16.032f, 15.445f)
            curveTo(16.416f, 15.289f, 16.601f, 14.851f, 16.445f, 14.468f)
            lineTo(13.195f, 6.468f)
            curveTo(13.08f, 6.185f, 12.805f, 6f, 12.5f, 6f)
            close()
            moveTo(11.38f, 11.5f)
            lineTo(12.5f, 8.743f)
            lineTo(13.62f, 11.5f)
            horizontalLineTo(11.38f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(5.5f, 18f)
            horizontalLineTo(19f)
            verticalLineTo(4.5f)
            curveTo(19f, 3.948f, 18.552f, 3.5f, 18f, 3.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 3.5f, 5.5f, 3.948f, 5.5f, 4.5f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookLetterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookLetter, contentDescription = null)
    }
}
