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

public val FluentUi.Regular.Laptop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Laptop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(13.75f)
            curveTo(4f, 14.993f, 5.007f, 16f, 6.25f, 16f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 16f, 20f, 14.993f, 20f, 13.75f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5.5f, 6.25f)
            curveTo(5.5f, 5.836f, 5.836f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 5.5f, 18.5f, 5.836f, 18.5f, 6.25f)
            verticalLineTo(13.75f)
            curveTo(18.5f, 14.164f, 18.164f, 14.5f, 17.75f, 14.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 14.5f, 5.5f, 14.164f, 5.5f, 13.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(2.75f, 17.5f)
            curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
            curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
            curveTo(22f, 17.836f, 21.664f, 17.5f, 21.25f, 17.5f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LaptopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Laptop, contentDescription = null)
    }
}
