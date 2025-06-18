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

public val FluentUi.Filled.Frame: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Frame",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            curveTo(5.664f, 2f, 6f, 2.336f, 6f, 2.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(18f)
            verticalLineTo(2.75f)
            curveTo(18f, 2.336f, 18.336f, 2f, 18.75f, 2f)
            curveTo(19.164f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 4.5f, 22f, 4.836f, 22f, 5.25f)
            curveTo(22f, 5.664f, 21.664f, 6f, 21.25f, 6f)
            horizontalLineTo(19.5f)
            verticalLineTo(18f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 18f, 22f, 18.336f, 22f, 18.75f)
            curveTo(22f, 19.164f, 21.664f, 19.5f, 21.25f, 19.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(21.25f)
            curveTo(19.5f, 21.664f, 19.164f, 22f, 18.75f, 22f)
            curveTo(18.336f, 22f, 18f, 21.664f, 18f, 21.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(6f)
            verticalLineTo(21.25f)
            curveTo(6f, 21.664f, 5.664f, 22f, 5.25f, 22f)
            curveTo(4.836f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 19.5f, 2f, 19.164f, 2f, 18.75f)
            curveTo(2f, 18.336f, 2.336f, 18f, 2.75f, 18f)
            horizontalLineTo(4.5f)
            verticalLineTo(6f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6f, 2f, 5.664f, 2f, 5.25f)
            curveTo(2f, 4.836f, 2.336f, 4.5f, 2.75f, 4.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(2.75f)
            curveTo(4.5f, 2.336f, 4.836f, 2f, 5.25f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FramePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Frame, contentDescription = null)
    }
}
