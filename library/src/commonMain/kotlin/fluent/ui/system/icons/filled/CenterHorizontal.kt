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

public val FluentUi.Filled.CenterHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CenterHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 3f)
            curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            close()
            moveTo(20.25f, 3f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            verticalLineTo(20.25f)
            curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
            curveTo(19.836f, 21f, 19.5f, 20.664f, 19.5f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(19.5f, 3.336f, 19.836f, 3f, 20.25f, 3f)
            close()
            moveTo(10.25f, 5f)
            curveTo(9.007f, 5f, 8f, 6.007f, 8f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(8f, 17.993f, 9.007f, 19f, 10.25f, 19f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 19f, 16f, 17.993f, 16f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(16f, 6.007f, 14.993f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CenterHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CenterHorizontal, contentDescription = null)
    }
}
