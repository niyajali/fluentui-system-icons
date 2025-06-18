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

public val FluentUi.Regular.TabDesktop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(11f, 4.5f)
            verticalLineTo(5.75f)
            curveTo(11f, 6.993f, 12.007f, 8f, 13.25f, 8f)
            horizontalLineTo(19.5f)
            verticalLineTo(18.25f)
            curveTo(19.5f, 18.94f, 18.94f, 19.5f, 18.25f, 19.5f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 19.5f, 4.5f, 18.94f, 4.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
            horizontalLineTo(11f)
            close()
            moveTo(19.5f, 6.5f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 6.5f, 12.5f, 6.164f, 12.5f, 5.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TabDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.TabDesktop, contentDescription = null)
    }
}
