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

public val FluentUi.Filled.SlideTextTitle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTextTitle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(7.5f, 8f)
            horizontalLineTo(16.5f)
            curveTo(17.328f, 8f, 18f, 8.672f, 18f, 9.5f)
            curveTo(18f, 10.328f, 17.328f, 11f, 16.5f, 11f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 11f, 6f, 10.328f, 6f, 9.5f)
            curveTo(6f, 8.672f, 6.672f, 8f, 7.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextTitlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideTextTitle, contentDescription = null)
    }
}
