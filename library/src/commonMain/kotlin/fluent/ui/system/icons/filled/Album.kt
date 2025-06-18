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

public val FluentUi.Filled.Album: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Album",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6f)
            curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
            horizontalLineTo(5f)
            lineTo(5f, 20f)
            horizontalLineTo(4f)
            curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
            verticalLineTo(6f)
            close()
            moveTo(16f, 8.5f)
            horizontalLineTo(12f)
            curveTo(11.724f, 8.5f, 11.5f, 8.724f, 11.5f, 9f)
            verticalLineTo(10f)
            curveTo(11.5f, 10.276f, 11.724f, 10.5f, 12f, 10.5f)
            horizontalLineTo(16f)
            curveTo(16.276f, 10.5f, 16.5f, 10.276f, 16.5f, 10f)
            verticalLineTo(9f)
            curveTo(16.5f, 8.724f, 16.276f, 8.5f, 16f, 8.5f)
            close()
            moveTo(6.5f, 20f)
            horizontalLineTo(20f)
            curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
            verticalLineTo(6f)
            curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
            horizontalLineTo(6.5f)
            lineTo(6.5f, 20f)
            close()
            moveTo(12f, 7f)
            horizontalLineTo(16f)
            curveTo(17.105f, 7f, 18f, 7.895f, 18f, 9f)
            verticalLineTo(10f)
            curveTo(18f, 11.105f, 17.105f, 12f, 16f, 12f)
            horizontalLineTo(12f)
            curveTo(10.895f, 12f, 10f, 11.105f, 10f, 10f)
            verticalLineTo(9f)
            curveTo(10f, 7.895f, 10.895f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlbumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Album, contentDescription = null)
    }
}
