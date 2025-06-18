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

public val FluentUi.Regular.Pause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(4f, 19.993f, 5.007f, 21f, 6.25f, 21f)
            horizontalLineTo(8.75f)
            curveTo(9.993f, 21f, 11f, 19.993f, 11f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(11f, 4.007f, 9.993f, 3f, 8.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5.5f, 5.25f)
            curveTo(5.5f, 4.836f, 5.836f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(8.75f)
            curveTo(9.164f, 4.5f, 9.5f, 4.836f, 9.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(9.5f, 19.164f, 9.164f, 19.5f, 8.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 19.5f, 5.5f, 19.164f, 5.5f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(15.25f, 3f)
            curveTo(14.007f, 3f, 13f, 4.007f, 13f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(13f, 19.993f, 14.007f, 21f, 15.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 21f, 20f, 19.993f, 20f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(20f, 4.007f, 18.993f, 3f, 17.75f, 3f)
            horizontalLineTo(15.25f)
            close()
            moveTo(14.5f, 5.25f)
            curveTo(14.5f, 4.836f, 14.836f, 4.5f, 15.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 4.5f, 18.5f, 4.836f, 18.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(18.5f, 19.164f, 18.164f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(15.25f)
            curveTo(14.836f, 19.5f, 14.5f, 19.164f, 14.5f, 18.75f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Pause, contentDescription = null)
    }
}
