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

public val FluentUi.Filled.Group: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Group",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5f, 7f)
            curveTo(6.105f, 7f, 7f, 6.105f, 7f, 5f)
            curveTo(7f, 3.895f, 6.105f, 3f, 5f, 3f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            curveTo(3f, 6.105f, 3.895f, 7f, 5f, 7f)
            close()
            moveTo(19f, 7f)
            curveTo(20.105f, 7f, 21f, 6.105f, 21f, 5f)
            curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
            curveTo(17.895f, 3f, 17f, 3.895f, 17f, 5f)
            curveTo(17f, 6.105f, 17.895f, 7f, 19f, 7f)
            close()
            moveTo(21f, 19f)
            curveTo(21f, 20.105f, 20.105f, 21f, 19f, 21f)
            curveTo(17.895f, 21f, 17f, 20.105f, 17f, 19f)
            curveTo(17f, 17.895f, 17.895f, 17f, 19f, 17f)
            curveTo(20.105f, 17f, 21f, 17.895f, 21f, 19f)
            close()
            moveTo(5f, 21f)
            curveTo(6.105f, 21f, 7f, 20.105f, 7f, 19f)
            curveTo(7f, 17.895f, 6.105f, 17f, 5f, 17f)
            curveTo(3.895f, 17f, 3f, 17.895f, 3f, 19f)
            curveTo(3f, 20.105f, 3.895f, 21f, 5f, 21f)
            close()
            moveTo(7.829f, 6f)
            curveTo(7.94f, 5.687f, 8f, 5.351f, 8f, 5f)
            curveTo(8f, 4.649f, 7.94f, 4.313f, 7.829f, 4f)
            horizontalLineTo(12.5f)
            curveTo(13.881f, 4f, 15f, 5.119f, 15f, 6.5f)
            verticalLineTo(9f)
            horizontalLineTo(17.5f)
            curveTo(18.881f, 9f, 20f, 10.119f, 20f, 11.5f)
            verticalLineTo(16.171f)
            curveTo(19.687f, 16.06f, 19.351f, 16f, 19f, 16f)
            curveTo(18.649f, 16f, 18.313f, 16.06f, 18f, 16.171f)
            verticalLineTo(11.5f)
            curveTo(18f, 11.224f, 17.776f, 11f, 17.5f, 11f)
            horizontalLineTo(15f)
            verticalLineTo(12.5f)
            curveTo(15f, 13.881f, 13.881f, 15f, 12.5f, 15f)
            horizontalLineTo(11f)
            verticalLineTo(17.5f)
            curveTo(11f, 17.776f, 11.224f, 18f, 11.5f, 18f)
            horizontalLineTo(16.171f)
            curveTo(16.06f, 18.313f, 16f, 18.649f, 16f, 19f)
            curveTo(16f, 19.351f, 16.06f, 19.687f, 16.171f, 20f)
            horizontalLineTo(11.5f)
            curveTo(10.119f, 20f, 9f, 18.881f, 9f, 17.5f)
            verticalLineTo(15f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 15f, 4f, 13.881f, 4f, 12.5f)
            verticalLineTo(7.829f)
            curveTo(4.313f, 7.94f, 4.649f, 8f, 5f, 8f)
            curveTo(5.351f, 8f, 5.687f, 7.94f, 6f, 7.829f)
            verticalLineTo(12.5f)
            curveTo(6f, 12.776f, 6.224f, 13f, 6.5f, 13f)
            horizontalLineTo(9f)
            verticalLineTo(11.5f)
            curveTo(9f, 10.119f, 10.119f, 9f, 11.5f, 9f)
            horizontalLineTo(13f)
            verticalLineTo(6.5f)
            curveTo(13f, 6.224f, 12.776f, 6f, 12.5f, 6f)
            horizontalLineTo(7.829f)
            close()
            moveTo(13f, 12.5f)
            verticalLineTo(11f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 11f, 11f, 11.224f, 11f, 11.5f)
            verticalLineTo(13f)
            horizontalLineTo(12.5f)
            curveTo(12.776f, 13f, 13f, 12.776f, 13f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GroupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Group, contentDescription = null)
    }
}
