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

public val FluentUi.Filled.TextPositionLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPositionLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 3.75f)
            curveTo(3.198f, 3.75f, 2.75f, 4.198f, 2.75f, 4.75f)
            curveTo(2.75f, 5.302f, 3.198f, 5.75f, 3.75f, 5.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 5.75f, 21.25f, 5.302f, 21.25f, 4.75f)
            curveTo(21.25f, 4.198f, 20.802f, 3.75f, 20.25f, 3.75f)
            horizontalLineTo(3.75f)
            close()
            moveTo(7f, 8.75f)
            curveTo(5.757f, 8.75f, 4.75f, 9.757f, 4.75f, 11f)
            verticalLineTo(15.75f)
            curveTo(4.75f, 16.302f, 4.302f, 16.75f, 3.75f, 16.75f)
            curveTo(3.198f, 16.75f, 2.75f, 16.302f, 2.75f, 15.75f)
            verticalLineTo(11f)
            curveTo(2.75f, 8.653f, 4.653f, 6.75f, 7f, 6.75f)
            curveTo(9.347f, 6.75f, 11.25f, 8.653f, 11.25f, 11f)
            verticalLineTo(15.75f)
            curveTo(11.25f, 16.302f, 10.802f, 16.75f, 10.25f, 16.75f)
            curveTo(9.698f, 16.75f, 9.25f, 16.302f, 9.25f, 15.75f)
            verticalLineTo(11f)
            curveTo(9.25f, 9.757f, 8.243f, 8.75f, 7f, 8.75f)
            close()
            moveTo(13.75f, 14.25f)
            curveTo(13.198f, 14.25f, 12.75f, 14.698f, 12.75f, 15.25f)
            curveTo(12.75f, 15.802f, 13.198f, 16.25f, 13.75f, 16.25f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 16.25f, 21.25f, 15.802f, 21.25f, 15.25f)
            curveTo(21.25f, 14.698f, 20.802f, 14.25f, 20.25f, 14.25f)
            horizontalLineTo(13.75f)
            close()
            moveTo(3.75f, 17.75f)
            curveTo(3.198f, 17.75f, 2.75f, 18.198f, 2.75f, 18.75f)
            curveTo(2.75f, 19.302f, 3.198f, 19.75f, 3.75f, 19.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 19.75f, 21.25f, 19.302f, 21.25f, 18.75f)
            curveTo(21.25f, 18.198f, 20.802f, 17.75f, 20.25f, 17.75f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextPositionLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextPositionLine, contentDescription = null)
    }
}
