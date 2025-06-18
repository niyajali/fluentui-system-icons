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

public val FluentUi.Regular.RectanglePortrait: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectanglePortrait",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.25f, 22f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
            horizontalLineTo(7.25f)
            close()
            moveTo(5.5f, 18.75f)
            curveTo(5.5f, 19.716f, 6.284f, 20.5f, 7.25f, 20.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 20.5f, 18.5f, 19.716f, 18.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(18.5f, 4.284f, 17.716f, 3.5f, 16.75f, 3.5f)
            horizontalLineTo(7.25f)
            curveTo(6.284f, 3.5f, 5.5f, 4.284f, 5.5f, 5.25f)
            verticalLineTo(18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RectanglePortraitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RectanglePortrait, contentDescription = null)
    }
}
