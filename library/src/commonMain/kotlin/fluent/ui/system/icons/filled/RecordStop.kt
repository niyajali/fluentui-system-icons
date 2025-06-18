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

public val FluentUi.Filled.RecordStop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RecordStop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            close()
            moveTo(9.5f, 8f)
            horizontalLineTo(14.5f)
            curveTo(15.328f, 8f, 16f, 8.672f, 16f, 9.5f)
            verticalLineTo(14.5f)
            curveTo(16f, 15.328f, 15.328f, 16f, 14.5f, 16f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 16f, 8f, 15.328f, 8f, 14.5f)
            verticalLineTo(9.5f)
            curveTo(8f, 8.672f, 8.672f, 8f, 9.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RecordStopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RecordStop, contentDescription = null)
    }
}
