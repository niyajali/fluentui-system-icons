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

public val FluentUi.Filled.Pause: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.746f, 3f)
            curveTo(4.78f, 3f, 3.996f, 3.783f, 3.996f, 4.75f)
            verticalLineTo(19.25f)
            curveTo(3.996f, 20.216f, 4.78f, 21f, 5.746f, 21f)
            horizontalLineTo(9.246f)
            curveTo(10.213f, 21f, 10.996f, 20.216f, 10.996f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(10.996f, 3.783f, 10.213f, 3f, 9.246f, 3f)
            horizontalLineTo(5.746f)
            close()
            moveTo(14.746f, 3f)
            curveTo(13.78f, 3f, 12.996f, 3.783f, 12.996f, 4.75f)
            verticalLineTo(19.25f)
            curveTo(12.996f, 20.216f, 13.78f, 21f, 14.746f, 21f)
            horizontalLineTo(18.246f)
            curveTo(19.213f, 21f, 19.996f, 20.216f, 19.996f, 19.25f)
            verticalLineTo(4.75f)
            curveTo(19.996f, 3.783f, 19.213f, 3f, 18.246f, 3f)
            horizontalLineTo(14.746f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PausePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Pause, contentDescription = null)
    }
}
