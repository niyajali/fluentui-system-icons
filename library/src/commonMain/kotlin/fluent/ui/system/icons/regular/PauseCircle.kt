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

public val FluentUi.Regular.PauseCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PauseCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 8.25f)
            curveTo(10.5f, 7.836f, 10.164f, 7.5f, 9.75f, 7.5f)
            curveTo(9.336f, 7.5f, 9f, 7.836f, 9f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(9f, 16.164f, 9.336f, 16.5f, 9.75f, 16.5f)
            curveTo(10.164f, 16.5f, 10.5f, 16.164f, 10.5f, 15.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(15f, 8.25f)
            curveTo(15f, 7.836f, 14.664f, 7.5f, 14.25f, 7.5f)
            curveTo(13.836f, 7.5f, 13.5f, 7.836f, 13.5f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(13.5f, 16.164f, 13.836f, 16.5f, 14.25f, 16.5f)
            curveTo(14.664f, 16.5f, 15f, 16.164f, 15f, 15.75f)
            verticalLineTo(8.25f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PauseCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PauseCircle, contentDescription = null)
    }
}
