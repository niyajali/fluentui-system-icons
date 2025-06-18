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

public val FluentUi.Filled.BookLetter: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookLetter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 8.743f)
            lineTo(13.62f, 11.5f)
            horizontalLineTo(11.38f)
            lineTo(12.5f, 8.743f)
            close()
            moveTo(4f, 4.5f)
            verticalLineTo(19.5f)
            curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
            curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
            close()
            moveTo(12.5f, 6f)
            curveTo(12.805f, 6f, 13.08f, 6.185f, 13.195f, 6.468f)
            lineTo(16.445f, 14.468f)
            curveTo(16.601f, 14.851f, 16.416f, 15.289f, 16.032f, 15.445f)
            curveTo(15.649f, 15.601f, 15.211f, 15.416f, 15.055f, 15.032f)
            lineTo(14.23f, 13f)
            horizontalLineTo(10.771f)
            lineTo(9.945f, 15.032f)
            curveTo(9.789f, 15.416f, 9.351f, 15.601f, 8.968f, 15.445f)
            curveTo(8.584f, 15.289f, 8.399f, 14.851f, 8.555f, 14.468f)
            lineTo(11.805f, 6.468f)
            curveTo(11.92f, 6.185f, 12.195f, 6f, 12.5f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookLetterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookLetter, contentDescription = null)
    }
}
