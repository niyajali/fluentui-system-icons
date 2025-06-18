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

public val FluentUi.Filled.TextPositionFront: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPositionFront",
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
            moveTo(12f, 8.75f)
            curveTo(11.22f, 8.75f, 10.533f, 9.147f, 10.129f, 9.75f)
            horizontalLineTo(7.937f)
            curveTo(8.471f, 8.013f, 10.088f, 6.75f, 12f, 6.75f)
            curveTo(13.912f, 6.75f, 15.529f, 8.013f, 16.063f, 9.75f)
            horizontalLineTo(13.871f)
            curveTo(13.467f, 9.147f, 12.78f, 8.75f, 12f, 8.75f)
            close()
            moveTo(3.75f, 10.75f)
            curveTo(3.198f, 10.75f, 2.75f, 11.198f, 2.75f, 11.75f)
            curveTo(2.75f, 12.302f, 3.198f, 12.75f, 3.75f, 12.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 12.75f, 21.25f, 12.302f, 21.25f, 11.75f)
            curveTo(21.25f, 11.198f, 20.802f, 10.75f, 20.25f, 10.75f)
            horizontalLineTo(3.75f)
            close()
            moveTo(7.75f, 13.75f)
            horizontalLineTo(9.75f)
            verticalLineTo(15.75f)
            curveTo(9.75f, 16.302f, 9.302f, 16.75f, 8.75f, 16.75f)
            curveTo(8.198f, 16.75f, 7.75f, 16.302f, 7.75f, 15.75f)
            verticalLineTo(13.75f)
            close()
            moveTo(16.25f, 13.75f)
            horizontalLineTo(14.25f)
            verticalLineTo(15.75f)
            curveTo(14.25f, 16.302f, 14.698f, 16.75f, 15.25f, 16.75f)
            curveTo(15.802f, 16.75f, 16.25f, 16.302f, 16.25f, 15.75f)
            verticalLineTo(13.75f)
            close()
            moveTo(2.75f, 18.75f)
            curveTo(2.75f, 18.198f, 3.198f, 17.75f, 3.75f, 17.75f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 17.75f, 21.25f, 18.198f, 21.25f, 18.75f)
            curveTo(21.25f, 19.302f, 20.802f, 19.75f, 20.25f, 19.75f)
            horizontalLineTo(3.75f)
            curveTo(3.198f, 19.75f, 2.75f, 19.302f, 2.75f, 18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextPositionFrontPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextPositionFront, contentDescription = null)
    }
}
