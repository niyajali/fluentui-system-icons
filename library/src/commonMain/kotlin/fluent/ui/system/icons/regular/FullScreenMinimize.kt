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

public val FluentUi.Regular.FullScreenMinimize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FullScreenMinimize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 3.75f)
            curveTo(8.5f, 3.336f, 8.164f, 3f, 7.75f, 3f)
            curveTo(7.336f, 3f, 7f, 3.336f, 7f, 3.75f)
            verticalLineTo(6.25f)
            curveTo(7f, 6.664f, 6.664f, 7f, 6.25f, 7f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 7f, 3f, 7.336f, 3f, 7.75f)
            curveTo(3f, 8.164f, 3.336f, 8.5f, 3.75f, 8.5f)
            horizontalLineTo(6.25f)
            curveTo(7.493f, 8.5f, 8.5f, 7.493f, 8.5f, 6.25f)
            verticalLineTo(3.75f)
            close()
            moveTo(8.5f, 20.25f)
            curveTo(8.5f, 20.664f, 8.164f, 21f, 7.75f, 21f)
            curveTo(7.336f, 21f, 7f, 20.664f, 7f, 20.25f)
            verticalLineTo(17.75f)
            curveTo(7f, 17.336f, 6.664f, 17f, 6.25f, 17f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 17f, 3f, 16.664f, 3f, 16.25f)
            curveTo(3f, 15.836f, 3.336f, 15.5f, 3.75f, 15.5f)
            horizontalLineTo(6.25f)
            curveTo(7.493f, 15.5f, 8.5f, 16.507f, 8.5f, 17.75f)
            verticalLineTo(20.25f)
            close()
            moveTo(16.25f, 3f)
            curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
            verticalLineTo(6.25f)
            curveTo(15.5f, 7.493f, 16.507f, 8.5f, 17.75f, 8.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
            curveTo(21f, 7.336f, 20.664f, 7f, 20.25f, 7f)
            horizontalLineTo(17.75f)
            curveTo(17.336f, 7f, 17f, 6.664f, 17f, 6.25f)
            verticalLineTo(3.75f)
            curveTo(17f, 3.336f, 16.664f, 3f, 16.25f, 3f)
            close()
            moveTo(15.5f, 20.25f)
            curveTo(15.5f, 20.664f, 15.836f, 21f, 16.25f, 21f)
            curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
            verticalLineTo(17.75f)
            curveTo(17f, 17.336f, 17.336f, 17f, 17.75f, 17f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 17f, 21f, 16.664f, 21f, 16.25f)
            curveTo(21f, 15.836f, 20.664f, 15.5f, 20.25f, 15.5f)
            horizontalLineTo(17.75f)
            curveTo(16.507f, 15.5f, 15.5f, 16.507f, 15.5f, 17.75f)
            verticalLineTo(20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FullScreenMinimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FullScreenMinimize, contentDescription = null)
    }
}
