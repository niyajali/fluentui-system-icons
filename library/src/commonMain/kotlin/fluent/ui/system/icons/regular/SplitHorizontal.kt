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

public val FluentUi.Regular.SplitHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 12.5f)
            curveTo(21.664f, 12.5f, 22f, 12.164f, 22f, 11.75f)
            curveTo(22f, 11.336f, 21.664f, 11f, 21.25f, 11f)
            lineTo(2.75f, 11f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            curveTo(2f, 12.164f, 2.336f, 12.5f, 2.75f, 12.5f)
            lineTo(21.25f, 12.5f)
            close()
            moveTo(20f, 4.25f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineTo(10f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.25f)
            curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 3.5f, 18.5f, 3.836f, 18.5f, 4.25f)
            verticalLineTo(10f)
            horizontalLineTo(20f)
            verticalLineTo(4.25f)
            close()
            moveTo(5.5f, 19.25f)
            verticalLineTo(13.5f)
            horizontalLineTo(4f)
            verticalLineTo(19.25f)
            curveTo(4f, 20.493f, 5.007f, 21.5f, 6.25f, 21.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 21.5f, 20f, 20.493f, 20f, 19.25f)
            verticalLineTo(13.5f)
            horizontalLineTo(18.5f)
            verticalLineTo(19.25f)
            curveTo(18.5f, 19.664f, 18.164f, 20f, 17.75f, 20f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20f, 5.5f, 19.664f, 5.5f, 19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SplitHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SplitHorizontal, contentDescription = null)
    }
}
