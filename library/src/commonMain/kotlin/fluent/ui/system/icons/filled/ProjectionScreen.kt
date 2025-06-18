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

public val FluentUi.Filled.ProjectionScreen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProjectionScreen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            curveTo(2f, 5.153f, 2.417f, 5.709f, 3f, 5.915f)
            verticalLineTo(13.25f)
            curveTo(3f, 15.321f, 4.679f, 17f, 6.75f, 17f)
            horizontalLineTo(11.25f)
            verticalLineTo(19.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 19.5f, 7f, 19.836f, 7f, 20.25f)
            curveTo(7f, 20.664f, 7.336f, 21f, 7.75f, 21f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
            curveTo(17f, 19.836f, 16.664f, 19.5f, 16.25f, 19.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(17f)
            horizontalLineTo(17.25f)
            curveTo(19.321f, 17f, 21f, 15.321f, 21f, 13.25f)
            verticalLineTo(5.915f)
            curveTo(21.583f, 5.709f, 22f, 5.153f, 22f, 4.5f)
            curveTo(22f, 3.672f, 21.328f, 3f, 20.5f, 3f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProjectionScreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ProjectionScreen, contentDescription = null)
    }
}
